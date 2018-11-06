package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.DiscussionTopic;
import java.io.File;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface DiscussionTopicsApi extends ApiClient.Api {

  /**
   * Create a new discussion topic
   * Create an new discussion topic for the course or group.
   * @param courseId ID (required)
   * @param title  (optional)
   * @param message  (optional)
   * @param discussionType  (optional)
   * @param published  (optional)
   * @param delayedPostAt  (optional)
   * @param allowRating  (optional)
   * @param lockAt  (optional)
   * @param podcastEnabled  (optional)
   * @param podcastHasStudentPosts  (optional)
   * @param requireInitialPost  (optional)
   * @param assignment  (optional)
   * @param isAnnouncement  (optional)
   * @param pinned  (optional)
   * @param positionAfter  (optional)
   * @param groupCategoryId  (optional)
   * @param onlyGradersCanRate  (optional)
   * @param sortByRating  (optional)
   * @param attachment  (optional)
   * @param specificSections  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/discussion_topics")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createNewDiscussionTopicCourses(@Param("courseId") String courseId, @Param("title") String title, @Param("message") String message, @Param("discussionType") String discussionType, @Param("published") Boolean published, @Param("delayedPostAt") String delayedPostAt, @Param("allowRating") Boolean allowRating, @Param("lockAt") String lockAt, @Param("podcastEnabled") Boolean podcastEnabled, @Param("podcastHasStudentPosts") Boolean podcastHasStudentPosts, @Param("requireInitialPost") Boolean requireInitialPost, @Param("assignment") Object assignment, @Param("isAnnouncement") Boolean isAnnouncement, @Param("pinned") Boolean pinned, @Param("positionAfter") String positionAfter, @Param("groupCategoryId") Integer groupCategoryId, @Param("onlyGradersCanRate") Boolean onlyGradersCanRate, @Param("sortByRating") Boolean sortByRating, @Param("attachment") File attachment, @Param("specificSections") String specificSections);
  
  /**
   * Create a new discussion topic
   * Create an new discussion topic for the course or group.
   * @param groupId ID (required)
   * @param title  (optional)
   * @param message  (optional)
   * @param discussionType  (optional)
   * @param published  (optional)
   * @param delayedPostAt  (optional)
   * @param allowRating  (optional)
   * @param lockAt  (optional)
   * @param podcastEnabled  (optional)
   * @param podcastHasStudentPosts  (optional)
   * @param requireInitialPost  (optional)
   * @param assignment  (optional)
   * @param isAnnouncement  (optional)
   * @param pinned  (optional)
   * @param positionAfter  (optional)
   * @param groupCategoryId  (optional)
   * @param onlyGradersCanRate  (optional)
   * @param sortByRating  (optional)
   * @param attachment  (optional)
   * @param specificSections  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/discussion_topics")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createNewDiscussionTopicGroups(@Param("groupId") String groupId, @Param("title") String title, @Param("message") String message, @Param("discussionType") String discussionType, @Param("published") Boolean published, @Param("delayedPostAt") String delayedPostAt, @Param("allowRating") Boolean allowRating, @Param("lockAt") String lockAt, @Param("podcastEnabled") Boolean podcastEnabled, @Param("podcastHasStudentPosts") Boolean podcastHasStudentPosts, @Param("requireInitialPost") Boolean requireInitialPost, @Param("assignment") Object assignment, @Param("isAnnouncement") Boolean isAnnouncement, @Param("pinned") Boolean pinned, @Param("positionAfter") String positionAfter, @Param("groupCategoryId") Integer groupCategoryId, @Param("onlyGradersCanRate") Boolean onlyGradersCanRate, @Param("sortByRating") Boolean sortByRating, @Param("attachment") File attachment, @Param("specificSections") String specificSections);
  
  /**
   * Delete an entry
   * Delete a discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the delete is not allowed, a 401 will be returned.  The discussion will be marked deleted, and the user_id and message will be cleared out.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteEntryCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("id") String id);
  
  /**
   * Delete an entry
   * Delete a discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the delete is not allowed, a 401 will be returned.  The discussion will be marked deleted, and the user_id and message will be cleared out.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteEntryGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("id") String id);
  
  /**
   * Delete a topic
   * Deletes the discussion topic. This will also delete the assignment, if it&#x27;s an assignment discussion.
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * Delete a topic
   * Deletes the discussion topic. This will also delete the assignment, if it&#x27;s an assignment discussion.
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Get the full topic
   * Return a cached structure of the discussion topic, containing all entries, their authors, and their message bodies.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  In some rare situations, this cached structure may not be available yet. In that case, the server will respond with a 503 error, and the caller should try again soon.  The response is an object containing the following keys: * \&quot;participants\&quot;: A list of summary information on users who have posted to   the discussion. Each value is an object containing their id, display_name,   and avatar_url. * \&quot;unread_entries\&quot;: A list of entry ids that are unread by the current   user. this implies that any entry not in this list is read. * \&quot;entry_ratings\&quot;: A map of entry ids to ratings by the current user. Entries   not in this list have no rating. Only populated if rating is enabled. * \&quot;forced_entries\&quot;: A list of entry ids that have forced_read_state set to   true. This flag is meant to indicate the entry&#x27;s read_state has been   manually set to &#x27;unread&#x27; by the user, so the entry should not be   automatically marked as read. * \&quot;view\&quot;: A threaded view of all the entries in the discussion, containing   the id, user_id, and message. * \&quot;new_entries\&quot;: Because this view is eventually consistent, it&#x27;s possible   that newly created or updated entries won&#x27;t yet be reflected in the view.   If the application wants to also get a flat list of all entries not yet   reflected in the view, pass include_new_entries&#x3D;1 to the request and this   array of entries will be returned. These entries are returned in a flat   array, in ascending created_at order.
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}/view")
  @Headers({
      "Accept: */*",
  })
  void getFullTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * Get the full topic
   * Return a cached structure of the discussion topic, containing all entries, their authors, and their message bodies.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  In some rare situations, this cached structure may not be available yet. In that case, the server will respond with a 503 error, and the caller should try again soon.  The response is an object containing the following keys: * \&quot;participants\&quot;: A list of summary information on users who have posted to   the discussion. Each value is an object containing their id, display_name,   and avatar_url. * \&quot;unread_entries\&quot;: A list of entry ids that are unread by the current   user. this implies that any entry not in this list is read. * \&quot;entry_ratings\&quot;: A map of entry ids to ratings by the current user. Entries   not in this list have no rating. Only populated if rating is enabled. * \&quot;forced_entries\&quot;: A list of entry ids that have forced_read_state set to   true. This flag is meant to indicate the entry&#x27;s read_state has been   manually set to &#x27;unread&#x27; by the user, so the entry should not be   automatically marked as read. * \&quot;view\&quot;: A threaded view of all the entries in the discussion, containing   the id, user_id, and message. * \&quot;new_entries\&quot;: Because this view is eventually consistent, it&#x27;s possible   that newly created or updated entries won&#x27;t yet be reflected in the view.   If the application wants to also get a flat list of all entries not yet   reflected in the view, pass include_new_entries&#x3D;1 to the request and this   array of entries will be returned. These entries are returned in a flat   array, in ascending created_at order.
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}/view")
  @Headers({
      "Accept: */*",
  })
  void getFullTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Get a single topic
   * Returns data on an individual discussion topic. See the List action for the response formatting.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param include If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getSingleTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("include") List<String> include);
  

  /**
   * Get a single topic
   * Returns data on an individual discussion topic. See the List action for the response formatting.
   * Note, this is equivalent to the other <code>getSingleTopicCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleTopicCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleTopicCourses</code> method in a fluent style.
   */
  public static class GetSingleTopicCoursesQueryParams extends HashMap<String, Object> {
    public GetSingleTopicCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single topic
   * Returns data on an individual discussion topic. See the List action for the response formatting.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param include If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)
   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getSingleTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("include") List<String> include);
  

  /**
   * Get a single topic
   * Returns data on an individual discussion topic. See the List action for the response formatting.
   * Note, this is equivalent to the other <code>getSingleTopicGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleTopicGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleTopicGroups</code> method in a fluent style.
   */
  public static class GetSingleTopicGroupsQueryParams extends HashMap<String, Object> {
    public GetSingleTopicGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List discussion topics
   * Returns the paginated list of discussion topics for this course or group.
   * @param courseId ID (required)
   * @param include If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)
   * @param orderBy Determines the order of the discussion topic list. Defaults to \&quot;position\&quot;. (optional)
   * @param scope Only return discussion topics in the given state(s). Defaults to including all topics. Filtering is done after pagination, so pages may be smaller than requested if topics are filtered. Can pass multiple states as comma separated string. (optional)
   * @param onlyAnnouncements Return announcements instead of discussion topics. Defaults to false (optional)
   * @param filterBy The state of the discussion topic to return. Currently only supports unread state. (optional)
   * @param searchTerm The partial title of the discussion topics to match and return. (optional)
   * @param excludeContextModuleLockedTopics For students, exclude topics that are locked by module progression. Defaults to false. (optional)
   * @return List&lt;DiscussionTopic&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics?include={include}&order_by={orderBy}&scope={scope}&only_announcements={onlyAnnouncements}&filter_by={filterBy}&search_term={searchTerm}&exclude_context_module_locked_topics={excludeContextModuleLockedTopics}")
  @Headers({
      "Accept: application/json",
  })
  List<DiscussionTopic> listDiscussionTopicsCourses(@Param("courseId") String courseId, @Param("include") List<String> include, @Param("orderBy") String orderBy, @Param("scope") String scope, @Param("onlyAnnouncements") Boolean onlyAnnouncements, @Param("filterBy") String filterBy, @Param("searchTerm") String searchTerm, @Param("excludeContextModuleLockedTopics") Boolean excludeContextModuleLockedTopics);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;DiscussionTopic&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<DiscussionTopic> listDiscussionTopicsCourses(URI uri);
  

  /**
   * List discussion topics
   * Returns the paginated list of discussion topics for this course or group.
   * Note, this is equivalent to the other <code>listDiscussionTopicsCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDiscussionTopicsCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)</li>
   *   <li>orderBy - Determines the order of the discussion topic list. Defaults to \&quot;position\&quot;. (optional)</li>
   *   <li>scope - Only return discussion topics in the given state(s). Defaults to including all topics. Filtering is done after pagination, so pages may be smaller than requested if topics are filtered. Can pass multiple states as comma separated string. (optional)</li>
   *   <li>onlyAnnouncements - Return announcements instead of discussion topics. Defaults to false (optional)</li>
   *   <li>filterBy - The state of the discussion topic to return. Currently only supports unread state. (optional)</li>
   *   <li>searchTerm - The partial title of the discussion topics to match and return. (optional)</li>
   *   <li>excludeContextModuleLockedTopics - For students, exclude topics that are locked by module progression. Defaults to false. (optional)</li>
   *   </ul>
   * @return List&lt;DiscussionTopic&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics?include={include}&order_by={orderBy}&scope={scope}&only_announcements={onlyAnnouncements}&filter_by={filterBy}&search_term={searchTerm}&exclude_context_module_locked_topics={excludeContextModuleLockedTopics}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<DiscussionTopic> listDiscussionTopicsCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listDiscussionTopicsCourses</code> method in a fluent style.
   */
  public static class ListDiscussionTopicsCoursesQueryParams extends HashMap<String, Object> {
    public ListDiscussionTopicsCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListDiscussionTopicsCoursesQueryParams orderBy(final String value) {
      put("order_by", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsCoursesQueryParams scope(final String value) {
      put("scope", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsCoursesQueryParams onlyAnnouncements(final Boolean value) {
      put("only_announcements", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsCoursesQueryParams filterBy(final String value) {
      put("filter_by", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsCoursesQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsCoursesQueryParams excludeContextModuleLockedTopics(final Boolean value) {
      put("exclude_context_module_locked_topics", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List discussion topics
   * Returns the paginated list of discussion topics for this course or group.
   * @param groupId ID (required)
   * @param include If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)
   * @param orderBy Determines the order of the discussion topic list. Defaults to \&quot;position\&quot;. (optional)
   * @param scope Only return discussion topics in the given state(s). Defaults to including all topics. Filtering is done after pagination, so pages may be smaller than requested if topics are filtered. Can pass multiple states as comma separated string. (optional)
   * @param onlyAnnouncements Return announcements instead of discussion topics. Defaults to false (optional)
   * @param filterBy The state of the discussion topic to return. Currently only supports unread state. (optional)
   * @param searchTerm The partial title of the discussion topics to match and return. (optional)
   * @param excludeContextModuleLockedTopics For students, exclude topics that are locked by module progression. Defaults to false. (optional)
   * @return List&lt;DiscussionTopic&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics?include={include}&order_by={orderBy}&scope={scope}&only_announcements={onlyAnnouncements}&filter_by={filterBy}&search_term={searchTerm}&exclude_context_module_locked_topics={excludeContextModuleLockedTopics}")
  @Headers({
      "Accept: application/json",
  })
  List<DiscussionTopic> listDiscussionTopicsGroups(@Param("groupId") String groupId, @Param("include") List<String> include, @Param("orderBy") String orderBy, @Param("scope") String scope, @Param("onlyAnnouncements") Boolean onlyAnnouncements, @Param("filterBy") String filterBy, @Param("searchTerm") String searchTerm, @Param("excludeContextModuleLockedTopics") Boolean excludeContextModuleLockedTopics);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;DiscussionTopic&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<DiscussionTopic> listDiscussionTopicsGroups(URI uri);
  

  /**
   * List discussion topics
   * Returns the paginated list of discussion topics for this course or group.
   * Note, this is equivalent to the other <code>listDiscussionTopicsGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDiscussionTopicsGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If \&quot;all_dates\&quot; is passed, all dates associated with graded discussions&#x27; assignments will be included. if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to certain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. If \&quot;overrides\&quot; is passed, the overrides for the assignment will be included (optional)</li>
   *   <li>orderBy - Determines the order of the discussion topic list. Defaults to \&quot;position\&quot;. (optional)</li>
   *   <li>scope - Only return discussion topics in the given state(s). Defaults to including all topics. Filtering is done after pagination, so pages may be smaller than requested if topics are filtered. Can pass multiple states as comma separated string. (optional)</li>
   *   <li>onlyAnnouncements - Return announcements instead of discussion topics. Defaults to false (optional)</li>
   *   <li>filterBy - The state of the discussion topic to return. Currently only supports unread state. (optional)</li>
   *   <li>searchTerm - The partial title of the discussion topics to match and return. (optional)</li>
   *   <li>excludeContextModuleLockedTopics - For students, exclude topics that are locked by module progression. Defaults to false. (optional)</li>
   *   </ul>
   * @return List&lt;DiscussionTopic&gt;

   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics?include={include}&order_by={orderBy}&scope={scope}&only_announcements={onlyAnnouncements}&filter_by={filterBy}&search_term={searchTerm}&exclude_context_module_locked_topics={excludeContextModuleLockedTopics}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<DiscussionTopic> listDiscussionTopicsGroups(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listDiscussionTopicsGroups</code> method in a fluent style.
   */
  public static class ListDiscussionTopicsGroupsQueryParams extends HashMap<String, Object> {
    public ListDiscussionTopicsGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListDiscussionTopicsGroupsQueryParams orderBy(final String value) {
      put("order_by", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsGroupsQueryParams scope(final String value) {
      put("scope", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsGroupsQueryParams onlyAnnouncements(final Boolean value) {
      put("only_announcements", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsGroupsQueryParams filterBy(final String value) {
      put("filter_by", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsGroupsQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListDiscussionTopicsGroupsQueryParams excludeContextModuleLockedTopics(final Boolean value) {
      put("exclude_context_module_locked_topics", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List entries
   * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param ids A list of entry ids to retrieve. Entries will be returned in id order, smallest id first. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}/entry_list?ids={ids}")
  @Headers({
      "Accept: */*",
  })
  void listEntriesCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("ids") List<String> ids);
  

  /**
   * List entries
   * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
   * Note, this is equivalent to the other <code>listEntriesCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEntriesCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - A list of entry ids to retrieve. Entries will be returned in id order, smallest id first. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}/entry_list?ids={ids}")
  @Headers({
      "Content-Type: */*",
  })
  void listEntriesCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEntriesCourses</code> method in a fluent style.
   */
  public static class ListEntriesCoursesQueryParams extends HashMap<String, Object> {
    public ListEntriesCoursesQueryParams ids(final List<String> value) {
      put("ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List entries
   * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param ids A list of entry ids to retrieve. Entries will be returned in id order, smallest id first. (optional)
   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}/entry_list?ids={ids}")
  @Headers({
      "Accept: */*",
  })
  void listEntriesGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("ids") List<String> ids);
  

  /**
   * List entries
   * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
   * Note, this is equivalent to the other <code>listEntriesGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEntriesGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ids - A list of entry ids to retrieve. Entries will be returned in id order, smallest id first. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}/entry_list?ids={ids}")
  @Headers({
      "Content-Type: */*",
  })
  void listEntriesGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEntriesGroups</code> method in a fluent style.
   */
  public static class ListEntriesGroupsQueryParams extends HashMap<String, Object> {
    public ListEntriesGroupsQueryParams ids(final List<String> value) {
      put("ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List entry replies
   * Retrieve the (paginated) replies to a top-level entry in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Ordering of returned entries is newest-first by creation timestamp.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/replies")
  @Headers({
      "Accept: */*",
  })
  void listEntryRepliesCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("entryId") String entryId);
  
  /**
   * List entry replies
   * Retrieve the (paginated) replies to a top-level entry in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Ordering of returned entries is newest-first by creation timestamp.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/replies")
  @Headers({
      "Accept: */*",
  })
  void listEntryRepliesGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("entryId") String entryId);
  
  /**
   * List topic entries
   * Retrieve the (paginated) top-level entries in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Will include the 10 most recent replies, if any, for each entry returned.  If the topic is a root topic with children corresponding to groups of a group assignment, entries from those subtopics for which the user belongs to the corresponding group will be returned.  Ordering of returned entries is newest-first by posting timestamp (reply activity is ignored).
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/discussion_topics/{topicId}/entries")
  @Headers({
      "Accept: */*",
  })
  void listTopicEntriesCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * List topic entries
   * Retrieve the (paginated) top-level entries in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Will include the 10 most recent replies, if any, for each entry returned.  If the topic is a root topic with children corresponding to groups of a group assignment, entries from those subtopics for which the user belongs to the corresponding group will be returned.  Ordering of returned entries is newest-first by posting timestamp (reply activity is ignored).
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/discussion_topics/{topicId}/entries")
  @Headers({
      "Accept: */*",
  })
  void listTopicEntriesGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Mark all entries as read
   * Mark the discussion topic and all its entries as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param forcedReadState  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/discussion_topics/{topicId}/read_all")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void markAllEntriesAsReadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("forcedReadState") Boolean forcedReadState);
  
  /**
   * Mark all entries as read
   * Mark the discussion topic and all its entries as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param forcedReadState  (optional)
   */
  @RequestLine("PUT /v1/groups/{groupId}/discussion_topics/{topicId}/read_all")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void markAllEntriesAsReadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("forcedReadState") Boolean forcedReadState);
  
  /**
   * Mark all entries as unread
   * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param forcedReadState A boolean value to set all of the entries&#x27; forced_read_state. No change is made if this argument is not specified. (optional)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/read_all?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markAllEntriesAsUnreadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("forcedReadState") Boolean forcedReadState);
  

  /**
   * Mark all entries as unread
   * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * Note, this is equivalent to the other <code>markAllEntriesAsUnreadCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MarkAllEntriesAsUnreadCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>forcedReadState - A boolean value to set all of the entries&#x27; forced_read_state. No change is made if this argument is not specified. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/read_all?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
  })
  void markAllEntriesAsUnreadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>markAllEntriesAsUnreadCourses</code> method in a fluent style.
   */
  public static class MarkAllEntriesAsUnreadCoursesQueryParams extends HashMap<String, Object> {
    public MarkAllEntriesAsUnreadCoursesQueryParams forcedReadState(final Boolean value) {
      put("forced_read_state", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Mark all entries as unread
   * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param forcedReadState A boolean value to set all of the entries&#x27; forced_read_state. No change is made if this argument is not specified. (optional)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/read_all?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markAllEntriesAsUnreadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("forcedReadState") Boolean forcedReadState);
  

  /**
   * Mark all entries as unread
   * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * Note, this is equivalent to the other <code>markAllEntriesAsUnreadGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MarkAllEntriesAsUnreadGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>forcedReadState - A boolean value to set all of the entries&#x27; forced_read_state. No change is made if this argument is not specified. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/read_all?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
  })
  void markAllEntriesAsUnreadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>markAllEntriesAsUnreadGroups</code> method in a fluent style.
   */
  public static class MarkAllEntriesAsUnreadGroupsQueryParams extends HashMap<String, Object> {
    public MarkAllEntriesAsUnreadGroupsQueryParams forcedReadState(final Boolean value) {
      put("forced_read_state", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Mark entry as read
   * Mark a discussion entry as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param forcedReadState  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/read")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void markEntryAsReadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("forcedReadState") Boolean forcedReadState);
  
  /**
   * Mark entry as read
   * Mark a discussion entry as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param forcedReadState  (optional)
   */
  @RequestLine("PUT /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/read")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void markEntryAsReadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("forcedReadState") Boolean forcedReadState);
  
  /**
   * Mark entry as unread
   * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param forcedReadState A boolean value to set the entry&#x27;s forced_read_state. No change is made if this argument is not specified. (optional)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/read?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markEntryAsUnreadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("forcedReadState") Boolean forcedReadState);
  

  /**
   * Mark entry as unread
   * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * Note, this is equivalent to the other <code>markEntryAsUnreadCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MarkEntryAsUnreadCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>forcedReadState - A boolean value to set the entry&#x27;s forced_read_state. No change is made if this argument is not specified. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/read?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
  })
  void markEntryAsUnreadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("entryId") String entryId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>markEntryAsUnreadCourses</code> method in a fluent style.
   */
  public static class MarkEntryAsUnreadCoursesQueryParams extends HashMap<String, Object> {
    public MarkEntryAsUnreadCoursesQueryParams forcedReadState(final Boolean value) {
      put("forced_read_state", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Mark entry as unread
   * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param forcedReadState A boolean value to set the entry&#x27;s forced_read_state. No change is made if this argument is not specified. (optional)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/read?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markEntryAsUnreadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("forcedReadState") Boolean forcedReadState);
  

  /**
   * Mark entry as unread
   * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * Note, this is equivalent to the other <code>markEntryAsUnreadGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MarkEntryAsUnreadGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>forcedReadState - A boolean value to set the entry&#x27;s forced_read_state. No change is made if this argument is not specified. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/read?forced_read_state={forcedReadState}")
  @Headers({
      "Content-Type: application/json",
  })
  void markEntryAsUnreadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("entryId") String entryId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>markEntryAsUnreadGroups</code> method in a fluent style.
   */
  public static class MarkEntryAsUnreadGroupsQueryParams extends HashMap<String, Object> {
    public MarkEntryAsUnreadGroupsQueryParams forcedReadState(final Boolean value) {
      put("forced_read_state", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Mark topic as read
   * Mark the initial text of the discussion topic as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/discussion_topics/{topicId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markTopicAsReadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * Mark topic as read
   * Mark the initial text of the discussion topic as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("PUT /v1/groups/{groupId}/discussion_topics/{topicId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markTopicAsReadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Mark topic as unread
   * Mark the initial text of the discussion topic as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markTopicAsUnreadCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * Mark topic as unread
   * Mark the initial text of the discussion topic as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markTopicAsUnreadGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Post an entry
   * Create a new entry in a discussion topic. Returns a json representation of the created entry (see documentation for &#x27;entries&#x27; method) on success.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param message  (optional)
   * @param attachment  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/discussion_topics/{topicId}/entries")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void postEntryCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("message") String message, @Param("attachment") String attachment);
  
  /**
   * Post an entry
   * Create a new entry in a discussion topic. Returns a json representation of the created entry (see documentation for &#x27;entries&#x27; method) on success.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param message  (optional)
   * @param attachment  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/discussion_topics/{topicId}/entries")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void postEntryGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("message") String message, @Param("attachment") String attachment);
  
  /**
   * Post a reply
   * Add a reply to an entry in a discussion topic. Returns a json representation of the created reply (see documentation for &#x27;replies&#x27; method) on success.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param message  (optional)
   * @param attachment  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/replies")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void postReplyCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("message") String message, @Param("attachment") String attachment);
  
  /**
   * Post a reply
   * Add a reply to an entry in a discussion topic. Returns a json representation of the created reply (see documentation for &#x27;replies&#x27; method) on success.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param message  (optional)
   * @param attachment  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/replies")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void postReplyGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("message") String message, @Param("attachment") String attachment);
  
  /**
   * Rate entry
   * Rate a discussion entry.  On success, the response will be 204 No Content with an empty body.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param rating  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/rating")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void rateEntryCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("rating") Integer rating);
  
  /**
   * Rate entry
   * Rate a discussion entry.  On success, the response will be 204 No Content with an empty body.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param entryId ID (required)
   * @param rating  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/rating")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void rateEntryGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("entryId") String entryId, @Param("rating") Integer rating);
  
  /**
   * Reorder pinned topics
   * Puts the pinned discussion topics in the specified order. All pinned topics should be included.
   * @param courseId ID (required)
   * @param order  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/discussion_topics/reorder")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reorderPinnedTopicsCourses(@Param("courseId") String courseId, @Param("order") List<Integer> order);
  
  /**
   * Reorder pinned topics
   * Puts the pinned discussion topics in the specified order. All pinned topics should be included.
   * @param groupId ID (required)
   * @param order  (optional)
   */
  @RequestLine("POST /v1/groups/{groupId}/discussion_topics/reorder")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reorderPinnedTopicsGroups(@Param("groupId") String groupId, @Param("order") List<Integer> order);
  
  /**
   * Subscribe to a topic
   * Subscribe to a topic to receive notifications about new entries  On success, the response will be 204 No Content with an empty body
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/discussion_topics/{topicId}/subscribed")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void subscribeToTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * Subscribe to a topic
   * Subscribe to a topic to receive notifications about new entries  On success, the response will be 204 No Content with an empty body
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("PUT /v1/groups/{groupId}/discussion_topics/{topicId}/subscribed")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void subscribeToTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Unsubscribe from a topic
   * Unsubscribe from a topic to stop receiving notifications about new entries  On success, the response will be 204 No Content with an empty body
   * @param courseId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/discussion_topics/{topicId}/subscribed")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void unsubscribeFromTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId);
  
  /**
   * Unsubscribe from a topic
   * Unsubscribe from a topic to stop receiving notifications about new entries  On success, the response will be 204 No Content with an empty body
   * @param groupId ID (required)
   * @param topicId ID (required)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/discussion_topics/{topicId}/subscribed")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void unsubscribeFromTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId);
  
  /**
   * Update an entry
   * Update an existing discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the edit is not allowed, a 401 will be returned.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param id ID (required)
   * @param message  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/discussion_topics/{topicId}/entries/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateEntryCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("id") String id, @Param("message") String message);
  
  /**
   * Update an entry
   * Update an existing discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the edit is not allowed, a 401 will be returned.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param id ID (required)
   * @param message  (optional)
   */
  @RequestLine("PUT /v1/groups/{groupId}/discussion_topics/{topicId}/entries/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateEntryGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("id") String id, @Param("message") String message);
  
  /**
   * Update a topic
   * Update an existing discussion topic for the course or group.
   * @param courseId ID (required)
   * @param topicId ID (required)
   * @param title  (optional)
   * @param message  (optional)
   * @param discussionType  (optional)
   * @param published  (optional)
   * @param delayedPostAt  (optional)
   * @param lockAt  (optional)
   * @param podcastEnabled  (optional)
   * @param podcastHasStudentPosts  (optional)
   * @param requireInitialPost  (optional)
   * @param assignment  (optional)
   * @param isAnnouncement  (optional)
   * @param pinned  (optional)
   * @param positionAfter  (optional)
   * @param groupCategoryId  (optional)
   * @param allowRating  (optional)
   * @param onlyGradersCanRate  (optional)
   * @param sortByRating  (optional)
   * @param specificSections  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/discussion_topics/{topicId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateTopicCourses(@Param("courseId") String courseId, @Param("topicId") String topicId, @Param("title") String title, @Param("message") String message, @Param("discussionType") String discussionType, @Param("published") Boolean published, @Param("delayedPostAt") String delayedPostAt, @Param("lockAt") String lockAt, @Param("podcastEnabled") Boolean podcastEnabled, @Param("podcastHasStudentPosts") Boolean podcastHasStudentPosts, @Param("requireInitialPost") Boolean requireInitialPost, @Param("assignment") Object assignment, @Param("isAnnouncement") Boolean isAnnouncement, @Param("pinned") Boolean pinned, @Param("positionAfter") String positionAfter, @Param("groupCategoryId") Integer groupCategoryId, @Param("allowRating") Boolean allowRating, @Param("onlyGradersCanRate") Boolean onlyGradersCanRate, @Param("sortByRating") Boolean sortByRating, @Param("specificSections") String specificSections);
  
  /**
   * Update a topic
   * Update an existing discussion topic for the course or group.
   * @param groupId ID (required)
   * @param topicId ID (required)
   * @param title  (optional)
   * @param message  (optional)
   * @param discussionType  (optional)
   * @param published  (optional)
   * @param delayedPostAt  (optional)
   * @param lockAt  (optional)
   * @param podcastEnabled  (optional)
   * @param podcastHasStudentPosts  (optional)
   * @param requireInitialPost  (optional)
   * @param assignment  (optional)
   * @param isAnnouncement  (optional)
   * @param pinned  (optional)
   * @param positionAfter  (optional)
   * @param groupCategoryId  (optional)
   * @param allowRating  (optional)
   * @param onlyGradersCanRate  (optional)
   * @param sortByRating  (optional)
   * @param specificSections  (optional)
   */
  @RequestLine("PUT /v1/groups/{groupId}/discussion_topics/{topicId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateTopicGroups(@Param("groupId") String groupId, @Param("topicId") String topicId, @Param("title") String title, @Param("message") String message, @Param("discussionType") String discussionType, @Param("published") Boolean published, @Param("delayedPostAt") String delayedPostAt, @Param("lockAt") String lockAt, @Param("podcastEnabled") Boolean podcastEnabled, @Param("podcastHasStudentPosts") Boolean podcastHasStudentPosts, @Param("requireInitialPost") Boolean requireInitialPost, @Param("assignment") Object assignment, @Param("isAnnouncement") Boolean isAnnouncement, @Param("pinned") Boolean pinned, @Param("positionAfter") String positionAfter, @Param("groupCategoryId") Integer groupCategoryId, @Param("allowRating") Boolean allowRating, @Param("onlyGradersCanRate") Boolean onlyGradersCanRate, @Param("sortByRating") Boolean sortByRating, @Param("specificSections") String specificSections);
  
}
