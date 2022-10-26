// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TarReadSettings;
import org.junit.jupiter.api.Test;

public final class TarReadSettingsTests {
    @Test
    public void testDeserialize() {
        TarReadSettings model =
            BinaryData.fromString("{\"type\":\"TarReadSettings\",\"\":{}}").toObject(TarReadSettings.class);
    }

    @Test
    public void testSerialize() {
        TarReadSettings model = new TarReadSettings();
        model = BinaryData.fromObject(model).toObject(TarReadSettings.class);
    }
}