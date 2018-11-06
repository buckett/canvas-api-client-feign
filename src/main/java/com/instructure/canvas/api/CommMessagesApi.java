package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.CommMessage;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CommMessagesApi extends ApiClient.Api {

  /**
   * List of CommMessages for a user
   * Retrieve a paginated list of messages sent to a user.
   * @param userId The user id for whom you want to retrieve CommMessages (required)
   * @param startTime The beginning of the time range you want to retrieve message from. (optional)
   * @param endTime The end of the time range you want to retrieve messages for. (optional)
   * @return List&lt;CommMessage&gt;
   */
  @RequestLine("GET /v1/comm_messages?user_id={userId}&start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<CommMessage> listOfCommmessagesForUser(@Param("userId") String userId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CommMessage&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CommMessage> listOfCommmessagesForUser(URI uri);
  

  /**
   * List of CommMessages for a user
   * Retrieve a paginated list of messages sent to a user.
   * Note, this is equivalent to the other <code>listOfCommmessagesForUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListOfCommmessagesForUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - The user id for whom you want to retrieve CommMessages (required)</li>
   *   <li>startTime - The beginning of the time range you want to retrieve message from. (optional)</li>
   *   <li>endTime - The end of the time range you want to retrieve messages for. (optional)</li>
   *   </ul>
   * @return List&lt;CommMessage&gt;

   */
  @RequestLine("GET /v1/comm_messages?user_id={userId}&start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<CommMessage> listOfCommmessagesForUser(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listOfCommmessagesForUser</code> method in a fluent style.
   */
  public static class ListOfCommmessagesForUserQueryParams extends HashMap<String, Object> {
    public ListOfCommmessagesForUserQueryParams userId(final String value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public ListOfCommmessagesForUserQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public ListOfCommmessagesForUserQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
}
