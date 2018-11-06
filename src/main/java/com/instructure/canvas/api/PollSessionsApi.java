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
public interface PollSessionsApi extends ApiClient.Api {

  /**
   * Close an opened poll session
   * 
   * @param pollId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_sessions/{id}/close")
  @Headers({
      "Accept: */*",
  })
  void closeOpenedPollSession(@Param("pollId") String pollId, @Param("id") String id);
  
  /**
   * Create a single poll session
   * Create a new poll session for this poll
   * @param pollId ID (required)
   * @param pollSessionsCourseId  (optional)
   * @param pollSessionsCourseSectionId  (optional)
   * @param pollSessionsHasPublicResults  (optional)
   */
  @RequestLine("POST /v1/polls/{pollId}/poll_sessions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createSinglePollSession(@Param("pollId") String pollId, @Param("pollSessionsCourseId") List<Integer> pollSessionsCourseId, @Param("pollSessionsCourseSectionId") List<Integer> pollSessionsCourseSectionId, @Param("pollSessionsHasPublicResults") List<Boolean> pollSessionsHasPublicResults);
  
  /**
   * Delete a poll session
   * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
   * @param pollId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/polls/{pollId}/poll_sessions/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deletePollSession(@Param("pollId") String pollId, @Param("id") String id);
  
  /**
   * Get the results for a single poll session
   * Returns the poll session with the given id
   * @param pollId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_sessions/{id}")
  @Headers({
      "Accept: */*",
  })
  void getResultsForSinglePollSession(@Param("pollId") String pollId, @Param("id") String id);
  
  /**
   * List closed poll sessions
   * A paginated list of all closed poll sessions available to the current user.
   */
  @RequestLine("GET /v1/poll_sessions/closed")
  @Headers({
      "Accept: */*",
  })
  void listClosedPollSessions();
  
  /**
   * List opened poll sessions
   * A paginated list of all opened poll sessions available to the current user.
   */
  @RequestLine("GET /v1/poll_sessions/opened")
  @Headers({
      "Accept: */*",
  })
  void listOpenedPollSessions();
  
  /**
   * List poll sessions for a poll
   * Returns the paginated list of PollSessions in this poll.
   * @param pollId ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_sessions")
  @Headers({
      "Accept: */*",
  })
  void listPollSessionsForPoll(@Param("pollId") String pollId);
  
  /**
   * Open a poll session
   * 
   * @param pollId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/polls/{pollId}/poll_sessions/{id}/open")
  @Headers({
      "Accept: */*",
  })
  void openPollSession(@Param("pollId") String pollId, @Param("id") String id);
  
  /**
   * Update a single poll session
   * Update an existing poll session for this poll
   * @param pollId ID (required)
   * @param id ID (required)
   * @param pollSessionsCourseId  (optional)
   * @param pollSessionsCourseSectionId  (optional)
   * @param pollSessionsHasPublicResults  (optional)
   */
  @RequestLine("PUT /v1/polls/{pollId}/poll_sessions/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateSinglePollSession(@Param("pollId") String pollId, @Param("id") String id, @Param("pollSessionsCourseId") List<Integer> pollSessionsCourseId, @Param("pollSessionsCourseSectionId") List<Integer> pollSessionsCourseSectionId, @Param("pollSessionsHasPublicResults") List<Boolean> pollSessionsHasPublicResults);
  
}
