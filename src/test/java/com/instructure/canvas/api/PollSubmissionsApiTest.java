package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PollSubmissionsApi
 */
public class PollSubmissionsApiTest {

    private PollSubmissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PollSubmissionsApi.class);
    }

    /**
     * Create a single poll submission
     *
     * Create a new poll submission for this poll session
     */
    @Test
    public void createSinglePollSubmissionTest() {
        String pollId = null;
        String pollSessionId = null;
        List<Integer> pollSubmissionsPollChoiceId = null;
        // api.createSinglePollSubmission(pollId, pollSessionId, pollSubmissionsPollChoiceId);

        // TODO: test validations
    }

    /**
     * Get a single poll submission
     *
     * Returns the poll submission with the given id
     */
    @Test
    public void getSinglePollSubmissionTest() {
        String pollId = null;
        String pollSessionId = null;
        String id = null;
        // api.getSinglePollSubmission(pollId, pollSessionId, id);

        // TODO: test validations
    }

}
