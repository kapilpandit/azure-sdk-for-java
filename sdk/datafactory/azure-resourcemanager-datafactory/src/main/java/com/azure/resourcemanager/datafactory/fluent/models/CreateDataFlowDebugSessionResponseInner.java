// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body structure for creating data flow debug session. */
@Fluent
public final class CreateDataFlowDebugSessionResponseInner {
    /*
     * The state of the debug session.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /** Creates an instance of CreateDataFlowDebugSessionResponseInner class. */
    public CreateDataFlowDebugSessionResponseInner() {
    }

    /**
     * Get the status property: The state of the debug session.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The state of the debug session.
     *
     * @param status the status value to set.
     * @return the CreateDataFlowDebugSessionResponseInner object itself.
     */
    public CreateDataFlowDebugSessionResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the sessionId property: The ID of data flow debug session.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set.
     * @return the CreateDataFlowDebugSessionResponseInner object itself.
     */
    public CreateDataFlowDebugSessionResponseInner withSessionId(String sessionId) {
        this.sessionId = sessionId;
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
