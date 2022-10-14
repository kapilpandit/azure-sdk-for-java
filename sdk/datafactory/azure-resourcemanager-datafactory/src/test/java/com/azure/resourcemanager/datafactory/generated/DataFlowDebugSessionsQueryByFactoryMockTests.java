// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugSessionInfo;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DataFlowDebugSessionsQueryByFactoryMockTests {
    @Test
    public void testQueryByFactory() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"dataFlowName\":\"ymjzu\",\"computeType\":\"wmejjqhd\",\"coreCount\":1170654516,\"nodeCount\":393843397,\"integrationRuntimeName\":\"iyoo\",\"sessionId\":\"fozkbnz\",\"startTime\":\"ypfqpgaixw\",\"timeToLiveInMinutes\":1568423053,\"lastActivityTime\":\"kderf\",\"\":{}}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DataFactoryManager manager =
            DataFactoryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DataFlowDebugSessionInfo> response =
            manager.dataFlowDebugSessions().queryByFactory("ldsvc", "djiah", Context.NONE);

        Assertions.assertEquals("ymjzu", response.iterator().next().dataFlowName());
        Assertions.assertEquals("wmejjqhd", response.iterator().next().computeType());
        Assertions.assertEquals(1170654516, response.iterator().next().coreCount());
        Assertions.assertEquals(393843397, response.iterator().next().nodeCount());
        Assertions.assertEquals("iyoo", response.iterator().next().integrationRuntimeName());
        Assertions.assertEquals("fozkbnz", response.iterator().next().sessionId());
        Assertions.assertEquals("ypfqpgaixw", response.iterator().next().startTime());
        Assertions.assertEquals(1568423053, response.iterator().next().timeToLiveInMinutes());
        Assertions.assertEquals("kderf", response.iterator().next().lastActivityTime());
    }
}
