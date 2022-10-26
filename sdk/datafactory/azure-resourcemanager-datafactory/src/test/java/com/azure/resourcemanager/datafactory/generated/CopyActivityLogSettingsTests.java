// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CopyActivityLogSettings;
import org.junit.jupiter.api.Test;

public final class CopyActivityLogSettingsTests {
    @Test
    public void testDeserialize() {
        CopyActivityLogSettings model = BinaryData.fromString("{}").toObject(CopyActivityLogSettings.class);
    }

    @Test
    public void testSerialize() {
        CopyActivityLogSettings model = new CopyActivityLogSettings();
        model = BinaryData.fromObject(model).toObject(CopyActivityLogSettings.class);
    }
}