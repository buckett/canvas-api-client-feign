package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.ColumnDatum;
import com.instructure.canvas.model.CustomColumn;
import com.instructure.canvas.model.Progress;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomGradebookColumnsApi
 */
public class CustomGradebookColumnsApiTest {

    private CustomGradebookColumnsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CustomGradebookColumnsApi.class);
    }

    /**
     * Bulk update column data
     *
     * Set the content of custom columns  {   \&quot;column_data\&quot;: [     {       \&quot;column_id\&quot;: example_column_id,       \&quot;user_id\&quot;: example_student_id,       \&quot;content\&quot;: example_content       },       {       \&quot;column_id\&quot;: example_column_id,       \&quot;user_id\&quot;: example_student_id,       \&quot;content: example_content     }   ] }
     */
    @Test
    public void bulkUpdateColumnDataTest() {
        String courseId = null;
        List<List<Object>> columnData = null;
        // Progress response = api.bulkUpdateColumnData(courseId, columnData);

        // TODO: test validations
    }

    /**
     * Create a custom gradebook column
     *
     * Create a custom gradebook column
     */
    @Test
    public void createCustomGradebookColumnTest() {
        String courseId = null;
        String columnTitle = null;
        Integer columnPosition = null;
        Boolean columnHidden = null;
        Boolean columnTeacherNotes = null;
        Boolean columnReadOnly = null;
        // CustomColumn response = api.createCustomGradebookColumn(courseId, columnTitle, columnPosition, columnHidden, columnTeacherNotes, columnReadOnly);

        // TODO: test validations
    }

    /**
     * Delete a custom gradebook column
     *
     * Permanently deletes a custom column and its associated data
     */
    @Test
    public void deleteCustomGradebookColumnTest() {
        String courseId = null;
        String id = null;
        // CustomColumn response = api.deleteCustomGradebookColumn(courseId, id);

        // TODO: test validations
    }

    /**
     * List custom gradebook columns
     *
     * A paginated list of all custom gradebook columns for a course
     */
    @Test
    public void listCustomGradebookColumnsTest() {
        String courseId = null;
        Boolean includeHidden = null;
        // List<CustomColumn> response = api.listCustomGradebookColumns(courseId, includeHidden);

        // TODO: test validations
    }

    /**
     * List custom gradebook columns
     *
     * A paginated list of all custom gradebook columns for a course
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCustomGradebookColumnsTestQueryMap() {
        String courseId = null;
        CustomGradebookColumnsApi.ListCustomGradebookColumnsQueryParams queryParams = new CustomGradebookColumnsApi.ListCustomGradebookColumnsQueryParams()
            .includeHidden(null);
        // List<CustomColumn> response = api.listCustomGradebookColumns(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List entries for a column
     *
     * This does not list entries for students without associated data.
     */
    @Test
    public void listEntriesForColumnTest() {
        String courseId = null;
        String id = null;
        Boolean includeHidden = null;
        // List<ColumnDatum> response = api.listEntriesForColumn(courseId, id, includeHidden);

        // TODO: test validations
    }

    /**
     * List entries for a column
     *
     * This does not list entries for students without associated data.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEntriesForColumnTestQueryMap() {
        String courseId = null;
        String id = null;
        CustomGradebookColumnsApi.ListEntriesForColumnQueryParams queryParams = new CustomGradebookColumnsApi.ListEntriesForColumnQueryParams()
            .includeHidden(null);
        // List<ColumnDatum> response = api.listEntriesForColumn(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Reorder custom columns
     *
     * Puts the given columns in the specified order  &lt;b&gt;200 OK&lt;/b&gt; is returned if successful
     */
    @Test
    public void reorderCustomColumnsTest() {
        String courseId = null;
        List<Integer> order = null;
        // api.reorderCustomColumns(courseId, order);

        // TODO: test validations
    }

    /**
     * Update column data
     *
     * Set the content of a custom column
     */
    @Test
    public void updateColumnDataTest() {
        String courseId = null;
        String id = null;
        String userId = null;
        String columnDataContent = null;
        // ColumnDatum response = api.updateColumnData(courseId, id, userId, columnDataContent);

        // TODO: test validations
    }

    /**
     * Update a custom gradebook column
     *
     * Accepts the same parameters as custom gradebook column creation
     */
    @Test
    public void updateCustomGradebookColumnTest() {
        String courseId = null;
        String id = null;
        // CustomColumn response = api.updateCustomGradebookColumn(courseId, id);

        // TODO: test validations
    }

}
