// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for ApiOperation ListByApi. */
public final class ApiOperationListByApiSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementListApiOperations.json
     */
    /**
     * Sample code: ApiManagementListApiOperations.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListApiOperations(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiOperations()
            .listByApi("rg1", "apimService1", "57d2ef278aa04f0888cba3f3", null, null, null, null, Context.NONE);
    }
}