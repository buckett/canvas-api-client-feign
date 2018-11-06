package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Conference;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConferencesApi
 */
public class ConferencesApiTest {

    private ConferencesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ConferencesApi.class);
    }

    /**
     * List conferences
     *
     * Retrieve the paginated list of conferences for this context  This API returns a JSON object containing the list of conferences, the key for the list of conferences is \&quot;conferences\&quot;
     */
    @Test
    public void listConferencesCoursesTest() {
        String courseId = null;
        // List<Conference> response = api.listConferencesCourses(courseId);

        // TODO: test validations
    }

    /**
     * List conferences
     *
     * Retrieve the paginated list of conferences for this context  This API returns a JSON object containing the list of conferences, the key for the list of conferences is \&quot;conferences\&quot;
     */
    @Test
    public void listConferencesGroupsTest() {
        String groupId = null;
        // List<Conference> response = api.listConferencesGroups(groupId);

        // TODO: test validations
    }

}
