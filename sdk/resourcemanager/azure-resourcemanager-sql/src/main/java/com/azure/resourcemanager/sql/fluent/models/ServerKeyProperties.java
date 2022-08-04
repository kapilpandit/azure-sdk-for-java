// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties for a server key execution. */
@Fluent
public final class ServerKeyProperties {
    /*
     * Subregion of the server key.
     */
    @JsonProperty(value = "subregion", access = JsonProperty.Access.WRITE_ONLY)
    private String subregion;

    /*
     * The server key type like 'ServiceManaged', 'AzureKeyVault'.
     */
    @JsonProperty(value = "serverKeyType", required = true)
    private ServerKeyType serverKeyType;

    /*
     * The URI of the server key.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * Thumbprint of the server key.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * The server key creation date.
     */
    @JsonProperty(value = "creationDate")
    private OffsetDateTime creationDate;

    /**
     * Get the subregion property: Subregion of the server key.
     *
     * @return the subregion value.
     */
    public String subregion() {
        return this.subregion;
    }

    /**
     * Get the serverKeyType property: The server key type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * Set the serverKeyType property: The server key type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the ServerKeyProperties object itself.
     */
    public ServerKeyProperties withServerKeyType(ServerKeyType serverKeyType) {
        this.serverKeyType = serverKeyType;
        return this;
    }

    /**
     * Get the uri property: The URI of the server key.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the server key.
     *
     * @param uri the uri value to set.
     * @return the ServerKeyProperties object itself.
     */
    public ServerKeyProperties withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the thumbprint property: Thumbprint of the server key.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Thumbprint of the server key.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the ServerKeyProperties object itself.
     */
    public ServerKeyProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the creationDate property: The server key creation date.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Set the creationDate property: The server key creation date.
     *
     * @param creationDate the creationDate value to set.
     * @return the ServerKeyProperties object itself.
     */
    public ServerKeyProperties withCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverKeyType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serverKeyType in model ServerKeyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerKeyProperties.class);
}