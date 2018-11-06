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
public interface QuizIpFiltersApi extends ApiClient.Api {

  /**
   * Get available quiz IP filters.
   * Get a list of available IP filters for this Quiz.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/ip_filters")
  @Headers({
      "Accept: */*",
  })
  void getAvailableQuizIpFilters(@Param("courseId") String courseId, @Param("quizId") String quizId);
  
}
