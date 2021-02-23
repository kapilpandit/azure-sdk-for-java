// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TlsVersion. */
public final class TlsVersion extends ExpandableStringEnum<TlsVersion> {
    /** Static value 1.0 for TlsVersion. */
    public static final TlsVersion ONE_ZERO = fromString("1.0");

    /** Static value 1.1 for TlsVersion. */
    public static final TlsVersion ONE_ONE = fromString("1.1");

    /** Static value 1.2 for TlsVersion. */
    public static final TlsVersion ONE_TWO = fromString("1.2");

    /**
     * Creates or finds a TlsVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TlsVersion.
     */
    @JsonCreator
    public static TlsVersion fromString(String name) {
        return fromString(name, TlsVersion.class);
    }

    /** @return known TlsVersion values. */
    public static Collection<TlsVersion> values() {
        return values(TlsVersion.class);
    }
}
