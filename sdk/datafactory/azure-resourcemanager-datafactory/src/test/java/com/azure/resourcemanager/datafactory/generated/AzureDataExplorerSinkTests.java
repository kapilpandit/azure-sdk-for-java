// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataExplorerSink;
import org.junit.jupiter.api.Test;

public final class AzureDataExplorerSinkTests {
    @Test
    public void testDeserialize() {
        AzureDataExplorerSink model =
            BinaryData.fromString("{\"type\":\"AzureDataExplorerSink\",\"\":{}}").toObject(AzureDataExplorerSink.class);
    }

    @Test
    public void testSerialize() {
        AzureDataExplorerSink model = new AzureDataExplorerSink();
        model = BinaryData.fromObject(model).toObject(AzureDataExplorerSink.class);
    }
}
