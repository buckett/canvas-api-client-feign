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
public interface CourseQuizExtensionsApi extends ApiClient.Api {

  /**
   * Set extensions for student quiz submissions
   * &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if you are not allowed to extend quizzes for this course
   * @param courseId ID (required)
   * @param userId  (optional)
   * @param extraAttempts  (optional)
   * @param extraTime  (optional)
   * @param manuallyUnlocked  (optional)
   * @param extendFromNow  (optional)
   * @param extendFromEndAt  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quiz_extensions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void setExtensionsForStudentQuizSubmissions(@Param("courseId") String courseId, @Param("userId") Integer userId, @Param("extraAttempts") Integer extraAttempts, @Param("extraTime") Integer extraTime, @Param("manuallyUnlocked") Boolean manuallyUnlocked, @Param("extendFromNow") Integer extendFromNow, @Param("extendFromEndAt") Integer extendFromEndAt);
  
}
