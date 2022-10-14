// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HiveSource;
import org.junit.jupiter.api.Test;

public final class HiveSourceTests {
    @Test
    public void testDeserialize() {
        HiveSource model = BinaryData.fromString("{\"type\":\"HiveSource\",\"\":{}}").toObject(HiveSource.class);
    }

    @Test
    public void testSerialize() {
        HiveSource model = new HiveSource();
        model = BinaryData.fromObject(model).toObject(HiveSource.class);
    }
}
