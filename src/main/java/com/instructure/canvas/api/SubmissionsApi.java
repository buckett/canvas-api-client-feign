package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Progress;
import com.instructure.canvas.model.Submission;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface SubmissionsApi extends ApiClient.Api {

  /**
   * Get a single submission
   * Get a single submission, based on user id.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   * @param include Associations to include with the group. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getSingleSubmissionCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId, @Param("include") List<String> include);
  

  /**
   * Get a single submission
   * Get a single submission, based on user id.
   * Note, this is equivalent to the other <code>getSingleSubmissionCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleSubmissionCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the group. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleSubmissionCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleSubmissionCourses</code> method in a fluent style.
   */
  public static class GetSingleSubmissionCoursesQueryParams extends HashMap<String, Object> {
    public GetSingleSubmissionCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single submission
   * Get a single submission, based on user id.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   * @param include Associations to include with the group. (optional)
   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{userId}?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getSingleSubmissionSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("userId") String userId, @Param("include") List<String> include);
  

  /**
   * Get a single submission
   * Get a single submission, based on user id.
   * Note, this is equivalent to the other <code>getSingleSubmissionSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleSubmissionSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the group. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{userId}?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleSubmissionSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleSubmissionSections</code> method in a fluent style.
   */
  public static class GetSingleSubmissionSectionsQueryParams extends HashMap<String, Object> {
    public GetSingleSubmissionSectionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Grade or comment on multiple submissions
   * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param gradeDataStudentIdPostedGrade  (optional)
   * @param gradeDataStudentIdExcuse  (optional)
   * @param gradeDataStudentIdRubricAssessment  (optional)
   * @param gradeDataStudentIdTextComment  (optional)
   * @param gradeDataStudentIdGroupComment  (optional)
   * @param gradeDataStudentIdMediaCommentId  (optional)
   * @param gradeDataStudentIdMediaCommentType  (optional)
   * @param gradeDataStudentIdFileIds  (optional)
   * @param gradeDataStudentIdAssignmentId  (optional)
   * @return Progress
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/submissions/update_grades")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress gradeOrCommentOnMultipleSubmissionsCoursesAssignments(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("gradeDataStudentIdPostedGrade") String gradeDataStudentIdPostedGrade, @Param("gradeDataStudentIdExcuse") Boolean gradeDataStudentIdExcuse, @Param("gradeDataStudentIdRubricAssessment") Object gradeDataStudentIdRubricAssessment, @Param("gradeDataStudentIdTextComment") String gradeDataStudentIdTextComment, @Param("gradeDataStudentIdGroupComment") Boolean gradeDataStudentIdGroupComment, @Param("gradeDataStudentIdMediaCommentId") String gradeDataStudentIdMediaCommentId, @Param("gradeDataStudentIdMediaCommentType") String gradeDataStudentIdMediaCommentType, @Param("gradeDataStudentIdFileIds") List<Integer> gradeDataStudentIdFileIds, @Param("gradeDataStudentIdAssignmentId") Integer gradeDataStudentIdAssignmentId);
  
  /**
   * Grade or comment on multiple submissions
   * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
   * @param courseId ID (required)
   * @param gradeDataStudentIdPostedGrade  (optional)
   * @param gradeDataStudentIdExcuse  (optional)
   * @param gradeDataStudentIdRubricAssessment  (optional)
   * @param gradeDataStudentIdTextComment  (optional)
   * @param gradeDataStudentIdGroupComment  (optional)
   * @param gradeDataStudentIdMediaCommentId  (optional)
   * @param gradeDataStudentIdMediaCommentType  (optional)
   * @param gradeDataStudentIdFileIds  (optional)
   * @param gradeDataStudentIdAssignmentId  (optional)
   * @return Progress
   */
  @RequestLine("POST /v1/courses/{courseId}/submissions/update_grades")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress gradeOrCommentOnMultipleSubmissionsCoursesSubmissions(@Param("courseId") String courseId, @Param("gradeDataStudentIdPostedGrade") String gradeDataStudentIdPostedGrade, @Param("gradeDataStudentIdExcuse") Boolean gradeDataStudentIdExcuse, @Param("gradeDataStudentIdRubricAssessment") Object gradeDataStudentIdRubricAssessment, @Param("gradeDataStudentIdTextComment") String gradeDataStudentIdTextComment, @Param("gradeDataStudentIdGroupComment") Boolean gradeDataStudentIdGroupComment, @Param("gradeDataStudentIdMediaCommentId") String gradeDataStudentIdMediaCommentId, @Param("gradeDataStudentIdMediaCommentType") String gradeDataStudentIdMediaCommentType, @Param("gradeDataStudentIdFileIds") List<Integer> gradeDataStudentIdFileIds, @Param("gradeDataStudentIdAssignmentId") Integer gradeDataStudentIdAssignmentId);
  
  /**
   * Grade or comment on multiple submissions
   * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param gradeDataStudentIdPostedGrade  (optional)
   * @param gradeDataStudentIdExcuse  (optional)
   * @param gradeDataStudentIdRubricAssessment  (optional)
   * @param gradeDataStudentIdTextComment  (optional)
   * @param gradeDataStudentIdGroupComment  (optional)
   * @param gradeDataStudentIdMediaCommentId  (optional)
   * @param gradeDataStudentIdMediaCommentType  (optional)
   * @param gradeDataStudentIdFileIds  (optional)
   * @param gradeDataStudentIdAssignmentId  (optional)
   * @return Progress
   */
  @RequestLine("POST /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/update_grades")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress gradeOrCommentOnMultipleSubmissionsSectionsAssignments(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("gradeDataStudentIdPostedGrade") String gradeDataStudentIdPostedGrade, @Param("gradeDataStudentIdExcuse") Boolean gradeDataStudentIdExcuse, @Param("gradeDataStudentIdRubricAssessment") Object gradeDataStudentIdRubricAssessment, @Param("gradeDataStudentIdTextComment") String gradeDataStudentIdTextComment, @Param("gradeDataStudentIdGroupComment") Boolean gradeDataStudentIdGroupComment, @Param("gradeDataStudentIdMediaCommentId") String gradeDataStudentIdMediaCommentId, @Param("gradeDataStudentIdMediaCommentType") String gradeDataStudentIdMediaCommentType, @Param("gradeDataStudentIdFileIds") List<Integer> gradeDataStudentIdFileIds, @Param("gradeDataStudentIdAssignmentId") Integer gradeDataStudentIdAssignmentId);
  
  /**
   * Grade or comment on multiple submissions
   * Update the grading and comments on multiple student&#x27;s assignment submissions in an asynchronous job.  The user must have permission to manage grades in the appropriate context (course or section).
   * @param sectionId ID (required)
   * @param gradeDataStudentIdPostedGrade  (optional)
   * @param gradeDataStudentIdExcuse  (optional)
   * @param gradeDataStudentIdRubricAssessment  (optional)
   * @param gradeDataStudentIdTextComment  (optional)
   * @param gradeDataStudentIdGroupComment  (optional)
   * @param gradeDataStudentIdMediaCommentId  (optional)
   * @param gradeDataStudentIdMediaCommentType  (optional)
   * @param gradeDataStudentIdFileIds  (optional)
   * @param gradeDataStudentIdAssignmentId  (optional)
   * @return Progress
   */
  @RequestLine("POST /v1/sections/{sectionId}/submissions/update_grades")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress gradeOrCommentOnMultipleSubmissionsSectionsSubmissions(@Param("sectionId") String sectionId, @Param("gradeDataStudentIdPostedGrade") String gradeDataStudentIdPostedGrade, @Param("gradeDataStudentIdExcuse") Boolean gradeDataStudentIdExcuse, @Param("gradeDataStudentIdRubricAssessment") Object gradeDataStudentIdRubricAssessment, @Param("gradeDataStudentIdTextComment") String gradeDataStudentIdTextComment, @Param("gradeDataStudentIdGroupComment") Boolean gradeDataStudentIdGroupComment, @Param("gradeDataStudentIdMediaCommentId") String gradeDataStudentIdMediaCommentId, @Param("gradeDataStudentIdMediaCommentType") String gradeDataStudentIdMediaCommentType, @Param("gradeDataStudentIdFileIds") List<Integer> gradeDataStudentIdFileIds, @Param("gradeDataStudentIdAssignmentId") Integer gradeDataStudentIdAssignmentId);
  
  /**
   * Grade or comment on a submission
   * Comment on and/or update the grading for a student&#x27;s assignment submission. If any submission or rubric_assessment arguments are provided, the user must have permission to manage grades in the appropriate context (course or section).
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   * @param commentTextComment  (optional)
   * @param commentGroupComment  (optional)
   * @param commentMediaCommentId  (optional)
   * @param commentMediaCommentType  (optional)
   * @param commentFileIds  (optional)
   * @param includeVisibility  (optional)
   * @param submissionPostedGrade  (optional)
   * @param submissionExcuse  (optional)
   * @param submissionLatePolicyStatus  (optional)
   * @param submissionSecondsLateOverride  (optional)
   * @param rubricAssessment  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void gradeOrCommentOnSubmissionCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId, @Param("commentTextComment") String commentTextComment, @Param("commentGroupComment") Boolean commentGroupComment, @Param("commentMediaCommentId") String commentMediaCommentId, @Param("commentMediaCommentType") String commentMediaCommentType, @Param("commentFileIds") List<Integer> commentFileIds, @Param("includeVisibility") String includeVisibility, @Param("submissionPostedGrade") String submissionPostedGrade, @Param("submissionExcuse") Boolean submissionExcuse, @Param("submissionLatePolicyStatus") String submissionLatePolicyStatus, @Param("submissionSecondsLateOverride") Integer submissionSecondsLateOverride, @Param("rubricAssessment") Object rubricAssessment);
  
  /**
   * Grade or comment on a submission
   * Comment on and/or update the grading for a student&#x27;s assignment submission. If any submission or rubric_assessment arguments are provided, the user must have permission to manage grades in the appropriate context (course or section).
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   * @param commentTextComment  (optional)
   * @param commentGroupComment  (optional)
   * @param commentMediaCommentId  (optional)
   * @param commentMediaCommentType  (optional)
   * @param commentFileIds  (optional)
   * @param includeVisibility  (optional)
   * @param submissionPostedGrade  (optional)
   * @param submissionExcuse  (optional)
   * @param submissionLatePolicyStatus  (optional)
   * @param submissionSecondsLateOverride  (optional)
   * @param rubricAssessment  (optional)
   */
  @RequestLine("PUT /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{userId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void gradeOrCommentOnSubmissionSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("userId") String userId, @Param("commentTextComment") String commentTextComment, @Param("commentGroupComment") Boolean commentGroupComment, @Param("commentMediaCommentId") String commentMediaCommentId, @Param("commentMediaCommentType") String commentMediaCommentType, @Param("commentFileIds") List<Integer> commentFileIds, @Param("includeVisibility") String includeVisibility, @Param("submissionPostedGrade") String submissionPostedGrade, @Param("submissionExcuse") Boolean submissionExcuse, @Param("submissionLatePolicyStatus") String submissionLatePolicyStatus, @Param("submissionSecondsLateOverride") Integer submissionSecondsLateOverride, @Param("rubricAssessment") Object rubricAssessment);
  
  /**
   * List assignment submissions
   * A paginated list of all existing submissions for an assignment.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param include Associations to include with the group.  \&quot;group\&quot; will add group_id and group_name. (optional)
   * @param grouped If this argument is true, the response will be grouped by student groups. (optional)
   * @return List&lt;Submission&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submissions?include={include}&grouped={grouped}")
  @Headers({
      "Accept: application/json",
  })
  List<Submission> listAssignmentSubmissionsCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("include") List<String> include, @Param("grouped") Boolean grouped);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Submission&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Submission> listAssignmentSubmissionsCourses(URI uri);
  

  /**
   * List assignment submissions
   * A paginated list of all existing submissions for an assignment.
   * Note, this is equivalent to the other <code>listAssignmentSubmissionsCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAssignmentSubmissionsCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the group.  \&quot;group\&quot; will add group_id and group_name. (optional)</li>
   *   <li>grouped - If this argument is true, the response will be grouped by student groups. (optional)</li>
   *   </ul>
   * @return List&lt;Submission&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submissions?include={include}&grouped={grouped}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Submission> listAssignmentSubmissionsCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAssignmentSubmissionsCourses</code> method in a fluent style.
   */
  public static class ListAssignmentSubmissionsCoursesQueryParams extends HashMap<String, Object> {
    public ListAssignmentSubmissionsCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAssignmentSubmissionsCoursesQueryParams grouped(final Boolean value) {
      put("grouped", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List assignment submissions
   * A paginated list of all existing submissions for an assignment.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param include Associations to include with the group.  \&quot;group\&quot; will add group_id and group_name. (optional)
   * @param grouped If this argument is true, the response will be grouped by student groups. (optional)
   * @return List&lt;Submission&gt;
   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submissions?include={include}&grouped={grouped}")
  @Headers({
      "Accept: application/json",
  })
  List<Submission> listAssignmentSubmissionsSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("include") List<String> include, @Param("grouped") Boolean grouped);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Submission&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Submission> listAssignmentSubmissionsSections(URI uri);
  

  /**
   * List assignment submissions
   * A paginated list of all existing submissions for an assignment.
   * Note, this is equivalent to the other <code>listAssignmentSubmissionsSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAssignmentSubmissionsSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the group.  \&quot;group\&quot; will add group_id and group_name. (optional)</li>
   *   <li>grouped - If this argument is true, the response will be grouped by student groups. (optional)</li>
   *   </ul>
   * @return List&lt;Submission&gt;

   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submissions?include={include}&grouped={grouped}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Submission> listAssignmentSubmissionsSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAssignmentSubmissionsSections</code> method in a fluent style.
   */
  public static class ListAssignmentSubmissionsSectionsQueryParams extends HashMap<String, Object> {
    public ListAssignmentSubmissionsSectionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAssignmentSubmissionsSectionsQueryParams grouped(final Boolean value) {
      put("grouped", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List gradeable students
   * A paginated list of students eligible to submit the assignment. The caller must have permission to view grades.  Section-limited instructors will only see students in their own sections.  returns [UserDisplay]
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/gradeable_students")
  @Headers({
      "Accept: */*",
  })
  void listGradeableStudents(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId);
  
  /**
   * List multiple assignments gradeable students
   * A paginated list of students eligible to submit a list of assignments. The caller must have permission to view grades for the requested course.  Section-limited instructors will only see students in their own sections.
   * @param courseId ID (required)
   * @param assignmentIds Assignments being requested (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/gradeable_students?assignment_ids={assignmentIds}")
  @Headers({
      "Accept: */*",
  })
  void listMultipleAssignmentsGradeableStudents(@Param("courseId") String courseId, @Param("assignmentIds") List<String> assignmentIds);
  

  /**
   * List multiple assignments gradeable students
   * A paginated list of students eligible to submit a list of assignments. The caller must have permission to view grades for the requested course.  Section-limited instructors will only see students in their own sections.
   * Note, this is equivalent to the other <code>listMultipleAssignmentsGradeableStudents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMultipleAssignmentsGradeableStudentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>assignmentIds - Assignments being requested (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/gradeable_students?assignment_ids={assignmentIds}")
  @Headers({
      "Content-Type: */*",
  })
  void listMultipleAssignmentsGradeableStudents(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listMultipleAssignmentsGradeableStudents</code> method in a fluent style.
   */
  public static class ListMultipleAssignmentsGradeableStudentsQueryParams extends HashMap<String, Object> {
    public ListMultipleAssignmentsGradeableStudentsQueryParams assignmentIds(final List<String> value) {
      put("assignment_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List submissions for multiple assignments
   * A paginated list of all existing submissions for a given set of students and assignments.
   * @param courseId ID (required)
   * @param studentIds List of student ids to return submissions for. If this argument is omitted, return submissions for the calling user. Students may only list their own submissions. Observers may only list those of associated students. The special id \&quot;all\&quot; will return submissions for all students in the course/section as appropriate. (optional)
   * @param assignmentIds List of assignments to return submissions for. If none are given, submissions for all assignments are returned. (optional)
   * @param grouped If this argument is present, the response will be grouped by student, rather than a flat array of submissions. (optional)
   * @param postToSis If this argument is set to true, the response will only include submissions for assignments that have the post_to_sis flag set to true and user enrollments that were added through sis. (optional)
   * @param submittedSince If this argument is set, the response will only include submissions that were submitted after the specified date_time. This will exclude submissions that do not have a submitted_at which will exclude unsubmitted submissions. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param gradedSince If this argument is set, the response will only include submissions that were graded after the specified date_time. This will exclude submissions that have not been graded. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param gradingPeriodId The id of the grading period in which submissions are being requested (Requires grading periods to exist on the account) (optional)
   * @param workflowState The current status of the submission (optional)
   * @param enrollmentState The current state of the enrollments. If omitted will include all enrollments that are not deleted. (optional)
   * @param stateBasedOnDate If omitted it is set to true. When set to false it will ignore the effective state of the student enrollments and use the workflow_state for the enrollments. The argument is ignored unless enrollment_state argument is also passed. (optional)
   * @param order The order submissions will be returned in.  Defaults to \&quot;id\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)
   * @param orderDirection Determines whether ordered results are returned in ascending or descending order.  Defaults to \&quot;ascending\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)
   * @param include Associations to include with the group. &#x60;total_scores&#x60; requires the &#x60;grouped&#x60; argument. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/students/submissions?student_ids={studentIds}&assignment_ids={assignmentIds}&grouped={grouped}&post_to_sis={postToSis}&submitted_since={submittedSince}&graded_since={gradedSince}&grading_period_id={gradingPeriodId}&workflow_state={workflowState}&enrollment_state={enrollmentState}&state_based_on_date={stateBasedOnDate}&order={order}&order_direction={orderDirection}&include={include}")
  @Headers({
      "Accept: */*",
  })
  void listSubmissionsForMultipleAssignmentsCourses(@Param("courseId") String courseId, @Param("studentIds") List<String> studentIds, @Param("assignmentIds") List<String> assignmentIds, @Param("grouped") Boolean grouped, @Param("postToSis") Boolean postToSis, @Param("submittedSince") String submittedSince, @Param("gradedSince") String gradedSince, @Param("gradingPeriodId") Integer gradingPeriodId, @Param("workflowState") String workflowState, @Param("enrollmentState") String enrollmentState, @Param("stateBasedOnDate") Boolean stateBasedOnDate, @Param("order") String order, @Param("orderDirection") String orderDirection, @Param("include") List<String> include);
  

  /**
   * List submissions for multiple assignments
   * A paginated list of all existing submissions for a given set of students and assignments.
   * Note, this is equivalent to the other <code>listSubmissionsForMultipleAssignmentsCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSubmissionsForMultipleAssignmentsCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>studentIds - List of student ids to return submissions for. If this argument is omitted, return submissions for the calling user. Students may only list their own submissions. Observers may only list those of associated students. The special id \&quot;all\&quot; will return submissions for all students in the course/section as appropriate. (optional)</li>
   *   <li>assignmentIds - List of assignments to return submissions for. If none are given, submissions for all assignments are returned. (optional)</li>
   *   <li>grouped - If this argument is present, the response will be grouped by student, rather than a flat array of submissions. (optional)</li>
   *   <li>postToSis - If this argument is set to true, the response will only include submissions for assignments that have the post_to_sis flag set to true and user enrollments that were added through sis. (optional)</li>
   *   <li>submittedSince - If this argument is set, the response will only include submissions that were submitted after the specified date_time. This will exclude submissions that do not have a submitted_at which will exclude unsubmitted submissions. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>gradedSince - If this argument is set, the response will only include submissions that were graded after the specified date_time. This will exclude submissions that have not been graded. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>gradingPeriodId - The id of the grading period in which submissions are being requested (Requires grading periods to exist on the account) (optional)</li>
   *   <li>workflowState - The current status of the submission (optional)</li>
   *   <li>enrollmentState - The current state of the enrollments. If omitted will include all enrollments that are not deleted. (optional)</li>
   *   <li>stateBasedOnDate - If omitted it is set to true. When set to false it will ignore the effective state of the student enrollments and use the workflow_state for the enrollments. The argument is ignored unless enrollment_state argument is also passed. (optional)</li>
   *   <li>order - The order submissions will be returned in.  Defaults to \&quot;id\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)</li>
   *   <li>orderDirection - Determines whether ordered results are returned in ascending or descending order.  Defaults to \&quot;ascending\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)</li>
   *   <li>include - Associations to include with the group. &#x60;total_scores&#x60; requires the &#x60;grouped&#x60; argument. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/students/submissions?student_ids={studentIds}&assignment_ids={assignmentIds}&grouped={grouped}&post_to_sis={postToSis}&submitted_since={submittedSince}&graded_since={gradedSince}&grading_period_id={gradingPeriodId}&workflow_state={workflowState}&enrollment_state={enrollmentState}&state_based_on_date={stateBasedOnDate}&order={order}&order_direction={orderDirection}&include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listSubmissionsForMultipleAssignmentsCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listSubmissionsForMultipleAssignmentsCourses</code> method in a fluent style.
   */
  public static class ListSubmissionsForMultipleAssignmentsCoursesQueryParams extends HashMap<String, Object> {
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams studentIds(final List<String> value) {
      put("student_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams assignmentIds(final List<String> value) {
      put("assignment_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams grouped(final Boolean value) {
      put("grouped", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams postToSis(final Boolean value) {
      put("post_to_sis", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams submittedSince(final String value) {
      put("submitted_since", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams gradedSince(final String value) {
      put("graded_since", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams workflowState(final String value) {
      put("workflow_state", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams enrollmentState(final String value) {
      put("enrollment_state", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams stateBasedOnDate(final Boolean value) {
      put("state_based_on_date", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams orderDirection(final String value) {
      put("order_direction", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List submissions for multiple assignments
   * A paginated list of all existing submissions for a given set of students and assignments.
   * @param sectionId ID (required)
   * @param studentIds List of student ids to return submissions for. If this argument is omitted, return submissions for the calling user. Students may only list their own submissions. Observers may only list those of associated students. The special id \&quot;all\&quot; will return submissions for all students in the course/section as appropriate. (optional)
   * @param assignmentIds List of assignments to return submissions for. If none are given, submissions for all assignments are returned. (optional)
   * @param grouped If this argument is present, the response will be grouped by student, rather than a flat array of submissions. (optional)
   * @param postToSis If this argument is set to true, the response will only include submissions for assignments that have the post_to_sis flag set to true and user enrollments that were added through sis. (optional)
   * @param submittedSince If this argument is set, the response will only include submissions that were submitted after the specified date_time. This will exclude submissions that do not have a submitted_at which will exclude unsubmitted submissions. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param gradedSince If this argument is set, the response will only include submissions that were graded after the specified date_time. This will exclude submissions that have not been graded. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param gradingPeriodId The id of the grading period in which submissions are being requested (Requires grading periods to exist on the account) (optional)
   * @param workflowState The current status of the submission (optional)
   * @param enrollmentState The current state of the enrollments. If omitted will include all enrollments that are not deleted. (optional)
   * @param stateBasedOnDate If omitted it is set to true. When set to false it will ignore the effective state of the student enrollments and use the workflow_state for the enrollments. The argument is ignored unless enrollment_state argument is also passed. (optional)
   * @param order The order submissions will be returned in.  Defaults to \&quot;id\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)
   * @param orderDirection Determines whether ordered results are returned in ascending or descending order.  Defaults to \&quot;ascending\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)
   * @param include Associations to include with the group. &#x60;total_scores&#x60; requires the &#x60;grouped&#x60; argument. (optional)
   */
  @RequestLine("GET /v1/sections/{sectionId}/students/submissions?student_ids={studentIds}&assignment_ids={assignmentIds}&grouped={grouped}&post_to_sis={postToSis}&submitted_since={submittedSince}&graded_since={gradedSince}&grading_period_id={gradingPeriodId}&workflow_state={workflowState}&enrollment_state={enrollmentState}&state_based_on_date={stateBasedOnDate}&order={order}&order_direction={orderDirection}&include={include}")
  @Headers({
      "Accept: */*",
  })
  void listSubmissionsForMultipleAssignmentsSections(@Param("sectionId") String sectionId, @Param("studentIds") List<String> studentIds, @Param("assignmentIds") List<String> assignmentIds, @Param("grouped") Boolean grouped, @Param("postToSis") Boolean postToSis, @Param("submittedSince") String submittedSince, @Param("gradedSince") String gradedSince, @Param("gradingPeriodId") Integer gradingPeriodId, @Param("workflowState") String workflowState, @Param("enrollmentState") String enrollmentState, @Param("stateBasedOnDate") Boolean stateBasedOnDate, @Param("order") String order, @Param("orderDirection") String orderDirection, @Param("include") List<String> include);
  

  /**
   * List submissions for multiple assignments
   * A paginated list of all existing submissions for a given set of students and assignments.
   * Note, this is equivalent to the other <code>listSubmissionsForMultipleAssignmentsSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListSubmissionsForMultipleAssignmentsSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>studentIds - List of student ids to return submissions for. If this argument is omitted, return submissions for the calling user. Students may only list their own submissions. Observers may only list those of associated students. The special id \&quot;all\&quot; will return submissions for all students in the course/section as appropriate. (optional)</li>
   *   <li>assignmentIds - List of assignments to return submissions for. If none are given, submissions for all assignments are returned. (optional)</li>
   *   <li>grouped - If this argument is present, the response will be grouped by student, rather than a flat array of submissions. (optional)</li>
   *   <li>postToSis - If this argument is set to true, the response will only include submissions for assignments that have the post_to_sis flag set to true and user enrollments that were added through sis. (optional)</li>
   *   <li>submittedSince - If this argument is set, the response will only include submissions that were submitted after the specified date_time. This will exclude submissions that do not have a submitted_at which will exclude unsubmitted submissions. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>gradedSince - If this argument is set, the response will only include submissions that were graded after the specified date_time. This will exclude submissions that have not been graded. The value must be formatted as ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>gradingPeriodId - The id of the grading period in which submissions are being requested (Requires grading periods to exist on the account) (optional)</li>
   *   <li>workflowState - The current status of the submission (optional)</li>
   *   <li>enrollmentState - The current state of the enrollments. If omitted will include all enrollments that are not deleted. (optional)</li>
   *   <li>stateBasedOnDate - If omitted it is set to true. When set to false it will ignore the effective state of the student enrollments and use the workflow_state for the enrollments. The argument is ignored unless enrollment_state argument is also passed. (optional)</li>
   *   <li>order - The order submissions will be returned in.  Defaults to \&quot;id\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)</li>
   *   <li>orderDirection - Determines whether ordered results are returned in ascending or descending order.  Defaults to \&quot;ascending\&quot;.  Doesn&#x27;t affect results for \&quot;grouped\&quot; mode. (optional)</li>
   *   <li>include - Associations to include with the group. &#x60;total_scores&#x60; requires the &#x60;grouped&#x60; argument. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/sections/{sectionId}/students/submissions?student_ids={studentIds}&assignment_ids={assignmentIds}&grouped={grouped}&post_to_sis={postToSis}&submitted_since={submittedSince}&graded_since={gradedSince}&grading_period_id={gradingPeriodId}&workflow_state={workflowState}&enrollment_state={enrollmentState}&state_based_on_date={stateBasedOnDate}&order={order}&order_direction={orderDirection}&include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listSubmissionsForMultipleAssignmentsSections(@Param("sectionId") String sectionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listSubmissionsForMultipleAssignmentsSections</code> method in a fluent style.
   */
  public static class ListSubmissionsForMultipleAssignmentsSectionsQueryParams extends HashMap<String, Object> {
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams studentIds(final List<String> value) {
      put("student_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams assignmentIds(final List<String> value) {
      put("assignment_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams grouped(final Boolean value) {
      put("grouped", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams postToSis(final Boolean value) {
      put("post_to_sis", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams submittedSince(final String value) {
      put("submitted_since", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams gradedSince(final String value) {
      put("graded_since", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams workflowState(final String value) {
      put("workflow_state", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams enrollmentState(final String value) {
      put("enrollment_state", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams stateBasedOnDate(final Boolean value) {
      put("state_based_on_date", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams orderDirection(final String value) {
      put("order_direction", EncodingUtils.encode(value));
      return this;
    }
    public ListSubmissionsForMultipleAssignmentsSectionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Mark submission as read
   * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markSubmissionAsReadCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
  /**
   * Mark submission as read
   * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("PUT /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{userId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markSubmissionAsReadSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
  /**
   * Mark submission as unread
   * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markSubmissionAsUnreadCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
  /**
   * Mark submission as unread
   * No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("DELETE /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{userId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markSubmissionAsUnreadSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
  /**
   * Submission Summary
   * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param grouped If this argument is true, the response will take into account student groups. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submission_summary?grouped={grouped}")
  @Headers({
      "Accept: */*",
  })
  void submissionSummaryCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("grouped") Boolean grouped);
  

  /**
   * Submission Summary
   * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
   * Note, this is equivalent to the other <code>submissionSummaryCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SubmissionSummaryCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>grouped - If this argument is true, the response will take into account student groups. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submission_summary?grouped={grouped}")
  @Headers({
      "Content-Type: */*",
  })
  void submissionSummaryCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>submissionSummaryCourses</code> method in a fluent style.
   */
  public static class SubmissionSummaryCoursesQueryParams extends HashMap<String, Object> {
    public SubmissionSummaryCoursesQueryParams grouped(final Boolean value) {
      put("grouped", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Submission Summary
   * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param grouped If this argument is true, the response will take into account student groups. (optional)
   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submission_summary?grouped={grouped}")
  @Headers({
      "Accept: */*",
  })
  void submissionSummarySections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("grouped") Boolean grouped);
  

  /**
   * Submission Summary
   * Returns the number of submissions for the given assignment based on gradeable students that fall into three categories: graded, ungraded, not submitted.
   * Note, this is equivalent to the other <code>submissionSummarySections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SubmissionSummarySectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>grouped - If this argument is true, the response will take into account student groups. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submission_summary?grouped={grouped}")
  @Headers({
      "Content-Type: */*",
  })
  void submissionSummarySections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>submissionSummarySections</code> method in a fluent style.
   */
  public static class SubmissionSummarySectionsQueryParams extends HashMap<String, Object> {
    public SubmissionSummarySectionsQueryParams grouped(final Boolean value) {
      put("grouped", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Submit an assignment
   * Make a submission for an assignment. You must be enrolled as a student in the course/section to do this.  All online turn-in submission types are supported in this API. However, there are a few things that are not yet supported:  * Files can be submitted based on a file ID of a user or group file. However, there is no API yet for listing the user and group files, or uploading new files via the API. A file upload API is coming soon. * Media comments can be submitted, however, there is no API yet for creating a media comment to submit. * Integration with Google Docs is not yet supported.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param commentTextComment  (optional)
   * @param submissionSubmissionType  (optional)
   * @param submissionBody  (optional)
   * @param submissionUrl  (optional)
   * @param submissionFileIds  (optional)
   * @param submissionMediaCommentId  (optional)
   * @param submissionMediaCommentType  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/submissions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void submitAssignmentCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("commentTextComment") String commentTextComment, @Param("submissionSubmissionType") String submissionSubmissionType, @Param("submissionBody") String submissionBody, @Param("submissionUrl") String submissionUrl, @Param("submissionFileIds") List<Integer> submissionFileIds, @Param("submissionMediaCommentId") String submissionMediaCommentId, @Param("submissionMediaCommentType") String submissionMediaCommentType);
  
  /**
   * Submit an assignment
   * Make a submission for an assignment. You must be enrolled as a student in the course/section to do this.  All online turn-in submission types are supported in this API. However, there are a few things that are not yet supported:  * Files can be submitted based on a file ID of a user or group file. However, there is no API yet for listing the user and group files, or uploading new files via the API. A file upload API is coming soon. * Media comments can be submitted, however, there is no API yet for creating a media comment to submit. * Integration with Google Docs is not yet supported.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param commentTextComment  (optional)
   * @param submissionSubmissionType  (optional)
   * @param submissionBody  (optional)
   * @param submissionUrl  (optional)
   * @param submissionFileIds  (optional)
   * @param submissionMediaCommentId  (optional)
   * @param submissionMediaCommentType  (optional)
   */
  @RequestLine("POST /v1/sections/{sectionId}/assignments/{assignmentId}/submissions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void submitAssignmentSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("commentTextComment") String commentTextComment, @Param("submissionSubmissionType") String submissionSubmissionType, @Param("submissionBody") String submissionBody, @Param("submissionUrl") String submissionUrl, @Param("submissionFileIds") List<Integer> submissionFileIds, @Param("submissionMediaCommentId") String submissionMediaCommentId, @Param("submissionMediaCommentType") String submissionMediaCommentType);
  
  /**
   * Upload a file
   * Upload a file to a submission.  This API endpoint is the first step in uploading a file to a submission as a student. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  The final step of the file upload workflow will return the attachment data, including the new file id. The caller can then POST to submit the +online_upload+ assignment with these file ids.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}/files")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void uploadFileCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
  /**
   * Upload a file
   * Upload a file to a submission.  This API endpoint is the first step in uploading a file to a submission as a student. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  The final step of the file upload workflow will return the attachment data, including the new file id. The caller can then POST to submit the +online_upload+ assignment with these file ids.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("POST /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{userId}/files")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void uploadFileSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
}
