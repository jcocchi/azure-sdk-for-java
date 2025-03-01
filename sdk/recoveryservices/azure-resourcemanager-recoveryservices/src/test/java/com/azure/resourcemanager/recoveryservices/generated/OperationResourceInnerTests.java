// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.OperationResourceInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationResourceInnerTests {
    @Test
    public void testDeserialize() {
        OperationResourceInner model =
            BinaryData
                .fromString(
                    "{\"endTime\":\"2021-04-13T23:02:25Z\",\"id\":\"hpzxbzpfzab\",\"name\":\"cuh\",\"status\":\"tcty\",\"startTime\":\"2021-04-24T03:57:36Z\"}")
                .toObject(OperationResourceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-13T23:02:25Z"), model.endTime());
        Assertions.assertEquals("hpzxbzpfzab", model.id());
        Assertions.assertEquals("cuh", model.name());
        Assertions.assertEquals("tcty", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T03:57:36Z"), model.startTime());
    }

    @Test
    public void testSerialize() {
        OperationResourceInner model =
            new OperationResourceInner()
                .withEndTime(OffsetDateTime.parse("2021-04-13T23:02:25Z"))
                .withId("hpzxbzpfzab")
                .withName("cuh")
                .withStatus("tcty")
                .withStartTime(OffsetDateTime.parse("2021-04-24T03:57:36Z"));
        model = BinaryData.fromObject(model).toObject(OperationResourceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-13T23:02:25Z"), model.endTime());
        Assertions.assertEquals("hpzxbzpfzab", model.id());
        Assertions.assertEquals("cuh", model.name());
        Assertions.assertEquals("tcty", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T03:57:36Z"), model.startTime());
    }
}
