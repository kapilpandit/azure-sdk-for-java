// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.DeviceInsight;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CatalogsListDeviceInsightsMockTests {
    @Test
    public void testListDeviceInsights() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"deviceId\":\"ztfolhbnxk\",\"description\":\"alaulppggdtpnapn\",\"startTimestampUtc\":\"2021-01-27T00:10:34Z\",\"endTimestampUtc\":\"2021-04-06T21:45:28Z\",\"eventCategory\":\"opuhpig\",\"eventClass\":\"pgylg\",\"eventType\":\"git\",\"eventCount\":1973221194}]}";

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

        AzureSphereManager manager =
            AzureSphereManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DeviceInsight> response =
            manager
                .catalogs()
                .listDeviceInsights(
                    "sxyawjoyaqcs",
                    "yjpkiidzyexz",
                    "eli",
                    1911330715,
                    462425094,
                    705550222,
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ztfolhbnxk", response.iterator().next().deviceId());
        Assertions.assertEquals("alaulppggdtpnapn", response.iterator().next().description());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-01-27T00:10:34Z"), response.iterator().next().startTimestampUtc());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-04-06T21:45:28Z"), response.iterator().next().endTimestampUtc());
        Assertions.assertEquals("opuhpig", response.iterator().next().eventCategory());
        Assertions.assertEquals("pgylg", response.iterator().next().eventClass());
        Assertions.assertEquals("git", response.iterator().next().eventType());
        Assertions.assertEquals(1973221194, response.iterator().next().eventCount());
    }
}
