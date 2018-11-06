package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Course;
import com.instructure.canvas.model.Progress;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CoursesApi
 */
public class CoursesApiTest {

    private CoursesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CoursesApi.class);
    }

    /**
     * Copy course content
     *
     * DEPRECATED: Please use the {api:ContentMigrationsController#create Content Migrations API}  Copies content from one course into another. The default is to copy all course content. You can control specific types to copy by using either the &#x27;except&#x27; option or the &#x27;only&#x27; option.  The response is the same as the course copy status endpoint
     */
    @Test
    public void copyCourseContentTest() {
        String courseId = null;
        String sourceCourse = null;
        List<String> except = null;
        List<String> only = null;
        // api.copyCourseContent(courseId, sourceCourse, except, only);

        // TODO: test validations
    }

    /**
     * Course activity stream
     *
     * Returns the current user&#x27;s course-specific activity stream, paginated.  For full documentation, see the API documentation for the user activity stream, in the user api.
     */
    @Test
    public void courseActivityStreamTest() {
        String courseId = null;
        // api.courseActivityStream(courseId);

        // TODO: test validations
    }

    /**
     * Course activity stream summary
     *
     * Returns a summary of the current user&#x27;s course-specific activity stream.  For full documentation, see the API documentation for the user activity stream summary, in the user api.
     */
    @Test
    public void courseActivityStreamSummaryTest() {
        String courseId = null;
        // api.courseActivityStreamSummary(courseId);

        // TODO: test validations
    }

    /**
     * Course TODO items
     *
     * Returns the current user&#x27;s course-specific todo items.  For full documentation, see the API documentation for the user todo items, in the user api.
     */
    @Test
    public void courseTodoItemsTest() {
        String courseId = null;
        // api.courseTodoItems(courseId);

        // TODO: test validations
    }

    /**
     * Create a new course
     *
     * Create a new course
     */
    @Test
    public void createNewCourseTest() {
        String accountId = null;
        String courseName = null;
        String courseCourseCode = null;
        String courseStartAt = null;
        String courseEndAt = null;
        String courseLicense = null;
        Boolean courseIsPublic = null;
        Boolean courseIsPublicToAuthUsers = null;
        Boolean coursePublicSyllabus = null;
        Boolean coursePublicSyllabusToAuth = null;
        String coursePublicDescription = null;
        Boolean courseAllowStudentWikiEdits = null;
        Boolean courseAllowWikiComments = null;
        Boolean courseAllowStudentForumAttachments = null;
        Boolean courseOpenEnrollment = null;
        Boolean courseSelfEnrollment = null;
        Boolean courseRestrictEnrollmentsToCourseDates = null;
        Integer courseTermId = null;
        String courseSisCourseId = null;
        String courseIntegrationId = null;
        Boolean courseHideFinalGrades = null;
        Boolean courseApplyAssignmentGroupWeights = null;
        String courseTimeZone = null;
        Boolean offer = null;
        Boolean enrollMe = null;
        String courseDefaultView = null;
        String courseSyllabusBody = null;
        Integer courseGradingStandardId = null;
        String courseCourseFormat = null;
        Boolean enableSisReactivation = null;
        // Course response = api.createNewCourse(accountId, courseName, courseCourseCode, courseStartAt, courseEndAt, courseLicense, courseIsPublic, courseIsPublicToAuthUsers, coursePublicSyllabus, coursePublicSyllabusToAuth, coursePublicDescription, courseAllowStudentWikiEdits, courseAllowWikiComments, courseAllowStudentForumAttachments, courseOpenEnrollment, courseSelfEnrollment, courseRestrictEnrollmentsToCourseDates, courseTermId, courseSisCourseId, courseIntegrationId, courseHideFinalGrades, courseApplyAssignmentGroupWeights, courseTimeZone, offer, enrollMe, courseDefaultView, courseSyllabusBody, courseGradingStandardId, courseCourseFormat, enableSisReactivation);

        // TODO: test validations
    }

    /**
     * Delete/Conclude a course
     *
     * Delete or conclude an existing course
     */
    @Test
    public void deleteConcludeCourseTest() {
        String id = null;
        String event = null;
        // api.deleteConcludeCourse(id, event);

        // TODO: test validations
    }

    /**
     * Delete/Conclude a course
     *
     * Delete or conclude an existing course
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteConcludeCourseTestQueryMap() {
        String id = null;
        CoursesApi.DeleteConcludeCourseQueryParams queryParams = new CoursesApi.DeleteConcludeCourseQueryParams()
            .event(null);
        // api.deleteConcludeCourse(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get course copy status
     *
     * DEPRECATED: Please use the {api:ContentMigrationsController#create Content Migrations API}  Retrieve the status of a course copy
     */
    @Test
    public void getCourseCopyStatusTest() {
        String courseId = null;
        String id = null;
        // api.getCourseCopyStatus(courseId, id);

        // TODO: test validations
    }

    /**
     * Get course settings
     *
     * Returns some of a course&#x27;s settings.
     */
    @Test
    public void getCourseSettingsTest() {
        String courseId = null;
        // api.getCourseSettings(courseId);

        // TODO: test validations
    }

    /**
     * Get effective due dates
     *
     * For each assignment in the course, returns each assigned student&#x27;s ID and their corresponding due date along with some grading period data. Returns a collection with keys representing assignment IDs and values as a collection containing keys representing student IDs and values representing the student&#x27;s effective due_at, the grading_period_id of which the due_at falls in, and whether or not the grading period is closed (in_closed_grading_period)  The list of assignment IDs for which effective student due dates are requested. If not provided, all assignments in the course will be used.
     */
    @Test
    public void getEffectiveDueDatesTest() {
        String courseId = null;
        List<String> assignmentIds = null;
        // api.getEffectiveDueDates(courseId, assignmentIds);

        // TODO: test validations
    }

    /**
     * Get effective due dates
     *
     * For each assignment in the course, returns each assigned student&#x27;s ID and their corresponding due date along with some grading period data. Returns a collection with keys representing assignment IDs and values as a collection containing keys representing student IDs and values representing the student&#x27;s effective due_at, the grading_period_id of which the due_at falls in, and whether or not the grading period is closed (in_closed_grading_period)  The list of assignment IDs for which effective student due dates are requested. If not provided, all assignments in the course will be used.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEffectiveDueDatesTestQueryMap() {
        String courseId = null;
        CoursesApi.GetEffectiveDueDatesQueryParams queryParams = new CoursesApi.GetEffectiveDueDatesQueryParams()
            .assignmentIds(null);
        // api.getEffectiveDueDates(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single course
     *
     * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
     */
    @Test
    public void getSingleCourseAccountsTest() {
        String accountId = null;
        String id = null;
        List<String> include = null;
        // Course response = api.getSingleCourseAccounts(accountId, id, include);

        // TODO: test validations
    }

    /**
     * Get a single course
     *
     * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleCourseAccountsTestQueryMap() {
        String accountId = null;
        String id = null;
        CoursesApi.GetSingleCourseAccountsQueryParams queryParams = new CoursesApi.GetSingleCourseAccountsQueryParams()
            .include(null);
        // Course response = api.getSingleCourseAccounts(accountId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single course
     *
     * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
     */
    @Test
    public void getSingleCourseCoursesTest() {
        String id = null;
        List<String> include = null;
        // Course response = api.getSingleCourseCourses(id, include);

        // TODO: test validations
    }

    /**
     * Get a single course
     *
     * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleCourseCoursesTestQueryMap() {
        String id = null;
        CoursesApi.GetSingleCourseCoursesQueryParams queryParams = new CoursesApi.GetSingleCourseCoursesQueryParams()
            .include(null);
        // Course response = api.getSingleCourseCourses(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get single user
     *
     * Return information on a single user.  Accepts the same include[] parameters as the :users: action, and returns a single user with the same fields as that action.
     */
    @Test
    public void getSingleUserTest() {
        String courseId = null;
        String id = null;
        // User response = api.getSingleUser(courseId, id);

        // TODO: test validations
    }

    /**
     * List courses for a user
     *
     * Returns a paginated list of active courses for this user. To view the course list for a user other than yourself, you must be either an observer of that user or an administrator.
     */
    @Test
    public void listCoursesForUserTest() {
        String userId = null;
        List<String> include = null;
        List<String> state = null;
        String enrollmentState = null;
        // List<Course> response = api.listCoursesForUser(userId, include, state, enrollmentState);

        // TODO: test validations
    }

    /**
     * List courses for a user
     *
     * Returns a paginated list of active courses for this user. To view the course list for a user other than yourself, you must be either an observer of that user or an administrator.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCoursesForUserTestQueryMap() {
        String userId = null;
        CoursesApi.ListCoursesForUserQueryParams queryParams = new CoursesApi.ListCoursesForUserQueryParams()
            .include(null)
            .state(null)
            .enrollmentState(null);
        // List<Course> response = api.listCoursesForUser(userId, queryParams);

    // TODO: test validations
    }
    /**
     * List recently logged in students
     *
     * Returns the paginated list of users in this course, ordered by how recently they have logged in. The records include the &#x27;last_login&#x27; field which contains a timestamp of the last time that user logged into canvas.  The querying user must have the &#x27;View usage reports&#x27; permission.
     */
    @Test
    public void listRecentlyLoggedInStudentsTest() {
        String courseId = null;
        // List<User> response = api.listRecentlyLoggedInStudents(courseId);

        // TODO: test validations
    }

    /**
     * List students
     *
     * Returns the paginated list of students enrolled in this course.  DEPRECATED: Please use the {api:CoursesController#users course users} endpoint and pass \&quot;student\&quot; as the enrollment_type.
     */
    @Test
    public void listStudentsTest() {
        String courseId = null;
        // List<User> response = api.listStudents(courseId);

        // TODO: test validations
    }

    /**
     * List users in course
     *
     * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
     */
    @Test
    public void listUsersInCourseSearchUsersTest() {
        String courseId = null;
        String searchTerm = null;
        List<String> enrollmentType = null;
        String enrollmentRole = null;
        Integer enrollmentRoleId = null;
        List<String> include = null;
        String userId = null;
        List<Integer> userIds = null;
        List<String> enrollmentState = null;
        // List<User> response = api.listUsersInCourseSearchUsers(courseId, searchTerm, enrollmentType, enrollmentRole, enrollmentRoleId, include, userId, userIds, enrollmentState);

        // TODO: test validations
    }

    /**
     * List users in course
     *
     * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUsersInCourseSearchUsersTestQueryMap() {
        String courseId = null;
        CoursesApi.ListUsersInCourseSearchUsersQueryParams queryParams = new CoursesApi.ListUsersInCourseSearchUsersQueryParams()
            .searchTerm(null)
            .enrollmentType(null)
            .enrollmentRole(null)
            .enrollmentRoleId(null)
            .include(null)
            .userId(null)
            .userIds(null)
            .enrollmentState(null);
        // List<User> response = api.listUsersInCourseSearchUsers(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List users in course
     *
     * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
     */
    @Test
    public void listUsersInCourseUsersTest() {
        String courseId = null;
        String searchTerm = null;
        List<String> enrollmentType = null;
        String enrollmentRole = null;
        Integer enrollmentRoleId = null;
        List<String> include = null;
        String userId = null;
        List<Integer> userIds = null;
        List<String> enrollmentState = null;
        // List<User> response = api.listUsersInCourseUsers(courseId, searchTerm, enrollmentType, enrollmentRole, enrollmentRoleId, include, userId, userIds, enrollmentState);

        // TODO: test validations
    }

    /**
     * List users in course
     *
     * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUsersInCourseUsersTestQueryMap() {
        String courseId = null;
        CoursesApi.ListUsersInCourseUsersQueryParams queryParams = new CoursesApi.ListUsersInCourseUsersQueryParams()
            .searchTerm(null)
            .enrollmentType(null)
            .enrollmentRole(null)
            .enrollmentRoleId(null)
            .include(null)
            .userId(null)
            .userIds(null)
            .enrollmentState(null);
        // List<User> response = api.listUsersInCourseUsers(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List your courses
     *
     * Returns the paginated list of active courses for the current user.
     */
    @Test
    public void listYourCoursesTest() {
        String enrollmentType = null;
        String enrollmentRole = null;
        Integer enrollmentRoleId = null;
        String enrollmentState = null;
        Boolean excludeBlueprintCourses = null;
        List<String> include = null;
        List<String> state = null;
        // List<Course> response = api.listYourCourses(enrollmentType, enrollmentRole, enrollmentRoleId, enrollmentState, excludeBlueprintCourses, include, state);

        // TODO: test validations
    }

    /**
     * List your courses
     *
     * Returns the paginated list of active courses for the current user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listYourCoursesTestQueryMap() {
        CoursesApi.ListYourCoursesQueryParams queryParams = new CoursesApi.ListYourCoursesQueryParams()
            .enrollmentType(null)
            .enrollmentRole(null)
            .enrollmentRoleId(null)
            .enrollmentState(null)
            .excludeBlueprintCourses(null)
            .include(null)
            .state(null);
        // List<Course> response = api.listYourCourses(queryParams);

    // TODO: test validations
    }
    /**
     * Permissions
     *
     * Returns permission information for the calling user in the given course. See also the {api:AccountsController#permissions Account} and {api:GroupsController#permissions Group} counterparts.
     */
    @Test
    public void permissionsTest() {
        String courseId = null;
        List<String> permissions = null;
        // api.permissions(courseId, permissions);

        // TODO: test validations
    }

    /**
     * Permissions
     *
     * Returns permission information for the calling user in the given course. See also the {api:AccountsController#permissions Account} and {api:GroupsController#permissions Group} counterparts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void permissionsTestQueryMap() {
        String courseId = null;
        CoursesApi.PermissionsQueryParams queryParams = new CoursesApi.PermissionsQueryParams()
            .permissions(null);
        // api.permissions(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Preview processed html
     *
     * Preview html content processed for this course
     */
    @Test
    public void previewProcessedHtmlTest() {
        String courseId = null;
        String html = null;
        // api.previewProcessedHtml(courseId, html);

        // TODO: test validations
    }

    /**
     * Reset a course
     *
     * Deletes the current course, and creates a new equivalent course with no content, but all sections and users moved over.
     */
    @Test
    public void resetCourseTest() {
        String courseId = null;
        // Course response = api.resetCourse(courseId);

        // TODO: test validations
    }

    /**
     * Update a course
     *
     * Update an existing course.  Arguments are the same as Courses#create, with a few exceptions (enroll_me).  If a user has content management rights, but not full course editing rights, the only attribute editable through this endpoint will be \&quot;syllabus_body\&quot;
     */
    @Test
    public void updateCourseTest() {
        String id = null;
        Integer courseAccountId = null;
        String courseName = null;
        String courseCourseCode = null;
        String courseStartAt = null;
        String courseEndAt = null;
        String courseLicense = null;
        Boolean courseIsPublic = null;
        Boolean courseIsPublicToAuthUsers = null;
        Boolean coursePublicSyllabus = null;
        Boolean coursePublicSyllabusToAuth = null;
        String coursePublicDescription = null;
        Boolean courseAllowStudentWikiEdits = null;
        Boolean courseAllowWikiComments = null;
        Boolean courseAllowStudentForumAttachments = null;
        Boolean courseOpenEnrollment = null;
        Boolean courseSelfEnrollment = null;
        Boolean courseRestrictEnrollmentsToCourseDates = null;
        Integer courseTermId = null;
        String courseSisCourseId = null;
        String courseIntegrationId = null;
        Boolean courseHideFinalGrades = null;
        String courseTimeZone = null;
        Boolean courseApplyAssignmentGroupWeights = null;
        Integer courseStorageQuotaMb = null;
        Boolean offer = null;
        String courseEvent = null;
        String courseDefaultView = null;
        String courseSyllabusBody = null;
        Integer courseGradingStandardId = null;
        String courseCourseFormat = null;
        Integer courseImageId = null;
        String courseImageUrl = null;
        Boolean courseRemoveImage = null;
        Boolean courseBlueprint = null;
        Object courseBlueprintRestrictions = null;
        Boolean courseUseBlueprintRestrictionsByObjectType = null;
        Object courseBlueprintRestrictionsByObjectType = null;
        // api.updateCourse(id, courseAccountId, courseName, courseCourseCode, courseStartAt, courseEndAt, courseLicense, courseIsPublic, courseIsPublicToAuthUsers, coursePublicSyllabus, coursePublicSyllabusToAuth, coursePublicDescription, courseAllowStudentWikiEdits, courseAllowWikiComments, courseAllowStudentForumAttachments, courseOpenEnrollment, courseSelfEnrollment, courseRestrictEnrollmentsToCourseDates, courseTermId, courseSisCourseId, courseIntegrationId, courseHideFinalGrades, courseTimeZone, courseApplyAssignmentGroupWeights, courseStorageQuotaMb, offer, courseEvent, courseDefaultView, courseSyllabusBody, courseGradingStandardId, courseCourseFormat, courseImageId, courseImageUrl, courseRemoveImage, courseBlueprint, courseBlueprintRestrictions, courseUseBlueprintRestrictionsByObjectType, courseBlueprintRestrictionsByObjectType);

        // TODO: test validations
    }

    /**
     * Update course settings
     *
     * Can update the following course settings:
     */
    @Test
    public void updateCourseSettingsTest() {
        String courseId = null;
        Boolean allowStudentDiscussionTopics = null;
        Boolean allowStudentForumAttachments = null;
        Boolean allowStudentDiscussionEditing = null;
        Boolean allowStudentOrganizedGroups = null;
        Boolean hideFinalGrades = null;
        Boolean hideDistributionGraphs = null;
        Boolean lockAllAnnouncements = null;
        Boolean restrictStudentPastView = null;
        Boolean restrictStudentFutureView = null;
        Boolean showAnnouncementsOnHomePage = null;
        Integer homePageAnnouncementLimit = null;
        // api.updateCourseSettings(courseId, allowStudentDiscussionTopics, allowStudentForumAttachments, allowStudentDiscussionEditing, allowStudentOrganizedGroups, hideFinalGrades, hideDistributionGraphs, lockAllAnnouncements, restrictStudentPastView, restrictStudentFutureView, showAnnouncementsOnHomePage, homePageAnnouncementLimit);

        // TODO: test validations
    }

    /**
     * Update courses
     *
     * Update multiple courses in an account.  Operates asynchronously; use the {api:ProgressController#show progress endpoint} to query the status of an operation.  The action to take on each course.  Must be one of &#x27;offer&#x27;, &#x27;conclude&#x27;, &#x27;delete&#x27;, or &#x27;undelete&#x27;.   * &#x27;offer&#x27; makes a course visible to students. This action is also called \&quot;publish\&quot; on the web site.   * &#x27;conclude&#x27; prevents future enrollments and makes a course read-only for all participants. The course still appears     in prior-enrollment lists.   * &#x27;delete&#x27; completely removes the course from the web site (including course menus and prior-enrollment lists).     All enrollments are deleted. Course content may be physically deleted at a future date.   * &#x27;undelete&#x27; attempts to recover a course that has been deleted. (Recovery is not guaranteed; please conclude     rather than delete a course if there is any possibility the course will be used again.) The recovered course     will be unpublished. Deleted enrollments will not be recovered.
     */
    @Test
    public void updateCoursesTest() {
        String accountId = null;
        List<String> courseIds = null;
        String event = null;
        // Progress response = api.updateCourses(accountId, courseIds, event);

        // TODO: test validations
    }

}
