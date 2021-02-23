// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RedisEnterprises. */
public interface RedisEnterprises {
    /**
     * Deletes a RedisEnterprise cache cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes a RedisEnterprise cache cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets information about a RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a RedisEnterprise cluster.
     */
    Cluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Gets information about a RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a RedisEnterprise cluster.
     */
    Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Lists all RedisEnterprise clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list-all operation.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all RedisEnterprise clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list-all operation.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all RedisEnterprise clusters in the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RedisEnterprise clusters in the specified subscription.
     */
    PagedIterable<Cluster> list();

    /**
     * Gets all RedisEnterprise clusters in the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RedisEnterprise clusters in the specified subscription.
     */
    PagedIterable<Cluster> list(Context context);

    /**
     * Gets information about a RedisEnterprise cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a RedisEnterprise cluster.
     */
    Cluster getById(String id);

    /**
     * Gets information about a RedisEnterprise cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a RedisEnterprise cluster.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a RedisEnterprise cache cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a RedisEnterprise cache cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Cluster resource.
     *
     * @param name resource name.
     * @return the first stage of the new Cluster definition.
     */
    Cluster.DefinitionStages.Blank define(String name);
}
