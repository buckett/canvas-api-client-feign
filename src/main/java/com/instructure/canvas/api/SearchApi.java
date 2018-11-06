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
public interface SearchApi extends ApiClient.Api {

  /**
   * Find recipients
   * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
   * @param search Search terms used for matching users/courses/groups (e.g. \&quot;bob smith\&quot;). If multiple terms are given (separated via whitespace), only results matching all terms will be returned. (optional)
   * @param context Limit the search to a particular course/group (e.g. \&quot;course_3\&quot; or \&quot;group_4\&quot;). (optional)
   * @param exclude Array of ids to exclude from the search. These may be user ids or course/group ids prefixed with \&quot;course_\&quot; or \&quot;group_\&quot; respectively, e.g. exclude[]&#x3D;1&amp;exclude[]&#x3D;2&amp;exclude[]&#x3D;course_3 (optional)
   * @param type Limit the search just to users or contexts (groups/courses). (optional)
   * @param userId Search for a specific user id. This ignores the other above parameters, and will never return more than one result. (optional)
   * @param fromConversationId When searching by user_id, only users that could be normally messaged by this user will be returned. This parameter allows you to specify a conversation that will be referenced for a shared context -- if both the current user and the searched user are in the conversation, the user will be returned. This is used to start new side conversations. (optional)
   * @param permissions Array of permission strings to be checked for each matched context (e.g. \&quot;send_messages\&quot;). This argument determines which permissions may be returned in the response; it won&#x27;t prevent contexts from being returned if they don&#x27;t grant the permission(s). (optional)
   */
  @RequestLine("GET /v1/conversations/find_recipients?search={search}&context={context}&exclude={exclude}&type={type}&user_id={userId}&from_conversation_id={fromConversationId}&permissions={permissions}")
  @Headers({
      "Accept: */*",
  })
  void findRecipientsConversations(@Param("search") String search, @Param("context") String context, @Param("exclude") List<String> exclude, @Param("type") String type, @Param("userId") Integer userId, @Param("fromConversationId") Integer fromConversationId, @Param("permissions") List<String> permissions);
  

