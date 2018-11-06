package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.AssignmentGroup;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssignmentGroupsApi
 */
public class AssignmentGroupsApiTest {

    private AssignmentGroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AssignmentGroupsApi.class);
    }

    /**
     * Create an Assignment Group
     *
     * Create a new assignment group for this course.
     */
    @Test
    public void createAssignmentGroupTest() {
        String courseId = null;
        String name = null;
        Integer position = null;
        BigDecimal groupWeight = null;
        String sisSourceId = null;
        Object integrationData = null;
        String rules = null;
        // AssignmentGroup response = api.createAssignmentGroup(courseId, name, position, groupWeight, sisSourceId, integrationData, rules);

        // TODO: test validations
    }

    /**
     * Destroy an Assignment Group
     *
     * Deletes the assignment group with the given id.
     */
    @Test
    public void destroyAssignmentGroupTest() {
        String courseId = null;
        String assignmentGroupId = null;
        Integer moveAssignmentsTo = null;
        // AssignmentGroup response = api.destroyAssignmentGroup(courseId, assignmentGroupId, moveAssignmentsTo);

        // TODO: test validations
    }

    /**
     * Destroy an Assignment Group
     *
     * Deletes the assignment group with the given id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void destroyAssignmentGroupTestQueryMap() {
        String courseId = null;
        String assignmentGroupId = null;
        AssignmentGroupsApi.DestroyAssignmentGroupQueryParams queryParams = new AssignmentGroupsApi.DestroyAssignmentGroupQueryParams()
            .moveAssignmentsTo(null);
        // AssignmentGroup response = api.destroyAssignmentGroup(courseId, assignmentGroupId, queryParams);

    // TODO: test validations
    }
    /**
     * Edit an Assignment Group
     *
     * Modify an existing Assignment Group. Accepts the same parameters as Assignment Group creation
     */
    @Test
    public void editAssignmentGroupTest() {
        String courseId = null;
        String assignmentGroupId = null;
        // AssignmentGroup response = api.editAssignmentGroup(courseId, assignmentGroupId);

        // TODO: test validations
    }

    /**
     * Get an Assignment Group
     *
     * Returns the assignment group with the given id.
     */
    @Test
    public void getAssignmentGroupTest() {
        String courseId = null;
        String assignmentGroupId = null;
        List<String> include = null;
        Boolean overrideAssignmentDates = null;
        Integer gradingPeriodId = null;
        // AssignmentGroup response = api.getAssignmentGroup(courseId, assignmentGroupId, include, overrideAssignmentDates, gradingPeriodId);

        // TODO: test validations
    }

    /**
     * Get an Assignment Group
     *
     * Returns the assignment group with the given id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAssignmentGroupTestQueryMap() {
        String courseId = null;
        String assignmentGroupId = null;
        AssignmentGroupsApi.GetAssignmentGroupQueryParams queryParams = new AssignmentGroupsApi.GetAssignmentGroupQueryParams()
            .include(null)
            .overrideAssignmentDates(null)
            .gradingPeriodId(null);
        // AssignmentGroup response = api.getAssignmentGroup(courseId, assignmentGroupId, queryParams);

    // TODO: test validations
    }
    /**
     * List assignment groups
     *
     * Returns the paginated list of assignment groups for the current context. The returned groups are sorted by their position field.
     */
    @Test
    public void listAssignmentGroupsTest() {
        String courseId = null;
        List<String> include = null;
        List<String> excludeAssignmentSubmissionTypes = null;
        Boolean overrideAssignmentDates = null;
        Integer gradingPeriodId = null;
        Boolean scopeAssignmentsToStudent = null;
        // List<AssignmentGroup> response = api.listAssignmentGroups(courseId, include, excludeAssignmentSubmissionTypes, overrideAssignmentDates, gradingPeriodId, scopeAssignmentsToStudent);

        // TODO: test validations
    }

    /**
     * List assignment groups
     *
     * Returns the paginated list of assignment groups for the current context. The returned groups are sorted by their position field.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAssignmentGroupsTestQueryMap() {
        String courseId = null;
        AssignmentGroupsApi.ListAssignmentGroupsQueryParams queryParams = new AssignmentGroupsApi.ListAssignmentGroupsQueryParams()
            .include(null)
            .excludeAssignmentSubmissionTypes(null)
            .overrideAssignmentDates(null)
            .gradingPeriodId(null)
            .scopeAssignmentsToStudent(null);
        // List<AssignmentGroup> response = api.listAssignmentGroups(courseId, queryParams);

    // TODO: test validations
    }
}
