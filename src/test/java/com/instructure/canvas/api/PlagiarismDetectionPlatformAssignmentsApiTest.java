package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.LtiAssignment;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlagiarismDetectionPlatformAssignmentsApi
 */
public class PlagiarismDetectionPlatformAssignmentsApiTest {

    private PlagiarismDetectionPlatformAssignmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PlagiarismDetectionPlatformAssignmentsApi.class);
    }

    /**
     * Get a single assignment (lti)
     *
     * Get a single Canvas assignment by Canvas id or LTI id. Tool providers may only access assignments that are associated with their tool.
     */
    @Test
    public void getSingleAssignmentLtiTest() {
        String assignmentId = null;
        String userId = null;
        // LtiAssignment response = api.getSingleAssignmentLti(assignmentId, userId);

        // TODO: test validations
    }

    /**
     * Get a single assignment (lti)
     *
     * Get a single Canvas assignment by Canvas id or LTI id. Tool providers may only access assignments that are associated with their tool.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleAssignmentLtiTestQueryMap() {
        String assignmentId = null;
        PlagiarismDetectionPlatformAssignmentsApi.GetSingleAssignmentLtiQueryParams queryParams = new PlagiarismDetectionPlatformAssignmentsApi.GetSingleAssignmentLtiQueryParams()
            .userId(null);
        // LtiAssignment response = api.getSingleAssignmentLti(assignmentId, queryParams);

    // TODO: test validations
    }
}
