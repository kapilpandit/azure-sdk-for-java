// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExcelSource;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class ExcelSourceTests {
    @Test
    public void testDeserialize() {
        ExcelSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"ExcelSource\",\"storeSettings\":{\"type\":\"StoreReadSettings\",\"\":{}},\"\":{}}")
                .toObject(ExcelSource.class);
    }

    @Test
    public void testSerialize() {
        ExcelSource model =
            new ExcelSource()
                .withStoreSettings(
                    new StoreReadSettings().withAdditionalProperties(mapOf("type", "StoreReadSettings")));
        model = BinaryData.fromObject(model).toObject(ExcelSource.class);
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