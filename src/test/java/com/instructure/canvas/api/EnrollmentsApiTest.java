package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Enrollment;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnrollmentsApi
 */
public class EnrollmentsApiTest {

    private EnrollmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EnrollmentsApi.class);
    }

    /**
     * Accept Course Invitation
     *
     * accepts a pending course invitation for the current user
     */
    @Test
    public void acceptCourseInvitationTest() {
        String courseId = null;
        String id = null;
        // api.acceptCourseInvitation(courseId, id);

        // TODO: test validations
    }

    /**
     * Adds last attended date to student enrollment in course
     *
     * 
     */
    @Test
    public void addsLastAttendedDateToStudentEnrollmentInCourseTest() {
        String courseId = null;
        String userId = null;
        // Enrollment response = api.addsLastAttendedDateToStudentEnrollmentInCourse(courseId, userId);

        // TODO: test validations
    }

    /**
     * Conclude, deactivate, or delete an enrollment
     *
     * Conclude, deactivate, or delete an enrollment. If the +task+ argument isn&#x27;t given, the enrollment will be concluded.
     */
    @Test
    public void concludeDeactivateOrDeleteEnrollmentTest() {
        String courseId = null;
        String id = null;
        String task = null;
        // Enrollment response = api.concludeDeactivateOrDeleteEnrollment(courseId, id, task);

        // TODO: test validations
    }

    /**
     * Conclude, deactivate, or delete an enrollment
     *
     * Conclude, deactivate, or delete an enrollment. If the +task+ argument isn&#x27;t given, the enrollment will be concluded.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void concludeDeactivateOrDeleteEnrollmentTestQueryMap() {
        String courseId = null;
        String id = null;
        EnrollmentsApi.ConcludeDeactivateOrDeleteEnrollmentQueryParams queryParams = new EnrollmentsApi.ConcludeDeactivateOrDeleteEnrollmentQueryParams()
            .task(null);
        // Enrollment response = api.concludeDeactivateOrDeleteEnrollment(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Enroll a user
     *
     * Create a new user enrollment for a course or section.
     */
    @Test
    public void enrollUserCoursesTest() {
        String courseId = null;
        String enrollmentUserId = null;
        String enrollmentType = null;
        Object enrollmentRole = null;
        Integer enrollmentRoleId = null;
        String enrollmentEnrollmentState = null;
        Integer enrollmentCourseSectionId = null;
        Boolean enrollmentLimitPrivilegesToCourseSection = null;
        Boolean enrollmentNotify = null;
        String enrollmentSelfEnrollmentCode = null;
        Boolean enrollmentSelfEnrolled = null;
        Integer enrollmentAssociatedUserId = null;
        // Enrollment response = api.enrollUserCourses(courseId, enrollmentUserId, enrollmentType, enrollmentRole, enrollmentRoleId, enrollmentEnrollmentState, enrollmentCourseSectionId, enrollmentLimitPrivilegesToCourseSection, enrollmentNotify, enrollmentSelfEnrollmentCode, enrollmentSelfEnrolled, enrollmentAssociatedUserId);

        // TODO: test validations
    }

    /**
     * Enroll a user
     *
     * Create a new user enrollment for a course or section.
     */
    @Test
    public void enrollUserSectionsTest() {
        String sectionId = null;
        String enrollmentUserId = null;
        String enrollmentType = null;
        Object enrollmentRole = null;
        Integer enrollmentRoleId = null;
        String enrollmentEnrollmentState = null;
        Integer enrollmentCourseSectionId = null;
        Boolean enrollmentLimitPrivilegesToCourseSection = null;
        Boolean enrollmentNotify = null;
        String enrollmentSelfEnrollmentCode = null;
        Boolean enrollmentSelfEnrolled = null;
        Integer enrollmentAssociatedUserId = null;
        // Enrollment response = api.enrollUserSections(sectionId, enrollmentUserId, enrollmentType, enrollmentRole, enrollmentRoleId, enrollmentEnrollmentState, enrollmentCourseSectionId, enrollmentLimitPrivilegesToCourseSection, enrollmentNotify, enrollmentSelfEnrollmentCode, enrollmentSelfEnrolled, enrollmentAssociatedUserId);

        // TODO: test validations
    }

    /**
     * Enrollment by ID
     *
     * Get an Enrollment object by Enrollment ID
     */
    @Test
    public void enrollmentByIdTest() {
        String accountId = null;
        Integer id = null;
        // Enrollment response = api.enrollmentById(accountId, id);

        // TODO: test validations
    }

    /**
     * List enrollments
     *
     * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
     */
    @Test
    public void listEnrollmentsCoursesTest() {
        String courseId = null;
        List<String> type = null;
        List<String> role = null;
        List<String> state = null;
        List<String> include = null;
        String userId = null;
        Integer gradingPeriodId = null;
        Integer enrollmentTermId = null;
        List<String> sisAccountId = null;
        List<String> sisCourseId = null;
        List<String> sisSectionId = null;
        List<String> sisUserId = null;
        // List<Enrollment> response = api.listEnrollmentsCourses(courseId, type, role, state, include, userId, gradingPeriodId, enrollmentTermId, sisAccountId, sisCourseId, sisSectionId, sisUserId);

        // TODO: test validations
    }

    /**
     * List enrollments
     *
     * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEnrollmentsCoursesTestQueryMap() {
        String courseId = null;
        EnrollmentsApi.ListEnrollmentsCoursesQueryParams queryParams = new EnrollmentsApi.ListEnrollmentsCoursesQueryParams()
            .type(null)
            .role(null)
            .state(null)
            .include(null)
            .userId(null)
            .gradingPeriodId(null)
            .enrollmentTermId(null)
            .sisAccountId(null)
            .sisCourseId(null)
            .sisSectionId(null)
            .sisUserId(null);
        // List<Enrollment> response = api.listEnrollmentsCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List enrollments
     *
     * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
     */
    @Test
    public void listEnrollmentsSectionsTest() {
        String sectionId = null;
        List<String> type = null;
        List<String> role = null;
        List<String> state = null;
        List<String> include = null;
        String userId = null;
        Integer gradingPeriodId = null;
        Integer enrollmentTermId = null;
        List<String> sisAccountId = null;
        List<String> sisCourseId = null;
        List<String> sisSectionId = null;
        List<String> sisUserId = null;
        // List<Enrollment> response = api.listEnrollmentsSections(sectionId, type, role, state, include, userId, gradingPeriodId, enrollmentTermId, sisAccountId, sisCourseId, sisSectionId, sisUserId);

        // TODO: test validations
    }

    /**
     * List enrollments
     *
     * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEnrollmentsSectionsTestQueryMap() {
        String sectionId = null;
        EnrollmentsApi.ListEnrollmentsSectionsQueryParams queryParams = new EnrollmentsApi.ListEnrollmentsSectionsQueryParams()
            .type(null)
            .role(null)
            .state(null)
            .include(null)
            .userId(null)
            .gradingPeriodId(null)
            .enrollmentTermId(null)
            .sisAccountId(null)
            .sisCourseId(null)
            .sisSectionId(null)
            .sisUserId(null);
        // List<Enrollment> response = api.listEnrollmentsSections(sectionId, queryParams);

    // TODO: test validations
    }
    /**
     * List enrollments
     *
     * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
     */
    @Test
    public void listEnrollmentsUsersTest() {
        String userId = null;
        List<String> type = null;
        List<String> role = null;
        List<String> state = null;
        List<String> include = null;
        Integer gradingPeriodId = null;
        Integer enrollmentTermId = null;
        List<String> sisAccountId = null;
        List<String> sisCourseId = null;
        List<String> sisSectionId = null;
        List<String> sisUserId = null;
        // List<Enrollment> response = api.listEnrollmentsUsers(userId, type, role, state, include, gradingPeriodId, enrollmentTermId, sisAccountId, sisCourseId, sisSectionId, sisUserId);

        // TODO: test validations
    }

    /**
     * List enrollments
     *
     * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEnrollmentsUsersTestQueryMap() {
        String userId = null;
        EnrollmentsApi.ListEnrollmentsUsersQueryParams queryParams = new EnrollmentsApi.ListEnrollmentsUsersQueryParams()
            .type(null)
            .role(null)
            .state(null)
            .include(null)
            .gradingPeriodId(null)
            .enrollmentTermId(null)
            .sisAccountId(null)
            .sisCourseId(null)
            .sisSectionId(null)
            .sisUserId(null);
        // List<Enrollment> response = api.listEnrollmentsUsers(userId, queryParams);

    // TODO: test validations
    }
    /**
     * Re-activate an enrollment
     *
     * Activates an inactive enrollment
     */
    @Test
    public void reActivateEnrollmentTest() {
        String courseId = null;
        String id = null;
        // Enrollment response = api.reActivateEnrollment(courseId, id);

        // TODO: test validations
    }

    /**
     * Reject Course Invitation
     *
     * rejects a pending course invitation for the current user
     */
    @Test
    public void rejectCourseInvitationTest() {
        String courseId = null;
        String id = null;
        // api.rejectCourseInvitation(courseId, id);

        // TODO: test validations
    }

}
