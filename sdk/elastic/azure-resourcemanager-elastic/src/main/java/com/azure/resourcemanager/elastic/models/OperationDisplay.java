// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that represents the operation. */
@Fluent
public final class OperationDisplay {
    /*
     * Service provider, i.e., Microsoft.Elastic.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Type on which the operation is performed, e.g., 'monitors'.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Operation type, e.g., read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Description of the operation, e.g., 'Write monitors'.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of OperationDisplay class. */
    public OperationDisplay() {
    }

    /**
     * Get the provider property: Service provider, i.e., Microsoft.Elastic.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Service provider, i.e., Microsoft.Elastic.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Type on which the operation is performed, e.g., 'monitors'.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Type on which the operation is performed, e.g., 'monitors'.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Operation type, e.g., read, write, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation type, e.g., read, write, delete, etc.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Description of the operation, e.g., 'Write monitors'.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the operation, e.g., 'Write monitors'.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
