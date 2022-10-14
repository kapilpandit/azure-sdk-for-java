// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbSqlApiSink;
import org.junit.jupiter.api.Test;

public final class CosmosDbSqlApiSinkTests {
    @Test
    public void testDeserialize() {
        CosmosDbSqlApiSink model =
            BinaryData.fromString("{\"type\":\"CosmosDbSqlApiSink\",\"\":{}}").toObject(CosmosDbSqlApiSink.class);
    }

    @Test
    public void testSerialize() {
        CosmosDbSqlApiSink model = new CosmosDbSqlApiSink();
        model = BinaryData.fromObject(model).toObject(CosmosDbSqlApiSink.class);
    }
}
