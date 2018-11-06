package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizStatisticsApi
 */
public class QuizStatisticsApiTest {

    private QuizStatisticsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizStatisticsApi.class);
    }

    /**
     * Fetching the latest quiz statistics
     *
     * This endpoint provides statistics for all quiz versions, or for a specific quiz version, in which case the output is guaranteed to represent the _latest_ and most current version of the quiz.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     */
    @Test
    public void fetchingLatestQuizStatisticsTest() {
        String courseId = null;
        String quizId = null;
        Boolean allVersions = null;
        // api.fetchingLatestQuizStatistics(courseId, quizId, allVersions);

        // TODO: test validations
    }

    /**
     * Fetching the latest quiz statistics
     *
     * This endpoint provides statistics for all quiz versions, or for a specific quiz version, in which case the output is guaranteed to represent the _latest_ and most current version of the quiz.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void fetchingLatestQuizStatisticsTestQueryMap() {
        String courseId = null;
        String quizId = null;
        QuizStatisticsApi.FetchingLatestQuizStatisticsQueryParams queryParams = new QuizStatisticsApi.FetchingLatestQuizStatisticsQueryParams()
            .allVersions(null);
        // api.fetchingLatestQuizStatistics(courseId, quizId, queryParams);

    // TODO: test validations
    }
}
