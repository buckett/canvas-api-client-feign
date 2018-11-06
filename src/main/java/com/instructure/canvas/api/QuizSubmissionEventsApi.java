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
public interface QuizSubmissionEventsApi extends ApiClient.Api {

  /**
   * Retrieve captured events
   * Retrieve the set of events captured during a specific submission attempt.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param attempt The specific submission attempt to look up the events for. If unspecified, the latest attempt will be used. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}/events?attempt={attempt}")
  @Headers({
      "Accept: */*",
  })
  void retrieveCapturedEvents(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("attempt") Integer attempt);
  

  /**
   * Retrieve captured events
   * Retrieve the set of events captured during a specific submission attempt.
   * Note, this is equivalent to the other <code>retrieveCapturedEvents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveCapturedEventsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>attempt - The specific submission attempt to look up the events for. If unspecified, the latest attempt will be used. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}/events?attempt={attempt}")
  @Headers({
      "Content-Type: */*",
  })
  void retrieveCapturedEvents(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>retrieveCapturedEvents</code> method in a fluent style.
   */
  public static class RetrieveCapturedEventsQueryParams extends HashMap<String, Object> {
    public RetrieveCapturedEventsQueryParams attempt(final Integer value) {
      put("attempt", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Submit captured events
   * Store a set of events which were captured during a quiz taking session.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param quizSubmissionEvents  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}/events")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void submitCapturedEvents(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("quizSubmissionEvents") List<List<Object>> quizSubmissionEvents);
  
}
