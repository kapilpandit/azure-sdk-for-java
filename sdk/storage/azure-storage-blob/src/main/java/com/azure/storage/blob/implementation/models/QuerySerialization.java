// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The QuerySerialization model. */
@JacksonXmlRootElement(localName = "QuerySerialization")
@Fluent
public final class QuerySerialization {
    /*
     * The Format property.
     */
    @JsonProperty(value = "Format", required = true)
    private QueryFormat format;

    /** Creates an instance of QuerySerialization class. */
    public QuerySerialization() {}

    /**
     * Get the format property: The Format property.
     *
     * @return the format value.
     */
    public QueryFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The Format property.
     *
     * @param format the format value to set.
     * @return the QuerySerialization object itself.
     */
    public QuerySerialization setFormat(QueryFormat format) {
        this.format = format;
        return this;
    }
}
