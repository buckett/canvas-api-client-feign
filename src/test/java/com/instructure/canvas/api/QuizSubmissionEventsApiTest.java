package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizSubmissionEventsApi
 */
public class QuizSubmissionEventsApiTest {

    private QuizSubmissionEventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizSubmissionEventsApi.class);
    }

    /**
     * Retrieve captured events
     *
     * Retrieve the set of events captured during a specific submission attempt.
     */
    @Test
    public void retrieveCapturedEventsTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        Integer attempt = null;
        // api.retrieveCapturedEvents(courseId, quizId, id, attempt);

        // TODO: test validations
    }

    /**
     * Retrieve captured events
     *
     * Retrieve the set of events captured during a specific submission attempt.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void retrieveCapturedEventsTestQueryMap() {
        String courseId = null;
        String quizId = null;
        String id = null;
        QuizSubmissionEventsApi.RetrieveCapturedEventsQueryParams queryParams = new QuizSubmissionEventsApi.RetrieveCapturedEventsQueryParams()
            .attempt(null);
        // api.retrieveCapturedEvents(courseId, quizId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Submit captured events
     *
     * Store a set of events which were captured during a quiz taking session.  On success, the response will be 204 No Content with an empty body.
     */
    @Test
    public void submitCapturedEventsTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        List<List<Object>> quizSubmissionEvents = null;
        // api.submitCapturedEvents(courseId, quizId, id, quizSubmissionEvents);

        // TODO: test validations
    }

}
