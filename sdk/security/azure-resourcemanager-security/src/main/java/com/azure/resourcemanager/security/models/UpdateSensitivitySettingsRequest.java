// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * Request to update data sensitivity settings for sensitive data discovery.
 */
@Fluent
public final class UpdateSensitivitySettingsRequest {
    /*
     * List of selected sensitive info types' IDs.
     */
    @JsonProperty(value = "sensitiveInfoTypesIds", required = true)
    private List<UUID> sensitiveInfoTypesIds;

    /*
     * The order of the sensitivity threshold label. Any label at or above this order will be considered sensitive. If
     * set to -1, sensitivity by labels is turned off
     */
    @JsonProperty(value = "sensitivityThresholdLabelOrder")
    private Float sensitivityThresholdLabelOrder;

    /*
     * The id of the sensitivity threshold label. Any label at or above this rank will be considered sensitive.
     */
    @JsonProperty(value = "sensitivityThresholdLabelId")
    private UUID sensitivityThresholdLabelId;

    /**
     * Creates an instance of UpdateSensitivitySettingsRequest class.
     */
    public UpdateSensitivitySettingsRequest() {
    }

    /**
     * Get the sensitiveInfoTypesIds property: List of selected sensitive info types' IDs.
     * 
     * @return the sensitiveInfoTypesIds value.
     */
    public List<UUID> sensitiveInfoTypesIds() {
        return this.sensitiveInfoTypesIds;
    }

    /**
     * Set the sensitiveInfoTypesIds property: List of selected sensitive info types' IDs.
     * 
     * @param sensitiveInfoTypesIds the sensitiveInfoTypesIds value to set.
     * @return the UpdateSensitivitySettingsRequest object itself.
     */
    public UpdateSensitivitySettingsRequest withSensitiveInfoTypesIds(List<UUID> sensitiveInfoTypesIds) {
        this.sensitiveInfoTypesIds = sensitiveInfoTypesIds;
        return this;
    }

    /**
     * Get the sensitivityThresholdLabelOrder property: The order of the sensitivity threshold label. Any label at or
     * above this order will be considered sensitive. If set to -1, sensitivity by labels is turned off.
     * 
     * @return the sensitivityThresholdLabelOrder value.
     */
    public Float sensitivityThresholdLabelOrder() {
        return this.sensitivityThresholdLabelOrder;
    }

    /**
     * Set the sensitivityThresholdLabelOrder property: The order of the sensitivity threshold label. Any label at or
     * above this order will be considered sensitive. If set to -1, sensitivity by labels is turned off.
     * 
     * @param sensitivityThresholdLabelOrder the sensitivityThresholdLabelOrder value to set.
     * @return the UpdateSensitivitySettingsRequest object itself.
     */
    public UpdateSensitivitySettingsRequest withSensitivityThresholdLabelOrder(Float sensitivityThresholdLabelOrder) {
        this.sensitivityThresholdLabelOrder = sensitivityThresholdLabelOrder;
        return this;
    }

    /**
     * Get the sensitivityThresholdLabelId property: The id of the sensitivity threshold label. Any label at or above
     * this rank will be considered sensitive.
     * 
     * @return the sensitivityThresholdLabelId value.
     */
    public UUID sensitivityThresholdLabelId() {
        return this.sensitivityThresholdLabelId;
    }

    /**
     * Set the sensitivityThresholdLabelId property: The id of the sensitivity threshold label. Any label at or above
     * this rank will be considered sensitive.
     * 
     * @param sensitivityThresholdLabelId the sensitivityThresholdLabelId value to set.
     * @return the UpdateSensitivitySettingsRequest object itself.
     */
    public UpdateSensitivitySettingsRequest withSensitivityThresholdLabelId(UUID sensitivityThresholdLabelId) {
        this.sensitivityThresholdLabelId = sensitivityThresholdLabelId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sensitiveInfoTypesIds() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property sensitiveInfoTypesIds in model UpdateSensitivitySettingsRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdateSensitivitySettingsRequest.class);
}
