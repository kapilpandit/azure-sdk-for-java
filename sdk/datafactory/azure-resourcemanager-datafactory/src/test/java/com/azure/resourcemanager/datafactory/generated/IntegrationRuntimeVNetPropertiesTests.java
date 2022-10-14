// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeVNetProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeVNetPropertiesTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeVNetProperties model =
            BinaryData
                .fromString(
                    "{\"vNetId\":\"ewijymrhbguz\",\"subnet\":\"kyewnfnzhhhqo\",\"publicIPs\":[\"fjkutycyarnroo\",\"g\",\"abzoghktdpyczhco\",\"ocnhzqrottjzcfyj\"],\"subnetId\":\"twrlohapqin\",\"\":{}}")
                .toObject(IntegrationRuntimeVNetProperties.class);
        Assertions.assertEquals("ewijymrhbguz", model.vNetId());
        Assertions.assertEquals("kyewnfnzhhhqo", model.subnet());
        Assertions.assertEquals("fjkutycyarnroo", model.publicIPs().get(0));
        Assertions.assertEquals("twrlohapqin", model.subnetId());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeVNetProperties model =
            new IntegrationRuntimeVNetProperties()
                .withVNetId("ewijymrhbguz")
                .withSubnet("kyewnfnzhhhqo")
                .withPublicIPs(Arrays.asList("fjkutycyarnroo", "g", "abzoghktdpyczhco", "ocnhzqrottjzcfyj"))
                .withSubnetId("twrlohapqin")
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeVNetProperties.class);
        Assertions.assertEquals("ewijymrhbguz", model.vNetId());
        Assertions.assertEquals("kyewnfnzhhhqo", model.subnet());
        Assertions.assertEquals("fjkutycyarnroo", model.publicIPs().get(0));
        Assertions.assertEquals("twrlohapqin", model.subnetId());
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
