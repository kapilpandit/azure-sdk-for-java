// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.XeroLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Xero Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Xero")
@Fluent
public final class XeroLinkedService extends LinkedService {
    /*
     * Xero Service linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private XeroLinkedServiceTypeProperties innerTypeProperties = new XeroLinkedServiceTypeProperties();

    /** Creates an instance of XeroLinkedService class. */
    public XeroLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Xero Service linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private XeroLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public XeroLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XeroLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XeroLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public XeroLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionProperties property: Properties used to connect to Xero. It is mutually exclusive with any
     * other properties in the linked service. Type: object.
     *
     * @return the connectionProperties value.
     */
    public Object connectionProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionProperties();
    }

    /**
     * Set the connectionProperties property: Properties used to connect to Xero. It is mutually exclusive with any
     * other properties in the linked service. Type: object.
     *
     * @param connectionProperties the connectionProperties value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withConnectionProperties(Object connectionProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionProperties(connectionProperties);
        return this;
    }

    /**
     * Get the host property: The endpoint of the Xero server. (i.e. api.xero.com).
     *
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: The endpoint of the Xero server. (i.e. api.xero.com).
     *
     * @param host the host value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the consumerKey property: The consumer key associated with the Xero application.
     *
     * @return the consumerKey value.
     */
    public SecretBase consumerKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().consumerKey();
    }

    /**
     * Set the consumerKey property: The consumer key associated with the Xero application.
     *
     * @param consumerKey the consumerKey value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withConsumerKey(SecretBase consumerKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConsumerKey(consumerKey);
        return this;
    }

    /**
     * Get the privateKey property: The private key from the .pem file that was generated for your Xero private
     * application. You must include all the text from the .pem file, including the Unix line endings( ).
     *
     * @return the privateKey value.
     */
    public SecretBase privateKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().privateKey();
    }

    /**
     * Set the privateKey property: The private key from the .pem file that was generated for your Xero private
     * application. You must include all the text from the .pem file, including the Unix line endings( ).
     *
     * @param privateKey the privateKey value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withPrivateKey(SecretBase privateKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPrivateKey(privateKey);
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useEncryptedEndpoints();
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useHostVerification();
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withUseHostVerification(Object useHostVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseHostVerification(useHostVerification);
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().usePeerVerification();
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withUsePeerVerification(Object usePeerVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsePeerVerification(usePeerVerification);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the XeroLinkedService object itself.
     */
    public XeroLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new XeroLinkedServiceTypeProperties();
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
                        "Missing required property innerTypeProperties in model XeroLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(XeroLinkedService.class);
}
