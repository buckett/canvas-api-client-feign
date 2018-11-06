package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Outcome;
import com.instructure.canvas.model.OutcomeAlignment;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutcomesApi
 */
public class OutcomesApiTest {

    private OutcomesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OutcomesApi.class);
    }

    /**
     * Get aligned assignments for an outcome in a course for a particular student
     *
     * 
     */
    @Test
    public void getAlignedAssignmentsForOutcomeInCourseForParticularStudentTest() {
        Integer courseId = null;
        Integer studentId = null;
        // List<OutcomeAlignment> response = api.getAlignedAssignmentsForOutcomeInCourseForParticularStudent(courseId, studentId);

        // TODO: test validations
    }

    /**
     * Get aligned assignments for an outcome in a course for a particular student
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAlignedAssignmentsForOutcomeInCourseForParticularStudentTestQueryMap() {
        Integer courseId = null;
        OutcomesApi.GetAlignedAssignmentsForOutcomeInCourseForParticularStudentQueryParams queryParams = new OutcomesApi.GetAlignedAssignmentsForOutcomeInCourseForParticularStudentQueryParams()
            .studentId(null);
        // List<OutcomeAlignment> response = api.getAlignedAssignmentsForOutcomeInCourseForParticularStudent(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Show an outcome
     *
     * Returns the details of the outcome with the given id.
     */
    @Test
    public void showOutcomeTest() {
        String id = null;
        // Outcome response = api.showOutcome(id);

        // TODO: test validations
    }

    /**
     * Update an outcome
     *
     * Modify an existing outcome. Fields not provided are left as is; unrecognized fields are ignored.  If any new ratings are provided, the combination of all new ratings provided completely replace any existing embedded rubric criterion; it is not possible to tweak the ratings of the embedded rubric criterion.  A new embedded rubric criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any new ratings lacking a description are given a default of \&quot;No description\&quot;. Any new ratings lacking a point value are given a default of 0.
     */
    @Test
    public void updateOutcomeTest() {
        String id = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // Outcome response = api.updateOutcome(id, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

}
