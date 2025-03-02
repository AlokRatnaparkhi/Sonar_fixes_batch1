// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dashboard.fluent.models.PrivateEndpointConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties specific to the grafana resource. */
@Fluent
public final class ManagedGrafanaProperties {
    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The Grafana software version.
     */
    @JsonProperty(value = "grafanaVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String grafanaVersion;

    /*
     * The endpoint of the Grafana instance.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * Indicate the state for enable or disable traffic over the public interface.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The zone redundancy setting of the Grafana instance.
     */
    @JsonProperty(value = "zoneRedundancy")
    private ZoneRedundancy zoneRedundancy;

    /*
     * The api key setting of the Grafana instance.
     */
    @JsonProperty(value = "apiKey")
    private ApiKey apiKey;

    /*
     * Whether a Grafana instance uses deterministic outbound IPs.
     */
    @JsonProperty(value = "deterministicOutboundIP")
    private DeterministicOutboundIp deterministicOutboundIp;

    /*
     * List of outbound IPs if deterministicOutboundIP is enabled.
     */
    @JsonProperty(value = "outboundIPs", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> outboundIPs;

    /*
     * The private endpoint connections of the Grafana instance.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Scope for dns deterministic name hash calculation.
     */
    @JsonProperty(value = "autoGeneratedDomainNameLabelScope")
    private AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope;

    /*
     * GrafanaIntegrations is a bundled observability experience (e.g. pre-configured data source, tailored Grafana
     * dashboards, alerting defaults) for common monitoring scenarios.
     */
    @JsonProperty(value = "grafanaIntegrations")
    private GrafanaIntegrations grafanaIntegrations;

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the grafanaVersion property: The Grafana software version.
     *
     * @return the grafanaVersion value.
     */
    public String grafanaVersion() {
        return this.grafanaVersion;
    }

    /**
     * Get the endpoint property: The endpoint of the Grafana instance.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the publicNetworkAccess property: Indicate the state for enable or disable traffic over the public interface.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Indicate the state for enable or disable traffic over the public interface.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ManagedGrafanaProperties object itself.
     */
    public ManagedGrafanaProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the zoneRedundancy property: The zone redundancy setting of the Grafana instance.
     *
     * @return the zoneRedundancy value.
     */
    public ZoneRedundancy zoneRedundancy() {
        return this.zoneRedundancy;
    }

    /**
     * Set the zoneRedundancy property: The zone redundancy setting of the Grafana instance.
     *
     * @param zoneRedundancy the zoneRedundancy value to set.
     * @return the ManagedGrafanaProperties object itself.
     */
    public ManagedGrafanaProperties withZoneRedundancy(ZoneRedundancy zoneRedundancy) {
        this.zoneRedundancy = zoneRedundancy;
        return this;
    }

    /**
     * Get the apiKey property: The api key setting of the Grafana instance.
     *
     * @return the apiKey value.
     */
    public ApiKey apiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: The api key setting of the Grafana instance.
     *
     * @param apiKey the apiKey value to set.
     * @return the ManagedGrafanaProperties object itself.
     */
    public ManagedGrafanaProperties withApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the deterministicOutboundIp property: Whether a Grafana instance uses deterministic outbound IPs.
     *
     * @return the deterministicOutboundIp value.
     */
    public DeterministicOutboundIp deterministicOutboundIp() {
        return this.deterministicOutboundIp;
    }

    /**
     * Set the deterministicOutboundIp property: Whether a Grafana instance uses deterministic outbound IPs.
     *
     * @param deterministicOutboundIp the deterministicOutboundIp value to set.
     * @return the ManagedGrafanaProperties object itself.
     */
    public ManagedGrafanaProperties withDeterministicOutboundIp(DeterministicOutboundIp deterministicOutboundIp) {
        this.deterministicOutboundIp = deterministicOutboundIp;
        return this;
    }

    /**
     * Get the outboundIPs property: List of outbound IPs if deterministicOutboundIP is enabled.
     *
     * @return the outboundIPs value.
     */
    public List<String> outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Get the privateEndpointConnections property: The private endpoint connections of the Grafana instance.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: Scope for dns deterministic name hash calculation.
     *
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.autoGeneratedDomainNameLabelScope;
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: Scope for dns deterministic name hash calculation.
     *
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the ManagedGrafanaProperties object itself.
     */
    public ManagedGrafanaProperties withAutoGeneratedDomainNameLabelScope(
        AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        this.autoGeneratedDomainNameLabelScope = autoGeneratedDomainNameLabelScope;
        return this;
    }

    /**
     * Get the grafanaIntegrations property: GrafanaIntegrations is a bundled observability experience (e.g.
     * pre-configured data source, tailored Grafana dashboards, alerting defaults) for common monitoring scenarios.
     *
     * @return the grafanaIntegrations value.
     */
    public GrafanaIntegrations grafanaIntegrations() {
        return this.grafanaIntegrations;
    }

    /**
     * Set the grafanaIntegrations property: GrafanaIntegrations is a bundled observability experience (e.g.
     * pre-configured data source, tailored Grafana dashboards, alerting defaults) for common monitoring scenarios.
     *
     * @param grafanaIntegrations the grafanaIntegrations value to set.
     * @return the ManagedGrafanaProperties object itself.
     */
    public ManagedGrafanaProperties withGrafanaIntegrations(GrafanaIntegrations grafanaIntegrations) {
        this.grafanaIntegrations = grafanaIntegrations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (grafanaIntegrations() != null) {
            grafanaIntegrations().validate();
        }
    }
}
