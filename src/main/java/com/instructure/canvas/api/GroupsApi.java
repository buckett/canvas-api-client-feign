package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Group;
import com.instructure.canvas.model.GroupMembership;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface GroupsApi extends ApiClient.Api {

  /**
   * Create a group
   * Creates a new group. Groups created using the \&quot;/api/v1/groups/\&quot; endpoint will be community groups.
   * @param groupCategoryId ID (required)
   * @param name  (optional)
   * @param description  (optional)
   * @param isPublic  (optional)
   * @param joinLevel  (optional)
   * @param storageQuotaMb  (optional)
   * @param sisGroupId  (optional)
   * @return Group
   */
  @RequestLine("POST /v1/group_categories/{groupCategoryId}/groups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Group createGroupGroupCategories(@Param("groupCategoryId") String groupCategoryId, @Param("name") String name, @Param("description") String description, @Param("isPublic") Boolean isPublic, @Param("joinLevel") String joinLevel, @Param("storageQuotaMb") Integer storageQuotaMb, @Param("sisGroupId") String sisGroupId);
  
  /**
   * Create a group
   * Creates a new group. Groups created using the \&quot;/api/v1/groups/\&quot; endpoint will be community groups.
   * @param name  (optional)
   * @param description  (optional)
   * @param isPublic  (optional)
   * @param joinLevel  (optional)
   * @param storageQuotaMb  (optional)
   * @param sisGroupId  (optional)
   * @return Group
   */
  @RequestLine("POST /v1/groups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Group createGroupGroups(@Param("name") String name, @Param("description") String description, @Param("isPublic") Boolean isPublic, @Param("joinLevel") String joinLevel, @Param("storageQuotaMb") Integer storageQuotaMb, @Param("sisGroupId") String sisGroupId);
  
  /**
   * Create a membership
   * Join, or request to join, a group, depending on the join_level of the group.  If the membership or join request already exists, then it is simply returned
   * @param groupId ID (required)
   * @param userId  (optional)
   * @return GroupMembership
   */
  @RequestLine("POST /v1/groups/{groupId}/memberships")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupMembership createMembership(@Param("groupId") String groupId, @Param("userId") String userId);
  
  /**
   * Delete a group
   * Deletes a group and removes all members.
   * @param groupId ID (required)
   * @return Group
   */
  @RequestLine("DELETE /v1/groups/{groupId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Group deleteGroup(@Param("groupId") String groupId);
  
  /**
   * Edit a group
   * Modifies an existing group.  Note that to set an avatar image for the group, you must first upload the image file to the group, and the use the id in the response as the argument to this function.  See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.
   * @param groupId ID (required)
   * @param name  (optional)
   * @param description  (optional)
   * @param isPublic  (optional)
   * @param joinLevel  (optional)
   * @param avatarId  (optional)
   * @param storageQuotaMb  (optional)
   * @param members  (optional)
   * @param sisGroupId  (optional)
   * @return Group
   */
  @RequestLine("PUT /v1/groups/{groupId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Group editGroup(@Param("groupId") String groupId, @Param("name") String name, @Param("description") String description, @Param("isPublic") Boolean isPublic, @Param("joinLevel") String joinLevel, @Param("avatarId") Integer avatarId, @Param("storageQuotaMb") Integer storageQuotaMb, @Param("members") List<String> members, @Param("sisGroupId") String sisGroupId);
  
  /**
   * Get a single group
   * Returns the data for a single group, or a 401 if the caller doesn&#x27;t have the rights to see it.
   * @param groupId ID (required)
   * @param include - \&quot;permissions\&quot;: Include permissions the current user has   for the group. - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)
   * @return Group
   */
  @RequestLine("GET /v1/groups/{groupId}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  Group getSingleGroup(@Param("groupId") String groupId, @Param("include") List<String> include);
  

  /**
   * Get a single group
   * Returns the data for a single group, or a 401 if the caller doesn&#x27;t have the rights to see it.
   * Note, this is equivalent to the other <code>getSingleGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;permissions\&quot;: Include permissions the current user has   for the group. - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)</li>
   *   </ul>
   * @return Group

   */
  @RequestLine("GET /v1/groups/{groupId}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Group getSingleGroup(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleGroup</code> method in a fluent style.
   */
  public static class GetSingleGroupQueryParams extends HashMap<String, Object> {
    public GetSingleGroupQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single group membership
   * Returns the group membership with the given membership id or user id.
   * @param groupId ID (required)
   * @param membershipId ID (required)
   * @return GroupMembership
   */
  @RequestLine("GET /v1/groups/{groupId}/memberships/{membershipId}")
  @Headers({
      "Accept: application/json",
  })
  GroupMembership getSingleGroupMembershipMemberships(@Param("groupId") String groupId, @Param("membershipId") String membershipId);
  
  /**
   * Get a single group membership
   * Returns the group membership with the given membership id or user id.
   * @param groupId ID (required)
   * @param userId ID (required)
   * @return GroupMembership
   */
  @RequestLine("GET /v1/groups/{groupId}/users/{userId}")
  @Headers({
      "Accept: application/json",
  })
  GroupMembership getSingleGroupMembershipUsers(@Param("groupId") String groupId, @Param("userId") String userId);
  
  /**
   * Group activity stream
   * Returns the current user&#x27;s group-specific activity stream, paginated.  For full documentation, see the API documentation for the user activity stream, in the user api.
   * @param groupId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/activity_stream")
  @Headers({
      "Accept: */*",
  })
  void groupActivityStream(@Param("groupId") String groupId);
  
  /**
   * Group activity stream summary
   * Returns a summary of the current user&#x27;s group-specific activity stream.  For full documentation, see the API documentation for the user activity stream summary, in the user api.
   * @param groupId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/activity_stream/summary")
  @Headers({
      "Accept: */*",
  })
  void groupActivityStreamSummary(@Param("groupId") String groupId);
  
  /**
   * Invite others to a group
   * Sends an invitation to all supplied email addresses which will allow the receivers to join the group.
   * @param groupId ID (required)
   * @param invitees  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/invite")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void inviteOthersToGroup(@Param("groupId") String groupId, @Param("invitees") List<String> invitees);
  
  /**
   * Leave a group
   * Leave a group if you are allowed to leave (some groups, such as sets of course groups created by teachers, cannot be left). You may also use &#x27;self&#x27; in place of a membership_id.
   * @param groupId ID (required)
   * @param membershipId ID (required)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/memberships/{membershipId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void leaveGroupMemberships(@Param("groupId") String groupId, @Param("membershipId") String membershipId);
  
  /**
   * Leave a group
   * Leave a group if you are allowed to leave (some groups, such as sets of course groups created by teachers, cannot be left). You may also use &#x27;self&#x27; in place of a membership_id.
   * @param groupId ID (required)
   * @param userId ID (required)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/users/{userId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void leaveGroupUsers(@Param("groupId") String groupId, @Param("userId") String userId);
  
  /**
   * List group memberships
   * A paginated list of the members of a group.
   * @param groupId ID (required)
   * @param filterStates Only list memberships with the given workflow_states. By default it will return all memberships. (optional)
   * @return List&lt;GroupMembership&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/memberships?filter_states={filterStates}")
  @Headers({
      "Accept: application/json",
  })
  List<GroupMembership> listGroupMemberships(@Param("groupId") String groupId, @Param("filterStates") List<String> filterStates);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GroupMembership&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GroupMembership> listGroupMemberships(URI uri);
  

  /**
   * List group memberships
   * A paginated list of the members of a group.
   * Note, this is equivalent to the other <code>listGroupMemberships</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGroupMembershipsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>filterStates - Only list memberships with the given workflow_states. By default it will return all memberships. (optional)</li>
   *   </ul>
   * @return List&lt;GroupMembership&gt;

   */
  @RequestLine("GET /v1/groups/{groupId}/memberships?filter_states={filterStates}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<GroupMembership> listGroupMemberships(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listGroupMemberships</code> method in a fluent style.
   */
  public static class ListGroupMembershipsQueryParams extends HashMap<String, Object> {
    public ListGroupMembershipsQueryParams filterStates(final List<String> value) {
      put("filter_states", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List group&#x27;s users
   * Returns a paginated list of users in the group.
   * @param groupId ID (required)
   * @param searchTerm The partial name or full ID of the users to match and return in the results list. Must be at least 3 characters. (optional)
   * @param include - \&quot;avatar_url\&quot;: Include users&#x27; avatar_urls. (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/users?search_term={searchTerm}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<User> listGroupSUsers(@Param("groupId") String groupId, @Param("searchTerm") String searchTerm, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listGroupSUsers(URI uri);
  

  /**
   * List group&#x27;s users
   * Returns a paginated list of users in the group.
   * Note, this is equivalent to the other <code>listGroupSUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGroupSUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name or full ID of the users to match and return in the results list. Must be at least 3 characters. (optional)</li>
   *   <li>include - - \&quot;avatar_url\&quot;: Include users&#x27; avatar_urls. (optional)</li>
   *   </ul>
   * @return List&lt;User&gt;

   */
  @RequestLine("GET /v1/groups/{groupId}/users?search_term={searchTerm}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<User> listGroupSUsers(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listGroupSUsers</code> method in a fluent style.
   */
  public static class ListGroupSUsersQueryParams extends HashMap<String, Object> {
    public ListGroupSUsersQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListGroupSUsersQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List the groups available in a context.
   * Returns the paginated list of active groups in the given context that are visible to user.
   * @param accountId ID (required)
   * @param onlyOwnGroups Will only include groups that the user belongs to if this is set (optional)
   * @param include - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/groups?only_own_groups={onlyOwnGroups}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listGroupsAvailableInContextAccounts(@Param("accountId") String accountId, @Param("onlyOwnGroups") Boolean onlyOwnGroups, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listGroupsAvailableInContextAccounts(URI uri);
  

  /**
   * List the groups available in a context.
   * Returns the paginated list of active groups in the given context that are visible to user.
   * Note, this is equivalent to the other <code>listGroupsAvailableInContextAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGroupsAvailableInContextAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>onlyOwnGroups - Will only include groups that the user belongs to if this is set (optional)</li>
   *   <li>include - - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)</li>
   *   </ul>
   * @return List&lt;Group&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/groups?only_own_groups={onlyOwnGroups}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Group> listGroupsAvailableInContextAccounts(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listGroupsAvailableInContextAccounts</code> method in a fluent style.
   */
  public static class ListGroupsAvailableInContextAccountsQueryParams extends HashMap<String, Object> {
    public ListGroupsAvailableInContextAccountsQueryParams onlyOwnGroups(final Boolean value) {
      put("only_own_groups", EncodingUtils.encode(value));
      return this;
    }
    public ListGroupsAvailableInContextAccountsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List the groups available in a context.
   * Returns the paginated list of active groups in the given context that are visible to user.
   * @param courseId ID (required)
   * @param onlyOwnGroups Will only include groups that the user belongs to if this is set (optional)
   * @param include - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/groups?only_own_groups={onlyOwnGroups}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listGroupsAvailableInContextCourses(@Param("courseId") String courseId, @Param("onlyOwnGroups") Boolean onlyOwnGroups, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listGroupsAvailableInContextCourses(URI uri);
  

  /**
   * List the groups available in a context.
   * Returns the paginated list of active groups in the given context that are visible to user.
   * Note, this is equivalent to the other <code>listGroupsAvailableInContextCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListGroupsAvailableInContextCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>onlyOwnGroups - Will only include groups that the user belongs to if this is set (optional)</li>
   *   <li>include - - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)</li>
   *   </ul>
   * @return List&lt;Group&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/groups?only_own_groups={onlyOwnGroups}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Group> listGroupsAvailableInContextCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listGroupsAvailableInContextCourses</code> method in a fluent style.
   */
  public static class ListGroupsAvailableInContextCoursesQueryParams extends HashMap<String, Object> {
    public ListGroupsAvailableInContextCoursesQueryParams onlyOwnGroups(final Boolean value) {
      put("only_own_groups", EncodingUtils.encode(value));
      return this;
    }
    public ListGroupsAvailableInContextCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List your groups
   * Returns a paginated list of active groups for the current user.
   * @param contextType Only include groups that are in this type of context. (optional)
   * @param include - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET /v1/users/self/groups?context_type={contextType}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listYourGroups(@Param("contextType") String contextType, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listYourGroups(URI uri);
  

  /**
   * List your groups
   * Returns a paginated list of active groups for the current user.
   * Note, this is equivalent to the other <code>listYourGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListYourGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>contextType - Only include groups that are in this type of context. (optional)</li>
   *   <li>include - - \&quot;tabs\&quot;: Include the list of tabs configured for each group.  See the   {api:TabsController#index List available tabs API} for more information. (optional)</li>
   *   </ul>
   * @return List&lt;Group&gt;

   */
  @RequestLine("GET /v1/users/self/groups?context_type={contextType}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Group> listYourGroups(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listYourGroups</code> method in a fluent style.
   */
  public static class ListYourGroupsQueryParams extends HashMap<String, Object> {
    public ListYourGroupsQueryParams contextType(final String value) {
      put("context_type", EncodingUtils.encode(value));
      return this;
    }
    public ListYourGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Permissions
   * Returns permission information for the calling user in the given group. See also the {api:AccountsController#permissions Account} and {api:CoursesController#permissions Course} counterparts.
   * @param groupId ID (required)
   * @param permissions List of permissions to check against the authenticated user. Permission names are documented in the {api:RoleOverridesController#add_role Create a role} endpoint. (optional)
   */
  @RequestLine("GET /v1/groups/{groupId}/permissions?permissions={permissions}")
  @Headers({
      "Accept: */*",
  })
  void permissions(@Param("groupId") String groupId, @Param("permissions") List<String> permissions);
  

  /**
   * Permissions
   * Returns permission information for the calling user in the given group. See also the {api:AccountsController#permissions Account} and {api:CoursesController#permissions Course} counterparts.
   * Note, this is equivalent to the other <code>permissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PermissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>permissions - List of permissions to check against the authenticated user. Permission names are documented in the {api:RoleOverridesController#add_role Create a role} endpoint. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/groups/{groupId}/permissions?permissions={permissions}")
  @Headers({
      "Content-Type: */*",
  })
  void permissions(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>permissions</code> method in a fluent style.
   */
  public static class PermissionsQueryParams extends HashMap<String, Object> {
    public PermissionsQueryParams permissions(final List<String> value) {
      put("permissions", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Preview processed html
   * Preview html content processed for this group
   * @param groupId ID (required)
   * @param html  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/preview_html")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void previewProcessedHtml(@Param("groupId") String groupId, @Param("html") String html);
  
  /**
   * Update a membership
   * Accept a membership request, or add/remove moderator rights.
   * @param groupId ID (required)
   * @param membershipId ID (required)
   * @param workflowState  (optional)
   * @param moderator  (optional)
   * @return GroupMembership
   */
  @RequestLine("PUT /v1/groups/{groupId}/memberships/{membershipId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupMembership updateMembershipMemberships(@Param("groupId") String groupId, @Param("membershipId") String membershipId, @Param("workflowState") String workflowState, @Param("moderator") String moderator);
  
  /**
   * Update a membership
   * Accept a membership request, or add/remove moderator rights.
   * @param groupId ID (required)
   * @param userId ID (required)
   * @param workflowState  (optional)
   * @param moderator  (optional)
   * @return GroupMembership
   */
  @RequestLine("PUT /v1/groups/{groupId}/users/{userId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupMembership updateMembershipUsers(@Param("groupId") String groupId, @Param("userId") String userId, @Param("workflowState") String workflowState, @Param("moderator") String moderator);
  
  /**
   * Upload a file
   * Upload a file to the group.  This API endpoint is the first step in uploading a file to a group. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  Only those with the \&quot;Manage Files\&quot; permission on a group can upload files to the group. By default, this is anybody participating in the group, or any admin over the group.
   * @param groupId ID (required)
   */
  @RequestLine("POST /v1/groups/{groupId}/files")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void uploadFile(@Param("groupId") String groupId);
  
}
