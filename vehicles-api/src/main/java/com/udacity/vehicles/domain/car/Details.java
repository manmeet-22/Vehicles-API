package com.udacity.vehicles.domain.car;

import com.udacity.vehicles.domain.manufacturer.Manufacturer;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Declares the additional detail variables for each Car object,
 * along with related methods for access and setting.
 */
@Embeddable
public class Details {

    /** The body. */
    @NotBlank
    private String body;

    /** The model. */
    @NotBlank
    private String model;

    /** The manufacturer. */
    @NotNull
    @ManyToOne
    private Manufacturer manufacturer;

    /** The number of doors. */
    private Integer numberOfDoors;

    /** The fuel type. */
    private String fuelType;

    /** The engine. */
    private String engine;

    /** The mileage. */
    private Integer mileage;

    /** The model year. */
    private Integer modelYear;

    /** The production year. */
    private Integer productionYear;

    /** The external color. */
    private String externalColor;

    /**
     * Gets the body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the body.
     *
     * @param body the new body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model.
     *
     * @param model the new model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the new manufacturer
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the number of doors.
     *
     * @return the number of doors
     */
    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Sets the number of doors.
     *
     * @param numberOfDoors the new number of doors
     */
    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Gets the fuel type.
     *
     * @return the fuel type
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the fuel type.
     *
     * @param fuelType the new fuel type
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Gets the engine.
     *
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets the engine.
     *
     * @param engine the new engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Gets the mileage.
     *
     * @return the mileage
     */
    public Integer getMileage() {
        return mileage;
    }

    /**
     * Sets the mileage.
     *
     * @param mileage the new mileage
     */
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    /**
     * Gets the model year.
     *
     * @return the model year
     */
    public Integer getModelYear() {
        return modelYear;
    }

    /**
     * Sets the model year.
     *
     * @param modelYear the new model year
     */
    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * Gets the production year.
     *
     * @return the production year
     */
    public Integer getProductionYear() {
        return productionYear;
    }

    /**
     * Sets the production year.
     *
     * @param productionYear the new production year
     */
    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    /**
     * Gets the external color.
     *
     * @return the external color
     */
    public String getExternalColor() {
        return externalColor;
    }

    /**
     * Sets the external color.
     *
     * @param externalColor the new external color
     */
    public void setExternalColor(String externalColor) {
        this.externalColor = externalColor;
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
	return "Details [body=" + body + ", model=" + model + ", manufacturer=" + manufacturer + ", numberOfDoors="
		+ numberOfDoors + ", fuelType=" + fuelType + ", engine=" + engine + ", mileage=" + mileage
		+ ", modelYear=" + modelYear + ", productionYear=" + productionYear + ", externalColor=" + externalColor
		+ "]";
    }
    
    
}
