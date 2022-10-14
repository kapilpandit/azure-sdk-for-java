// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TabularSource;
import org.junit.jupiter.api.Test;

public final class TabularSourceTests {
    @Test
    public void testDeserialize() {
        TabularSource model =
            BinaryData.fromString("{\"type\":\"TabularSource\",\"\":{}}").toObject(TabularSource.class);
    }

    @Test
    public void testSerialize() {
        TabularSource model = new TabularSource();
        model = BinaryData.fromObject(model).toObject(TabularSource.class);
    }
}
