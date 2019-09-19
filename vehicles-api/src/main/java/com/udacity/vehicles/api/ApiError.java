package com.udacity.vehicles.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Declares methods to return errors and other messages from the API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class ApiError {

    /** The message. */
    private final String message;
    
    /** The errors. */
    private final List<String> errors;

    /**
     * Instantiates a new api error.
     *
     * @param message the message
     * @param errors the errors
     */
    ApiError(String message, List<String> errors) {
        this.message = message;
        this.errors = errors;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the errors.
     *
     * @return the errors
     */
    public List<String> getErrors() {
        return errors;
    }
}
