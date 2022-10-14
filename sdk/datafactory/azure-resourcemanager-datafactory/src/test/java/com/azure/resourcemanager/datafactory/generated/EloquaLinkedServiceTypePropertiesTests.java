// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.EloquaLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Test;

public final class EloquaLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        EloquaLinkedServiceTypeProperties model =
            BinaryData
                .fromString("{\"password\":{\"type\":\"SecretBase\"}}")
                .toObject(EloquaLinkedServiceTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        EloquaLinkedServiceTypeProperties model =
            new EloquaLinkedServiceTypeProperties().withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(EloquaLinkedServiceTypeProperties.class);
    }
}
