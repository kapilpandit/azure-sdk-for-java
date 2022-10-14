// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GlobalParameterResourceInner;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.GlobalParameterType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GlobalParameterResourceInnerTests {
    @Test
    public void testDeserialize() {
        GlobalParameterResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"onfo\":{\"type\":\"Array\"},\"uors\":{\"type\":\"Float\"},\"okwbqplh\":{\"type\":\"Object\"}},\"name\":\"nuuepzlrp\",\"type\":\"zsoldwey\",\"etag\":\"dunvmnnrwrbiorkt\",\"id\":\"ywjhhgdnhx\"}")
                .toObject(GlobalParameterResourceInner.class);
        Assertions.assertEquals("ywjhhgdnhx", model.id());
        Assertions.assertEquals(GlobalParameterType.ARRAY, model.properties().get("onfo").type());
    }

    @Test
    public void testSerialize() {
        GlobalParameterResourceInner model =
            new GlobalParameterResourceInner()
                .withId("ywjhhgdnhx")
                .withProperties(
                    mapOf(
                        "onfo",
                        new GlobalParameterSpecification().withType(GlobalParameterType.ARRAY),
                        "uors",
                        new GlobalParameterSpecification().withType(GlobalParameterType.FLOAT),
                        "okwbqplh",
                        new GlobalParameterSpecification().withType(GlobalParameterType.OBJECT)));
        model = BinaryData.fromObject(model).toObject(GlobalParameterResourceInner.class);
        Assertions.assertEquals("ywjhhgdnhx", model.id());
        Assertions.assertEquals(GlobalParameterType.ARRAY, model.properties().get("onfo").type());
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
