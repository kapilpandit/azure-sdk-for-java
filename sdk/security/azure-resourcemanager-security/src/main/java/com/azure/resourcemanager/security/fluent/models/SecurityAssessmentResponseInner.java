// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.AssessmentLinks;
import com.azure.resourcemanager.security.models.AssessmentStatusResponse;
import com.azure.resourcemanager.security.models.ResourceDetails;
import com.azure.resourcemanager.security.models.SecurityAssessmentPartnerData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Security assessment on a resource - response format. */
@Fluent
public final class SecurityAssessmentResponseInner extends ProxyResource {
    /*
     * Describes properties of an assessment.
     */
    @JsonProperty(value = "properties")
    private SecurityAssessmentPropertiesResponse innerProperties;

    /**
     * Get the innerProperties property: Describes properties of an assessment.
     *
     * @return the innerProperties value.
     */
    private SecurityAssessmentPropertiesResponse innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the status property: The result of the assessment.
     *
     * @return the status value.
     */
    public AssessmentStatusResponse status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The result of the assessment.
     *
     * @param status the status value to set.
     * @return the SecurityAssessmentResponseInner object itself.
     */
    public SecurityAssessmentResponseInner withStatus(AssessmentStatusResponse status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAssessmentPropertiesResponse();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the resourceDetails property: Details of the resource that was assessed.
     *
     * @return the resourceDetails value.
     */
    public ResourceDetails resourceDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceDetails();
    }

    /**
     * Set the resourceDetails property: Details of the resource that was assessed.
     *
     * @param resourceDetails the resourceDetails value to set.
     * @return the SecurityAssessmentResponseInner object itself.
     */
    public SecurityAssessmentResponseInner withResourceDetails(ResourceDetails resourceDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAssessmentPropertiesResponse();
        }
        this.innerProperties().withResourceDetails(resourceDetails);
        return this;
    }

    /**
     * Get the displayName property: User friendly display name of the assessment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the additionalData property: Additional data regarding the assessment.
     *
     * @return the additionalData value.
     */
    public Map<String, String> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Set the additionalData property: Additional data regarding the assessment.
     *
     * @param additionalData the additionalData value to set.
     * @return the SecurityAssessmentResponseInner object itself.
     */
    public SecurityAssessmentResponseInner withAdditionalData(Map<String, String> additionalData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAssessmentPropertiesResponse();
        }
        this.innerProperties().withAdditionalData(additionalData);
        return this;
    }

    /**
     * Get the links property: Links relevant to the assessment.
     *
     * @return the links value.
     */
    public AssessmentLinks links() {
        return this.innerProperties() == null ? null : this.innerProperties().links();
    }

    /**
     * Get the metadata property: Describes properties of an assessment metadata.
     *
     * @return the metadata value.
     */
    public SecurityAssessmentMetadataProperties metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: Describes properties of an assessment metadata.
     *
     * @param metadata the metadata value to set.
     * @return the SecurityAssessmentResponseInner object itself.
     */
    public SecurityAssessmentResponseInner withMetadata(SecurityAssessmentMetadataProperties metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAssessmentPropertiesResponse();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the partnersData property: Data regarding 3rd party partner integration.
     *
     * @return the partnersData value.
     */
    public SecurityAssessmentPartnerData partnersData() {
        return this.innerProperties() == null ? null : this.innerProperties().partnersData();
    }

    /**
     * Set the partnersData property: Data regarding 3rd party partner integration.
     *
     * @param partnersData the partnersData value to set.
     * @return the SecurityAssessmentResponseInner object itself.
     */
    public SecurityAssessmentResponseInner withPartnersData(SecurityAssessmentPartnerData partnersData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAssessmentPropertiesResponse();
        }
        this.innerProperties().withPartnersData(partnersData);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}