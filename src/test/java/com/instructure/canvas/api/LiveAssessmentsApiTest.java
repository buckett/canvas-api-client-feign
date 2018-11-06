package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveAssessmentsApi
 */
public class LiveAssessmentsApiTest {

    private LiveAssessmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(LiveAssessmentsApi.class);
    }

    /**
     * Create live assessment results
     *
     * Creates live assessment results and adds them to a live assessment
     */
    @Test
    public void createLiveAssessmentResultsTest() {
        String courseId = null;
        String assessmentId = null;
        // api.createLiveAssessmentResults(courseId, assessmentId);

        // TODO: test validations
    }

    /**
     * Create or find a live assessment
     *
     * Creates or finds an existing live assessment with the given key and aligns it with the linked outcome
     */
    @Test
    public void createOrFindLiveAssessmentTest() {
        String courseId = null;
        // api.createOrFindLiveAssessment(courseId);

        // TODO: test validations
    }

    /**
     * List live assessment results
     *
     * Returns a paginated list of live assessment results
     */
    @Test
    public void listLiveAssessmentResultsTest() {
        String courseId = null;
        String assessmentId = null;
        Integer userId = null;
        // api.listLiveAssessmentResults(courseId, assessmentId, userId);

        // TODO: test validations
    }

    /**
     * List live assessment results
     *
     * Returns a paginated list of live assessment results
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listLiveAssessmentResultsTestQueryMap() {
        String courseId = null;
        String assessmentId = null;
        LiveAssessmentsApi.ListLiveAssessmentResultsQueryParams queryParams = new LiveAssessmentsApi.ListLiveAssessmentResultsQueryParams()
            .userId(null);
        // api.listLiveAssessmentResults(courseId, assessmentId, queryParams);

    // TODO: test validations
    }
    /**
     * List live assessments
     *
     * Returns a paginated list of live assessments.
     */
    @Test
    public void listLiveAssessmentsTest() {
        String courseId = null;
        // api.listLiveAssessments(courseId);

        // TODO: test validations
    }

}
