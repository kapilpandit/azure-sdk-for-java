// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolResourceProperties;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesClusterPoolProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesComputeProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesLogAnalyticsProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesNetworkProfile;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolResourceProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Accepted\",\"deploymentId\":\"ucmpoyfd\",\"managedResourceGroupName\":\"ogknygjofjdd\",\"aksManagedResourceGroupName\":\"s\",\"clusterPoolProfile\":{\"clusterPoolVersion\":\"eupewnwreitjz\"},\"computeProfile\":{\"vmSize\":\"flusarhmof\",\"count\":313282977},\"aksClusterProfile\":{\"aksClusterResourceId\":\"yurkdtmlxhekuksj\",\"aksClusterAgentPoolIdentityProfile\":{\"msiResourceId\":\"ukcdmparcryuanzw\",\"msiClientId\":\"xzdxtayrlhmwh\",\"msiObjectId\":\"pmrqobm\"},\"aksVersion\":\"kknryrtihf\"},\"networkProfile\":{\"subnetId\":\"ijbpzvgnwzsymgl\"},\"logAnalyticsProfile\":{\"enabled\":true,\"workspaceId\":\"yzkohdbihanuf\"},\"status\":\"cbjy\"}")
                .toObject(ClusterPoolResourceProperties.class);
        Assertions.assertEquals("ogknygjofjdd", model.managedResourceGroupName());
        Assertions.assertEquals("eupewnwreitjz", model.clusterPoolProfile().clusterPoolVersion());
        Assertions.assertEquals("flusarhmof", model.computeProfile().vmSize());
        Assertions.assertEquals("ijbpzvgnwzsymgl", model.networkProfile().subnetId());
        Assertions.assertEquals(true, model.logAnalyticsProfile().enabled());
        Assertions.assertEquals("yzkohdbihanuf", model.logAnalyticsProfile().workspaceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolResourceProperties model =
            new ClusterPoolResourceProperties()
                .withManagedResourceGroupName("ogknygjofjdd")
                .withClusterPoolProfile(
                    new ClusterPoolResourcePropertiesClusterPoolProfile().withClusterPoolVersion("eupewnwreitjz"))
                .withComputeProfile(new ClusterPoolResourcePropertiesComputeProfile().withVmSize("flusarhmof"))
                .withNetworkProfile(new ClusterPoolResourcePropertiesNetworkProfile().withSubnetId("ijbpzvgnwzsymgl"))
                .withLogAnalyticsProfile(
                    new ClusterPoolResourcePropertiesLogAnalyticsProfile()
                        .withEnabled(true)
                        .withWorkspaceId("yzkohdbihanuf"));
        model = BinaryData.fromObject(model).toObject(ClusterPoolResourceProperties.class);
        Assertions.assertEquals("ogknygjofjdd", model.managedResourceGroupName());
        Assertions.assertEquals("eupewnwreitjz", model.clusterPoolProfile().clusterPoolVersion());
        Assertions.assertEquals("flusarhmof", model.computeProfile().vmSize());
        Assertions.assertEquals("ijbpzvgnwzsymgl", model.networkProfile().subnetId());
        Assertions.assertEquals(true, model.logAnalyticsProfile().enabled());
        Assertions.assertEquals("yzkohdbihanuf", model.logAnalyticsProfile().workspaceId());
    }
}
