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

        String responseStr
            = "{\"value\":[{\"dataFlowName\":\"dijyfiabhepxqtk\",\"computeType\":\"lizno\",\"coreCount\":349109970,\"nodeCount\":1834406842,\"integrationRuntimeName\":\"qythsltodlvwbgbm\",\"sessionId\":\"trsxhiuhgvgno\",\"startTime\":\"sqf\",\"timeToLiveInMinutes\":1683333500,\"lastActivityTime\":\"ppwvieymkguvr\",\"\":{\"nelqcvmvpp\":\"dataproytd\",\"is\":\"datatsolxnhlrpsign\"}}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DataFlowDebugSessionInfo> response
            = manager.dataFlowDebugSessions().queryByFactory("ijlvkrnso", "oh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dijyfiabhepxqtk", response.iterator().next().dataFlowName());
        Assertions.assertEquals("lizno", response.iterator().next().computeType());
        Assertions.assertEquals(349109970, response.iterator().next().coreCount());
        Assertions.assertEquals(1834406842, response.iterator().next().nodeCount());
        Assertions.assertEquals("qythsltodlvwbgbm", response.iterator().next().integrationRuntimeName());
        Assertions.assertEquals("trsxhiuhgvgno", response.iterator().next().sessionId());
        Assertions.assertEquals("sqf", response.iterator().next().startTime());
        Assertions.assertEquals(1683333500, response.iterator().next().timeToLiveInMinutes());
        Assertions.assertEquals("ppwvieymkguvr", response.iterator().next().lastActivityTime());
    }
}
