package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlannerApi
 */
public class PlannerApiTest {

    private PlannerApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PlannerApi.class);
    }

    /**
     * List planner items
     *
     * Retrieve the paginated list of objects to be shown on the planner for the current user with the associated planner override to override an item&#x27;s visibility if set.  [   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true, // Whether or not it is displayed on the student planner     \&quot;planner_override\&quot;: { ... planner override object ... }, // Associated PlannerOverride object if user has toggled visibility for the object on the planner     \&quot;submissions\&quot;: false, // The statuses of the user&#x27;s submissions for this object     \&quot;plannable_id\&quot;: \&quot;123\&quot;,     \&quot;plannable_type\&quot;: \&quot;discussion_topic\&quot;,     \&quot;plannable\&quot;: { ... discussion topic object },     \&quot;html_url\&quot;: \&quot;/courses/1/discussion_topics/8\&quot;   },   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: {         \&quot;id\&quot;: 3,         \&quot;plannable_type\&quot;: \&quot;Assignment\&quot;,         \&quot;plannable_id\&quot;: 1,         \&quot;user_id\&quot;: 2,         \&quot;workflow_state\&quot;: \&quot;active\&quot;,         \&quot;marked_complete\&quot;: true, // A user-defined setting for marking items complete in the planner         \&quot;dismissed\&quot;: false, // A user-defined setting for hiding items from the opportunities list         \&quot;deleted_at\&quot;: null,         \&quot;created_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;,         \&quot;updated_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;     },     \&quot;submissions\&quot;: { // The status as it pertains to the current user       \&quot;excused\&quot;: false,       \&quot;graded\&quot;: false,       \&quot;late\&quot;: false,       \&quot;missing\&quot;: true,       \&quot;needs_grading\&quot;: false,       \&quot;with_feedback\&quot;: false     },     \&quot;plannable_id\&quot;: \&quot;456\&quot;,     \&quot;plannable_type\&quot;: \&quot;assignment\&quot;,     \&quot;plannable\&quot;: { ... assignment object ...  },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/courses/1/assignments/1#submit\&quot;   },   {     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: null,     \&quot;submissions\&quot;: false, // false if no associated assignment exists for the plannable item     \&quot;plannable_id\&quot;: \&quot;789\&quot;,     \&quot;plannable_type\&quot;: \&quot;planner_note\&quot;,     \&quot;plannable\&quot;: {       \&quot;id\&quot;: 1,       \&quot;todo_date\&quot;: \&quot;2017-05-30T06:00:00Z\&quot;,       \&quot;title\&quot;: \&quot;hello\&quot;,       \&quot;details\&quot;: \&quot;world\&quot;,       \&quot;user_id\&quot;: 2,       \&quot;course_id\&quot;: null,       \&quot;workflow_state\&quot;: \&quot;active\&quot;,       \&quot;created_at\&quot;: \&quot;2017-05-30T16:29:04Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2017-05-30T16:29:15Z\&quot;     },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/api/v1/planner_notes.1\&quot;   } ]
     */
    @Test
    public void listPlannerItemsTest() {
        String startDate = null;
        String endDate = null;
        List<String> contextCodes = null;
        String filter = null;
        // api.listPlannerItems(startDate, endDate, contextCodes, filter);

        // TODO: test validations
    }

    /**
     * List planner items
     *
     * Retrieve the paginated list of objects to be shown on the planner for the current user with the associated planner override to override an item&#x27;s visibility if set.  [   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true, // Whether or not it is displayed on the student planner     \&quot;planner_override\&quot;: { ... planner override object ... }, // Associated PlannerOverride object if user has toggled visibility for the object on the planner     \&quot;submissions\&quot;: false, // The statuses of the user&#x27;s submissions for this object     \&quot;plannable_id\&quot;: \&quot;123\&quot;,     \&quot;plannable_type\&quot;: \&quot;discussion_topic\&quot;,     \&quot;plannable\&quot;: { ... discussion topic object },     \&quot;html_url\&quot;: \&quot;/courses/1/discussion_topics/8\&quot;   },   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: {         \&quot;id\&quot;: 3,         \&quot;plannable_type\&quot;: \&quot;Assignment\&quot;,         \&quot;plannable_id\&quot;: 1,         \&quot;user_id\&quot;: 2,         \&quot;workflow_state\&quot;: \&quot;active\&quot;,         \&quot;marked_complete\&quot;: true, // A user-defined setting for marking items complete in the planner         \&quot;dismissed\&quot;: false, // A user-defined setting for hiding items from the opportunities list         \&quot;deleted_at\&quot;: null,         \&quot;created_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;,         \&quot;updated_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;     },     \&quot;submissions\&quot;: { // The status as it pertains to the current user       \&quot;excused\&quot;: false,       \&quot;graded\&quot;: false,       \&quot;late\&quot;: false,       \&quot;missing\&quot;: true,       \&quot;needs_grading\&quot;: false,       \&quot;with_feedback\&quot;: false     },     \&quot;plannable_id\&quot;: \&quot;456\&quot;,     \&quot;plannable_type\&quot;: \&quot;assignment\&quot;,     \&quot;plannable\&quot;: { ... assignment object ...  },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/courses/1/assignments/1#submit\&quot;   },   {     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: null,     \&quot;submissions\&quot;: false, // false if no associated assignment exists for the plannable item     \&quot;plannable_id\&quot;: \&quot;789\&quot;,     \&quot;plannable_type\&quot;: \&quot;planner_note\&quot;,     \&quot;plannable\&quot;: {       \&quot;id\&quot;: 1,       \&quot;todo_date\&quot;: \&quot;2017-05-30T06:00:00Z\&quot;,       \&quot;title\&quot;: \&quot;hello\&quot;,       \&quot;details\&quot;: \&quot;world\&quot;,       \&quot;user_id\&quot;: 2,       \&quot;course_id\&quot;: null,       \&quot;workflow_state\&quot;: \&quot;active\&quot;,       \&quot;created_at\&quot;: \&quot;2017-05-30T16:29:04Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2017-05-30T16:29:15Z\&quot;     },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/api/v1/planner_notes.1\&quot;   } ]
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPlannerItemsTestQueryMap() {
        PlannerApi.ListPlannerItemsQueryParams queryParams = new PlannerApi.ListPlannerItemsQueryParams()
            .startDate(null)
            .endDate(null)
            .contextCodes(null)
            .filter(null);
        // api.listPlannerItems(queryParams);

    // TODO: test validations
    }
}
