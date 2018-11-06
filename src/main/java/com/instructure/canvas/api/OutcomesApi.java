package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Outcome;
import com.instructure.canvas.model.OutcomeAlignment;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface OutcomesApi extends ApiClient.Api {

  /**
   * Get aligned assignments for an outcome in a course for a particular student
   * 
   * @param courseId The id of the course (required)
   * @param studentId The id of the student (optional)
   * @return List&lt;OutcomeAlignment&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_alignments?student_id={studentId}")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeAlignment> getAlignedAssignmentsForOutcomeInCourseForParticularStudent(@Param("courseId") Integer courseId, @Param("studentId") Integer studentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeAlignment&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeAlignment> getAlignedAssignmentsForOutcomeInCourseForParticularStudent(URI uri);
  

  /**
   * Get aligned assignments for an outcome in a course for a particular student
   * 
   * Note, this is equivalent to the other <code>getAlignedAssignmentsForOutcomeInCourseForParticularStudent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAlignedAssignmentsForOutcomeInCourseForParticularStudentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId The id of the course (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>studentId - The id of the student (optional)</li>
   *   </ul>
   * @return List&lt;OutcomeAlignment&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_alignments?student_id={studentId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<OutcomeAlignment> getAlignedAssignmentsForOutcomeInCourseForParticularStudent(@Param("courseId") Integer courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAlignedAssignmentsForOutcomeInCourseForParticularStudent</code> method in a fluent style.
   */
  public static class GetAlignedAssignmentsForOutcomeInCourseForParticularStudentQueryParams extends HashMap<String, Object> {
    public GetAlignedAssignmentsForOutcomeInCourseForParticularStudentQueryParams studentId(final Integer value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show an outcome
   * Returns the details of the outcome with the given id.
   * @param id ID (required)
   * @return Outcome
   */
  @RequestLine("GET /v1/outcomes/{id}")
  @Headers({
      "Accept: application/json",
  })
  Outcome showOutcome(@Param("id") String id);
  
  /**
   * Update an outcome
   * Modify an existing outcome. Fields not provided are left as is; unrecognized fields are ignored.  If any new ratings are provided, the combination of all new ratings provided completely replace any existing embedded rubric criterion; it is not possible to tweak the ratings of the embedded rubric criterion.  A new embedded rubric criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any new ratings lacking a description are given a default of \&quot;No description\&quot;. Any new ratings lacking a point value are given a default of 0.
   * @param id ID (required)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return Outcome
   */
  @RequestLine("PUT /v1/outcomes/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Outcome updateOutcome(@Param("id") String id, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
}
