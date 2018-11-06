package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.CourseEpubExport;
import com.instructure.canvas.model.EpubExport;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EPubExportsApi
 */
public class EPubExportsApiTest {

    private EPubExportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EPubExportsApi.class);
    }

    /**
     * Create ePub Export
     *
     * Begin an ePub export for a course.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The export&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:EpubExportsController#show Show content export} endpoint to retrieve a download URL for the exported content.
     */
    @Test
    public void createEpubExportTest() {
        String courseId = null;
        // EpubExport response = api.createEpubExport(courseId);

        // TODO: test validations
    }

    /**
     * List courses with their latest ePub export
     *
     * A paginated list of all courses a user is actively participating in, and the latest ePub export associated with the user &amp; course.
     */
    @Test
    public void listCoursesWithTheirLatestEpubExportTest() {
        // List<CourseEpubExport> response = api.listCoursesWithTheirLatestEpubExport();

        // TODO: test validations
    }

    /**
     * Show ePub export
     *
     * Get information about a single ePub export.
     */
    @Test
    public void showEpubExportTest() {
        String courseId = null;
        String id = null;
        // EpubExport response = api.showEpubExport(courseId, id);

        // TODO: test validations
    }

}
