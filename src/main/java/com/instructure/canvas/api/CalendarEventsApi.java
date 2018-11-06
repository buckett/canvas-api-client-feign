package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import java.math.BigDecimal;
import com.instructure.canvas.model.CalendarEvent;
import org.threeten.bp.OffsetDateTime;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CalendarEventsApi extends ApiClient.Api {

  /**
   * Create a calendar event
   * Create and return a new calendar event
   * @param calendarEventContextCode  (optional)
   * @param calendarEventTitle  (optional)
   * @param calendarEventDescription  (optional)
   * @param calendarEventStartAt  (optional)
   * @param calendarEventEndAt  (optional)
   * @param calendarEventLocationName  (optional)
   * @param calendarEventLocationAddress  (optional)
   * @param calendarEventTimeZoneEdited  (optional)
   * @param calendarEventAllDay  (optional)
   * @param calendarEventChildEventDataXStartAt  (optional)
   * @param calendarEventChildEventDataXEndAt  (optional)
   * @param calendarEventChildEventDataXContextCode  (optional)
   * @param calendarEventDuplicateCount  (optional)
   * @param calendarEventDuplicateInterval  (optional)
   * @param calendarEventDuplicateFrequency  (optional)
   * @param calendarEventDuplicateAppendIterator  (optional)
   */
  @RequestLine("POST /v1/calendar_events")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createCalendarEvent(@Param("calendarEventContextCode") String calendarEventContextCode, @Param("calendarEventTitle") String calendarEventTitle, @Param("calendarEventDescription") String calendarEventDescription, @Param("calendarEventStartAt") String calendarEventStartAt, @Param("calendarEventEndAt") String calendarEventEndAt, @Param("calendarEventLocationName") String calendarEventLocationName, @Param("calendarEventLocationAddress") String calendarEventLocationAddress, @Param("calendarEventTimeZoneEdited") String calendarEventTimeZoneEdited, @Param("calendarEventAllDay") Boolean calendarEventAllDay, @Param("calendarEventChildEventDataXStartAt") String calendarEventChildEventDataXStartAt, @Param("calendarEventChildEventDataXEndAt") String calendarEventChildEventDataXEndAt, @Param("calendarEventChildEventDataXContextCode") String calendarEventChildEventDataXContextCode, @Param("calendarEventDuplicateCount") BigDecimal calendarEventDuplicateCount, @Param("calendarEventDuplicateInterval") BigDecimal calendarEventDuplicateInterval, @Param("calendarEventDuplicateFrequency") String calendarEventDuplicateFrequency, @Param("calendarEventDuplicateAppendIterator") Boolean calendarEventDuplicateAppendIterator);
  
  /**
   * Create or update events directly for a course timetable
   * Creates and updates \&quot;timetable\&quot; events for a course or course section. Similar to {api:CalendarEventsApiController#set_course_timetable setting a course timetable}, but instead of generating a list of events based on a timetable schedule, this endpoint expects a complete list of events.
   * @param courseId ID (required)
   * @param courseSectionId  (optional)
   * @param events  (optional)
   * @param eventsStartAt  (optional)
   * @param eventsEndAt  (optional)
   * @param eventsLocationName  (optional)
   * @param eventsCode  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/calendar_events/timetable_events")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createOrUpdateEventsDirectlyForCourseTimetable(@Param("courseId") String courseId, @Param("courseSectionId") String courseSectionId, @Param("events") List<List<Object>> events, @Param("eventsStartAt") List<OffsetDateTime> eventsStartAt, @Param("eventsEndAt") List<OffsetDateTime> eventsEndAt, @Param("eventsLocationName") List<String> eventsLocationName, @Param("eventsCode") List<String> eventsCode);
  
  /**
   * Delete a calendar event
   * Delete an event from the calendar and return the deleted event
   * @param id ID (required)
   * @param cancelReason Reason for deleting/canceling the event. (optional)
   */
  @RequestLine("DELETE /v1/calendar_events/{id}?cancel_reason={cancelReason}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteCalendarEvent(@Param("id") String id, @Param("cancelReason") String cancelReason);
  

  /**
   * Delete a calendar event
   * Delete an event from the calendar and return the deleted event
   * Note, this is equivalent to the other <code>deleteCalendarEvent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCalendarEventQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>cancelReason - Reason for deleting/canceling the event. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/calendar_events/{id}?cancel_reason={cancelReason}")
  @Headers({
      "Content-Type: application/json",
  })
  void deleteCalendarEvent(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteCalendarEvent</code> method in a fluent style.
   */
  public static class DeleteCalendarEventQueryParams extends HashMap<String, Object> {
    public DeleteCalendarEventQueryParams cancelReason(final String value) {
      put("cancel_reason", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get course timetable
   * Returns the last timetable set by the {api:CalendarEventsApiController#set_course_timetable Set a course timetable} endpoint
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/calendar_events/timetable")
  @Headers({
      "Accept: */*",
  })
  void getCourseTimetable(@Param("courseId") String courseId);
  
  /**
   * Get a single calendar event or assignment
   * 
   * @param id ID (required)
   * @return CalendarEvent
   */
  @RequestLine("GET /v1/calendar_events/{id}")
  @Headers({
      "Accept: application/json",
  })
  CalendarEvent getSingleCalendarEventOrAssignment(@Param("id") String id);
  
  /**
   * List calendar events
   * Retrieve the paginated list of calendar events or assignments for the current user
   * @param type Defaults to \&quot;event\&quot; (optional)
   * @param startDate Only return events since the start_date (inclusive). Defaults to today. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param endDate Only return events before the end_date (inclusive). Defaults to start_date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. If end_date is the same as start_date, then only events on that day are returned. (optional)
   * @param undated Defaults to false (dated events only). If true, only return undated events and ignore start_date and end_date. (optional)
   * @param allEvents Defaults to false (uses start_date, end_date, and undated criteria). If true, all events are returned, ignoring start_date, end_date, and undated criteria. (optional)
   * @param contextCodes List of context codes of courses/groups/users whose events you want to see. If not specified, defaults to the current user (i.e personal calendar, no course/group events). Limited to 10 context codes, additional ones are ignored. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42 (optional)
   * @param excludes Array of attributes to exclude. Possible values are \&quot;description\&quot;, \&quot;child_events\&quot; and \&quot;assignment\&quot; (optional)
   * @return List&lt;CalendarEvent&gt;
   */
  @RequestLine("GET /v1/calendar_events?type={type}&start_date={startDate}&end_date={endDate}&undated={undated}&all_events={allEvents}&context_codes={contextCodes}&excludes={excludes}")
  @Headers({
      "Accept: application/json",
  })
  List<CalendarEvent> listCalendarEvents(@Param("type") String type, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("undated") Boolean undated, @Param("allEvents") Boolean allEvents, @Param("contextCodes") List<String> contextCodes, @Param("excludes") List<List<Object>> excludes);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CalendarEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CalendarEvent> listCalendarEvents(URI uri);
  

  /**
   * List calendar events
   * Retrieve the paginated list of calendar events or assignments for the current user
   * Note, this is equivalent to the other <code>listCalendarEvents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCalendarEventsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>type - Defaults to \&quot;event\&quot; (optional)</li>
   *   <li>startDate - Only return events since the start_date (inclusive). Defaults to today. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>endDate - Only return events before the end_date (inclusive). Defaults to start_date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. If end_date is the same as start_date, then only events on that day are returned. (optional)</li>
   *   <li>undated - Defaults to false (dated events only). If true, only return undated events and ignore start_date and end_date. (optional)</li>
   *   <li>allEvents - Defaults to false (uses start_date, end_date, and undated criteria). If true, all events are returned, ignoring start_date, end_date, and undated criteria. (optional)</li>
   *   <li>contextCodes - List of context codes of courses/groups/users whose events you want to see. If not specified, defaults to the current user (i.e personal calendar, no course/group events). Limited to 10 context codes, additional ones are ignored. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42 (optional)</li>
   *   <li>excludes - Array of attributes to exclude. Possible values are \&quot;description\&quot;, \&quot;child_events\&quot; and \&quot;assignment\&quot; (optional)</li>
   *   </ul>
   * @return List&lt;CalendarEvent&gt;

   */
  @RequestLine("GET /v1/calendar_events?type={type}&start_date={startDate}&end_date={endDate}&undated={undated}&all_events={allEvents}&context_codes={contextCodes}&excludes={excludes}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<CalendarEvent> listCalendarEvents(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCalendarEvents</code> method in a fluent style.
   */
  public static class ListCalendarEventsQueryParams extends HashMap<String, Object> {
    public ListCalendarEventsQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsQueryParams startDate(final String value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsQueryParams endDate(final String value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsQueryParams undated(final Boolean value) {
      put("undated", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsQueryParams allEvents(final Boolean value) {
      put("all_events", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsQueryParams contextCodes(final List<String> value) {
      put("context_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListCalendarEventsQueryParams excludes(final List<List<Object>> value) {
      put("excludes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List calendar events for a user
   * Retrieve the paginated list of calendar events or assignments for the specified user. To view calendar events for a user other than yourself, you must either be an observer of that user or an administrator.
   * @param userId ID (required)
   * @param type Defaults to \&quot;event\&quot; (optional)
   * @param startDate Only return events since the start_date (inclusive). Defaults to today. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param endDate Only return events before the end_date (inclusive). Defaults to start_date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. If end_date is the same as start_date, then only events on that day are returned. (optional)
   * @param undated Defaults to false (dated events only). If true, only return undated events and ignore start_date and end_date. (optional)
   * @param allEvents Defaults to false (uses start_date, end_date, and undated criteria). If true, all events are returned, ignoring start_date, end_date, and undated criteria. (optional)
   * @param contextCodes List of context codes of courses/groups/users whose events you want to see. If not specified, defaults to the current user (i.e personal calendar, no course/group events). Limited to 10 context codes, additional ones are ignored. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42 (optional)
   * @param excludes Array of attributes to exclude. Possible values are \&quot;description\&quot;, \&quot;child_events\&quot; and \&quot;assignment\&quot; (optional)
   * @return List&lt;CalendarEvent&gt;
   */
  @RequestLine("GET /v1/users/{userId}/calendar_events?type={type}&start_date={startDate}&end_date={endDate}&undated={undated}&all_events={allEvents}&context_codes={contextCodes}&excludes={excludes}")
  @Headers({
      "Accept: application/json",
  })
  List<CalendarEvent> listCalendarEventsForUser(@Param("userId") String userId, @Param("type") String type, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("undated") Boolean undated, @Param("allEvents") Boolean allEvents, @Param("contextCodes") List<String> contextCodes, @Param("excludes") List<List<Object>> excludes);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CalendarEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CalendarEvent> listCalendarEventsForUser(URI uri);
  

  /**
   * List calendar events for a user
   * Retrieve the paginated list of calendar events or assignments for the specified user. To view calendar events for a user other than yourself, you must either be an observer of that user or an administrator.
   * Note, this is equivalent to the other <code>listCalendarEventsForUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCalendarEventsForUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>type - Defaults to \&quot;event\&quot; (optional)</li>
   *   <li>startDate - Only return events since the start_date (inclusive). Defaults to today. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>endDate - Only return events before the end_date (inclusive). Defaults to start_date. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. If end_date is the same as start_date, then only events on that day are returned. (optional)</li>
   *   <li>undated - Defaults to false (dated events only). If true, only return undated events and ignore start_date and end_date. (optional)</li>
   *   <li>allEvents - Defaults to false (uses start_date, end_date, and undated criteria). If true, all events are returned, ignoring start_date, end_date, and undated criteria. (optional)</li>
   *   <li>contextCodes - List of context codes of courses/groups/users whose events you want to see. If not specified, defaults to the current user (i.e personal calendar, no course/group events). Limited to 10 context codes, additional ones are ignored. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42 (optional)</li>
   *   <li>excludes - Array of attributes to exclude. Possible values are \&quot;description\&quot;, \&quot;child_events\&quot; and \&quot;assignment\&quot; (optional)</li>
   *   </ul>
   * @return List&lt;CalendarEvent&gt;

   */
  @RequestLine("GET /v1/users/{userId}/calendar_events?type={type}&start_date={startDate}&end_date={endDate}&undated={undated}&all_events={allEvents}&context_codes={contextCodes}&excludes={excludes}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<CalendarEvent> listCalendarEventsForUser(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCalendarEventsForUser</code> method in a fluent style.
   */
  public static class ListCalendarEventsForUserQueryParams extends HashMap<String, Object> {
    public ListCalendarEventsForUserQueryParams type(final String value) {
      put("type", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsForUserQueryParams startDate(final String value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsForUserQueryParams endDate(final String value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsForUserQueryParams undated(final Boolean value) {
      put("undated", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsForUserQueryParams allEvents(final Boolean value) {
      put("all_events", EncodingUtils.encode(value));
      return this;
    }
    public ListCalendarEventsForUserQueryParams contextCodes(final List<String> value) {
      put("context_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListCalendarEventsForUserQueryParams excludes(final List<List<Object>> value) {
      put("excludes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Reserve a time slot
   * Reserves a particular time slot and return the new reservation
   * @param id ID (required)
   * @param participantId  (optional)
   * @param comments  (optional)
   * @param cancelExisting  (optional)
   */
  @RequestLine("POST /v1/calendar_events/{id}/reservations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reserveTimeSlot(@Param("id") String id, @Param("participantId") String participantId, @Param("comments") String comments, @Param("cancelExisting") Boolean cancelExisting);
  
  /**
   * Reserve a time slot
   * Reserves a particular time slot and return the new reservation
   * @param id ID (required)
   * @param participantId User or group id for whom you are making the reservation (depends on the participant type). Defaults to the current user (or user&#x27;s candidate group). (required)
   * @param comments  (optional)
   * @param cancelExisting  (optional)
   */
  @RequestLine("POST /v1/calendar_events/{id}/reservations/{participantId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reserveTimeSlotParticipantId(@Param("id") String id, @Param("participantId") String participantId, @Param("comments") String comments, @Param("cancelExisting") Boolean cancelExisting);
  
  /**
   * Set a course timetable
   * Creates and updates \&quot;timetable\&quot; events for a course. Can automaticaly generate a series of calendar events based on simple schedules (e.g. \&quot;Monday and Wednesday at 2:00pm\&quot; )  Existing timetable events for the course and course sections will be updated if they still are part of the timetable. Otherwise, they will be deleted.
   * @param courseId ID (required)
   * @param timetablesCourseSectionId  (optional)
   * @param timetablesCourseSectionIdWeekdays  (optional)
   * @param timetablesCourseSectionIdStartTime  (optional)
   * @param timetablesCourseSectionIdEndTime  (optional)
   * @param timetablesCourseSectionIdLocationName  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/calendar_events/timetable")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void setCourseTimetable(@Param("courseId") String courseId, @Param("timetablesCourseSectionId") List<List<Object>> timetablesCourseSectionId, @Param("timetablesCourseSectionIdWeekdays") List<String> timetablesCourseSectionIdWeekdays, @Param("timetablesCourseSectionIdStartTime") List<String> timetablesCourseSectionIdStartTime, @Param("timetablesCourseSectionIdEndTime") List<String> timetablesCourseSectionIdEndTime, @Param("timetablesCourseSectionIdLocationName") List<String> timetablesCourseSectionIdLocationName);
  
  /**
   * Update a calendar event
   * Update and return a calendar event
   * @param id ID (required)
   * @param calendarEventContextCode  (optional)
   * @param calendarEventTitle  (optional)
   * @param calendarEventDescription  (optional)
   * @param calendarEventStartAt  (optional)
   * @param calendarEventEndAt  (optional)
   * @param calendarEventLocationName  (optional)
   * @param calendarEventLocationAddress  (optional)
   * @param calendarEventTimeZoneEdited  (optional)
   * @param calendarEventAllDay  (optional)
   * @param calendarEventChildEventDataXStartAt  (optional)
   * @param calendarEventChildEventDataXEndAt  (optional)
   * @param calendarEventChildEventDataXContextCode  (optional)
   */
  @RequestLine("PUT /v1/calendar_events/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateCalendarEvent(@Param("id") String id, @Param("calendarEventContextCode") String calendarEventContextCode, @Param("calendarEventTitle") String calendarEventTitle, @Param("calendarEventDescription") String calendarEventDescription, @Param("calendarEventStartAt") String calendarEventStartAt, @Param("calendarEventEndAt") String calendarEventEndAt, @Param("calendarEventLocationName") String calendarEventLocationName, @Param("calendarEventLocationAddress") String calendarEventLocationAddress, @Param("calendarEventTimeZoneEdited") String calendarEventTimeZoneEdited, @Param("calendarEventAllDay") Boolean calendarEventAllDay, @Param("calendarEventChildEventDataXStartAt") String calendarEventChildEventDataXStartAt, @Param("calendarEventChildEventDataXEndAt") String calendarEventChildEventDataXEndAt, @Param("calendarEventChildEventDataXContextCode") String calendarEventChildEventDataXContextCode);
  
}
