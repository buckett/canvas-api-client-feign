/*
 * canvas.instructure.com
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.instructure.canvas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * CalendarEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class CalendarEvent {

  @JsonProperty("all_context_codes")

  private String allContextCodes = null;

  @JsonProperty("all_day")

  private Boolean allDay = null;

  @JsonProperty("all_day_date")

  private OffsetDateTime allDayDate = null;

  @JsonProperty("appointment_group_id")

  private Integer appointmentGroupId = null;

  @JsonProperty("appointment_group_url")

  private String appointmentGroupUrl = null;

  @JsonProperty("available_slots")

  private Integer availableSlots = null;

  @JsonProperty("child_events")

  private List<Integer> childEvents = null;

  @JsonProperty("child_events_count")

  private Integer childEventsCount = null;

  @JsonProperty("context_code")

  private String contextCode = null;

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("effective_context_code")

  private String effectiveContextCode = null;

  @JsonProperty("end_at")

  private OffsetDateTime endAt = null;

  @JsonProperty("group")

  private String group = null;

  @JsonProperty("hidden")

  private Boolean hidden = null;

  @JsonProperty("html_url")

  private String htmlUrl = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("location_address")

  private String locationAddress = null;

  @JsonProperty("location_name")

  private String locationName = null;

  @JsonProperty("own_reservation")

  private Boolean ownReservation = null;

  @JsonProperty("parent_event_id")

  private Integer parentEventId = null;

  @JsonProperty("participant_type")

  private String participantType = null;

  @JsonProperty("participants_per_appointment")

  private Integer participantsPerAppointment = null;

  @JsonProperty("reserve_url")

  private String reserveUrl = null;

  @JsonProperty("reserved")

  private Boolean reserved = null;

  @JsonProperty("start_at")

  private OffsetDateTime startAt = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("updated_at")

  private OffsetDateTime updatedAt = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("user")

  private String user = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public CalendarEvent allContextCodes(String allContextCodes) {
    this.allContextCodes = allContextCodes;
    return this;
  }

  

  /**
  * a comma-separated list of all calendar contexts this event is part of
  * @return allContextCodes
  **/
  @Schema(example = "course_123,course_456", description = "a comma-separated list of all calendar contexts this event is part of")
  public String getAllContextCodes() {
    return allContextCodes;
  }
  public void setAllContextCodes(String allContextCodes) {
    this.allContextCodes = allContextCodes;
  }
  public CalendarEvent allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

  

  /**
  * Boolean indicating whether this is an all-day event (midnight to midnight)
  * @return allDay
  **/
  @Schema(example = "false", description = "Boolean indicating whether this is an all-day event (midnight to midnight)")
  public Boolean isAllDay() {
    return allDay;
  }
  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }
  public CalendarEvent allDayDate(OffsetDateTime allDayDate) {
    this.allDayDate = allDayDate;
    return this;
  }

  

  /**
  * The date of this event
  * @return allDayDate
  **/
  @Schema(description = "The date of this event")
  public OffsetDateTime getAllDayDate() {
    return allDayDate;
  }
  public void setAllDayDate(OffsetDateTime allDayDate) {
    this.allDayDate = allDayDate;
  }
  public CalendarEvent appointmentGroupId(Integer appointmentGroupId) {
    this.appointmentGroupId = appointmentGroupId;
    return this;
  }

  

  /**
  * Various Appointment-Group-related fields.These fields are only pertinent to time slots (appointments) and reservations of those time slots. See the Appointment Groups API. The id of the appointment group
  * @return appointmentGroupId
  **/
  @Schema(description = "Various Appointment-Group-related fields.These fields are only pertinent to time slots (appointments) and reservations of those time slots. See the Appointment Groups API. The id of the appointment group")
  public Integer getAppointmentGroupId() {
    return appointmentGroupId;
  }
  public void setAppointmentGroupId(Integer appointmentGroupId) {
    this.appointmentGroupId = appointmentGroupId;
  }
  public CalendarEvent appointmentGroupUrl(String appointmentGroupUrl) {
    this.appointmentGroupUrl = appointmentGroupUrl;
    return this;
  }

  

  /**
  * The API URL of the appointment group
  * @return appointmentGroupUrl
  **/
  @Schema(description = "The API URL of the appointment group")
  public String getAppointmentGroupUrl() {
    return appointmentGroupUrl;
  }
  public void setAppointmentGroupUrl(String appointmentGroupUrl) {
    this.appointmentGroupUrl = appointmentGroupUrl;
  }
  public CalendarEvent availableSlots(Integer availableSlots) {
    this.availableSlots = availableSlots;
    return this;
  }

  

  /**
  * If the event is a time slot and it has a participant limit, an integer indicating how many slots are available
  * @return availableSlots
  **/
  @Schema(description = "If the event is a time slot and it has a participant limit, an integer indicating how many slots are available")
  public Integer getAvailableSlots() {
    return availableSlots;
  }
  public void setAvailableSlots(Integer availableSlots) {
    this.availableSlots = availableSlots;
  }
  public CalendarEvent childEvents(List<Integer> childEvents) {
    this.childEvents = childEvents;
    return this;
  }

  public CalendarEvent addChildEventsItem(Integer childEventsItem) {
    if (this.childEvents == null) {
      this.childEvents = new ArrayList<Integer>();
    }
    this.childEvents.add(childEventsItem);
    return this;
  }

  /**
  * Included by default, but may be excluded (see include[] option). If this is a time slot (see the Appointment Groups API) this will be a list of any reservations. If this is a course-level event, this will be a list of section-level events (if any)
  * @return childEvents
  **/
  @Schema(description = "Included by default, but may be excluded (see include[] option). If this is a time slot (see the Appointment Groups API) this will be a list of any reservations. If this is a course-level event, this will be a list of section-level events (if any)")
  public List<Integer> getChildEvents() {
    return childEvents;
  }
  public void setChildEvents(List<Integer> childEvents) {
    this.childEvents = childEvents;
  }
  public CalendarEvent childEventsCount(Integer childEventsCount) {
    this.childEventsCount = childEventsCount;
    return this;
  }

  

  /**
  * The number of child_events. See child_events (and parent_event_id)
  * @return childEventsCount
  **/
  @Schema(example = "0", description = "The number of child_events. See child_events (and parent_event_id)")
  public Integer getChildEventsCount() {
    return childEventsCount;
  }
  public void setChildEventsCount(Integer childEventsCount) {
    this.childEventsCount = childEventsCount;
  }
  public CalendarEvent contextCode(String contextCode) {
    this.contextCode = contextCode;
    return this;
  }

  

  /**
  * the context code of the calendar this event belongs to (course, user or group)
  * @return contextCode
  **/
  @Schema(example = "course_123", description = "the context code of the calendar this event belongs to (course, user or group)")
  public String getContextCode() {
    return contextCode;
  }
  public void setContextCode(String contextCode) {
    this.contextCode = contextCode;
  }
  public CalendarEvent createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * When the calendar event was created
  * @return createdAt
  **/
  @Schema(description = "When the calendar event was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public CalendarEvent description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The HTML description of the event
  * @return description
  **/
  @Schema(example = "<b>It's that time again!</b>", description = "The HTML description of the event")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public CalendarEvent effectiveContextCode(String effectiveContextCode) {
    this.effectiveContextCode = effectiveContextCode;
    return this;
  }

  

  /**
  * if specified, it indicates which calendar this event should be displayed on. for example, a section-level event would have the course&#x27;s context code here, while the section&#x27;s context code would be returned above)
  * @return effectiveContextCode
  **/
  @Schema(description = "if specified, it indicates which calendar this event should be displayed on. for example, a section-level event would have the course's context code here, while the section's context code would be returned above)")
  public String getEffectiveContextCode() {
    return effectiveContextCode;
  }
  public void setEffectiveContextCode(String effectiveContextCode) {
    this.effectiveContextCode = effectiveContextCode;
  }
  public CalendarEvent endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  

  /**
  * The end timestamp of the event
  * @return endAt
  **/
  @Schema(description = "The end timestamp of the event")
  public OffsetDateTime getEndAt() {
    return endAt;
  }
  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }
  public CalendarEvent group(String group) {
    this.group = group;
    return this;
  }

  

  /**
  * If the event is a group-level reservation, this will contain the group participant JSON (refer to the Groups API).
  * @return group
  **/
  @Schema(description = "If the event is a group-level reservation, this will contain the group participant JSON (refer to the Groups API).")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }
  public CalendarEvent hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  

  /**
  * Whether this event should be displayed on the calendar. Only true for course-level events with section-level child events.
  * @return hidden
  **/
  @Schema(example = "false", description = "Whether this event should be displayed on the calendar. Only true for course-level events with section-level child events.")
  public Boolean isHidden() {
    return hidden;
  }
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }
  public CalendarEvent htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  

  /**
  * URL for a user to view this event
  * @return htmlUrl
  **/
  @Schema(example = "https://example.com/calendar?event_id=234&include_contexts=course_123", description = "URL for a user to view this event")
  public String getHtmlUrl() {
    return htmlUrl;
  }
  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }
  public CalendarEvent id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of the calendar event
  * @return id
  **/
  @Schema(example = "234", description = "The ID of the calendar event")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public CalendarEvent locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

  

  /**
  * The address where the event is taking place
  * @return locationAddress
  **/
  @Schema(example = "Greendale, Colorado", description = "The address where the event is taking place")
  public String getLocationAddress() {
    return locationAddress;
  }
  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }
  public CalendarEvent locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  

  /**
  * The location name of the event
  * @return locationName
  **/
  @Schema(example = "Greendale Community College", description = "The location name of the event")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }
  public CalendarEvent ownReservation(Boolean ownReservation) {
    this.ownReservation = ownReservation;
    return this;
  }

  

  /**
  * If the event is a reservation, this a boolean indicating whether it is the current user&#x27;s reservation, or someone else&#x27;s
  * @return ownReservation
  **/
  @Schema(example = "false", description = "If the event is a reservation, this a boolean indicating whether it is the current user's reservation, or someone else's")
  public Boolean isOwnReservation() {
    return ownReservation;
  }
  public void setOwnReservation(Boolean ownReservation) {
    this.ownReservation = ownReservation;
  }
  public CalendarEvent parentEventId(Integer parentEventId) {
    this.parentEventId = parentEventId;
    return this;
  }

  

  /**
  * Normally null. If this is a reservation (see the Appointment Groups API), the id will indicate the time slot it is for. If this is a section-level event, this will be the course-level parent event.
  * @return parentEventId
  **/
  @Schema(description = "Normally null. If this is a reservation (see the Appointment Groups API), the id will indicate the time slot it is for. If this is a section-level event, this will be the course-level parent event.")
  public Integer getParentEventId() {
    return parentEventId;
  }
  public void setParentEventId(Integer parentEventId) {
    this.parentEventId = parentEventId;
  }
  public CalendarEvent participantType(String participantType) {
    this.participantType = participantType;
    return this;
  }

  

  /**
  * The type of participant to sign up for a slot: &#x27;User&#x27; or &#x27;Group&#x27;
  * @return participantType
  **/
  @Schema(example = "User", description = "The type of participant to sign up for a slot: 'User' or 'Group'")
  public String getParticipantType() {
    return participantType;
  }
  public void setParticipantType(String participantType) {
    this.participantType = participantType;
  }
  public CalendarEvent participantsPerAppointment(Integer participantsPerAppointment) {
    this.participantsPerAppointment = participantsPerAppointment;
    return this;
  }

  

  /**
  * If the event is a time slot, this is the participant limit
  * @return participantsPerAppointment
  **/
  @Schema(description = "If the event is a time slot, this is the participant limit")
  public Integer getParticipantsPerAppointment() {
    return participantsPerAppointment;
  }
  public void setParticipantsPerAppointment(Integer participantsPerAppointment) {
    this.participantsPerAppointment = participantsPerAppointment;
  }
  public CalendarEvent reserveUrl(String reserveUrl) {
    this.reserveUrl = reserveUrl;
    return this;
  }

  

  /**
  * If the event is a time slot, the API URL for reserving it
  * @return reserveUrl
  **/
  @Schema(description = "If the event is a time slot, the API URL for reserving it")
  public String getReserveUrl() {
    return reserveUrl;
  }
  public void setReserveUrl(String reserveUrl) {
    this.reserveUrl = reserveUrl;
  }
  public CalendarEvent reserved(Boolean reserved) {
    this.reserved = reserved;
    return this;
  }

  

  /**
  * If the event is a time slot, a boolean indicating whether the user has already made a reservation for it
  * @return reserved
  **/
  @Schema(example = "false", description = "If the event is a time slot, a boolean indicating whether the user has already made a reservation for it")
  public Boolean isReserved() {
    return reserved;
  }
  public void setReserved(Boolean reserved) {
    this.reserved = reserved;
  }
  public CalendarEvent startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  

  /**
  * The start timestamp of the event
  * @return startAt
  **/
  @Schema(description = "The start timestamp of the event")
  public OffsetDateTime getStartAt() {
    return startAt;
  }
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }
  public CalendarEvent title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * The title of the calendar event
  * @return title
  **/
  @Schema(example = "Paintball Fight!", description = "The title of the calendar event")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public CalendarEvent updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  /**
  * When the calendar event was last updated
  * @return updatedAt
  **/
  @Schema(description = "When the calendar event was last updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public CalendarEvent url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * URL for this calendar event (to update, delete, etc.)
  * @return url
  **/
  @Schema(example = "https://example.com/api/v1/calendar_events/234", description = "URL for this calendar event (to update, delete, etc.)")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public CalendarEvent user(String user) {
    this.user = user;
    return this;
  }

  

  /**
  * If the event is a user-level reservation, this will contain the user participant JSON (refer to the Users API).
  * @return user
  **/
  @Schema(description = "If the event is a user-level reservation, this will contain the user participant JSON (refer to the Users API).")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  public CalendarEvent workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * Current state of the event (&#x27;active&#x27;, &#x27;locked&#x27; or &#x27;deleted&#x27;) &#x27;locked&#x27; indicates that start_at/end_at cannot be changed (though the event could be deleted). Normally only reservations or time slots with reservations are locked (see the Appointment Groups API)
  * @return workflowState
  **/
  @Schema(example = "active", description = "Current state of the event ('active', 'locked' or 'deleted') 'locked' indicates that start_at/end_at cannot be changed (though the event could be deleted). Normally only reservations or time slots with reservations are locked (see the Appointment Groups API)")
  public String getWorkflowState() {
    return workflowState;
  }
  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEvent calendarEvent = (CalendarEvent) o;
    return Objects.equals(this.allContextCodes, calendarEvent.allContextCodes) &&
        Objects.equals(this.allDay, calendarEvent.allDay) &&
        Objects.equals(this.allDayDate, calendarEvent.allDayDate) &&
        Objects.equals(this.appointmentGroupId, calendarEvent.appointmentGroupId) &&
        Objects.equals(this.appointmentGroupUrl, calendarEvent.appointmentGroupUrl) &&
        Objects.equals(this.availableSlots, calendarEvent.availableSlots) &&
        Objects.equals(this.childEvents, calendarEvent.childEvents) &&
        Objects.equals(this.childEventsCount, calendarEvent.childEventsCount) &&
        Objects.equals(this.contextCode, calendarEvent.contextCode) &&
        Objects.equals(this.createdAt, calendarEvent.createdAt) &&
        Objects.equals(this.description, calendarEvent.description) &&
        Objects.equals(this.effectiveContextCode, calendarEvent.effectiveContextCode) &&
        Objects.equals(this.endAt, calendarEvent.endAt) &&
        Objects.equals(this.group, calendarEvent.group) &&
        Objects.equals(this.hidden, calendarEvent.hidden) &&
        Objects.equals(this.htmlUrl, calendarEvent.htmlUrl) &&
        Objects.equals(this.id, calendarEvent.id) &&
        Objects.equals(this.locationAddress, calendarEvent.locationAddress) &&
        Objects.equals(this.locationName, calendarEvent.locationName) &&
        Objects.equals(this.ownReservation, calendarEvent.ownReservation) &&
        Objects.equals(this.parentEventId, calendarEvent.parentEventId) &&
        Objects.equals(this.participantType, calendarEvent.participantType) &&
        Objects.equals(this.participantsPerAppointment, calendarEvent.participantsPerAppointment) &&
        Objects.equals(this.reserveUrl, calendarEvent.reserveUrl) &&
        Objects.equals(this.reserved, calendarEvent.reserved) &&
        Objects.equals(this.startAt, calendarEvent.startAt) &&
        Objects.equals(this.title, calendarEvent.title) &&
        Objects.equals(this.updatedAt, calendarEvent.updatedAt) &&
        Objects.equals(this.url, calendarEvent.url) &&
        Objects.equals(this.user, calendarEvent.user) &&
        Objects.equals(this.workflowState, calendarEvent.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(allContextCodes, allDay, allDayDate, appointmentGroupId, appointmentGroupUrl, availableSlots, childEvents, childEventsCount, contextCode, createdAt, description, effectiveContextCode, endAt, group, hidden, htmlUrl, id, locationAddress, locationName, ownReservation, parentEventId, participantType, participantsPerAppointment, reserveUrl, reserved, startAt, title, updatedAt, url, user, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEvent {\n");
    
    sb.append("    allContextCodes: ").append(toIndentedString(allContextCodes)).append("\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    allDayDate: ").append(toIndentedString(allDayDate)).append("\n");
    sb.append("    appointmentGroupId: ").append(toIndentedString(appointmentGroupId)).append("\n");
    sb.append("    appointmentGroupUrl: ").append(toIndentedString(appointmentGroupUrl)).append("\n");
    sb.append("    availableSlots: ").append(toIndentedString(availableSlots)).append("\n");
    sb.append("    childEvents: ").append(toIndentedString(childEvents)).append("\n");
    sb.append("    childEventsCount: ").append(toIndentedString(childEventsCount)).append("\n");
    sb.append("    contextCode: ").append(toIndentedString(contextCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveContextCode: ").append(toIndentedString(effectiveContextCode)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationAddress: ").append(toIndentedString(locationAddress)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    ownReservation: ").append(toIndentedString(ownReservation)).append("\n");
    sb.append("    parentEventId: ").append(toIndentedString(parentEventId)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
    sb.append("    participantsPerAppointment: ").append(toIndentedString(participantsPerAppointment)).append("\n");
    sb.append("    reserveUrl: ").append(toIndentedString(reserveUrl)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}