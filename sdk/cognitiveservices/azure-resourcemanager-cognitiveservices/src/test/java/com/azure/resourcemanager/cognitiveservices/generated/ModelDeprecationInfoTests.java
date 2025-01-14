// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.ModelDeprecationInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ModelDeprecationInfoTests {
    @Test
    public void testDeserialize() {
        ModelDeprecationInfo model =
            BinaryData
                .fromString("{\"fineTune\":\"enhwlrs\",\"inference\":\"rzpwvlqdqgbiq\"}")
                .toObject(ModelDeprecationInfo.class);
        Assertions.assertEquals("enhwlrs", model.fineTune());
        Assertions.assertEquals("rzpwvlqdqgbiq", model.inference());
    }

    @Test
    public void testSerialize() {
        ModelDeprecationInfo model = new ModelDeprecationInfo().withFineTune("enhwlrs").withInference("rzpwvlqdqgbiq");
        model = BinaryData.fromObject(model).toObject(ModelDeprecationInfo.class);
        Assertions.assertEquals("enhwlrs", model.fineTune());
        Assertions.assertEquals("rzpwvlqdqgbiq", model.inference());
    }
}
