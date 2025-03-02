// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the event type. */
@Fluent
public final class EventTypeProperties {
    /*
     * Display name of the event type.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Description of the event type.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Url of the schema for this event type.
     */
    @JsonProperty(value = "schemaUrl")
    private String schemaUrl;

    /*
     * IsInDefaultSet flag of the event type.
     */
    @JsonProperty(value = "isInDefaultSet")
    private Boolean isInDefaultSet;

    /** Creates an instance of EventTypeProperties class. */
    public EventTypeProperties() {
    }

    /**
     * Get the displayName property: Display name of the event type.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the event type.
     *
     * @param displayName the displayName value to set.
     * @return the EventTypeProperties object itself.
     */
    public EventTypeProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Description of the event type.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the event type.
     *
     * @param description the description value to set.
     * @return the EventTypeProperties object itself.
     */
    public EventTypeProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the schemaUrl property: Url of the schema for this event type.
     *
     * @return the schemaUrl value.
     */
    public String schemaUrl() {
        return this.schemaUrl;
    }

    /**
     * Set the schemaUrl property: Url of the schema for this event type.
     *
     * @param schemaUrl the schemaUrl value to set.
     * @return the EventTypeProperties object itself.
     */
    public EventTypeProperties withSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }

    /**
     * Get the isInDefaultSet property: IsInDefaultSet flag of the event type.
     *
     * @return the isInDefaultSet value.
     */
    public Boolean isInDefaultSet() {
        return this.isInDefaultSet;
    }

    /**
     * Set the isInDefaultSet property: IsInDefaultSet flag of the event type.
     *
     * @param isInDefaultSet the isInDefaultSet value to set.
     * @return the EventTypeProperties object itself.
     */
    public EventTypeProperties withIsInDefaultSet(Boolean isInDefaultSet) {
        this.isInDefaultSet = isInDefaultSet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
