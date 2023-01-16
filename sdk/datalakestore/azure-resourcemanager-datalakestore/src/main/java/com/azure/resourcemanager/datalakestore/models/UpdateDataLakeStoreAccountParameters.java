// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datalakestore.fluent.models.UpdateDataLakeStoreAccountProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Data Lake Store account information to update. */
@Fluent
public final class UpdateDataLakeStoreAccountParameters {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The Data Lake Store account properties to update.
     */
    @JsonProperty(value = "properties")
    private UpdateDataLakeStoreAccountProperties innerProperties;

    /** Creates an instance of UpdateDataLakeStoreAccountParameters class. */
    public UpdateDataLakeStoreAccountParameters() {
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The Data Lake Store account properties to update.
     *
     * @return the innerProperties value.
     */
    private UpdateDataLakeStoreAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the defaultGroup property: The default owner group for all new folders and files created in the Data Lake
     * Store account.
     *
     * @return the defaultGroup value.
     */
    public String defaultGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultGroup();
    }

    /**
     * Set the defaultGroup property: The default owner group for all new folders and files created in the Data Lake
     * Store account.
     *
     * @param defaultGroup the defaultGroup value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withDefaultGroup(String defaultGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withDefaultGroup(defaultGroup);
        return this;
    }

    /**
     * Get the encryptionConfig property: Used for rotation of user managed Key Vault keys. Can only be used to rotate a
     * user managed encryption Key Vault key.
     *
     * @return the encryptionConfig value.
     */
    public UpdateEncryptionConfig encryptionConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionConfig();
    }

    /**
     * Set the encryptionConfig property: Used for rotation of user managed Key Vault keys. Can only be used to rotate a
     * user managed encryption Key Vault key.
     *
     * @param encryptionConfig the encryptionConfig value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withEncryptionConfig(UpdateEncryptionConfig encryptionConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * Get the firewallRules property: The list of firewall rules associated with this Data Lake Store account.
     *
     * @return the firewallRules value.
     */
    public List<UpdateFirewallRuleWithAccountParameters> firewallRules() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallRules();
    }

    /**
     * Set the firewallRules property: The list of firewall rules associated with this Data Lake Store account.
     *
     * @param firewallRules the firewallRules value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withFirewallRules(
        List<UpdateFirewallRuleWithAccountParameters> firewallRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withFirewallRules(firewallRules);
        return this;
    }

    /**
     * Get the virtualNetworkRules property: The list of virtual network rules associated with this Data Lake Store
     * account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<UpdateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkRules();
    }

    /**
     * Set the virtualNetworkRules property: The list of virtual network rules associated with this Data Lake Store
     * account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withVirtualNetworkRules(
        List<UpdateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    /**
     * Get the firewallState property: The current state of the IP address firewall for this Data Lake Store account.
     * Disabling the firewall does not remove existing rules, they will just be ignored until the firewall is
     * re-enabled.
     *
     * @return the firewallState value.
     */
    public FirewallState firewallState() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallState();
    }

    /**
     * Set the firewallState property: The current state of the IP address firewall for this Data Lake Store account.
     * Disabling the firewall does not remove existing rules, they will just be ignored until the firewall is
     * re-enabled.
     *
     * @param firewallState the firewallState value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withFirewallState(FirewallState firewallState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withFirewallState(firewallState);
        return this;
    }

    /**
     * Get the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @return the firewallAllowAzureIps value.
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallAllowAzureIps();
    }

    /**
     * Set the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withFirewallAllowAzureIps(
        FirewallAllowAzureIpsState firewallAllowAzureIps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withFirewallAllowAzureIps(firewallAllowAzureIps);
        return this;
    }

    /**
     * Get the trustedIdProviders property: The list of trusted identity providers associated with this Data Lake Store
     * account.
     *
     * @return the trustedIdProviders value.
     */
    public List<UpdateTrustedIdProviderWithAccountParameters> trustedIdProviders() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedIdProviders();
    }

    /**
     * Set the trustedIdProviders property: The list of trusted identity providers associated with this Data Lake Store
     * account.
     *
     * @param trustedIdProviders the trustedIdProviders value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withTrustedIdProviders(
        List<UpdateTrustedIdProviderWithAccountParameters> trustedIdProviders) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withTrustedIdProviders(trustedIdProviders);
        return this;
    }

    /**
     * Get the trustedIdProviderState property: The current state of the trusted identity provider feature for this Data
     * Lake Store account. Disabling trusted identity provider functionality does not remove the providers, they will
     * just be ignored until this feature is re-enabled.
     *
     * @return the trustedIdProviderState value.
     */
    public TrustedIdProviderState trustedIdProviderState() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedIdProviderState();
    }

    /**
     * Set the trustedIdProviderState property: The current state of the trusted identity provider feature for this Data
     * Lake Store account. Disabling trusted identity provider functionality does not remove the providers, they will
     * just be ignored until this feature is re-enabled.
     *
     * @param trustedIdProviderState the trustedIdProviderState value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withTrustedIdProviderState(
        TrustedIdProviderState trustedIdProviderState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withTrustedIdProviderState(trustedIdProviderState);
        return this;
    }

    /**
     * Get the newTier property: The commitment tier to use for next month.
     *
     * @return the newTier value.
     */
    public TierType newTier() {
        return this.innerProperties() == null ? null : this.innerProperties().newTier();
    }

    /**
     * Set the newTier property: The commitment tier to use for next month.
     *
     * @param newTier the newTier value to set.
     * @return the UpdateDataLakeStoreAccountParameters object itself.
     */
    public UpdateDataLakeStoreAccountParameters withNewTier(TierType newTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateDataLakeStoreAccountProperties();
        }
        this.innerProperties().withNewTier(newTier);
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
