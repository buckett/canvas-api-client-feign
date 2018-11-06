package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Assignment;
import com.instructure.canvas.model.AssignmentOverride;
import java.math.BigDecimal;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AssignmentsApi extends ApiClient.Api {

  /**
   * Batch create overrides in a course
   * Creates the specified overrides for each assignment.  Handles creation in a transaction, so all records are created or none are.  One of student_ids, group_id, or course_section_id must be present. At most one should be present; if multiple are present only the most specific (student_ids first, then group_id, then course_section_id) is used and any others are ignored.  Errors are reported in an errors attribute, an array of errors corresponding to inputs.  Global errors will be reported as a single element errors array
   * @param courseId ID (required)
   * @param assignmentOverrides  (optional)
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/overrides")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<AssignmentOverride> batchCreateOverridesInCourse(@Param("courseId") String courseId, @Param("assignmentOverrides") List<String> assignmentOverrides);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<AssignmentOverride> batchCreateOverridesInCourse(URI uri);
  
  /**
   * Batch retrieve overrides in a course
   * Returns a list of specified overrides in this course, providing they target sections/groups/students visible to the current user. Returns null elements in the list for requests that were not found.
   * @param courseId ID (required)
   * @param assignmentOverridesId Ids of overrides to retrieve (required)
   * @param assignmentOverridesAssignmentId Ids of assignments for each override (required)
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/overrides?assignment_overrides[id]={assignmentOverridesId}&assignment_overrides[assignment_id]={assignmentOverridesAssignmentId}")
  @Headers({
      "Accept: application/json",
  })
  List<AssignmentOverride> batchRetrieveOverridesInCourse(@Param("courseId") String courseId, @Param("assignmentOverridesId") List<String> assignmentOverridesId, @Param("assignmentOverridesAssignmentId") List<String> assignmentOverridesAssignmentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<AssignmentOverride> batchRetrieveOverridesInCourse(URI uri);
  

  /**
   * Batch retrieve overrides in a course
   * Returns a list of specified overrides in this course, providing they target sections/groups/students visible to the current user. Returns null elements in the list for requests that were not found.
   * Note, this is equivalent to the other <code>batchRetrieveOverridesInCourse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BatchRetrieveOverridesInCourseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>assignmentOverridesId - Ids of overrides to retrieve (required)</li>
   *   <li>assignmentOverridesAssignmentId - Ids of assignments for each override (required)</li>
   *   </ul>
   * @return List&lt;AssignmentOverride&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/overrides?assignment_overrides[id]={assignmentOverridesId}&assignment_overrides[assignment_id]={assignmentOverridesAssignmentId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<AssignmentOverride> batchRetrieveOverridesInCourse(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>batchRetrieveOverridesInCourse</code> method in a fluent style.
   */
  public static class BatchRetrieveOverridesInCourseQueryParams extends HashMap<String, Object> {
    public BatchRetrieveOverridesInCourseQueryParams assignmentOverridesId(final List<String> value) {
      put("assignment_overrides[id]", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public BatchRetrieveOverridesInCourseQueryParams assignmentOverridesAssignmentId(final List<String> value) {
      put("assignment_overrides[assignment_id]", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Batch update overrides in a course
   * Updates a list of specified overrides for each assignment.  Handles overrides in a transaction, so either all updates are applied or none. See {api:AssignmentOverridesController#update Update an assignment override} for available attributes.  All current overridden values must be supplied if they are to be retained; e.g. if due_at was overridden, but this PUT omits a value for due_at, due_at will no longer be overridden. If the override is adhoc and student_ids is not supplied, the target override set is unchanged. Target override sets cannot be changed for group or section overrides.  Errors are reported in an errors attribute, an array of errors corresponding to inputs.  Global errors will be reported as a single element errors array
   * @param courseId ID (required)
   * @param assignmentOverrides  (optional)
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/overrides")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<AssignmentOverride> batchUpdateOverridesInCourse(@Param("courseId") String courseId, @Param("assignmentOverrides") List<String> assignmentOverrides);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<AssignmentOverride> batchUpdateOverridesInCourse(URI uri);
  
  /**
   * Create an assignment
   * Create a new assignment for this course. The assignment is created in the active state.
   * @param courseId ID (required)
   * @param assignmentName  (optional)
   * @param assignmentPosition  (optional)
   * @param assignmentSubmissionTypes  (optional)
   * @param assignmentAllowedExtensions  (optional)
   * @param assignmentTurnitinEnabled  (optional)
   * @param assignmentVericiteEnabled  (optional)
   * @param assignmentTurnitinSettings  (optional)
   * @param assignmentIntegrationData  (optional)
   * @param assignmentIntegrationId  (optional)
   * @param assignmentPeerReviews  (optional)
   * @param assignmentAutomaticPeerReviews  (optional)
   * @param assignmentNotifyOfUpdate  (optional)
   * @param assignmentGroupCategoryId  (optional)
   * @param assignmentGradeGroupStudentsIndividually  (optional)
   * @param assignmentExternalToolTagAttributes  (optional)
   * @param assignmentPointsPossible  (optional)
   * @param assignmentGradingType  (optional)
   * @param assignmentDueAt  (optional)
   * @param assignmentLockAt  (optional)
   * @param assignmentUnlockAt  (optional)
   * @param assignmentDescription  (optional)
   * @param assignmentAssignmentGroupId  (optional)
   * @param assignmentMuted  (optional)
   * @param assignmentAssignmentOverrides  (optional)
   * @param assignmentOnlyVisibleToOverrides  (optional)
   * @param assignmentPublished  (optional)
   * @param assignmentGradingStandardId  (optional)
   * @param assignmentOmitFromFinalGrade  (optional)
   * @param assignmentQuizLti  (optional)
   * @param assignmentModeratedGrading  (optional)
   * @return Assignment
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Assignment createAssignment(@Param("courseId") String courseId, @Param("assignmentName") String assignmentName, @Param("assignmentPosition") Integer assignmentPosition, @Param("assignmentSubmissionTypes") List<String> assignmentSubmissionTypes, @Param("assignmentAllowedExtensions") List<String> assignmentAllowedExtensions, @Param("assignmentTurnitinEnabled") Boolean assignmentTurnitinEnabled, @Param("assignmentVericiteEnabled") Boolean assignmentVericiteEnabled, @Param("assignmentTurnitinSettings") String assignmentTurnitinSettings, @Param("assignmentIntegrationData") String assignmentIntegrationData, @Param("assignmentIntegrationId") String assignmentIntegrationId, @Param("assignmentPeerReviews") Boolean assignmentPeerReviews, @Param("assignmentAutomaticPeerReviews") Boolean assignmentAutomaticPeerReviews, @Param("assignmentNotifyOfUpdate") Boolean assignmentNotifyOfUpdate, @Param("assignmentGroupCategoryId") Integer assignmentGroupCategoryId, @Param("assignmentGradeGroupStudentsIndividually") Integer assignmentGradeGroupStudentsIndividually, @Param("assignmentExternalToolTagAttributes") String assignmentExternalToolTagAttributes, @Param("assignmentPointsPossible") BigDecimal assignmentPointsPossible, @Param("assignmentGradingType") String assignmentGradingType, @Param("assignmentDueAt") String assignmentDueAt, @Param("assignmentLockAt") String assignmentLockAt, @Param("assignmentUnlockAt") String assignmentUnlockAt, @Param("assignmentDescription") String assignmentDescription, @Param("assignmentAssignmentGroupId") Integer assignmentAssignmentGroupId, @Param("assignmentMuted") Boolean assignmentMuted, @Param("assignmentAssignmentOverrides") List<String> assignmentAssignmentOverrides, @Param("assignmentOnlyVisibleToOverrides") Boolean assignmentOnlyVisibleToOverrides, @Param("assignmentPublished") Boolean assignmentPublished, @Param("assignmentGradingStandardId") Integer assignmentGradingStandardId, @Param("assignmentOmitFromFinalGrade") Boolean assignmentOmitFromFinalGrade, @Param("assignmentQuizLti") Boolean assignmentQuizLti, @Param("assignmentModeratedGrading") Boolean assignmentModeratedGrading);
  
  /**
   * Create an assignment override
   * One of student_ids, group_id, or course_section_id must be present. At most one should be present; if multiple are present only the most specific (student_ids first, then group_id, then course_section_id) is used and any others are ignored.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param assignmentOverrideStudentIds  (optional)
   * @param assignmentOverrideTitle  (optional)
   * @param assignmentOverrideGroupId  (optional)
   * @param assignmentOverrideCourseSectionId  (optional)
   * @param assignmentOverrideDueAt  (optional)
   * @param assignmentOverrideUnlockAt  (optional)
   * @param assignmentOverrideLockAt  (optional)
   * @return AssignmentOverride
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/overrides")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  AssignmentOverride createAssignmentOverride(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("assignmentOverrideStudentIds") List<Integer> assignmentOverrideStudentIds, @Param("assignmentOverrideTitle") String assignmentOverrideTitle, @Param("assignmentOverrideGroupId") Integer assignmentOverrideGroupId, @Param("assignmentOverrideCourseSectionId") Integer assignmentOverrideCourseSectionId, @Param("assignmentOverrideDueAt") String assignmentOverrideDueAt, @Param("assignmentOverrideUnlockAt") String assignmentOverrideUnlockAt, @Param("assignmentOverrideLockAt") String assignmentOverrideLockAt);
  
  /**
   * Delete an assignment
   * Delete the given assignment.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Assignment
   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignments/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Assignment deleteAssignment(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Delete an assignment override
   * Deletes an override and returns its former details.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param id ID (required)
   * @return AssignmentOverride
   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignments/{assignmentId}/overrides/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  AssignmentOverride deleteAssignmentOverride(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("id") String id);
  
  /**
   * Edit an assignment
   * Modify an existing assignment.  If the assignment [assignment_overrides] key is absent, any existing overrides are kept as is. If the assignment [assignment_overrides] key is present, existing overrides are updated or deleted (and new ones created, as necessary) to match the provided list.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param assignmentName  (optional)
   * @param assignmentPosition  (optional)
   * @param assignmentSubmissionTypes  (optional)
   * @param assignmentAllowedExtensions  (optional)
   * @param assignmentTurnitinEnabled  (optional)
   * @param assignmentVericiteEnabled  (optional)
   * @param assignmentTurnitinSettings  (optional)
   * @param assignmentIntegrationData  (optional)
   * @param assignmentIntegrationId  (optional)
   * @param assignmentPeerReviews  (optional)
   * @param assignmentAutomaticPeerReviews  (optional)
   * @param assignmentNotifyOfUpdate  (optional)
   * @param assignmentGroupCategoryId  (optional)
   * @param assignmentGradeGroupStudentsIndividually  (optional)
   * @param assignmentExternalToolTagAttributes  (optional)
   * @param assignmentPointsPossible  (optional)
   * @param assignmentGradingType  (optional)
   * @param assignmentDueAt  (optional)
   * @param assignmentLockAt  (optional)
   * @param assignmentUnlockAt  (optional)
   * @param assignmentDescription  (optional)
   * @param assignmentAssignmentGroupId  (optional)
   * @param assignmentMuted  (optional)
   * @param assignmentAssignmentOverrides  (optional)
   * @param assignmentOnlyVisibleToOverrides  (optional)
   * @param assignmentPublished  (optional)
   * @param assignmentGradingStandardId  (optional)
   * @param assignmentOmitFromFinalGrade  (optional)
   * @param assignmentModeratedGrading  (optional)
   * @return Assignment
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Assignment editAssignment(@Param("courseId") String courseId, @Param("id") String id, @Param("assignmentName") String assignmentName, @Param("assignmentPosition") Integer assignmentPosition, @Param("assignmentSubmissionTypes") List<String> assignmentSubmissionTypes, @Param("assignmentAllowedExtensions") List<String> assignmentAllowedExtensions, @Param("assignmentTurnitinEnabled") Boolean assignmentTurnitinEnabled, @Param("assignmentVericiteEnabled") Boolean assignmentVericiteEnabled, @Param("assignmentTurnitinSettings") String assignmentTurnitinSettings, @Param("assignmentIntegrationData") String assignmentIntegrationData, @Param("assignmentIntegrationId") String assignmentIntegrationId, @Param("assignmentPeerReviews") Boolean assignmentPeerReviews, @Param("assignmentAutomaticPeerReviews") Boolean assignmentAutomaticPeerReviews, @Param("assignmentNotifyOfUpdate") Boolean assignmentNotifyOfUpdate, @Param("assignmentGroupCategoryId") Integer assignmentGroupCategoryId, @Param("assignmentGradeGroupStudentsIndividually") Integer assignmentGradeGroupStudentsIndividually, @Param("assignmentExternalToolTagAttributes") String assignmentExternalToolTagAttributes, @Param("assignmentPointsPossible") BigDecimal assignmentPointsPossible, @Param("assignmentGradingType") String assignmentGradingType, @Param("assignmentDueAt") String assignmentDueAt, @Param("assignmentLockAt") String assignmentLockAt, @Param("assignmentUnlockAt") String assignmentUnlockAt, @Param("assignmentDescription") String assignmentDescription, @Param("assignmentAssignmentGroupId") Integer assignmentAssignmentGroupId, @Param("assignmentMuted") Boolean assignmentMuted, @Param("assignmentAssignmentOverrides") List<String> assignmentAssignmentOverrides, @Param("assignmentOnlyVisibleToOverrides") Boolean assignmentOnlyVisibleToOverrides, @Param("assignmentPublished") Boolean assignmentPublished, @Param("assignmentGradingStandardId") Integer assignmentGradingStandardId, @Param("assignmentOmitFromFinalGrade") Boolean assignmentOmitFromFinalGrade, @Param("assignmentModeratedGrading") Boolean assignmentModeratedGrading);
  
  /**
   * Get a single assignment
   * Returns the assignment with the given id.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param include Associations to include with the assignment. The \&quot;assignment_visibility\&quot; option requires that the Differentiated Assignments course feature be turned on. If \&quot;observed_users\&quot; is passed, submissions for observed users will also be included. (optional)
   * @param overrideAssignmentDates Apply assignment overrides to the assignment, defaults to true. (optional)
   * @param needsGradingCountBySection Split up \&quot;needs_grading_count\&quot; by sections into the \&quot;needs_grading_count_by_section\&quot; key, defaults to false (optional)
   * @param allDates All dates associated with the assignment, if applicable (optional)
   * @return Assignment
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{id}?include={include}&override_assignment_dates={overrideAssignmentDates}&needs_grading_count_by_section={needsGradingCountBySection}&all_dates={allDates}")
  @Headers({
      "Accept: application/json",
  })
  Assignment getSingleAssignment(@Param("courseId") String courseId, @Param("id") String id, @Param("include") List<String> include, @Param("overrideAssignmentDates") Boolean overrideAssignmentDates, @Param("needsGradingCountBySection") Boolean needsGradingCountBySection, @Param("allDates") Boolean allDates);
  

  /**
   * Get a single assignment
   * Returns the assignment with the given id.
   * Note, this is equivalent to the other <code>getSingleAssignment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleAssignmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the assignment. The \&quot;assignment_visibility\&quot; option requires that the Differentiated Assignments course feature be turned on. If \&quot;observed_users\&quot; is passed, submissions for observed users will also be included. (optional)</li>
   *   <li>overrideAssignmentDates - Apply assignment overrides to the assignment, defaults to true. (optional)</li>
   *   <li>needsGradingCountBySection - Split up \&quot;needs_grading_count\&quot; by sections into the \&quot;needs_grading_count_by_section\&quot; key, defaults to false (optional)</li>
   *   <li>allDates - All dates associated with the assignment, if applicable (optional)</li>
   *   </ul>
   * @return Assignment

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{id}?include={include}&override_assignment_dates={overrideAssignmentDates}&needs_grading_count_by_section={needsGradingCountBySection}&all_dates={allDates}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Assignment getSingleAssignment(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleAssignment</code> method in a fluent style.
   */
  public static class GetSingleAssignmentQueryParams extends HashMap<String, Object> {
    public GetSingleAssignmentQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetSingleAssignmentQueryParams overrideAssignmentDates(final Boolean value) {
      put("override_assignment_dates", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleAssignmentQueryParams needsGradingCountBySection(final Boolean value) {
      put("needs_grading_count_by_section", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleAssignmentQueryParams allDates(final Boolean value) {
      put("all_dates", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a single assignment override
   * Returns details of the the override with the given id.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param id ID (required)
   * @return AssignmentOverride
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/overrides/{id}")
  @Headers({
      "Accept: application/json",
  })
  AssignmentOverride getSingleAssignmentOverride(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("id") String id);
  
  /**
   * List assignment overrides
   * Returns the paginated list of overrides for this assignment that target sections/groups/students visible to the current user.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/overrides")
  @Headers({
      "Accept: application/json",
  })
  List<AssignmentOverride> listAssignmentOverrides(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;AssignmentOverride&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<AssignmentOverride> listAssignmentOverrides(URI uri);
  
  /**
   * List assignments
   * Returns the paginated list of assignments for the current context.
   * @param courseId ID (required)
   * @param include Associations to include with the assignment. The \&quot;assignment_visibility\&quot; option requires that the Differentiated Assignments course feature be turned on. If \&quot;observed_users\&quot; is passed, submissions for observed users will also be included as an array. (optional)
   * @param searchTerm The partial title of the assignments to match and return. (optional)
   * @param overrideAssignmentDates Apply assignment overrides for each assignment, defaults to true. (optional)
   * @param needsGradingCountBySection Split up \&quot;needs_grading_count\&quot; by sections into the \&quot;needs_grading_count_by_section\&quot; key, defaults to false (optional)
   * @param bucket If included, only return certain assignments depending on due date and submission status. (optional)
   * @param assignmentIds if set, return only assignments specified (optional)
   * @param orderBy Determines the order of the assignments. Defaults to \&quot;position\&quot;. (optional)
   * @return List&lt;Assignment&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments?include={include}&search_term={searchTerm}&override_assignment_dates={overrideAssignmentDates}&needs_grading_count_by_section={needsGradingCountBySection}&bucket={bucket}&assignment_ids={assignmentIds}&order_by={orderBy}")
  @Headers({
      "Accept: application/json",
  })
  List<Assignment> listAssignments(@Param("courseId") String courseId, @Param("include") List<String> include, @Param("searchTerm") String searchTerm, @Param("overrideAssignmentDates") Boolean overrideAssignmentDates, @Param("needsGradingCountBySection") Boolean needsGradingCountBySection, @Param("bucket") String bucket, @Param("assignmentIds") List<String> assignmentIds, @Param("orderBy") String orderBy);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Assignment&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Assignment> listAssignments(URI uri);
  

  /**
   * List assignments
   * Returns the paginated list of assignments for the current context.
   * Note, this is equivalent to the other <code>listAssignments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAssignmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the assignment. The \&quot;assignment_visibility\&quot; option requires that the Differentiated Assignments course feature be turned on. If \&quot;observed_users\&quot; is passed, submissions for observed users will also be included as an array. (optional)</li>
   *   <li>searchTerm - The partial title of the assignments to match and return. (optional)</li>
   *   <li>overrideAssignmentDates - Apply assignment overrides for each assignment, defaults to true. (optional)</li>
   *   <li>needsGradingCountBySection - Split up \&quot;needs_grading_count\&quot; by sections into the \&quot;needs_grading_count_by_section\&quot; key, defaults to false (optional)</li>
   *   <li>bucket - If included, only return certain assignments depending on due date and submission status. (optional)</li>
   *   <li>assignmentIds - if set, return only assignments specified (optional)</li>
   *   <li>orderBy - Determines the order of the assignments. Defaults to \&quot;position\&quot;. (optional)</li>
   *   </ul>
   * @return List&lt;Assignment&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments?include={include}&search_term={searchTerm}&override_assignment_dates={overrideAssignmentDates}&needs_grading_count_by_section={needsGradingCountBySection}&bucket={bucket}&assignment_ids={assignmentIds}&order_by={orderBy}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Assignment> listAssignments(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAssignments</code> method in a fluent style.
   */
  public static class ListAssignmentsQueryParams extends HashMap<String, Object> {
    public ListAssignmentsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAssignmentsQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListAssignmentsQueryParams overrideAssignmentDates(final Boolean value) {
      put("override_assignment_dates", EncodingUtils.encode(value));
      return this;
    }
    public ListAssignmentsQueryParams needsGradingCountBySection(final Boolean value) {
      put("needs_grading_count_by_section", EncodingUtils.encode(value));
      return this;
    }
    public ListAssignmentsQueryParams bucket(final String value) {
      put("bucket", EncodingUtils.encode(value));
      return this;
    }
    public ListAssignmentsQueryParams assignmentIds(final List<String> value) {
      put("assignment_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAssignmentsQueryParams orderBy(final String value) {
      put("order_by", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List assignments for user
   * Returns the paginated list of assignments for the specified user if the current user has rights to view. See {api:AssignmentsApiController#index List assignments} for valid arguments.
   * @param userId ID (required)
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/users/{userId}/courses/{courseId}/assignments")
  @Headers({
      "Accept: */*",
  })
  void listAssignmentsForUser(@Param("userId") String userId, @Param("courseId") String courseId);
  
  /**
   * Redirect to the assignment override for a group
   * Responds with a redirect to the override for the given group, if any (404 otherwise).
   * @param groupId ID (required)
   * @param assignmentId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/assignments/{assignmentId}/override")
  @Headers({
      "Accept: */*",
  })
  void redirectToAssignmentOverrideForGroup(@Param("groupId") String groupId, @Param("assignmentId") String assignmentId);
  
  /**
   * Redirect to the assignment override for a section
   * Responds with a redirect to the override for the given section, if any (404 otherwise).
   * @param courseSectionId ID (required)
   * @param assignmentId ID (required)
   */
  @RequestLine("GET /v1/sections/{courseSectionId}/assignments/{assignmentId}/override")
  @Headers({
      "Accept: */*",
  })
  void redirectToAssignmentOverrideForSection(@Param("courseSectionId") String courseSectionId, @Param("assignmentId") String assignmentId);
  
  /**
   * Update an assignment override
   * All current overridden values must be supplied if they are to be retained; e.g. if due_at was overridden, but this PUT omits a value for due_at, due_at will no longer be overridden. If the override is adhoc and student_ids is not supplied, the target override set is unchanged. Target override sets cannot be changed for group or section overrides.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param id ID (required)
   * @param assignmentOverrideStudentIds  (optional)
   * @param assignmentOverrideTitle  (optional)
   * @param assignmentOverrideDueAt  (optional)
   * @param assignmentOverrideUnlockAt  (optional)
   * @param assignmentOverrideLockAt  (optional)
   * @return AssignmentOverride
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/{assignmentId}/overrides/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  AssignmentOverride updateAssignmentOverride(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("id") String id, @Param("assignmentOverrideStudentIds") List<Integer> assignmentOverrideStudentIds, @Param("assignmentOverrideTitle") String assignmentOverrideTitle, @Param("assignmentOverrideDueAt") String assignmentOverrideDueAt, @Param("assignmentOverrideUnlockAt") String assignmentOverrideUnlockAt, @Param("assignmentOverrideLockAt") String assignmentOverrideLockAt);
  
}
