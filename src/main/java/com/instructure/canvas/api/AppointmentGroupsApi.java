package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.CalendarEvent;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AppointmentGroupsApi extends ApiClient.Api {

  /**
   * Create an appointment group
   * Create and return a new appointment group. If new_appointments are specified, the response will return a new_appointments array (same format as appointments array, see \&quot;List appointment groups\&quot; action)
   * @param appointmentGroupContextCodes  (optional)
   * @param appointmentGroupSubContextCodes  (optional)
   * @param appointmentGroupTitle  (optional)
   * @param appointmentGroupDescription  (optional)
   * @param appointmentGroupLocationName  (optional)
   * @param appointmentGroupLocationAddress  (optional)
   * @param appointmentGroupPublish  (optional)
   * @param appointmentGroupParticipantsPerAppointment  (optional)
   * @param appointmentGroupMinAppointmentsPerParticipant  (optional)
   * @param appointmentGroupMaxAppointmentsPerParticipant  (optional)
   * @param appointmentGroupNewAppointmentsX  (optional)
   * @param appointmentGroupParticipantVisibility  (optional)
   */
  @RequestLine("POST /v1/appointment_groups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createAppointmentGroup(@Param("appointmentGroupContextCodes") List<String> appointmentGroupContextCodes, @Param("appointmentGroupSubContextCodes") List<String> appointmentGroupSubContextCodes, @Param("appointmentGroupTitle") String appointmentGroupTitle, @Param("appointmentGroupDescription") String appointmentGroupDescription, @Param("appointmentGroupLocationName") String appointmentGroupLocationName, @Param("appointmentGroupLocationAddress") String appointmentGroupLocationAddress, @Param("appointmentGroupPublish") Boolean appointmentGroupPublish, @Param("appointmentGroupParticipantsPerAppointment") Integer appointmentGroupParticipantsPerAppointment, @Param("appointmentGroupMinAppointmentsPerParticipant") Integer appointmentGroupMinAppointmentsPerParticipant, @Param("appointmentGroupMaxAppointmentsPerParticipant") Integer appointmentGroupMaxAppointmentsPerParticipant, @Param("appointmentGroupNewAppointmentsX") List<String> appointmentGroupNewAppointmentsX, @Param("appointmentGroupParticipantVisibility") String appointmentGroupParticipantVisibility);
  
  /**
   * Delete an appointment group
   * Delete an appointment group (and associated time slots and reservations) and return the deleted group
   * @param id ID (required)
   * @param cancelReason Reason for deleting/canceling the appointment group. (optional)
   */
  @RequestLine("DELETE /v1/appointment_groups/{id}?cancel_reason={cancelReason}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteAppointmentGroup(@Param("id") String id, @Param("cancelReason") String cancelReason);
  

  /**
   * Delete an appointment group
   * Delete an appointment group (and associated time slots and reservations) and return the deleted group
   * Note, this is equivalent to the other <code>deleteAppointmentGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAppointmentGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>cancelReason - Reason for deleting/canceling the appointment group. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/appointment_groups/{id}?cancel_reason={cancelReason}")
  @Headers({
      "Content-Type: application/json",
  })
  void deleteAppointmentGroup(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteAppointmentGroup</code> method in a fluent style.
   */
  public static class DeleteAppointmentGroupQueryParams extends HashMap<String, Object> {
    public DeleteAppointmentGroupQueryParams cancelReason(final String value) {
      put("cancel_reason", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get next appointment
   * Return the next appointment available to sign up for. The appointment is returned in a one-element array. If no future appointments are available, an empty array is returned.
   * @param appointmentGroupIds List of ids of appointment groups to search. (optional)
   * @return List&lt;CalendarEvent&gt;
   */
  @RequestLine("GET /v1/appointment_groups/next_appointment?appointment_group_ids={appointmentGroupIds}")
  @Headers({
      "Accept: application/json",
  })
  List<CalendarEvent> getNextAppointment(@Param("appointmentGroupIds") List<String> appointmentGroupIds);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CalendarEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CalendarEvent> getNextAppointment(URI uri);
  

  /**
   * Get next appointment
   * Return the next appointment available to sign up for. The appointment is returned in a one-element array. If no future appointments are available, an empty array is returned.
   * Note, this is equivalent to the other <code>getNextAppointment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetNextAppointmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>appointmentGroupIds - List of ids of appointment groups to search. (optional)</li>
   *   </ul>
   * @return List&lt;CalendarEvent&gt;

   */
  @RequestLine("GET /v1/appointment_groups/next_appointment?appointment_group_ids={appointmentGroupIds}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<CalendarEvent> getNextAppointment(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getNextAppointment</code> method in a fluent style.
   */
  public static class GetNextAppointmentQueryParams extends HashMap<String, Object> {
    public GetNextAppointmentQueryParams appointmentGroupIds(final List<String> value) {
      put("appointment_group_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single appointment group
   * Returns information for a single appointment group
   * @param id ID (required)
   * @param include Array of additional information to include. See include[] argument of \&quot;List appointment groups\&quot; action.  \&quot;child_events\&quot;:: reservations of time slots time slots \&quot;appointments\&quot;:: will always be returned \&quot;all_context_codes\&quot;:: all context codes associated with this appointment group (optional)
   */
  @RequestLine("GET /v1/appointment_groups/{id}?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getSingleAppointmentGroup(@Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get a single appointment group
   * Returns information for a single appointment group
   * Note, this is equivalent to the other <code>getSingleAppointmentGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleAppointmentGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Array of additional information to include. See include[] argument of \&quot;List appointment groups\&quot; action.  \&quot;child_events\&quot;:: reservations of time slots time slots \&quot;appointments\&quot;:: will always be returned \&quot;all_context_codes\&quot;:: all context codes associated with this appointment group (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/appointment_groups/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleAppointmentGroup(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleAppointmentGroup</code> method in a fluent style.
   */
  public static class GetSingleAppointmentGroupQueryParams extends HashMap<String, Object> {
    public GetSingleAppointmentGroupQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List appointment groups
   * Retrieve the paginated list of appointment groups that can be reserved or managed by the current user.
   * @param scope Defaults to \&quot;reservable\&quot; (optional)
   * @param contextCodes Array of context codes used to limit returned results. (optional)
   * @param includePastAppointments Defaults to false. If true, includes past appointment groups (optional)
   * @param include Array of additional information to include.  \&quot;appointments\&quot;:: calendar event time slots for this appointment group \&quot;child_events\&quot;:: reservations of those time slots \&quot;participant_count\&quot;:: number of reservations \&quot;reserved_times\&quot;:: the event id, start time and end time of reservations                    the current user has made) \&quot;all_context_codes\&quot;:: all context codes associated with this appointment group (optional)
   */
  @RequestLine("GET /v1/appointment_groups?scope={scope}&context_codes={contextCodes}&include_past_appointments={includePastAppointments}&include={include}")
  @Headers({
      "Accept: */*",
  })
  void listAppointmentGroups(@Param("scope") String scope, @Param("contextCodes") List<String> contextCodes, @Param("includePastAppointments") Boolean includePastAppointments, @Param("include") List<String> include);
  

  /**
   * List appointment groups
   * Retrieve the paginated list of appointment groups that can be reserved or managed by the current user.
   * Note, this is equivalent to the other <code>listAppointmentGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAppointmentGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>scope - Defaults to \&quot;reservable\&quot; (optional)</li>
   *   <li>contextCodes - Array of context codes used to limit returned results. (optional)</li>
   *   <li>includePastAppointments - Defaults to false. If true, includes past appointment groups (optional)</li>
   *   <li>include - Array of additional information to include.  \&quot;appointments\&quot;:: calendar event time slots for this appointment group \&quot;child_events\&quot;:: reservations of those time slots \&quot;participant_count\&quot;:: number of reservations \&quot;reserved_times\&quot;:: the event id, start time and end time of reservations                    the current user has made) \&quot;all_context_codes\&quot;:: all context codes associated with this appointment group (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/appointment_groups?scope={scope}&context_codes={contextCodes}&include_past_appointments={includePastAppointments}&include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listAppointmentGroups(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAppointmentGroups</code> method in a fluent style.
   */
  public static class ListAppointmentGroupsQueryParams extends HashMap<String, Object> {
    public ListAppointmentGroupsQueryParams scope(final String value) {
      put("scope", EncodingUtils.encode(value));
      return this;
    }
    public ListAppointmentGroupsQueryParams contextCodes(final List<String> value) {
      put("context_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAppointmentGroupsQueryParams includePastAppointments(final Boolean value) {
      put("include_past_appointments", EncodingUtils.encode(value));
      return this;
    }
    public ListAppointmentGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List student group participants
   * A paginated list of student groups that are (or may be) participating in this appointment group. Refer to the Groups API for the response fields. Returns no results for appointment groups with the \&quot;User\&quot; participant_type.
   * @param id ID (required)
   * @param registrationStatus Limits results to the a given participation status, defaults to \&quot;all\&quot; (optional)
   */
  @RequestLine("GET /v1/appointment_groups/{id}/groups?registration_status={registrationStatus}")
  @Headers({
      "Accept: */*",
  })
  void listStudentGroupParticipants(@Param("id") String id, @Param("registrationStatus") String registrationStatus);
  

  /**
   * List student group participants
   * A paginated list of student groups that are (or may be) participating in this appointment group. Refer to the Groups API for the response fields. Returns no results for appointment groups with the \&quot;User\&quot; participant_type.
   * Note, this is equivalent to the other <code>listStudentGroupParticipants</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListStudentGroupParticipantsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>registrationStatus - Limits results to the a given participation status, defaults to \&quot;all\&quot; (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/appointment_groups/{id}/groups?registration_status={registrationStatus}")
  @Headers({
      "Content-Type: */*",
  })
  void listStudentGroupParticipants(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listStudentGroupParticipants</code> method in a fluent style.
   */
  public static class ListStudentGroupParticipantsQueryParams extends HashMap<String, Object> {
    public ListStudentGroupParticipantsQueryParams registrationStatus(final String value) {
      put("registration_status", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List user participants
   * A paginated list of users that are (or may be) participating in this appointment group.  Refer to the Users API for the response fields. Returns no results for appointment groups with the \&quot;Group\&quot; participant_type.
   * @param id ID (required)
   * @param registrationStatus Limits results to the a given participation status, defaults to \&quot;all\&quot; (optional)
   */
  @RequestLine("GET /v1/appointment_groups/{id}/users?registration_status={registrationStatus}")
  @Headers({
      "Accept: */*",
  })
  void listUserParticipants(@Param("id") String id, @Param("registrationStatus") String registrationStatus);
  

  /**
   * List user participants
   * A paginated list of users that are (or may be) participating in this appointment group.  Refer to the Users API for the response fields. Returns no results for appointment groups with the \&quot;Group\&quot; participant_type.
   * Note, this is equivalent to the other <code>listUserParticipants</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUserParticipantsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>registrationStatus - Limits results to the a given participation status, defaults to \&quot;all\&quot; (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/appointment_groups/{id}/users?registration_status={registrationStatus}")
  @Headers({
      "Content-Type: */*",
  })
  void listUserParticipants(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUserParticipants</code> method in a fluent style.
   */
  public static class ListUserParticipantsQueryParams extends HashMap<String, Object> {
    public ListUserParticipantsQueryParams registrationStatus(final String value) {
      put("registration_status", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Update an appointment group
   * Update and return an appointment group. If new_appointments are specified, the response will return a new_appointments array (same format as appointments array, see \&quot;List appointment groups\&quot; action).
   * @param id ID (required)
   * @param appointmentGroupContextCodes  (optional)
   * @param appointmentGroupSubContextCodes  (optional)
   * @param appointmentGroupTitle  (optional)
   * @param appointmentGroupDescription  (optional)
   * @param appointmentGroupLocationName  (optional)
   * @param appointmentGroupLocationAddress  (optional)
   * @param appointmentGroupPublish  (optional)
   * @param appointmentGroupParticipantsPerAppointment  (optional)
   * @param appointmentGroupMinAppointmentsPerParticipant  (optional)
   * @param appointmentGroupMaxAppointmentsPerParticipant  (optional)
   * @param appointmentGroupNewAppointmentsX  (optional)
   * @param appointmentGroupParticipantVisibility  (optional)
   */
  @RequestLine("PUT /v1/appointment_groups/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateAppointmentGroup(@Param("id") String id, @Param("appointmentGroupContextCodes") List<String> appointmentGroupContextCodes, @Param("appointmentGroupSubContextCodes") List<String> appointmentGroupSubContextCodes, @Param("appointmentGroupTitle") String appointmentGroupTitle, @Param("appointmentGroupDescription") String appointmentGroupDescription, @Param("appointmentGroupLocationName") String appointmentGroupLocationName, @Param("appointmentGroupLocationAddress") String appointmentGroupLocationAddress, @Param("appointmentGroupPublish") Boolean appointmentGroupPublish, @Param("appointmentGroupParticipantsPerAppointment") Integer appointmentGroupParticipantsPerAppointment, @Param("appointmentGroupMinAppointmentsPerParticipant") Integer appointmentGroupMinAppointmentsPerParticipant, @Param("appointmentGroupMaxAppointmentsPerParticipant") Integer appointmentGroupMaxAppointmentsPerParticipant, @Param("appointmentGroupNewAppointmentsX") List<String> appointmentGroupNewAppointmentsX, @Param("appointmentGroupParticipantVisibility") String appointmentGroupParticipantVisibility);
  
}
