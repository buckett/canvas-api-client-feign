package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PollChoicesApi
 */
public class PollChoicesApiTest {

    private PollChoicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PollChoicesApi.class);
    }

    /**
     * Create a single poll choice
     *
     * Create a new poll choice for this poll
     */
    @Test
    public void createSinglePollChoiceTest() {
        String pollId = null;
        List<String> pollChoicesText = null;
        List<Boolean> pollChoicesIsCorrect = null;
        List<Integer> pollChoicesPosition = null;
        // api.createSinglePollChoice(pollId, pollChoicesText, pollChoicesIsCorrect, pollChoicesPosition);

        // TODO: test validations
    }

    /**
     * Delete a poll choice
     *
     * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deletePollChoiceTest() {
        String pollId = null;
        String id = null;
        // api.deletePollChoice(pollId, id);

        // TODO: test validations
    }

    /**
     * Get a single poll choice
     *
     * Returns the poll choice with the given id
     */
    @Test
    public void getSinglePollChoiceTest() {
        String pollId = null;
        String id = null;
        // api.getSinglePollChoice(pollId, id);

        // TODO: test validations
    }

    /**
     * List poll choices in a poll
     *
     * Returns the paginated list of PollChoices in this poll.
     */
    @Test
    public void listPollChoicesInPollTest() {
        String pollId = null;
        // api.listPollChoicesInPoll(pollId);

        // TODO: test validations
    }

    /**
     * Update a single poll choice
     *
     * Update an existing poll choice for this poll
     */
    @Test
    public void updateSinglePollChoiceTest() {
        String pollId = null;
        String id = null;
        List<String> pollChoicesText = null;
        List<Boolean> pollChoicesIsCorrect = null;
        List<Integer> pollChoicesPosition = null;
        // api.updateSinglePollChoice(pollId, id, pollChoicesText, pollChoicesIsCorrect, pollChoicesPosition);

        // TODO: test validations
    }

}
