// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.OperationInner;
import com.azure.resourcemanager.datafactory.models.OperationDisplay;
import com.azure.resourcemanager.datafactory.models.OperationServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationInnerTests {
    @Test
    public void testDeserialize() {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"itjz\",\"origin\":\"lusarh\",\"display\":{\"description\":\"cqhsm\",\"provider\":\"rkdtmlxh\",\"resource\":\"uksjtxukcdmp\",\"operation\":\"cryuan\"},\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[],\"metricSpecifications\":[]}}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("itjz", model.name());
        Assertions.assertEquals("lusarh", model.origin());
        Assertions.assertEquals("cqhsm", model.display().description());
        Assertions.assertEquals("rkdtmlxh", model.display().provider());
        Assertions.assertEquals("uksjtxukcdmp", model.display().resource());
        Assertions.assertEquals("cryuan", model.display().operation());
    }

    @Test
    public void testSerialize() {
        OperationInner model =
            new OperationInner()
                .withName("itjz")
                .withOrigin("lusarh")
                .withDisplay(
                    new OperationDisplay()
                        .withDescription("cqhsm")
                        .withProvider("rkdtmlxh")
                        .withResource("uksjtxukcdmp")
                        .withOperation("cryuan"))
                .withServiceSpecification(
                    new OperationServiceSpecification()
                        .withLogSpecifications(Arrays.asList())
                        .withMetricSpecifications(Arrays.asList()));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("itjz", model.name());
        Assertions.assertEquals("lusarh", model.origin());
        Assertions.assertEquals("cqhsm", model.display().description());
        Assertions.assertEquals("rkdtmlxh", model.display().provider());
        Assertions.assertEquals("uksjtxukcdmp", model.display().resource());
        Assertions.assertEquals("cryuan", model.display().operation());
    }
}
