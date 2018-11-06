package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.PlannerNote;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlannerNoteApi
 */
public class PlannerNoteApiTest {

    private PlannerNoteApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PlannerNoteApi.class);
    }

    /**
     * Create a planner note
     *
     * Create a planner note for the current user
     */
    @Test
    public void createPlannerNoteTest() {
        String title = null;
        String details = null;
        String todoDate = null;
        Integer courseId = null;
        String linkedObjectType = null;
        Integer linkedObjectId = null;
        // PlannerNote response = api.createPlannerNote(title, details, todoDate, courseId, linkedObjectType, linkedObjectId);

        // TODO: test validations
    }

    /**
     * Delete a planner note
     *
     * Delete a planner note for the current user
     */
    @Test
    public void deletePlannerNoteTest() {
        String id = null;
        // PlannerNote response = api.deletePlannerNote(id);

        // TODO: test validations
    }

    /**
     * List planner notes
     *
     * Retrieve the paginated list of planner notes  Retrieve planner note for a user
     */
    @Test
    public void listPlannerNotesTest() {
        String startDate = null;
        String endDate = null;
        List<String> contextCodes = null;
        // List<PlannerNote> response = api.listPlannerNotes(startDate, endDate, contextCodes);

        // TODO: test validations
    }

    /**
     * List planner notes
     *
     * Retrieve the paginated list of planner notes  Retrieve planner note for a user
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPlannerNotesTestQueryMap() {
        PlannerNoteApi.ListPlannerNotesQueryParams queryParams = new PlannerNoteApi.ListPlannerNotesQueryParams()
            .startDate(null)
            .endDate(null)
            .contextCodes(null);
        // List<PlannerNote> response = api.listPlannerNotes(queryParams);

    // TODO: test validations
    }
    /**
     * Show a PlannerNote
     *
     * Retrieve a planner note for the current user
     */
    @Test
    public void showPlannernoteTest() {
        String id = null;
        // PlannerNote response = api.showPlannernote(id);

        // TODO: test validations
    }

    /**
     * Update a PlannerNote
     *
     * Update a planner note for the current user
     */
    @Test
    public void updatePlannernoteTest() {
        String id = null;
        String title = null;
        String details = null;
        String todoDate = null;
        Integer courseId = null;
        // PlannerNote response = api.updatePlannernote(id, title, details, todoDate, courseId);

        // TODO: test validations
    }

}
