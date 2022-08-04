// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The flow endpoints configuration. */
@Fluent
public final class FlowEndpoints {
    /*
     * The outgoing ip address.
     */
    @JsonProperty(value = "outgoingIpAddresses")
    private List<IpAddress> outgoingIpAddresses;

    /*
     * The access endpoint ip address.
     */
    @JsonProperty(value = "accessEndpointIpAddresses")
    private List<IpAddress> accessEndpointIpAddresses;

    /**
     * Get the outgoingIpAddresses property: The outgoing ip address.
     *
     * @return the outgoingIpAddresses value.
     */
    public List<IpAddress> outgoingIpAddresses() {
        return this.outgoingIpAddresses;
    }

    /**
     * Set the outgoingIpAddresses property: The outgoing ip address.
     *
     * @param outgoingIpAddresses the outgoingIpAddresses value to set.
     * @return the FlowEndpoints object itself.
     */
    public FlowEndpoints withOutgoingIpAddresses(List<IpAddress> outgoingIpAddresses) {
        this.outgoingIpAddresses = outgoingIpAddresses;
        return this;
    }

    /**
     * Get the accessEndpointIpAddresses property: The access endpoint ip address.
     *
     * @return the accessEndpointIpAddresses value.
     */
    public List<IpAddress> accessEndpointIpAddresses() {
        return this.accessEndpointIpAddresses;
    }

    /**
     * Set the accessEndpointIpAddresses property: The access endpoint ip address.
     *
     * @param accessEndpointIpAddresses the accessEndpointIpAddresses value to set.
     * @return the FlowEndpoints object itself.
     */
    public FlowEndpoints withAccessEndpointIpAddresses(List<IpAddress> accessEndpointIpAddresses) {
        this.accessEndpointIpAddresses = accessEndpointIpAddresses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outgoingIpAddresses() != null) {
            outgoingIpAddresses().forEach(e -> e.validate());
        }
        if (accessEndpointIpAddresses() != null) {
            accessEndpointIpAddresses().forEach(e -> e.validate());
        }
    }
}