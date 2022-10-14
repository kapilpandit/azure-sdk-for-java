// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.SharePointOnlineListDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The sharepoint online list resource dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SharePointOnlineListResource")
@Fluent
public final class SharePointOnlineListResourceDataset extends Dataset {
    /*
     * Sharepoint online list dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private SharePointOnlineListDatasetTypeProperties innerTypeProperties;

    /** Creates an instance of SharePointOnlineListResourceDataset class. */
    public SharePointOnlineListResourceDataset() {
    }

    /**
     * Get the innerTypeProperties property: Sharepoint online list dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private SharePointOnlineListDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharePointOnlineListResourceDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the listName property: The name of the SharePoint Online list. Type: string (or Expression with resultType
     * string).
     *
     * @return the listName value.
     */
    public Object listName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().listName();
    }

    /**
     * Set the listName property: The name of the SharePoint Online list. Type: string (or Expression with resultType
     * string).
     *
     * @param listName the listName value to set.
     * @return the SharePointOnlineListResourceDataset object itself.
     */
    public SharePointOnlineListResourceDataset withListName(Object listName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SharePointOnlineListDatasetTypeProperties();
        }
        this.innerTypeProperties().withListName(listName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
