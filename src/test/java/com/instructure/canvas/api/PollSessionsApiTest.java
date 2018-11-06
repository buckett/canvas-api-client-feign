package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PollSessionsApi
 */
public class PollSessionsApiTest {

    private PollSessionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PollSessionsApi.class);
    }

    /**
     * Close an opened poll session
     *
     * 
     */
    @Test
    public void closeOpenedPollSessionTest() {
        String pollId = null;
        String id = null;
        // api.closeOpenedPollSession(pollId, id);

        // TODO: test validations
    }

    /**
     * Create a single poll session
     *
     * Create a new poll session for this poll
     */
    @Test
    public void createSinglePollSessionTest() {
        String pollId = null;
        List<Integer> pollSessionsCourseId = null;
        List<Integer> pollSessionsCourseSectionId = null;
        List<Boolean> pollSessionsHasPublicResults = null;
        // api.createSinglePollSession(pollId, pollSessionsCourseId, pollSessionsCourseSectionId, pollSessionsHasPublicResults);

        // TODO: test validations
    }

    /**
     * Delete a poll session
     *
     * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deletePollSessionTest() {
        String pollId = null;
        String id = null;
        // api.deletePollSession(pollId, id);

        // TODO: test validations
    }

    /**
     * Get the results for a single poll session
     *
     * Returns the poll session with the given id
     */
    @Test
    public void getResultsForSinglePollSessionTest() {
        String pollId = null;
        String id = null;
        // api.getResultsForSinglePollSession(pollId, id);

        // TODO: test validations
    }

    /**
     * List closed poll sessions
     *
     * A paginated list of all closed poll sessions available to the current user.
     */
    @Test
    public void listClosedPollSessionsTest() {
        // api.listClosedPollSessions();

        // TODO: test validations
    }

    /**
     * List opened poll sessions
     *
     * A paginated list of all opened poll sessions available to the current user.
     */
    @Test
    public void listOpenedPollSessionsTest() {
        // api.listOpenedPollSessions();

        // TODO: test validations
    }

    /**
     * List poll sessions for a poll
     *
     * Returns the paginated list of PollSessions in this poll.
     */
    @Test
    public void listPollSessionsForPollTest() {
        String pollId = null;
        // api.listPollSessionsForPoll(pollId);

        // TODO: test validations
    }

    /**
     * Open a poll session
     *
     * 
     */
    @Test
    public void openPollSessionTest() {
        String pollId = null;
        String id = null;
        // api.openPollSession(pollId, id);

        // TODO: test validations
    }

    /**
     * Update a single poll session
     *
     * Update an existing poll session for this poll
     */
    @Test
    public void updateSinglePollSessionTest() {
        String pollId = null;
        String id = null;
        List<Integer> pollSessionsCourseId = null;
        List<Integer> pollSessionsCourseSectionId = null;
        List<Boolean> pollSessionsHasPublicResults = null;
        // api.updateSinglePollSession(pollId, id, pollSessionsCourseId, pollSessionsCourseSectionId, pollSessionsHasPublicResults);

        // TODO: test validations
    }

}
