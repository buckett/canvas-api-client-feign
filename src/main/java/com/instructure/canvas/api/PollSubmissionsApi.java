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
public interface PollSubmissionsApi extends ApiClient.Api {

  /**
   * Create a single poll submission
   * Create a new poll submission for this poll session
   * @param pollId ID (required)
   * @param pollSessionId ID (required)
   * @param pollSubmissionsPollChoiceId  (optional)
   */
  @RequestLine("POST /v1/polls/{pollId}/poll_sessions/{pollSessionId}/poll_submissions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createSinglePollSubmission(@Param("pollId") String pollId, @Param("pollSessionId") String pollSessionId, @Param("pollSubmissionsPollChoiceId") List<Integer> pollSubmissionsPollChoiceId);
  
  /**
   * Get a single poll submission
   * Returns the poll submission with the given id
   * @param pollId ID (required)
   * @param pollSessionId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_sessions/{pollSessionId}/poll_submissions/{id}")
  @Headers({
      "Accept: */*",
  })
  void getSinglePollSubmission(@Param("pollId") String pollId, @Param("pollSessionId") String pollSessionId, @Param("id") String id);
  
}
