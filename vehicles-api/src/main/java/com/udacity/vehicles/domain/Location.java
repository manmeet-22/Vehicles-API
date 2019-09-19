package com.udacity.vehicles.domain;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 * Stores information about a given location.
 * Latitude and longitude must be provided, while other
 * location information must be gathered each time from
 * the maps API.
 */
@Embeddable
public class Location {

    /** The lat. */
    @NotNull
    private Double lat;

    /** The lon. */
    @NotNull
    private Double lon;

    /** The address. */
    @Transient
    private String address;

    /** The city. */
    @Transient
    private String city;

    /** The state. */
    @Transient
    private String state;

    /** The zip. */
    @Transient
    private String zip;

    /**
     * Instantiates a new location.
     */
    public Location() {
    }

    /**
     * Instantiates a new location.
     *
     * @param lat the lat
     * @param lon the lon
     */
    public Location(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    /**
     * Gets the lat.
     *
     * @return the lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Gets the lon.
     *
     * @return the lon
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state the new state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the zip.
     *
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the zip.
     *
     * @param zip the new zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * To string.
     *
     * @return the string
     */
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Location [lat=" + lat + ", lon=" + lon + ", address=" + address + ", city=" + city + ", state=" + state
		+ ", zip=" + zip + "]";
    }
    
    
}
