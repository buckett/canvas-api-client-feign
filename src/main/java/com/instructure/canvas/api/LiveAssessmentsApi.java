package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;


import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface LiveAssessmentsApi extends ApiClient.Api {

  /**
   * Create live assessment results
   * Creates live assessment results and adds them to a live assessment
   * @param courseId ID (required)
   * @param assessmentId ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/live_assessments/{assessmentId}/results")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void createLiveAssessmentResults(@Param("courseId") String courseId, @Param("assessmentId") String assessmentId);
  
  /**
   * Create or find a live assessment
   * Creates or finds an existing live assessment with the given key and aligns it with the linked outcome
   * @param courseId ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/live_assessments")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void createOrFindLiveAssessment(@Param("courseId") String courseId);
  
  /**
   * List live assessment results
   * Returns a paginated list of live assessment results
   * @param courseId ID (required)
   * @param assessmentId ID (required)
   * @param userId If set, restrict results to those for this user (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/live_assessments/{assessmentId}/results?user_id={userId}")
  @Headers({
      "Accept: */*",
  })
  void listLiveAssessmentResults(@Param("courseId") String courseId, @Param("assessmentId") String assessmentId, @Param("userId") Integer userId);
  

  /**
   * List live assessment results
   * Returns a paginated list of live assessment results
   * Note, this is equivalent to the other <code>listLiveAssessmentResults</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListLiveAssessmentResultsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assessmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - If set, restrict results to those for this user (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/live_assessments/{assessmentId}/results?user_id={userId}")
  @Headers({
      "Content-Type: */*",
  })
  void listLiveAssessmentResults(@Param("courseId") String courseId, @Param("assessmentId") String assessmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listLiveAssessmentResults</code> method in a fluent style.
   */
  public static class ListLiveAssessmentResultsQueryParams extends HashMap<String, Object> {
    public ListLiveAssessmentResultsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List live assessments
   * Returns a paginated list of live assessments.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/live_assessments")
  @Headers({
      "Accept: */*",
  })
  void listLiveAssessments(@Param("courseId") String courseId);
  
}
