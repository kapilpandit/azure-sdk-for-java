// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFlowResourceInnerTests {
    @Test
    public void testDeserialize() {
        DataFlowResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"DataFlow\",\"description\":\"ca\",\"annotations\":[],\"folder\":{\"name\":\"t\"}},\"name\":\"dut\",\"type\":\"ormrlxqtvcofudfl\",\"etag\":\"gj\",\"id\":\"gdknnqv\"}")
                .toObject(DataFlowResourceInner.class);
        Assertions.assertEquals("gdknnqv", model.id());
        Assertions.assertEquals("ca", model.properties().description());
        Assertions.assertEquals("t", model.properties().folder().name());
    }

    @Test
    public void testSerialize() {
        DataFlowResourceInner model =
            new DataFlowResourceInner()
                .withId("gdknnqv")
                .withProperties(
                    new DataFlow()
                        .withDescription("ca")
                        .withAnnotations(Arrays.asList())
                        .withFolder(new DataFlowFolder().withName("t")));
        model = BinaryData.fromObject(model).toObject(DataFlowResourceInner.class);
        Assertions.assertEquals("gdknnqv", model.id());
        Assertions.assertEquals("ca", model.properties().description());
        Assertions.assertEquals("t", model.properties().folder().name());
    }
}
