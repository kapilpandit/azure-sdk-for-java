// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.FhirResourceVersionPolicy;
import com.azure.resourcemanager.healthcareapis.models.ResourceVersionPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResourceVersionPolicyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceVersionPolicyConfiguration model = BinaryData.fromString(
            "{\"default\":\"versioned\",\"resourceTypeOverrides\":{\"whhmhykojo\":\"versioned\",\"fnndl\":\"versioned\"}}")
            .toObject(ResourceVersionPolicyConfiguration.class);
        Assertions.assertEquals(FhirResourceVersionPolicy.VERSIONED, model.defaultProperty());
        Assertions.assertEquals(FhirResourceVersionPolicy.VERSIONED, model.resourceTypeOverrides().get("whhmhykojo"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceVersionPolicyConfiguration model = new ResourceVersionPolicyConfiguration()
            .withDefaultProperty(FhirResourceVersionPolicy.VERSIONED).withResourceTypeOverrides(
                mapOf("whhmhykojo", FhirResourceVersionPolicy.VERSIONED, "fnndl", FhirResourceVersionPolicy.VERSIONED));
        model = BinaryData.fromObject(model).toObject(ResourceVersionPolicyConfiguration.class);
        Assertions.assertEquals(FhirResourceVersionPolicy.VERSIONED, model.defaultProperty());
        Assertions.assertEquals(FhirResourceVersionPolicy.VERSIONED, model.resourceTypeOverrides().get("whhmhykojo"));
    }

    // Use "Map.of" if available
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
