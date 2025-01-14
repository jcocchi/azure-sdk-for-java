// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.AcceptedAudiences;
import com.azure.resourcemanager.kusto.models.AzureSku;
import com.azure.resourcemanager.kusto.models.AzureSkuName;
import com.azure.resourcemanager.kusto.models.AzureSkuTier;
import com.azure.resourcemanager.kusto.models.ClusterNetworkAccessFlag;
import com.azure.resourcemanager.kusto.models.ClusterUpdate;
import com.azure.resourcemanager.kusto.models.EngineType;
import com.azure.resourcemanager.kusto.models.Identity;
import com.azure.resourcemanager.kusto.models.IdentityType;
import com.azure.resourcemanager.kusto.models.IdentityUserAssignedIdentities;
import com.azure.resourcemanager.kusto.models.KeyVaultProperties;
import com.azure.resourcemanager.kusto.models.OptimizedAutoscale;
import com.azure.resourcemanager.kusto.models.PublicIpType;
import com.azure.resourcemanager.kusto.models.PublicNetworkAccess;
import com.azure.resourcemanager.kusto.models.TrustedExternalTenant;
import com.azure.resourcemanager.kusto.models.VirtualNetworkConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterUpdateTests {
    @Test
    public void testDeserialize() {
        ClusterUpdate model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"klj\":\"rzafbljjgpbtoqcj\",\"qajzyulpkudjkr\":\"vbqid\"},\"location\":\"hbzhfepg\",\"sku\":{\"name\":\"Standard_E8s_v4+1TB_PS\",\"capacity\":132755205,\"tier\":\"Basic\"},\"identity\":{\"principalId\":\"c\",\"tenantId\":\"c\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"onpimexgstxg\":{\"principalId\":\"hhbcsglummajtjao\",\"clientId\":\"obnbdxkqpxokaj\"},\"zaqsqsycbkbfk\":{\"principalId\":\"odgmaajrmvdjwz\",\"clientId\":\"ovmclwhijcoejct\"},\"c\":{\"principalId\":\"kdkexxp\",\"clientId\":\"fmxa\"}}},\"properties\":{\"state\":\"Stopping\",\"provisioningState\":\"Creating\",\"uri\":\"ocjjxhvpmouexh\",\"dataIngestionUri\":\"xibqeojnx\",\"stateReason\":\"zvddntwndeicbtwn\",\"trustedExternalTenants\":[{\"value\":\"qvuhrhcffcyddglm\"},{\"value\":\"hjq\"}],\"optimizedAutoscale\":{\"version\":1616692109,\"isEnabled\":true,\"minimum\":1725264760,\"maximum\":920917148},\"enableDiskEncryption\":false,\"enableStreamingIngest\":true,\"virtualNetworkConfiguration\":{\"subnetId\":\"iwqvhkh\",\"enginePublicIpId\":\"xuigdtopbobj\",\"dataManagementPublicIpId\":\"ghmewuam\"},\"keyVaultProperties\":{\"keyName\":\"rzayv\",\"keyVersion\":\"pgvdf\",\"keyVaultUri\":\"otkftutqxlngx\",\"userIdentity\":\"fgugnxkrxdqmid\"},\"enablePurge\":false,\"languageExtensions\":{\"value\":[]},\"enableDoubleEncryption\":true,\"publicNetworkAccess\":\"Enabled\",\"allowedIpRangeList\":[\"jybige\",\"oqfbowskanyk\",\"zlcuiywgqywgndrv\",\"nhzgpphrcgyn\"],\"engineType\":\"V3\",\"acceptedAudiences\":[{\"value\":\"fvm\"},{\"value\":\"oo\"}],\"enableAutoStop\":true,\"restrictOutboundNetworkAccess\":\"Enabled\",\"allowedFqdnList\":[\"gbmqjqabcypmiv\"],\"publicIPType\":\"IPv4\",\"virtualClusterGraduationProperties\":\"uvcc\",\"privateEndpointConnections\":[{\"id\":\"bacfionlebxetq\",\"name\":\"tzxdpnqbqqwx\",\"type\":\"jfeallnwsub\"},{\"id\":\"jampmngnzscxaqw\",\"name\":\"ochcbonqvpkvl\",\"type\":\"xnj\"},{\"id\":\"eipheoflokeyy\",\"name\":\"enjbdlwtgrhp\",\"type\":\"jp\"},{\"id\":\"asxazjpqyegualhb\",\"name\":\"xhejjzzvdud\",\"type\":\"wdslfhotwmcy\"}]},\"id\":\"pwlbjnpg\",\"name\":\"cftadeh\",\"type\":\"nltyfsoppusuesnz\"}")
                .toObject(ClusterUpdate.class);
        Assertions.assertEquals("rzafbljjgpbtoqcj", model.tags().get("klj"));
        Assertions.assertEquals("hbzhfepg", model.location());
        Assertions.assertEquals(AzureSkuName.STANDARD_E8S_V4_1TB_PS, model.sku().name());
        Assertions.assertEquals(132755205, model.sku().capacity());
        Assertions.assertEquals(AzureSkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("qvuhrhcffcyddglm", model.trustedExternalTenants().get(0).value());
        Assertions.assertEquals(1616692109, model.optimizedAutoscale().version());
        Assertions.assertEquals(true, model.optimizedAutoscale().isEnabled());
        Assertions.assertEquals(1725264760, model.optimizedAutoscale().minimum());
        Assertions.assertEquals(920917148, model.optimizedAutoscale().maximum());
        Assertions.assertEquals(false, model.enableDiskEncryption());
        Assertions.assertEquals(true, model.enableStreamingIngest());
        Assertions.assertEquals("iwqvhkh", model.virtualNetworkConfiguration().subnetId());
        Assertions.assertEquals("xuigdtopbobj", model.virtualNetworkConfiguration().enginePublicIpId());
        Assertions.assertEquals("ghmewuam", model.virtualNetworkConfiguration().dataManagementPublicIpId());
        Assertions.assertEquals("rzayv", model.keyVaultProperties().keyName());
        Assertions.assertEquals("pgvdf", model.keyVaultProperties().keyVersion());
        Assertions.assertEquals("otkftutqxlngx", model.keyVaultProperties().keyVaultUri());
        Assertions.assertEquals("fgugnxkrxdqmid", model.keyVaultProperties().userIdentity());
        Assertions.assertEquals(false, model.enablePurge());
        Assertions.assertEquals(true, model.enableDoubleEncryption());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals("jybige", model.allowedIpRangeList().get(0));
        Assertions.assertEquals(EngineType.V3, model.engineType());
        Assertions.assertEquals("fvm", model.acceptedAudiences().get(0).value());
        Assertions.assertEquals(true, model.enableAutoStop());
        Assertions.assertEquals(ClusterNetworkAccessFlag.ENABLED, model.restrictOutboundNetworkAccess());
        Assertions.assertEquals("gbmqjqabcypmiv", model.allowedFqdnList().get(0));
        Assertions.assertEquals(PublicIpType.IPV4, model.publicIpType());
        Assertions.assertEquals("uvcc", model.virtualClusterGraduationProperties());
    }

    @Test
    public void testSerialize() {
        ClusterUpdate model =
            new ClusterUpdate()
                .withTags(mapOf("klj", "rzafbljjgpbtoqcj", "qajzyulpkudjkr", "vbqid"))
                .withLocation("hbzhfepg")
                .withSku(
                    new AzureSku()
                        .withName(AzureSkuName.STANDARD_E8S_V4_1TB_PS)
                        .withCapacity(132755205)
                        .withTier(AzureSkuTier.BASIC))
                .withIdentity(
                    new Identity()
                        .withType(IdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "onpimexgstxg",
                                new IdentityUserAssignedIdentities(),
                                "zaqsqsycbkbfk",
                                new IdentityUserAssignedIdentities(),
                                "c",
                                new IdentityUserAssignedIdentities())))
                .withTrustedExternalTenants(
                    Arrays
                        .asList(
                            new TrustedExternalTenant().withValue("qvuhrhcffcyddglm"),
                            new TrustedExternalTenant().withValue("hjq")))
                .withOptimizedAutoscale(
                    new OptimizedAutoscale()
                        .withVersion(1616692109)
                        .withIsEnabled(true)
                        .withMinimum(1725264760)
                        .withMaximum(920917148))
                .withEnableDiskEncryption(false)
                .withEnableStreamingIngest(true)
                .withVirtualNetworkConfiguration(
                    new VirtualNetworkConfiguration()
                        .withSubnetId("iwqvhkh")
                        .withEnginePublicIpId("xuigdtopbobj")
                        .withDataManagementPublicIpId("ghmewuam"))
                .withKeyVaultProperties(
                    new KeyVaultProperties()
                        .withKeyName("rzayv")
                        .withKeyVersion("pgvdf")
                        .withKeyVaultUri("otkftutqxlngx")
                        .withUserIdentity("fgugnxkrxdqmid"))
                .withEnablePurge(false)
                .withEnableDoubleEncryption(true)
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                .withAllowedIpRangeList(Arrays.asList("jybige", "oqfbowskanyk", "zlcuiywgqywgndrv", "nhzgpphrcgyn"))
                .withEngineType(EngineType.V3)
                .withAcceptedAudiences(
                    Arrays.asList(new AcceptedAudiences().withValue("fvm"), new AcceptedAudiences().withValue("oo")))
                .withEnableAutoStop(true)
                .withRestrictOutboundNetworkAccess(ClusterNetworkAccessFlag.ENABLED)
                .withAllowedFqdnList(Arrays.asList("gbmqjqabcypmiv"))
                .withPublicIpType(PublicIpType.IPV4)
                .withVirtualClusterGraduationProperties("uvcc");
        model = BinaryData.fromObject(model).toObject(ClusterUpdate.class);
        Assertions.assertEquals("rzafbljjgpbtoqcj", model.tags().get("klj"));
        Assertions.assertEquals("hbzhfepg", model.location());
        Assertions.assertEquals(AzureSkuName.STANDARD_E8S_V4_1TB_PS, model.sku().name());
        Assertions.assertEquals(132755205, model.sku().capacity());
        Assertions.assertEquals(AzureSkuTier.BASIC, model.sku().tier());
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("qvuhrhcffcyddglm", model.trustedExternalTenants().get(0).value());
        Assertions.assertEquals(1616692109, model.optimizedAutoscale().version());
        Assertions.assertEquals(true, model.optimizedAutoscale().isEnabled());
        Assertions.assertEquals(1725264760, model.optimizedAutoscale().minimum());
        Assertions.assertEquals(920917148, model.optimizedAutoscale().maximum());
        Assertions.assertEquals(false, model.enableDiskEncryption());
        Assertions.assertEquals(true, model.enableStreamingIngest());
        Assertions.assertEquals("iwqvhkh", model.virtualNetworkConfiguration().subnetId());
        Assertions.assertEquals("xuigdtopbobj", model.virtualNetworkConfiguration().enginePublicIpId());
        Assertions.assertEquals("ghmewuam", model.virtualNetworkConfiguration().dataManagementPublicIpId());
        Assertions.assertEquals("rzayv", model.keyVaultProperties().keyName());
        Assertions.assertEquals("pgvdf", model.keyVaultProperties().keyVersion());
        Assertions.assertEquals("otkftutqxlngx", model.keyVaultProperties().keyVaultUri());
        Assertions.assertEquals("fgugnxkrxdqmid", model.keyVaultProperties().userIdentity());
        Assertions.assertEquals(false, model.enablePurge());
        Assertions.assertEquals(true, model.enableDoubleEncryption());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals("jybige", model.allowedIpRangeList().get(0));
        Assertions.assertEquals(EngineType.V3, model.engineType());
        Assertions.assertEquals("fvm", model.acceptedAudiences().get(0).value());
        Assertions.assertEquals(true, model.enableAutoStop());
        Assertions.assertEquals(ClusterNetworkAccessFlag.ENABLED, model.restrictOutboundNetworkAccess());
        Assertions.assertEquals("gbmqjqabcypmiv", model.allowedFqdnList().get(0));
        Assertions.assertEquals(PublicIpType.IPV4, model.publicIpType());
        Assertions.assertEquals("uvcc", model.virtualClusterGraduationProperties());
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
