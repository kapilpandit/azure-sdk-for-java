// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SapHanaTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class SapHanaTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        SapHanaTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(SapHanaTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        SapHanaTableDatasetTypeProperties model = new SapHanaTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(SapHanaTableDatasetTypeProperties.class);
    }
}