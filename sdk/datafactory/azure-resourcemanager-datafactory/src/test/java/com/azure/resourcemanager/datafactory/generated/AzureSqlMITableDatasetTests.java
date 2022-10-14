// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSqlMITableDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureSqlMITableDatasetTests {
    @Test
    public void testDeserialize() {
        AzureSqlMITableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureSqlMITable\",\"typeProperties\":{},\"description\":\"pud\",\"linkedServiceName\":{\"referenceName\":\"btqwpwyawbzas\",\"parameters\":{}},\"parameters\":{\"kyexaoguyaipi\":{\"type\":\"Int\"},\"ault\":{\"type\":\"Int\"}},\"annotations\":[],\"folder\":{\"name\":\"mfqwa\"},\"\":{}}")
                .toObject(AzureSqlMITableDataset.class);
        Assertions.assertEquals("pud", model.description());
        Assertions.assertEquals("btqwpwyawbzas", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("kyexaoguyaipi").type());
        Assertions.assertEquals("mfqwa", model.folder().name());
    }

    @Test
    public void testSerialize() {
        AzureSqlMITableDataset model =
            new AzureSqlMITableDataset()
                .withDescription("pud")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("btqwpwyawbzas").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "kyexaoguyaipi",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "ault",
                        new ParameterSpecification().withType(ParameterType.INT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("mfqwa"));
        model = BinaryData.fromObject(model).toObject(AzureSqlMITableDataset.class);
        Assertions.assertEquals("pud", model.description());
        Assertions.assertEquals("btqwpwyawbzas", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("kyexaoguyaipi").type());
        Assertions.assertEquals("mfqwa", model.folder().name());
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
