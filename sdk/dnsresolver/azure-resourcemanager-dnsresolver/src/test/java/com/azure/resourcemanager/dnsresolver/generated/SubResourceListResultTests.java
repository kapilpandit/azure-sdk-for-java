// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.models.SubResourceListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SubResourceListResultTests {
    @Test
    public void testDeserialize() {
        SubResourceListResult model =
            BinaryData
                .fromString("{\"value\":[{\"id\":\"pewr\"}],\"nextLink\":\"mwvvjektcxsenhw\"}")
                .toObject(SubResourceListResult.class);
        Assertions.assertEquals("pewr", model.value().get(0).id());
    }

    @Test
    public void testSerialize() {
        SubResourceListResult model =
            new SubResourceListResult().withValue(Arrays.asList(new SubResource().withId("pewr")));
        model = BinaryData.fromObject(model).toObject(SubResourceListResult.class);
        Assertions.assertEquals("pewr", model.value().get(0).id());
    }
}