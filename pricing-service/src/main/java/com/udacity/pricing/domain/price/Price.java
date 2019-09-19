package com.udacity.pricing.domain.price;

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
     */
    public Price() {
    }

    /**
     * Instantiates a new price.
     *
     * @param currency the currency
     * @param price the price
     * @param vehicleId the vehicle id
     */
    public Price(String currency, BigDecimal price, Long vehicleId) {
        this.currency = currency;
        this.price = price;
        this.vehicleId = vehicleId;
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
