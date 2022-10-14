// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandPayload;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFlowDebugCommandPayloadTests {
    @Test
    public void testDeserialize() {
        DataFlowDebugCommandPayload model =
            BinaryData
                .fromString(
                    "{\"streamName\":\"ngitvgbmhrixkwm\",\"rowLimits\":1594893264,\"columns\":[\"veg\",\"hbpnaixexccbd\",\"eaxhcexdrrvqahqk\",\"htpwij\"],\"expression\":\"yjsvfyc\"}")
                .toObject(DataFlowDebugCommandPayload.class);
        Assertions.assertEquals("ngitvgbmhrixkwm", model.streamName());
        Assertions.assertEquals(1594893264, model.rowLimits());
        Assertions.assertEquals("veg", model.columns().get(0));
        Assertions.assertEquals("yjsvfyc", model.expression());
    }

    @Test
    public void testSerialize() {
        DataFlowDebugCommandPayload model =
            new DataFlowDebugCommandPayload()
                .withStreamName("ngitvgbmhrixkwm")
                .withRowLimits(1594893264)
                .withColumns(Arrays.asList("veg", "hbpnaixexccbd", "eaxhcexdrrvqahqk", "htpwij"))
                .withExpression("yjsvfyc");
        model = BinaryData.fromObject(model).toObject(DataFlowDebugCommandPayload.class);
        Assertions.assertEquals("ngitvgbmhrixkwm", model.streamName());
        Assertions.assertEquals(1594893264, model.rowLimits());
        Assertions.assertEquals("veg", model.columns().get(0));
        Assertions.assertEquals("yjsvfyc", model.expression());
    }
}
