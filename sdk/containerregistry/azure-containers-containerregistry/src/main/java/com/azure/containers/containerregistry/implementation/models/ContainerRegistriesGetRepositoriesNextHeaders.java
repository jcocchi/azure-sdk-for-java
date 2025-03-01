// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistriesGetRepositoriesNextHeaders model. */
@Fluent
public final class ContainerRegistriesGetRepositoriesNextHeaders {
    /*
     * The Link property.
     */
    @JsonProperty(value = "Link")
    private String link;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of ContainerRegistriesGetRepositoriesNextHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public ContainerRegistriesGetRepositoriesNextHeaders(HttpHeaders rawHeaders) {
        this.link = rawHeaders.getValue("Link");
    }

    /**
     * Get the link property: The Link property.
     *
     * @return the link value.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Set the link property: The Link property.
     *
     * @param link the link value to set.
     * @return the ContainerRegistriesGetRepositoriesNextHeaders object itself.
     */
    public ContainerRegistriesGetRepositoriesNextHeaders setLink(String link) {
        this.link = link;
        return this;
    }
}
