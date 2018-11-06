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
import com.instructure.canvas.model.Appointment;
import com.instructure.canvas.model.CalendarEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * AppointmentGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class AppointmentGroup {

  @JsonProperty("appointments")

  private List<CalendarEvent> appointments = null;

  @JsonProperty("appointments_count")

  private Integer appointmentsCount = null;

  @JsonProperty("context_codes")

  private List<String> contextCodes = null;

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("end_at")

  private OffsetDateTime endAt = null;

  @JsonProperty("html_url")

  private String htmlUrl = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("location_address")

  private String locationAddress = null;

  @JsonProperty("location_name")

  private String locationName = null;

  @JsonProperty("max_appointments_per_participant")

  private Integer maxAppointmentsPerParticipant = null;

  @JsonProperty("min_appointments_per_participant")

  private Integer minAppointmentsPerParticipant = null;

  @JsonProperty("new_appointments")

  private List<CalendarEvent> newAppointments = null;

  @JsonProperty("participant_count")

  private Integer participantCount = null;

  @JsonProperty("participant_type")

  private String participantType = null;

  @JsonProperty("participant_visibility")

  private String participantVisibility = null;

  @JsonProperty("participants_per_appointment")

  private Integer participantsPerAppointment = null;

  @JsonProperty("requiring_action")

  private Boolean requiringAction = null;

  @JsonProperty("reserved_times")

  private List<Appointment> reservedTimes = null;

  @JsonProperty("start_at")

  private OffsetDateTime startAt = null;

  @JsonProperty("sub_context_codes")

  private List<Integer> subContextCodes = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("updated_at")

  private OffsetDateTime updatedAt = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public AppointmentGroup appointments(List<CalendarEvent> appointments) {
    this.appointments = appointments;
    return this;
  }

  public AppointmentGroup addAppointmentsItem(CalendarEvent appointmentsItem) {
    if (this.appointments == null) {
      this.appointments = new ArrayList<CalendarEvent>();
    }
    this.appointments.add(appointmentsItem);
    return this;
  }

  /**
  * Calendar Events representing the time slots (see include[] argument) Refer to the Calendar Events API for more information
  * @return appointments
  **/
  @Schema(example = "[]", description = "Calendar Events representing the time slots (see include[] argument) Refer to the Calendar Events API for more information")
  public List<CalendarEvent> getAppointments() {
    return appointments;
  }
  public void setAppointments(List<CalendarEvent> appointments) {
    this.appointments = appointments;
  }
  public AppointmentGroup appointmentsCount(Integer appointmentsCount) {
    this.appointmentsCount = appointmentsCount;
    return this;
  }

  

  /**
  * Number of time slots in this appointment group
  * @return appointmentsCount
  **/
  @Schema(example = "2", description = "Number of time slots in this appointment group")
  public Integer getAppointmentsCount() {
    return appointmentsCount;
  }
  public void setAppointmentsCount(Integer appointmentsCount) {
    this.appointmentsCount = appointmentsCount;
  }
  public AppointmentGroup contextCodes(List<String> contextCodes) {
    this.contextCodes = contextCodes;
    return this;
  }

  public AppointmentGroup addContextCodesItem(String contextCodesItem) {
    if (this.contextCodes == null) {
      this.contextCodes = new ArrayList<String>();
    }
    this.contextCodes.add(contextCodesItem);
    return this;
  }

  /**
  * The context codes (i.e. courses) this appointment group belongs to. Only people in these courses will be eligible to sign up.
  * @return contextCodes
  **/
  @Schema(example = "[course_123]", description = "The context codes (i.e. courses) this appointment group belongs to. Only people in these courses will be eligible to sign up.")
  public List<String> getContextCodes() {
    return contextCodes;
  }
  public void setContextCodes(List<String> contextCodes) {
    this.contextCodes = contextCodes;
  }
  public AppointmentGroup createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * When the appointment group was created
  * @return createdAt
  **/
  @Schema(description = "When the appointment group was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public AppointmentGroup description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The text description of the appointment group
  * @return description
  **/
  @Schema(example = "Es muy importante", description = "The text description of the appointment group")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public AppointmentGroup endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  

  /**
  * The end of the last time slot in the appointment group
  * @return endAt
  **/
  @Schema(description = "The end of the last time slot in the appointment group")
  public OffsetDateTime getEndAt() {
    return endAt;
  }
  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }
  public AppointmentGroup htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  

  /**
  * URL for a user to view this appointment group
  * @return htmlUrl
  **/
  @Schema(example = "http://example.com/appointment_groups/1", description = "URL for a user to view this appointment group")
  public String getHtmlUrl() {
    return htmlUrl;
  }
  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }
  public AppointmentGroup id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of the appointment group
  * @return id
  **/
  @Schema(example = "543", description = "The ID of the appointment group")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public AppointmentGroup locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

  

  /**
  * The address of the appointment group&#x27;s location
  * @return locationAddress
  **/
  @Schema(example = "Room 234", description = "The address of the appointment group's location")
  public String getLocationAddress() {
    return locationAddress;
  }
  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }
  public AppointmentGroup locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

  

  /**
  * The location name of the appointment group
  * @return locationName
  **/
  @Schema(example = "El Tigre Chino's office", description = "The location name of the appointment group")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }
  public AppointmentGroup maxAppointmentsPerParticipant(Integer maxAppointmentsPerParticipant) {
    this.maxAppointmentsPerParticipant = maxAppointmentsPerParticipant;
    return this;
  }

  

  /**
  * Maximum number of time slots a user may register for, or null if no limit
  * @return maxAppointmentsPerParticipant
  **/
  @Schema(example = "1", description = "Maximum number of time slots a user may register for, or null if no limit")
  public Integer getMaxAppointmentsPerParticipant() {
    return maxAppointmentsPerParticipant;
  }
  public void setMaxAppointmentsPerParticipant(Integer maxAppointmentsPerParticipant) {
    this.maxAppointmentsPerParticipant = maxAppointmentsPerParticipant;
  }
  public AppointmentGroup minAppointmentsPerParticipant(Integer minAppointmentsPerParticipant) {
    this.minAppointmentsPerParticipant = minAppointmentsPerParticipant;
    return this;
  }

  

  /**
  * Minimum number of time slots a user must register for. If not set, users do not need to sign up for any time slots
  * @return minAppointmentsPerParticipant
  **/
  @Schema(example = "1", description = "Minimum number of time slots a user must register for. If not set, users do not need to sign up for any time slots")
  public Integer getMinAppointmentsPerParticipant() {
    return minAppointmentsPerParticipant;
  }
  public void setMinAppointmentsPerParticipant(Integer minAppointmentsPerParticipant) {
    this.minAppointmentsPerParticipant = minAppointmentsPerParticipant;
  }
  public AppointmentGroup newAppointments(List<CalendarEvent> newAppointments) {
    this.newAppointments = newAppointments;
    return this;
  }

  public AppointmentGroup addNewAppointmentsItem(CalendarEvent newAppointmentsItem) {
    if (this.newAppointments == null) {
      this.newAppointments = new ArrayList<CalendarEvent>();
    }
    this.newAppointments.add(newAppointmentsItem);
    return this;
  }

  /**
  * Newly created time slots (same format as appointments above). Only returned in Create/Update responses where new time slots have been added
  * @return newAppointments
  **/
  @Schema(example = "[]", description = "Newly created time slots (same format as appointments above). Only returned in Create/Update responses where new time slots have been added")
  public List<CalendarEvent> getNewAppointments() {
    return newAppointments;
  }
  public void setNewAppointments(List<CalendarEvent> newAppointments) {
    this.newAppointments = newAppointments;
  }
  public AppointmentGroup participantCount(Integer participantCount) {
    this.participantCount = participantCount;
    return this;
  }

  

  /**
  * The number of participant who have reserved slots (see include[] argument)
  * @return participantCount
  **/
  @Schema(example = "2", description = "The number of participant who have reserved slots (see include[] argument)")
  public Integer getParticipantCount() {
    return participantCount;
  }
  public void setParticipantCount(Integer participantCount) {
    this.participantCount = participantCount;
  }
  public AppointmentGroup participantType(String participantType) {
    this.participantType = participantType;
    return this;
  }

  

  /**
  * Indicates how participants sign up for the appointment group, either as individuals (&#x27;User&#x27;) or in student groups (&#x27;Group&#x27;). Related to sub_context_codes (i.e. &#x27;Group&#x27; signups always have a single group category)
  * @return participantType
  **/
  @Schema(example = "User", description = "Indicates how participants sign up for the appointment group, either as individuals ('User') or in student groups ('Group'). Related to sub_context_codes (i.e. 'Group' signups always have a single group category)")
  public String getParticipantType() {
    return participantType;
  }
  public void setParticipantType(String participantType) {
    this.participantType = participantType;
  }
  public AppointmentGroup participantVisibility(String participantVisibility) {
    this.participantVisibility = participantVisibility;
    return this;
  }

  

  /**
  * &#x27;private&#x27; means participants cannot see who has signed up for a particular time slot, &#x27;protected&#x27; means that they can
  * @return participantVisibility
  **/
  @Schema(example = "private", description = "'private' means participants cannot see who has signed up for a particular time slot, 'protected' means that they can")
  public String getParticipantVisibility() {
    return participantVisibility;
  }
  public void setParticipantVisibility(String participantVisibility) {
    this.participantVisibility = participantVisibility;
  }
  public AppointmentGroup participantsPerAppointment(Integer participantsPerAppointment) {
    this.participantsPerAppointment = participantsPerAppointment;
    return this;
  }

  

  /**
  * Maximum number of participants that may register for each time slot, or null if no limit
  * @return participantsPerAppointment
  **/
  @Schema(example = "1", description = "Maximum number of participants that may register for each time slot, or null if no limit")
  public Integer getParticipantsPerAppointment() {
    return participantsPerAppointment;
  }
  public void setParticipantsPerAppointment(Integer participantsPerAppointment) {
    this.participantsPerAppointment = participantsPerAppointment;
  }
  public AppointmentGroup requiringAction(Boolean requiringAction) {
    this.requiringAction = requiringAction;
    return this;
  }

  

  /**
  * Boolean indicating whether the current user needs to sign up for this appointment group (i.e. it&#x27;s reservable and the min_appointments_per_participant limit has not been met by this user).
  * @return requiringAction
  **/
  @Schema(example = "true", description = "Boolean indicating whether the current user needs to sign up for this appointment group (i.e. it's reservable and the min_appointments_per_participant limit has not been met by this user).")
  public Boolean isRequiringAction() {
    return requiringAction;
  }
  public void setRequiringAction(Boolean requiringAction) {
    this.requiringAction = requiringAction;
  }
  public AppointmentGroup reservedTimes(List<Appointment> reservedTimes) {
    this.reservedTimes = reservedTimes;
    return this;
  }

  public AppointmentGroup addReservedTimesItem(Appointment reservedTimesItem) {
    if (this.reservedTimes == null) {
      this.reservedTimes = new ArrayList<Appointment>();
    }
    this.reservedTimes.add(reservedTimesItem);
    return this;
  }

  /**
  * The start and end times of slots reserved by the current user as well as the id of the calendar event for the reservation (see include[] argument)
  * @return reservedTimes
  **/
  @Schema(example = "[{end_at=2012-07-20T15:00:00-06:00, id=987, start_at=2012-07-20T15:00:00-06:00}]", description = "The start and end times of slots reserved by the current user as well as the id of the calendar event for the reservation (see include[] argument)")
  public List<Appointment> getReservedTimes() {
    return reservedTimes;
  }
  public void setReservedTimes(List<Appointment> reservedTimes) {
    this.reservedTimes = reservedTimes;
  }
  public AppointmentGroup startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  

  /**
  * The start of the first time slot in the appointment group
  * @return startAt
  **/
  @Schema(description = "The start of the first time slot in the appointment group")
  public OffsetDateTime getStartAt() {
    return startAt;
  }
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }
  public AppointmentGroup subContextCodes(List<Integer> subContextCodes) {
    this.subContextCodes = subContextCodes;
    return this;
  }

  public AppointmentGroup addSubContextCodesItem(Integer subContextCodesItem) {
    if (this.subContextCodes == null) {
      this.subContextCodes = new ArrayList<Integer>();
    }
    this.subContextCodes.add(subContextCodesItem);
    return this;
  }

  /**
  * The sub-context codes (i.e. course sections and group categories) this appointment group is restricted to
  * @return subContextCodes
  **/
  @Schema(example = "[course_section_234]", description = "The sub-context codes (i.e. course sections and group categories) this appointment group is restricted to")
  public List<Integer> getSubContextCodes() {
    return subContextCodes;
  }
  public void setSubContextCodes(List<Integer> subContextCodes) {
    this.subContextCodes = subContextCodes;
  }
  public AppointmentGroup title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * The title of the appointment group
  * @return title
  **/
  @Schema(example = "Final Presentation", description = "The title of the appointment group")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public AppointmentGroup updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  /**
  * When the appointment group was last updated
  * @return updatedAt
  **/
  @Schema(description = "When the appointment group was last updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public AppointmentGroup url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * URL for this appointment group (to update, delete, etc.)
  * @return url
  **/
  @Schema(example = "https://example.com/api/v1/appointment_groups/543", description = "URL for this appointment group (to update, delete, etc.)")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public AppointmentGroup workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * Current state of the appointment group (&#x27;pending&#x27;, &#x27;active&#x27; or &#x27;deleted&#x27;). &#x27;pending&#x27; indicates that it has not been published yet and is invisible to participants.
  * @return workflowState
  **/
  @Schema(example = "active", description = "Current state of the appointment group ('pending', 'active' or 'deleted'). 'pending' indicates that it has not been published yet and is invisible to participants.")
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
    AppointmentGroup appointmentGroup = (AppointmentGroup) o;
    return Objects.equals(this.appointments, appointmentGroup.appointments) &&
        Objects.equals(this.appointmentsCount, appointmentGroup.appointmentsCount) &&
        Objects.equals(this.contextCodes, appointmentGroup.contextCodes) &&
        Objects.equals(this.createdAt, appointmentGroup.createdAt) &&
        Objects.equals(this.description, appointmentGroup.description) &&
        Objects.equals(this.endAt, appointmentGroup.endAt) &&
        Objects.equals(this.htmlUrl, appointmentGroup.htmlUrl) &&
        Objects.equals(this.id, appointmentGroup.id) &&
        Objects.equals(this.locationAddress, appointmentGroup.locationAddress) &&
        Objects.equals(this.locationName, appointmentGroup.locationName) &&
        Objects.equals(this.maxAppointmentsPerParticipant, appointmentGroup.maxAppointmentsPerParticipant) &&
        Objects.equals(this.minAppointmentsPerParticipant, appointmentGroup.minAppointmentsPerParticipant) &&
        Objects.equals(this.newAppointments, appointmentGroup.newAppointments) &&
        Objects.equals(this.participantCount, appointmentGroup.participantCount) &&
        Objects.equals(this.participantType, appointmentGroup.participantType) &&
        Objects.equals(this.participantVisibility, appointmentGroup.participantVisibility) &&
        Objects.equals(this.participantsPerAppointment, appointmentGroup.participantsPerAppointment) &&
        Objects.equals(this.requiringAction, appointmentGroup.requiringAction) &&
        Objects.equals(this.reservedTimes, appointmentGroup.reservedTimes) &&
        Objects.equals(this.startAt, appointmentGroup.startAt) &&
        Objects.equals(this.subContextCodes, appointmentGroup.subContextCodes) &&
        Objects.equals(this.title, appointmentGroup.title) &&
        Objects.equals(this.updatedAt, appointmentGroup.updatedAt) &&
        Objects.equals(this.url, appointmentGroup.url) &&
        Objects.equals(this.workflowState, appointmentGroup.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(appointments, appointmentsCount, contextCodes, createdAt, description, endAt, htmlUrl, id, locationAddress, locationName, maxAppointmentsPerParticipant, minAppointmentsPerParticipant, newAppointments, participantCount, participantType, participantVisibility, participantsPerAppointment, requiringAction, reservedTimes, startAt, subContextCodes, title, updatedAt, url, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentGroup {\n");
    
    sb.append("    appointments: ").append(toIndentedString(appointments)).append("\n");
    sb.append("    appointmentsCount: ").append(toIndentedString(appointmentsCount)).append("\n");
    sb.append("    contextCodes: ").append(toIndentedString(contextCodes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationAddress: ").append(toIndentedString(locationAddress)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    maxAppointmentsPerParticipant: ").append(toIndentedString(maxAppointmentsPerParticipant)).append("\n");
    sb.append("    minAppointmentsPerParticipant: ").append(toIndentedString(minAppointmentsPerParticipant)).append("\n");
    sb.append("    newAppointments: ").append(toIndentedString(newAppointments)).append("\n");
    sb.append("    participantCount: ").append(toIndentedString(participantCount)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
    sb.append("    participantVisibility: ").append(toIndentedString(participantVisibility)).append("\n");
    sb.append("    participantsPerAppointment: ").append(toIndentedString(participantsPerAppointment)).append("\n");
    sb.append("    requiringAction: ").append(toIndentedString(requiringAction)).append("\n");
    sb.append("    reservedTimes: ").append(toIndentedString(reservedTimes)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    subContextCodes: ").append(toIndentedString(subContextCodes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
