// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The settings to enable AAD authentication on the cluster. */
@Fluent
public final class AzureActiveDirectory {
    /*
     * Azure active directory tenant id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Azure active directory cluster application id.
     */
    @JsonProperty(value = "clusterApplication")
    private String clusterApplication;

    /*
     * Azure active directory client application id.
     */
    @JsonProperty(value = "clientApplication")
    private String clientApplication;

    /** Creates an instance of AzureActiveDirectory class. */
    public AzureActiveDirectory() {
    }

    /**
     * Get the tenantId property: Azure active directory tenant id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Azure active directory tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clusterApplication property: Azure active directory cluster application id.
     *
     * @return the clusterApplication value.
     */
    public String clusterApplication() {
        return this.clusterApplication;
    }

    /**
     * Set the clusterApplication property: Azure active directory cluster application id.
     *
     * @param clusterApplication the clusterApplication value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withClusterApplication(String clusterApplication) {
        this.clusterApplication = clusterApplication;
        return this;
    }

    /**
     * Get the clientApplication property: Azure active directory client application id.
     *
     * @return the clientApplication value.
     */
    public String clientApplication() {
        return this.clientApplication;
    }

    /**
     * Set the clientApplication property: Azure active directory client application id.
     *
     * @param clientApplication the clientApplication value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withClientApplication(String clientApplication) {
        this.clientApplication = clientApplication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
