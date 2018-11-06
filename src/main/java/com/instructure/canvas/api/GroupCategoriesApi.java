package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.GroupCategory;
import com.instructure.canvas.model.GroupMembership;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface GroupCategoriesApi extends ApiClient.Api {

  /**
   * Assign unassigned members
   * Assign all unassigned members as evenly as possible among the existing student groups.
   * @param groupCategoryId ID (required)
   * @param sync  (optional)
   * @return GroupMembership
   */
  @RequestLine("POST /v1/group_categories/{groupCategoryId}/assign_unassigned_members")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupMembership assignUnassignedMembers(@Param("groupCategoryId") String groupCategoryId, @Param("sync") Boolean sync);
  
  /**
   * Create a Group Category
   * Create a new group category
   * @param accountId ID (required)
   * @param name  (optional)
   * @param selfSignup  (optional)
   * @param autoLeader  (optional)
   * @param groupLimit  (optional)
   * @param sisGroupCategoryId  (optional)
   * @param createGroupCount  (optional)
   * @param splitGroupCount  (optional)
   * @return GroupCategory
   */
  @RequestLine("POST /v1/accounts/{accountId}/group_categories")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupCategory createGroupCategoryAccounts(@Param("accountId") String accountId, @Param("name") String name, @Param("selfSignup") String selfSignup, @Param("autoLeader") String autoLeader, @Param("groupLimit") Integer groupLimit, @Param("sisGroupCategoryId") String sisGroupCategoryId, @Param("createGroupCount") Integer createGroupCount, @Param("splitGroupCount") String splitGroupCount);
  
  /**
   * Create a Group Category
   * Create a new group category
   * @param courseId ID (required)
   * @param name  (optional)
   * @param selfSignup  (optional)
   * @param autoLeader  (optional)
   * @param groupLimit  (optional)
   * @param sisGroupCategoryId  (optional)
   * @param createGroupCount  (optional)
   * @param splitGroupCount  (optional)
   * @return GroupCategory
   */
  @RequestLine("POST /v1/courses/{courseId}/group_categories")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupCategory createGroupCategoryCourses(@Param("courseId") String courseId, @Param("name") String name, @Param("selfSignup") String selfSignup, @Param("autoLeader") String autoLeader, @Param("groupLimit") Integer groupLimit, @Param("sisGroupCategoryId") String sisGroupCategoryId, @Param("createGroupCount") Integer createGroupCount, @Param("splitGroupCount") String splitGroupCount);
  
  /**
   * Delete a Group Category
   * Deletes a group category and all groups under it. Protected group categories can not be deleted, i.e. \&quot;communities\&quot; and \&quot;student_organized\&quot;.
   * @param groupCategoryId ID (required)
   */
  @RequestLine("DELETE /v1/group_categories/{groupCategoryId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteGroupCategory(@Param("groupCategoryId") String groupCategoryId);
  
  /**
   * Get a single group category
   * Returns the data for a single group category, or a 401 if the caller doesn&#x27;t have the rights to see it.
   * @param groupCategoryId ID (required)
   * @return GroupCategory
   */
  @RequestLine("GET /v1/group_categories/{groupCategoryId}")
  @Headers({
      "Accept: application/json",
  })
  GroupCategory getSingleGroupCategory(@Param("groupCategoryId") String groupCategoryId);
  
  /**
   * List group categories for a context
   * Returns a paginated list of group categories in a context
   * @param accountId ID (required)
   * @return List&lt;GroupCategory&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/group_categories")
  @Headers({
      "Accept: application/json",
  })
  List<GroupCategory> listGroupCategoriesForContextAccounts(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GroupCategory&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GroupCategory> listGroupCategoriesForContextAccounts(URI uri);
  
  /**
   * List group categories for a context
   * Returns a paginated list of group categories in a context
   * @param courseId ID (required)
   * @return List&lt;GroupCategory&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/group_categories")
  @Headers({
      "Accept: application/json",
  })
  List<GroupCategory> listGroupCategoriesForContextCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GroupCategory&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GroupCategory> listGroupCategoriesForContextCourses(URI uri);
  
  /**
   * List users in group category
   * Returns a paginated list of users in the group category.
   * @param groupCategoryId ID (required)
   * @param searchTerm The partial name or full ID of the users to match and return in the results list. Must be at least 3 characters. (optional)
   * @param unassigned Set this value to true if you wish only to search unassigned users in the group category. (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/group_categories/{groupCategoryId}/users?search_term={searchTerm}&unassigned={unassigned}")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInGroupCategory(@Param("groupCategoryId") String groupCategoryId, @Param("searchTerm") String searchTerm, @Param("unassigned") Boolean unassigned);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInGroupCategory(URI uri);
  

  /**
   * List users in group category
   * Returns a paginated list of users in the group category.
   * Note, this is equivalent to the other <code>listUsersInGroupCategory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUsersInGroupCategoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupCategoryId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name or full ID of the users to match and return in the results list. Must be at least 3 characters. (optional)</li>
   *   <li>unassigned - Set this value to true if you wish only to search unassigned users in the group category. (optional)</li>
   *   </ul>
   * @return List&lt;User&gt;

   */
  @RequestLine("GET /v1/group_categories/{groupCategoryId}/users?search_term={searchTerm}&unassigned={unassigned}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<User> listUsersInGroupCategory(@Param("groupCategoryId") String groupCategoryId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUsersInGroupCategory</code> method in a fluent style.
   */
  public static class ListUsersInGroupCategoryQueryParams extends HashMap<String, Object> {
    public ListUsersInGroupCategoryQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInGroupCategoryQueryParams unassigned(final Boolean value) {
      put("unassigned", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Update a Group Category
   * Modifies an existing group category.
   * @param groupCategoryId ID (required)
   * @param name  (optional)
   * @param selfSignup  (optional)
   * @param autoLeader  (optional)
   * @param groupLimit  (optional)
   * @param sisGroupCategoryId  (optional)
   * @param createGroupCount  (optional)
   * @param splitGroupCount  (optional)
   * @return GroupCategory
   */
  @RequestLine("PUT /v1/group_categories/{groupCategoryId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GroupCategory updateGroupCategory(@Param("groupCategoryId") String groupCategoryId, @Param("name") String name, @Param("selfSignup") String selfSignup, @Param("autoLeader") String autoLeader, @Param("groupLimit") Integer groupLimit, @Param("sisGroupCategoryId") String sisGroupCategoryId, @Param("createGroupCount") Integer createGroupCount, @Param("splitGroupCount") String splitGroupCount);
  
}
