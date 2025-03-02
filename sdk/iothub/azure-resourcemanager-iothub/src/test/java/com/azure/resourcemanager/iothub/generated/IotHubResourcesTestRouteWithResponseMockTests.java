// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.iothub.IotHubManager;
import com.azure.resourcemanager.iothub.models.RouteProperties;
import com.azure.resourcemanager.iothub.models.RoutingMessage;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import com.azure.resourcemanager.iothub.models.RoutingTwin;
import com.azure.resourcemanager.iothub.models.RoutingTwinProperties;
import com.azure.resourcemanager.iothub.models.TestResultStatus;
import com.azure.resourcemanager.iothub.models.TestRouteInput;
import com.azure.resourcemanager.iothub.models.TestRouteResult;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IotHubResourcesTestRouteWithResponseMockTests {
    @Test
    public void testTestRouteWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{\"result\":\"undefined\",\"details\":{\"compilationErrors\":[]}}";

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

        IotHubManager manager =
            IotHubManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        TestRouteResult response =
            manager
                .iotHubResources()
                .testRouteWithResponse(
                    "byqunyow",
                    "wlmdjrkv",
                    new TestRouteInput()
                        .withMessage(
                            new RoutingMessage()
                                .withBody("vfvpdbodaciz")
                                .withAppProperties(mapOf("hvxndzwmkrefajpj", "lhkrribdeibqipqk"))
                                .withSystemProperties(mapOf("b", "kqnyh", "jivfxzsjabib", "j")))
                        .withRoute(
                            new RouteProperties()
                                .withName("ystawfsdjpvkvp")
                                .withSource(RoutingSource.DIGITAL_TWIN_CHANGE_EVENTS)
                                .withCondition("bkzbzkd")
                                .withEndpointNames(Arrays.asList("cjabudurgkakmo"))
                                .withIsEnabled(true))
                        .withTwin(
                            new RoutingTwin()
                                .withTags("datajk")
                                .withProperties(
                                    new RoutingTwinProperties()
                                        .withDesired("datahmouwqlgzrfze")
                                        .withReported("dataebizikayuh"))),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(TestResultStatus.UNDEFINED, response.result());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
