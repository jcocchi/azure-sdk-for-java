// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for ContentKeyPolicies GetPolicyPropertiesWithSecrets. */
public final class ContentKeyPoliciesGetPolicyPropertiesWithSecretsSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/content-key-policies-get-with-secrets.json
     */
    /**
     * Sample code: Get an Content Key Policy with secrets.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getAnContentKeyPolicyWithSecrets(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .getPolicyPropertiesWithSecretsWithResponse(
                "contoso", "contosomedia", "PolicyWithMultipleOptions", Context.NONE);
    }
}