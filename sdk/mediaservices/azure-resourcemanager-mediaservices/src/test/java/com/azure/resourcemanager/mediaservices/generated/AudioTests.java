// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Audio;
import org.junit.jupiter.api.Assertions;

public final class AudioTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Audio model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.Audio\",\"channels\":749799353,\"samplingRate\":1507022412,\"bitrate\":655143714,\"label\":\"lazszrn\"}")
                .toObject(Audio.class);
        Assertions.assertEquals("lazszrn", model.label());
        Assertions.assertEquals(749799353, model.channels());
        Assertions.assertEquals(1507022412, model.samplingRate());
        Assertions.assertEquals(655143714, model.bitrate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Audio model =
            new Audio()
                .withLabel("lazszrn")
                .withChannels(749799353)
                .withSamplingRate(1507022412)
                .withBitrate(655143714);
        model = BinaryData.fromObject(model).toObject(Audio.class);
        Assertions.assertEquals("lazszrn", model.label());
        Assertions.assertEquals(749799353, model.channels());
        Assertions.assertEquals(1507022412, model.samplingRate());
        Assertions.assertEquals(655143714, model.bitrate());
    }
}
