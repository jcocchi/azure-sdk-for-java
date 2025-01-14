// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dns.models.DnsResourceReferenceRequest;
import java.util.Arrays;

/** Samples for DnsResourceReference GetByTargetResources. */
public final class DnsResourceReferenceGetByTargetResourcesSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetDnsResourceReference.json
     */
    /**
     * Sample code: List zones by resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listZonesByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getDnsResourceReferences()
            .getByTargetResourcesWithResponse(
                new DnsResourceReferenceRequest()
                    .withTargetResources(
                        Arrays
                            .asList(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/trafficManagerProfiles/testpp2"))),
                Context.NONE);
    }
}
