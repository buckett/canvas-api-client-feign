package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SearchApi.class);
    }

    /**
     * Find recipients
     *
     * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
     */
    @Test
    public void findRecipientsConversationsTest() {
        String search = null;
        String context = null;
        List<String> exclude = null;
        String type = null;
        Integer userId = null;
        Integer fromConversationId = null;
        List<String> permissions = null;
        // api.findRecipientsConversations(search, context, exclude, type, userId, fromConversationId, permissions);

        // TODO: test validations
    }

    /**
     * Find recipients
     *
     * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void findRecipientsConversationsTestQueryMap() {
        SearchApi.FindRecipientsConversationsQueryParams queryParams = new SearchApi.FindRecipientsConversationsQueryParams()
            .search(null)
            .context(null)
            .exclude(null)
            .type(null)
            .userId(null)
            .fromConversationId(null)
            .permissions(null);
        // api.findRecipientsConversations(queryParams);

    // TODO: test validations
    }
    /**
     * Find recipients
     *
     * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
     */
    @Test
    public void findRecipientsSearchTest() {
        String search = null;
        String context = null;
        List<String> exclude = null;
        String type = null;
        Integer userId = null;
        Integer fromConversationId = null;
        List<String> permissions = null;
        // api.findRecipientsSearch(search, context, exclude, type, userId, fromConversationId, permissions);

        // TODO: test validations
    }

    /**
     * Find recipients
     *
     * Find valid recipients (users, courses and groups) that the current user can send messages to. The /api/v1/search/recipients path is the preferred endpoint, /api/v1/conversations/find_recipients is deprecated.  Pagination is supported.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void findRecipientsSearchTestQueryMap() {
        SearchApi.FindRecipientsSearchQueryParams queryParams = new SearchApi.FindRecipientsSearchQueryParams()
            .search(null)
            .context(null)
            .exclude(null)
            .type(null)
            .userId(null)
            .fromConversationId(null)
            .permissions(null);
        // api.findRecipientsSearch(queryParams);

    // TODO: test validations
    }
    /**
     * List all courses
     *
     * A paginated list of all courses visible in the public index
     */
    @Test
    public void listAllCoursesTest() {
        String search = null;
        Boolean publicOnly = null;
        Boolean openEnrollmentOnly = null;
        // api.listAllCourses(search, publicOnly, openEnrollmentOnly);

        // TODO: test validations
    }

    /**
     * List all courses
     *
     * A paginated list of all courses visible in the public index
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAllCoursesTestQueryMap() {
        SearchApi.ListAllCoursesQueryParams queryParams = new SearchApi.ListAllCoursesQueryParams()
            .search(null)
            .publicOnly(null)
            .openEnrollmentOnly(null);
        // api.listAllCourses(queryParams);

    // TODO: test validations
    }
}
