// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Quickbase linked service type properties. */
@Fluent
public final class QuickbaseLinkedServiceTypeProperties {
    /*
     * The url to connect Quickbase source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * The user token for the Quickbase source.
     */
    @JsonProperty(value = "userToken", required = true)
    private SecretBase userToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of QuickbaseLinkedServiceTypeProperties class. */
    public QuickbaseLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: The url to connect Quickbase source. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The url to connect Quickbase source. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the QuickbaseLinkedServiceTypeProperties object itself.
     */
    public QuickbaseLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the userToken property: The user token for the Quickbase source.
     *
     * @return the userToken value.
     */
    public SecretBase userToken() {
        return this.userToken;
    }

    /**
     * Set the userToken property: The user token for the Quickbase source.
     *
     * @param userToken the userToken value to set.
     * @return the QuickbaseLinkedServiceTypeProperties object itself.
     */
    public QuickbaseLinkedServiceTypeProperties withUserToken(SecretBase userToken) {
        this.userToken = userToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the QuickbaseLinkedServiceTypeProperties object itself.
     */
    public QuickbaseLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property url in model QuickbaseLinkedServiceTypeProperties"));
        }
        if (userToken() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userToken in model QuickbaseLinkedServiceTypeProperties"));
        } else {
            userToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuickbaseLinkedServiceTypeProperties.class);
}
