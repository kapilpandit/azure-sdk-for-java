// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AwsOrganizationalDataMember;
import org.junit.jupiter.api.Assertions;

public final class AwsOrganizationalDataMemberTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AwsOrganizationalDataMember model =
            BinaryData
                .fromString("{\"organizationMembershipType\":\"Member\",\"parentHierarchyId\":\"j\"}")
                .toObject(AwsOrganizationalDataMember.class);
        Assertions.assertEquals("j", model.parentHierarchyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AwsOrganizationalDataMember model = new AwsOrganizationalDataMember().withParentHierarchyId("j");
        model = BinaryData.fromObject(model).toObject(AwsOrganizationalDataMember.class);
        Assertions.assertEquals("j", model.parentHierarchyId());
    }
}
