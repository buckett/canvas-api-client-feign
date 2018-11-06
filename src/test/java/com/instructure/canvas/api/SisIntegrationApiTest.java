package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SisIntegrationApi
 */
public class SisIntegrationApiTest {

    private SisIntegrationApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SisIntegrationApi.class);
    }

    /**
     * Disable assignments currently enabled for grade export to SIS
     *
     * Disable all assignments flagged as \&quot;post_to_sis\&quot;, with the option of making it specific to a grading period, in a course.  On success, the response will be 204 No Content with an empty body.  On failure, the response will be 400 Bad Request with a body of a specific message.  For disabling assignments in a specific grading period
     */
    @Test
    public void disableAssignmentsCurrentlyEnabledForGradeExportToSisTest() {
        Integer courseId = null;
        Integer gradingPeriodId = null;
        // api.disableAssignmentsCurrentlyEnabledForGradeExportToSis(courseId, gradingPeriodId);

        // TODO: test validations
    }

    /**
     * Retrieve assignments enabled for grade export to SIS
     *
     * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
     */
    @Test
    public void retrieveAssignmentsEnabledForGradeExportToSisAccountsTest() {
        Integer accountId = null;
        Integer courseId = null;
        String startsBefore = null;
        String endsAfter = null;
        String include = null;
        // api.retrieveAssignmentsEnabledForGradeExportToSisAccounts(accountId, courseId, startsBefore, endsAfter, include);

        // TODO: test validations
    }

    /**
     * Retrieve assignments enabled for grade export to SIS
     *
     * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void retrieveAssignmentsEnabledForGradeExportToSisAccountsTestQueryMap() {
        Integer accountId = null;
        SisIntegrationApi.RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams queryParams = new SisIntegrationApi.RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams()
            .courseId(null)
            .startsBefore(null)
            .endsAfter(null)
            .include(null);
        // api.retrieveAssignmentsEnabledForGradeExportToSisAccounts(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Retrieve assignments enabled for grade export to SIS
     *
     * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
     */
    @Test
    public void retrieveAssignmentsEnabledForGradeExportToSisCoursesTest() {
        Integer courseId = null;
        Integer accountId = null;
        String startsBefore = null;
        String endsAfter = null;
        String include = null;
        // api.retrieveAssignmentsEnabledForGradeExportToSisCourses(courseId, accountId, startsBefore, endsAfter, include);

        // TODO: test validations
    }

    /**
     * Retrieve assignments enabled for grade export to SIS
     *
     * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void retrieveAssignmentsEnabledForGradeExportToSisCoursesTestQueryMap() {
        Integer courseId = null;
        SisIntegrationApi.RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams queryParams = new SisIntegrationApi.RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams()
            .accountId(null)
            .startsBefore(null)
            .endsAfter(null)
            .include(null);
        // api.retrieveAssignmentsEnabledForGradeExportToSisCourses(courseId, queryParams);

    // TODO: test validations
    }
}
