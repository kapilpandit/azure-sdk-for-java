// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AmazonRdsForSqlServerTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class AmazonRdsForSqlServerTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AmazonRdsForSqlServerTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(AmazonRdsForSqlServerTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        AmazonRdsForSqlServerTableDatasetTypeProperties model = new AmazonRdsForSqlServerTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(AmazonRdsForSqlServerTableDatasetTypeProperties.class);
    }
}
