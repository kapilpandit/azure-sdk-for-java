// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Azure ML Batch Execution activity properties. */
@Fluent
public final class AzureMLBatchExecutionActivityTypeProperties {
    /*
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web
     * service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters
     * property of the Azure ML batch execution request.
     */
    @JsonProperty(value = "globalParameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> globalParameters;

    /*
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs to AzureMLWebServiceFile objects
     * specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the
     * Azure ML batch execution request.
     */
    @JsonProperty(value = "webServiceOutputs")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, AzureMLWebServiceFile> webServiceOutputs;

    /*
     * Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs to AzureMLWebServiceFile objects
     * specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the
     * Azure ML batch execution request.
     */
    @JsonProperty(value = "webServiceInputs")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, AzureMLWebServiceFile> webServiceInputs;

    /** Creates an instance of AzureMLBatchExecutionActivityTypeProperties class. */
    public AzureMLBatchExecutionActivityTypeProperties() {
    }

    /**
     * Get the globalParameters property: Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint.
     * Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be
     * passed in the GlobalParameters property of the Azure ML batch execution request.
     *
     * @return the globalParameters value.
     */
    public Map<String, Object> globalParameters() {
        return this.globalParameters;
    }

    /**
     * Set the globalParameters property: Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint.
     * Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be
     * passed in the GlobalParameters property of the Azure ML batch execution request.
     *
     * @param globalParameters the globalParameters value to set.
     * @return the AzureMLBatchExecutionActivityTypeProperties object itself.
     */
    public AzureMLBatchExecutionActivityTypeProperties withGlobalParameters(Map<String, Object> globalParameters) {
        this.globalParameters = globalParameters;
        return this;
    }

    /**
     * Get the webServiceOutputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs
     * to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the
     * WebServiceOutputs property of the Azure ML batch execution request.
     *
     * @return the webServiceOutputs value.
     */
    public Map<String, AzureMLWebServiceFile> webServiceOutputs() {
        return this.webServiceOutputs;
    }

    /**
     * Set the webServiceOutputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs
     * to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the
     * WebServiceOutputs property of the Azure ML batch execution request.
     *
     * @param webServiceOutputs the webServiceOutputs value to set.
     * @return the AzureMLBatchExecutionActivityTypeProperties object itself.
     */
    public AzureMLBatchExecutionActivityTypeProperties withWebServiceOutputs(
        Map<String, AzureMLWebServiceFile> webServiceOutputs) {
        this.webServiceOutputs = webServiceOutputs;
        return this;
    }

    /**
     * Get the webServiceInputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs
     * to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the
     * WebServiceInputs property of the Azure ML batch execution request.
     *
     * @return the webServiceInputs value.
     */
    public Map<String, AzureMLWebServiceFile> webServiceInputs() {
        return this.webServiceInputs;
    }

    /**
     * Set the webServiceInputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs
     * to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the
     * WebServiceInputs property of the Azure ML batch execution request.
     *
     * @param webServiceInputs the webServiceInputs value to set.
     * @return the AzureMLBatchExecutionActivityTypeProperties object itself.
     */
    public AzureMLBatchExecutionActivityTypeProperties withWebServiceInputs(
        Map<String, AzureMLWebServiceFile> webServiceInputs) {
        this.webServiceInputs = webServiceInputs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (webServiceOutputs() != null) {
            webServiceOutputs()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (webServiceInputs() != null) {
            webServiceInputs()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
