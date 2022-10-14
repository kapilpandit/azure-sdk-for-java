// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CosmosDbMongoDbApiCollectionDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CosmosDbMongoDbApiCollectionDatasetTests {
    @Test
    public void testDeserialize() {
        CosmosDbMongoDbApiCollectionDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"CosmosDbMongoDbApiCollection\",\"typeProperties\":{},\"description\":\"bsoqeqala\",\"linkedServiceName\":{\"referenceName\":\"agunbtgfebw\",\"parameters\":{}},\"parameters\":{\"e\":{\"type\":\"Float\"},\"zqavbpdqmjx\":{\"type\":\"String\"}},\"annotations\":[],\"folder\":{\"name\":\"lgouwtlmjj\"},\"\":{}}")
                .toObject(CosmosDbMongoDbApiCollectionDataset.class);
        Assertions.assertEquals("bsoqeqala", model.description());
        Assertions.assertEquals("agunbtgfebw", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("e").type());
        Assertions.assertEquals("lgouwtlmjj", model.folder().name());
    }

    @Test
    public void testSerialize() {
        CosmosDbMongoDbApiCollectionDataset model =
            new CosmosDbMongoDbApiCollectionDataset()
                .withDescription("bsoqeqala")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("agunbtgfebw").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "e",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "zqavbpdqmjx",
                        new ParameterSpecification().withType(ParameterType.STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("lgouwtlmjj"));
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiCollectionDataset.class);
        Assertions.assertEquals("bsoqeqala", model.description());
        Assertions.assertEquals("agunbtgfebw", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("e").type());
        Assertions.assertEquals("lgouwtlmjj", model.folder().name());
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
