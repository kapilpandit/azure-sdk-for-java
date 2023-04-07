// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/** Font weight. */
public final class FontWeight extends ExpandableStringEnum<FontWeight> {
    /** Static value normal for FontWeight. */
    public static final FontWeight NORMAL = fromString("normal");

    /** Static value bold for FontWeight. */
    public static final FontWeight BOLD = fromString("bold");

    /**
     * Creates a new instance of FontWeight value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FontWeight() {}

    /**
     * Creates or finds a FontWeight from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FontWeight.
     */
    public static FontWeight fromString(String name) {
        return fromString(name, FontWeight.class);
    }

    /**
     * Gets known FontWeight values.
     *
     * @return known FontWeight values.
     */
    public static Collection<FontWeight> values() {
        return values(FontWeight.class);
    }
}
