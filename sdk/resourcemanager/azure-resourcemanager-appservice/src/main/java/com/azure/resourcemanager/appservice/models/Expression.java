// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The expression. */
@Fluent
public class Expression {
    /*
     * The text.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * Anything
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * The sub expressions.
     */
    @JsonProperty(value = "subexpressions")
    private List<Expression> subexpressions;

    /*
     * The azure resource error info.
     */
    @JsonProperty(value = "error")
    private AzureResourceErrorInfo error;

    /**
     * Get the text property: The text.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: The text.
     *
     * @param text the text value to set.
     * @return the Expression object itself.
     */
    public Expression withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the value property: Anything.
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Anything.
     *
     * @param value the value value to set.
     * @return the Expression object itself.
     */
    public Expression withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the subexpressions property: The sub expressions.
     *
     * @return the subexpressions value.
     */
    public List<Expression> subexpressions() {
        return this.subexpressions;
    }

    /**
     * Set the subexpressions property: The sub expressions.
     *
     * @param subexpressions the subexpressions value to set.
     * @return the Expression object itself.
     */
    public Expression withSubexpressions(List<Expression> subexpressions) {
        this.subexpressions = subexpressions;
        return this;
    }

    /**
     * Get the error property: The azure resource error info.
     *
     * @return the error value.
     */
    public AzureResourceErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error property: The azure resource error info.
     *
     * @param error the error value to set.
     * @return the Expression object itself.
     */
    public Expression withError(AzureResourceErrorInfo error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subexpressions() != null) {
            subexpressions().forEach(e -> e.validate());
        }
        if (error() != null) {
            error().validate();
        }
    }
}