package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Tab;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TabsApi
 */
public class TabsApiTest {

    private TabsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TabsApi.class);
    }

    /**
     * List available tabs for a course or group
     *
     * Returns a paginated list of navigation tabs available in the current context.
     */
    @Test
    public void listAvailableTabsForCourseOrGroupCoursesTest() {
        String courseId = null;
        List<String> include = null;
        // api.listAvailableTabsForCourseOrGroupCourses(courseId, include);

        // TODO: test validations
    }

    /**
     * List available tabs for a course or group
     *
     * Returns a paginated list of navigation tabs available in the current context.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAvailableTabsForCourseOrGroupCoursesTestQueryMap() {
        String courseId = null;
        TabsApi.ListAvailableTabsForCourseOrGroupCoursesQueryParams queryParams = new TabsApi.ListAvailableTabsForCourseOrGroupCoursesQueryParams()
            .include(null);
        // api.listAvailableTabsForCourseOrGroupCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List available tabs for a course or group
     *
     * Returns a paginated list of navigation tabs available in the current context.
     */
    @Test
    public void listAvailableTabsForCourseOrGroupGroupsTest() {
        String groupId = null;
        List<String> include = null;
        // api.listAvailableTabsForCourseOrGroupGroups(groupId, include);

        // TODO: test validations
    }

    /**
     * List available tabs for a course or group
     *
     * Returns a paginated list of navigation tabs available in the current context.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAvailableTabsForCourseOrGroupGroupsTestQueryMap() {
        String groupId = null;
        TabsApi.ListAvailableTabsForCourseOrGroupGroupsQueryParams queryParams = new TabsApi.ListAvailableTabsForCourseOrGroupGroupsQueryParams()
            .include(null);
        // api.listAvailableTabsForCourseOrGroupGroups(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * Update a tab for a course
     *
     * Home and Settings tabs are not manageable, and can&#x27;t be hidden or moved  Returns a tab object
     */
    @Test
    public void updateTabForCourseTest() {
        String courseId = null;
        String tabId = null;
        Integer position = null;
        Boolean hidden = null;
        // Tab response = api.updateTabForCourse(courseId, tabId, position, hidden);

        // TODO: test validations
    }

}
