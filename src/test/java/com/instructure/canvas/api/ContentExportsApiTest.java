package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.ContentExport;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentExportsApi
 */
public class ContentExportsApiTest {

    private ContentExportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ContentExportsApi.class);
    }

    /**
     * Export content
     *
     * Begin a content export job for a course, group, or user.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The migration&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:ContentExportsApiController#show Show content export} endpoint to retrieve a download URL for the exported content.
     */
    @Test
    public void exportContentCoursesTest() {
        String courseId = null;
        String exportType = null;
        Boolean skipNotifications = null;
        Object select = null;
        // ContentExport response = api.exportContentCourses(courseId, exportType, skipNotifications, select);

        // TODO: test validations
    }

    /**
     * Export content
     *
     * Begin a content export job for a course, group, or user.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The migration&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:ContentExportsApiController#show Show content export} endpoint to retrieve a download URL for the exported content.
     */
    @Test
    public void exportContentGroupsTest() {
        String groupId = null;
        String exportType = null;
        Boolean skipNotifications = null;
        Object select = null;
        // ContentExport response = api.exportContentGroups(groupId, exportType, skipNotifications, select);

        // TODO: test validations
    }

    /**
     * Export content
     *
     * Begin a content export job for a course, group, or user.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The migration&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:ContentExportsApiController#show Show content export} endpoint to retrieve a download URL for the exported content.
     */
    @Test
    public void exportContentUsersTest() {
        String userId = null;
        String exportType = null;
        Boolean skipNotifications = null;
        Object select = null;
        // ContentExport response = api.exportContentUsers(userId, exportType, skipNotifications, select);

        // TODO: test validations
    }

    /**
     * List content exports
     *
     * A paginated list of the past and pending content export jobs for a course, group, or user. Exports are returned newest first.
     */
    @Test
    public void listContentExportsCoursesTest() {
        String courseId = null;
        // List<ContentExport> response = api.listContentExportsCourses(courseId);

        // TODO: test validations
    }

    /**
     * List content exports
     *
     * A paginated list of the past and pending content export jobs for a course, group, or user. Exports are returned newest first.
     */
    @Test
    public void listContentExportsGroupsTest() {
        String groupId = null;
        // List<ContentExport> response = api.listContentExportsGroups(groupId);

        // TODO: test validations
    }

    /**
     * List content exports
     *
     * A paginated list of the past and pending content export jobs for a course, group, or user. Exports are returned newest first.
     */
    @Test
    public void listContentExportsUsersTest() {
        String userId = null;
        // List<ContentExport> response = api.listContentExportsUsers(userId);

        // TODO: test validations
    }

    /**
     * Show content export
     *
     * Get information about a single content export.
     */
    @Test
    public void showContentExportCoursesTest() {
        String courseId = null;
        String id = null;
        // ContentExport response = api.showContentExportCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Show content export
     *
     * Get information about a single content export.
     */
    @Test
    public void showContentExportGroupsTest() {
        String groupId = null;
        String id = null;
        // ContentExport response = api.showContentExportGroups(groupId, id);

        // TODO: test validations
    }

    /**
     * Show content export
     *
     * Get information about a single content export.
     */
    @Test
    public void showContentExportUsersTest() {
        String userId = null;
        String id = null;
        // ContentExport response = api.showContentExportUsers(userId, id);

        // TODO: test validations
    }

}
