// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.AzureMariaDBLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureMariaDBLinkedServiceTests {
    @Test
    public void testDeserialize() {
        AzureMariaDBLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMariaDB\",\"typeProperties\":{\"pwd\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"zllrz\",\"parameters\":{}},\"description\":\"dqgmih\",\"parameters\":{\"qrhnxtminkl\":{\"type\":\"Int\"},\"svtzarhzv\":{\"type\":\"Object\"}},\"annotations\":[],\"\":{}}")
                .toObject(AzureMariaDBLinkedService.class);
        Assertions.assertEquals("zllrz", model.connectVia().referenceName());
        Assertions.assertEquals("dqgmih", model.description());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("qrhnxtminkl").type());
    }

    @Test
    public void testSerialize() {
        AzureMariaDBLinkedService model =
            new AzureMariaDBLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("zllrz").withParameters(mapOf()))
                .withDescription("dqgmih")
                .withParameters(
                    mapOf(
                        "qrhnxtminkl",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "svtzarhzv",
                        new ParameterSpecification().withType(ParameterType.OBJECT)))
                .withAnnotations(Arrays.asList())
                .withPwd(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(AzureMariaDBLinkedService.class);
        Assertions.assertEquals("zllrz", model.connectVia().referenceName());
        Assertions.assertEquals("dqgmih", model.description());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("qrhnxtminkl").type());
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
