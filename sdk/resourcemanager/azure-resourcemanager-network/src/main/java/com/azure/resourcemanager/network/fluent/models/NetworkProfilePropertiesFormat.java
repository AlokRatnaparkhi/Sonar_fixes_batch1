// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ContainerNetworkInterface;
import com.azure.resourcemanager.network.models.ContainerNetworkInterfaceConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network profile properties. */
@Fluent
public final class NetworkProfilePropertiesFormat {
    /*
     * List of child container network interfaces.
     */
    @JsonProperty(value = "containerNetworkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<ContainerNetworkInterface> containerNetworkInterfaces;

    /*
     * List of chid container network interface configurations.
     */
    @JsonProperty(value = "containerNetworkInterfaceConfigurations")
    private List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations;

    /*
     * The resource GUID property of the network profile resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the network profile resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of NetworkProfilePropertiesFormat class. */
    public NetworkProfilePropertiesFormat() {
    }

    /**
     * Get the containerNetworkInterfaces property: List of child container network interfaces.
     *
     * @return the containerNetworkInterfaces value.
     */
    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }

    /**
     * Get the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     *
     * @return the containerNetworkInterfaceConfigurations value.
     */
    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations;
    }

    /**
     * Set the containerNetworkInterfaceConfigurations property: List of chid container network interface
     * configurations.
     *
     * @param containerNetworkInterfaceConfigurations the containerNetworkInterfaceConfigurations value to set.
     * @return the NetworkProfilePropertiesFormat object itself.
     */
    public NetworkProfilePropertiesFormat withContainerNetworkInterfaceConfigurations(
        List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network profile resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network profile resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerNetworkInterfaces() != null) {
            containerNetworkInterfaces().forEach(e -> e.validate());
        }
        if (containerNetworkInterfaceConfigurations() != null) {
            containerNetworkInterfaceConfigurations().forEach(e -> e.validate());
        }
    }
}
