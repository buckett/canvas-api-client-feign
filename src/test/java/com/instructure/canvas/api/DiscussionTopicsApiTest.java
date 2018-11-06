package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.DiscussionTopic;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiscussionTopicsApi
 */
public class DiscussionTopicsApiTest {

    private DiscussionTopicsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DiscussionTopicsApi.class);
    }

    /**
     * Create a new discussion topic
     *
     * Create an new discussion topic for the course or group.
     */
    @Test
    public void createNewDiscussionTopicCoursesTest() {
        String courseId = null;
        String title = null;
        String message = null;
        String discussionType = null;
        Boolean published = null;
        String delayedPostAt = null;
        Boolean allowRating = null;
        String lockAt = null;
        Boolean podcastEnabled = null;
        Boolean podcastHasStudentPosts = null;
        Boolean requireInitialPost = null;
        Object assignment = null;
        Boolean isAnnouncement = null;
        Boolean pinned = null;
        String positionAfter = null;
        Integer groupCategoryId = null;
        Boolean onlyGradersCanRate = null;
        Boolean sortByRating = null;
        File attachment = null;
        String specificSections = null;
        // api.createNewDiscussionTopicCourses(courseId, title, message, discussionType, published, delayedPostAt, allowRating, lockAt, podcastEnabled, podcastHasStudentPosts, requireInitialPost, assignment, isAnnouncement, pinned, positionAfter, groupCategoryId, onlyGradersCanRate, sortByRating, attachment, specificSections);

        // TODO: test validations
    }

    /**
     * Create a new discussion topic
     *
     * Create an new discussion topic for the course or group.
     */
    @Test
    public void createNewDiscussionTopicGroupsTest() {
        String groupId = null;
        String title = null;
        String message = null;
        String discussionType = null;
        Boolean published = null;
        String delayedPostAt = null;
        Boolean allowRating = null;
        String lockAt = null;
        Boolean podcastEnabled = null;
        Boolean podcastHasStudentPosts = null;
        Boolean requireInitialPost = null;
        Object assignment = null;
        Boolean isAnnouncement = null;
        Boolean pinned = null;
        String positionAfter = null;
        Integer groupCategoryId = null;
        Boolean onlyGradersCanRate = null;
        Boolean sortByRating = null;
        File attachment = null;
        String specificSections = null;
        // api.createNewDiscussionTopicGroups(groupId, title, message, discussionType, published, delayedPostAt, allowRating, lockAt, podcastEnabled, podcastHasStudentPosts, requireInitialPost, assignment, isAnnouncement, pinned, positionAfter, groupCategoryId, onlyGradersCanRate, sortByRating, attachment, specificSections);

        // TODO: test validations
    }

    /**
     * Delete an entry
     *
     * Delete a discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the delete is not allowed, a 401 will be returned.  The discussion will be marked deleted, and the user_id and message will be cleared out.
     */
    @Test
    public void deleteEntryCoursesTest() {
        String courseId = null;
        String topicId = null;
        String id = null;
        // api.deleteEntryCourses(courseId, topicId, id);

        // TODO: test validations
    }

    /**
     * Delete an entry
     *
     * Delete a discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the delete is not allowed, a 401 will be returned.  The discussion will be marked deleted, and the user_id and message will be cleared out.
     */
    @Test
    public void deleteEntryGroupsTest() {
        String groupId = null;
        String topicId = null;
        String id = null;
        // api.deleteEntryGroups(groupId, topicId, id);

        // TODO: test validations
    }

    /**
     * Delete a topic
     *
     * Deletes the discussion topic. This will also delete the assignment, if it&#x27;s an assignment discussion.
     */
    @Test
    public void deleteTopicCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.deleteTopicCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * Delete a topic
     *
     * Deletes the discussion topic. This will also delete the assignment, if it&#x27;s an assignment discussion.
     */
    @Test
    public void deleteTopicGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.deleteTopicGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Get the full topic
     *
     * Return a cached structure of the discussion topic, containing all entries, their authors, and their message bodies.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  In some rare situations, this cached structure may not be available yet. In that case, the server will respond with a 503 error, and the caller should try again soon.  The response is an object containing the following keys: * \&quot;participants\&quot;: A list of summary information on users who have posted to   the discussion. Each value is an object containing their id, display_name,   and avatar_url. * \&quot;unread_entries\&quot;: A list of entry ids that are unread by the current   user. this implies that any entry not in this list is read. * \&quot;entry_ratings\&quot;: A map of entry ids to ratings by the current user. Entries   not in this list have no rating. Only populated if rating is enabled. * \&quot;forced_entries\&quot;: A list of entry ids that have forced_read_state set to   true. This flag is meant to indicate the entry&#x27;s read_state has been   manually set to &#x27;unread&#x27; by the user, so the entry should not be   automatically marked as read. * \&quot;view\&quot;: A threaded view of all the entries in the discussion, containing   the id, user_id, and message. * \&quot;new_entries\&quot;: Because this view is eventually consistent, it&#x27;s possible   that newly created or updated entries won&#x27;t yet be reflected in the view.   If the application wants to also get a flat list of all entries not yet   reflected in the view, pass include_new_entries&#x3D;1 to the request and this   array of entries will be returned. These entries are returned in a flat   array, in ascending created_at order.
     */
    @Test
    public void getFullTopicCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.getFullTopicCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * Get the full topic
     *
     * Return a cached structure of the discussion topic, containing all entries, their authors, and their message bodies.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  In some rare situations, this cached structure may not be available yet. In that case, the server will respond with a 503 error, and the caller should try again soon.  The response is an object containing the following keys: * \&quot;participants\&quot;: A list of summary information on users who have posted to   the discussion. Each value is an object containing their id, display_name,   and avatar_url. * \&quot;unread_entries\&quot;: A list of entry ids that are unread by the current   user. this implies that any entry not in this list is read. * \&quot;entry_ratings\&quot;: A map of entry ids to ratings by the current user. Entries   not in this list have no rating. Only populated if rating is enabled. * \&quot;forced_entries\&quot;: A list of entry ids that have forced_read_state set to   true. This flag is meant to indicate the entry&#x27;s read_state has been   manually set to &#x27;unread&#x27; by the user, so the entry should not be   automatically marked as read. * \&quot;view\&quot;: A threaded view of all the entries in the discussion, containing   the id, user_id, and message. * \&quot;new_entries\&quot;: Because this view is eventually consistent, it&#x27;s possible   that newly created or updated entries won&#x27;t yet be reflected in the view.   If the application wants to also get a flat list of all entries not yet   reflected in the view, pass include_new_entries&#x3D;1 to the request and this   array of entries will be returned. These entries are returned in a flat   array, in ascending created_at order.
     */
    @Test
    public void getFullTopicGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.getFullTopicGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Get a single topic
     *
     * Returns data on an individual discussion topic. See the List action for the response formatting.
     */
    @Test
    public void getSingleTopicCoursesTest() {
        String courseId = null;
        String topicId = null;
        List<String> include = null;
        // api.getSingleTopicCourses(courseId, topicId, include);

        // TODO: test validations
    }

    /**
     * Get a single topic
     *
     * Returns data on an individual discussion topic. See the List action for the response formatting.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleTopicCoursesTestQueryMap() {
        String courseId = null;
        String topicId = null;
        DiscussionTopicsApi.GetSingleTopicCoursesQueryParams queryParams = new DiscussionTopicsApi.GetSingleTopicCoursesQueryParams()
            .include(null);
        // api.getSingleTopicCourses(courseId, topicId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single topic
     *
     * Returns data on an individual discussion topic. See the List action for the response formatting.
     */
    @Test
    public void getSingleTopicGroupsTest() {
        String groupId = null;
        String topicId = null;
        List<String> include = null;
        // api.getSingleTopicGroups(groupId, topicId, include);

        // TODO: test validations
    }

    /**
     * Get a single topic
     *
     * Returns data on an individual discussion topic. See the List action for the response formatting.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleTopicGroupsTestQueryMap() {
        String groupId = null;
        String topicId = null;
        DiscussionTopicsApi.GetSingleTopicGroupsQueryParams queryParams = new DiscussionTopicsApi.GetSingleTopicGroupsQueryParams()
            .include(null);
        // api.getSingleTopicGroups(groupId, topicId, queryParams);

    // TODO: test validations
    }
    /**
     * List discussion topics
     *
     * Returns the paginated list of discussion topics for this course or group.
     */
    @Test
    public void listDiscussionTopicsCoursesTest() {
        String courseId = null;
        List<String> include = null;
        String orderBy = null;
        String scope = null;
        Boolean onlyAnnouncements = null;
        String filterBy = null;
        String searchTerm = null;
        Boolean excludeContextModuleLockedTopics = null;
        // List<DiscussionTopic> response = api.listDiscussionTopicsCourses(courseId, include, orderBy, scope, onlyAnnouncements, filterBy, searchTerm, excludeContextModuleLockedTopics);

        // TODO: test validations
    }

    /**
     * List discussion topics
     *
     * Returns the paginated list of discussion topics for this course or group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listDiscussionTopicsCoursesTestQueryMap() {
        String courseId = null;
        DiscussionTopicsApi.ListDiscussionTopicsCoursesQueryParams queryParams = new DiscussionTopicsApi.ListDiscussionTopicsCoursesQueryParams()
            .include(null)
            .orderBy(null)
            .scope(null)
            .onlyAnnouncements(null)
            .filterBy(null)
            .searchTerm(null)
            .excludeContextModuleLockedTopics(null);
        // List<DiscussionTopic> response = api.listDiscussionTopicsCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List discussion topics
     *
     * Returns the paginated list of discussion topics for this course or group.
     */
    @Test
    public void listDiscussionTopicsGroupsTest() {
        String groupId = null;
        List<String> include = null;
        String orderBy = null;
        String scope = null;
        Boolean onlyAnnouncements = null;
        String filterBy = null;
        String searchTerm = null;
        Boolean excludeContextModuleLockedTopics = null;
        // List<DiscussionTopic> response = api.listDiscussionTopicsGroups(groupId, include, orderBy, scope, onlyAnnouncements, filterBy, searchTerm, excludeContextModuleLockedTopics);

        // TODO: test validations
    }

    /**
     * List discussion topics
     *
     * Returns the paginated list of discussion topics for this course or group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listDiscussionTopicsGroupsTestQueryMap() {
        String groupId = null;
        DiscussionTopicsApi.ListDiscussionTopicsGroupsQueryParams queryParams = new DiscussionTopicsApi.ListDiscussionTopicsGroupsQueryParams()
            .include(null)
            .orderBy(null)
            .scope(null)
            .onlyAnnouncements(null)
            .filterBy(null)
            .searchTerm(null)
            .excludeContextModuleLockedTopics(null);
        // List<DiscussionTopic> response = api.listDiscussionTopicsGroups(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * List entries
     *
     * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
     */
    @Test
    public void listEntriesCoursesTest() {
        String courseId = null;
        String topicId = null;
        List<String> ids = null;
        // api.listEntriesCourses(courseId, topicId, ids);

        // TODO: test validations
    }

    /**
     * List entries
     *
     * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEntriesCoursesTestQueryMap() {
        String courseId = null;
        String topicId = null;
        DiscussionTopicsApi.ListEntriesCoursesQueryParams queryParams = new DiscussionTopicsApi.ListEntriesCoursesQueryParams()
            .ids(null);
        // api.listEntriesCourses(courseId, topicId, queryParams);

    // TODO: test validations
    }
    /**
     * List entries
     *
     * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
     */
    @Test
    public void listEntriesGroupsTest() {
        String groupId = null;
        String topicId = null;
        List<String> ids = null;
        // api.listEntriesGroups(groupId, topicId, ids);

        // TODO: test validations
    }

    /**
     * List entries
     *
     * Retrieve a paginated list of discussion entries, given a list of ids.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEntriesGroupsTestQueryMap() {
        String groupId = null;
        String topicId = null;
        DiscussionTopicsApi.ListEntriesGroupsQueryParams queryParams = new DiscussionTopicsApi.ListEntriesGroupsQueryParams()
            .ids(null);
        // api.listEntriesGroups(groupId, topicId, queryParams);

    // TODO: test validations
    }
    /**
     * List entry replies
     *
     * Retrieve the (paginated) replies to a top-level entry in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Ordering of returned entries is newest-first by creation timestamp.
     */
    @Test
    public void listEntryRepliesCoursesTest() {
        String courseId = null;
        String topicId = null;
        String entryId = null;
        // api.listEntryRepliesCourses(courseId, topicId, entryId);

        // TODO: test validations
    }

    /**
     * List entry replies
     *
     * Retrieve the (paginated) replies to a top-level entry in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Ordering of returned entries is newest-first by creation timestamp.
     */
    @Test
    public void listEntryRepliesGroupsTest() {
        String groupId = null;
        String topicId = null;
        String entryId = null;
        // api.listEntryRepliesGroups(groupId, topicId, entryId);

        // TODO: test validations
    }

    /**
     * List topic entries
     *
     * Retrieve the (paginated) top-level entries in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Will include the 10 most recent replies, if any, for each entry returned.  If the topic is a root topic with children corresponding to groups of a group assignment, entries from those subtopics for which the user belongs to the corresponding group will be returned.  Ordering of returned entries is newest-first by posting timestamp (reply activity is ignored).
     */
    @Test
    public void listTopicEntriesCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.listTopicEntriesCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * List topic entries
     *
     * Retrieve the (paginated) top-level entries in a discussion topic.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.  Will include the 10 most recent replies, if any, for each entry returned.  If the topic is a root topic with children corresponding to groups of a group assignment, entries from those subtopics for which the user belongs to the corresponding group will be returned.  Ordering of returned entries is newest-first by posting timestamp (reply activity is ignored).
     */
    @Test
    public void listTopicEntriesGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.listTopicEntriesGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Mark all entries as read
     *
     * Mark the discussion topic and all its entries as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markAllEntriesAsReadCoursesTest() {
        String courseId = null;
        String topicId = null;
        Boolean forcedReadState = null;
        // api.markAllEntriesAsReadCourses(courseId, topicId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark all entries as read
     *
     * Mark the discussion topic and all its entries as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markAllEntriesAsReadGroupsTest() {
        String groupId = null;
        String topicId = null;
        Boolean forcedReadState = null;
        // api.markAllEntriesAsReadGroups(groupId, topicId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark all entries as unread
     *
     * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markAllEntriesAsUnreadCoursesTest() {
        String courseId = null;
        String topicId = null;
        Boolean forcedReadState = null;
        // api.markAllEntriesAsUnreadCourses(courseId, topicId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark all entries as unread
     *
     * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void markAllEntriesAsUnreadCoursesTestQueryMap() {
        String courseId = null;
        String topicId = null;
        DiscussionTopicsApi.MarkAllEntriesAsUnreadCoursesQueryParams queryParams = new DiscussionTopicsApi.MarkAllEntriesAsUnreadCoursesQueryParams()
            .forcedReadState(null);
        // api.markAllEntriesAsUnreadCourses(courseId, topicId, queryParams);

    // TODO: test validations
    }
    /**
     * Mark all entries as unread
     *
     * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markAllEntriesAsUnreadGroupsTest() {
        String groupId = null;
        String topicId = null;
        Boolean forcedReadState = null;
        // api.markAllEntriesAsUnreadGroups(groupId, topicId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark all entries as unread
     *
     * Mark the discussion topic and all its entries as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void markAllEntriesAsUnreadGroupsTestQueryMap() {
        String groupId = null;
        String topicId = null;
        DiscussionTopicsApi.MarkAllEntriesAsUnreadGroupsQueryParams queryParams = new DiscussionTopicsApi.MarkAllEntriesAsUnreadGroupsQueryParams()
            .forcedReadState(null);
        // api.markAllEntriesAsUnreadGroups(groupId, topicId, queryParams);

    // TODO: test validations
    }
    /**
     * Mark entry as read
     *
     * Mark a discussion entry as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markEntryAsReadCoursesTest() {
        String courseId = null;
        String topicId = null;
        String entryId = null;
        Boolean forcedReadState = null;
        // api.markEntryAsReadCourses(courseId, topicId, entryId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark entry as read
     *
     * Mark a discussion entry as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markEntryAsReadGroupsTest() {
        String groupId = null;
        String topicId = null;
        String entryId = null;
        Boolean forcedReadState = null;
        // api.markEntryAsReadGroups(groupId, topicId, entryId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark entry as unread
     *
     * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markEntryAsUnreadCoursesTest() {
        String courseId = null;
        String topicId = null;
        String entryId = null;
        Boolean forcedReadState = null;
        // api.markEntryAsUnreadCourses(courseId, topicId, entryId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark entry as unread
     *
     * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void markEntryAsUnreadCoursesTestQueryMap() {
        String courseId = null;
        String topicId = null;
        String entryId = null;
        DiscussionTopicsApi.MarkEntryAsUnreadCoursesQueryParams queryParams = new DiscussionTopicsApi.MarkEntryAsUnreadCoursesQueryParams()
            .forcedReadState(null);
        // api.markEntryAsUnreadCourses(courseId, topicId, entryId, queryParams);

    // TODO: test validations
    }
    /**
     * Mark entry as unread
     *
     * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markEntryAsUnreadGroupsTest() {
        String groupId = null;
        String topicId = null;
        String entryId = null;
        Boolean forcedReadState = null;
        // api.markEntryAsUnreadGroups(groupId, topicId, entryId, forcedReadState);

        // TODO: test validations
    }

    /**
     * Mark entry as unread
     *
     * Mark a discussion entry as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void markEntryAsUnreadGroupsTestQueryMap() {
        String groupId = null;
        String topicId = null;
        String entryId = null;
        DiscussionTopicsApi.MarkEntryAsUnreadGroupsQueryParams queryParams = new DiscussionTopicsApi.MarkEntryAsUnreadGroupsQueryParams()
            .forcedReadState(null);
        // api.markEntryAsUnreadGroups(groupId, topicId, entryId, queryParams);

    // TODO: test validations
    }
    /**
     * Mark topic as read
     *
     * Mark the initial text of the discussion topic as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markTopicAsReadCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.markTopicAsReadCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * Mark topic as read
     *
     * Mark the initial text of the discussion topic as read.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markTopicAsReadGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.markTopicAsReadGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Mark topic as unread
     *
     * Mark the initial text of the discussion topic as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markTopicAsUnreadCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.markTopicAsUnreadCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * Mark topic as unread
     *
     * Mark the initial text of the discussion topic as unread.  No request fields are necessary.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void markTopicAsUnreadGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.markTopicAsUnreadGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Post an entry
     *
     * Create a new entry in a discussion topic. Returns a json representation of the created entry (see documentation for &#x27;entries&#x27; method) on success.
     */
    @Test
    public void postEntryCoursesTest() {
        String courseId = null;
        String topicId = null;
        String message = null;
        String attachment = null;
        // api.postEntryCourses(courseId, topicId, message, attachment);

        // TODO: test validations
    }

    /**
     * Post an entry
     *
     * Create a new entry in a discussion topic. Returns a json representation of the created entry (see documentation for &#x27;entries&#x27; method) on success.
     */
    @Test
    public void postEntryGroupsTest() {
        String groupId = null;
        String topicId = null;
        String message = null;
        String attachment = null;
        // api.postEntryGroups(groupId, topicId, message, attachment);

        // TODO: test validations
    }

    /**
     * Post a reply
     *
     * Add a reply to an entry in a discussion topic. Returns a json representation of the created reply (see documentation for &#x27;replies&#x27; method) on success.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
     */
    @Test
    public void postReplyCoursesTest() {
        String courseId = null;
        String topicId = null;
        String entryId = null;
        String message = null;
        String attachment = null;
        // api.postReplyCourses(courseId, topicId, entryId, message, attachment);

        // TODO: test validations
    }

    /**
     * Post a reply
     *
     * Add a reply to an entry in a discussion topic. Returns a json representation of the created reply (see documentation for &#x27;replies&#x27; method) on success.  May require (depending on the topic) that the user has posted in the topic. If it is required, and the user has not posted, will respond with a 403 Forbidden status and the body &#x27;require_initial_post&#x27;.
     */
    @Test
    public void postReplyGroupsTest() {
        String groupId = null;
        String topicId = null;
        String entryId = null;
        String message = null;
        String attachment = null;
        // api.postReplyGroups(groupId, topicId, entryId, message, attachment);

        // TODO: test validations
    }

    /**
     * Rate entry
     *
     * Rate a discussion entry.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void rateEntryCoursesTest() {
        String courseId = null;
        String topicId = null;
        String entryId = null;
        Integer rating = null;
        // api.rateEntryCourses(courseId, topicId, entryId, rating);

        // TODO: test validations
    }

    /**
     * Rate entry
     *
     * Rate a discussion entry.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void rateEntryGroupsTest() {
        String groupId = null;
        String topicId = null;
        String entryId = null;
        Integer rating = null;
        // api.rateEntryGroups(groupId, topicId, entryId, rating);

        // TODO: test validations
    }

    /**
     * Reorder pinned topics
     *
     * Puts the pinned discussion topics in the specified order. All pinned topics should be included.
     */
    @Test
    public void reorderPinnedTopicsCoursesTest() {
        String courseId = null;
        List<Integer> order = null;
        // api.reorderPinnedTopicsCourses(courseId, order);

        // TODO: test validations
    }

    /**
     * Reorder pinned topics
     *
     * Puts the pinned discussion topics in the specified order. All pinned topics should be included.
     */
    @Test
    public void reorderPinnedTopicsGroupsTest() {
        String groupId = null;
        List<Integer> order = null;
        // api.reorderPinnedTopicsGroups(groupId, order);

        // TODO: test validations
    }

    /**
     * Subscribe to a topic
     *
     * Subscribe to a topic to receive notifications about new entries  On success, the response will be 204 No Content with an empty body
     */
    @Test
    public void subscribeToTopicCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.subscribeToTopicCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * Subscribe to a topic
     *
     * Subscribe to a topic to receive notifications about new entries  On success, the response will be 204 No Content with an empty body
     */
    @Test
    public void subscribeToTopicGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.subscribeToTopicGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Unsubscribe from a topic
     *
     * Unsubscribe from a topic to stop receiving notifications about new entries  On success, the response will be 204 No Content with an empty body
     */
    @Test
    public void unsubscribeFromTopicCoursesTest() {
        String courseId = null;
        String topicId = null;
        // api.unsubscribeFromTopicCourses(courseId, topicId);

        // TODO: test validations
    }

    /**
     * Unsubscribe from a topic
     *
     * Unsubscribe from a topic to stop receiving notifications about new entries  On success, the response will be 204 No Content with an empty body
     */
    @Test
    public void unsubscribeFromTopicGroupsTest() {
        String groupId = null;
        String topicId = null;
        // api.unsubscribeFromTopicGroups(groupId, topicId);

        // TODO: test validations
    }

    /**
     * Update an entry
     *
     * Update an existing discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the edit is not allowed, a 401 will be returned.
     */
    @Test
    public void updateEntryCoursesTest() {
        String courseId = null;
        String topicId = null;
        String id = null;
        String message = null;
        // api.updateEntryCourses(courseId, topicId, id, message);

        // TODO: test validations
    }

    /**
     * Update an entry
     *
     * Update an existing discussion entry.  The entry must have been created by the current user, or the current user must have admin rights to the discussion. If the edit is not allowed, a 401 will be returned.
     */
    @Test
    public void updateEntryGroupsTest() {
        String groupId = null;
        String topicId = null;
        String id = null;
        String message = null;
        // api.updateEntryGroups(groupId, topicId, id, message);

        // TODO: test validations
    }

    /**
     * Update a topic
     *
     * Update an existing discussion topic for the course or group.
     */
    @Test
    public void updateTopicCoursesTest() {
        String courseId = null;
        String topicId = null;
        String title = null;
        String message = null;
        String discussionType = null;
        Boolean published = null;
        String delayedPostAt = null;
        String lockAt = null;
        Boolean podcastEnabled = null;
        Boolean podcastHasStudentPosts = null;
        Boolean requireInitialPost = null;
        Object assignment = null;
        Boolean isAnnouncement = null;
        Boolean pinned = null;
        String positionAfter = null;
        Integer groupCategoryId = null;
        Boolean allowRating = null;
        Boolean onlyGradersCanRate = null;
        Boolean sortByRating = null;
        String specificSections = null;
        // api.updateTopicCourses(courseId, topicId, title, message, discussionType, published, delayedPostAt, lockAt, podcastEnabled, podcastHasStudentPosts, requireInitialPost, assignment, isAnnouncement, pinned, positionAfter, groupCategoryId, allowRating, onlyGradersCanRate, sortByRating, specificSections);

        // TODO: test validations
    }

    /**
     * Update a topic
     *
     * Update an existing discussion topic for the course or group.
     */
    @Test
    public void updateTopicGroupsTest() {
        String groupId = null;
        String topicId = null;
        String title = null;
        String message = null;
        String discussionType = null;
        Boolean published = null;
        String delayedPostAt = null;
        String lockAt = null;
        Boolean podcastEnabled = null;
        Boolean podcastHasStudentPosts = null;
        Boolean requireInitialPost = null;
        Object assignment = null;
        Boolean isAnnouncement = null;
        Boolean pinned = null;
        String positionAfter = null;
        Integer groupCategoryId = null;
        Boolean allowRating = null;
        Boolean onlyGradersCanRate = null;
        Boolean sortByRating = null;
        String specificSections = null;
        // api.updateTopicGroups(groupId, topicId, title, message, discussionType, published, delayedPostAt, lockAt, podcastEnabled, podcastHasStudentPosts, requireInitialPost, assignment, isAnnouncement, pinned, positionAfter, groupCategoryId, allowRating, onlyGradersCanRate, sortByRating, specificSections);

        // TODO: test validations
    }

}
