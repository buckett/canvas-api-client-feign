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
public interface PollsApi extends ApiClient.Api {

  /**
   * Create a single poll
   * Create a new poll for the current user
   * @param pollsQuestion  (optional)
   * @param pollsDescription  (optional)
   */
  @RequestLine("POST /v1/polls")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createSinglePoll(@Param("pollsQuestion") List<String> pollsQuestion, @Param("pollsDescription") List<String> pollsDescription);
  
  /**
   * Delete a poll
   * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/polls/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deletePoll(@Param("id") String id);
  
  /**
   * Get a single poll
   * Returns the poll with the given id
   * @param id ID (required)
   */
  @RequestLine("GET /v1/polls/{id}")
  @Headers({
      "Accept: */*",
  })
  void getSinglePoll(@Param("id") String id);
  
  /**
   * List polls
   * Returns the paginated list of polls for the current user.
   */
  @RequestLine("GET /v1/polls")
  @Headers({
      "Accept: */*",
  })
  void listPolls();
  
  /**
   * Update a single poll
   * Update an existing poll belonging to the current user
   * @param id ID (required)
   * @param pollsQuestion  (optional)
   * @param pollsDescription  (optional)
   */
  @RequestLine("PUT /v1/polls/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateSinglePoll(@Param("id") String id, @Param("pollsQuestion") List<String> pollsQuestion, @Param("pollsDescription") List<String> pollsDescription);
  
}
