// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureFileStorageLocation;
import org.junit.jupiter.api.Test;

public final class AzureFileStorageLocationTests {
    @Test
    public void testDeserialize() {
        AzureFileStorageLocation model =
            BinaryData
                .fromString("{\"type\":\"AzureFileStorageLocation\",\"\":{}}")
                .toObject(AzureFileStorageLocation.class);
    }

    @Test
    public void testSerialize() {
        AzureFileStorageLocation model = new AzureFileStorageLocation();
        model = BinaryData.fromObject(model).toObject(AzureFileStorageLocation.class);
    }
}
