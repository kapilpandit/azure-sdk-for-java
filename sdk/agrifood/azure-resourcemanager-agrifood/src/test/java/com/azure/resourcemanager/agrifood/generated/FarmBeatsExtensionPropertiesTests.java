// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsExtensionProperties;
import org.junit.jupiter.api.Test;

public final class FarmBeatsExtensionPropertiesTests {
    @Test
    public void testDeserialize() {
        FarmBeatsExtensionProperties model =
            BinaryData
                .fromString(
                    "{\"targetResourceType\":\"fpjkjlxofp\",\"farmBeatsExtensionId\":\"hpf\",\"farmBeatsExtensionName\":\"ypininm\",\"farmBeatsExtensionVersion\":\"huyb\",\"publisherId\":\"podepoo\",\"description\":\"nuvamiheogna\",\"extensionCategory\":\"zxtheotusivyevcc\",\"extensionAuthLink\":\"ihnhun\",\"extensionApiDocsLink\":\"wjzrnfygxgisp\",\"detailedInformation\":[{\"apiName\":\"zfkufubljofx\",\"customParameters\":[\"fjaeq\",\"hqjbasvmsmj\",\"ulngsntn\"],\"platformParameters\":[\"kzgcwrwcl\",\"xwrljdouskcqvkoc\",\"cjdkwtnhxbnjbi\"],\"unitsSupported\":{\"key\":\"qrglssainqpjwn\",\"values\":[]},\"apiInputParameters\":[\"jfm\",\"pee\"]}]}")
                .toObject(FarmBeatsExtensionProperties.class);
    }

    @Test
    public void testSerialize() {
        FarmBeatsExtensionProperties model = new FarmBeatsExtensionProperties();
        model = BinaryData.fromObject(model).toObject(FarmBeatsExtensionProperties.class);
    }
}