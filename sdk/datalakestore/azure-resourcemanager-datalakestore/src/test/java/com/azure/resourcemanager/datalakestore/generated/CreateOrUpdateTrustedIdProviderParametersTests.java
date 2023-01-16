// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.CreateOrUpdateTrustedIdProviderParameters;
import org.junit.jupiter.api.Assertions;

public final class CreateOrUpdateTrustedIdProviderParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateOrUpdateTrustedIdProviderParameters model =
            BinaryData
                .fromString("{\"properties\":{\"idProvider\":\"zscxaqwo\"}}")
                .toObject(CreateOrUpdateTrustedIdProviderParameters.class);
        Assertions.assertEquals("zscxaqwo", model.idProvider());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateOrUpdateTrustedIdProviderParameters model =
            new CreateOrUpdateTrustedIdProviderParameters().withIdProvider("zscxaqwo");
        model = BinaryData.fromObject(model).toObject(CreateOrUpdateTrustedIdProviderParameters.class);
        Assertions.assertEquals("zscxaqwo", model.idProvider());
    }
}
