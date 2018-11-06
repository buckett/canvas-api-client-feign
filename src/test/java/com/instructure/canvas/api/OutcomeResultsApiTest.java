package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutcomeResultsApi
 */
public class OutcomeResultsApiTest {

    private OutcomeResultsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OutcomeResultsApi.class);
    }

    /**
     * Get outcome result rollups
     *
     * Gets the outcome rollups for the users and outcomes in the specified context.
     */
    @Test
    public void getOutcomeResultRollupsTest() {
        String courseId = null;
        String aggregate = null;
        String aggregateStat = null;
        List<Integer> userIds = null;
        List<Integer> outcomeIds = null;
        List<String> include = null;
        List<String> exclude = null;
        String sortBy = null;
        Integer sortOutcomeId = null;
        String sortOrder = null;
        // api.getOutcomeResultRollups(courseId, aggregate, aggregateStat, userIds, outcomeIds, include, exclude, sortBy, sortOutcomeId, sortOrder);

        // TODO: test validations
    }

    /**
     * Get outcome result rollups
     *
     * Gets the outcome rollups for the users and outcomes in the specified context.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getOutcomeResultRollupsTestQueryMap() {
        String courseId = null;
        OutcomeResultsApi.GetOutcomeResultRollupsQueryParams queryParams = new OutcomeResultsApi.GetOutcomeResultRollupsQueryParams()
            .aggregate(null)
            .aggregateStat(null)
            .userIds(null)
            .outcomeIds(null)
            .include(null)
            .exclude(null)
            .sortBy(null)
            .sortOutcomeId(null)
            .sortOrder(null);
        // api.getOutcomeResultRollups(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Get outcome results
     *
     * Gets the outcome results for users and outcomes in the specified context.
     */
    @Test
    public void getOutcomeResultsTest() {
        String courseId = null;
        List<Integer> userIds = null;
        List<Integer> outcomeIds = null;
        List<String> include = null;
        Boolean includeHidden = null;
        // api.getOutcomeResults(courseId, userIds, outcomeIds, include, includeHidden);

        // TODO: test validations
    }

    /**
     * Get outcome results
     *
     * Gets the outcome results for users and outcomes in the specified context.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getOutcomeResultsTestQueryMap() {
        String courseId = null;
        OutcomeResultsApi.GetOutcomeResultsQueryParams queryParams = new OutcomeResultsApi.GetOutcomeResultsQueryParams()
            .userIds(null)
            .outcomeIds(null)
            .include(null)
            .includeHidden(null);
        // api.getOutcomeResults(courseId, queryParams);

    // TODO: test validations
    }
}
