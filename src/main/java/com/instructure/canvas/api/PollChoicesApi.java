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
public interface PollChoicesApi extends ApiClient.Api {

  /**
   * Create a single poll choice
   * Create a new poll choice for this poll
   * @param pollId ID (required)
   * @param pollChoicesText  (optional)
   * @param pollChoicesIsCorrect  (optional)
   * @param pollChoicesPosition  (optional)
   */
  @RequestLine("POST /v1/polls/{pollId}/poll_choices")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createSinglePollChoice(@Param("pollId") String pollId, @Param("pollChoicesText") List<String> pollChoicesText, @Param("pollChoicesIsCorrect") List<Boolean> pollChoicesIsCorrect, @Param("pollChoicesPosition") List<Integer> pollChoicesPosition);
  
  /**
   * Delete a poll choice
   * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
   * @param pollId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/polls/{pollId}/poll_choices/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deletePollChoice(@Param("pollId") String pollId, @Param("id") String id);
  
  /**
   * Get a single poll choice
   * Returns the poll choice with the given id
   * @param pollId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_choices/{id}")
  @Headers({
      "Accept: */*",
  })
  void getSinglePollChoice(@Param("pollId") String pollId, @Param("id") String id);
  
  /**
   * List poll choices in a poll
   * Returns the paginated list of PollChoices in this poll.
   * @param pollId ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_choices")
  @Headers({
      "Accept: */*",
  })
  void listPollChoicesInPoll(@Param("pollId") String pollId);
  
  /**
   * Update a single poll choice
   * Update an existing poll choice for this poll
   * @param pollId ID (required)
   * @param id ID (required)
   * @param pollChoicesText  (optional)
   * @param pollChoicesIsCorrect  (optional)
   * @param pollChoicesPosition  (optional)
   */
  @RequestLine("PUT /v1/polls/{pollId}/poll_choices/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateSinglePollChoice(@Param("pollId") String pollId, @Param("id") String id, @Param("pollChoicesText") List<String> pollChoicesText, @Param("pollChoicesIsCorrect") List<Boolean> pollChoicesIsCorrect, @Param("pollChoicesPosition") List<Integer> pollChoicesPosition);
  
}
