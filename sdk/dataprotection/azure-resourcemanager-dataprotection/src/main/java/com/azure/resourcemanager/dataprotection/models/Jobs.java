// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Returns list of jobs belonging to a backup vault.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureBackupJobResource> list(String resourceGroupName, String vaultName);

    /**
     * Returns list of jobs belonging to a backup vault.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AzureBackup Job resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AzureBackupJobResource> list(String resourceGroupName, String vaultName, Context context);

    /**
     * Gets a job with id in a backup vault.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param jobId The Job ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job with id in a backup vault along with {@link Response}.
     */
    Response<AzureBackupJobResource> getWithResponse(
        String resourceGroupName, String vaultName, String jobId, Context context);

    /**
     * Gets a job with id in a backup vault.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param jobId The Job ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job with id in a backup vault.
     */
    AzureBackupJobResource get(String resourceGroupName, String vaultName, String jobId);
}
