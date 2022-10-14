// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HdfsLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HdfsLinkedServiceTests {
    @Test
    public void testDeserialize() {
        HdfsLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Hdfs\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"vafjrqpjiyrqj\",\"parameters\":{}},\"description\":\"xwmzwdfkbnrz\",\"parameters\":{\"tbqctqjfgx\":{\"type\":\"Object\"},\"etgzdgvpy\":{\"type\":\"SecureString\"}},\"annotations\":[],\"\":{}}")
                .toObject(HdfsLinkedService.class);
        Assertions.assertEquals("vafjrqpjiyrqj", model.connectVia().referenceName());
        Assertions.assertEquals("xwmzwdfkbnrz", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("tbqctqjfgx").type());
    }

    @Test
    public void testSerialize() {
        HdfsLinkedService model =
            new HdfsLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("vafjrqpjiyrqj").withParameters(mapOf()))
                .withDescription("xwmzwdfkbnrz")
                .withParameters(
                    mapOf(
                        "tbqctqjfgx",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "etgzdgvpy",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(HdfsLinkedService.class);
        Assertions.assertEquals("vafjrqpjiyrqj", model.connectVia().referenceName());
        Assertions.assertEquals("xwmzwdfkbnrz", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("tbqctqjfgx").type());
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
