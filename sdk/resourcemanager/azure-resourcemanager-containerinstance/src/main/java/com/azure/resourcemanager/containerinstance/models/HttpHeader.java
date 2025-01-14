// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HTTP header. */
@Fluent
public final class HttpHeader {
    /*
     * The header name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The header value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The header name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The header name.
     *
     * @param name the name value to set.
     * @return the HttpHeader object itself.
     */
    public HttpHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The header value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The header value.
     *
     * @param value the value value to set.
     * @return the HttpHeader object itself.
     */
    public HttpHeader withValue(String value) {
        this.value = value;
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
