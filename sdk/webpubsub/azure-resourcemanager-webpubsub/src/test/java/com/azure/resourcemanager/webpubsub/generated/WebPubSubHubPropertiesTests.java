// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventHandler;
import com.azure.resourcemanager.webpubsub.models.EventListener;
import com.azure.resourcemanager.webpubsub.models.EventListenerEndpoint;
import com.azure.resourcemanager.webpubsub.models.EventListenerFilter;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthSettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WebPubSubHubPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebPubSubHubProperties model =
            BinaryData
                .fromString(
                    "{\"eventHandlers\":[{\"urlTemplate\":\"napkteoellw\",\"userEventPattern\":\"fdygpfqbuaceopz\",\"systemEvents\":[\"hhuao\",\"ppcqeqxolz\",\"ahzxctobgbk\",\"moizpos\"],\"auth\":{\"type\":\"None\"}},{\"urlTemplate\":\"fbunrmfqjhhk\",\"userEventPattern\":\"pvjymjhxxjyng\",\"systemEvents\":[\"vkr\",\"swbxqz\"],\"auth\":{\"type\":\"ManagedIdentity\"}},{\"urlTemplate\":\"auvjfdxxivet\",\"userEventPattern\":\"cqaqtdoqmcbx\",\"systemEvents\":[\"xyslqbh\",\"fxoblytkb\"],\"auth\":{\"type\":\"ManagedIdentity\"}}],\"eventListeners\":[{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}],\"anonymousConnectPolicy\":\"bkrvrnsvshqj\"}")
                .toObject(WebPubSubHubProperties.class);
        Assertions.assertEquals("napkteoellw", model.eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("fdygpfqbuaceopz", model.eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("hhuao", model.eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, model.eventHandlers().get(0).auth().type());
        Assertions.assertEquals("bkrvrnsvshqj", model.anonymousConnectPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebPubSubHubProperties model =
            new WebPubSubHubProperties()
                .withEventHandlers(
                    Arrays
                        .asList(
                            new EventHandler()
                                .withUrlTemplate("napkteoellw")
                                .withUserEventPattern("fdygpfqbuaceopz")
                                .withSystemEvents(Arrays.asList("hhuao", "ppcqeqxolz", "ahzxctobgbk", "moizpos"))
                                .withAuth(new UpstreamAuthSettings().withType(UpstreamAuthType.NONE)),
                            new EventHandler()
                                .withUrlTemplate("fbunrmfqjhhk")
                                .withUserEventPattern("pvjymjhxxjyng")
                                .withSystemEvents(Arrays.asList("vkr", "swbxqz"))
                                .withAuth(new UpstreamAuthSettings().withType(UpstreamAuthType.MANAGED_IDENTITY)),
                            new EventHandler()
                                .withUrlTemplate("auvjfdxxivet")
                                .withUserEventPattern("cqaqtdoqmcbx")
                                .withSystemEvents(Arrays.asList("xyslqbh", "fxoblytkb"))
                                .withAuth(new UpstreamAuthSettings().withType(UpstreamAuthType.MANAGED_IDENTITY))))
                .withEventListeners(
                    Arrays
                        .asList(
                            new EventListener()
                                .withFilter(new EventListenerFilter())
                                .withEndpoint(new EventListenerEndpoint()),
                            new EventListener()
                                .withFilter(new EventListenerFilter())
                                .withEndpoint(new EventListenerEndpoint()),
                            new EventListener()
                                .withFilter(new EventListenerFilter())
                                .withEndpoint(new EventListenerEndpoint())))
                .withAnonymousConnectPolicy("bkrvrnsvshqj");
        model = BinaryData.fromObject(model).toObject(WebPubSubHubProperties.class);
        Assertions.assertEquals("napkteoellw", model.eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("fdygpfqbuaceopz", model.eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("hhuao", model.eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, model.eventHandlers().get(0).auth().type());
        Assertions.assertEquals("bkrvrnsvshqj", model.anonymousConnectPolicy());
    }
}
