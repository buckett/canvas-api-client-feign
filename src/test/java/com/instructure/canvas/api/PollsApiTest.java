package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PollsApi
 */
public class PollsApiTest {

    private PollsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PollsApi.class);
    }

    /**
     * Create a single poll
     *
     * Create a new poll for the current user
     */
    @Test
    public void createSinglePollTest() {
        List<String> pollsQuestion = null;
        List<String> pollsDescription = null;
        // api.createSinglePoll(pollsQuestion, pollsDescription);

        // TODO: test validations
    }

    /**
     * Delete a poll
     *
     * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deletePollTest() {
        String id = null;
        // api.deletePoll(id);

        // TODO: test validations
    }

    /**
     * Get a single poll
     *
     * Returns the poll with the given id
     */
    @Test
    public void getSinglePollTest() {
        String id = null;
        // api.getSinglePoll(id);

        // TODO: test validations
    }

    /**
     * List polls
     *
     * Returns the paginated list of polls for the current user.
     */
    @Test
    public void listPollsTest() {
        // api.listPolls();

        // TODO: test validations
    }

    /**
     * Update a single poll
     *
     * Update an existing poll belonging to the current user
     */
    @Test
    public void updateSinglePollTest() {
        String id = null;
        List<String> pollsQuestion = null;
        List<String> pollsDescription = null;
        // api.updateSinglePoll(id, pollsQuestion, pollsDescription);

        // TODO: test validations
    }

}
