// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureStorageLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The storage account linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureStorage")
@Fluent
public final class AzureStorageLinkedService extends LinkedService {
    /*
     * Azure Storage linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureStorageLinkedServiceTypeProperties innerTypeProperties = new AzureStorageLinkedServiceTypeProperties();

    /** Creates an instance of AzureStorageLinkedService class. */
    public AzureStorageLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Azure Storage linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureStorageLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStorageLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference accountKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountKey();
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withAccountKey(AzureKeyVaultSecretReference accountKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountKey(accountKey);
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value.
     */
    public Object sasUri() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sasUri();
    }

    /**
     * Set the sasUri property: SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withSasUri(Object sasUri) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSasUri(sasUri);
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference sasToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sasToken();
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withSasToken(AzureKeyVaultSecretReference sasToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSasToken(sasToken);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model AzureStorageLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureStorageLinkedService.class);
}
