package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.DiscussionTopic;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AnnouncementsApi extends ApiClient.Api {

  /**
   * List announcements
   * Returns the paginated list of announcements for the given courses and date range.  Note that a +context_code+ field is added to the responses so you can tell which course each announcement belongs to.
   * @param contextCodes List of context_codes to retrieve announcements for (for example, +course_123+). Only courses are presently supported. The call will fail unless the caller has View Announcements permission in all listed courses. (required)
   * @param startDate Only return announcements posted since the start_date (inclusive). Defaults to 14 days ago. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param endDate Only return announcements posted before the end_date (inclusive). Defaults to 28 days from start_date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. Announcements scheduled for future posting will only be returned to course administrators. (optional)
   * @param activeOnly Only return active announcements that have been published. Applies only to requesting users that have permission to view unpublished items. Defaults to false for users with access to view unpublished items, otherwise true and unmodifiable. (optional)
   * @param include Optional list of resources to include with the response. May include a string of the name of the resource. Possible values are: \&quot;sections\&quot;, \&quot;sections_user_count\&quot; if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to sertain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. (optional)
   * @return List&lt;DiscussionTopic&gt;
   */
  @RequestLine("GET /v1/announcements?context_codes={contextCodes}&start_date={startDate}&end_date={endDate}&active_only={activeOnly}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<DiscussionTopic> listAnnouncements(@Param("contextCodes") List<String> contextCodes, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("activeOnly") Boolean activeOnly, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;DiscussionTopic&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<DiscussionTopic> listAnnouncements(URI uri);
  

  /**
   * List announcements
   * Returns the paginated list of announcements for the given courses and date range.  Note that a +context_code+ field is added to the responses so you can tell which course each announcement belongs to.
   * Note, this is equivalent to the other <code>listAnnouncements</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAnnouncementsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>contextCodes - List of context_codes to retrieve announcements for (for example, +course_123+). Only courses are presently supported. The call will fail unless the caller has View Announcements permission in all listed courses. (required)</li>
   *   <li>startDate - Only return announcements posted since the start_date (inclusive). Defaults to 14 days ago. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>endDate - Only return announcements posted before the end_date (inclusive). Defaults to 28 days from start_date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. Announcements scheduled for future posting will only be returned to course administrators. (optional)</li>
   *   <li>activeOnly - Only return active announcements that have been published. Applies only to requesting users that have permission to view unpublished items. Defaults to false for users with access to view unpublished items, otherwise true and unmodifiable. (optional)</li>
   *   <li>include - Optional list of resources to include with the response. May include a string of the name of the resource. Possible values are: \&quot;sections\&quot;, \&quot;sections_user_count\&quot; if \&quot;sections\&quot; is passed, includes the course sections that are associated with the topic, if the topic is specific to sertain sections of the course. If \&quot;sections_user_count\&quot; is passed, then:   (a) If sections were asked for *and* the topic is specific to certain       course sections sections, includes the number of users in each       section. (as part of the section json asked for above)   (b) Else, includes at the root level the total number of users in the       topic&#x27;s context (group or course) that the topic applies to. (optional)</li>
   *   </ul>
   * @return List&lt;DiscussionTopic&gt;

   */
  @RequestLine("GET /v1/announcements?context_codes={contextCodes}&start_date={startDate}&end_date={endDate}&active_only={activeOnly}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<DiscussionTopic> listAnnouncements(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAnnouncements</code> method in a fluent style.
   */
  public static class ListAnnouncementsQueryParams extends HashMap<String, Object> {
    public ListAnnouncementsQueryParams contextCodes(final List<String> value) {
      put("context_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAnnouncementsQueryParams startDate(final String value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public ListAnnouncementsQueryParams endDate(final String value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public ListAnnouncementsQueryParams activeOnly(final Boolean value) {
      put("active_only", EncodingUtils.encode(value));
      return this;
    }
    public ListAnnouncementsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
}
