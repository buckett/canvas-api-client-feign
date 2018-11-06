package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.ExternalFeed;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnouncementExternalFeedsApi
 */
public class AnnouncementExternalFeedsApiTest {

    private AnnouncementExternalFeedsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AnnouncementExternalFeedsApi.class);
    }

    /**
     * Create an external feed
     *
     * Create a new external feed for the course or group.
     */
    @Test
    public void createExternalFeedCoursesTest() {
        String courseId = null;
        String url = null;
        Boolean headerMatch = null;
        String verbosity = null;
        // ExternalFeed response = api.createExternalFeedCourses(courseId, url, headerMatch, verbosity);

        // TODO: test validations
    }

    /**
     * Create an external feed
     *
     * Create a new external feed for the course or group.
     */
    @Test
    public void createExternalFeedGroupsTest() {
        String groupId = null;
        String url = null;
        Boolean headerMatch = null;
        String verbosity = null;
        // ExternalFeed response = api.createExternalFeedGroups(groupId, url, headerMatch, verbosity);

        // TODO: test validations
    }

    /**
     * Delete an external feed
     *
     * Deletes the external feed.
     */
    @Test
    public void deleteExternalFeedCoursesTest() {
        String courseId = null;
        String externalFeedId = null;
        // ExternalFeed response = api.deleteExternalFeedCourses(courseId, externalFeedId);

        // TODO: test validations
    }

    /**
     * Delete an external feed
     *
     * Deletes the external feed.
     */
    @Test
    public void deleteExternalFeedGroupsTest() {
        String groupId = null;
        String externalFeedId = null;
        // ExternalFeed response = api.deleteExternalFeedGroups(groupId, externalFeedId);

        // TODO: test validations
    }

    /**
     * List external feeds
     *
     * Returns the paginated list of External Feeds this course or group.
     */
    @Test
    public void listExternalFeedsCoursesTest() {
        String courseId = null;
        // List<ExternalFeed> response = api.listExternalFeedsCourses(courseId);

        // TODO: test validations
    }

    /**
     * List external feeds
     *
     * Returns the paginated list of External Feeds this course or group.
     */
    @Test
    public void listExternalFeedsGroupsTest() {
        String groupId = null;
        // List<ExternalFeed> response = api.listExternalFeedsGroups(groupId);

        // TODO: test validations
    }

}
