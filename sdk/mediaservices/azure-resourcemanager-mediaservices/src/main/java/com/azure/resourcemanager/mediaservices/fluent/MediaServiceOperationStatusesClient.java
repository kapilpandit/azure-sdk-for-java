// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.MediaServiceOperationStatusInner;

/** An instance of this class provides access to all the operations defined in MediaServiceOperationStatusesClient. */
public interface MediaServiceOperationStatusesClient {
    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceOperationStatusInner get(String locationName, String operationId);

    /**
     * Get media service operation status.
     *
     * @param locationName Location name.
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MediaServiceOperationStatusInner> getWithResponse(
        String locationName, String operationId, Context context);
}
