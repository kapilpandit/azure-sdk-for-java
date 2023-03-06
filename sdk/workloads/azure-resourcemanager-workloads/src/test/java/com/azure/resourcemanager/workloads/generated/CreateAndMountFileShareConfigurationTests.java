// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.CreateAndMountFileShareConfiguration;
import org.junit.jupiter.api.Assertions;

public final class CreateAndMountFileShareConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateAndMountFileShareConfiguration model =
            BinaryData
                .fromString(
                    "{\"configurationType\":\"CreateAndMount\",\"resourceGroup\":\"ebwnujhe\",\"storageAccountName\":\"sbvdkcrodtjinfw\"}")
                .toObject(CreateAndMountFileShareConfiguration.class);
        Assertions.assertEquals("ebwnujhe", model.resourceGroup());
        Assertions.assertEquals("sbvdkcrodtjinfw", model.storageAccountName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateAndMountFileShareConfiguration model =
            new CreateAndMountFileShareConfiguration()
                .withResourceGroup("ebwnujhe")
                .withStorageAccountName("sbvdkcrodtjinfw");
        model = BinaryData.fromObject(model).toObject(CreateAndMountFileShareConfiguration.class);
        Assertions.assertEquals("ebwnujhe", model.resourceGroup());
        Assertions.assertEquals("sbvdkcrodtjinfw", model.storageAccountName());
    }
}
