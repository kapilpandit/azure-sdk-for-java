// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.GreenplumLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GreenplumLinkedServiceTests {
    @Test
    public void testDeserialize() {
        GreenplumLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Greenplum\",\"typeProperties\":{\"pwd\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"shnuqnd\",\"parameters\":{}},\"description\":\"pfkhuytuszxhmt\",\"parameters\":{\"w\":{\"type\":\"Object\"},\"kvzwydw\":{\"type\":\"String\"},\"aokgkskjivbsshaj\":{\"type\":\"Int\"}},\"annotations\":[],\"\":{}}")
                .toObject(GreenplumLinkedService.class);
        Assertions.assertEquals("shnuqnd", model.connectVia().referenceName());
        Assertions.assertEquals("pfkhuytuszxhmt", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("w").type());
    }

    @Test
    public void testSerialize() {
        GreenplumLinkedService model =
            new GreenplumLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("shnuqnd").withParameters(mapOf()))
                .withDescription("pfkhuytuszxhmt")
                .withParameters(
                    mapOf(
                        "w",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "kvzwydw",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "aokgkskjivbsshaj",
                        new ParameterSpecification().withType(ParameterType.INT)))
                .withAnnotations(Arrays.asList())
                .withPwd(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(GreenplumLinkedService.class);
        Assertions.assertEquals("shnuqnd", model.connectVia().referenceName());
        Assertions.assertEquals("pfkhuytuszxhmt", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("w").type());
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
