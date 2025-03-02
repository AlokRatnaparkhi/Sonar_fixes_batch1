// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.LocalizableStringInner;

/** An instance of this class provides access to all the operations defined in EventCategoriesClient. */
public interface EventCategoriesClient {
    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy as paginated
     *     response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LocalizableStringInner> listAsync();

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalizableStringInner> list();

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     *     includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LocalizableStringInner> list(Context context);
}
