// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetUpdateIpConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine scale set network profile's IP configuration. NOTE: The subnet of a scale set may be
 * modified as long as the original subnet and the new subnet are in the same virtual network.
 */
@Fluent
public final class VirtualMachineScaleSetUpdateIpConfiguration {
    /*
     * The IP configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Describes a virtual machine scale set network profile's IP configuration properties.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetUpdateIpConfigurationProperties innerProperties;

    /** Creates an instance of VirtualMachineScaleSetUpdateIpConfiguration class. */
    public VirtualMachineScaleSetUpdateIpConfiguration() {
    }

    /**
     * Get the name property: The IP configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The IP configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machine scale set network profile's IP configuration
     * properties.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetUpdateIpConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the subnet property: The subnet.
     *
     * @return the subnet value.
     */
    public ApiEntityReference subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The subnet.
     *
     * @param subnet the subnet value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withSubnet(ApiEntityReference subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the primary property: Specifies the primary IP Configuration in case the network interface has more than one
     * IP Configuration.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Specifies the primary IP Configuration in case the network interface has more than one
     * IP Configuration.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     *
     * @return the publicIpAddressConfiguration value.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfiguration publicIpAddressConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddressConfiguration();
    }

    /**
     * Set the publicIpAddressConfiguration property: The publicIPAddressConfiguration.
     *
     * @param publicIpAddressConfiguration the publicIpAddressConfiguration value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withPublicIpAddressConfiguration(
        VirtualMachineScaleSetUpdatePublicIpAddressConfiguration publicIpAddressConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withPublicIpAddressConfiguration(publicIpAddressConfiguration);
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddressVersion();
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2017-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withPrivateIpAddressVersion(privateIpAddressVersion);
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: The application gateway backend address pools.
     *
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<SubResource> applicationGatewayBackendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGatewayBackendAddressPools();
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: The application gateway backend address pools.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withApplicationGatewayBackendAddressPools(
        List<SubResource> applicationGatewayBackendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withApplicationGatewayBackendAddressPools(applicationGatewayBackendAddressPools);
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Specifies an array of references to application security group.
     *
     * @return the applicationSecurityGroups value.
     */
    public List<SubResource> applicationSecurityGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationSecurityGroups();
    }

    /**
     * Set the applicationSecurityGroups property: Specifies an array of references to application security group.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withApplicationSecurityGroups(
        List<SubResource> applicationSecurityGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withApplicationSecurityGroups(applicationSecurityGroups);
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: The load balancer backend address pools.
     *
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<SubResource> loadBalancerBackendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerBackendAddressPools();
    }

    /**
     * Set the loadBalancerBackendAddressPools property: The load balancer backend address pools.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withLoadBalancerBackendAddressPools(
        List<SubResource> loadBalancerBackendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withLoadBalancerBackendAddressPools(loadBalancerBackendAddressPools);
        return this;
    }

    /**
     * Get the loadBalancerInboundNatPools property: The load balancer inbound nat pools.
     *
     * @return the loadBalancerInboundNatPools value.
     */
    public List<SubResource> loadBalancerInboundNatPools() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerInboundNatPools();
    }

    /**
     * Set the loadBalancerInboundNatPools property: The load balancer inbound nat pools.
     *
     * @param loadBalancerInboundNatPools the loadBalancerInboundNatPools value to set.
     * @return the VirtualMachineScaleSetUpdateIpConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIpConfiguration withLoadBalancerInboundNatPools(
        List<SubResource> loadBalancerInboundNatPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateIpConfigurationProperties();
        }
        this.innerProperties().withLoadBalancerInboundNatPools(loadBalancerInboundNatPools);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
