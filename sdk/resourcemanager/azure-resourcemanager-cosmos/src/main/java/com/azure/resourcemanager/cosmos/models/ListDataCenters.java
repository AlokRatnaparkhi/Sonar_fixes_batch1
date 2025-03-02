// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.cosmos.fluent.models.DataCenterResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of managed Cassandra data centers and their properties. */
@Immutable
public final class ListDataCenters {
    /*
     * Container for array of data centers.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataCenterResourceInner> value;

    /** Creates an instance of ListDataCenters class. */
    public ListDataCenters() {
    }

    /**
     * Get the value property: Container for array of data centers.
     *
     * @return the value value.
     */
    public List<DataCenterResourceInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
