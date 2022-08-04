// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a job credential. */
@Fluent
public final class JobCredentialProperties {
    /*
     * The credential user name.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The credential password.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get the username property: The credential user name.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The credential user name.
     *
     * @param username the username value to set.
     * @return the JobCredentialProperties object itself.
     */
    public JobCredentialProperties withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The credential password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The credential password.
     *
     * @param password the password value to set.
     * @return the JobCredentialProperties object itself.
     */
    public JobCredentialProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property username in model JobCredentialProperties"));
        }
        if (password() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property password in model JobCredentialProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobCredentialProperties.class);
}