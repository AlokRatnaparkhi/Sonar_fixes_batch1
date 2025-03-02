// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.CapabilityPropertiesInner;
import java.util.List;

/** An immutable client-side representation of CapabilityProperties. */
public interface CapabilityProperties {
    /**
     * Gets the zone property: zone name.
     *
     * @return the zone value.
     */
    String zone();

    /**
     * Gets the supportedHAMode property: Supported high availability mode.
     *
     * @return the supportedHAMode value.
     */
    List<String> supportedHAMode();

    /**
     * Gets the geoBackupSupported property: A value indicating whether a new server in this region can have geo-backups
     * to paired region.
     *
     * @return the geoBackupSupported value.
     */
    Boolean geoBackupSupported();

    /**
     * Gets the zoneRedundantHaSupported property: A value indicating whether a new server in this region can support
     * multi zone HA.
     *
     * @return the zoneRedundantHaSupported value.
     */
    Boolean zoneRedundantHaSupported();

    /**
     * Gets the zoneRedundantHaAndGeoBackupSupported property: A value indicating whether a new server in this region
     * can have geo-backups to paired region.
     *
     * @return the zoneRedundantHaAndGeoBackupSupported value.
     */
    Boolean zoneRedundantHaAndGeoBackupSupported();

    /**
     * Gets the supportedFlexibleServerEditions property: The supportedFlexibleServerEditions property.
     *
     * @return the supportedFlexibleServerEditions value.
     */
    List<FlexibleServerEditionCapability> supportedFlexibleServerEditions();

    /**
     * Gets the supportedHyperscaleNodeEditions property: The supportedHyperscaleNodeEditions property.
     *
     * @return the supportedHyperscaleNodeEditions value.
     */
    List<HyperscaleNodeEditionCapability> supportedHyperscaleNodeEditions();

    /**
     * Gets the fastProvisioningSupported property: A value indicating whether fast provisioning is supported in this
     * region.
     *
     * @return the fastProvisioningSupported value.
     */
    Boolean fastProvisioningSupported();

    /**
     * Gets the supportedFastProvisioningEditions property: The supportedFastProvisioningEditions property.
     *
     * @return the supportedFastProvisioningEditions value.
     */
    List<FastProvisioningEditionCapability> supportedFastProvisioningEditions();

    /**
     * Gets the status property: The status.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.CapabilityPropertiesInner object.
     *
     * @return the inner object.
     */
    CapabilityPropertiesInner innerModel();
}