  /**
   * Find recipients
   * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
   * Note, this is equivalent to the other <code>findRecipientsConversations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindRecipientsConversationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>search - Search terms used for matching users/courses/groups (e.g. \&quot;bob smith\&quot;). If multiple terms are given (separated via whitespace), only results matching all terms will be returned. (optional)</li>
   *   <li>context - Limit the search to a particular course/group (e.g. \&quot;course_3\&quot; or \&quot;group_4\&quot;). (optional)</li>
   *   <li>exclude - Array of ids to exclude from the search. These may be user ids or course/group ids prefixed with \&quot;course_\&quot; or \&quot;group_\&quot; respectively, e.g. exclude[]&#x3D;1&amp;exclude[]&#x3D;2&amp;exclude[]&#x3D;course_3 (optional)</li>
   *   <li>type - Limit the search just to users or contexts (groups/courses). (optional)</li>
   *   <li>userId - Search for a specific user id. This ignores the other above parameters, and will never return more than one result. (optional)</li>
   *   <li>fromConversationId - When searching by user_id, only users that could be normally messaged by this user will be returned. This parameter allows you to specify a conversation that will be referenced for a shared context -- if both the current user and the searched user are in the conversation, the user will be returned. This is used to start new side conversations. (optional)</li>
   *   <li>permissions - Array of permission strings to be checked for each matched context (e.g. \&quot;send_messages\&quot;). This argument determines which permissions may be returned in the response; it won&#x27;t prevent contexts from being returned if they don&#x27;t grant the permission(s). (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/conversations/find_recipients?search={search}&context={context}&exclude={exclude}&type={type}&user_id={userId}&from_conversation_id={fromConversationId}&permissions={permissions}")
  @Headers({
      "Content-Type: */*",
  })
  void findRecipientsConversations(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>findRecipientsConversations</code> method in a fluent style.
   */
  public static class FindRecipientsConversationsQueryParams extends HashMap<String, Object> {
    public FindRecipientsConversationsQueryParams search(final String value) {
      put("search", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsConversationsQueryParams context(final String value) {
      put("context", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsConversationsQueryParams exclude(final List<String> value) {
      put("exclude", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public FindRecipientsConversationsQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsConversationsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsConversationsQueryParams fromConversationId(final Integer value) {
      put("from_conversation_id", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsConversationsQueryParams permissions(final List<String> value) {
      put("permissions", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Find recipients
   * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
   * @param search Search terms used for matching users/courses/groups (e.g. \&quot;bob smith\&quot;). If multiple terms are given (separated via whitespace), only results matching all terms will be returned. (optional)
   * @param context Limit the search to a particular course/group (e.g. \&quot;course_3\&quot; or \&quot;group_4\&quot;). (optional)
   * @param exclude Array of ids to exclude from the search. These may be user ids or course/group ids prefixed with \&quot;course_\&quot; or \&quot;group_\&quot; respectively, e.g. exclude[]&#x3D;1&amp;exclude[]&#x3D;2&amp;exclude[]&#x3D;course_3 (optional)
   * @param type Limit the search just to users or contexts (groups/courses). (optional)
   * @param userId Search for a specific user id. This ignores the other above parameters, and will never return more than one result. (optional)
   * @param fromConversationId When searching by user_id, only users that could be normally messaged by this user will be returned. This parameter allows you to specify a conversation that will be referenced for a shared context -- if both the current user and the searched user are in the conversation, the user will be returned. This is used to start new side conversations. (optional)
   * @param permissions Array of permission strings to be checked for each matched context (e.g. \&quot;send_messages\&quot;). This argument determines which permissions may be returned in the response; it won&#x27;t prevent contexts from being returned if they don&#x27;t grant the permission(s). (optional)
   */
  @RequestLine("GET /v1/search/recipients?search={search}&context={context}&exclude={exclude}&type={type}&user_id={userId}&from_conversation_id={fromConversationId}&permissions={permissions}")
  @Headers({
      "Accept: */*",
  })
  void findRecipientsSearch(@Param("search") String search, @Param("context") String context, @Param("exclude") List<String> exclude, @Param("type") String type, @Param("userId") Integer userId, @Param("fromConversationId") Integer fromConversationId, @Param("permissions") List<String> permissions);
  

  /**
   * Find recipients
   * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
   * Note, this is equivalent to the other <code>findRecipientsSearch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindRecipientsSearchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>search - Search terms used for matching users/courses/groups (e.g. \&quot;bob smith\&quot;). If multiple terms are given (separated via whitespace), only results matching all terms will be returned. (optional)</li>
   *   <li>context - Limit the search to a particular course/group (e.g. \&quot;course_3\&quot; or \&quot;group_4\&quot;). (optional)</li>
   *   <li>exclude - Array of ids to exclude from the search. These may be user ids or course/group ids prefixed with \&quot;course_\&quot; or \&quot;group_\&quot; respectively, e.g. exclude[]&#x3D;1&amp;exclude[]&#x3D;2&amp;exclude[]&#x3D;course_3 (optional)</li>
   *   <li>type - Limit the search just to users or contexts (groups/courses). (optional)</li>
   *   <li>userId - Search for a specific user id. This ignores the other above parameters, and will never return more than one result. (optional)</li>
   *   <li>fromConversationId - When searching by user_id, only users that could be normally messaged by this user will be returned. This parameter allows you to specify a conversation that will be referenced for a shared context -- if both the current user and the searched user are in the conversation, the user will be returned. This is used to start new side conversations. (optional)</li>
   *   <li>permissions - Array of permission strings to be checked for each matched context (e.g. \&quot;send_messages\&quot;). This argument determines which permissions may be returned in the response; it won&#x27;t prevent contexts from being returned if they don&#x27;t grant the permission(s). (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/search/recipients?search={search}&context={context}&exclude={exclude}&type={type}&user_id={userId}&from_conversation_id={fromConversationId}&permissions={permissions}")
  @Headers({
      "Content-Type: */*",
  })
  void findRecipientsSearch(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>findRecipientsSearch</code> method in a fluent style.
   */
  public static class FindRecipientsSearchQueryParams extends HashMap<String, Object> {
    public FindRecipientsSearchQueryParams search(final String value) {
      put("search", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsSearchQueryParams context(final String value) {
      put("context", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsSearchQueryParams exclude(final List<String> value) {
      put("exclude", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public FindRecipientsSearchQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsSearchQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsSearchQueryParams fromConversationId(final Integer value) {
      put("from_conversation_id", EncodingUtils.encode(value));
      return this;
    }
    public FindRecipientsSearchQueryParams permissions(final List<String> value) {
      put("permissions", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List all courses
   * A paginated list of all courses visible in the public index
   * @param search Search terms used for matching users/courses/groups (e.g. \&quot;bob smith\&quot;). If multiple terms are given (separated via whitespace), only results matching all terms will be returned. (optional)
   * @param publicOnly Only return courses with public content. Defaults to false. (optional)
   * @param openEnrollmentOnly Only return courses that allow self enrollment. Defaults to false. (optional)
   */
  @RequestLine("GET /v1/search/all_courses?search={search}&public_only={publicOnly}&open_enrollment_only={openEnrollmentOnly}")
  @Headers({
      "Accept: */*",
  })
  void listAllCourses(@Param("search") String search, @Param("publicOnly") Boolean publicOnly, @Param("openEnrollmentOnly") Boolean openEnrollmentOnly);
  

  /**
   * List all courses
   * A paginated list of all courses visible in the public index
   * Note, this is equivalent to the other <code>listAllCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>search - Search terms used for matching users/courses/groups (e.g. \&quot;bob smith\&quot;). If multiple terms are given (separated via whitespace), only results matching all terms will be returned. (optional)</li>
   *   <li>publicOnly - Only return courses with public content. Defaults to false. (optional)</li>
   *   <li>openEnrollmentOnly - Only return courses that allow self enrollment. Defaults to false. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/search/all_courses?search={search}&public_only={publicOnly}&open_enrollment_only={openEnrollmentOnly}")
  @Headers({
      "Content-Type: */*",
  })
  void listAllCourses(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAllCourses</code> method in a fluent style.
   */
  public static class ListAllCoursesQueryParams extends HashMap<String, Object> {
    public ListAllCoursesQueryParams search(final String value) {
      put("search", EncodingUtils.encode(value));
      return this;
    }
    public ListAllCoursesQueryParams publicOnly(final Boolean value) {
      put("public_only", EncodingUtils.encode(value));
      return this;
    }
    public ListAllCoursesQueryParams openEnrollmentOnly(final Boolean value) {
      put("open_enrollment_only", EncodingUtils.encode(value));
      return this;
    }
  }
}
