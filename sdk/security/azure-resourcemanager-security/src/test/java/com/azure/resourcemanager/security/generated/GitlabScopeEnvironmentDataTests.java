// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GitlabScopeEnvironmentData;

public final class GitlabScopeEnvironmentDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitlabScopeEnvironmentData model =
            BinaryData.fromString("{\"environmentType\":\"GitlabScope\"}").toObject(GitlabScopeEnvironmentData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitlabScopeEnvironmentData model = new GitlabScopeEnvironmentData();
        model = BinaryData.fromObject(model).toObject(GitlabScopeEnvironmentData.class);
    }
}
