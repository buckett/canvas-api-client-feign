package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlagiarismDetectionPlatformUsersApi
 */
public class PlagiarismDetectionPlatformUsersApiTest {

    private PlagiarismDetectionPlatformUsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PlagiarismDetectionPlatformUsersApi.class);
    }

    /**
     * Get all users in a group (lti)
     *
     * Get all Canvas users in a group. Tool providers may only access groups that belong to the context the tool is installed in.
     */
    @Test
    public void getAllUsersInGroupLtiTest() {
        String groupId = null;
        // List<User> response = api.getAllUsersInGroupLti(groupId);

        // TODO: test validations
    }

    /**
     * Get a single user (lti)
     *
     * Get a single Canvas user by Canvas id or LTI id. Tool providers may only access users that have been assigned an assignment associated with their tool.
     */
    @Test
    public void getSingleUserLtiTest() {
        String id = null;
        // User response = api.getSingleUserLti(id);

        // TODO: test validations
    }

}
