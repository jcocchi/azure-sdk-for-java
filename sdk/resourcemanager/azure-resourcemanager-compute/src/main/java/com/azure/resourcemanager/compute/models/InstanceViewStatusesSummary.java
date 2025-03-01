// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Instance view statuses. */
@Immutable
public final class InstanceViewStatusesSummary {
    /*
     * The summary.
     */
    @JsonProperty(value = "statusesSummary", access = JsonProperty.Access.WRITE_ONLY)
    private List<StatusCodeCount> statusesSummary;

    /** Creates an instance of InstanceViewStatusesSummary class. */
    public InstanceViewStatusesSummary() {
    }

    /**
     * Get the statusesSummary property: The summary.
     *
     * @return the statusesSummary value.
     */
    public List<StatusCodeCount> statusesSummary() {
        return this.statusesSummary;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statusesSummary() != null) {
            statusesSummary().forEach(e -> e.validate());
        }
    }
}
