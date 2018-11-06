package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Assignment;
import com.instructure.canvas.model.Avatar;
import com.instructure.canvas.model.CourseNickname;
import com.instructure.canvas.model.PageView;
import com.instructure.canvas.model.Profile;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface UsersApi extends ApiClient.Api {

  /**
   * Activity stream summary
   * Returns a summary of the current user&#x27;s global activity stream.
   */
  @RequestLine("GET /v1/users/self/activity_stream/summary")
  @Headers({
      "Accept: */*",
  })
  void activityStreamSummary();
  
  /**
   * Clear course nicknames
   * Remove all stored course nicknames.
   */
  @RequestLine("DELETE /v1/users/self/course_nicknames")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void clearCourseNicknames();
  
  /**
   * Create a user
   * Create and return a new user and pseudonym for an account.  If you don&#x27;t have the \&quot;Modify login details for users\&quot; permission, but self-registration is enabled on the account, you can still use this endpoint to register new users. Certain fields will be required, and others will be ignored (see below).
   * @param accountId ID (required)
   * @param userName  (optional)
   * @param userShortName  (optional)
   * @param userSortableName  (optional)
   * @param userTimeZone  (optional)
   * @param userLocale  (optional)
   * @param userBirthdate  (optional)
   * @param userTermsOfUse  (optional)
   * @param userSkipRegistration  (optional)
   * @param pseudonymUniqueId  (optional)
   * @param pseudonymPassword  (optional)
   * @param pseudonymSisUserId  (optional)
   * @param pseudonymIntegrationId  (optional)
   * @param pseudonymSendConfirmation  (optional)
   * @param pseudonymForceSelfRegistration  (optional)
   * @param pseudonymAuthenticationProviderId  (optional)
   * @param communicationChannelType  (optional)
   * @param communicationChannelAddress  (optional)
   * @param communicationChannelConfirmationUrl  (optional)
   * @param communicationChannelSkipConfirmation  (optional)
   * @param forceValidations  (optional)
   * @param enableSisReactivation  (optional)
   * @param destination  (optional)
   * @return User
   */
  @RequestLine("POST /v1/accounts/{accountId}/users")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  User createUser(@Param("accountId") String accountId, @Param("userName") String userName, @Param("userShortName") String userShortName, @Param("userSortableName") String userSortableName, @Param("userTimeZone") String userTimeZone, @Param("userLocale") String userLocale, @Param("userBirthdate") String userBirthdate, @Param("userTermsOfUse") Boolean userTermsOfUse, @Param("userSkipRegistration") Boolean userSkipRegistration, @Param("pseudonymUniqueId") String pseudonymUniqueId, @Param("pseudonymPassword") String pseudonymPassword, @Param("pseudonymSisUserId") String pseudonymSisUserId, @Param("pseudonymIntegrationId") String pseudonymIntegrationId, @Param("pseudonymSendConfirmation") Boolean pseudonymSendConfirmation, @Param("pseudonymForceSelfRegistration") Boolean pseudonymForceSelfRegistration, @Param("pseudonymAuthenticationProviderId") String pseudonymAuthenticationProviderId, @Param("communicationChannelType") String communicationChannelType, @Param("communicationChannelAddress") String communicationChannelAddress, @Param("communicationChannelConfirmationUrl") Boolean communicationChannelConfirmationUrl, @Param("communicationChannelSkipConfirmation") Boolean communicationChannelSkipConfirmation, @Param("forceValidations") Boolean forceValidations, @Param("enableSisReactivation") Boolean enableSisReactivation, @Param("destination") Object destination);
  
  /**
   * Delete custom data
   * Delete custom user data.  Arbitrary JSON data can be stored for a User.  This API call deletes that data for a given scope.  Without a scope, all custom_data is deleted. See {api:UsersController#set_custom_data Store Custom Data} for details and examples of storage and retrieval.  As an example, we&#x27;ll store some data, then delete a subset of it.  Example {api:UsersController#set_custom_data PUT} with valid JSON data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data[fruit][apple]&#x3D;so tasty&#x27; \\     -F &#x27;data[fruit][kiwi]&#x3D;a bit sour&#x27; \\     -F &#x27;data[veggies][root][onion]&#x3D;tear-jerking&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;,         \&quot;kiwi\&quot;: \&quot;a bit sour\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Example DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/fruit/kiwi&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;a bit sour\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Note that hashes left empty after a DELETE will get removed from the custom_data store. For example, following the previous commands, if we delete /custom_data/veggies/root/onion, then the entire /custom_data/veggies scope will be removed.  Example DELETE that empties a parent scope:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/veggies/root/onion&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;tear-jerking\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       }     }   }  On success, this endpoint returns an object containing the data that was deleted.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
   * @param userId ID (required)
   * @param ns The namespace from which to delete the data.  This should be something other Canvas API apps aren&#x27;t likely to use, such as a reverse DNS for your organization. (required)
   */
  @RequestLine("DELETE /v1/users/{userId}/custom_data?ns={ns}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteCustomData(@Param("userId") String userId, @Param("ns") String ns);
  

  /**
   * Delete custom data
   * Delete custom user data.  Arbitrary JSON data can be stored for a User.  This API call deletes that data for a given scope.  Without a scope, all custom_data is deleted. See {api:UsersController#set_custom_data Store Custom Data} for details and examples of storage and retrieval.  As an example, we&#x27;ll store some data, then delete a subset of it.  Example {api:UsersController#set_custom_data PUT} with valid JSON data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data[fruit][apple]&#x3D;so tasty&#x27; \\     -F &#x27;data[fruit][kiwi]&#x3D;a bit sour&#x27; \\     -F &#x27;data[veggies][root][onion]&#x3D;tear-jerking&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;,         \&quot;kiwi\&quot;: \&quot;a bit sour\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Example DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/fruit/kiwi&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;a bit sour\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Note that hashes left empty after a DELETE will get removed from the custom_data store. For example, following the previous commands, if we delete /custom_data/veggies/root/onion, then the entire /custom_data/veggies scope will be removed.  Example DELETE that empties a parent scope:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/veggies/root/onion&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;tear-jerking\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       }     }   }  On success, this endpoint returns an object containing the data that was deleted.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
   * Note, this is equivalent to the other <code>deleteCustomData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ns - The namespace from which to delete the data.  This should be something other Canvas API apps aren&#x27;t likely to use, such as a reverse DNS for your organization. (required)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/users/{userId}/custom_data?ns={ns}")
  @Headers({
      "Content-Type: application/json",
  })
  void deleteCustomData(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomData</code> method in a fluent style.
   */
  public static class DeleteCustomDataQueryParams extends HashMap<String, Object> {
    public DeleteCustomDataQueryParams ns(final String value) {
      put("ns", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Edit a user
   * Modify an existing user. To modify a user&#x27;s login, see the documentation for logins.
   * @param id ID (required)
   * @param userName  (optional)
   * @param userShortName  (optional)
   * @param userSortableName  (optional)
   * @param userTimeZone  (optional)
   * @param userEmail  (optional)
   * @param userLocale  (optional)
   * @param userAvatarToken  (optional)
   * @param userAvatarUrl  (optional)
   * @return User
   */
  @RequestLine("PUT /v1/users/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  User editUser(@Param("id") String id, @Param("userName") String userName, @Param("userShortName") String userShortName, @Param("userSortableName") String userSortableName, @Param("userTimeZone") String userTimeZone, @Param("userEmail") String userEmail, @Param("userLocale") String userLocale, @Param("userAvatarToken") String userAvatarToken, @Param("userAvatarUrl") String userAvatarUrl);
  
  /**
   * Get course nickname
   * Returns the nickname for a specific course.
   * @param courseId ID (required)
   * @return CourseNickname
   */
  @RequestLine("GET /v1/users/self/course_nicknames/{courseId}")
  @Headers({
      "Accept: application/json",
  })
  CourseNickname getCourseNickname(@Param("courseId") String courseId);
  
  /**
   * Get custom color
   * Returns the custom colors that have been saved for a user for a given context.  The asset_string parameter should be in the format &#x27;context_id&#x27;, for example &#x27;course_42&#x27;.
   * @param id ID (required)
   * @param assetString ID (required)
   */
  @RequestLine("GET /v1/users/{id}/colors/{assetString}")
  @Headers({
      "Accept: */*",
  })
  void getCustomColor(@Param("id") String id, @Param("assetString") String assetString);
  
  /**
   * Get custom colors
   * Returns all custom colors that have been saved for a user.
   * @param id ID (required)
   */
  @RequestLine("GET /v1/users/{id}/colors")
  @Headers({
      "Accept: */*",
  })
  void getCustomColors(@Param("id") String id);
  
  /**
   * Get dashboard positions
   * Returns all dashboard positions that have been saved for a user.
   * @param id ID (required)
   */
  @RequestLine("GET /v1/users/{id}/dashboard_positions")
  @Headers({
      "Accept: */*",
  })
  void getDashboardPositions(@Param("id") String id);
  
  /**
   * Get a Pandata Events jwt token and its expiration date
   * Returns a jwt auth and props token that can be used to send events to Pandata.  NOTE: This is currently only available to the mobile developer keys.
   * @param appKey  (optional)
   */
  @RequestLine("POST /v1/users/self/pandata_events_token")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void getPandataEventsJwtTokenAndItsExpirationDate(@Param("appKey") String appKey);
  
  /**
   * Get user profile
   * Returns user profile data, including user id, name, and profile pic.  When requesting the profile for the user accessing the API, the user&#x27;s calendar feed URL and LTI user id will be returned as well.
   * @param userId ID (required)
   * @return Profile
   */
  @RequestLine("GET /v1/users/{userId}/profile")
  @Headers({
      "Accept: application/json",
  })
  Profile getUserProfile(@Param("userId") String userId);
  
  /**
   * Hide all stream items
   * Hide all stream items for the user
   */
  @RequestLine("DELETE /v1/users/self/activity_stream")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void hideAllStreamItems();
  
  /**
   * Hide a stream item
   * Hide the given stream item.
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/users/self/activity_stream/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void hideStreamItem(@Param("id") String id);
  
  /**
   * List the activity stream
   * Returns the current user&#x27;s global activity stream, paginated.  There are many types of objects that can be returned in the activity stream. All object types have the same basic set of shared attributes:   !!!javascript   {     &#x27;created_at&#x27;: &#x27;2011-07-13T09:12:00Z&#x27;,     &#x27;updated_at&#x27;: &#x27;2011-07-25T08:52:41Z&#x27;,     &#x27;id&#x27;: 1234,     &#x27;title&#x27;: &#x27;Stream Item Subject&#x27;,     &#x27;message&#x27;: &#x27;This is the body text of the activity stream item. It is plain-text, and can be multiple paragraphs.&#x27;,     &#x27;type&#x27;: &#x27;DiscussionTopic|Conversation|Message|Submission|Conference|Collaboration|AssessmentRequest...&#x27;,     &#x27;read_state&#x27;: false,     &#x27;context_type&#x27;: &#x27;course&#x27;, // course|group     &#x27;course_id&#x27;: 1,     &#x27;group_id&#x27;: null,     &#x27;html_url&#x27;: \&quot;http://...\&quot; // URL to the Canvas web UI for this stream item   }  In addition, each item type has its own set of attributes available.  DiscussionTopic:    !!!javascript   {     &#x27;type&#x27;: &#x27;DiscussionTopic&#x27;,     &#x27;discussion_topic_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: true,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For DiscussionTopic, the message is truncated at 4kb.  Announcement:    !!!javascript   {     &#x27;type&#x27;: &#x27;Announcement&#x27;,     &#x27;announcement_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: null,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For Announcement, the message is truncated at 4kb.  Conversation:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conversation&#x27;,     &#x27;conversation_id&#x27;: 1234,     &#x27;private&#x27;: false,     &#x27;participant_count&#x27;: 3,   }  Message:    !!!javascript   {     &#x27;type&#x27;: &#x27;Message&#x27;,     &#x27;message_id&#x27;: 1234,     &#x27;notification_category&#x27;: &#x27;Assignment Graded&#x27;   }  Submission:  Returns an {api:Submissions:Submission Submission} with its Course and Assignment data.  Conference:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conference&#x27;,     &#x27;web_conference_id&#x27;: 1234   }  Collaboration:    !!!javascript   {     &#x27;type&#x27;: &#x27;Collaboration&#x27;,     &#x27;collaboration_id&#x27;: 1234   }  AssessmentRequest:    !!!javascript   {     &#x27;type&#x27;: &#x27;AssessmentRequest&#x27;,     &#x27;assessment_request_id&#x27;: 1234   }
   */
  @RequestLine("GET /v1/users/activity_stream")
  @Headers({
      "Accept: */*",
  })
  void listActivityStreamActivityStream();
  
  /**
   * List the activity stream
   * Returns the current user&#x27;s global activity stream, paginated.  There are many types of objects that can be returned in the activity stream. All object types have the same basic set of shared attributes:   !!!javascript   {     &#x27;created_at&#x27;: &#x27;2011-07-13T09:12:00Z&#x27;,     &#x27;updated_at&#x27;: &#x27;2011-07-25T08:52:41Z&#x27;,     &#x27;id&#x27;: 1234,     &#x27;title&#x27;: &#x27;Stream Item Subject&#x27;,     &#x27;message&#x27;: &#x27;This is the body text of the activity stream item. It is plain-text, and can be multiple paragraphs.&#x27;,     &#x27;type&#x27;: &#x27;DiscussionTopic|Conversation|Message|Submission|Conference|Collaboration|AssessmentRequest...&#x27;,     &#x27;read_state&#x27;: false,     &#x27;context_type&#x27;: &#x27;course&#x27;, // course|group     &#x27;course_id&#x27;: 1,     &#x27;group_id&#x27;: null,     &#x27;html_url&#x27;: \&quot;http://...\&quot; // URL to the Canvas web UI for this stream item   }  In addition, each item type has its own set of attributes available.  DiscussionTopic:    !!!javascript   {     &#x27;type&#x27;: &#x27;DiscussionTopic&#x27;,     &#x27;discussion_topic_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: true,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For DiscussionTopic, the message is truncated at 4kb.  Announcement:    !!!javascript   {     &#x27;type&#x27;: &#x27;Announcement&#x27;,     &#x27;announcement_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: null,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For Announcement, the message is truncated at 4kb.  Conversation:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conversation&#x27;,     &#x27;conversation_id&#x27;: 1234,     &#x27;private&#x27;: false,     &#x27;participant_count&#x27;: 3,   }  Message:    !!!javascript   {     &#x27;type&#x27;: &#x27;Message&#x27;,     &#x27;message_id&#x27;: 1234,     &#x27;notification_category&#x27;: &#x27;Assignment Graded&#x27;   }  Submission:  Returns an {api:Submissions:Submission Submission} with its Course and Assignment data.  Conference:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conference&#x27;,     &#x27;web_conference_id&#x27;: 1234   }  Collaboration:    !!!javascript   {     &#x27;type&#x27;: &#x27;Collaboration&#x27;,     &#x27;collaboration_id&#x27;: 1234   }  AssessmentRequest:    !!!javascript   {     &#x27;type&#x27;: &#x27;AssessmentRequest&#x27;,     &#x27;assessment_request_id&#x27;: 1234   }
   */
  @RequestLine("GET /v1/users/self/activity_stream")
  @Headers({
      "Accept: */*",
  })
  void listActivityStreamSelf();
  
  /**
   * List avatar options
   * A paginated list of the possible user avatar options that can be set with the user update endpoint. The response will be an array of avatar records. If the &#x27;type&#x27; field is &#x27;attachment&#x27;, the record will include all the normal attachment json fields; otherwise it will include only the &#x27;url&#x27; and &#x27;display_name&#x27; fields. Additionally, all records will include a &#x27;type&#x27; field and a &#x27;token&#x27; field. The following explains each field in more detail type:: [\&quot;gravatar\&quot;|\&quot;attachment\&quot;|\&quot;no_pic\&quot;] The type of avatar record, for categorization purposes. url:: The url of the avatar token:: A unique representation of the avatar record which can be used to set the avatar with the user update endpoint. Note: this is an internal representation and is subject to change without notice. It should be consumed with this api endpoint and used in the user update endpoint, and should not be constructed by the client. display_name:: A textual description of the avatar record id:: [&#x27;attachment&#x27; type only] the internal id of the attachment content-type:: [&#x27;attachment&#x27; type only] the content-type of the attachment filename:: [&#x27;attachment&#x27; type only] the filename of the attachment size:: [&#x27;attachment&#x27; type only] the size of the attachment
   * @param userId ID (required)
   * @return List&lt;Avatar&gt;
   */
  @RequestLine("GET /v1/users/{userId}/avatars")
  @Headers({
      "Accept: application/json",
  })
  List<Avatar> listAvatarOptions(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Avatar&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Avatar> listAvatarOptions(URI uri);
  
  /**
   * List counts for todo items
   * Counts of different todo items such as the number of assignments needing grading as well as the number of assignments needing submitting.  There is a limit to the number of todo items this endpoint will count. It will only look at the first 100 todo items for the user. If the user has more than 100 todo items this count may not be reliable. The largest reliable number for both counts is 100.
   * @param include \&quot;ungraded_quizzes\&quot;:: Optionally include ungraded quizzes (such as practice quizzes and surveys) in the list.                      These will be returned under a +quiz+ key instead of an +assignment+ key in response elements. (optional)
   */
  @RequestLine("GET /v1/users/self/todo_item_count?include={include}")
  @Headers({
      "Accept: */*",
  })
  void listCountsForTodoItems(@Param("include") List<String> include);
  

  /**
   * List counts for todo items
   * Counts of different todo items such as the number of assignments needing grading as well as the number of assignments needing submitting.  There is a limit to the number of todo items this endpoint will count. It will only look at the first 100 todo items for the user. If the user has more than 100 todo items this count may not be reliable. The largest reliable number for both counts is 100.
   * Note, this is equivalent to the other <code>listCountsForTodoItems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCountsForTodoItemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - \&quot;ungraded_quizzes\&quot;:: Optionally include ungraded quizzes (such as practice quizzes and surveys) in the list.                      These will be returned under a +quiz+ key instead of an +assignment+ key in response elements. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/users/self/todo_item_count?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listCountsForTodoItems(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCountsForTodoItems</code> method in a fluent style.
   */
  public static class ListCountsForTodoItemsQueryParams extends HashMap<String, Object> {
    public ListCountsForTodoItemsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List course nicknames
   * Returns all course nicknames you have set.
   * @return List&lt;CourseNickname&gt;
   */
  @RequestLine("GET /v1/users/self/course_nicknames")
  @Headers({
      "Accept: application/json",
  })
  List<CourseNickname> listCourseNicknames();

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CourseNickname&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CourseNickname> listCourseNicknames(URI uri);
  
  /**
   * List Missing Submissions
   * A paginated list of past-due assignments for which the student does not have a submission. The user sending the request must either be the student, an admin or a parent observer using the parent app
   * @param userId the student&#x27;s ID (required)
   * @param include \&quot;planner_overrides\&quot;:: Optionally include the assignment&#x27;s associated planner override, if it exists, for the current user.                       These will be returned under a +planner_override+ key \&quot;course\&quot;:: Optionally include the assignments&#x27; courses (optional)
   * @param filter \&quot;submittable\&quot;:: Only return assignments that the current user can submit (i.e. filter out locked assignments) (optional)
   * @return List&lt;Assignment&gt;
   */
  @RequestLine("GET /v1/users/{userId}/missing_submissions?include={include}&filter={filter}")
  @Headers({
      "Accept: application/json",
  })
  List<Assignment> listMissingSubmissions(@Param("userId") String userId, @Param("include") List<String> include, @Param("filter") List<String> filter);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Assignment&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Assignment> listMissingSubmissions(URI uri);
  

  /**
   * List Missing Submissions
   * A paginated list of past-due assignments for which the student does not have a submission. The user sending the request must either be the student, an admin or a parent observer using the parent app
   * Note, this is equivalent to the other <code>listMissingSubmissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMissingSubmissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId the student&#x27;s ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - \&quot;planner_overrides\&quot;:: Optionally include the assignment&#x27;s associated planner override, if it exists, for the current user.                       These will be returned under a +planner_override+ key \&quot;course\&quot;:: Optionally include the assignments&#x27; courses (optional)</li>
   *   <li>filter - \&quot;submittable\&quot;:: Only return assignments that the current user can submit (i.e. filter out locked assignments) (optional)</li>
   *   </ul>
   * @return List&lt;Assignment&gt;

   */
  @RequestLine("GET /v1/users/{userId}/missing_submissions?include={include}&filter={filter}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Assignment> listMissingSubmissions(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listMissingSubmissions</code> method in a fluent style.
   */
  public static class ListMissingSubmissionsQueryParams extends HashMap<String, Object> {
    public ListMissingSubmissionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListMissingSubmissionsQueryParams filter(final List<String> value) {
      put("filter", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List the TODO items
   * A paginated list of the current user&#x27;s list of todo items, as seen on the user dashboard.  There is a limit to the number of items returned.  The &#x60;ignore&#x60; and &#x60;ignore_permanently&#x60; URLs can be used to update the user&#x27;s preferences on what items will be displayed. Performing a DELETE request against the &#x60;ignore&#x60; URL will hide that item from future todo item requests, until the item changes. Performing a DELETE request against the &#x60;ignore_permanently&#x60; URL will hide that item forever.
   * @param include \&quot;ungraded_quizzes\&quot;:: Optionally include ungraded quizzes (such as practice quizzes and surveys) in the list.                      These will be returned under a +quiz+ key instead of an +assignment+ key in response elements. (optional)
   */
  @RequestLine("GET /v1/users/self/todo?include={include}")
  @Headers({
      "Accept: */*",
  })
  void listTodoItems(@Param("include") List<String> include);
  

  /**
   * List the TODO items
   * A paginated list of the current user&#x27;s list of todo items, as seen on the user dashboard.  There is a limit to the number of items returned.  The &#x60;ignore&#x60; and &#x60;ignore_permanently&#x60; URLs can be used to update the user&#x27;s preferences on what items will be displayed. Performing a DELETE request against the &#x60;ignore&#x60; URL will hide that item from future todo item requests, until the item changes. Performing a DELETE request against the &#x60;ignore_permanently&#x60; URL will hide that item forever.
   * Note, this is equivalent to the other <code>listTodoItems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTodoItemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - \&quot;ungraded_quizzes\&quot;:: Optionally include ungraded quizzes (such as practice quizzes and surveys) in the list.                      These will be returned under a +quiz+ key instead of an +assignment+ key in response elements. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/users/self/todo?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listTodoItems(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listTodoItems</code> method in a fluent style.
   */
  public static class ListTodoItemsQueryParams extends HashMap<String, Object> {
    public ListTodoItemsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List upcoming assignments, calendar events
   * A paginated list of the current user&#x27;s upcoming events.
   */
  @RequestLine("GET /v1/users/self/upcoming_events")
  @Headers({
      "Accept: */*",
  })
  void listUpcomingAssignmentsCalendarEvents();
  
  /**
   * List user page views
   * Return a paginated list of the user&#x27;s page view history in json format, similar to the available CSV download. Page views are returned in descending order, newest to oldest.
   * @param userId ID (required)
   * @param startTime The beginning of the time range from which you want page views. (optional)
   * @param endTime The end of the time range from which you want page views. (optional)
   * @return List&lt;PageView&gt;
   */
  @RequestLine("GET /v1/users/{userId}/page_views?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<PageView> listUserPageViews(@Param("userId") String userId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PageView&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PageView> listUserPageViews(URI uri);
  

  /**
   * List user page views
   * Return a paginated list of the user&#x27;s page view history in json format, similar to the available CSV download. Page views are returned in descending order, newest to oldest.
   * Note, this is equivalent to the other <code>listUserPageViews</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUserPageViewsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want page views. (optional)</li>
   *   <li>endTime - The end of the time range from which you want page views. (optional)</li>
   *   </ul>
   * @return List&lt;PageView&gt;

   */
  @RequestLine("GET /v1/users/{userId}/page_views?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<PageView> listUserPageViews(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUserPageViews</code> method in a fluent style.
   */
  public static class ListUserPageViewsQueryParams extends HashMap<String, Object> {
    public ListUserPageViewsQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public ListUserPageViewsQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List users in account
   * A paginated list of of users associated with this account.   @example_request    curl https://&lt;canvas&gt;/api/v1/accounts/self/users?search_term&#x3D;&lt;search value&gt; \\       -X GET \\       -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
   * @param accountId ID (required)
   * @param searchTerm The partial name or full ID of the users to match and return in the results list. Must be at least 3 characters.  Note that the API will prefer matching on canonical user ID if the ID has a numeric form. It will only search against other fields if non-numeric in form, or if the numeric value doesn&#x27;t yield any matches. Queries by administrative users will search on SIS ID, login ID, name, or email address; non-administrative queries will only be compared against name. (optional)
   * @param sort The column to sort results by. (optional)
   * @param order The order to sort the given column by. (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/users?search_term={searchTerm}&sort={sort}&order={order}")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInAccount(@Param("accountId") String accountId, @Param("searchTerm") String searchTerm, @Param("sort") String sort, @Param("order") String order);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInAccount(URI uri);
  

  /**
   * List users in account
   * A paginated list of of users associated with this account.   @example_request    curl https://&lt;canvas&gt;/api/v1/accounts/self/users?search_term&#x3D;&lt;search value&gt; \\       -X GET \\       -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
   * Note, this is equivalent to the other <code>listUsersInAccount</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUsersInAccountQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name or full ID of the users to match and return in the results list. Must be at least 3 characters.  Note that the API will prefer matching on canonical user ID if the ID has a numeric form. It will only search against other fields if non-numeric in form, or if the numeric value doesn&#x27;t yield any matches. Queries by administrative users will search on SIS ID, login ID, name, or email address; non-administrative queries will only be compared against name. (optional)</li>
   *   <li>sort - The column to sort results by. (optional)</li>
   *   <li>order - The order to sort the given column by. (optional)</li>
   *   </ul>
   * @return List&lt;User&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/users?search_term={searchTerm}&sort={sort}&order={order}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<User> listUsersInAccount(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUsersInAccount</code> method in a fluent style.
   */
  public static class ListUsersInAccountQueryParams extends HashMap<String, Object> {
    public ListUsersInAccountQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInAccountQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInAccountQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Load custom data
   * Load custom user data.  Arbitrary JSON data can be stored for a User.  This API call retrieves that data for a (optional) given scope. See {api:UsersController#set_custom_data Store Custom Data} for details and examples.  On success, this endpoint returns an object containing the data that was requested.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
   * @param userId ID (required)
   * @param ns The namespace from which to retrieve the data.  This should be something other Canvas API apps aren&#x27;t likely to use, such as a reverse DNS for your organization. (required)
   */
  @RequestLine("GET /v1/users/{userId}/custom_data?ns={ns}")
  @Headers({
      "Accept: */*",
  })
  void loadCustomData(@Param("userId") String userId, @Param("ns") String ns);
  

  /**
   * Load custom data
   * Load custom user data.  Arbitrary JSON data can be stored for a User.  This API call retrieves that data for a (optional) given scope. See {api:UsersController#set_custom_data Store Custom Data} for details and examples.  On success, this endpoint returns an object containing the data that was requested.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
   * Note, this is equivalent to the other <code>loadCustomData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoadCustomDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>ns - The namespace from which to retrieve the data.  This should be something other Canvas API apps aren&#x27;t likely to use, such as a reverse DNS for your organization. (required)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/users/{userId}/custom_data?ns={ns}")
  @Headers({
      "Content-Type: */*",
  })
  void loadCustomData(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>loadCustomData</code> method in a fluent style.
   */
  public static class LoadCustomDataQueryParams extends HashMap<String, Object> {
    public LoadCustomDataQueryParams ns(final String value) {
      put("ns", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Merge user into another user
   * Merge a user into another user. To merge users, the caller must have permissions to manage both users. This should be considered irreversible. This will delete the user and move all the data into the destination user.  When finding users by SIS ids in different accounts the destination_account_id is required.  The account can also be identified by passing the domain in destination_account_id.
   * @param id ID (required)
   * @param destinationAccountId ID (required)
   * @param destinationUserId ID (required)
   * @return User
   */
  @RequestLine("PUT /v1/users/{id}/merge_into/accounts/{destinationAccountId}/users/{destinationUserId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User mergeUserIntoAnotherUserAccounts(@Param("id") String id, @Param("destinationAccountId") String destinationAccountId, @Param("destinationUserId") String destinationUserId);
  
  /**
   * Merge user into another user
   * Merge a user into another user. To merge users, the caller must have permissions to manage both users. This should be considered irreversible. This will delete the user and move all the data into the destination user.  When finding users by SIS ids in different accounts the destination_account_id is required.  The account can also be identified by passing the domain in destination_account_id.
   * @param id ID (required)
   * @param destinationUserId ID (required)
   * @return User
   */
  @RequestLine("PUT /v1/users/{id}/merge_into/{destinationUserId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User mergeUserIntoAnotherUserDestinationUserId(@Param("id") String id, @Param("destinationUserId") String destinationUserId);
  
  /**
   * Remove course nickname
   * Remove the nickname for the given course. Subsequent course API calls will return the actual name for the course.
   * @param courseId ID (required)
   * @return CourseNickname
   */
  @RequestLine("DELETE /v1/users/self/course_nicknames/{courseId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CourseNickname removeCourseNickname(@Param("courseId") String courseId);
  
  /**
   * Self register a user
   * Self register and return a new user and pseudonym for an account.  If self-registration is enabled on the account, you can use this endpoint to self register new users.
   * @param accountId ID (required)
   * @param userName  (optional)
   * @param userShortName  (optional)
   * @param userSortableName  (optional)
   * @param userTimeZone  (optional)
   * @param userLocale  (optional)
   * @param userBirthdate  (optional)
   * @param userTermsOfUse  (optional)
   * @param pseudonymUniqueId  (optional)
   * @param communicationChannelType  (optional)
   * @param communicationChannelAddress  (optional)
   * @return User
   */
  @RequestLine("POST /v1/accounts/{accountId}/self_registration")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  User selfRegisterUser(@Param("accountId") String accountId, @Param("userName") String userName, @Param("userShortName") String userShortName, @Param("userSortableName") String userSortableName, @Param("userTimeZone") String userTimeZone, @Param("userLocale") String userLocale, @Param("userBirthdate") String userBirthdate, @Param("userTermsOfUse") Boolean userTermsOfUse, @Param("pseudonymUniqueId") String pseudonymUniqueId, @Param("communicationChannelType") String communicationChannelType, @Param("communicationChannelAddress") String communicationChannelAddress);
  
  /**
   * Set course nickname
   * Set a nickname for the given course. This will replace the course&#x27;s name in output of API calls you make subsequently, as well as in selected places in the Canvas web user interface.
   * @param courseId ID (required)
   * @param nickname  (optional)
   * @return CourseNickname
   */
  @RequestLine("PUT /v1/users/self/course_nicknames/{courseId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  CourseNickname setCourseNickname(@Param("courseId") String courseId, @Param("nickname") String nickname);
  
  /**
   * Show user details
   * Shows details for user.  Also includes an attribute \&quot;permissions\&quot;, a non-comprehensive list of permissions for the user. Example:   !!!javascript   \&quot;permissions\&quot;: {    \&quot;can_update_name\&quot;: true, // Whether the user can update their name.    \&quot;can_update_avatar\&quot;: false // Whether the user can update their avatar.   }
   * @param id ID (required)
   * @return User
   */
  @RequestLine("GET /v1/users/{id}")
  @Headers({
      "Accept: application/json",
  })
  User showUserDetails(@Param("id") String id);
  
  /**
   * Split merged users into separate users
   * Merged users cannot be fully restored to their previous state, but this will attempt to split as much as possible to the previous state. To split a merged user, the caller must have permissions to manage all of the users logins. If there are multiple users that have been merged into one user it will split each merge into a separate user. A split can only happen within 180 days of a user merge. A user merge deletes the previous user and may be permanently deleted. In this scenario we create a new user object and proceed to move as much as possible to the new user. The user object will not have preserved the name or settings from the previous user. Some items may have been deleted during a user_merge that cannot be restored, and/or the data has become stale because of other changes to the objects since the time of the user_merge.
   * @param id ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("POST /v1/users/{id}/split")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<User> splitMergedUsersIntoSeparateUsers(@Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  List<User> splitMergedUsersIntoSeparateUsers(URI uri);
  
  /**
   * Store custom data
   * Store arbitrary user data as JSON.  Arbitrary JSON data can be stored for a User. A typical scenario would be an external site/service that registers users in Canvas and wants to capture additional info about them.  The part of the URL that follows +/custom_data/+ defines the scope of the request, and it reflects the structure of the JSON data to be stored or retrieved.  The value +self+ may be used for +user_id+ to store data associated with the calling user. In order to access another user&#x27;s custom data, you must be an account administrator with permission to manage users.  A namespace parameter, +ns+, is used to prevent custom_data collisions between different apps.  This parameter is required for all custom_data requests.  A request with Content-Type multipart/form-data or Content-Type application/x-www-form-urlencoded can only be used to store strings.  Example PUT with multipart/form-data data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/telephone&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data&#x3D;555-1234&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;555-1234\&quot;   }  Subscopes (or, generated scopes) can also be specified by passing values to +data+[+subscope+].  Example PUT specifying subscopes:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/body/measurements&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data[waist]&#x3D;32in&#x27; \\     -F &#x27;data[inseam]&#x3D;34in&#x27; \\     -F &#x27;data[chest]&#x3D;40in&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;chest\&quot;: \&quot;40in\&quot;,       \&quot;waist\&quot;: \&quot;32in\&quot;,       \&quot;inseam\&quot;: \&quot;34in\&quot;     }   }  Following such a request, subsets of the stored data to be retrieved directly from a subscope.  Example {api:UsersController#get_custom_data GET} from a generated scope   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/body/measurements/chest&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;40in\&quot;   }  If you want to store more than just strings (i.e. numbers, arrays, hashes, true, false, and/or null), you must make a request with Content-Type application/json as in the following example.  Example PUT with JSON data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -H &#x27;Content-Type: application/json&#x27; \\     -X PUT \\     -d &#x27;{           \&quot;ns\&quot;: \&quot;com.my-organization.canvas-app\&quot;,           \&quot;data\&quot;: {             \&quot;a-number\&quot;: 6.02e23,             \&quot;a-bool\&quot;: true,             \&quot;a-string\&quot;: \&quot;true\&quot;,             \&quot;a-hash\&quot;: {\&quot;a\&quot;: {\&quot;b\&quot;: \&quot;ohai\&quot;}},             \&quot;an-array\&quot;: [1, \&quot;two\&quot;, null, false]           }         }&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;a-number\&quot;: 6.02e+23,       \&quot;a-bool\&quot;: true,       \&quot;a-string\&quot;: \&quot;true\&quot;,       \&quot;a-hash\&quot;: {         \&quot;a\&quot;: {           \&quot;b\&quot;: \&quot;ohai\&quot;         }       },       \&quot;an-array\&quot;: [1, \&quot;two\&quot;, null, false]     }   }  If the data is an Object (as it is in the above example), then subsets of the data can be accessed by including the object&#x27;s (possibly nested) keys in the scope of a GET request.  Example {api:UsersController#get_custom_data GET} with a generated scope:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/a-hash/a/b&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;ohai\&quot;   }   On success, this endpoint returns an object containing the data that was stored.  Responds with status code 200 if the scope already contained data, and it was overwritten by the data specified in the request.  Responds with status code 201 if the scope was previously empty, and the data specified in the request was successfully stored there.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the +data+ parameter is missing.  Responds with status code 409 if the requested scope caused a conflict and data was not stored. This happens when storing data at the requested scope would cause data at an outer scope to be lost.  e.g., if +/custom_data+ was +{\&quot;fashion_app\&quot;: {\&quot;hair\&quot;: \&quot;blonde\&quot;}}+, but you tried to +&#x60;PUT /custom_data/fashion_app/hair/style -F data&#x3D;buzz&#x60;+, then for the request to succeed,the value of +/custom_data/fashion_app/hair+ would have to become a hash, and its old string value would be lost.  In this situation, an error object is returned with the following format:    !!!javascript   {     \&quot;message\&quot;: \&quot;write conflict for custom_data hash\&quot;,     \&quot;conflict_scope\&quot;: \&quot;fashion_app/hair\&quot;,     \&quot;type_at_conflict\&quot;: \&quot;String\&quot;,     \&quot;value_at_conflict\&quot;: \&quot;blonde\&quot;   }
   * @param userId ID (required)
   * @param ns  (optional)
   * @param data  (optional)
   */
  @RequestLine("PUT /v1/users/{userId}/custom_data")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void storeCustomData(@Param("userId") String userId, @Param("ns") String ns, @Param("data") Object data);
  
  /**
   * Update custom color
   * Updates a custom color for a user for a given context.  This allows colors for the calendar and elsewhere to be customized on a user basis.  The asset string parameter should be in the format &#x27;context_id&#x27;, for example &#x27;course_42&#x27;
   * @param id ID (required)
   * @param assetString ID (required)
   * @param hexcode  (optional)
   */
  @RequestLine("PUT /v1/users/{id}/colors/{assetString}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateCustomColor(@Param("id") String id, @Param("assetString") String assetString, @Param("hexcode") String hexcode);
  
  /**
   * Update dashboard positions
   * Updates the dashboard positions for a user for a given context.  This allows positions for the dashboard cards and elsewhere to be customized on a per user basis.  The asset string parameter should be in the format &#x27;context_id&#x27;, for example &#x27;course_42&#x27;
   * @param id ID (required)
   */
  @RequestLine("PUT /v1/users/{id}/dashboard_positions")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void updateDashboardPositions(@Param("id") String id);
  
  /**
   * Update user settings.
   * Update an existing user&#x27;s settings.
   * @param id ID (required)
   * @param manualMarkAsRead If true, require user to manually mark discussion posts as read (don&#x27;t auto-mark as read). (optional)
   * @param collapseGlobalNav If true, the user&#x27;s page loads with the global navigation collapsed (optional)
   */
  @RequestLine("GET /v1/users/{id}/settings?manual_mark_as_read={manualMarkAsRead}&collapse_global_nav={collapseGlobalNav}")
  @Headers({
      "Accept: */*",
  })
  void updateUserSettings(@Param("id") String id, @Param("manualMarkAsRead") Boolean manualMarkAsRead, @Param("collapseGlobalNav") Boolean collapseGlobalNav);
  

  /**
   * Update user settings.
   * Update an existing user&#x27;s settings.
   * Note, this is equivalent to the other <code>updateUserSettings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateUserSettingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>manualMarkAsRead - If true, require user to manually mark discussion posts as read (don&#x27;t auto-mark as read). (optional)</li>
   *   <li>collapseGlobalNav - If true, the user&#x27;s page loads with the global navigation collapsed (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/users/{id}/settings?manual_mark_as_read={manualMarkAsRead}&collapse_global_nav={collapseGlobalNav}")
  @Headers({
      "Content-Type: */*",
  })
  void updateUserSettings(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateUserSettings</code> method in a fluent style.
   */
  public static class UpdateUserSettingsQueryParams extends HashMap<String, Object> {
    public UpdateUserSettingsQueryParams manualMarkAsRead(final Boolean value) {
      put("manual_mark_as_read", EncodingUtils.encode(value));
      return this;
    }
    public UpdateUserSettingsQueryParams collapseGlobalNav(final Boolean value) {
      put("collapse_global_nav", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Upload a file
   * Upload a file to the user&#x27;s personal files section.  This API endpoint is the first step in uploading a file to a user&#x27;s files. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  Note that typically users will only be able to upload files to their own files section. Passing a user_id of +self+ is an easy shortcut to specify the current user.
   * @param userId ID (required)
   */
  @RequestLine("POST /v1/users/{userId}/files")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void uploadFile(@Param("userId") String userId);
  
}
