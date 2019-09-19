package com.udacity.boogle.maps;

/**
 * Declares a class to store an address, city, state and zip code.
 * @author Manmeet Singh
 */
public class Address {

    /** The address. */
    private String address;
    
    /** The city. */
    private String city;
    
    /** The state. */
    private String state;
    
    /** The zip. */
    private String zip;

    /**
     * Instantiates a new address.
     */
    public Address() {
    }

    /**
     * Instantiates a new address.
     *
     * @param address the address
     * @param city the city
     * @param state the state
     * @param zip the zip
     */
    public Address(String address, String city, String state, String zip) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
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
}
