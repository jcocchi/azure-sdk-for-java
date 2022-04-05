// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azureadexternalidentities.models.GuestUsagesResource;

/** Samples for GuestUsages Update. */
public final class GuestUsagesUpdateSamples {
    /*
     * x-ms-original-file: specification/cpim/resource-manager/Microsoft.AzureActiveDirectory/stable/2021-04-01/examples/GuestUsagesUpdate.json
     */
    /**
     * Sample code: GuestUsages_Update.
     *
     * @param manager Entry point to ExternalIdentitiesConfigurationManager.
     */
    public static void guestUsagesUpdate(
        com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager manager) {
        GuestUsagesResource resource =
            manager
                .guestUsages()
                .getByResourceGroupWithResponse("contosoResourceGroup", "contoso.onmicrosoft.com", Context.NONE)
                .getValue();
        resource.update().apply();
    }
}