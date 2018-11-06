package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlagiarismDetectionSubmissionsApi
 */
public class PlagiarismDetectionSubmissionsApiTest {

    private PlagiarismDetectionSubmissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PlagiarismDetectionSubmissionsApi.class);
    }

    /**
     * Get the history of a single submission
     *
     * Get a list of all attempts made for a submission, based on submission id.
     */
    @Test
    public void getHistoryOfSingleSubmissionTest() {
        String assignmentId = null;
        String submissionId = null;
        // api.getHistoryOfSingleSubmission(assignmentId, submissionId);

        // TODO: test validations
    }

    /**
     * Get a single submission
     *
     * Get a single submission, based on submission id.
     */
    @Test
    public void getSingleSubmissionTest() {
        String assignmentId = null;
        String submissionId = null;
        // api.getSingleSubmission(assignmentId, submissionId);

        // TODO: test validations
    }

}
