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
public interface AuthenticationsLogApi extends ApiClient.Api {

  /**
   * Query by account.
   * List authentication events for a given account.
   * @param accountId ID (required)
   * @param startTime The beginning of the time range from which you want events. Events are stored for one year. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   */
  @RequestLine("GET /v1/audit/authentication/accounts/{accountId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: */*",
  })
  void queryByAccount(@Param("accountId") String accountId, @Param("startTime") String startTime, @Param("endTime") String endTime);
  

  /**
   * Query by account.
   * List authentication events for a given account.
   * Note, this is equivalent to the other <code>queryByAccount</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByAccountQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. Events are stored for one year. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/audit/authentication/accounts/{accountId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
  })
  void queryByAccount(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByAccount</code> method in a fluent style.
   */
  public static class QueryByAccountQueryParams extends HashMap<String, Object> {
    public QueryByAccountQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByAccountQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Query by login.
   * List authentication events for a given login.
   * @param loginId ID (required)
   * @param startTime The beginning of the time range from which you want events. Events are stored for one year. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   */
  @RequestLine("GET /v1/audit/authentication/logins/{loginId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: */*",
  })
  void queryByLogin(@Param("loginId") String loginId, @Param("startTime") String startTime, @Param("endTime") String endTime);
  

  /**
   * Query by login.
   * List authentication events for a given login.
   * Note, this is equivalent to the other <code>queryByLogin</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByLoginQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param loginId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. Events are stored for one year. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/audit/authentication/logins/{loginId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
  })
  void queryByLogin(@Param("loginId") String loginId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByLogin</code> method in a fluent style.
   */
  public static class QueryByLoginQueryParams extends HashMap<String, Object> {
    public QueryByLoginQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByLoginQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Query by user.
   * List authentication events for a given user.
   * @param userId ID (required)
   * @param startTime The beginning of the time range from which you want events. Events are stored for one year. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   */
  @RequestLine("GET /v1/audit/authentication/users/{userId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: */*",
  })
  void queryByUser(@Param("userId") String userId, @Param("startTime") String startTime, @Param("endTime") String endTime);
  

  /**
   * Query by user.
   * List authentication events for a given user.
   * Note, this is equivalent to the other <code>queryByUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. Events are stored for one year. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/audit/authentication/users/{userId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
  })
  void queryByUser(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByUser</code> method in a fluent style.
   */
  public static class QueryByUserQueryParams extends HashMap<String, Object> {
    public QueryByUserQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByUserQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
}
