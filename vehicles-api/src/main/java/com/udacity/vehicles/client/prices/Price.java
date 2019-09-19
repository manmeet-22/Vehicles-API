package com.udacity.vehicles.client.prices;

import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
public class Price {

    /** The currency. */
    private String currency;
    
    /** The price. */
    private BigDecimal price;
    
    /** The vehicle id. */
    private Long vehicleId;

    /**
     * Instantiates a new price.
     *
     * @param price the price
     */
    public Price(String price) {
        String[] priceInfo = price.split(" ");
        this.currency = priceInfo[0];
        this.price = new BigDecimal(priceInfo[1]);
    }

    /**
     * Instantiates a new price.
     */
    public Price() {
    }

    /**
     * Gets the currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the currency.
     *
     * @param currency the new currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets the price.
     *
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price the new price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Gets the vehicle id.
     *
     * @return the vehicle id
     */
    public Long getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the vehicle id.
     *
     * @param vehicleId the new vehicle id
     */
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
