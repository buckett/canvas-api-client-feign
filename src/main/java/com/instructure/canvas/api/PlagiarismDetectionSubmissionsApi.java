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
public interface PlagiarismDetectionSubmissionsApi extends ApiClient.Api {

  /**
   * Get the history of a single submission
   * Get a list of all attempts made for a submission, based on submission id.
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   */
  @RequestLine("GET /lti/assignments/{assignmentId}/submissions/{submissionId}/history")
  @Headers({
      "Accept: */*",
  })
  void getHistoryOfSingleSubmission(@Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId);
  
  /**
   * Get a single submission
   * Get a single submission, based on submission id.
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   */
  @RequestLine("GET /lti/assignments/{assignmentId}/submissions/{submissionId}")
  @Headers({
      "Accept: */*",
  })
  void getSingleSubmission(@Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId);
  
}
