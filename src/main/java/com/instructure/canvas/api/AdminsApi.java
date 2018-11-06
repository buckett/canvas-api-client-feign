package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Admin;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AdminsApi extends ApiClient.Api {

  /**
   * List account admins
   * A paginated list of the admins in the account
   * @param accountId ID (required)
   * @param userId Scope the results to those with user IDs equal to any of the IDs specified here. (optional)
   * @return List&lt;Admin&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/admins?user_id={userId}")
  @Headers({
      "Accept: application/json",
  })
  List<Admin> listAccountAdmins(@Param("accountId") String accountId, @Param("userId") List<String> userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Admin&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Admin> listAccountAdmins(URI uri);
  

  /**
   * List account admins
   * A paginated list of the admins in the account
   * Note, this is equivalent to the other <code>listAccountAdmins</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAccountAdminsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - Scope the results to those with user IDs equal to any of the IDs specified here. (optional)</li>
   *   </ul>
   * @return List&lt;Admin&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/admins?user_id={userId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Admin> listAccountAdmins(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAccountAdmins</code> method in a fluent style.
   */
  public static class ListAccountAdminsQueryParams extends HashMap<String, Object> {
    public ListAccountAdminsQueryParams userId(final List<String> value) {
      put("user_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Make an account admin
   * Flag an existing user as an admin within the account.
   * @param accountId ID (required)
   * @param userId  (optional)
   * @param role  (optional)
   * @param roleId  (optional)
   * @param sendConfirmation  (optional)
   * @return Admin
   */
  @RequestLine("POST /v1/accounts/{accountId}/admins")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Admin makeAccountAdmin(@Param("accountId") String accountId, @Param("userId") Integer userId, @Param("role") String role, @Param("roleId") Integer roleId, @Param("sendConfirmation") Boolean sendConfirmation);
  
  /**
   * Remove account admin
   * Remove the rights associated with an account admin role from a user.
   * @param accountId ID (required)
   * @param userId ID (required)
   * @param role [DEPRECATED] Account role to remove from the user. Defaults to &#x27;AccountAdmin&#x27;. Any other account role must be specified explicitly. (optional)
   * @param roleId The user&#x27;s admin relationship with the account will be created with the given role. Defaults to the built-in role for &#x27;AccountAdmin&#x27;. (optional)
   * @return Admin
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/admins/{userId}?role={role}&role_id={roleId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Admin removeAccountAdmin(@Param("accountId") String accountId, @Param("userId") String userId, @Param("role") String role, @Param("roleId") Integer roleId);
  

  /**
   * Remove account admin
   * Remove the rights associated with an account admin role from a user.
   * Note, this is equivalent to the other <code>removeAccountAdmin</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveAccountAdminQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>role - [DEPRECATED] Account role to remove from the user. Defaults to &#x27;AccountAdmin&#x27;. Any other account role must be specified explicitly. (optional)</li>
   *   <li>roleId - The user&#x27;s admin relationship with the account will be created with the given role. Defaults to the built-in role for &#x27;AccountAdmin&#x27;. (optional)</li>
   *   </ul>
   * @return Admin

   */
  @RequestLine("DELETE /v1/accounts/{accountId}/admins/{userId}?role={role}&role_id={roleId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Admin removeAccountAdmin(@Param("accountId") String accountId, @Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>removeAccountAdmin</code> method in a fluent style.
   */
  public static class RemoveAccountAdminQueryParams extends HashMap<String, Object> {
    public RemoveAccountAdminQueryParams role(final String value) {
      put("role", EncodingUtils.encode(value));
      return this;
    }
    public RemoveAccountAdminQueryParams roleId(final Integer value) {
      put("role_id", EncodingUtils.encode(value));
      return this;
    }
  }
}
