package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import com.instructure.canvas.model.ProvisionalGrade;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModeratedGradingApi
 */
public class ModeratedGradingApiTest {

    private ModeratedGradingApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ModeratedGradingApi.class);
    }

    /**
     * Bulk select provisional grades
     *
     * Choose which provisional grades will be received by associated students for an assignment. The caller must be the final grader for the assignment or an admin with :select_final_grade rights.
     */
    @Test
    public void bulkSelectProvisionalGradesTest() {
        String courseId = null;
        String assignmentId = null;
        // api.bulkSelectProvisionalGrades(courseId, assignmentId);

        // TODO: test validations
    }

    /**
     * Copy provisional grade
     *
     * Given a provisional grade, copy the grade (and associated submission comments and rubric assessments) to a \&quot;final\&quot; mark which can be edited or commented upon by a moderator prior to publication of grades.  Notes: * The student must be in the moderation set for the assignment. * The newly created grade will be selected. * The caller must have \&quot;Moderate Grades\&quot; rights in the course.
     */
    @Test
    public void copyProvisionalGradeTest() {
        String courseId = null;
        String assignmentId = null;
        String provisionalGradeId = null;
        // ProvisionalGrade response = api.copyProvisionalGrade(courseId, assignmentId, provisionalGradeId);

        // TODO: test validations
    }

    /**
     * List students selected for moderation
     *
     * Returns a paginated list of students selected for moderation
     */
    @Test
    public void listStudentsSelectedForModerationTest() {
        String courseId = null;
        String assignmentId = null;
        // List<User> response = api.listStudentsSelectedForModeration(courseId, assignmentId);

        // TODO: test validations
    }

    /**
     * Publish provisional grades for an assignment
     *
     * Publish the selected provisional grade for all submissions to an assignment. Use the \&quot;Select provisional grade\&quot; endpoint to choose which provisional grade to publish for a particular submission.  Students not in the moderation set will have their one and only provisional grade published.  WARNING: This is irreversible. This will overwrite existing grades in the gradebook.
     */
    @Test
    public void publishProvisionalGradesForAssignmentTest() {
        String courseId = null;
        String assignmentId = null;
        // api.publishProvisionalGradesForAssignment(courseId, assignmentId);

        // TODO: test validations
    }

    /**
     * Select provisional grade
     *
     * Choose which provisional grade the student should receive for a submission. The caller must be the final grader for the assignment or an admin with :select_final_grade rights.
     */
    @Test
    public void selectProvisionalGradeTest() {
        String courseId = null;
        String assignmentId = null;
        String provisionalGradeId = null;
        // api.selectProvisionalGrade(courseId, assignmentId, provisionalGradeId);

        // TODO: test validations
    }

    /**
     * Select students for moderation
     *
     * Returns an array of users that were selected for moderation
     */
    @Test
    public void selectStudentsForModerationTest() {
        String courseId = null;
        String assignmentId = null;
        List<BigDecimal> studentIds = null;
        // List<User> response = api.selectStudentsForModeration(courseId, assignmentId, studentIds);

        // TODO: test validations
    }

    /**
     * Show provisional grade status for a student
     *
     * Determine whether or not the student&#x27;s submission needs one or more provisional grades.
     */
    @Test
    public void showProvisionalGradeStatusForStudentTest() {
        String courseId = null;
        String assignmentId = null;
        String anonymousId = null;
        // api.showProvisionalGradeStatusForStudent(courseId, assignmentId, anonymousId);

        // TODO: test validations
    }

    /**
     * Show provisional grade status for a student
     *
     * Determine whether or not the student&#x27;s submission needs one or more provisional grades.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showProvisionalGradeStatusForStudentTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        ModeratedGradingApi.ShowProvisionalGradeStatusForStudentQueryParams queryParams = new ModeratedGradingApi.ShowProvisionalGradeStatusForStudentQueryParams()
            .anonymousId(null);
        // api.showProvisionalGradeStatusForStudent(courseId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * Show provisional grade status for a student
     *
     * Tell whether the student&#x27;s submission needs one or more provisional grades.
     */
    @Test
    public void showProvisionalGradeStatusForStudent_0Test() {
        String courseId = null;
        String assignmentId = null;
        Integer studentId = null;
        // api.showProvisionalGradeStatusForStudent_0(courseId, assignmentId, studentId);

        // TODO: test validations
    }

    /**
     * Show provisional grade status for a student
     *
     * Tell whether the student&#x27;s submission needs one or more provisional grades.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showProvisionalGradeStatusForStudent_0TestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        ModeratedGradingApi.ShowProvisionalGradeStatusForStudent0QueryParams queryParams = new ModeratedGradingApi.ShowProvisionalGradeStatusForStudent0QueryParams()
            .studentId(null);
        // api.showProvisionalGradeStatusForStudent_0(courseId, assignmentId, queryParams);

    // TODO: test validations
    }
}
