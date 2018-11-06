package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GradingPeriodsApi
 */
public class GradingPeriodsApiTest {

    private GradingPeriodsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GradingPeriodsApi.class);
    }

    /**
     * Delete a grading period
     *
     * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deleteGradingPeriodAccountsTest() {
        String accountId = null;
        String id = null;
        // api.deleteGradingPeriodAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * Delete a grading period
     *
     * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deleteGradingPeriodCoursesTest() {
        String courseId = null;
        String id = null;
        // api.deleteGradingPeriodCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Get a single grading period
     *
     * Returns the grading period with the given id
     */
    @Test
    public void getSingleGradingPeriodTest() {
        String courseId = null;
        String id = null;
        // api.getSingleGradingPeriod(courseId, id);

        // TODO: test validations
    }

    /**
     * List grading periods
     *
     * Returns the paginated list of grading periods for the current course.
     */
    @Test
    public void listGradingPeriodsAccountsTest() {
        String accountId = null;
        // api.listGradingPeriodsAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List grading periods
     *
     * Returns the paginated list of grading periods for the current course.
     */
    @Test
    public void listGradingPeriodsCoursesTest() {
        String courseId = null;
        // api.listGradingPeriodsCourses(courseId);

        // TODO: test validations
    }

    /**
     * Update a single grading period
     *
     * Update an existing grading period.
     */
    @Test
    public void updateSingleGradingPeriodTest() {
        String courseId = null;
        String id = null;
        List<LocalDate> gradingPeriodsStartDate = null;
        List<LocalDate> gradingPeriodsEndDate = null;
        List<BigDecimal> gradingPeriodsWeight = null;
        // api.updateSingleGradingPeriod(courseId, id, gradingPeriodsStartDate, gradingPeriodsEndDate, gradingPeriodsWeight);

        // TODO: test validations
    }

}
