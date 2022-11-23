// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Elastic Resource Properties. */
@Fluent
public final class ElasticProperties {
    /*
     * Details of the user's elastic account.
     */
    @JsonProperty(value = "elasticCloudUser")
    private ElasticCloudUser elasticCloudUser;

    /*
     * Details of the elastic cloud deployment.
     */
    @JsonProperty(value = "elasticCloudDeployment")
    private ElasticCloudDeployment elasticCloudDeployment;

    /** Creates an instance of ElasticProperties class. */
    public ElasticProperties() {
    }

    /**
     * Get the elasticCloudUser property: Details of the user's elastic account.
     *
     * @return the elasticCloudUser value.
     */
    public ElasticCloudUser elasticCloudUser() {
        return this.elasticCloudUser;
    }

    /**
     * Set the elasticCloudUser property: Details of the user's elastic account.
     *
     * @param elasticCloudUser the elasticCloudUser value to set.
     * @return the ElasticProperties object itself.
     */
    public ElasticProperties withElasticCloudUser(ElasticCloudUser elasticCloudUser) {
        this.elasticCloudUser = elasticCloudUser;
        return this;
    }

    /**
     * Get the elasticCloudDeployment property: Details of the elastic cloud deployment.
     *
     * @return the elasticCloudDeployment value.
     */
    public ElasticCloudDeployment elasticCloudDeployment() {
        return this.elasticCloudDeployment;
    }

    /**
     * Set the elasticCloudDeployment property: Details of the elastic cloud deployment.
     *
     * @param elasticCloudDeployment the elasticCloudDeployment value to set.
     * @return the ElasticProperties object itself.
     */
    public ElasticProperties withElasticCloudDeployment(ElasticCloudDeployment elasticCloudDeployment) {
        this.elasticCloudDeployment = elasticCloudDeployment;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (elasticCloudUser() != null) {
            elasticCloudUser().validate();
        }
        if (elasticCloudDeployment() != null) {
            elasticCloudDeployment().validate();
        }
    }
}
