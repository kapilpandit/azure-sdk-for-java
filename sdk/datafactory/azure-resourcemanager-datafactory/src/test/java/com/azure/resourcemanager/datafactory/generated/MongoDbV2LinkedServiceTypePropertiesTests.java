// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MongoDbV2LinkedServiceTypeProperties;
import org.junit.jupiter.api.Test;

public final class MongoDbV2LinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        MongoDbV2LinkedServiceTypeProperties model =
            BinaryData.fromString("{}").toObject(MongoDbV2LinkedServiceTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        MongoDbV2LinkedServiceTypeProperties model = new MongoDbV2LinkedServiceTypeProperties();
        model = BinaryData.fromObject(model).toObject(MongoDbV2LinkedServiceTypeProperties.class);
    }
}