// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkInner;

/** An immutable client-side representation of WorkloadNetwork. */
public interface WorkloadNetwork {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkInner object.
     *
     * @return the inner object.
     */
    WorkloadNetworkInner innerModel();
}
