// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSubHubs Get. */
public final class WebPubSubHubsGetSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2023-02-01/examples/WebPubSubHubs_Get.json
     */
    /**
     * Sample code: WebPubSubHubs_Get.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubHubsGet(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager
            .webPubSubHubs()
            .getWithResponse("exampleHub", "myResourceGroup", "myWebPubSubService", com.azure.core.util.Context.NONE);
    }
}
