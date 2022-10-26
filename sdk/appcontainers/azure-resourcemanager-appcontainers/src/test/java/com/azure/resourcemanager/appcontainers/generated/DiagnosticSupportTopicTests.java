// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticSupportTopic;
import org.junit.jupiter.api.Test;

public final class DiagnosticSupportTopicTests {
    @Test
    public void testDeserialize() {
        DiagnosticSupportTopic model =
            BinaryData
                .fromString("{\"id\":\"wjhhgdnhxmsivf\",\"pesId\":\"iloxggdufiq\"}")
                .toObject(DiagnosticSupportTopic.class);
    }

    @Test
    public void testSerialize() {
        DiagnosticSupportTopic model = new DiagnosticSupportTopic();
        model = BinaryData.fromObject(model).toObject(DiagnosticSupportTopic.class);
    }
}