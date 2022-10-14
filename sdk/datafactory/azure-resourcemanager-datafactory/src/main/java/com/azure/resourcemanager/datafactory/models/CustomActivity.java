// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.CustomActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Custom activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Custom")
@Fluent
public final class CustomActivity extends ExecutionActivity {
    /*
     * Custom activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private CustomActivityTypeProperties innerTypeProperties = new CustomActivityTypeProperties();

    /** Creates an instance of CustomActivity class. */
    public CustomActivity() {
    }

    /**
     * Get the innerTypeProperties property: Custom activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private CustomActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CustomActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the command property: Command for custom activity Type: string (or Expression with resultType string).
     *
     * @return the command value.
     */
    public Object command() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().command();
    }

    /**
     * Set the command property: Command for custom activity Type: string (or Expression with resultType string).
     *
     * @param command the command value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withCommand(Object command) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withCommand(command);
        return this;
    }

    /**
     * Get the resourceLinkedService property: Resource linked service reference.
     *
     * @return the resourceLinkedService value.
     */
    public LinkedServiceReference resourceLinkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().resourceLinkedService();
    }

    /**
     * Set the resourceLinkedService property: Resource linked service reference.
     *
     * @param resourceLinkedService the resourceLinkedService value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withResourceLinkedService(LinkedServiceReference resourceLinkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withResourceLinkedService(resourceLinkedService);
        return this;
    }

    /**
     * Get the folderPath property: Folder path for resource files Type: string (or Expression with resultType string).
     *
     * @return the folderPath value.
     */
    public Object folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: Folder path for resource files Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withFolderPath(Object folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the referenceObjects property: Reference objects.
     *
     * @return the referenceObjects value.
     */
    public CustomActivityReferenceObject referenceObjects() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().referenceObjects();
    }

    /**
     * Set the referenceObjects property: Reference objects.
     *
     * @param referenceObjects the referenceObjects value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withReferenceObjects(CustomActivityReferenceObject referenceObjects) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withReferenceObjects(referenceObjects);
        return this;
    }

    /**
     * Get the extendedProperties property: User defined property bag. There is no restriction on the keys or values
     * that can be used. The user specified custom activity has the full responsibility to consume and interpret the
     * content defined.
     *
     * @return the extendedProperties value.
     */
    public Map<String, Object> extendedProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().extendedProperties();
    }

    /**
     * Set the extendedProperties property: User defined property bag. There is no restriction on the keys or values
     * that can be used. The user specified custom activity has the full responsibility to consume and interpret the
     * content defined.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withExtendedProperties(Map<String, Object> extendedProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withExtendedProperties(extendedProperties);
        return this;
    }

    /**
     * Get the retentionTimeInDays property: The retention time for the files submitted for custom activity. Type:
     * double (or Expression with resultType double).
     *
     * @return the retentionTimeInDays value.
     */
    public Object retentionTimeInDays() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().retentionTimeInDays();
    }

    /**
     * Set the retentionTimeInDays property: The retention time for the files submitted for custom activity. Type:
     * double (or Expression with resultType double).
     *
     * @param retentionTimeInDays the retentionTimeInDays value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withRetentionTimeInDays(Object retentionTimeInDays) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withRetentionTimeInDays(retentionTimeInDays);
        return this;
    }

    /**
     * Get the autoUserSpecification property: Elevation level and scope for the user, default is nonadmin task. Type:
     * string (or Expression with resultType double).
     *
     * @return the autoUserSpecification value.
     */
    public Object autoUserSpecification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().autoUserSpecification();
    }

    /**
     * Set the autoUserSpecification property: Elevation level and scope for the user, default is nonadmin task. Type:
     * string (or Expression with resultType double).
     *
     * @param autoUserSpecification the autoUserSpecification value to set.
     * @return the CustomActivity object itself.
     */
    public CustomActivity withAutoUserSpecification(Object autoUserSpecification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomActivityTypeProperties();
        }
        this.innerTypeProperties().withAutoUserSpecification(autoUserSpecification);
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
                        "Missing required property innerTypeProperties in model CustomActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomActivity.class);
}
