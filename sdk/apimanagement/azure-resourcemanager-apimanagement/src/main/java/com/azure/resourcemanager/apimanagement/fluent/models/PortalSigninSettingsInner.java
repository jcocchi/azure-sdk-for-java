// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sign-In settings for the Developer Portal. */
@Fluent
public final class PortalSigninSettingsInner extends ProxyResource {
    /*
     * Sign-in settings contract properties.
     */
    @JsonProperty(value = "properties")
    private PortalSigninSettingProperties innerProperties;

    /**
     * Get the innerProperties property: Sign-in settings contract properties.
     *
     * @return the innerProperties value.
     */
    private PortalSigninSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabled property: Redirect Anonymous users to the Sign-In page.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Redirect Anonymous users to the Sign-In page.
     *
     * @param enabled the enabled value to set.
     * @return the PortalSigninSettingsInner object itself.
     */
    public PortalSigninSettingsInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalSigninSettingProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
