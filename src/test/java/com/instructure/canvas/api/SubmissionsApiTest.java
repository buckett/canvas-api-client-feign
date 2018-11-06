package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Progress;
import com.instructure.canvas.model.Submission;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubmissionsApi
 */
public class SubmissionsApiTest {

    private SubmissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SubmissionsApi.class);
    }

    /**
     * Get a single submission
     *
     * Get a single submission, based on user id.
     */
    @Test
    public void getSingleSubmissionCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        List<String> include = null;
        // api.getSingleSubmissionCourses(courseId, assignmentId, userId, include);

        // TODO: test validations
    }

    /**
     * Get a single submission
     *
     * Get a single submission, based on user id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleSubmissionCoursesTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        SubmissionsApi.GetSingleSubmissionCoursesQueryParams queryParams = new SubmissionsApi.GetSingleSubmissionCoursesQueryParams()
            .include(null);
        // api.getSingleSubmissionCourses(courseId, assignmentId, userId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single submission
     *
     * Get a single submission, based on user id.
     */
    @Test
    public void getSingleSubmissionSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String userId = null;
        List<String> include = null;
        // api.getSingleSubmissionSections(sectionId, assignmentId, userId, include);

        // TODO: test validations
    }

    /**
     * Get a single submission
     *
     * Get a single submission, based on user id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleSubmissionSectionsTestQueryMap() {
        String sectionId = null;
        String assignmentId = null;
        String userId = null;
        SubmissionsApi.GetSingleSubmissionSectionsQueryParams queryParams = new SubmissionsApi.GetSingleSubmissionSectionsQueryParams()
            .include(null);
        // api.getSingleSubmissionSections(sectionId, assignmentId, userId, queryParams);

    // TODO: test validations
    }
    /**
     * Grade or comment on multiple submissions
     *
     * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
     */
    @Test
    public void gradeOrCommentOnMultipleSubmissionsCoursesAssignmentsTest() {
        String courseId = null;
        String assignmentId = null;
        String gradeDataStudentIdPostedGrade = null;
        Boolean gradeDataStudentIdExcuse = null;
        Object gradeDataStudentIdRubricAssessment = null;
        String gradeDataStudentIdTextComment = null;
        Boolean gradeDataStudentIdGroupComment = null;
        String gradeDataStudentIdMediaCommentId = null;
        String gradeDataStudentIdMediaCommentType = null;
        List<Integer> gradeDataStudentIdFileIds = null;
        Integer gradeDataStudentIdAssignmentId = null;
        // Progress response = api.gradeOrCommentOnMultipleSubmissionsCoursesAssignments(courseId, assignmentId, gradeDataStudentIdPostedGrade, gradeDataStudentIdExcuse, gradeDataStudentIdRubricAssessment, gradeDataStudentIdTextComment, gradeDataStudentIdGroupComment, gradeDataStudentIdMediaCommentId, gradeDataStudentIdMediaCommentType, gradeDataStudentIdFileIds, gradeDataStudentIdAssignmentId);

        // TODO: test validations
    }

    /**
     * Grade or comment on multiple submissions
     *
     * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
     */
    @Test
    public void gradeOrCommentOnMultipleSubmissionsCoursesSubmissionsTest() {
        String courseId = null;
        String gradeDataStudentIdPostedGrade = null;
        Boolean gradeDataStudentIdExcuse = null;
        Object gradeDataStudentIdRubricAssessment = null;
        String gradeDataStudentIdTextComment = null;
        Boolean gradeDataStudentIdGroupComment = null;
        String gradeDataStudentIdMediaCommentId = null;
        String gradeDataStudentIdMediaCommentType = null;
        List<Integer> gradeDataStudentIdFileIds = null;
        Integer gradeDataStudentIdAssignmentId = null;
        // Progress response = api.gradeOrCommentOnMultipleSubmissionsCoursesSubmissions(courseId, gradeDataStudentIdPostedGrade, gradeDataStudentIdExcuse, gradeDataStudentIdRubricAssessment, gradeDataStudentIdTextComment, gradeDataStudentIdGroupComment, gradeDataStudentIdMediaCommentId, gradeDataStudentIdMediaCommentType, gradeDataStudentIdFileIds, gradeDataStudentIdAssignmentId);

        // TODO: test validations
    }

    /**
     * Grade or comment on multiple submissions
     *
     * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
     */
    @Test
    public void gradeOrCommentOnMultipleSubmissionsSectionsAssignmentsTest() {
        String sectionId = null;
        String assignmentId = null;
        String gradeDataStudentIdPostedGrade = null;
        Boolean gradeDataStudentIdExcuse = null;
        Object gradeDataStudentIdRubricAssessment = null;
        String gradeDataStudentIdTextComment = null;
        Boolean gradeDataStudentIdGroupComment = null;
        String gradeDataStudentIdMediaCommentId = null;
        String gradeDataStudentIdMediaCommentType = null;
        List<Integer> gradeDataStudentIdFileIds = null;
        Integer gradeDataStudentIdAssignmentId = null;
        // Progress response = api.gradeOrCommentOnMultipleSubmissionsSectionsAssignments(sectionId, assignmentId, gradeDataStudentIdPostedGrade, gradeDataStudentIdExcuse, gradeDataStudentIdRubricAssessment, gradeDataStudentIdTextComment, gradeDataStudentIdGroupComment, gradeDataStudentIdMediaCommentId, gradeDataStudentIdMediaCommentType, gradeDataStudentIdFileIds, gradeDataStudentIdAssignmentId);

        // TODO: test validations
    }

    /**
     * Grade or comment on multiple submissions
     *
     * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
     */
    @Test
    public void gradeOrCommentOnMultipleSubmissionsSectionsSubmissionsTest() {
        String sectionId = null;
        String gradeDataStudentIdPostedGrade = null;
        Boolean gradeDataStudentIdExcuse = null;
        Object gradeDataStudentIdRubricAssessment = null;
        String gradeDataStudentIdTextComment = null;
        Boolean gradeDataStudentIdGroupComment = null;
        String gradeDataStudentIdMediaCommentId = null;
        String gradeDataStudentIdMediaCommentType = null;
        List<Integer> gradeDataStudentIdFileIds = null;
        Integer gradeDataStudentIdAssignmentId = null;
        // Progress response = api.gradeOrCommentOnMultipleSubmissionsSectionsSubmissions(sectionId, gradeDataStudentIdPostedGrade, gradeDataStudentIdExcuse, gradeDataStudentIdRubricAssessment, gradeDataStudentIdTextComment, gradeDataStudentIdGroupComment, gradeDataStudentIdMediaCommentId, gradeDataStudentIdMediaCommentType, gradeDataStudentIdFileIds, gradeDataStudentIdAssignmentId);

        // TODO: test validations
    }

    /**
     * Grade or comment on a submission
     *
     * Comment on and/or update the grading for a student&#x27;s assignment submission. If any submission or rubric_assessment arguments are provided, the user must have permission to manage grades in the appropriate context (course or section).
     */
    @Test
    public void gradeOrCommentOnSubmissionCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        String commentTextComment = null;
        Boolean commentGroupComment = null;
        String commentMediaCommentId = null;
        String commentMediaCommentType = null;
        List<Integer> commentFileIds = null;
        String includeVisibility = null;
        String submissionPostedGrade = null;
        Boolean submissionExcuse = null;
        String submissionLatePolicyStatus = null;
        Integer submissionSecondsLateOverride = null;
        Object rubricAssessment = null;
        // api.gradeOrCommentOnSubmissionCourses(courseId, assignmentId, userId, commentTextComment, commentGroupComment, commentMediaCommentId, commentMediaCommentType, commentFileIds, includeVisibility, submissionPostedGrade, submissionExcuse, submissionLatePolicyStatus, submissionSecondsLateOverride, rubricAssessment);

        // TODO: test validations
    }

    /**
     * Grade or comment on a submission
     *
     * Comment on and/or update the grading for a student&#x27;s assignment submission. If any submission or rubric_assessment arguments are provided, the user must have permission to manage grades in the appropriate context (course or section).
     */
    @Test
    public void gradeOrCommentOnSubmissionSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String userId = null;
        String commentTextComment = null;
        Boolean commentGroupComment = null;
        String commentMediaCommentId = null;
        String commentMediaCommentType = null;
        List<Integer> commentFileIds = null;
        String includeVisibility = null;
        String submissionPostedGrade = null;
        Boolean submissionExcuse = null;
        String submissionLatePolicyStatus = null;
        Integer submissionSecondsLateOverride = null;
        Object rubricAssessment = null;
        // api.gradeOrCommentOnSubmissionSections(sectionId, assignmentId, userId, commentTextComment, commentGroupComment, commentMediaCommentId, commentMediaCommentType, commentFileIds, includeVisibility, submissionPostedGrade, submissionExcuse, submissionLatePolicyStatus, submissionSecondsLateOverride, rubricAssessment);

        // TODO: test validations
    }

    /**
     * List assignment submissions
     *
     * A paginated list of all existing submissions for an assignment.
     */
    @Test
    public void listAssignmentSubmissionsCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        List<String> include = null;
        Boolean grouped = null;
        // List<Submission> response = api.listAssignmentSubmissionsCourses(courseId, assignmentId, include, grouped);

        // TODO: test validations
    }

    /**
     * List assignment submissions
     *
     * A paginated list of all existing submissions for an assignment.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAssignmentSubmissionsCoursesTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        SubmissionsApi.ListAssignmentSubmissionsCoursesQueryParams queryParams = new SubmissionsApi.ListAssignmentSubmissionsCoursesQueryParams()
            .include(null)
            .grouped(null);
        // List<Submission> response = api.listAssignmentSubmissionsCourses(courseId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * List assignment submissions
     *
     * A paginated list of all existing submissions for an assignment.
     */
    @Test
    public void listAssignmentSubmissionsSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        List<String> include = null;
        Boolean grouped = null;
        // List<Submission> response = api.listAssignmentSubmissionsSections(sectionId, assignmentId, include, grouped);

        // TODO: test validations
    }

    /**
     * List assignment submissions
     *
     * A paginated list of all existing submissions for an assignment.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAssignmentSubmissionsSectionsTestQueryMap() {
        String sectionId = null;
        String assignmentId = null;
        SubmissionsApi.ListAssignmentSubmissionsSectionsQueryParams queryParams = new SubmissionsApi.ListAssignmentSubmissionsSectionsQueryParams()
            .include(null)
            .grouped(null);
        // List<Submission> response = api.listAssignmentSubmissionsSections(sectionId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * List gradeable students
     *
     * A paginated list of students eligible to submit the assignment. The caller must have permission to view grades.  Section-limited instructors will only see students in their own sections.  returns [UserDisplay]
     */
    @Test
    public void listGradeableStudentsTest() {
        String courseId = null;
        String assignmentId = null;
        // api.listGradeableStudents(courseId, assignmentId);

        // TODO: test validations
    }

    /**
     * List multiple assignments gradeable students
     *
     * A paginated list of students eligible to submit a list of assignments. The caller must have permission to view grades for the requested course.  Section-limited instructors will only see students in their own sections.
     */
    @Test
    public void listMultipleAssignmentsGradeableStudentsTest() {
        String courseId = null;
        List<String> assignmentIds = null;
        // api.listMultipleAssignmentsGradeableStudents(courseId, assignmentIds);

        // TODO: test validations
    }

    /**
     * List multiple assignments gradeable students
     *
     * A paginated list of students eligible to submit a list of assignments. The caller must have permission to view grades for the requested course.  Section-limited instructors will only see students in their own sections.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listMultipleAssignmentsGradeableStudentsTestQueryMap() {
        String courseId = null;
        SubmissionsApi.ListMultipleAssignmentsGradeableStudentsQueryParams queryParams = new SubmissionsApi.ListMultipleAssignmentsGradeableStudentsQueryParams()
            .assignmentIds(null);
        // api.listMultipleAssignmentsGradeableStudents(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List submissions for multiple assignments
     *
     * A paginated list of all existing submissions for a given set of students and assignments.
     */
    @Test
    public void listSubmissionsForMultipleAssignmentsCoursesTest() {
        String courseId = null;
        List<String> studentIds = null;
        List<String> assignmentIds = null;
        Boolean grouped = null;
        Boolean postToSis = null;
        String submittedSince = null;
        String gradedSince = null;
        Integer gradingPeriodId = null;
        String workflowState = null;
        String enrollmentState = null;
        Boolean stateBasedOnDate = null;
        String order = null;
        String orderDirection = null;
        List<String> include = null;
        // api.listSubmissionsForMultipleAssignmentsCourses(courseId, studentIds, assignmentIds, grouped, postToSis, submittedSince, gradedSince, gradingPeriodId, workflowState, enrollmentState, stateBasedOnDate, order, orderDirection, include);

        // TODO: test validations
    }

    /**
     * List submissions for multiple assignments
     *
     * A paginated list of all existing submissions for a given set of students and assignments.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listSubmissionsForMultipleAssignmentsCoursesTestQueryMap() {
        String courseId = null;
        SubmissionsApi.ListSubmissionsForMultipleAssignmentsCoursesQueryParams queryParams = new SubmissionsApi.ListSubmissionsForMultipleAssignmentsCoursesQueryParams()
            .studentIds(null)
            .assignmentIds(null)
            .grouped(null)
            .postToSis(null)
            .submittedSince(null)
            .gradedSince(null)
            .gradingPeriodId(null)
            .workflowState(null)
            .enrollmentState(null)
            .stateBasedOnDate(null)
            .order(null)
            .orderDirection(null)
            .include(null);
        // api.listSubmissionsForMultipleAssignmentsCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List submissions for multiple assignments
     *
     * A paginated list of all existing submissions for a given set of students and assignments.
     */
    @Test
    public void listSubmissionsForMultipleAssignmentsSectionsTest() {
        String sectionId = null;
        List<String> studentIds = null;
        List<String> assignmentIds = null;
        Boolean grouped = null;
        Boolean postToSis = null;
        String submittedSince = null;
        String gradedSince = null;
        Integer gradingPeriodId = null;
        String workflowState = null;
        String enrollmentState = null;
        Boolean stateBasedOnDate = null;
        String order = null;
        String orderDirection = null;
        List<String> include = null;
        // api.listSubmissionsForMultipleAssignmentsSections(sectionId, studentIds, assignmentIds, grouped, postToSis, submittedSince, gradedSince, gradingPeriodId, workflowState, enrollmentState, stateBasedOnDate, order, orderDirection, include);

        // TODO: test validations
    }

    /**
     * List submissions for multiple assignments
     *
     * A paginated list of all existing submissions for a given set of students and assignments.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listSubmissionsForMultipleAssignmentsSectionsTestQueryMap() {
        String sectionId = null;
        SubmissionsApi.ListSubmissionsForMultipleAssignmentsSectionsQueryParams queryParams = new SubmissionsApi.ListSubmissionsForMultipleAssignmentsSectionsQueryParams()
            .studentIds(null)
            .assignmentIds(null)
            .grouped(null)
            .postToSis(null)
            .submittedSince(null)
            .gradedSince(null)
            .gradingPeriodId(null)
            .workflowState(null)
            .enrollmentState(null)
            .stateBasedOnDate(null)
            .order(null)
            .orderDirection(null)
            .include(null);
        // api.listSubmissionsForMultipleAssignmentsSections(sectionId, queryParams);

    // TODO: test validations
    }
    /**
     * Mark submission as read
     *
     * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markSubmissionAsReadCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        // api.markSubmissionAsReadCourses(courseId, assignmentId, userId);

        // TODO: test validations
    }

    /**
     * Mark submission as read
     *
     * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markSubmissionAsReadSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String userId = null;
        // api.markSubmissionAsReadSections(sectionId, assignmentId, userId);

        // TODO: test validations
    }

    /**
     * Mark submission as unread
     *
     * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markSubmissionAsUnreadCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        // api.markSubmissionAsUnreadCourses(courseId, assignmentId, userId);

        // TODO: test validations
    }

    /**
     * Mark submission as unread
     *
     * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markSubmissionAsUnreadSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String userId = null;
        // api.markSubmissionAsUnreadSections(sectionId, assignmentId, userId);

        // TODO: test validations
    }

    /**
     * Submission Summary
     *
     * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
     */
    @Test
    public void submissionSummaryCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        Boolean grouped = null;
        // api.submissionSummaryCourses(courseId, assignmentId, grouped);

        // TODO: test validations
    }

    /**
     * Submission Summary
     *
     * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void submissionSummaryCoursesTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        SubmissionsApi.SubmissionSummaryCoursesQueryParams queryParams = new SubmissionsApi.SubmissionSummaryCoursesQueryParams()
            .grouped(null);
        // api.submissionSummaryCourses(courseId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * Submission Summary
     *
     * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
     */
    @Test
    public void submissionSummarySectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        Boolean grouped = null;
        // api.submissionSummarySections(sectionId, assignmentId, grouped);

        // TODO: test validations
    }

    /**
     * Submission Summary
     *
     * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void submissionSummarySectionsTestQueryMap() {
        String sectionId = null;
        String assignmentId = null;
        SubmissionsApi.SubmissionSummarySectionsQueryParams queryParams = new SubmissionsApi.SubmissionSummarySectionsQueryParams()
            .grouped(null);
        // api.submissionSummarySections(sectionId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * Submit an assignment
     *
     * Make a submission for an assignment. You must be enrolled as a student in the course/section to do this.  All online turn-in submission types are supported in this API. However, there are a few things that are not yet supported:  * Files can be submitted based on a file ID of a user or group file. However, there is no API yet for listing the user and group files, or uploading new files via the API. A file upload API is coming soon. * Media comments can be submitted, however, there is no API yet for creating a media comment to submit. * Integration with Google Docs is not yet supported.
     */
    @Test
    public void submitAssignmentCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String commentTextComment = null;
        String submissionSubmissionType = null;
        String submissionBody = null;
        String submissionUrl = null;
        List<Integer> submissionFileIds = null;
        String submissionMediaCommentId = null;
        String submissionMediaCommentType = null;
        // api.submitAssignmentCourses(courseId, assignmentId, commentTextComment, submissionSubmissionType, submissionBody, submissionUrl, submissionFileIds, submissionMediaCommentId, submissionMediaCommentType);

        // TODO: test validations
    }

    /**
     * Submit an assignment
     *
     * Make a submission for an assignment. You must be enrolled as a student in the course/section to do this.  All online turn-in submission types are supported in this API. However, there are a few things that are not yet supported:  * Files can be submitted based on a file ID of a user or group file. However, there is no API yet for listing the user and group files, or uploading new files via the API. A file upload API is coming soon. * Media comments can be submitted, however, there is no API yet for creating a media comment to submit. * Integration with Google Docs is not yet supported.
     */
    @Test
    public void submitAssignmentSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String commentTextComment = null;
        String submissionSubmissionType = null;
        String submissionBody = null;
        String submissionUrl = null;
        List<Integer> submissionFileIds = null;
        String submissionMediaCommentId = null;
        String submissionMediaCommentType = null;
        // api.submitAssignmentSections(sectionId, assignmentId, commentTextComment, submissionSubmissionType, submissionBody, submissionUrl, submissionFileIds, submissionMediaCommentId, submissionMediaCommentType);

        // TODO: test validations
    }

    /**
     * Upload a file
     *
     * Upload a file to a submission.  This API endpoint is the first step in uploading a file to a submission as a student. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  The final step of the file upload workflow will return the attachment data, including the new file id. The caller can then POST to submit the +online_upload+ assignment with these file ids.
     */
    @Test
    public void uploadFileCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        // api.uploadFileCourses(courseId, assignmentId, userId);

        // TODO: test validations
    }

    /**
     * Upload a file
     *
     * Upload a file to a submission.  This API endpoint is the first step in uploading a file to a submission as a student. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  The final step of the file upload workflow will return the attachment data, including the new file id. The caller can then POST to submit the +online_upload+ assignment with these file ids.
     */
    @Test
    public void uploadFileSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String userId = null;
        // api.uploadFileSections(sectionId, assignmentId, userId);

        // TODO: test validations
    }

}
