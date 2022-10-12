// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworksOperation GetByResourceGroup. */
public final class VirtualNetworksOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-05-01-preview/examples/GetVirtualNetwork.json
     */
    /**
     * Sample code: GetVirtualNetwork.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getVirtualNetwork(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager
            .virtualNetworksOperations()
            .getByResourceGroupWithResponse("test-arcappliance-resgrp", "test-vnet-static", Context.NONE);
    }
}