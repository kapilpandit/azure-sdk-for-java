// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Azure NetApp Files volume from Microsoft.NetApp provider. */
@Fluent
public final class NetAppVolume {
    /*
     * Azure resource ID of the NetApp volume
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /** Creates an instance of NetAppVolume class. */
    public NetAppVolume() {
    }

    /**
     * Get the id property: Azure resource ID of the NetApp volume.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Azure resource ID of the NetApp volume.
     *
     * @param id the id value to set.
     * @return the NetAppVolume object itself.
     */
    public NetAppVolume withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model NetAppVolume"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetAppVolume.class);
}
