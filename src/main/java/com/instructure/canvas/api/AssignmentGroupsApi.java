package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.AssignmentGroup;
import java.math.BigDecimal;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AssignmentGroupsApi extends ApiClient.Api {

  /**
   * Create an Assignment Group
   * Create a new assignment group for this course.
   * @param courseId ID (required)
   * @param name  (optional)
   * @param position  (optional)
   * @param groupWeight  (optional)
   * @param sisSourceId  (optional)
   * @param integrationData  (optional)
   * @param rules  (optional)
   * @return AssignmentGroup
   */
  @RequestLine("POST /v1/courses/{courseId}/assignment_groups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  AssignmentGroup createAssignmentGroup(@Param("courseId") String courseId, @Param("name") String name, @Param("position") Integer position, @Param("groupWeight") BigDecimal groupWeight, @Param("sisSourceId") String sisSourceId, @Param("integrationData") Object integrationData, @Param("rules") String rules);
  
  /**
   * Destroy an Assignment Group
   * Deletes the assignment group with the given id.
   * @param courseId ID (required)
   * @param assignmentGroupId ID (required)
   * @param moveAssignmentsTo The ID of an active Assignment Group to which the assignments that are currently assigned to the destroyed Assignment Group will be assigned. NOTE: If this argument is not provided, any assignments in this Assignment Group will be deleted. (optional)
   * @return AssignmentGroup
   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignment_groups/{assignmentGroupId}?move_assignments_to={moveAssignmentsTo}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  AssignmentGroup destroyAssignmentGroup(@Param("courseId") String courseId, @Param("assignmentGroupId") String assignmentGroupId, @Param("moveAssignmentsTo") Integer moveAssignmentsTo);
  

  /**
   * Destroy an Assignment Group
   * Deletes the assignment group with the given id.
   * Note, this is equivalent to the other <code>destroyAssignmentGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DestroyAssignmentGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentGroupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>moveAssignmentsTo - The ID of an active Assignment Group to which the assignments that are currently assigned to the destroyed Assignment Group will be assigned. NOTE: If this argument is not provided, any assignments in this Assignment Group will be deleted. (optional)</li>
   *   </ul>
   * @return AssignmentGroup

   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignment_groups/{assignmentGroupId}?move_assignments_to={moveAssignmentsTo}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  AssignmentGroup destroyAssignmentGroup(@Param("courseId") String courseId, @Param("assignmentGroupId") String assignmentGroupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>destroyAssignmentGroup</code> method in a fluent style.
   */
  public static class DestroyAssignmentGroupQueryParams extends HashMap<String, Object> {
    public DestroyAssignmentGroupQueryParams moveAssignmentsTo(final Integer value) {
      put("move_assignments_to", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Edit an Assignment Group
   * Modify an existing Assignment Group. Accepts the same parameters as Assignment Group creation
   * @param courseId ID (required)
   * @param assignmentGroupId ID (required)
   * @return AssignmentGroup
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignment_groups/{assignmentGroupId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  AssignmentGroup editAssignmentGroup(@Param("courseId") String courseId, @Param("assignmentGroupId") String assignmentGroupId);
  
  /**
   * Get an Assignment Group
   * Returns the assignment group with the given id.
   * @param courseId ID (required)
   * @param assignmentGroupId ID (required)
   * @param include Associations to include with the group. \&quot;discussion_topic\&quot; and \&quot;assignment_visibility\&quot; and \&quot;submission\&quot; are only valid if \&quot;assignments\&quot; is also included. The \&quot;assignment_visibility\&quot; option additionally requires that the Differentiated Assignments course feature be turned on. (optional)
   * @param overrideAssignmentDates Apply assignment overrides for each assignment, defaults to true. (optional)
   * @param gradingPeriodId The id of the grading period in which assignment groups are being requested (Requires grading periods to exist on the account) (optional)
   * @return AssignmentGroup
   */
  @RequestLine("GET /v1/courses/{courseId}/assignment_groups/{assignmentGroupId}?include={include}&override_assignment_dates={overrideAssignmentDates}&grading_period_id={gradingPeriodId}")
  @Headers({
      "Accept: application/json",
  })
  AssignmentGroup getAssignmentGroup(@Param("courseId") String courseId, @Param("assignmentGroupId") String assignmentGroupId, @Param("include") List<String> include, @Param("overrideAssignmentDates") Boolean overrideAssignmentDates, @Param("gradingPeriodId") Integer gradingPeriodId);
  

  /**
   * Get an Assignment Group
   * Returns the assignment group with the given id.
   * Note, this is equivalent to the other <code>getAssignmentGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAssignmentGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentGroupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the group. \&quot;discussion_topic\&quot; and \&quot;assignment_visibility\&quot; and \&quot;submission\&quot; are only valid if \&quot;assignments\&quot; is also included. The \&quot;assignment_visibility\&quot; option additionally requires that the Differentiated Assignments course feature be turned on. (optional)</li>
   *   <li>overrideAssignmentDates - Apply assignment overrides for each assignment, defaults to true. (optional)</li>
   *   <li>gradingPeriodId - The id of the grading period in which assignment groups are being requested (Requires grading periods to exist on the account) (optional)</li>
   *   </ul>
   * @return AssignmentGroup

   */
  @RequestLine("GET /v1/courses/{courseId}/assignment_groups/{assignmentGroupId}?include={include}&override_assignment_dates={overrideAssignmentDates}&grading_period_id={gradingPeriodId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  AssignmentGroup getAssignmentGroup(@Param("courseId") String courseId, @Param("assignmentGroupId") String assignmentGroupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAssignmentGroup</code> method in a fluent style.
   */
  public static class GetAssignmentGroupQueryParams extends HashMap<String, Object> {
    public GetAssignmentGroupQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAssignmentGroupQueryParams overrideAssignmentDates(final Boolean value) {
      put("override_assignment_dates", EncodingUtils.encode(value));
      return this;
    }
    public GetAssignmentGroupQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List assignment groups
   * Returns the paginated list of assignment groups for the current context. The returned groups are sorted by their position field.
   * @param courseId ID (required)
   * @param include Associations to include with the group. \&quot;discussion_topic\&quot;, \&quot;all_dates\&quot; \&quot;assignment_visibility\&quot; &amp; \&quot;submission\&quot; are only valid if \&quot;assignments\&quot; is also included. The \&quot;assignment_visibility\&quot; option additionally requires that the Differentiated Assignments course feature be turned on. (optional)
   * @param excludeAssignmentSubmissionTypes If \&quot;assignments\&quot; are included, those with the specified submission types will be excluded from the assignment groups. (optional)
   * @param overrideAssignmentDates Apply assignment overrides for each assignment, defaults to true. (optional)
   * @param gradingPeriodId The id of the grading period in which assignment groups are being requested (Requires grading periods to exist.) (optional)
   * @param scopeAssignmentsToStudent If true, all assignments returned will apply to the current user in the specified grading period. If assignments apply to other students in the specified grading period, but not the current user, they will not be returned. (Requires the grading_period_id argument and grading periods to exist. In addition, the current user must be a student.) (optional)
   * @return List&lt;AssignmentGroup&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignment_groups?include={include}&exclude_assignment_submission_types={excludeAssignmentSubmissionTypes}&override_assignment_dates={overrideAssignmentDates}&grading_period_id={gradingPeriodId}&scope_assignments_to_student={scopeAssignmentsToStudent}")
  @Headers({
      "Accept: application/json",
  })
  List<AssignmentGroup> listAssignmentGroups(@Param("courseId") String courseId, @Param("include") List<String> include, @Param("excludeAssignmentSubmissionTypes") List<String> excludeAssignmentSubmissionTypes, @Param("overrideAssignmentDates") Boolean overrideAssignmentDates, @Param("gradingPeriodId") Integer gradingPeriodId, @Param("scopeAssignmentsToStudent") Boolean scopeAssignmentsToStudent);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;AssignmentGroup&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<AssignmentGroup> listAssignmentGroups(URI uri);
  

  /**
   * List assignment groups
   * Returns the paginated list of assignment groups for the current context. The returned groups are sorted by their position field.
   * Note, this is equivalent to the other <code>listAssignmentGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAssignmentGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the group. \&quot;discussion_topic\&quot;, \&quot;all_dates\&quot; \&quot;assignment_visibility\&quot; &amp; \&quot;submission\&quot; are only valid if \&quot;assignments\&quot; is also included. The \&quot;assignment_visibility\&quot; option additionally requires that the Differentiated Assignments course feature be turned on. (optional)</li>
   *   <li>excludeAssignmentSubmissionTypes - If \&quot;assignments\&quot; are included, those with the specified submission types will be excluded from the assignment groups. (optional)</li>
   *   <li>overrideAssignmentDates - Apply assignment overrides for each assignment, defaults to true. (optional)</li>
   *   <li>gradingPeriodId - The id of the grading period in which assignment groups are being requested (Requires grading periods to exist.) (optional)</li>
   *   <li>scopeAssignmentsToStudent - If true, all assignments returned will apply to the current user in the specified grading period. If assignments apply to other students in the specified grading period, but not the current user, they will not be returned. (Requires the grading_period_id argument and grading periods to exist. In addition, the current user must be a student.) (optional)</li>
   *   </ul>
   * @return List&lt;AssignmentGroup&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/assignment_groups?include={include}&exclude_assignment_submission_types={excludeAssignmentSubmissionTypes}&override_assignment_dates={overrideAssignmentDates}&grading_period_id={gradingPeriodId}&scope_assignments_to_student={scopeAssignmentsToStudent}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<AssignmentGroup> listAssignmentGroups(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAssignmentGroups</code> method in a fluent style.
   */
  public static class ListAssignmentGroupsQueryParams extends HashMap<String, Object> {
    public ListAssignmentGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAssignmentGroupsQueryParams excludeAssignmentSubmissionTypes(final List<String> value) {
      put("exclude_assignment_submission_types", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAssignmentGroupsQueryParams overrideAssignmentDates(final Boolean value) {
      put("override_assignment_dates", EncodingUtils.encode(value));
      return this;
    }
    public ListAssignmentGroupsQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
    public ListAssignmentGroupsQueryParams scopeAssignmentsToStudent(final Boolean value) {
      put("scope_assignments_to_student", EncodingUtils.encode(value));
      return this;
    }
  }
}
