package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;


import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PlannerApi extends ApiClient.Api {

  /**
   * List planner items
   * Retrieve the paginated list of objects to be shown on the planner for the current user with the associated planner override to override an item&#x27;s visibility if set.  [   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true, // Whether or not it is displayed on the student planner     \&quot;planner_override\&quot;: { ... planner override object ... }, // Associated PlannerOverride object if user has toggled visibility for the object on the planner     \&quot;submissions\&quot;: false, // The statuses of the user&#x27;s submissions for this object     \&quot;plannable_id\&quot;: \&quot;123\&quot;,     \&quot;plannable_type\&quot;: \&quot;discussion_topic\&quot;,     \&quot;plannable\&quot;: { ... discussion topic object },     \&quot;html_url\&quot;: \&quot;/courses/1/discussion_topics/8\&quot;   },   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: {         \&quot;id\&quot;: 3,         \&quot;plannable_type\&quot;: \&quot;Assignment\&quot;,         \&quot;plannable_id\&quot;: 1,         \&quot;user_id\&quot;: 2,         \&quot;workflow_state\&quot;: \&quot;active\&quot;,         \&quot;marked_complete\&quot;: true, // A user-defined setting for marking items complete in the planner         \&quot;dismissed\&quot;: false, // A user-defined setting for hiding items from the opportunities list         \&quot;deleted_at\&quot;: null,         \&quot;created_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;,         \&quot;updated_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;     },     \&quot;submissions\&quot;: { // The status as it pertains to the current user       \&quot;excused\&quot;: false,       \&quot;graded\&quot;: false,       \&quot;late\&quot;: false,       \&quot;missing\&quot;: true,       \&quot;needs_grading\&quot;: false,       \&quot;with_feedback\&quot;: false     },     \&quot;plannable_id\&quot;: \&quot;456\&quot;,     \&quot;plannable_type\&quot;: \&quot;assignment\&quot;,     \&quot;plannable\&quot;: { ... assignment object ...  },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/courses/1/assignments/1#submit\&quot;   },   {     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: null,     \&quot;submissions\&quot;: false, // false if no associated assignment exists for the plannable item     \&quot;plannable_id\&quot;: \&quot;789\&quot;,     \&quot;plannable_type\&quot;: \&quot;planner_note\&quot;,     \&quot;plannable\&quot;: {       \&quot;id\&quot;: 1,       \&quot;todo_date\&quot;: \&quot;2017-05-30T06:00:00Z\&quot;,       \&quot;title\&quot;: \&quot;hello\&quot;,       \&quot;details\&quot;: \&quot;world\&quot;,       \&quot;user_id\&quot;: 2,       \&quot;course_id\&quot;: null,       \&quot;workflow_state\&quot;: \&quot;active\&quot;,       \&quot;created_at\&quot;: \&quot;2017-05-30T16:29:04Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2017-05-30T16:29:15Z\&quot;     },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/api/v1/planner_notes.1\&quot;   } ]
   * @param startDate Only return items starting from the given date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param endDate Only return items up to the given date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param contextCodes List of context codes of courses and/or groups whose items you want to see. If not specified, defaults to all contexts associated to the current user. Note that concluded courses will be ignored unless specified in the includes[] parameter. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42, group_123 (optional)
   * @param filter Only return items that have new or unread activity (optional)
   */
  @RequestLine("GET /v1/planner/items?start_date={startDate}&end_date={endDate}&context_codes={contextCodes}&filter={filter}")
  @Headers({
      "Accept: */*",
  })
  void listPlannerItems(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("contextCodes") List<String> contextCodes, @Param("filter") String filter);
  

  /**
   * List planner items
   * Retrieve the paginated list of objects to be shown on the planner for the current user with the associated planner override to override an item&#x27;s visibility if set.  [   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true, // Whether or not it is displayed on the student planner     \&quot;planner_override\&quot;: { ... planner override object ... }, // Associated PlannerOverride object if user has toggled visibility for the object on the planner     \&quot;submissions\&quot;: false, // The statuses of the user&#x27;s submissions for this object     \&quot;plannable_id\&quot;: \&quot;123\&quot;,     \&quot;plannable_type\&quot;: \&quot;discussion_topic\&quot;,     \&quot;plannable\&quot;: { ... discussion topic object },     \&quot;html_url\&quot;: \&quot;/courses/1/discussion_topics/8\&quot;   },   {     \&quot;context_type\&quot;: \&quot;Course\&quot;,     \&quot;course_id\&quot;: 1,     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: {         \&quot;id\&quot;: 3,         \&quot;plannable_type\&quot;: \&quot;Assignment\&quot;,         \&quot;plannable_id\&quot;: 1,         \&quot;user_id\&quot;: 2,         \&quot;workflow_state\&quot;: \&quot;active\&quot;,         \&quot;marked_complete\&quot;: true, // A user-defined setting for marking items complete in the planner         \&quot;dismissed\&quot;: false, // A user-defined setting for hiding items from the opportunities list         \&quot;deleted_at\&quot;: null,         \&quot;created_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;,         \&quot;updated_at\&quot;: \&quot;2017-05-18T18:35:55Z\&quot;     },     \&quot;submissions\&quot;: { // The status as it pertains to the current user       \&quot;excused\&quot;: false,       \&quot;graded\&quot;: false,       \&quot;late\&quot;: false,       \&quot;missing\&quot;: true,       \&quot;needs_grading\&quot;: false,       \&quot;with_feedback\&quot;: false     },     \&quot;plannable_id\&quot;: \&quot;456\&quot;,     \&quot;plannable_type\&quot;: \&quot;assignment\&quot;,     \&quot;plannable\&quot;: { ... assignment object ...  },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/courses/1/assignments/1#submit\&quot;   },   {     \&quot;visible_in_planner\&quot;: true,     \&quot;planner_override\&quot;: null,     \&quot;submissions\&quot;: false, // false if no associated assignment exists for the plannable item     \&quot;plannable_id\&quot;: \&quot;789\&quot;,     \&quot;plannable_type\&quot;: \&quot;planner_note\&quot;,     \&quot;plannable\&quot;: {       \&quot;id\&quot;: 1,       \&quot;todo_date\&quot;: \&quot;2017-05-30T06:00:00Z\&quot;,       \&quot;title\&quot;: \&quot;hello\&quot;,       \&quot;details\&quot;: \&quot;world\&quot;,       \&quot;user_id\&quot;: 2,       \&quot;course_id\&quot;: null,       \&quot;workflow_state\&quot;: \&quot;active\&quot;,       \&quot;created_at\&quot;: \&quot;2017-05-30T16:29:04Z\&quot;,       \&quot;updated_at\&quot;: \&quot;2017-05-30T16:29:15Z\&quot;     },     \&quot;html_url\&quot;: \&quot;http://canvas.instructure.com/api/v1/planner_notes.1\&quot;   } ]
   * Note, this is equivalent to the other <code>listPlannerItems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPlannerItemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startDate - Only return items starting from the given date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>endDate - Only return items up to the given date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>contextCodes - List of context codes of courses and/or groups whose items you want to see. If not specified, defaults to all contexts associated to the current user. Note that concluded courses will be ignored unless specified in the includes[] parameter. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42, group_123 (optional)</li>
   *   <li>filter - Only return items that have new or unread activity (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/planner/items?start_date={startDate}&end_date={endDate}&context_codes={contextCodes}&filter={filter}")
  @Headers({
      "Content-Type: */*",
  })
  void listPlannerItems(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPlannerItems</code> method in a fluent style.
   */
  public static class ListPlannerItemsQueryParams extends HashMap<String, Object> {
    public ListPlannerItemsQueryParams startDate(final String value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public ListPlannerItemsQueryParams endDate(final String value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public ListPlannerItemsQueryParams contextCodes(final List<String> value) {
      put("context_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListPlannerItemsQueryParams filter(final String value) {
      put("filter", EncodingUtils.encode(value));
      return this;
    }
  }
}
