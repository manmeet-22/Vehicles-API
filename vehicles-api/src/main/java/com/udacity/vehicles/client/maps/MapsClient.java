package com.udacity.vehicles.client.maps;

import com.udacity.vehicles.domain.Location;
import java.util.Objects;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Implements a class to interface with the Maps Client for location data.
 */
@Component
public class MapsClient {

    /** The Constant log. */
    private static final Logger log = LoggerFactory.getLogger(MapsClient.class);

    /** The client. */
    private final WebClient client;
    
    /** The mapper. */
    private final ModelMapper mapper;

    /**
     * Instantiates a new maps client.
     *
     * @param maps the maps
     * @param mapper the mapper
     */
    public MapsClient(WebClient maps,
            ModelMapper mapper) {
        this.client = maps;
        this.mapper = mapper;
    }

    /**
     * Gets an address from the Maps client, given latitude and longitude.
     * @param location An object containing "lat" and "lon" of location
     * @return An updated location including street, city, state and zip,
     *   or an exception message noting the Maps service is down
     */
    public Location getAddress(Location location) {
        try {
            Address address = client
                    .get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/maps/")
                            .queryParam("lat", location.getLat())
                            .queryParam("lon", location.getLon())
                            .build()
                    )
                    .retrieve().bodyToMono(Address.class).block();

            mapper.map(Objects.requireNonNull(address), location);
            location.setAddress(address.getAddress());
            location.setCity(address.getCity());
            location.setState(address.getState());
            location.setZip(address.getZip());
           
            return location;
        } catch (Exception e) {
            log.warn("Map service is down");
            return location;
        }
    }
}
