// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.UserAccessPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Get Data Plane read only token response definition. */
@Fluent
public final class AccessPolicyResponseInner {
    /*
     * The user access policy.
     */
    @JsonProperty(value = "policy")
    private UserAccessPolicy policy;

    /*
     * Data Plane read only access token.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /*
     * Data Plane service base URL.
     */
    @JsonProperty(value = "dataPlaneUrl")
    private String dataPlaneUrl;

    /** Creates an instance of AccessPolicyResponseInner class. */
    public AccessPolicyResponseInner() {
    }

    /**
     * Get the policy property: The user access policy.
     *
     * @return the policy value.
     */
    public UserAccessPolicy policy() {
        return this.policy;
    }

    /**
     * Set the policy property: The user access policy.
     *
     * @param policy the policy value to set.
     * @return the AccessPolicyResponseInner object itself.
     */
    public AccessPolicyResponseInner withPolicy(UserAccessPolicy policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Get the accessToken property: Data Plane read only access token.
     *
     * @return the accessToken value.
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Data Plane read only access token.
     *
     * @param accessToken the accessToken value to set.
     * @return the AccessPolicyResponseInner object itself.
     */
    public AccessPolicyResponseInner withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the dataPlaneUrl property: Data Plane service base URL.
     *
     * @return the dataPlaneUrl value.
     */
    public String dataPlaneUrl() {
        return this.dataPlaneUrl;
    }

    /**
     * Set the dataPlaneUrl property: Data Plane service base URL.
     *
     * @param dataPlaneUrl the dataPlaneUrl value to set.
     * @return the AccessPolicyResponseInner object itself.
     */
    public AccessPolicyResponseInner withDataPlaneUrl(String dataPlaneUrl) {
        this.dataPlaneUrl = dataPlaneUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policy() != null) {
            policy().validate();
        }
    }
}
