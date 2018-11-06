package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.DiscussionTopic;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnouncementsApi
 */
public class AnnouncementsApiTest {

    private AnnouncementsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AnnouncementsApi.class);
    }

    /**
     * List announcements
     *
     * Returns the paginated list of announcements for the given courses and date range.  Note that a +context_code+ field is added to the responses so you can tell which course each announcement belongs to.
     */
    @Test
    public void listAnnouncementsTest() {
        List<String> contextCodes = null;
        String startDate = null;
        String endDate = null;
        Boolean activeOnly = null;
        List<String> include = null;
        // List<DiscussionTopic> response = api.listAnnouncements(contextCodes, startDate, endDate, activeOnly, include);

        // TODO: test validations
    }

    /**
     * List announcements
     *
     * Returns the paginated list of announcements for the given courses and date range.  Note that a +context_code+ field is added to the responses so you can tell which course each announcement belongs to.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAnnouncementsTestQueryMap() {
        AnnouncementsApi.ListAnnouncementsQueryParams queryParams = new AnnouncementsApi.ListAnnouncementsQueryParams()
            .contextCodes(null)
            .startDate(null)
            .endDate(null)
            .activeOnly(null)
            .include(null);
        // List<DiscussionTopic> response = api.listAnnouncements(queryParams);

    // TODO: test validations
    }
}
