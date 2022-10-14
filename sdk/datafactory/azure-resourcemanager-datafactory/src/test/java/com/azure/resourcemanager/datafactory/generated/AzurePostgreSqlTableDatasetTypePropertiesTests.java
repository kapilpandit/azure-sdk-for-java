// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzurePostgreSqlTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class AzurePostgreSqlTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AzurePostgreSqlTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(AzurePostgreSqlTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        AzurePostgreSqlTableDatasetTypeProperties model = new AzurePostgreSqlTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlTableDatasetTypeProperties.class);
    }
}
