package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Role;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface RolesApi extends ApiClient.Api {

  /**
   * Activate a role
   * Re-activates an inactive role (allowing it to be assigned to new users)
   * @param accountId ID (required)
   * @param id ID (required)
   * @param roleId  (optional)
   * @param role  (optional)
   * @return Role
   */
  @RequestLine("POST /v1/accounts/{accountId}/roles/{id}/activate")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Role activateRole(@Param("accountId") String accountId, @Param("id") String id, @Param("roleId") Integer roleId, @Param("role") Object role);
  
  /**
   * Create a new role
   * Create a new course-level or account-level role.
   * @param accountId ID (required)
   * @param label  (optional)
   * @param role  (optional)
   * @param baseRoleType  (optional)
   * @param permissionsXExplicit  (optional)
   * @param permissionsXEnabled  (optional)
   * @param permissionsXLocked  (optional)
   * @param permissionsXAppliesToSelf  (optional)
   * @param permissionsXAppliesToDescendants  (optional)
   * @return Role
   */
  @RequestLine("POST /v1/accounts/{accountId}/roles")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Role createNewRole(@Param("accountId") String accountId, @Param("label") String label, @Param("role") String role, @Param("baseRoleType") String baseRoleType, @Param("permissionsXExplicit") Boolean permissionsXExplicit, @Param("permissionsXEnabled") Boolean permissionsXEnabled, @Param("permissionsXLocked") Boolean permissionsXLocked, @Param("permissionsXAppliesToSelf") Boolean permissionsXAppliesToSelf, @Param("permissionsXAppliesToDescendants") Boolean permissionsXAppliesToDescendants);
  
  /**
   * Deactivate a role
   * Deactivates a custom role.  This hides it in the user interface and prevents it from being assigned to new users.  Existing users assigned to the role will continue to function with the same permissions they had previously. Built-in roles cannot be deactivated.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param roleId The unique identifier for the role (required)
   * @param role The name for the role (optional)
   * @return Role
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/roles/{id}?role_id={roleId}&role={role}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Role deactivateRole(@Param("accountId") String accountId, @Param("id") String id, @Param("roleId") Integer roleId, @Param("role") String role);
  

  /**
   * Deactivate a role
   * Deactivates a custom role.  This hides it in the user interface and prevents it from being assigned to new users.  Existing users assigned to the role will continue to function with the same permissions they had previously. Built-in roles cannot be deactivated.
   * Note, this is equivalent to the other <code>deactivateRole</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeactivateRoleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>roleId - The unique identifier for the role (required)</li>
   *   <li>role - The name for the role (optional)</li>
   *   </ul>
   * @return Role

   */
  @RequestLine("DELETE /v1/accounts/{accountId}/roles/{id}?role_id={roleId}&role={role}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Role deactivateRole(@Param("accountId") String accountId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deactivateRole</code> method in a fluent style.
   */
  public static class DeactivateRoleQueryParams extends HashMap<String, Object> {
    public DeactivateRoleQueryParams roleId(final Integer value) {
      put("role_id", EncodingUtils.encode(value));
      return this;
    }
    public DeactivateRoleQueryParams role(final String value) {
      put("role", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a single role
   * Retrieve information about a single role
   * @param id ID (required)
   * @param accountId The id of the account containing the role (required)
   * @param roleId The unique identifier for the role (required)
   * @param role The name for the role (optional)
   * @return Role
   */
  @RequestLine("GET /v1/accounts/{accountId}/roles/{id}?role_id={roleId}&role={role}")
  @Headers({
      "Accept: application/json",
  })
  Role getSingleRole(@Param("id") String id, @Param("accountId") String accountId, @Param("roleId") Integer roleId, @Param("role") String role);
  

  /**
   * Get a single role
   * Retrieve information about a single role
   * Note, this is equivalent to the other <code>getSingleRole</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleRoleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param accountId The id of the account containing the role (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>roleId - The unique identifier for the role (required)</li>
   *   <li>role - The name for the role (optional)</li>
   *   </ul>
   * @return Role

   */
  @RequestLine("GET /v1/accounts/{accountId}/roles/{id}?role_id={roleId}&role={role}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Role getSingleRole(@Param("id") String id, @Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleRole</code> method in a fluent style.
   */
  public static class GetSingleRoleQueryParams extends HashMap<String, Object> {
    public GetSingleRoleQueryParams roleId(final Integer value) {
      put("role_id", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleRoleQueryParams role(final String value) {
      put("role", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List roles
   * A paginated list of the roles available to an account.
   * @param accountId The id of the account to retrieve roles for. (required)
   * @param state Filter by role state. If this argument is omitted, only &#x27;active&#x27; roles are returned. (optional)
   * @param showInherited If this argument is true, all roles inherited from parent accounts will be included. (optional)
   * @return List&lt;Role&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/roles?state={state}&show_inherited={showInherited}")
  @Headers({
      "Accept: application/json",
  })
  List<Role> listRoles(@Param("accountId") String accountId, @Param("state") List<String> state, @Param("showInherited") Boolean showInherited);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Role&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Role> listRoles(URI uri);
  

  /**
   * List roles
   * A paginated list of the roles available to an account.
   * Note, this is equivalent to the other <code>listRoles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListRolesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId The id of the account to retrieve roles for. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>state - Filter by role state. If this argument is omitted, only &#x27;active&#x27; roles are returned. (optional)</li>
   *   <li>showInherited - If this argument is true, all roles inherited from parent accounts will be included. (optional)</li>
   *   </ul>
   * @return List&lt;Role&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/roles?state={state}&show_inherited={showInherited}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Role> listRoles(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listRoles</code> method in a fluent style.
   */
  public static class ListRolesQueryParams extends HashMap<String, Object> {
    public ListRolesQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListRolesQueryParams showInherited(final Boolean value) {
      put("show_inherited", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Update a role
   * Update permissions for an existing role.  Recognized roles are: * TeacherEnrollment * StudentEnrollment * TaEnrollment * ObserverEnrollment * DesignerEnrollment * AccountAdmin * Any previously created custom role
   * @param accountId ID (required)
   * @param id ID (required)
   * @param label  (optional)
   * @param permissionsXExplicit  (optional)
   * @param permissionsXEnabled  (optional)
   * @param permissionsXAppliesToSelf  (optional)
   * @param permissionsXAppliesToDescendants  (optional)
   * @return Role
   */
  @RequestLine("PUT /v1/accounts/{accountId}/roles/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Role updateRole(@Param("accountId") String accountId, @Param("id") String id, @Param("label") String label, @Param("permissionsXExplicit") Boolean permissionsXExplicit, @Param("permissionsXEnabled") Boolean permissionsXEnabled, @Param("permissionsXAppliesToSelf") Boolean permissionsXAppliesToSelf, @Param("permissionsXAppliesToDescendants") Boolean permissionsXAppliesToDescendants);
  
}
