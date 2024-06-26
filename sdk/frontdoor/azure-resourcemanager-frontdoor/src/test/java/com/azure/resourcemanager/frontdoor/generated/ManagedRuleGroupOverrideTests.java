// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ActionType;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleEnabledState;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleExclusion;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleExclusionMatchVariable;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleExclusionSelectorMatchOperator;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleGroupOverride;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleOverride;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagedRuleGroupOverrideTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedRuleGroupOverride model =
            BinaryData
                .fromString(
                    "{\"ruleGroupName\":\"theotusiv\",\"exclusions\":[{\"matchVariable\":\"QueryStringArgNames\",\"selectorMatchOperator\":\"StartsWith\",\"selector\":\"iqihn\"}],\"rules\":[{\"ruleId\":\"gbwjzrnf\",\"enabledState\":\"Enabled\",\"action\":\"Log\",\"exclusions\":[]},{\"ruleId\":\"emv\",\"enabledState\":\"Disabled\",\"action\":\"AnomalyScoring\",\"exclusions\":[]}]}")
                .toObject(ManagedRuleGroupOverride.class);
        Assertions.assertEquals("theotusiv", model.ruleGroupName());
        Assertions
            .assertEquals(
                ManagedRuleExclusionMatchVariable.QUERY_STRING_ARG_NAMES, model.exclusions().get(0).matchVariable());
        Assertions
            .assertEquals(
                ManagedRuleExclusionSelectorMatchOperator.STARTS_WITH,
                model.exclusions().get(0).selectorMatchOperator());
        Assertions.assertEquals("iqihn", model.exclusions().get(0).selector());
        Assertions.assertEquals("gbwjzrnf", model.rules().get(0).ruleId());
        Assertions.assertEquals(ManagedRuleEnabledState.ENABLED, model.rules().get(0).enabledState());
        Assertions.assertEquals(ActionType.LOG, model.rules().get(0).action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedRuleGroupOverride model =
            new ManagedRuleGroupOverride()
                .withRuleGroupName("theotusiv")
                .withExclusions(
                    Arrays
                        .asList(
                            new ManagedRuleExclusion()
                                .withMatchVariable(ManagedRuleExclusionMatchVariable.QUERY_STRING_ARG_NAMES)
                                .withSelectorMatchOperator(ManagedRuleExclusionSelectorMatchOperator.STARTS_WITH)
                                .withSelector("iqihn")))
                .withRules(
                    Arrays
                        .asList(
                            new ManagedRuleOverride()
                                .withRuleId("gbwjzrnf")
                                .withEnabledState(ManagedRuleEnabledState.ENABLED)
                                .withAction(ActionType.LOG)
                                .withExclusions(Arrays.asList()),
                            new ManagedRuleOverride()
                                .withRuleId("emv")
                                .withEnabledState(ManagedRuleEnabledState.DISABLED)
                                .withAction(ActionType.ANOMALY_SCORING)
                                .withExclusions(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ManagedRuleGroupOverride.class);
        Assertions.assertEquals("theotusiv", model.ruleGroupName());
        Assertions
            .assertEquals(
                ManagedRuleExclusionMatchVariable.QUERY_STRING_ARG_NAMES, model.exclusions().get(0).matchVariable());
        Assertions
            .assertEquals(
                ManagedRuleExclusionSelectorMatchOperator.STARTS_WITH,
                model.exclusions().get(0).selectorMatchOperator());
        Assertions.assertEquals("iqihn", model.exclusions().get(0).selector());
        Assertions.assertEquals("gbwjzrnf", model.rules().get(0).ruleId());
        Assertions.assertEquals(ManagedRuleEnabledState.ENABLED, model.rules().get(0).enabledState());
        Assertions.assertEquals(ActionType.LOG, model.rules().get(0).action());
    }
}
