// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.StorageType;
import com.azure.resourcemanager.appcontainers.models.Volume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeTests {
    @Test
    public void testDeserialize() {
        Volume model =
            BinaryData
                .fromString("{\"name\":\"rncsdtclu\",\"storageType\":\"EmptyDir\",\"storageName\":\"bsfgytguslfea\"}")
                .toObject(Volume.class);
        Assertions.assertEquals("rncsdtclu", model.name());
        Assertions.assertEquals(StorageType.EMPTY_DIR, model.storageType());
        Assertions.assertEquals("bsfgytguslfea", model.storageName());
    }

    @Test
    public void testSerialize() {
        Volume model =
            new Volume().withName("rncsdtclu").withStorageType(StorageType.EMPTY_DIR).withStorageName("bsfgytguslfea");
        model = BinaryData.fromObject(model).toObject(Volume.class);
        Assertions.assertEquals("rncsdtclu", model.name());
        Assertions.assertEquals(StorageType.EMPTY_DIR, model.storageType());
        Assertions.assertEquals("bsfgytguslfea", model.storageName());
    }
}
