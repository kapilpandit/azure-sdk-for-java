// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MicrosoftAccessSink;
import org.junit.jupiter.api.Test;

public final class MicrosoftAccessSinkTests {
    @Test
    public void testDeserialize() {
        MicrosoftAccessSink model =
            BinaryData.fromString("{\"type\":\"MicrosoftAccessSink\",\"\":{}}").toObject(MicrosoftAccessSink.class);
    }

    @Test
    public void testSerialize() {
        MicrosoftAccessSink model = new MicrosoftAccessSink();
        model = BinaryData.fromObject(model).toObject(MicrosoftAccessSink.class);
    }
}