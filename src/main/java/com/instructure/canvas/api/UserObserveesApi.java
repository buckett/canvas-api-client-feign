package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface UserObserveesApi extends ApiClient.Api {

  /**
   * Add an observee
   * Registers a user as being observed by the given user.
   * @param userId ID (required)
   * @param observeeId ID (required)
   * @param rootAccountId  (optional)
   * @return User
   */
  @RequestLine("PUT /v1/users/{userId}/observees/{observeeId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  User addObservee(@Param("userId") String userId, @Param("observeeId") String observeeId, @Param("rootAccountId") Integer rootAccountId);
  
  /**
   * Add an observee with credentials
   * Register the given user to observe another user, given the observee&#x27;s credentials.  *Note:* all users are allowed to add their own observees, given the observee&#x27;s credentials or access token are provided. Administrators can add observees given credentials, access token or the {api:UserObserveesController#update observee&#x27;s id}.
   * @param userId ID (required)
   * @param observeeUniqueId  (optional)
   * @param observeePassword  (optional)
   * @param accessToken  (optional)
   * @param pairingCode  (optional)
   * @param rootAccountId  (optional)
   * @return User
   */
  @RequestLine("POST /v1/users/{userId}/observees")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  User addObserveeWithCredentials(@Param("userId") String userId, @Param("observeeUniqueId") String observeeUniqueId, @Param("observeePassword") String observeePassword, @Param("accessToken") String accessToken, @Param("pairingCode") String pairingCode, @Param("rootAccountId") Integer rootAccountId);
  
  /**
   * List observees
   * A paginated list of the users that the given user is observing.  *Note:* all users are allowed to list their own observees. Administrators can list other users&#x27; observees.  The returned observees will include an attribute \&quot;observation_link_root_account_ids\&quot;, a list of ids for the root accounts the observer and observee are linked on. The observer will only be able to observe in courses associated with these root accounts.
   * @param userId ID (required)
   * @param include - \&quot;avatar_url\&quot;: Optionally include avatar_url. (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/users/{userId}/observees?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<User> listObservees(@Param("userId") String userId, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listObservees(URI uri);
  

  /**
   * List observees
   * A paginated list of the users that the given user is observing.  *Note:* all users are allowed to list their own observees. Administrators can list other users&#x27; observees.  The returned observees will include an attribute \&quot;observation_link_root_account_ids\&quot;, a list of ids for the root accounts the observer and observee are linked on. The observer will only be able to observe in courses associated with these root accounts.
   * Note, this is equivalent to the other <code>listObservees</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListObserveesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;avatar_url\&quot;: Optionally include avatar_url. (optional)</li>
   *   </ul>
   * @return List&lt;User&gt;

   */
  @RequestLine("GET /v1/users/{userId}/observees?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<User> listObservees(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listObservees</code> method in a fluent style.
   */
  public static class ListObserveesQueryParams extends HashMap<String, Object> {
    public ListObserveesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Remove an observee
   * Unregisters a user as being observed by the given user.
   * @param userId ID (required)
   * @param observeeId ID (required)
   * @param rootAccountId If specified, only removes the link for the given root account (optional)
   * @return User
   */
  @RequestLine("DELETE /v1/users/{userId}/observees/{observeeId}?root_account_id={rootAccountId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User removeObservee(@Param("userId") String userId, @Param("observeeId") String observeeId, @Param("rootAccountId") Integer rootAccountId);
  

  /**
   * Remove an observee
   * Unregisters a user as being observed by the given user.
   * Note, this is equivalent to the other <code>removeObservee</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveObserveeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param observeeId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>rootAccountId - If specified, only removes the link for the given root account (optional)</li>
   *   </ul>
   * @return User

   */
  @RequestLine("DELETE /v1/users/{userId}/observees/{observeeId}?root_account_id={rootAccountId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User removeObservee(@Param("userId") String userId, @Param("observeeId") String observeeId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>removeObservee</code> method in a fluent style.
   */
  public static class RemoveObserveeQueryParams extends HashMap<String, Object> {
    public RemoveObserveeQueryParams rootAccountId(final Integer value) {
      put("root_account_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show an observee
   * Gets information about an observed user.  *Note:* all users are allowed to view their own observees.
   * @param userId ID (required)
   * @param observeeId ID (required)
   * @return User
   */
  @RequestLine("GET /v1/users/{userId}/observees/{observeeId}")
  @Headers({
      "Accept: application/json",
  })
  User showObservee(@Param("userId") String userId, @Param("observeeId") String observeeId);
  
}
