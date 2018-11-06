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
public interface SubmissionCommentsApi extends ApiClient.Api {

  /**
   * Upload a file
   * Upload a file to attach to a submission comment  See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  The final step of the file upload workflow will return the attachment data, including the new file id. The caller can then PUT the file_id to the submission API to attach it to a comment
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{userId}/comments/files")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void uploadFile(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("userId") String userId);
  
}
