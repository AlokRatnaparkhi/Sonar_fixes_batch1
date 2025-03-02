// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionPolicyResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;
import java.util.Collections;
import java.util.Map;

public final class ProtectionPolicyResourceImpl
    implements ProtectionPolicyResource, ProtectionPolicyResource.Definition, ProtectionPolicyResource.Update {
    private ProtectionPolicyResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ProtectionPolicy properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ProtectionPolicyResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    private String vaultName;

    private String resourceGroupName;

    private String policyName;

    public ProtectionPolicyResourceImpl withExistingVault(String vaultName, String resourceGroupName) {
        this.vaultName = vaultName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ProtectionPolicyResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionPolicies()
                .createOrUpdateWithResponse(vaultName, resourceGroupName, policyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionPolicyResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionPolicies()
                .createOrUpdateWithResponse(vaultName, resourceGroupName, policyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProtectionPolicyResourceImpl(
        String name, com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = new ProtectionPolicyResourceInner();
        this.serviceManager = serviceManager;
        this.policyName = name;
    }

    public ProtectionPolicyResourceImpl update() {
        return this;
    }

    public ProtectionPolicyResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionPolicies()
                .createOrUpdateWithResponse(vaultName, resourceGroupName, policyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionPolicyResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionPolicies()
                .createOrUpdateWithResponse(vaultName, resourceGroupName, policyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProtectionPolicyResourceImpl(
        ProtectionPolicyResourceInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.policyName = Utils.getValueFromIdByName(innerObject.id(), "backupPolicies");
    }

    public ProtectionPolicyResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionPolicies()
                .getWithResponse(vaultName, resourceGroupName, policyName, Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionPolicyResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionPolicies()
                .getWithResponse(vaultName, resourceGroupName, policyName, context)
                .getValue();
        return this;
    }

    public ProtectionPolicyResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ProtectionPolicyResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ProtectionPolicyResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ProtectionPolicyResourceImpl withProperties(ProtectionPolicy properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ProtectionPolicyResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
