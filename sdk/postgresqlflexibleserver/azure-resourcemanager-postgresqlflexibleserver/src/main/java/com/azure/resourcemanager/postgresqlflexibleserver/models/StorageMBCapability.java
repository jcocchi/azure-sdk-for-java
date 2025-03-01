// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** storage size in MB capability. */
@Immutable
public final class StorageMBCapability {
    /*
     * storage MB name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * supported IOPS
     */
    @JsonProperty(value = "supportedIops", access = JsonProperty.Access.WRITE_ONLY)
    private Long supportedIops;

    /*
     * storage size in MB
     */
    @JsonProperty(value = "storageSizeMB", access = JsonProperty.Access.WRITE_ONLY)
    private Long storageSizeMB;

    /*
     * The supportedUpgradableTierList property.
     */
    @JsonProperty(value = "supportedUpgradableTierList", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageTierCapability> supportedUpgradableTierList;

    /*
     * The status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of StorageMBCapability class. */
    public StorageMBCapability() {
    }

    /**
     * Get the name property: storage MB name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedIops property: supported IOPS.
     *
     * @return the supportedIops value.
     */
    public Long supportedIops() {
        return this.supportedIops;
    }

    /**
     * Get the storageSizeMB property: storage size in MB.
     *
     * @return the storageSizeMB value.
     */
    public Long storageSizeMB() {
        return this.storageSizeMB;
    }

    /**
     * Get the supportedUpgradableTierList property: The supportedUpgradableTierList property.
     *
     * @return the supportedUpgradableTierList value.
     */
    public List<StorageTierCapability> supportedUpgradableTierList() {
        return this.supportedUpgradableTierList;
    }

    /**
     * Get the status property: The status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedUpgradableTierList() != null) {
            supportedUpgradableTierList().forEach(e -> e.validate());
        }
    }
}
