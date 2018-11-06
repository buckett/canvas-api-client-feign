package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.GradingStandard;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GradingStandardsApi
 */
public class GradingStandardsApiTest {

    private GradingStandardsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GradingStandardsApi.class);
    }

    /**
     * Create a new grading standard
     *
     * Create a new grading standard  If grading_scheme_entry arguments are omitted, then a default grading scheme will be set. The default scheme is as follows:      \&quot;A\&quot; : 94,      \&quot;A-\&quot; : 90,      \&quot;B+\&quot; : 87,      \&quot;B\&quot; : 84,      \&quot;B-\&quot; : 80,      \&quot;C+\&quot; : 77,      \&quot;C\&quot; : 74,      \&quot;C-\&quot; : 70,      \&quot;D+\&quot; : 67,      \&quot;D\&quot; : 64,      \&quot;D-\&quot; : 61,      \&quot;F\&quot; : 0,
     */
    @Test
    public void createNewGradingStandardAccountsTest() {
        String accountId = null;
        String title = null;
        List<String> gradingSchemeEntryName = null;
        List<Integer> gradingSchemeEntryValue = null;
        // GradingStandard response = api.createNewGradingStandardAccounts(accountId, title, gradingSchemeEntryName, gradingSchemeEntryValue);

        // TODO: test validations
    }

    /**
     * Create a new grading standard
     *
     * Create a new grading standard  If grading_scheme_entry arguments are omitted, then a default grading scheme will be set. The default scheme is as follows:      \&quot;A\&quot; : 94,      \&quot;A-\&quot; : 90,      \&quot;B+\&quot; : 87,      \&quot;B\&quot; : 84,      \&quot;B-\&quot; : 80,      \&quot;C+\&quot; : 77,      \&quot;C\&quot; : 74,      \&quot;C-\&quot; : 70,      \&quot;D+\&quot; : 67,      \&quot;D\&quot; : 64,      \&quot;D-\&quot; : 61,      \&quot;F\&quot; : 0,
     */
    @Test
    public void createNewGradingStandardCoursesTest() {
        String courseId = null;
        String title = null;
        List<String> gradingSchemeEntryName = null;
        List<Integer> gradingSchemeEntryValue = null;
        // GradingStandard response = api.createNewGradingStandardCourses(courseId, title, gradingSchemeEntryName, gradingSchemeEntryValue);

        // TODO: test validations
    }

    /**
     * Get a single grading standard in a context.
     *
     * Returns a grading standard for the given context that is visible to the user.
     */
    @Test
    public void getSingleGradingStandardInContextAccountsTest() {
        String accountId = null;
        String gradingStandardId = null;
        // GradingStandard response = api.getSingleGradingStandardInContextAccounts(accountId, gradingStandardId);

        // TODO: test validations
    }

    /**
     * Get a single grading standard in a context.
     *
     * Returns a grading standard for the given context that is visible to the user.
     */
    @Test
    public void getSingleGradingStandardInContextCoursesTest() {
        String courseId = null;
        String gradingStandardId = null;
        // GradingStandard response = api.getSingleGradingStandardInContextCourses(courseId, gradingStandardId);

        // TODO: test validations
    }

    /**
     * List the grading standards available in a context.
     *
     * Returns the paginated list of grading standards for the given context that are visible to the user.
     */
    @Test
    public void listGradingStandardsAvailableInContextAccountsTest() {
        String accountId = null;
        // List<GradingStandard> response = api.listGradingStandardsAvailableInContextAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List the grading standards available in a context.
     *
     * Returns the paginated list of grading standards for the given context that are visible to the user.
     */
    @Test
    public void listGradingStandardsAvailableInContextCoursesTest() {
        String courseId = null;
        // List<GradingStandard> response = api.listGradingStandardsAvailableInContextCourses(courseId);

        // TODO: test validations
    }

}
