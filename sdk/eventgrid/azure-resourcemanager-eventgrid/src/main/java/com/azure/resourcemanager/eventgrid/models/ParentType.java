// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ParentType. */
public final class ParentType extends ExpandableStringEnum<ParentType> {
    /** Static value topics for ParentType. */
    public static final ParentType TOPICS = fromString("topics");

    /** Static value domains for ParentType. */
    public static final ParentType DOMAINS = fromString("domains");

    /** Static value partnerNamespaces for ParentType. */
    public static final ParentType PARTNER_NAMESPACES = fromString("partnerNamespaces");

    /**
     * Creates or finds a ParentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ParentType.
     */
    @JsonCreator
    public static ParentType fromString(String name) {
        return fromString(name, ParentType.class);
    }

    /** @return known ParentType values. */
    public static Collection<ParentType> values() {
        return values(ParentType.class);
    }
}