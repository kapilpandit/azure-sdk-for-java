// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GitHubClientSecret;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GitHubClientSecretTests {
    @Test
    public void testDeserialize() {
        GitHubClientSecret model =
            BinaryData
                .fromString("{\"byoaSecretAkvUrl\":\"fhyhltrpmopjmcma\",\"byoaSecretName\":\"okth\"}")
                .toObject(GitHubClientSecret.class);
        Assertions.assertEquals("fhyhltrpmopjmcma", model.byoaSecretAkvUrl());
        Assertions.assertEquals("okth", model.byoaSecretName());
    }

    @Test
    public void testSerialize() {
        GitHubClientSecret model =
            new GitHubClientSecret().withByoaSecretAkvUrl("fhyhltrpmopjmcma").withByoaSecretName("okth");
        model = BinaryData.fromObject(model).toObject(GitHubClientSecret.class);
        Assertions.assertEquals("fhyhltrpmopjmcma", model.byoaSecretAkvUrl());
        Assertions.assertEquals("okth", model.byoaSecretName());
    }
}
