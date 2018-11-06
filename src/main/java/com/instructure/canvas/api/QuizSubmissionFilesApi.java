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
public interface QuizSubmissionFilesApi extends ApiClient.Api {

  /**
   * Upload a file
   * Associate a new quiz submission file  This API endpoint is the first step in uploading a quiz submission file. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow as these parameters are interpreted as per the documentation there.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param name  (optional)
   * @param onDuplicate  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/submissions/self/files")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void uploadFile(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("name") String name, @Param("onDuplicate") String onDuplicate);
  
}
