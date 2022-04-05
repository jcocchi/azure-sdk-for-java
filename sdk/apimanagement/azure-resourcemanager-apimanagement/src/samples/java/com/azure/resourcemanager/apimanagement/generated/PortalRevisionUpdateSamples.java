// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PortalRevisionContract;

/** Samples for PortalRevision Update. */
public final class PortalRevisionUpdateSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementUpdatePortalRevision.json
     */
    /**
     * Sample code: ApiManagementUpdatePortalRevision.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdatePortalRevision(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        PortalRevisionContract resource =
            manager.portalRevisions().getWithResponse("rg1", "apimService1", "20201112101010", Context.NONE).getValue();
        resource.update().withDescription("portal revision update").withIsCurrent(true).withIfMatch("*").apply();
    }
}