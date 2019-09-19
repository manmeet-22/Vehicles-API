package com.udacity.vehicles.domain.car;

import com.udacity.vehicles.domain.Condition;
import com.udacity.vehicles.domain.Location;
import java.time.LocalDateTime;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Declares the Car class, related variables and methods.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Car {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;

    /** The created at. */
    @CreatedDate
    private LocalDateTime createdAt;

    /** The modified at. */
    @LastModifiedDate
    private LocalDateTime modifiedAt;

    /** The condition. */
    @NotNull
    @Enumerated(EnumType.STRING)
    private Condition condition;

    /** The details. */
    @Valid
    @Embedded
    private Details details = new Details();

    /** The location. */
    @Valid
    @Embedded
    private Location location = new Location(0d, 0d);

    /** The price. */
    @Transient
    private String price;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the created at.
     *
     * @return the created at
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the created at.
     *
     * @param createdAt the new created at
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the modified at.
     *
     * @return the modified at
     */
    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    /**
     * Sets the modified at.
     *
     * @param modifiedAt the new modified at
     */
    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * Gets the condition.
     *
     * @return the condition
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Sets the condition.
     *
     * @param condition the new condition
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * Gets the details.
     *
     * @return the details
     */
    public Details getDetails() {
        return details;
    }

    /**
     * Sets the details.
     *
     * @param details the new details
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     * Gets the location.
     *
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the location.
     *
     * @param location the new location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Gets the price.
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price the new price
     */
    public void setPrice(String price) {
        this.price = price;
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
	return "Car [id=" + id + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", condition=" + condition
		+ ", details=" + details + ", location=" + location + ", price=" + price + "]";
    }
    
    
}
