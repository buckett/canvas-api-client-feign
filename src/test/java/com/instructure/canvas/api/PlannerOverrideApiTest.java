package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.PlannerOverride;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlannerOverrideApi
 */
public class PlannerOverrideApiTest {

    private PlannerOverrideApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PlannerOverrideApi.class);
    }

    /**
     * Create a planner override
     *
     * Create a planner override for the current user
     */
    @Test
    public void createPlannerOverrideTest() {
        String plannableType = null;
        Integer plannableId = null;
        Boolean markedComplete = null;
        Boolean dismissed = null;
        // PlannerOverride response = api.createPlannerOverride(plannableType, plannableId, markedComplete, dismissed);

        // TODO: test validations
    }

    /**
     * Delete a planner override
     *
     * Delete a planner override for the current user
     */
    @Test
    public void deletePlannerOverrideTest() {
        String id = null;
        // PlannerOverride response = api.deletePlannerOverride(id);

        // TODO: test validations
    }

    /**
     * List planner overrides
     *
     * Retrieve a planner override for the current user
     */
    @Test
    public void listPlannerOverridesTest() {
        // List<PlannerOverride> response = api.listPlannerOverrides();

        // TODO: test validations
    }

    /**
     * Show a planner override
     *
     * Retrieve a planner override for the current user
     */
    @Test
    public void showPlannerOverrideTest() {
        String id = null;
        // PlannerOverride response = api.showPlannerOverride(id);

        // TODO: test validations
    }

    /**
     * Update a planner override
     *
     * Update a planner override&#x27;s visibilty for the current user
     */
    @Test
    public void updatePlannerOverrideTest() {
        String id = null;
        String markedComplete = null;
        String dismissed = null;
        // PlannerOverride response = api.updatePlannerOverride(id, markedComplete, dismissed);

        // TODO: test validations
    }

}
