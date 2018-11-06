package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.CommMessage;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommMessagesApi
 */
public class CommMessagesApiTest {

    private CommMessagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CommMessagesApi.class);
    }

    /**
     * List of CommMessages for a user
     *
     * Retrieve a paginated list of messages sent to a user.
     */
    @Test
    public void listOfCommmessagesForUserTest() {
        String userId = null;
        String startTime = null;
        String endTime = null;
        // List<CommMessage> response = api.listOfCommmessagesForUser(userId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * List of CommMessages for a user
     *
     * Retrieve a paginated list of messages sent to a user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listOfCommmessagesForUserTestQueryMap() {
        CommMessagesApi.ListOfCommmessagesForUserQueryParams queryParams = new CommMessagesApi.ListOfCommmessagesForUserQueryParams()
            .userId(null)
            .startTime(null)
            .endTime(null);
        // List<CommMessage> response = api.listOfCommmessagesForUser(queryParams);

    // TODO: test validations
    }
}
