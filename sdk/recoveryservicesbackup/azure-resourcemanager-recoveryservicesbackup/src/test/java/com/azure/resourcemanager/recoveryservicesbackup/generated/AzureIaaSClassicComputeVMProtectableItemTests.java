// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSClassicComputeVMProtectableItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureIaaSClassicComputeVMProtectableItemTests {
    @Test
    public void testDeserialize() {
        AzureIaaSClassicComputeVMProtectableItem model =
            BinaryData
                .fromString(
                    "{\"protectableItemType\":\"Microsoft.ClassicCompute/virtualMachines\",\"virtualMachineId\":\"ddbhf\",\"virtualMachineVersion\":\"fpazjzoywjxhpd\",\"resourceGroup\":\"ontacnpq\",\"backupManagementType\":\"ehtuevrhr\",\"workloadType\":\"yoogw\",\"friendlyName\":\"nsduugwbsre\",\"protectionState\":\"Invalid\"}")
                .toObject(AzureIaaSClassicComputeVMProtectableItem.class);
        Assertions.assertEquals("ehtuevrhr", model.backupManagementType());
        Assertions.assertEquals("yoogw", model.workloadType());
        Assertions.assertEquals("nsduugwbsre", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.INVALID, model.protectionState());
        Assertions.assertEquals("ddbhf", model.virtualMachineId());
        Assertions.assertEquals("fpazjzoywjxhpd", model.virtualMachineVersion());
        Assertions.assertEquals("ontacnpq", model.resourceGroup());
    }

    @Test
    public void testSerialize() {
        AzureIaaSClassicComputeVMProtectableItem model =
            new AzureIaaSClassicComputeVMProtectableItem()
                .withBackupManagementType("ehtuevrhr")
                .withWorkloadType("yoogw")
                .withFriendlyName("nsduugwbsre")
                .withProtectionState(ProtectionStatus.INVALID)
                .withVirtualMachineId("ddbhf")
                .withVirtualMachineVersion("fpazjzoywjxhpd")
                .withResourceGroup("ontacnpq");
        model = BinaryData.fromObject(model).toObject(AzureIaaSClassicComputeVMProtectableItem.class);
        Assertions.assertEquals("ehtuevrhr", model.backupManagementType());
        Assertions.assertEquals("yoogw", model.workloadType());
        Assertions.assertEquals("nsduugwbsre", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.INVALID, model.protectionState());
        Assertions.assertEquals("ddbhf", model.virtualMachineId());
        Assertions.assertEquals("fpazjzoywjxhpd", model.virtualMachineVersion());
        Assertions.assertEquals("ontacnpq", model.resourceGroup());
    }
}