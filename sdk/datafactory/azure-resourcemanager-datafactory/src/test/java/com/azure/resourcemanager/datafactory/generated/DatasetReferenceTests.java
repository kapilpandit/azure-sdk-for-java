// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatasetReferenceTests {
    @Test
    public void testDeserialize() {
        DatasetReference model =
            BinaryData
                .fromString("{\"referenceName\":\"ttktlahbq\",\"parameters\":{}}")
                .toObject(DatasetReference.class);
        Assertions.assertEquals("ttktlahbq", model.referenceName());
    }

    @Test
    public void testSerialize() {
        DatasetReference model = new DatasetReference().withReferenceName("ttktlahbq").withParameters(mapOf());
        model = BinaryData.fromObject(model).toObject(DatasetReference.class);
        Assertions.assertEquals("ttktlahbq", model.referenceName());
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