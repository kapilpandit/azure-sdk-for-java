// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ManagedInstances ListByResourceGroup. */
public final class ManagedInstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2018-06-01-preview/examples/ManagedInstanceListByResourceGroup.json
     */
    /**
     * Sample code: List managed instances by resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedInstancesByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getManagedInstances().listByResourceGroup("Test1", Context.NONE);
    }
}