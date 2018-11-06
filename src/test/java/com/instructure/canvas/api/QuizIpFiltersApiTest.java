package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizIpFiltersApi
 */
public class QuizIpFiltersApiTest {

    private QuizIpFiltersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizIpFiltersApi.class);
    }

    /**
     * Get available quiz IP filters.
     *
     * Get a list of available IP filters for this Quiz.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     */
    @Test
    public void getAvailableQuizIpFiltersTest() {
        String courseId = null;
        String quizId = null;
        // api.getAvailableQuizIpFilters(courseId, quizId);

        // TODO: test validations
    }

}
