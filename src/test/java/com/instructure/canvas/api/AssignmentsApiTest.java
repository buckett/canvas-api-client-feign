package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Assignment;
import com.instructure.canvas.model.AssignmentOverride;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssignmentsApi
 */
public class AssignmentsApiTest {

    private AssignmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AssignmentsApi.class);
    }

    /**
     * Batch create overrides in a course
     *
     * Creates the specified overrides for each assignment.  Handles creation in a transaction, so all records are created or none are.  One of student_ids, group_id, or course_section_id must be present. At most one should be present; if multiple are present only the most specific (student_ids first, then group_id, then course_section_id) is used and any others are ignored.  Errors are reported in an errors attribute, an array of errors corresponding to inputs.  Global errors will be reported as a single element errors array
     */
    @Test
    public void batchCreateOverridesInCourseTest() {
        String courseId = null;
        List<String> assignmentOverrides = null;
        // List<AssignmentOverride> response = api.batchCreateOverridesInCourse(courseId, assignmentOverrides);

        // TODO: test validations
    }

    /**
     * Batch retrieve overrides in a course
     *
     * Returns a list of specified overrides in this course, providing they target sections/groups/students visible to the current user. Returns null elements in the list for requests that were not found.
     */
    @Test
    public void batchRetrieveOverridesInCourseTest() {
        String courseId = null;
        List<String> assignmentOverridesId = null;
        List<String> assignmentOverridesAssignmentId = null;
        // List<AssignmentOverride> response = api.batchRetrieveOverridesInCourse(courseId, assignmentOverridesId, assignmentOverridesAssignmentId);

        // TODO: test validations
    }

    /**
     * Batch retrieve overrides in a course
     *
     * Returns a list of specified overrides in this course, providing they target sections/groups/students visible to the current user. Returns null elements in the list for requests that were not found.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void batchRetrieveOverridesInCourseTestQueryMap() {
        String courseId = null;
        AssignmentsApi.BatchRetrieveOverridesInCourseQueryParams queryParams = new AssignmentsApi.BatchRetrieveOverridesInCourseQueryParams()
            .assignmentOverridesId(null)
            .assignmentOverridesAssignmentId(null);
        // List<AssignmentOverride> response = api.batchRetrieveOverridesInCourse(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Batch update overrides in a course
     *
     * Updates a list of specified overrides for each assignment.  Handles overrides in a transaction, so either all updates are applied or none. See {api:AssignmentOverridesController#update Update an assignment override} for available attributes.  All current overridden values must be supplied if they are to be retained; e.g. if due_at was overridden, but this PUT omits a value for due_at, due_at will no longer be overridden. If the override is adhoc and student_ids is not supplied, the target override set is unchanged. Target override sets cannot be changed for group or section overrides.  Errors are reported in an errors attribute, an array of errors corresponding to inputs.  Global errors will be reported as a single element errors array
     */
    @Test
    public void batchUpdateOverridesInCourseTest() {
        String courseId = null;
        List<String> assignmentOverrides = null;
        // List<AssignmentOverride> response = api.batchUpdateOverridesInCourse(courseId, assignmentOverrides);

        // TODO: test validations
    }

    /**
     * Create an assignment
     *
     * Create a new assignment for this course. The assignment is created in the active state.
     */
    @Test
    public void createAssignmentTest() {
        String courseId = null;
        String assignmentName = null;
        Integer assignmentPosition = null;
        List<String> assignmentSubmissionTypes = null;
        List<String> assignmentAllowedExtensions = null;
        Boolean assignmentTurnitinEnabled = null;
        Boolean assignmentVericiteEnabled = null;
        String assignmentTurnitinSettings = null;
        String assignmentIntegrationData = null;
        String assignmentIntegrationId = null;
        Boolean assignmentPeerReviews = null;
        Boolean assignmentAutomaticPeerReviews = null;
        Boolean assignmentNotifyOfUpdate = null;
        Integer assignmentGroupCategoryId = null;
        Integer assignmentGradeGroupStudentsIndividually = null;
        String assignmentExternalToolTagAttributes = null;
        BigDecimal assignmentPointsPossible = null;
        String assignmentGradingType = null;
        String assignmentDueAt = null;
        String assignmentLockAt = null;
        String assignmentUnlockAt = null;
        String assignmentDescription = null;
        Integer assignmentAssignmentGroupId = null;
        Boolean assignmentMuted = null;
        List<String> assignmentAssignmentOverrides = null;
        Boolean assignmentOnlyVisibleToOverrides = null;
        Boolean assignmentPublished = null;
        Integer assignmentGradingStandardId = null;
        Boolean assignmentOmitFromFinalGrade = null;
        Boolean assignmentQuizLti = null;
        Boolean assignmentModeratedGrading = null;
        // Assignment response = api.createAssignment(courseId, assignmentName, assignmentPosition, assignmentSubmissionTypes, assignmentAllowedExtensions, assignmentTurnitinEnabled, assignmentVericiteEnabled, assignmentTurnitinSettings, assignmentIntegrationData, assignmentIntegrationId, assignmentPeerReviews, assignmentAutomaticPeerReviews, assignmentNotifyOfUpdate, assignmentGroupCategoryId, assignmentGradeGroupStudentsIndividually, assignmentExternalToolTagAttributes, assignmentPointsPossible, assignmentGradingType, assignmentDueAt, assignmentLockAt, assignmentUnlockAt, assignmentDescription, assignmentAssignmentGroupId, assignmentMuted, assignmentAssignmentOverrides, assignmentOnlyVisibleToOverrides, assignmentPublished, assignmentGradingStandardId, assignmentOmitFromFinalGrade, assignmentQuizLti, assignmentModeratedGrading);

        // TODO: test validations
    }

    /**
     * Create an assignment override
     *
     * One of student_ids, group_id, or course_section_id must be present. At most one should be present; if multiple are present only the most specific (student_ids first, then group_id, then course_section_id) is used and any others are ignored.
     */
    @Test
    public void createAssignmentOverrideTest() {
        String courseId = null;
        String assignmentId = null;
        List<Integer> assignmentOverrideStudentIds = null;
        String assignmentOverrideTitle = null;
        Integer assignmentOverrideGroupId = null;
        Integer assignmentOverrideCourseSectionId = null;
        String assignmentOverrideDueAt = null;
        String assignmentOverrideUnlockAt = null;
        String assignmentOverrideLockAt = null;
        // AssignmentOverride response = api.createAssignmentOverride(courseId, assignmentId, assignmentOverrideStudentIds, assignmentOverrideTitle, assignmentOverrideGroupId, assignmentOverrideCourseSectionId, assignmentOverrideDueAt, assignmentOverrideUnlockAt, assignmentOverrideLockAt);

        // TODO: test validations
    }

    /**
     * Delete an assignment
     *
     * Delete the given assignment.
     */
    @Test
    public void deleteAssignmentTest() {
        String courseId = null;
        String id = null;
        // Assignment response = api.deleteAssignment(courseId, id);

        // TODO: test validations
    }

    /**
     * Delete an assignment override
     *
     * Deletes an override and returns its former details.
     */
    @Test
    public void deleteAssignmentOverrideTest() {
        String courseId = null;
        String assignmentId = null;
        String id = null;
        // AssignmentOverride response = api.deleteAssignmentOverride(courseId, assignmentId, id);

        // TODO: test validations
    }

    /**
     * Edit an assignment
     *
     * Modify an existing assignment.  If the assignment [assignment_overrides] key is absent, any existing overrides are kept as is. If the assignment [assignment_overrides] key is present, existing overrides are updated or deleted (and new ones created, as necessary) to match the provided list.
     */
    @Test
    public void editAssignmentTest() {
        String courseId = null;
        String id = null;
        String assignmentName = null;
        Integer assignmentPosition = null;
        List<String> assignmentSubmissionTypes = null;
        List<String> assignmentAllowedExtensions = null;
        Boolean assignmentTurnitinEnabled = null;
        Boolean assignmentVericiteEnabled = null;
        String assignmentTurnitinSettings = null;
        String assignmentIntegrationData = null;
        String assignmentIntegrationId = null;
        Boolean assignmentPeerReviews = null;
        Boolean assignmentAutomaticPeerReviews = null;
        Boolean assignmentNotifyOfUpdate = null;
        Integer assignmentGroupCategoryId = null;
        Integer assignmentGradeGroupStudentsIndividually = null;
        String assignmentExternalToolTagAttributes = null;
        BigDecimal assignmentPointsPossible = null;
        String assignmentGradingType = null;
        String assignmentDueAt = null;
        String assignmentLockAt = null;
        String assignmentUnlockAt = null;
        String assignmentDescription = null;
        Integer assignmentAssignmentGroupId = null;
        Boolean assignmentMuted = null;
        List<String> assignmentAssignmentOverrides = null;
        Boolean assignmentOnlyVisibleToOverrides = null;
        Boolean assignmentPublished = null;
        Integer assignmentGradingStandardId = null;
        Boolean assignmentOmitFromFinalGrade = null;
        Boolean assignmentModeratedGrading = null;
        // Assignment response = api.editAssignment(courseId, id, assignmentName, assignmentPosition, assignmentSubmissionTypes, assignmentAllowedExtensions, assignmentTurnitinEnabled, assignmentVericiteEnabled, assignmentTurnitinSettings, assignmentIntegrationData, assignmentIntegrationId, assignmentPeerReviews, assignmentAutomaticPeerReviews, assignmentNotifyOfUpdate, assignmentGroupCategoryId, assignmentGradeGroupStudentsIndividually, assignmentExternalToolTagAttributes, assignmentPointsPossible, assignmentGradingType, assignmentDueAt, assignmentLockAt, assignmentUnlockAt, assignmentDescription, assignmentAssignmentGroupId, assignmentMuted, assignmentAssignmentOverrides, assignmentOnlyVisibleToOverrides, assignmentPublished, assignmentGradingStandardId, assignmentOmitFromFinalGrade, assignmentModeratedGrading);

        // TODO: test validations
    }

    /**
     * Get a single assignment
     *
     * Returns the assignment with the given id.
     */
    @Test
    public void getSingleAssignmentTest() {
        String courseId = null;
        String id = null;
        List<String> include = null;
        Boolean overrideAssignmentDates = null;
        Boolean needsGradingCountBySection = null;
        Boolean allDates = null;
        // Assignment response = api.getSingleAssignment(courseId, id, include, overrideAssignmentDates, needsGradingCountBySection, allDates);

        // TODO: test validations
    }

    /**
     * Get a single assignment
     *
     * Returns the assignment with the given id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleAssignmentTestQueryMap() {
        String courseId = null;
        String id = null;
        AssignmentsApi.GetSingleAssignmentQueryParams queryParams = new AssignmentsApi.GetSingleAssignmentQueryParams()
            .include(null)
            .overrideAssignmentDates(null)
            .needsGradingCountBySection(null)
            .allDates(null);
        // Assignment response = api.getSingleAssignment(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single assignment override
     *
     * Returns details of the the override with the given id.
     */
    @Test
    public void getSingleAssignmentOverrideTest() {
        String courseId = null;
        String assignmentId = null;
        String id = null;
        // AssignmentOverride response = api.getSingleAssignmentOverride(courseId, assignmentId, id);

        // TODO: test validations
    }

    /**
     * List assignment overrides
     *
     * Returns the paginated list of overrides for this assignment that target sections/groups/students visible to the current user.
     */
    @Test
    public void listAssignmentOverridesTest() {
        String courseId = null;
        String assignmentId = null;
        // List<AssignmentOverride> response = api.listAssignmentOverrides(courseId, assignmentId);

        // TODO: test validations
    }

    /**
     * List assignments
     *
     * Returns the paginated list of assignments for the current context.
     */
    @Test
    public void listAssignmentsTest() {
        String courseId = null;
        List<String> include = null;
        String searchTerm = null;
        Boolean overrideAssignmentDates = null;
        Boolean needsGradingCountBySection = null;
        String bucket = null;
        List<String> assignmentIds = null;
        String orderBy = null;
        // List<Assignment> response = api.listAssignments(courseId, include, searchTerm, overrideAssignmentDates, needsGradingCountBySection, bucket, assignmentIds, orderBy);

        // TODO: test validations
    }

    /**
     * List assignments
     *
     * Returns the paginated list of assignments for the current context.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAssignmentsTestQueryMap() {
        String courseId = null;
        AssignmentsApi.ListAssignmentsQueryParams queryParams = new AssignmentsApi.ListAssignmentsQueryParams()
            .include(null)
            .searchTerm(null)
            .overrideAssignmentDates(null)
            .needsGradingCountBySection(null)
            .bucket(null)
            .assignmentIds(null)
            .orderBy(null);
        // List<Assignment> response = api.listAssignments(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List assignments for user
     *
     * Returns the paginated list of assignments for the specified user if the current user has rights to view. See {api:AssignmentsApiController#index List assignments} for valid arguments.
     */
    @Test
    public void listAssignmentsForUserTest() {
        String userId = null;
        String courseId = null;
        // api.listAssignmentsForUser(userId, courseId);

        // TODO: test validations
    }

    /**
     * Redirect to the assignment override for a group
     *
     * Responds with a redirect to the override for the given group, if any (404 otherwise).
     */
    @Test
    public void redirectToAssignmentOverrideForGroupTest() {
        String groupId = null;
        String assignmentId = null;
        // api.redirectToAssignmentOverrideForGroup(groupId, assignmentId);

        // TODO: test validations
    }

    /**
     * Redirect to the assignment override for a section
     *
     * Responds with a redirect to the override for the given section, if any (404 otherwise).
     */
    @Test
    public void redirectToAssignmentOverrideForSectionTest() {
        String courseSectionId = null;
        String assignmentId = null;
        // api.redirectToAssignmentOverrideForSection(courseSectionId, assignmentId);

        // TODO: test validations
    }

    /**
     * Update an assignment override
     *
     * All current overridden values must be supplied if they are to be retained; e.g. if due_at was overridden, but this PUT omits a value for due_at, due_at will no longer be overridden. If the override is adhoc and student_ids is not supplied, the target override set is unchanged. Target override sets cannot be changed for group or section overrides.
     */
    @Test
    public void updateAssignmentOverrideTest() {
        String courseId = null;
        String assignmentId = null;
        String id = null;
        List<Integer> assignmentOverrideStudentIds = null;
        String assignmentOverrideTitle = null;
        String assignmentOverrideDueAt = null;
        String assignmentOverrideUnlockAt = null;
        String assignmentOverrideLockAt = null;
        // AssignmentOverride response = api.updateAssignmentOverride(courseId, assignmentId, id, assignmentOverrideStudentIds, assignmentOverrideTitle, assignmentOverrideDueAt, assignmentOverrideUnlockAt, assignmentOverrideLockAt);

        // TODO: test validations
    }

}
