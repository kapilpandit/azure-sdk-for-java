// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.OdbcTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class OdbcTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        OdbcTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(OdbcTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        OdbcTableDatasetTypeProperties model = new OdbcTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(OdbcTableDatasetTypeProperties.class);
    }
}
