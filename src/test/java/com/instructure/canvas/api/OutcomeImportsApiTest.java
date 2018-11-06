package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.OutcomeImport;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutcomeImportsApi
 */
public class OutcomeImportsApiTest {

    private OutcomeImportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OutcomeImportsApi.class);
    }

    /**
     * Get Outcome import status
     *
     * Get the status of an already created Outcome import. Pass &#x27;latest&#x27; for the outcome import id for the latest import.    Examples:     curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;     curl &#x27;https://&lt;canvas&gt;/api/v1/courses/&lt;course_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
     */
    @Test
    public void getOutcomeImportStatusAccountsTest() {
        String accountId = null;
        String id = null;
        // OutcomeImport response = api.getOutcomeImportStatusAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * Get Outcome import status
     *
     * Get the status of an already created Outcome import. Pass &#x27;latest&#x27; for the outcome import id for the latest import.    Examples:     curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;     curl &#x27;https://&lt;canvas&gt;/api/v1/courses/&lt;course_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
     */
    @Test
    public void getOutcomeImportStatusCoursesTest() {
        String courseId = null;
        String id = null;
        // OutcomeImport response = api.getOutcomeImportStatusCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Import Outcomes
     *
     * Import outcomes into Canvas.  For more information on the format that&#x27;s expected here, please see the \&quot;Outcomes CSV\&quot; section in the API docs.
     */
    @Test
    public void importOutcomesAccountsTest() {
        String accountId = null;
        String importType = null;
        String attachment = null;
        String extension = null;
        // OutcomeImport response = api.importOutcomesAccounts(accountId, importType, attachment, extension);

        // TODO: test validations
    }

    /**
     * Import Outcomes
     *
     * Import outcomes into Canvas.  For more information on the format that&#x27;s expected here, please see the \&quot;Outcomes CSV\&quot; section in the API docs.
     */
    @Test
    public void importOutcomesCoursesTest() {
        String courseId = null;
        String importType = null;
        String attachment = null;
        String extension = null;
        // OutcomeImport response = api.importOutcomesCourses(courseId, importType, attachment, extension);

        // TODO: test validations
    }

}
