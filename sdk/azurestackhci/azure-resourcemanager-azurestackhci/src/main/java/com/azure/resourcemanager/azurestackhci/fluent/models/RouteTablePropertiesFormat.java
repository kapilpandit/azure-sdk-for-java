// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestackhci.models.Route;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** RouteTablePropertiesFormat - Route Table resource. */
@Fluent
public final class RouteTablePropertiesFormat {
    /*
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "routes")
    private List<Route> routes;

    /** Creates an instance of RouteTablePropertiesFormat class. */
    public RouteTablePropertiesFormat() {
    }

    /**
     * Get the routes property: Collection of routes contained within a route table.
     *
     * @return the routes value.
     */
    public List<Route> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: Collection of routes contained within a route table.
     *
     * @param routes the routes value to set.
     * @return the RouteTablePropertiesFormat object itself.
     */
    public RouteTablePropertiesFormat withRoutes(List<Route> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}
