package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import com.instructure.canvas.model.CalendarEvent;
import org.threeten.bp.OffsetDateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarEventsApi
 */
public class CalendarEventsApiTest {

    private CalendarEventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CalendarEventsApi.class);
    }

    /**
     * Create a calendar event
     *
     * Create and return a new calendar event
     */
    @Test
    public void createCalendarEventTest() {
        String calendarEventContextCode = null;
        String calendarEventTitle = null;
        String calendarEventDescription = null;
        String calendarEventStartAt = null;
        String calendarEventEndAt = null;
        String calendarEventLocationName = null;
        String calendarEventLocationAddress = null;
        String calendarEventTimeZoneEdited = null;
        Boolean calendarEventAllDay = null;
        String calendarEventChildEventDataXStartAt = null;
        String calendarEventChildEventDataXEndAt = null;
        String calendarEventChildEventDataXContextCode = null;
        BigDecimal calendarEventDuplicateCount = null;
        BigDecimal calendarEventDuplicateInterval = null;
        String calendarEventDuplicateFrequency = null;
        Boolean calendarEventDuplicateAppendIterator = null;
        // api.createCalendarEvent(calendarEventContextCode, calendarEventTitle, calendarEventDescription, calendarEventStartAt, calendarEventEndAt, calendarEventLocationName, calendarEventLocationAddress, calendarEventTimeZoneEdited, calendarEventAllDay, calendarEventChildEventDataXStartAt, calendarEventChildEventDataXEndAt, calendarEventChildEventDataXContextCode, calendarEventDuplicateCount, calendarEventDuplicateInterval, calendarEventDuplicateFrequency, calendarEventDuplicateAppendIterator);

        // TODO: test validations
    }

    /**
     * Create or update events directly for a course timetable
     *
     * Creates and updates \&quot;timetable\&quot; events for a course or course section. Similar to {api:CalendarEventsApiController#set_course_timetable setting a course timetable}, but instead of generating a list of events based on a timetable schedule, this endpoint expects a complete list of events.
     */
    @Test
    public void createOrUpdateEventsDirectlyForCourseTimetableTest() {
        String courseId = null;
        String courseSectionId = null;
        List<List<Object>> events = null;
        List<OffsetDateTime> eventsStartAt = null;
        List<OffsetDateTime> eventsEndAt = null;
        List<String> eventsLocationName = null;
        List<String> eventsCode = null;
        // api.createOrUpdateEventsDirectlyForCourseTimetable(courseId, courseSectionId, events, eventsStartAt, eventsEndAt, eventsLocationName, eventsCode);

        // TODO: test validations
    }

    /**
     * Delete a calendar event
     *
     * Delete an event from the calendar and return the deleted event
     */
    @Test
    public void deleteCalendarEventTest() {
        String id = null;
        String cancelReason = null;
        // api.deleteCalendarEvent(id, cancelReason);

        // TODO: test validations
    }

    /**
     * Delete a calendar event
     *
     * Delete an event from the calendar and return the deleted event
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteCalendarEventTestQueryMap() {
        String id = null;
        CalendarEventsApi.DeleteCalendarEventQueryParams queryParams = new CalendarEventsApi.DeleteCalendarEventQueryParams()
            .cancelReason(null);
        // api.deleteCalendarEvent(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get course timetable
     *
     * Returns the last timetable set by the {api:CalendarEventsApiController#set_course_timetable Set a course timetable} endpoint
     */
    @Test
    public void getCourseTimetableTest() {
        String courseId = null;
        // api.getCourseTimetable(courseId);

        // TODO: test validations
    }

    /**
     * Get a single calendar event or assignment
     *
     * 
     */
    @Test
    public void getSingleCalendarEventOrAssignmentTest() {
        String id = null;
        // CalendarEvent response = api.getSingleCalendarEventOrAssignment(id);

        // TODO: test validations
    }

    /**
     * List calendar events
     *
     * Retrieve the paginated list of calendar events or assignments for the current user
     */
    @Test
    public void listCalendarEventsTest() {
        String type = null;
        String startDate = null;
        String endDate = null;
        Boolean undated = null;
        Boolean allEvents = null;
        List<String> contextCodes = null;
        List<List<Object>> excludes = null;
        // List<CalendarEvent> response = api.listCalendarEvents(type, startDate, endDate, undated, allEvents, contextCodes, excludes);

        // TODO: test validations
    }

    /**
     * List calendar events
     *
     * Retrieve the paginated list of calendar events or assignments for the current user
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCalendarEventsTestQueryMap() {
        CalendarEventsApi.ListCalendarEventsQueryParams queryParams = new CalendarEventsApi.ListCalendarEventsQueryParams()
            .type(null)
            .startDate(null)
            .endDate(null)
            .undated(null)
            .allEvents(null)
            .contextCodes(null)
            .excludes(null);
        // List<CalendarEvent> response = api.listCalendarEvents(queryParams);

    // TODO: test validations
    }
    /**
     * List calendar events for a user
     *
     * Retrieve the paginated list of calendar events or assignments for the specified user. To view calendar events for a user other than yourself, you must either be an observer of that user or an administrator.
     */
    @Test
    public void listCalendarEventsForUserTest() {
        String userId = null;
        String type = null;
        String startDate = null;
        String endDate = null;
        Boolean undated = null;
        Boolean allEvents = null;
        List<String> contextCodes = null;
        List<List<Object>> excludes = null;
        // List<CalendarEvent> response = api.listCalendarEventsForUser(userId, type, startDate, endDate, undated, allEvents, contextCodes, excludes);

        // TODO: test validations
    }

    /**
     * List calendar events for a user
     *
     * Retrieve the paginated list of calendar events or assignments for the specified user. To view calendar events for a user other than yourself, you must either be an observer of that user or an administrator.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCalendarEventsForUserTestQueryMap() {
        String userId = null;
        CalendarEventsApi.ListCalendarEventsForUserQueryParams queryParams = new CalendarEventsApi.ListCalendarEventsForUserQueryParams()
            .type(null)
            .startDate(null)
            .endDate(null)
            .undated(null)
            .allEvents(null)
            .contextCodes(null)
            .excludes(null);
        // List<CalendarEvent> response = api.listCalendarEventsForUser(userId, queryParams);

    // TODO: test validations
    }
    /**
     * Reserve a time slot
     *
     * Reserves a particular time slot and return the new reservation
     */
    @Test
    public void reserveTimeSlotTest() {
        String id = null;
        String participantId = null;
        String comments = null;
        Boolean cancelExisting = null;
        // api.reserveTimeSlot(id, participantId, comments, cancelExisting);

        // TODO: test validations
    }

    /**
     * Reserve a time slot
     *
     * Reserves a particular time slot and return the new reservation
     */
    @Test
    public void reserveTimeSlotParticipantIdTest() {
        String id = null;
        String participantId = null;
        String comments = null;
        Boolean cancelExisting = null;
        // api.reserveTimeSlotParticipantId(id, participantId, comments, cancelExisting);

        // TODO: test validations
    }

    /**
     * Set a course timetable
     *
     * Creates and updates \&quot;timetable\&quot; events for a course. Can automaticaly generate a series of calendar events based on simple schedules (e.g. \&quot;Monday and Wednesday at 2:00pm\&quot; )  Existing timetable events for the course and course sections will be updated if they still are part of the timetable. Otherwise, they will be deleted.
     */
    @Test
    public void setCourseTimetableTest() {
        String courseId = null;
        List<List<Object>> timetablesCourseSectionId = null;
        List<String> timetablesCourseSectionIdWeekdays = null;
        List<String> timetablesCourseSectionIdStartTime = null;
        List<String> timetablesCourseSectionIdEndTime = null;
        List<String> timetablesCourseSectionIdLocationName = null;
        // api.setCourseTimetable(courseId, timetablesCourseSectionId, timetablesCourseSectionIdWeekdays, timetablesCourseSectionIdStartTime, timetablesCourseSectionIdEndTime, timetablesCourseSectionIdLocationName);

        // TODO: test validations
    }

    /**
     * Update a calendar event
     *
     * Update and return a calendar event
     */
    @Test
    public void updateCalendarEventTest() {
        String id = null;
        String calendarEventContextCode = null;
        String calendarEventTitle = null;
        String calendarEventDescription = null;
        String calendarEventStartAt = null;
        String calendarEventEndAt = null;
        String calendarEventLocationName = null;
        String calendarEventLocationAddress = null;
        String calendarEventTimeZoneEdited = null;
        Boolean calendarEventAllDay = null;
        String calendarEventChildEventDataXStartAt = null;
        String calendarEventChildEventDataXEndAt = null;
        String calendarEventChildEventDataXContextCode = null;
        // api.updateCalendarEvent(id, calendarEventContextCode, calendarEventTitle, calendarEventDescription, calendarEventStartAt, calendarEventEndAt, calendarEventLocationName, calendarEventLocationAddress, calendarEventTimeZoneEdited, calendarEventAllDay, calendarEventChildEventDataXStartAt, calendarEventChildEventDataXEndAt, calendarEventChildEventDataXContextCode);

        // TODO: test validations
    }

}
