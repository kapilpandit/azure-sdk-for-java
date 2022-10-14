// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Amazon S3 Compatible read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3CompatibleReadSettings")
@Fluent
public final class AmazonS3CompatibleReadSettings extends StoreReadSettings {
    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "wildcardFolderPath")
    private Object wildcardFolderPath;

    /*
     * Amazon S3 Compatible wildcardFileName. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "wildcardFileName")
    private Object wildcardFileName;

    /*
     * The prefix filter for the S3 Compatible object name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "prefix")
    private Object prefix;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to
     * copy. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileListPath")
    private Object fileListPath;

    /*
     * Indicates whether to enable partition discovery.
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Boolean enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "deleteFilesAfterCompletion")
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /** Creates an instance of AmazonS3CompatibleReadSettings class. */
    public AmazonS3CompatibleReadSettings() {
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     *
     * @return the wildcardFolderPath value.
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     *
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Amazon S3 Compatible wildcardFileName. Type: string (or Expression with
     * resultType string).
     *
     * @return the wildcardFileName value.
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Amazon S3 Compatible wildcardFileName. Type: string (or Expression with
     * resultType string).
     *
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the S3 Compatible object name. Type: string (or Expression with
     * resultType string).
     *
     * @return the prefix value.
     */
    public Object prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the S3 Compatible object name. Type: string (or Expression with
     * resultType string).
     *
     * @param prefix the prefix value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @return the fileListPath value.
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     *
     * @param fileListPath the fileListPath value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @return the enablePartitionDiscovery value.
     */
    public Boolean enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withEnablePartitionDiscovery(Boolean enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the deleteFilesAfterCompletion value.
     */
    public Object deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AmazonS3CompatibleReadSettings object itself.
     */
    public AmazonS3CompatibleReadSettings withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3CompatibleReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3CompatibleReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
