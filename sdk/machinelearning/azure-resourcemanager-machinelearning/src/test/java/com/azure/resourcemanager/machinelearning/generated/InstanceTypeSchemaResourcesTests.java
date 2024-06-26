// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchemaResources;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InstanceTypeSchemaResourcesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstanceTypeSchemaResources model =
            BinaryData
                .fromString(
                    "{\"requests\":{\"wnwvroevytlyokr\":\"bannovvoxczytp\",\"o\":\"rouuxvnsasbcry\",\"xnazpmkml\":\"izrxklob\"},\"limits\":{\"zxlioh\":\"vfxzopjh\",\"dtfgxqbawpcbb\":\"d\",\"ofyuicd\":\"zqcyknap\",\"ybww\":\"zb\"}}")
                .toObject(InstanceTypeSchemaResources.class);
        Assertions.assertEquals("bannovvoxczytp", model.requests().get("wnwvroevytlyokr"));
        Assertions.assertEquals("vfxzopjh", model.limits().get("zxlioh"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstanceTypeSchemaResources model =
            new InstanceTypeSchemaResources()
                .withRequests(
                    mapOf("wnwvroevytlyokr", "bannovvoxczytp", "o", "rouuxvnsasbcry", "xnazpmkml", "izrxklob"))
                .withLimits(mapOf("zxlioh", "vfxzopjh", "dtfgxqbawpcbb", "d", "ofyuicd", "zqcyknap", "ybww", "zb"));
        model = BinaryData.fromObject(model).toObject(InstanceTypeSchemaResources.class);
        Assertions.assertEquals("bannovvoxczytp", model.requests().get("wnwvroevytlyokr"));
        Assertions.assertEquals("vfxzopjh", model.limits().get("zxlioh"));
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
