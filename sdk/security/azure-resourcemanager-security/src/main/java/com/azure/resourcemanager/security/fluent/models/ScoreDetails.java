// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Calculation result data. */
@Immutable
public final class ScoreDetails {
    /*
     * Maximum score available
     */
    @JsonProperty(value = "max", access = JsonProperty.Access.WRITE_ONLY)
    private Integer max;

    /*
     * Current score
     */
    @JsonProperty(value = "current", access = JsonProperty.Access.WRITE_ONLY)
    private Double current;

    /*
     * Ratio of the current score divided by the maximum. Rounded to 4 digits after the decimal point
     */
    @JsonProperty(value = "percentage", access = JsonProperty.Access.WRITE_ONLY)
    private Double percentage;

    /**
     * Get the max property: Maximum score available.
     *
     * @return the max value.
     */
    public Integer max() {
        return this.max;
    }

    /**
     * Get the current property: Current score.
     *
     * @return the current value.
     */
    public Double current() {
        return this.current;
    }

    /**
     * Get the percentage property: Ratio of the current score divided by the maximum. Rounded to 4 digits after the
     * decimal point.
     *
     * @return the percentage value.
     */
    public Double percentage() {
        return this.percentage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}