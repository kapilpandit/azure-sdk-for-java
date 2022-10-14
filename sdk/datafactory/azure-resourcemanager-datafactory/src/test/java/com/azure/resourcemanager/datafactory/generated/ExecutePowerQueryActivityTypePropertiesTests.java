// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ExecutePowerQueryActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import com.azure.resourcemanager.datafactory.models.PowerQuerySinkMapping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExecutePowerQueryActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ExecutePowerQueryActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"sinks\":{\"cmiwdw\":{\"script\":\"rejparnpv\",\"schemaLinkedService\":{\"referenceName\":\"szrbwtdrcwg\",\"parameters\":{}},\"rejectedDataLinkedService\":{\"referenceName\":\"l\",\"parameters\":{}},\"name\":\"lhhfi\",\"description\":\"cfculzj\",\"dataset\":{\"referenceName\":\"hp\",\"parameters\":{}},\"linkedService\":{\"referenceName\":\"vyldqpzfzxsoxin\",\"parameters\":{}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"zkdrocqsxy\",\"parameters\":{},\"\":{}}}},\"queries\":[{\"queryName\":\"mey\",\"dataflowSinks\":[]}],\"dataFlow\":{\"type\":\"DataFlowReference\",\"referenceName\":\"m\",\"parameters\":{},\"\":{}},\"staging\":{\"linkedService\":{\"referenceName\":\"zcrryklleynqa\",\"parameters\":{}}},\"integrationRuntime\":{\"referenceName\":\"glclwa\",\"parameters\":{}},\"compute\":{}}")
                .toObject(ExecutePowerQueryActivityTypeProperties.class);
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("m", model.dataFlow().referenceName());
        Assertions.assertEquals("zcrryklleynqa", model.staging().linkedService().referenceName());
        Assertions.assertEquals("glclwa", model.integrationRuntime().referenceName());
        Assertions.assertEquals("lhhfi", model.sinks().get("cmiwdw").name());
        Assertions.assertEquals("cfculzj", model.sinks().get("cmiwdw").description());
        Assertions.assertEquals("hp", model.sinks().get("cmiwdw").dataset().referenceName());
        Assertions.assertEquals("vyldqpzfzxsoxin", model.sinks().get("cmiwdw").linkedService().referenceName());
        Assertions
            .assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get("cmiwdw").flowlet().type());
        Assertions.assertEquals("zkdrocqsxy", model.sinks().get("cmiwdw").flowlet().referenceName());
        Assertions.assertEquals("szrbwtdrcwg", model.sinks().get("cmiwdw").schemaLinkedService().referenceName());
        Assertions.assertEquals("l", model.sinks().get("cmiwdw").rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("rejparnpv", model.sinks().get("cmiwdw").script());
        Assertions.assertEquals("mey", model.queries().get(0).queryName());
    }

    @Test
    public void testSerialize() {
        ExecutePowerQueryActivityTypeProperties model =
            new ExecutePowerQueryActivityTypeProperties()
                .withDataFlow(
                    new DataFlowReference()
                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("m")
                        .withParameters(mapOf())
                        .withAdditionalProperties(mapOf()))
                .withStaging(
                    new DataFlowStagingInfo()
                        .withLinkedService(
                            new LinkedServiceReference().withReferenceName("zcrryklleynqa").withParameters(mapOf())))
                .withIntegrationRuntime(
                    new IntegrationRuntimeReference().withReferenceName("glclwa").withParameters(mapOf()))
                .withCompute(new ExecuteDataFlowActivityTypePropertiesCompute())
                .withSinks(
                    mapOf(
                        "cmiwdw",
                        new PowerQuerySink()
                            .withName("lhhfi")
                            .withDescription("cfculzj")
                            .withDataset(new DatasetReference().withReferenceName("hp").withParameters(mapOf()))
                            .withLinkedService(
                                new LinkedServiceReference()
                                    .withReferenceName("vyldqpzfzxsoxin")
                                    .withParameters(mapOf()))
                            .withFlowlet(
                                new DataFlowReference()
                                    .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                    .withReferenceName("zkdrocqsxy")
                                    .withParameters(mapOf())
                                    .withAdditionalProperties(mapOf()))
                            .withSchemaLinkedService(
                                new LinkedServiceReference().withReferenceName("szrbwtdrcwg").withParameters(mapOf()))
                            .withRejectedDataLinkedService(
                                new LinkedServiceReference().withReferenceName("l").withParameters(mapOf()))
                            .withScript("rejparnpv")))
                .withQueries(
                    Arrays.asList(new PowerQuerySinkMapping().withQueryName("mey").withDataflowSinks(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ExecutePowerQueryActivityTypeProperties.class);
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("m", model.dataFlow().referenceName());
        Assertions.assertEquals("zcrryklleynqa", model.staging().linkedService().referenceName());
        Assertions.assertEquals("glclwa", model.integrationRuntime().referenceName());
        Assertions.assertEquals("lhhfi", model.sinks().get("cmiwdw").name());
        Assertions.assertEquals("cfculzj", model.sinks().get("cmiwdw").description());
        Assertions.assertEquals("hp", model.sinks().get("cmiwdw").dataset().referenceName());
        Assertions.assertEquals("vyldqpzfzxsoxin", model.sinks().get("cmiwdw").linkedService().referenceName());
        Assertions
            .assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get("cmiwdw").flowlet().type());
        Assertions.assertEquals("zkdrocqsxy", model.sinks().get("cmiwdw").flowlet().referenceName());
        Assertions.assertEquals("szrbwtdrcwg", model.sinks().get("cmiwdw").schemaLinkedService().referenceName());
        Assertions.assertEquals("l", model.sinks().get("cmiwdw").rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("rejparnpv", model.sinks().get("cmiwdw").script());
        Assertions.assertEquals("mey", model.queries().get(0).queryName());
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
