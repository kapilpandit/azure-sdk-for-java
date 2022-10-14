// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DWCopyCommandDefaultValue;
import com.azure.resourcemanager.datafactory.models.DWCopyCommandSettings;
import com.azure.resourcemanager.datafactory.models.PolybaseSettings;
import com.azure.resourcemanager.datafactory.models.PolybaseSettingsRejectType;
import com.azure.resourcemanager.datafactory.models.SqlDWSink;
import com.azure.resourcemanager.datafactory.models.SqlDWUpsertSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlDWSinkTests {
    @Test
    public void testDeserialize() {
        SqlDWSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"SqlDWSink\",\"polyBaseSettings\":{\"rejectType\":\"percentage\",\"\":{}},\"copyCommandSettings\":{\"defaultValues\":[{},{}],\"additionalOptions\":{\"liegftcvbi\":\"r\"}},\"upsertSettings\":{},\"\":{}}")
                .toObject(SqlDWSink.class);
        Assertions.assertEquals(PolybaseSettingsRejectType.PERCENTAGE, model.polyBaseSettings().rejectType());
        Assertions.assertEquals("r", model.copyCommandSettings().additionalOptions().get("liegftcvbi"));
    }

    @Test
    public void testSerialize() {
        SqlDWSink model =
            new SqlDWSink()
                .withPolyBaseSettings(
                    new PolybaseSettings()
                        .withRejectType(PolybaseSettingsRejectType.PERCENTAGE)
                        .withAdditionalProperties(mapOf()))
                .withCopyCommandSettings(
                    new DWCopyCommandSettings()
                        .withDefaultValues(
                            Arrays.asList(new DWCopyCommandDefaultValue(), new DWCopyCommandDefaultValue()))
                        .withAdditionalOptions(mapOf("liegftcvbi", "r")))
                .withUpsertSettings(new SqlDWUpsertSettings());
        model = BinaryData.fromObject(model).toObject(SqlDWSink.class);
        Assertions.assertEquals(PolybaseSettingsRejectType.PERCENTAGE, model.polyBaseSettings().rejectType());
        Assertions.assertEquals("r", model.copyCommandSettings().additionalOptions().get("liegftcvbi"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
