package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.CalendarEvent;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppointmentGroupsApi
 */
public class AppointmentGroupsApiTest {

    private AppointmentGroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AppointmentGroupsApi.class);
    }

    /**
     * Create an appointment group
     *
     * Create and return a new appointment group. If new_appointments are specified, the response will return a new_appointments array (same format as appointments array, see \&quot;List appointment groups\&quot; action)
     */
    @Test
    public void createAppointmentGroupTest() {
        List<String> appointmentGroupContextCodes = null;
        List<String> appointmentGroupSubContextCodes = null;
        String appointmentGroupTitle = null;
        String appointmentGroupDescription = null;
        String appointmentGroupLocationName = null;
        String appointmentGroupLocationAddress = null;
        Boolean appointmentGroupPublish = null;
        Integer appointmentGroupParticipantsPerAppointment = null;
        Integer appointmentGroupMinAppointmentsPerParticipant = null;
        Integer appointmentGroupMaxAppointmentsPerParticipant = null;
        List<String> appointmentGroupNewAppointmentsX = null;
        String appointmentGroupParticipantVisibility = null;
        // api.createAppointmentGroup(appointmentGroupContextCodes, appointmentGroupSubContextCodes, appointmentGroupTitle, appointmentGroupDescription, appointmentGroupLocationName, appointmentGroupLocationAddress, appointmentGroupPublish, appointmentGroupParticipantsPerAppointment, appointmentGroupMinAppointmentsPerParticipant, appointmentGroupMaxAppointmentsPerParticipant, appointmentGroupNewAppointmentsX, appointmentGroupParticipantVisibility);

        // TODO: test validations
    }

    /**
     * Delete an appointment group
     *
     * Delete an appointment group (and associated time slots and reservations) and return the deleted group
     */
    @Test
    public void deleteAppointmentGroupTest() {
        String id = null;
        String cancelReason = null;
        // api.deleteAppointmentGroup(id, cancelReason);

        // TODO: test validations
    }

    /**
     * Delete an appointment group
     *
     * Delete an appointment group (and associated time slots and reservations) and return the deleted group
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteAppointmentGroupTestQueryMap() {
        String id = null;
        AppointmentGroupsApi.DeleteAppointmentGroupQueryParams queryParams = new AppointmentGroupsApi.DeleteAppointmentGroupQueryParams()
            .cancelReason(null);
        // api.deleteAppointmentGroup(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get next appointment
     *
     * Return the next appointment available to sign up for. The appointment is returned in a one-element array. If no future appointments are available, an empty array is returned.
     */
    @Test
    public void getNextAppointmentTest() {
        List<String> appointmentGroupIds = null;
        // List<CalendarEvent> response = api.getNextAppointment(appointmentGroupIds);

        // TODO: test validations
    }

    /**
     * Get next appointment
     *
     * Return the next appointment available to sign up for. The appointment is returned in a one-element array. If no future appointments are available, an empty array is returned.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getNextAppointmentTestQueryMap() {
        AppointmentGroupsApi.GetNextAppointmentQueryParams queryParams = new AppointmentGroupsApi.GetNextAppointmentQueryParams()
            .appointmentGroupIds(null);
        // List<CalendarEvent> response = api.getNextAppointment(queryParams);

    // TODO: test validations
    }
    /**
     * Get a single appointment group
     *
     * Returns information for a single appointment group
     */
    @Test
    public void getSingleAppointmentGroupTest() {
        String id = null;
        List<String> include = null;
        // api.getSingleAppointmentGroup(id, include);

        // TODO: test validations
    }

    /**
     * Get a single appointment group
     *
     * Returns information for a single appointment group
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleAppointmentGroupTestQueryMap() {
        String id = null;
        AppointmentGroupsApi.GetSingleAppointmentGroupQueryParams queryParams = new AppointmentGroupsApi.GetSingleAppointmentGroupQueryParams()
            .include(null);
        // api.getSingleAppointmentGroup(id, queryParams);

    // TODO: test validations
    }
    /**
     * List appointment groups
     *
     * Retrieve the paginated list of appointment groups that can be reserved or managed by the current user.
     */
    @Test
    public void listAppointmentGroupsTest() {
        String scope = null;
        List<String> contextCodes = null;
        Boolean includePastAppointments = null;
        List<String> include = null;
        // api.listAppointmentGroups(scope, contextCodes, includePastAppointments, include);

        // TODO: test validations
    }

    /**
     * List appointment groups
     *
     * Retrieve the paginated list of appointment groups that can be reserved or managed by the current user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAppointmentGroupsTestQueryMap() {
        AppointmentGroupsApi.ListAppointmentGroupsQueryParams queryParams = new AppointmentGroupsApi.ListAppointmentGroupsQueryParams()
            .scope(null)
            .contextCodes(null)
            .includePastAppointments(null)
            .include(null);
        // api.listAppointmentGroups(queryParams);

    // TODO: test validations
    }
    /**
     * List student group participants
     *
     * A paginated list of student groups that are (or may be) participating in this appointment group. Refer to the Groups API for the response fields. Returns no results for appointment groups with the \&quot;User\&quot; participant_type.
     */
    @Test
    public void listStudentGroupParticipantsTest() {
        String id = null;
        String registrationStatus = null;
        // api.listStudentGroupParticipants(id, registrationStatus);

        // TODO: test validations
    }

    /**
     * List student group participants
     *
     * A paginated list of student groups that are (or may be) participating in this appointment group. Refer to the Groups API for the response fields. Returns no results for appointment groups with the \&quot;User\&quot; participant_type.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listStudentGroupParticipantsTestQueryMap() {
        String id = null;
        AppointmentGroupsApi.ListStudentGroupParticipantsQueryParams queryParams = new AppointmentGroupsApi.ListStudentGroupParticipantsQueryParams()
            .registrationStatus(null);
        // api.listStudentGroupParticipants(id, queryParams);

    // TODO: test validations
    }
    /**
     * List user participants
     *
     * A paginated list of users that are (or may be) participating in this appointment group.  Refer to the Users API for the response fields. Returns no results for appointment groups with the \&quot;Group\&quot; participant_type.
     */
    @Test
    public void listUserParticipantsTest() {
        String id = null;
        String registrationStatus = null;
        // api.listUserParticipants(id, registrationStatus);

        // TODO: test validations
    }

    /**
     * List user participants
     *
     * A paginated list of users that are (or may be) participating in this appointment group.  Refer to the Users API for the response fields. Returns no results for appointment groups with the \&quot;Group\&quot; participant_type.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUserParticipantsTestQueryMap() {
        String id = null;
        AppointmentGroupsApi.ListUserParticipantsQueryParams queryParams = new AppointmentGroupsApi.ListUserParticipantsQueryParams()
            .registrationStatus(null);
        // api.listUserParticipants(id, queryParams);

    // TODO: test validations
    }
    /**
     * Update an appointment group
     *
     * Update and return an appointment group. If new_appointments are specified, the response will return a new_appointments array (same format as appointments array, see \&quot;List appointment groups\&quot; action).
     */
    @Test
    public void updateAppointmentGroupTest() {
        String id = null;
        List<String> appointmentGroupContextCodes = null;
        List<String> appointmentGroupSubContextCodes = null;
        String appointmentGroupTitle = null;
        String appointmentGroupDescription = null;
        String appointmentGroupLocationName = null;
        String appointmentGroupLocationAddress = null;
        Boolean appointmentGroupPublish = null;
        Integer appointmentGroupParticipantsPerAppointment = null;
        Integer appointmentGroupMinAppointmentsPerParticipant = null;
        Integer appointmentGroupMaxAppointmentsPerParticipant = null;
        List<String> appointmentGroupNewAppointmentsX = null;
        String appointmentGroupParticipantVisibility = null;
        // api.updateAppointmentGroup(id, appointmentGroupContextCodes, appointmentGroupSubContextCodes, appointmentGroupTitle, appointmentGroupDescription, appointmentGroupLocationName, appointmentGroupLocationAddress, appointmentGroupPublish, appointmentGroupParticipantsPerAppointment, appointmentGroupMinAppointmentsPerParticipant, appointmentGroupMaxAppointmentsPerParticipant, appointmentGroupNewAppointmentsX, appointmentGroupParticipantVisibility);

        // TODO: test validations
    }

}
