// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugResource;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFlowDebugResourceTests {
    @Test
    public void testDeserialize() {
        DataFlowDebugResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"DataFlow\",\"description\":\"qxujxukndxd\",\"annotations\":[],\"folder\":{\"name\":\"uufzdmsyqtfihw\"}},\"name\":\"otzi\"}")
                .toObject(DataFlowDebugResource.class);
        Assertions.assertEquals("otzi", model.name());
        Assertions.assertEquals("qxujxukndxd", model.properties().description());
        Assertions.assertEquals("uufzdmsyqtfihw", model.properties().folder().name());
    }

    @Test
    public void testSerialize() {
        DataFlowDebugResource model =
            new DataFlowDebugResource()
                .withName("otzi")
                .withProperties(
                    new DataFlow()
                        .withDescription("qxujxukndxd")
                        .withAnnotations(Arrays.asList())
                        .withFolder(new DataFlowFolder().withName("uufzdmsyqtfihw")));
        model = BinaryData.fromObject(model).toObject(DataFlowDebugResource.class);
        Assertions.assertEquals("otzi", model.name());
        Assertions.assertEquals("qxujxukndxd", model.properties().description());
        Assertions.assertEquals("uufzdmsyqtfihw", model.properties().folder().name());
    }
}
