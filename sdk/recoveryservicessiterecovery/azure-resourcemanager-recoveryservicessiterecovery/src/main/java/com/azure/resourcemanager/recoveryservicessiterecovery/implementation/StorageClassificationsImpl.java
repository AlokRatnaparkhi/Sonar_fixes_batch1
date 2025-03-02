// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.StorageClassificationsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.StorageClassificationInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassification;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassifications;

public final class StorageClassificationsImpl implements StorageClassifications {
    private static final ClientLogger LOGGER = new ClientLogger(StorageClassificationsImpl.class);

    private final StorageClassificationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public StorageClassificationsImpl(
        StorageClassificationsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StorageClassification> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName) {
        PagedIterable<StorageClassificationInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName);
        return Utils.mapPage(inner, inner1 -> new StorageClassificationImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageClassification> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        PagedIterable<StorageClassificationInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName, context);
        return Utils.mapPage(inner, inner1 -> new StorageClassificationImpl(inner1, this.manager()));
    }

    public Response<StorageClassification> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String storageClassificationName,
        Context context) {
        Response<StorageClassificationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceName, resourceGroupName, fabricName, storageClassificationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageClassificationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StorageClassification get(
        String resourceName, String resourceGroupName, String fabricName, String storageClassificationName) {
        StorageClassificationInner inner =
            this.serviceClient().get(resourceName, resourceGroupName, fabricName, storageClassificationName);
        if (inner != null) {
            return new StorageClassificationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<StorageClassification> list(String resourceName, String resourceGroupName) {
        PagedIterable<StorageClassificationInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new StorageClassificationImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageClassification> list(String resourceName, String resourceGroupName, Context context) {
        PagedIterable<StorageClassificationInner> inner =
            this.serviceClient().list(resourceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new StorageClassificationImpl(inner1, this.manager()));
    }

    private StorageClassificationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
