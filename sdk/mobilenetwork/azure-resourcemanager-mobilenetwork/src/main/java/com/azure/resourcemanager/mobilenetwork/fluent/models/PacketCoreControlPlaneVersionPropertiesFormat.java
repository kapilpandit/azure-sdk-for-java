// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.RecommendedVersion;
import com.azure.resourcemanager.mobilenetwork.models.VersionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Packet core control plane version properties. */
@Fluent
public final class PacketCoreControlPlaneVersionPropertiesFormat {
    /*
     * The provisioning state of the packet core control plane version
     * resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The state of this packet core control plane version.
     */
    @JsonProperty(value = "versionState")
    private VersionState versionState;

    /*
     * Indicates whether this is the recommended version to use for new packet
     * core control plane deployments.
     */
    @JsonProperty(value = "recommendedVersion")
    private RecommendedVersion recommendedVersion;

    /**
     * Get the provisioningState property: The provisioning state of the packet core control plane version resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the versionState property: The state of this packet core control plane version.
     *
     * @return the versionState value.
     */
    public VersionState versionState() {
        return this.versionState;
    }

    /**
     * Set the versionState property: The state of this packet core control plane version.
     *
     * @param versionState the versionState value to set.
     * @return the PacketCoreControlPlaneVersionPropertiesFormat object itself.
     */
    public PacketCoreControlPlaneVersionPropertiesFormat withVersionState(VersionState versionState) {
        this.versionState = versionState;
        return this;
    }

    /**
     * Get the recommendedVersion property: Indicates whether this is the recommended version to use for new packet core
     * control plane deployments.
     *
     * @return the recommendedVersion value.
     */
    public RecommendedVersion recommendedVersion() {
        return this.recommendedVersion;
    }

    /**
     * Set the recommendedVersion property: Indicates whether this is the recommended version to use for new packet core
     * control plane deployments.
     *
     * @param recommendedVersion the recommendedVersion value to set.
     * @return the PacketCoreControlPlaneVersionPropertiesFormat object itself.
     */
    public PacketCoreControlPlaneVersionPropertiesFormat withRecommendedVersion(RecommendedVersion recommendedVersion) {
        this.recommendedVersion = recommendedVersion;
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