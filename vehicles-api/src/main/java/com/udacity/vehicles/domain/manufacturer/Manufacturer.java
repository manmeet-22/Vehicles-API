package com.udacity.vehicles.domain.manufacturer;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Declares class to hold car manufacturer information.
 */
@Entity
public class Manufacturer {

    /** The code. */
    @Id
    private Integer code;
    
    /** The name. */
    private String name;

    /**
     * Instantiates a new manufacturer.
     */
    public Manufacturer() { }

    /**
     * Instantiates a new manufacturer.
     *
     * @param code the code
     * @param name the name
     */
    public Manufacturer(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
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
	return "Manufacturer [code=" + code + ", name=" + name + "]";
    }
    
}
