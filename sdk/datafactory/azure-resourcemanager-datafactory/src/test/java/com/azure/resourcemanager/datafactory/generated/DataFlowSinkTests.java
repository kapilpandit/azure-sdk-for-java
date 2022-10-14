// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowSink;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFlowSinkTests {
    @Test
    public void testDeserialize() {
        DataFlowSink model =
            BinaryData
                .fromString(
                    "{\"schemaLinkedService\":{\"referenceName\":\"zxhi\",\"parameters\":{}},\"rejectedDataLinkedService\":{\"referenceName\":\"b\",\"parameters\":{}},\"name\":\"qagt\",\"description\":\"dhlfkqojpykvgt\",\"dataset\":{\"referenceName\":\"cnifm\",\"parameters\":{}},\"linkedService\":{\"referenceName\":\"ymbrnysuxmpraf\",\"parameters\":{}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"ocxvdfffwafqr\",\"parameters\":{},\"\":{}}}")
                .toObject(DataFlowSink.class);
        Assertions.assertEquals("qagt", model.name());
        Assertions.assertEquals("dhlfkqojpykvgt", model.description());
        Assertions.assertEquals("cnifm", model.dataset().referenceName());
        Assertions.assertEquals("ymbrnysuxmpraf", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("ocxvdfffwafqr", model.flowlet().referenceName());
        Assertions.assertEquals("zxhi", model.schemaLinkedService().referenceName());
        Assertions.assertEquals("b", model.rejectedDataLinkedService().referenceName());
    }

    @Test
    public void testSerialize() {
        DataFlowSink model =
            new DataFlowSink()
                .withName("qagt")
                .withDescription("dhlfkqojpykvgt")
                .withDataset(new DatasetReference().withReferenceName("cnifm").withParameters(mapOf()))
                .withLinkedService(
                    new LinkedServiceReference().withReferenceName("ymbrnysuxmpraf").withParameters(mapOf()))
                .withFlowlet(
                    new DataFlowReference()
                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("ocxvdfffwafqr")
                        .withParameters(mapOf())
                        .withAdditionalProperties(mapOf()))
                .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("zxhi").withParameters(mapOf()))
                .withRejectedDataLinkedService(
                    new LinkedServiceReference().withReferenceName("b").withParameters(mapOf()));
        model = BinaryData.fromObject(model).toObject(DataFlowSink.class);
        Assertions.assertEquals("qagt", model.name());
        Assertions.assertEquals("dhlfkqojpykvgt", model.description());
        Assertions.assertEquals("cnifm", model.dataset().referenceName());
        Assertions.assertEquals("ymbrnysuxmpraf", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("ocxvdfffwafqr", model.flowlet().referenceName());
        Assertions.assertEquals("zxhi", model.schemaLinkedService().referenceName());
        Assertions.assertEquals("b", model.rejectedDataLinkedService().referenceName());
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
