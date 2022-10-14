// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Structure of command payload. */
@Fluent
public final class DataFlowDebugCommandPayload {
    /*
     * The stream name which is used for preview.
     */
    @JsonProperty(value = "streamName", required = true)
    private String streamName;

    /*
     * Row limits for preview response.
     */
    @JsonProperty(value = "rowLimits")
    private Integer rowLimits;

    /*
     * Array of column names.
     */
    @JsonProperty(value = "columns")
    private List<String> columns;

    /*
     * The expression which is used for preview.
     */
    @JsonProperty(value = "expression")
    private String expression;

    /** Creates an instance of DataFlowDebugCommandPayload class. */
    public DataFlowDebugCommandPayload() {
    }

    /**
     * Get the streamName property: The stream name which is used for preview.
     *
     * @return the streamName value.
     */
    public String streamName() {
        return this.streamName;
    }

    /**
     * Set the streamName property: The stream name which is used for preview.
     *
     * @param streamName the streamName value to set.
     * @return the DataFlowDebugCommandPayload object itself.
     */
    public DataFlowDebugCommandPayload withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * Get the rowLimits property: Row limits for preview response.
     *
     * @return the rowLimits value.
     */
    public Integer rowLimits() {
        return this.rowLimits;
    }

    /**
     * Set the rowLimits property: Row limits for preview response.
     *
     * @param rowLimits the rowLimits value to set.
     * @return the DataFlowDebugCommandPayload object itself.
     */
    public DataFlowDebugCommandPayload withRowLimits(Integer rowLimits) {
        this.rowLimits = rowLimits;
        return this;
    }

    /**
     * Get the columns property: Array of column names.
     *
     * @return the columns value.
     */
    public List<String> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: Array of column names.
     *
     * @param columns the columns value to set.
     * @return the DataFlowDebugCommandPayload object itself.
     */
    public DataFlowDebugCommandPayload withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the expression property: The expression which is used for preview.
     *
     * @return the expression value.
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression property: The expression which is used for preview.
     *
     * @param expression the expression value to set.
     * @return the DataFlowDebugCommandPayload object itself.
     */
    public DataFlowDebugCommandPayload withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (streamName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property streamName in model DataFlowDebugCommandPayload"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataFlowDebugCommandPayload.class);
}
