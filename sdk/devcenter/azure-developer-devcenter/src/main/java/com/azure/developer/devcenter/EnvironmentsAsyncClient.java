// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import com.azure.developer.devcenter.implementation.EnvironmentsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous DevCenterClient type. */
@ServiceClient(builder = EnvironmentsClientBuilder.class, isAsync = true)
public final class EnvironmentsAsyncClient {
    @Generated private final EnvironmentsImpl serviceClient;

    /**
     * Initializes an instance of EnvironmentsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    EnvironmentsAsyncClient(EnvironmentsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists the environments for a project.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             description: String (Optional)
     *             catalogName: String (Optional)
     *             catalogItemName: String (Optional)
     *             parameters: Object (Optional)
     *             scheduledTasks (Optional): {
     *                 String (Optional): {
     *                     type: String(AutoExpire) (Required)
     *                     enabled: String(Enabled/Disabled) (Optional)
     *                     startTime: OffsetDateTime (Required)
     *                 }
     *             }
     *             tags (Optional): {
     *                 String: String (Optional)
     *             }
     *             name: String (Optional)
     *             environmentType: String (Required)
     *             owner: String (Optional)
     *             provisioningState: String (Optional)
     *             resourceGroupId: String (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the environment list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listEnvironments(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.listEnvironmentsAsync(projectName, requestOptions);
    }

    /**
     * Lists the environments for a project and user.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             description: String (Optional)
     *             catalogName: String (Optional)
     *             catalogItemName: String (Optional)
     *             parameters: Object (Optional)
     *             scheduledTasks (Optional): {
     *                 String (Optional): {
     *                     type: String(AutoExpire) (Required)
     *                     enabled: String(Enabled/Disabled) (Optional)
     *                     startTime: OffsetDateTime (Required)
     *                 }
     *             }
     *             tags (Optional): {
     *                 String: String (Optional)
     *             }
     *             name: String (Optional)
     *             environmentType: String (Required)
     *             owner: String (Optional)
     *             provisioningState: String (Optional)
     *             resourceGroupId: String (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the environment list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listEnvironmentsByUser(
            String projectName, String userId, RequestOptions requestOptions) {
        return this.serviceClient.listEnvironmentsByUserAsync(projectName, userId, requestOptions);
    }

    /**
     * Gets an environment.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     catalogName: String (Optional)
     *     catalogItemName: String (Optional)
     *     parameters: Object (Optional)
     *     scheduledTasks (Optional): {
     *         String (Optional): {
     *             type: String(AutoExpire) (Required)
     *             enabled: String(Enabled/Disabled) (Optional)
     *             startTime: OffsetDateTime (Required)
     *         }
     *     }
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     *     name: String (Optional)
     *     environmentType: String (Required)
     *     owner: String (Optional)
     *     provisioningState: String (Optional)
     *     resourceGroupId: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return an environment along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getEnvironmentByUserWithResponse(
            String projectName, String userId, String environmentName, RequestOptions requestOptions) {
        return this.serviceClient.getEnvironmentByUserWithResponseAsync(
                projectName, userId, environmentName, requestOptions);
    }

    /**
     * Creates or updates an environment.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     catalogName: String (Optional)
     *     catalogItemName: String (Optional)
     *     parameters: Object (Optional)
     *     scheduledTasks (Optional): {
     *         String (Optional): {
     *             type: String(AutoExpire) (Required)
     *             enabled: String(Enabled/Disabled) (Optional)
     *             startTime: OffsetDateTime (Required)
     *         }
     *     }
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     *     name: String (Optional)
     *     environmentType: String (Required)
     *     owner: String (Optional)
     *     provisioningState: String (Optional)
     *     resourceGroupId: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     catalogName: String (Optional)
     *     catalogItemName: String (Optional)
     *     parameters: Object (Optional)
     *     scheduledTasks (Optional): {
     *         String (Optional): {
     *             type: String(AutoExpire) (Required)
     *             enabled: String(Enabled/Disabled) (Optional)
     *             startTime: OffsetDateTime (Required)
     *         }
     *     }
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     *     name: String (Optional)
     *     environmentType: String (Required)
     *     owner: String (Optional)
     *     provisioningState: String (Optional)
     *     resourceGroupId: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param body Represents a environment.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of properties of an environment.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateOrUpdateEnvironment(
            String projectName, String userId, String environmentName, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateOrUpdateEnvironmentAsync(
                projectName, userId, environmentName, body, requestOptions);
    }

    /**
     * Partially updates an environment.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     catalogName: String (Optional)
     *     catalogItemName: String (Optional)
     *     parameters: Object (Optional)
     *     scheduledTasks (Optional): {
     *         String (Optional): {
     *             type: String(AutoExpire) (Required)
     *             enabled: String(Enabled/Disabled) (Optional)
     *             startTime: OffsetDateTime (Required)
     *         }
     *     }
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     description: String (Optional)
     *     catalogName: String (Optional)
     *     catalogItemName: String (Optional)
     *     parameters: Object (Optional)
     *     scheduledTasks (Optional): {
     *         String (Optional): {
     *             type: String(AutoExpire) (Required)
     *             enabled: String(Enabled/Disabled) (Optional)
     *             startTime: OffsetDateTime (Required)
     *         }
     *     }
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     *     name: String (Optional)
     *     environmentType: String (Required)
     *     owner: String (Optional)
     *     provisioningState: String (Optional)
     *     resourceGroupId: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param body Updatable environment properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return properties of an environment along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateEnvironmentWithResponse(
            String projectName, String userId, String environmentName, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.updateEnvironmentWithResponseAsync(
                projectName, userId, environmentName, body, requestOptions);
    }

    /**
     * Deletes an environment and all it's associated resources.
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteEnvironment(
            String projectName, String userId, String environmentName, RequestOptions requestOptions) {
        return this.serviceClient.beginDeleteEnvironmentAsync(projectName, userId, environmentName, requestOptions);
    }

    /**
     * Executes a deploy action.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     actionId: String (Required)
     *     parameters: Object (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param body Action properties overriding the environment's default values.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeployEnvironmentAction(
            String projectName, String userId, String environmentName, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.beginDeployEnvironmentActionAsync(
                projectName, userId, environmentName, body, requestOptions);
    }

    /**
     * Executes a delete action.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     actionId: String (Required)
     *     parameters: Object (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param body Action properties overriding the environment's default values.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDeleteEnvironmentAction(
            String projectName, String userId, String environmentName, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.beginDeleteEnvironmentActionAsync(
                projectName, userId, environmentName, body, requestOptions);
    }

    /**
     * Executes a custom action.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     actionId: String (Required)
     *     parameters: Object (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param body Action properties overriding the environment's default values.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCustomEnvironmentAction(
            String projectName, String userId, String environmentName, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.beginCustomEnvironmentActionAsync(
                projectName, userId, environmentName, body, requestOptions);
    }

    /**
     * Lists the artifacts for an environment.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             id: String (Optional)
     *             name: String (Optional)
     *             isDirectory: Boolean (Optional)
     *             downloadUri: String (Optional)
     *             fileSize: Float (Optional)
     *             createdTime: OffsetDateTime (Optional)
     *             lastModifiedTime: OffsetDateTime (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the artifact list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listArtifactsByEnvironment(
            String projectName, String userId, String environmentName, RequestOptions requestOptions) {
        return this.serviceClient.listArtifactsByEnvironmentAsync(projectName, userId, environmentName, requestOptions);
    }

    /**
     * Lists the artifacts for an environment at a specified path, or returns the file at the path.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             id: String (Optional)
     *             name: String (Optional)
     *             isDirectory: Boolean (Optional)
     *             downloadUri: String (Optional)
     *             fileSize: Float (Optional)
     *             createdTime: OffsetDateTime (Optional)
     *             lastModifiedTime: OffsetDateTime (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param userId The AAD object id of the user. If value is 'me', the identity is taken from the authentication
     *     context.
     * @param environmentName The name of the environment.
     * @param artifactPath The path of the artifact.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the artifact list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listArtifactsByEnvironmentAndPath(
            String projectName,
            String userId,
            String environmentName,
            String artifactPath,
            RequestOptions requestOptions) {
        return this.serviceClient.listArtifactsByEnvironmentAndPathAsync(
                projectName, userId, environmentName, artifactPath, requestOptions);
    }

    /**
     * Lists latest version of all catalog items available for a project.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             id: String (Optional)
     *             name: String (Optional)
     *             catalogName: String (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the catalog item list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listCatalogItems(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.listCatalogItemsAsync(projectName, requestOptions);
    }

    /**
     * Get a catalog item from a project.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     catalogName: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param catalogItemId The unique id of the catalog item.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a catalog item from a project along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCatalogItemWithResponse(
            String projectName, String catalogItemId, RequestOptions requestOptions) {
        return this.serviceClient.getCatalogItemWithResponseAsync(projectName, catalogItemId, requestOptions);
    }

    /**
     * List all versions of a catalog item from a project.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             catalogItemId: String (Optional)
     *             catalogItemName: String (Optional)
     *             catalogName: String (Optional)
     *             version: String (Optional)
     *             summary: String (Optional)
     *             description: String (Optional)
     *             templatePath: String (Optional)
     *             parametersSchema: String (Optional)
     *             parameters (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     name: String (Optional)
     *                     description: String (Optional)
     *                     default: Object (Optional)
     *                     type: String(array/boolean/integer/null/number/object/string) (Optional)
     *                     readOnly: Boolean (Optional)
     *                     required: Boolean (Optional)
     *                     allowed (Optional): [
     *                         Object (Optional)
     *                     ]
     *                 }
     *             ]
     *             actions (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     name: String (Optional)
     *                     description: String (Optional)
     *                     parametersSchema: String (Optional)
     *                     parameters (Optional): [
     *                         (recursive schema, see above)
     *                     ]
     *                     type: String(Custom/Deploy/Delete) (Optional)
     *                     typeName: String (Optional)
     *                     runner: String (Optional)
     *                 }
     *             ]
     *             runner: String (Optional)
     *             status: String(Enabled/Disabled) (Optional)
     *             eligibleForLatestVersion: Boolean (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param catalogItemId The unique id of the catalog item.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the catalog item list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listCatalogItemVersions(
            String projectName, String catalogItemId, RequestOptions requestOptions) {
        return this.serviceClient.listCatalogItemVersionsAsync(projectName, catalogItemId, requestOptions);
    }

    /**
     * Get a specific catalog item version from a project.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     catalogItemId: String (Optional)
     *     catalogItemName: String (Optional)
     *     catalogName: String (Optional)
     *     version: String (Optional)
     *     summary: String (Optional)
     *     description: String (Optional)
     *     templatePath: String (Optional)
     *     parametersSchema: String (Optional)
     *     parameters (Optional): [
     *          (Optional){
     *             id: String (Optional)
     *             name: String (Optional)
     *             description: String (Optional)
     *             default: Object (Optional)
     *             type: String(array/boolean/integer/null/number/object/string) (Optional)
     *             readOnly: Boolean (Optional)
     *             required: Boolean (Optional)
     *             allowed (Optional): [
     *                 Object (Optional)
     *             ]
     *         }
     *     ]
     *     actions (Optional): [
     *          (Optional){
     *             id: String (Optional)
     *             name: String (Optional)
     *             description: String (Optional)
     *             parametersSchema: String (Optional)
     *             parameters (Optional): [
     *                 (recursive schema, see above)
     *             ]
     *             type: String(Custom/Deploy/Delete) (Optional)
     *             typeName: String (Optional)
     *             runner: String (Optional)
     *         }
     *     ]
     *     runner: String (Optional)
     *     status: String(Enabled/Disabled) (Optional)
     *     eligibleForLatestVersion: Boolean (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param catalogItemId The unique id of the catalog item.
     * @param version The version of the catalog item.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specific catalog item version from a project along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCatalogItemVersionWithResponse(
            String projectName, String catalogItemId, String version, RequestOptions requestOptions) {
        return this.serviceClient.getCatalogItemVersionWithResponseAsync(
                projectName, catalogItemId, version, requestOptions);
    }

    /**
     * Lists all environment types configured for a project.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             name: String (Optional)
     *             deploymentTargetId: String (Optional)
     *             status: String(Enabled/Disabled) (Optional)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return result of the environment type list operation as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listEnvironmentTypes(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.listEnvironmentTypesAsync(projectName, requestOptions);
    }
}