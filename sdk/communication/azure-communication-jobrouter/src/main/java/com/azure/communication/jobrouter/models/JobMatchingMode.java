// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A matching mode of one of the following types:
 * QueueAndMatchMode: Used when matching worker to a job is required to be done right after job is queued.
 * ScheduleAndSuspendMode: Used for scheduling jobs to be queued at a future time. At specified time, matching of a
 * worker to the job will not start automatically.
 * SuspendMode: Used when matching workers to a job needs to be suspended.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = JobMatchingMode.class)
@JsonTypeName("JobMatchingMode")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "scheduleAndSuspend", value = ScheduleAndSuspendMode.class),
    @JsonSubTypes.Type(name = "queueAndMatch", value = QueueAndMatchMode.class),
    @JsonSubTypes.Type(name = "suspend", value = SuspendMode.class) })
@Immutable
public abstract class JobMatchingMode {
    /**
     * kind discriminator.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Creates an instance of JobMatchingMode class.
     */
    public JobMatchingMode() {
    }

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public String getKind() {
        return this.kind;
    }
}
