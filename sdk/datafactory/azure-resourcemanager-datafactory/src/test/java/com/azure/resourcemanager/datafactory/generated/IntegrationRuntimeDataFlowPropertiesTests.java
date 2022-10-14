// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowComputeType;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeDataFlowPropertiesTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeDataFlowProperties model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"MemoryOptimized\",\"coreCount\":715232522,\"timeToLive\":1826352980,\"cleanup\":false,\"\":{}}")
                .toObject(IntegrationRuntimeDataFlowProperties.class);
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.computeType());
        Assertions.assertEquals(715232522, model.coreCount());
        Assertions.assertEquals(1826352980, model.timeToLive());
        Assertions.assertEquals(false, model.cleanup());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeDataFlowProperties model =
            new IntegrationRuntimeDataFlowProperties()
                .withComputeType(DataFlowComputeType.MEMORY_OPTIMIZED)
                .withCoreCount(715232522)
                .withTimeToLive(1826352980)
                .withCleanup(false)
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDataFlowProperties.class);
        Assertions.assertEquals(DataFlowComputeType.MEMORY_OPTIMIZED, model.computeType());
        Assertions.assertEquals(715232522, model.coreCount());
        Assertions.assertEquals(1826352980, model.timeToLive());
        Assertions.assertEquals(false, model.cleanup());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
