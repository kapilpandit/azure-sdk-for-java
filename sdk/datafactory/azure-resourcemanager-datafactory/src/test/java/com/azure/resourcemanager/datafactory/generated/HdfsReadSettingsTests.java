// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DistcpSettings;
import com.azure.resourcemanager.datafactory.models.HdfsReadSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HdfsReadSettingsTests {
    @Test
    public void testDeserialize() {
        HdfsReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"HdfsReadSettings\",\"enablePartitionDiscovery\":true,\"distcpSettings\":{},\"\":{}}")
                .toObject(HdfsReadSettings.class);
        Assertions.assertEquals(true, model.enablePartitionDiscovery());
    }

    @Test
    public void testSerialize() {
        HdfsReadSettings model =
            new HdfsReadSettings().withEnablePartitionDiscovery(true).withDistcpSettings(new DistcpSettings());
        model = BinaryData.fromObject(model).toObject(HdfsReadSettings.class);
        Assertions.assertEquals(true, model.enablePartitionDiscovery());
    }
}
