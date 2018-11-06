package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.QuizAssignmentOverrideSetContainer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizAssignmentOverridesApi
 */
public class QuizAssignmentOverridesApiTest {

    private QuizAssignmentOverridesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizAssignmentOverridesApi.class);
    }

    /**
     * Retrieve assignment-overridden dates for quizzes
     *
     * Retrieve the actual due-at, unlock-at, and available-at dates for quizzes based on the assignment overrides active for the current API user.
     */
    @Test
    public void retrieveAssignmentOverriddenDatesForQuizzesTest() {
        String courseId = null;
        List<Integer> quizAssignmentOverrides0QuizIds = null;
        // QuizAssignmentOverrideSetContainer response = api.retrieveAssignmentOverriddenDatesForQuizzes(courseId, quizAssignmentOverrides0QuizIds);

        // TODO: test validations
    }

    /**
     * Retrieve assignment-overridden dates for quizzes
     *
     * Retrieve the actual due-at, unlock-at, and available-at dates for quizzes based on the assignment overrides active for the current API user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void retrieveAssignmentOverriddenDatesForQuizzesTestQueryMap() {
        String courseId = null;
        QuizAssignmentOverridesApi.RetrieveAssignmentOverriddenDatesForQuizzesQueryParams queryParams = new QuizAssignmentOverridesApi.RetrieveAssignmentOverriddenDatesForQuizzesQueryParams()
            .quizAssignmentOverrides0QuizIds(null);
        // QuizAssignmentOverrideSetContainer response = api.retrieveAssignmentOverriddenDatesForQuizzes(courseId, queryParams);

    // TODO: test validations
    }
}
