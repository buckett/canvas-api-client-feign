package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import java.math.BigDecimal;
import com.instructure.canvas.model.ProvisionalGrade;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ModeratedGradingApi extends ApiClient.Api {

  /**
   * Bulk select provisional grades
   * Choose which provisional grades will be received by associated students for an assignment. The caller must be the final grader for the assignment or an admin with :select_final_grade rights.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/{assignmentId}/provisional_grades/bulk_select")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void bulkSelectProvisionalGrades(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId);
  
  /**
   * Copy provisional grade
   * Given a provisional grade, copy the grade (and associated submission comments and rubric assessments) to a \&quot;final\&quot; mark which can be edited or commented upon by a moderator prior to publication of grades.  Notes: * The student must be in the moderation set for the assignment. * The newly created grade will be selected. * The caller must have \&quot;Moderate Grades\&quot; rights in the course.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param provisionalGradeId ID (required)
   * @return ProvisionalGrade
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/provisional_grades/{provisionalGradeId}/copy_to_final_mark")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ProvisionalGrade copyProvisionalGrade(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("provisionalGradeId") String provisionalGradeId);
  
  /**
   * List students selected for moderation
   * Returns a paginated list of students selected for moderation
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/moderated_students")
  @Headers({
      "Accept: application/json",
  })
  List<User> listStudentsSelectedForModeration(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listStudentsSelectedForModeration(URI uri);
  
  /**
   * Publish provisional grades for an assignment
   * Publish the selected provisional grade for all submissions to an assignment. Use the \&quot;Select provisional grade\&quot; endpoint to choose which provisional grade to publish for a particular submission.  Students not in the moderation set will have their one and only provisional grade published.  WARNING: This is irreversible. This will overwrite existing grades in the gradebook.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/provisional_grades/publish")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void publishProvisionalGradesForAssignment(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId);
  
  /**
   * Select provisional grade
   * Choose which provisional grade the student should receive for a submission. The caller must be the final grader for the assignment or an admin with :select_final_grade rights.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param provisionalGradeId ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/assignments/{assignmentId}/provisional_grades/{provisionalGradeId}/select")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void selectProvisionalGrade(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("provisionalGradeId") String provisionalGradeId);
  
  /**
   * Select students for moderation
   * Returns an array of users that were selected for moderation
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param studentIds  (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/moderated_students")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<User> selectStudentsForModeration(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("studentIds") List<BigDecimal> studentIds);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<User> selectStudentsForModeration(URI uri);
  
  /**
   * Show provisional grade status for a student
   * Determine whether or not the student&#x27;s submission needs one or more provisional grades.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param anonymousId The id of the student to show the status for (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/anonymous_provisional_grades/status?anonymous_id={anonymousId}")
  @Headers({
      "Accept: */*",
  })
  void showProvisionalGradeStatusForStudent(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("anonymousId") String anonymousId);
  

  /**
   * Show provisional grade status for a student
   * Determine whether or not the student&#x27;s submission needs one or more provisional grades.
   * Note, this is equivalent to the other <code>showProvisionalGradeStatusForStudent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowProvisionalGradeStatusForStudentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>anonymousId - The id of the student to show the status for (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/anonymous_provisional_grades/status?anonymous_id={anonymousId}")
  @Headers({
      "Content-Type: */*",
  })
  void showProvisionalGradeStatusForStudent(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showProvisionalGradeStatusForStudent</code> method in a fluent style.
   */
  public static class ShowProvisionalGradeStatusForStudentQueryParams extends HashMap<String, Object> {
    public ShowProvisionalGradeStatusForStudentQueryParams anonymousId(final String value) {
      put("anonymous_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show provisional grade status for a student
   * Tell whether the student&#x27;s submission needs one or more provisional grades.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param studentId The id of the student to show the status for (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/provisional_grades/status?student_id={studentId}")
  @Headers({
      "Accept: */*",
  })
  void showProvisionalGradeStatusForStudent_1(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("studentId") Integer studentId);
  

  /**
   * Show provisional grade status for a student
   * Tell whether the student&#x27;s submission needs one or more provisional grades.
   * Note, this is equivalent to the other <code>showProvisionalGradeStatusForStudent_0</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowProvisionalGradeStatusForStudent0QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>studentId - The id of the student to show the status for (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/provisional_grades/status?student_id={studentId}")
  @Headers({
      "Content-Type: */*",
  })
  void showProvisionalGradeStatusForStudent_1(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showProvisionalGradeStatusForStudent_0</code> method in a fluent style.
   */
  public static class ShowProvisionalGradeStatusForStudent0QueryParams extends HashMap<String, Object> {
    public ShowProvisionalGradeStatusForStudent0QueryParams studentId(final Integer value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
}
