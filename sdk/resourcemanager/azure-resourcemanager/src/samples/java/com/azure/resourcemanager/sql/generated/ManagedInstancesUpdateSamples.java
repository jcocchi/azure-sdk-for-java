// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.BackupStorageRedundancy;
import com.azure.resourcemanager.sql.models.ManagedInstanceLicenseType;
import com.azure.resourcemanager.sql.models.ManagedInstanceProxyOverride;
import com.azure.resourcemanager.sql.models.ManagedInstanceUpdate;
import com.azure.resourcemanager.sql.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for ManagedInstances Update. */
public final class ManagedInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceUpdateMin.json
     */
    /**
     * Sample code: Update managed instance with minimal properties.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateManagedInstanceWithMinimalProperties(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstances()
            .update(
                "testrg",
                "testinstance",
                new ManagedInstanceUpdate().withTags(mapOf("tagKey1", "TagValue1")),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceUpdateMax.json
     */
    /**
     * Sample code: Update managed instance with all properties.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateManagedInstanceWithAllProperties(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstances()
            .update(
                "testrg",
                "testinstance",
                new ManagedInstanceUpdate()
                    .withSku(new Sku().withName("GP_Gen4").withTier("GeneralPurpose").withCapacity(8))
                    .withTags(mapOf("tagKey1", "TagValue1"))
                    .withAdministratorLogin("dummylogin")
                    .withAdministratorLoginPassword("PLACEHOLDER")
                    .withLicenseType(ManagedInstanceLicenseType.BASE_PRICE)
                    .withVCores(8)
                    .withStorageSizeInGB(448)
                    .withCollation("SQL_Latin1_General_CP1_CI_AS")
                    .withPublicDataEndpointEnabled(false)
                    .withProxyOverride(ManagedInstanceProxyOverride.REDIRECT)
                    .withMaintenanceConfigurationId(
                        "/subscriptions/20D7082A-0FC7-4468-82BD-542694D5042B/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_JapanEast_MI_1")
                    .withMinimalTlsVersion("1.2")
                    .withRequestedBackupStorageRedundancy(BackupStorageRedundancy.GEO),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedInstanceRemoveMaintenanceConfiguration.json
     */
    /**
     * Sample code: Remove maintenance policy from managed instance (select default maintenance policy).
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void removeMaintenancePolicyFromManagedInstanceSelectDefaultMaintenancePolicy(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstances()
            .update(
                "testrg",
                "testinstance",
                new ManagedInstanceUpdate()
                    .withMaintenanceConfigurationId(
                        "/subscriptions/20d7082a-0fc7-4468-82bd-542694d5042b/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_Default"),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
