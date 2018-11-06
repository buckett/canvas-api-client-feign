package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Rubric;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RubricsApi
 */
public class RubricsApiTest {

    private RubricsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RubricsApi.class);
    }

    /**
     * Get a single rubric
     *
     * Returns the rubric with the given id.
     */
    @Test
    public void getSingleRubricAccountsTest() {
        String accountId = null;
        String id = null;
        String include = null;
        String style = null;
        // Rubric response = api.getSingleRubricAccounts(accountId, id, include, style);

        // TODO: test validations
    }

    /**
     * Get a single rubric
     *
     * Returns the rubric with the given id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleRubricAccountsTestQueryMap() {
        String accountId = null;
        String id = null;
        RubricsApi.GetSingleRubricAccountsQueryParams queryParams = new RubricsApi.GetSingleRubricAccountsQueryParams()
            .include(null)
            .style(null);
        // Rubric response = api.getSingleRubricAccounts(accountId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single rubric
     *
     * Returns the rubric with the given id.
     */
    @Test
    public void getSingleRubricCoursesTest() {
        String courseId = null;
        String id = null;
        String include = null;
        String style = null;
        // Rubric response = api.getSingleRubricCourses(courseId, id, include, style);

        // TODO: test validations
    }

    /**
     * Get a single rubric
     *
     * Returns the rubric with the given id.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleRubricCoursesTestQueryMap() {
        String courseId = null;
        String id = null;
        RubricsApi.GetSingleRubricCoursesQueryParams queryParams = new RubricsApi.GetSingleRubricCoursesQueryParams()
            .include(null)
            .style(null);
        // Rubric response = api.getSingleRubricCourses(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * List rubrics
     *
     * Returns the paginated list of active rubrics for the current context.
     */
    @Test
    public void listRubricsAccountsTest() {
        String accountId = null;
        // api.listRubricsAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List rubrics
     *
     * Returns the paginated list of active rubrics for the current context.
     */
    @Test
    public void listRubricsCoursesTest() {
        String courseId = null;
        // api.listRubricsCourses(courseId);

        // TODO: test validations
    }

}
