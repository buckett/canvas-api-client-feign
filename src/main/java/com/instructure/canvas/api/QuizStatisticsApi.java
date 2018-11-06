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
public interface QuizStatisticsApi extends ApiClient.Api {

  /**
   * Fetching the latest quiz statistics
   * This endpoint provides statistics for all quiz versions, or for a specific quiz version, in which case the output is guaranteed to represent the _latest_ and most current version of the quiz.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param allVersions Whether the statistics report should include all submissions attempts. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/statistics?all_versions={allVersions}")
  @Headers({
      "Accept: */*",
  })
  void fetchingLatestQuizStatistics(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("allVersions") Boolean allVersions);
  

  /**
   * Fetching the latest quiz statistics
   * This endpoint provides statistics for all quiz versions, or for a specific quiz version, in which case the output is guaranteed to represent the _latest_ and most current version of the quiz.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * Note, this is equivalent to the other <code>fetchingLatestQuizStatistics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FetchingLatestQuizStatisticsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>allVersions - Whether the statistics report should include all submissions attempts. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/statistics?all_versions={allVersions}")
  @Headers({
      "Content-Type: */*",
  })
  void fetchingLatestQuizStatistics(@Param("courseId") String courseId, @Param("quizId") String quizId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>fetchingLatestQuizStatistics</code> method in a fluent style.
   */
  public static class FetchingLatestQuizStatisticsQueryParams extends HashMap<String, Object> {
    public FetchingLatestQuizStatisticsQueryParams allVersions(final Boolean value) {
      put("all_versions", EncodingUtils.encode(value));
      return this;
    }
  }
}
