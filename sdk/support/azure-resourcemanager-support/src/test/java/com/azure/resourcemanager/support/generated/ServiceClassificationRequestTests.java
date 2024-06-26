// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.ServiceClassificationRequest;
import org.junit.jupiter.api.Assertions;

public final class ServiceClassificationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceClassificationRequest model = BinaryData
            .fromString("{\"issueSummary\":\"tyxolniwpwc\",\"resourceId\":\"jfkgiawxk\",\"additionalContext\":\"ypl\"}")
            .toObject(ServiceClassificationRequest.class);
        Assertions.assertEquals("tyxolniwpwc", model.issueSummary());
        Assertions.assertEquals("jfkgiawxk", model.resourceId());
        Assertions.assertEquals("ypl", model.additionalContext());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceClassificationRequest model = new ServiceClassificationRequest().withIssueSummary("tyxolniwpwc")
            .withResourceId("jfkgiawxk").withAdditionalContext("ypl");
        model = BinaryData.fromObject(model).toObject(ServiceClassificationRequest.class);
        Assertions.assertEquals("tyxolniwpwc", model.issueSummary());
        Assertions.assertEquals("jfkgiawxk", model.resourceId());
        Assertions.assertEquals("ypl", model.additionalContext());
    }
}
