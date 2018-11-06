package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Assignment;
import com.instructure.canvas.model.Avatar;
import com.instructure.canvas.model.CourseNickname;
import com.instructure.canvas.model.PageView;
import com.instructure.canvas.model.Profile;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UsersApi.class);
    }

    /**
     * Activity stream summary
     *
     * Returns a summary of the current user&#x27;s global activity stream.
     */
    @Test
    public void activityStreamSummaryTest() {
        // api.activityStreamSummary();

        // TODO: test validations
    }

    /**
     * Clear course nicknames
     *
     * Remove all stored course nicknames.
     */
    @Test
    public void clearCourseNicknamesTest() {
        // api.clearCourseNicknames();

        // TODO: test validations
    }

    /**
     * Create a user
     *
     * Create and return a new user and pseudonym for an account.  If you don&#x27;t have the \&quot;Modify login details for users\&quot; permission, but self-registration is enabled on the account, you can still use this endpoint to register new users. Certain fields will be required, and others will be ignored (see below).
     */
    @Test
    public void createUserTest() {
        String accountId = null;
        String userName = null;
        String userShortName = null;
        String userSortableName = null;
        String userTimeZone = null;
        String userLocale = null;
        String userBirthdate = null;
        Boolean userTermsOfUse = null;
        Boolean userSkipRegistration = null;
        String pseudonymUniqueId = null;
        String pseudonymPassword = null;
        String pseudonymSisUserId = null;
        String pseudonymIntegrationId = null;
        Boolean pseudonymSendConfirmation = null;
        Boolean pseudonymForceSelfRegistration = null;
        String pseudonymAuthenticationProviderId = null;
        String communicationChannelType = null;
        String communicationChannelAddress = null;
        Boolean communicationChannelConfirmationUrl = null;
        Boolean communicationChannelSkipConfirmation = null;
        Boolean forceValidations = null;
        Boolean enableSisReactivation = null;
        Object destination = null;
        // User response = api.createUser(accountId, userName, userShortName, userSortableName, userTimeZone, userLocale, userBirthdate, userTermsOfUse, userSkipRegistration, pseudonymUniqueId, pseudonymPassword, pseudonymSisUserId, pseudonymIntegrationId, pseudonymSendConfirmation, pseudonymForceSelfRegistration, pseudonymAuthenticationProviderId, communicationChannelType, communicationChannelAddress, communicationChannelConfirmationUrl, communicationChannelSkipConfirmation, forceValidations, enableSisReactivation, destination);

        // TODO: test validations
    }

    /**
     * Delete custom data
     *
     * Delete custom user data.  Arbitrary JSON data can be stored for a User.  This API call deletes that data for a given scope.  Without a scope, all custom_data is deleted. See {api:UsersController#set_custom_data Store Custom Data} for details and examples of storage and retrieval.  As an example, we&#x27;ll store some data, then delete a subset of it.  Example {api:UsersController#set_custom_data PUT} with valid JSON data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data[fruit][apple]&#x3D;so tasty&#x27; \\     -F &#x27;data[fruit][kiwi]&#x3D;a bit sour&#x27; \\     -F &#x27;data[veggies][root][onion]&#x3D;tear-jerking&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;,         \&quot;kiwi\&quot;: \&quot;a bit sour\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Example DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/fruit/kiwi&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;a bit sour\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Note that hashes left empty after a DELETE will get removed from the custom_data store. For example, following the previous commands, if we delete /custom_data/veggies/root/onion, then the entire /custom_data/veggies scope will be removed.  Example DELETE that empties a parent scope:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/veggies/root/onion&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;tear-jerking\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       }     }   }  On success, this endpoint returns an object containing the data that was deleted.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
     */
    @Test
    public void deleteCustomDataTest() {
        String userId = null;
        String ns = null;
        // api.deleteCustomData(userId, ns);

        // TODO: test validations
    }

    /**
     * Delete custom data
     *
     * Delete custom user data.  Arbitrary JSON data can be stored for a User.  This API call deletes that data for a given scope.  Without a scope, all custom_data is deleted. See {api:UsersController#set_custom_data Store Custom Data} for details and examples of storage and retrieval.  As an example, we&#x27;ll store some data, then delete a subset of it.  Example {api:UsersController#set_custom_data PUT} with valid JSON data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data[fruit][apple]&#x3D;so tasty&#x27; \\     -F &#x27;data[fruit][kiwi]&#x3D;a bit sour&#x27; \\     -F &#x27;data[veggies][root][onion]&#x3D;tear-jerking&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;,         \&quot;kiwi\&quot;: \&quot;a bit sour\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Example DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/fruit/kiwi&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;a bit sour\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       },       \&quot;veggies\&quot;: {         \&quot;root\&quot;: {           \&quot;onion\&quot;: \&quot;tear-jerking\&quot;         }       }     }   }  Note that hashes left empty after a DELETE will get removed from the custom_data store. For example, following the previous commands, if we delete /custom_data/veggies/root/onion, then the entire /custom_data/veggies scope will be removed.  Example DELETE that empties a parent scope:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/veggies/root/onion&#x27; \\     -X DELETE \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;tear-jerking\&quot;   }  Example {api:UsersController#get_custom_data GET} following the above DELETE:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;fruit\&quot;: {         \&quot;apple\&quot;: \&quot;so tasty\&quot;       }     }   }  On success, this endpoint returns an object containing the data that was deleted.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteCustomDataTestQueryMap() {
        String userId = null;
        UsersApi.DeleteCustomDataQueryParams queryParams = new UsersApi.DeleteCustomDataQueryParams()
            .ns(null);
        // api.deleteCustomData(userId, queryParams);

    // TODO: test validations
    }
    /**
     * Edit a user
     *
     * Modify an existing user. To modify a user&#x27;s login, see the documentation for logins.
     */
    @Test
    public void editUserTest() {
        String id = null;
        String userName = null;
        String userShortName = null;
        String userSortableName = null;
        String userTimeZone = null;
        String userEmail = null;
        String userLocale = null;
        String userAvatarToken = null;
        String userAvatarUrl = null;
        // User response = api.editUser(id, userName, userShortName, userSortableName, userTimeZone, userEmail, userLocale, userAvatarToken, userAvatarUrl);

        // TODO: test validations
    }

    /**
     * Get course nickname
     *
     * Returns the nickname for a specific course.
     */
    @Test
    public void getCourseNicknameTest() {
        String courseId = null;
        // CourseNickname response = api.getCourseNickname(courseId);

        // TODO: test validations
    }

    /**
     * Get custom color
     *
     * Returns the custom colors that have been saved for a user for a given context.  The asset_string parameter should be in the format &#x27;context_id&#x27;, for example &#x27;course_42&#x27;.
     */
    @Test
    public void getCustomColorTest() {
        String id = null;
        String assetString = null;
        // api.getCustomColor(id, assetString);

        // TODO: test validations
    }

    /**
     * Get custom colors
     *
     * Returns all custom colors that have been saved for a user.
     */
    @Test
    public void getCustomColorsTest() {
        String id = null;
        // api.getCustomColors(id);

        // TODO: test validations
    }

    /**
     * Get dashboard positions
     *
     * Returns all dashboard positions that have been saved for a user.
     */
    @Test
    public void getDashboardPositionsTest() {
        String id = null;
        // api.getDashboardPositions(id);

        // TODO: test validations
    }

    /**
     * Get a Pandata Events jwt token and its expiration date
     *
     * Returns a jwt auth and props token that can be used to send events to Pandata.  NOTE: This is currently only available to the mobile developer keys.
     */
    @Test
    public void getPandataEventsJwtTokenAndItsExpirationDateTest() {
        String appKey = null;
        // api.getPandataEventsJwtTokenAndItsExpirationDate(appKey);

        // TODO: test validations
    }

    /**
     * Get user profile
     *
     * Returns user profile data, including user id, name, and profile pic.  When requesting the profile for the user accessing the API, the user&#x27;s calendar feed URL and LTI user id will be returned as well.
     */
    @Test
    public void getUserProfileTest() {
        String userId = null;
        // Profile response = api.getUserProfile(userId);

        // TODO: test validations
    }

    /**
     * Hide all stream items
     *
     * Hide all stream items for the user
     */
    @Test
    public void hideAllStreamItemsTest() {
        // api.hideAllStreamItems();

        // TODO: test validations
    }

    /**
     * Hide a stream item
     *
     * Hide the given stream item.
     */
    @Test
    public void hideStreamItemTest() {
        String id = null;
        // api.hideStreamItem(id);

        // TODO: test validations
    }

    /**
     * List the activity stream
     *
     * Returns the current user&#x27;s global activity stream, paginated.  There are many types of objects that can be returned in the activity stream. All object types have the same basic set of shared attributes:   !!!javascript   {     &#x27;created_at&#x27;: &#x27;2011-07-13T09:12:00Z&#x27;,     &#x27;updated_at&#x27;: &#x27;2011-07-25T08:52:41Z&#x27;,     &#x27;id&#x27;: 1234,     &#x27;title&#x27;: &#x27;Stream Item Subject&#x27;,     &#x27;message&#x27;: &#x27;This is the body text of the activity stream item. It is plain-text, and can be multiple paragraphs.&#x27;,     &#x27;type&#x27;: &#x27;DiscussionTopic|Conversation|Message|Submission|Conference|Collaboration|AssessmentRequest...&#x27;,     &#x27;read_state&#x27;: false,     &#x27;context_type&#x27;: &#x27;course&#x27;, // course|group     &#x27;course_id&#x27;: 1,     &#x27;group_id&#x27;: null,     &#x27;html_url&#x27;: \&quot;http://...\&quot; // URL to the Canvas web UI for this stream item   }  In addition, each item type has its own set of attributes available.  DiscussionTopic:    !!!javascript   {     &#x27;type&#x27;: &#x27;DiscussionTopic&#x27;,     &#x27;discussion_topic_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: true,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For DiscussionTopic, the message is truncated at 4kb.  Announcement:    !!!javascript   {     &#x27;type&#x27;: &#x27;Announcement&#x27;,     &#x27;announcement_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: null,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For Announcement, the message is truncated at 4kb.  Conversation:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conversation&#x27;,     &#x27;conversation_id&#x27;: 1234,     &#x27;private&#x27;: false,     &#x27;participant_count&#x27;: 3,   }  Message:    !!!javascript   {     &#x27;type&#x27;: &#x27;Message&#x27;,     &#x27;message_id&#x27;: 1234,     &#x27;notification_category&#x27;: &#x27;Assignment Graded&#x27;   }  Submission:  Returns an {api:Submissions:Submission Submission} with its Course and Assignment data.  Conference:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conference&#x27;,     &#x27;web_conference_id&#x27;: 1234   }  Collaboration:    !!!javascript   {     &#x27;type&#x27;: &#x27;Collaboration&#x27;,     &#x27;collaboration_id&#x27;: 1234   }  AssessmentRequest:    !!!javascript   {     &#x27;type&#x27;: &#x27;AssessmentRequest&#x27;,     &#x27;assessment_request_id&#x27;: 1234   }
     */
    @Test
    public void listActivityStreamActivityStreamTest() {
        // api.listActivityStreamActivityStream();

        // TODO: test validations
    }

    /**
     * List the activity stream
     *
     * Returns the current user&#x27;s global activity stream, paginated.  There are many types of objects that can be returned in the activity stream. All object types have the same basic set of shared attributes:   !!!javascript   {     &#x27;created_at&#x27;: &#x27;2011-07-13T09:12:00Z&#x27;,     &#x27;updated_at&#x27;: &#x27;2011-07-25T08:52:41Z&#x27;,     &#x27;id&#x27;: 1234,     &#x27;title&#x27;: &#x27;Stream Item Subject&#x27;,     &#x27;message&#x27;: &#x27;This is the body text of the activity stream item. It is plain-text, and can be multiple paragraphs.&#x27;,     &#x27;type&#x27;: &#x27;DiscussionTopic|Conversation|Message|Submission|Conference|Collaboration|AssessmentRequest...&#x27;,     &#x27;read_state&#x27;: false,     &#x27;context_type&#x27;: &#x27;course&#x27;, // course|group     &#x27;course_id&#x27;: 1,     &#x27;group_id&#x27;: null,     &#x27;html_url&#x27;: \&quot;http://...\&quot; // URL to the Canvas web UI for this stream item   }  In addition, each item type has its own set of attributes available.  DiscussionTopic:    !!!javascript   {     &#x27;type&#x27;: &#x27;DiscussionTopic&#x27;,     &#x27;discussion_topic_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: true,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For DiscussionTopic, the message is truncated at 4kb.  Announcement:    !!!javascript   {     &#x27;type&#x27;: &#x27;Announcement&#x27;,     &#x27;announcement_id&#x27;: 1234,     &#x27;total_root_discussion_entries&#x27;: 5,     &#x27;require_initial_post&#x27;: true,     &#x27;user_has_posted&#x27;: null,     &#x27;root_discussion_entries&#x27;: {       ...     }   }  For Announcement, the message is truncated at 4kb.  Conversation:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conversation&#x27;,     &#x27;conversation_id&#x27;: 1234,     &#x27;private&#x27;: false,     &#x27;participant_count&#x27;: 3,   }  Message:    !!!javascript   {     &#x27;type&#x27;: &#x27;Message&#x27;,     &#x27;message_id&#x27;: 1234,     &#x27;notification_category&#x27;: &#x27;Assignment Graded&#x27;   }  Submission:  Returns an {api:Submissions:Submission Submission} with its Course and Assignment data.  Conference:    !!!javascript   {     &#x27;type&#x27;: &#x27;Conference&#x27;,     &#x27;web_conference_id&#x27;: 1234   }  Collaboration:    !!!javascript   {     &#x27;type&#x27;: &#x27;Collaboration&#x27;,     &#x27;collaboration_id&#x27;: 1234   }  AssessmentRequest:    !!!javascript   {     &#x27;type&#x27;: &#x27;AssessmentRequest&#x27;,     &#x27;assessment_request_id&#x27;: 1234   }
     */
    @Test
    public void listActivityStreamSelfTest() {
        // api.listActivityStreamSelf();

        // TODO: test validations
    }

    /**
     * List avatar options
     *
     * A paginated list of the possible user avatar options that can be set with the user update endpoint. The response will be an array of avatar records. If the &#x27;type&#x27; field is &#x27;attachment&#x27;, the record will include all the normal attachment json fields; otherwise it will include only the &#x27;url&#x27; and &#x27;display_name&#x27; fields. Additionally, all records will include a &#x27;type&#x27; field and a &#x27;token&#x27; field. The following explains each field in more detail type:: [\&quot;gravatar\&quot;|\&quot;attachment\&quot;|\&quot;no_pic\&quot;] The type of avatar record, for categorization purposes. url:: The url of the avatar token:: A unique representation of the avatar record which can be used to set the avatar with the user update endpoint. Note: this is an internal representation and is subject to change without notice. It should be consumed with this api endpoint and used in the user update endpoint, and should not be constructed by the client. display_name:: A textual description of the avatar record id:: [&#x27;attachment&#x27; type only] the internal id of the attachment content-type:: [&#x27;attachment&#x27; type only] the content-type of the attachment filename:: [&#x27;attachment&#x27; type only] the filename of the attachment size:: [&#x27;attachment&#x27; type only] the size of the attachment
     */
    @Test
    public void listAvatarOptionsTest() {
        String userId = null;
        // List<Avatar> response = api.listAvatarOptions(userId);

        // TODO: test validations
    }

    /**
     * List counts for todo items
     *
     * Counts of different todo items such as the number of assignments needing grading as well as the number of assignments needing submitting.  There is a limit to the number of todo items this endpoint will count. It will only look at the first 100 todo items for the user. If the user has more than 100 todo items this count may not be reliable. The largest reliable number for both counts is 100.
     */
    @Test
    public void listCountsForTodoItemsTest() {
        List<String> include = null;
        // api.listCountsForTodoItems(include);

        // TODO: test validations
    }

    /**
     * List counts for todo items
     *
     * Counts of different todo items such as the number of assignments needing grading as well as the number of assignments needing submitting.  There is a limit to the number of todo items this endpoint will count. It will only look at the first 100 todo items for the user. If the user has more than 100 todo items this count may not be reliable. The largest reliable number for both counts is 100.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCountsForTodoItemsTestQueryMap() {
        UsersApi.ListCountsForTodoItemsQueryParams queryParams = new UsersApi.ListCountsForTodoItemsQueryParams()
            .include(null);
        // api.listCountsForTodoItems(queryParams);

    // TODO: test validations
    }
    /**
     * List course nicknames
     *
     * Returns all course nicknames you have set.
     */
    @Test
    public void listCourseNicknamesTest() {
        // List<CourseNickname> response = api.listCourseNicknames();

        // TODO: test validations
    }

    /**
     * List Missing Submissions
     *
     * A paginated list of past-due assignments for which the student does not have a submission. The user sending the request must either be the student, an admin or a parent observer using the parent app
     */
    @Test
    public void listMissingSubmissionsTest() {
        String userId = null;
        List<String> include = null;
        List<String> filter = null;
        // List<Assignment> response = api.listMissingSubmissions(userId, include, filter);

        // TODO: test validations
    }

    /**
     * List Missing Submissions
     *
     * A paginated list of past-due assignments for which the student does not have a submission. The user sending the request must either be the student, an admin or a parent observer using the parent app
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listMissingSubmissionsTestQueryMap() {
        String userId = null;
        UsersApi.ListMissingSubmissionsQueryParams queryParams = new UsersApi.ListMissingSubmissionsQueryParams()
            .include(null)
            .filter(null);
        // List<Assignment> response = api.listMissingSubmissions(userId, queryParams);

    // TODO: test validations
    }
    /**
     * List the TODO items
     *
     * A paginated list of the current user&#x27;s list of todo items, as seen on the user dashboard.  There is a limit to the number of items returned.  The &#x60;ignore&#x60; and &#x60;ignore_permanently&#x60; URLs can be used to update the user&#x27;s preferences on what items will be displayed. Performing a DELETE request against the &#x60;ignore&#x60; URL will hide that item from future todo item requests, until the item changes. Performing a DELETE request against the &#x60;ignore_permanently&#x60; URL will hide that item forever.
     */
    @Test
    public void listTodoItemsTest() {
        List<String> include = null;
        // api.listTodoItems(include);

        // TODO: test validations
    }

    /**
     * List the TODO items
     *
     * A paginated list of the current user&#x27;s list of todo items, as seen on the user dashboard.  There is a limit to the number of items returned.  The &#x60;ignore&#x60; and &#x60;ignore_permanently&#x60; URLs can be used to update the user&#x27;s preferences on what items will be displayed. Performing a DELETE request against the &#x60;ignore&#x60; URL will hide that item from future todo item requests, until the item changes. Performing a DELETE request against the &#x60;ignore_permanently&#x60; URL will hide that item forever.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listTodoItemsTestQueryMap() {
        UsersApi.ListTodoItemsQueryParams queryParams = new UsersApi.ListTodoItemsQueryParams()
            .include(null);
        // api.listTodoItems(queryParams);

    // TODO: test validations
    }
    /**
     * List upcoming assignments, calendar events
     *
     * A paginated list of the current user&#x27;s upcoming events.
     */
    @Test
    public void listUpcomingAssignmentsCalendarEventsTest() {
        // api.listUpcomingAssignmentsCalendarEvents();

        // TODO: test validations
    }

    /**
     * List user page views
     *
     * Return a paginated list of the user&#x27;s page view history in json format, similar to the available CSV download. Page views are returned in descending order, newest to oldest.
     */
    @Test
    public void listUserPageViewsTest() {
        String userId = null;
        String startTime = null;
        String endTime = null;
        // List<PageView> response = api.listUserPageViews(userId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * List user page views
     *
     * Return a paginated list of the user&#x27;s page view history in json format, similar to the available CSV download. Page views are returned in descending order, newest to oldest.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUserPageViewsTestQueryMap() {
        String userId = null;
        UsersApi.ListUserPageViewsQueryParams queryParams = new UsersApi.ListUserPageViewsQueryParams()
            .startTime(null)
            .endTime(null);
        // List<PageView> response = api.listUserPageViews(userId, queryParams);

    // TODO: test validations
    }
    /**
     * List users in account
     *
     * A paginated list of of users associated with this account.   @example_request    curl https://&lt;canvas&gt;/api/v1/accounts/self/users?search_term&#x3D;&lt;search value&gt; \\       -X GET \\       -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
     */
    @Test
    public void listUsersInAccountTest() {
        String accountId = null;
        String searchTerm = null;
        String sort = null;
        String order = null;
        // List<User> response = api.listUsersInAccount(accountId, searchTerm, sort, order);

        // TODO: test validations
    }

    /**
     * List users in account
     *
     * A paginated list of of users associated with this account.   @example_request    curl https://&lt;canvas&gt;/api/v1/accounts/self/users?search_term&#x3D;&lt;search value&gt; \\       -X GET \\       -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUsersInAccountTestQueryMap() {
        String accountId = null;
        UsersApi.ListUsersInAccountQueryParams queryParams = new UsersApi.ListUsersInAccountQueryParams()
            .searchTerm(null)
            .sort(null)
            .order(null);
        // List<User> response = api.listUsersInAccount(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Load custom data
     *
     * Load custom user data.  Arbitrary JSON data can be stored for a User.  This API call retrieves that data for a (optional) given scope. See {api:UsersController#set_custom_data Store Custom Data} for details and examples.  On success, this endpoint returns an object containing the data that was requested.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
     */
    @Test
    public void loadCustomDataTest() {
        String userId = null;
        String ns = null;
        // api.loadCustomData(userId, ns);

        // TODO: test validations
    }

    /**
     * Load custom data
     *
     * Load custom user data.  Arbitrary JSON data can be stored for a User.  This API call retrieves that data for a (optional) given scope. See {api:UsersController#set_custom_data Store Custom Data} for details and examples.  On success, this endpoint returns an object containing the data that was requested.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the specified scope does not contain any data.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void loadCustomDataTestQueryMap() {
        String userId = null;
        UsersApi.LoadCustomDataQueryParams queryParams = new UsersApi.LoadCustomDataQueryParams()
            .ns(null);
        // api.loadCustomData(userId, queryParams);

    // TODO: test validations
    }
    /**
     * Merge user into another user
     *
     * Merge a user into another user. To merge users, the caller must have permissions to manage both users. This should be considered irreversible. This will delete the user and move all the data into the destination user.  When finding users by SIS ids in different accounts the destination_account_id is required.  The account can also be identified by passing the domain in destination_account_id.
     */
    @Test
    public void mergeUserIntoAnotherUserAccountsTest() {
        String id = null;
        String destinationAccountId = null;
        String destinationUserId = null;
        // User response = api.mergeUserIntoAnotherUserAccounts(id, destinationAccountId, destinationUserId);

        // TODO: test validations
    }

    /**
     * Merge user into another user
     *
     * Merge a user into another user. To merge users, the caller must have permissions to manage both users. This should be considered irreversible. This will delete the user and move all the data into the destination user.  When finding users by SIS ids in different accounts the destination_account_id is required.  The account can also be identified by passing the domain in destination_account_id.
     */
    @Test
    public void mergeUserIntoAnotherUserDestinationUserIdTest() {
        String id = null;
        String destinationUserId = null;
        // User response = api.mergeUserIntoAnotherUserDestinationUserId(id, destinationUserId);

        // TODO: test validations
    }

    /**
     * Remove course nickname
     *
     * Remove the nickname for the given course. Subsequent course API calls will return the actual name for the course.
     */
    @Test
    public void removeCourseNicknameTest() {
        String courseId = null;
        // CourseNickname response = api.removeCourseNickname(courseId);

        // TODO: test validations
    }

    /**
     * Self register a user
     *
     * Self register and return a new user and pseudonym for an account.  If self-registration is enabled on the account, you can use this endpoint to self register new users.
     */
    @Test
    public void selfRegisterUserTest() {
        String accountId = null;
        String userName = null;
        String userShortName = null;
        String userSortableName = null;
        String userTimeZone = null;
        String userLocale = null;
        String userBirthdate = null;
        Boolean userTermsOfUse = null;
        String pseudonymUniqueId = null;
        String communicationChannelType = null;
        String communicationChannelAddress = null;
        // User response = api.selfRegisterUser(accountId, userName, userShortName, userSortableName, userTimeZone, userLocale, userBirthdate, userTermsOfUse, pseudonymUniqueId, communicationChannelType, communicationChannelAddress);

        // TODO: test validations
    }

    /**
     * Set course nickname
     *
     * Set a nickname for the given course. This will replace the course&#x27;s name in output of API calls you make subsequently, as well as in selected places in the Canvas web user interface.
     */
    @Test
    public void setCourseNicknameTest() {
        String courseId = null;
        String nickname = null;
        // CourseNickname response = api.setCourseNickname(courseId, nickname);

        // TODO: test validations
    }

    /**
     * Show user details
     *
     * Shows details for user.  Also includes an attribute \&quot;permissions\&quot;, a non-comprehensive list of permissions for the user. Example:   !!!javascript   \&quot;permissions\&quot;: {    \&quot;can_update_name\&quot;: true, // Whether the user can update their name.    \&quot;can_update_avatar\&quot;: false // Whether the user can update their avatar.   }
     */
    @Test
    public void showUserDetailsTest() {
        String id = null;
        // User response = api.showUserDetails(id);

        // TODO: test validations
    }

    /**
     * Split merged users into separate users
     *
     * Merged users cannot be fully restored to their previous state, but this will attempt to split as much as possible to the previous state. To split a merged user, the caller must have permissions to manage all of the users logins. If there are multiple users that have been merged into one user it will split each merge into a separate user. A split can only happen within 180 days of a user merge. A user merge deletes the previous user and may be permanently deleted. In this scenario we create a new user object and proceed to move as much as possible to the new user. The user object will not have preserved the name or settings from the previous user. Some items may have been deleted during a user_merge that cannot be restored, and/or the data has become stale because of other changes to the objects since the time of the user_merge.
     */
    @Test
    public void splitMergedUsersIntoSeparateUsersTest() {
        String id = null;
        // List<User> response = api.splitMergedUsersIntoSeparateUsers(id);

        // TODO: test validations
    }

    /**
     * Store custom data
     *
     * Store arbitrary user data as JSON.  Arbitrary JSON data can be stored for a User. A typical scenario would be an external site/service that registers users in Canvas and wants to capture additional info about them.  The part of the URL that follows +/custom_data/+ defines the scope of the request, and it reflects the structure of the JSON data to be stored or retrieved.  The value +self+ may be used for +user_id+ to store data associated with the calling user. In order to access another user&#x27;s custom data, you must be an account administrator with permission to manage users.  A namespace parameter, +ns+, is used to prevent custom_data collisions between different apps.  This parameter is required for all custom_data requests.  A request with Content-Type multipart/form-data or Content-Type application/x-www-form-urlencoded can only be used to store strings.  Example PUT with multipart/form-data data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/telephone&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data&#x3D;555-1234&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;555-1234\&quot;   }  Subscopes (or, generated scopes) can also be specified by passing values to +data+[+subscope+].  Example PUT specifying subscopes:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/body/measurements&#x27; \\     -X PUT \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -F &#x27;data[waist]&#x3D;32in&#x27; \\     -F &#x27;data[inseam]&#x3D;34in&#x27; \\     -F &#x27;data[chest]&#x3D;40in&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;chest\&quot;: \&quot;40in\&quot;,       \&quot;waist\&quot;: \&quot;32in\&quot;,       \&quot;inseam\&quot;: \&quot;34in\&quot;     }   }  Following such a request, subsets of the stored data to be retrieved directly from a subscope.  Example {api:UsersController#get_custom_data GET} from a generated scope   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/body/measurements/chest&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;40in\&quot;   }  If you want to store more than just strings (i.e. numbers, arrays, hashes, true, false, and/or null), you must make a request with Content-Type application/json as in the following example.  Example PUT with JSON data:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data&#x27; \\     -H &#x27;Content-Type: application/json&#x27; \\     -X PUT \\     -d &#x27;{           \&quot;ns\&quot;: \&quot;com.my-organization.canvas-app\&quot;,           \&quot;data\&quot;: {             \&quot;a-number\&quot;: 6.02e23,             \&quot;a-bool\&quot;: true,             \&quot;a-string\&quot;: \&quot;true\&quot;,             \&quot;a-hash\&quot;: {\&quot;a\&quot;: {\&quot;b\&quot;: \&quot;ohai\&quot;}},             \&quot;an-array\&quot;: [1, \&quot;two\&quot;, null, false]           }         }&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: {       \&quot;a-number\&quot;: 6.02e+23,       \&quot;a-bool\&quot;: true,       \&quot;a-string\&quot;: \&quot;true\&quot;,       \&quot;a-hash\&quot;: {         \&quot;a\&quot;: {           \&quot;b\&quot;: \&quot;ohai\&quot;         }       },       \&quot;an-array\&quot;: [1, \&quot;two\&quot;, null, false]     }   }  If the data is an Object (as it is in the above example), then subsets of the data can be accessed by including the object&#x27;s (possibly nested) keys in the scope of a GET request.  Example {api:UsersController#get_custom_data GET} with a generated scope:   curl &#x27;https://&lt;canvas&gt;/api/v1/users/&lt;user_id&gt;/custom_data/a-hash/a/b&#x27; \\     -X GET \\     -F &#x27;ns&#x3D;com.my-organization.canvas-app&#x27; \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;  Response:   !!!javascript   {     \&quot;data\&quot;: \&quot;ohai\&quot;   }   On success, this endpoint returns an object containing the data that was stored.  Responds with status code 200 if the scope already contained data, and it was overwritten by the data specified in the request.  Responds with status code 201 if the scope was previously empty, and the data specified in the request was successfully stored there.  Responds with status code 400 if the namespace parameter, +ns+, is missing or invalid, or if the +data+ parameter is missing.  Responds with status code 409 if the requested scope caused a conflict and data was not stored. This happens when storing data at the requested scope would cause data at an outer scope to be lost.  e.g., if +/custom_data+ was +{\&quot;fashion_app\&quot;: {\&quot;hair\&quot;: \&quot;blonde\&quot;}}+, but you tried to +&#x60;PUT /custom_data/fashion_app/hair/style -F data&#x3D;buzz&#x60;+, then for the request to succeed,the value of +/custom_data/fashion_app/hair+ would have to become a hash, and its old string value would be lost.  In this situation, an error object is returned with the following format:    !!!javascript   {     \&quot;message\&quot;: \&quot;write conflict for custom_data hash\&quot;,     \&quot;conflict_scope\&quot;: \&quot;fashion_app/hair\&quot;,     \&quot;type_at_conflict\&quot;: \&quot;String\&quot;,     \&quot;value_at_conflict\&quot;: \&quot;blonde\&quot;   }
     */
    @Test
    public void storeCustomDataTest() {
        String userId = null;
        String ns = null;
        Object data = null;
        // api.storeCustomData(userId, ns, data);

        // TODO: test validations
    }

    /**
     * Update custom color
     *
     * Updates a custom color for a user for a given context.  This allows colors for the calendar and elsewhere to be customized on a user basis.  The asset string parameter should be in the format &#x27;context_id&#x27;, for example &#x27;course_42&#x27;
     */
    @Test
    public void updateCustomColorTest() {
        String id = null;
        String assetString = null;
        String hexcode = null;
        // api.updateCustomColor(id, assetString, hexcode);

        // TODO: test validations
    }

    /**
     * Update dashboard positions
     *
     * Updates the dashboard positions for a user for a given context.  This allows positions for the dashboard cards and elsewhere to be customized on a per user basis.  The asset string parameter should be in the format &#x27;context_id&#x27;, for example &#x27;course_42&#x27;
     */
    @Test
    public void updateDashboardPositionsTest() {
        String id = null;
        // api.updateDashboardPositions(id);

        // TODO: test validations
    }

    /**
     * Update user settings.
     *
     * Update an existing user&#x27;s settings.
     */
    @Test
    public void updateUserSettingsTest() {
        String id = null;
        Boolean manualMarkAsRead = null;
        Boolean collapseGlobalNav = null;
        // api.updateUserSettings(id, manualMarkAsRead, collapseGlobalNav);

        // TODO: test validations
    }

    /**
     * Update user settings.
     *
     * Update an existing user&#x27;s settings.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateUserSettingsTestQueryMap() {
        String id = null;
        UsersApi.UpdateUserSettingsQueryParams queryParams = new UsersApi.UpdateUserSettingsQueryParams()
            .manualMarkAsRead(null)
            .collapseGlobalNav(null);
        // api.updateUserSettings(id, queryParams);

    // TODO: test validations
    }
    /**
     * Upload a file
     *
     * Upload a file to the user&#x27;s personal files section.  This API endpoint is the first step in uploading a file to a user&#x27;s files. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  Note that typically users will only be able to upload files to their own files section. Passing a user_id of +self+ is an easy shortcut to specify the current user.
     */
    @Test
    public void uploadFileTest() {
        String userId = null;
        // api.uploadFile(userId);

        // TODO: test validations
    }

}
