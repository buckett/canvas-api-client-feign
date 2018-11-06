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
public interface QuizExtensionsApi extends ApiClient.Api {

  /**
   * Set extensions for student quiz submissions
   * &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if you are not allowed to extend quizzes for this course
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param quizExtensionsUserId  (optional)
   * @param quizExtensionsExtraAttempts  (optional)
   * @param quizExtensionsExtraTime  (optional)
   * @param quizExtensionsManuallyUnlocked  (optional)
   * @param quizExtensionsExtendFromNow  (optional)
   * @param quizExtensionsExtendFromEndAt  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/extensions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void setExtensionsForStudentQuizSubmissions(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("quizExtensionsUserId") List<Integer> quizExtensionsUserId, @Param("quizExtensionsExtraAttempts") List<Integer> quizExtensionsExtraAttempts, @Param("quizExtensionsExtraTime") List<Integer> quizExtensionsExtraTime, @Param("quizExtensionsManuallyUnlocked") List<Boolean> quizExtensionsManuallyUnlocked, @Param("quizExtensionsExtendFromNow") List<Integer> quizExtensionsExtendFromNow, @Param("quizExtensionsExtendFromEndAt") List<Integer> quizExtensionsExtendFromEndAt);
  
}
