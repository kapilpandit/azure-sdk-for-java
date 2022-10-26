// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeStatusResponseInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeStatus;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeStatusResponseInnerTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeStatusResponseInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"mvfaxkffeiith\",\"properties\":{\"type\":\"IntegrationRuntimeStatus\",\"dataFactoryName\":\"m\",\"state\":\"AccessDenied\",\"\":{}}}")
                .toObject(IntegrationRuntimeStatusResponseInner.class);
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeStatusResponseInner model =
            new IntegrationRuntimeStatusResponseInner()
                .withProperties(
                    new IntegrationRuntimeStatus()
                        .withAdditionalProperties(
                            mapOf(
                                "dataFactoryName", "m", "state", "AccessDenied", "type", "IntegrationRuntimeStatus")));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeStatusResponseInner.class);
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