package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LatePolicyApi
 */
public class LatePolicyApiTest {

    private LatePolicyApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(LatePolicyApi.class);
    }

    /**
     * Create a late policy
     *
     * Create a late policy. If the course already has a late policy, a bad_request is returned since there can only be one late policy per course.
     */
    @Test
    public void createLatePolicyTest() {
        String id = null;
        Boolean latePolicyMissingSubmissionDeductionEnabled = null;
        BigDecimal latePolicyMissingSubmissionDeduction = null;
        Boolean latePolicyLateSubmissionDeductionEnabled = null;
        BigDecimal latePolicyLateSubmissionDeduction = null;
        String latePolicyLateSubmissionInterval = null;
        Boolean latePolicyLateSubmissionMinimumPercentEnabled = null;
        BigDecimal latePolicyLateSubmissionMinimumPercent = null;
        // api.createLatePolicy(id, latePolicyMissingSubmissionDeductionEnabled, latePolicyMissingSubmissionDeduction, latePolicyLateSubmissionDeductionEnabled, latePolicyLateSubmissionDeduction, latePolicyLateSubmissionInterval, latePolicyLateSubmissionMinimumPercentEnabled, latePolicyLateSubmissionMinimumPercent);

        // TODO: test validations
    }

    /**
     * Get a late policy
     *
     * Returns the late policy for a course.
     */
    @Test
    public void getLatePolicyTest() {
        String id = null;
        // api.getLatePolicy(id);

        // TODO: test validations
    }

    /**
     * Patch a late policy
     *
     * Patch a late policy. No body is returned upon success.
     */
    @Test
    public void patchLatePolicyTest() {
        String id = null;
        Boolean latePolicyMissingSubmissionDeductionEnabled = null;
        BigDecimal latePolicyMissingSubmissionDeduction = null;
        Boolean latePolicyLateSubmissionDeductionEnabled = null;
        BigDecimal latePolicyLateSubmissionDeduction = null;
        String latePolicyLateSubmissionInterval = null;
        Boolean latePolicyLateSubmissionMinimumPercentEnabled = null;
        BigDecimal latePolicyLateSubmissionMinimumPercent = null;
        // api.patchLatePolicy(id, latePolicyMissingSubmissionDeductionEnabled, latePolicyMissingSubmissionDeduction, latePolicyLateSubmissionDeductionEnabled, latePolicyLateSubmissionDeduction, latePolicyLateSubmissionInterval, latePolicyLateSubmissionMinimumPercentEnabled, latePolicyLateSubmissionMinimumPercent);

        // TODO: test validations
    }

}
