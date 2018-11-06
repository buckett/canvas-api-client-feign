package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
public class AnalyticsApiTest {

    private AnalyticsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AnalyticsApi.class);
    }

    /**
     * Get course-level assignment data
     *
     * Returns a list of assignments for the course sorted by due date. For each assignment returns basic assignment information, the grade breakdown, and a breakdown of on-time/late status of homework submissions.
     */
    @Test
    public void getCourseLevelAssignmentDataTest() {
        String courseId = null;
        Boolean async = null;
        // api.getCourseLevelAssignmentData(courseId, async);

        // TODO: test validations
    }

    /**
     * Get course-level assignment data
     *
     * Returns a list of assignments for the course sorted by due date. For each assignment returns basic assignment information, the grade breakdown, and a breakdown of on-time/late status of homework submissions.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCourseLevelAssignmentDataTestQueryMap() {
        String courseId = null;
        AnalyticsApi.GetCourseLevelAssignmentDataQueryParams queryParams = new AnalyticsApi.GetCourseLevelAssignmentDataQueryParams()
            .async(null);
        // api.getCourseLevelAssignmentData(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Get course-level participation data
     *
     * Returns page view hits and participation numbers grouped by day through the entire history of the course. Page views is returned as a hash, where the hash keys are dates in the format \&quot;YYYY-MM-DD\&quot;. The page_views result set includes page views broken out by access category. Participations is returned as an array of dates in the format \&quot;YYYY-MM-DD\&quot;.
     */
    @Test
    public void getCourseLevelParticipationDataTest() {
        String courseId = null;
        // api.getCourseLevelParticipationData(courseId);

        // TODO: test validations
    }

    /**
     * Get course-level student summary data
     *
     * Returns a summary of per-user access information for all students in a course. This includes total page views, total participations, and a breakdown of on-time/late status for all homework submissions in the course.  Each student&#x27;s summary also includes the maximum number of page views and participations by any student in the course, which may be useful for some visualizations (since determining maximums client side can be tricky with pagination).
     */
    @Test
    public void getCourseLevelStudentSummaryDataTest() {
        String courseId = null;
        String sortColumn = null;
        String studentId = null;
        // api.getCourseLevelStudentSummaryData(courseId, sortColumn, studentId);

        // TODO: test validations
    }

    /**
     * Get course-level student summary data
     *
     * Returns a summary of per-user access information for all students in a course. This includes total page views, total participations, and a breakdown of on-time/late status for all homework submissions in the course.  Each student&#x27;s summary also includes the maximum number of page views and participations by any student in the course, which may be useful for some visualizations (since determining maximums client side can be tricky with pagination).
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getCourseLevelStudentSummaryDataTestQueryMap() {
        String courseId = null;
        AnalyticsApi.GetCourseLevelStudentSummaryDataQueryParams queryParams = new AnalyticsApi.GetCourseLevelStudentSummaryDataQueryParams()
            .sortColumn(null)
            .studentId(null);
        // api.getCourseLevelStudentSummaryData(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Get department-level grade data
     *
     * Returns the distribution of grades for students in courses in the department.  Each data point is one student&#x27;s current grade in one course; if a student is in multiple courses, he contributes one value per course, but if he&#x27;s enrolled multiple times in the same course (e.g. a lecture section and a lab section), he only constributes on value for that course.  Grades are binned to the nearest integer score; anomalous grades outside the 0 to 100 range are ignored. The raw counts are returned, not yet normalized by the total count.  Shares the same variations on endpoint as the participation data.
     */
    @Test
    public void getDepartmentLevelGradeDataCompletedTest() {
        String accountId = null;
        // api.getDepartmentLevelGradeDataCompleted(accountId);

        // TODO: test validations
    }

    /**
     * Get department-level grade data
     *
     * Returns the distribution of grades for students in courses in the department.  Each data point is one student&#x27;s current grade in one course; if a student is in multiple courses, he contributes one value per course, but if he&#x27;s enrolled multiple times in the same course (e.g. a lecture section and a lab section), he only constributes on value for that course.  Grades are binned to the nearest integer score; anomalous grades outside the 0 to 100 range are ignored. The raw counts are returned, not yet normalized by the total count.  Shares the same variations on endpoint as the participation data.
     */
    @Test
    public void getDepartmentLevelGradeDataCurrentTest() {
        String accountId = null;
        // api.getDepartmentLevelGradeDataCurrent(accountId);

        // TODO: test validations
    }

    /**
     * Get department-level grade data
     *
     * Returns the distribution of grades for students in courses in the department.  Each data point is one student&#x27;s current grade in one course; if a student is in multiple courses, he contributes one value per course, but if he&#x27;s enrolled multiple times in the same course (e.g. a lecture section and a lab section), he only constributes on value for that course.  Grades are binned to the nearest integer score; anomalous grades outside the 0 to 100 range are ignored. The raw counts are returned, not yet normalized by the total count.  Shares the same variations on endpoint as the participation data.
     */
    @Test
    public void getDepartmentLevelGradeDataTermsTest() {
        String accountId = null;
        String termId = null;
        // api.getDepartmentLevelGradeDataTerms(accountId, termId);

        // TODO: test validations
    }

    /**
     * Get department-level participation data
     *
     * Returns page view hits summed across all courses in the department. Two groupings of these counts are returned; one by day (+by_date+), the other by category (+by_category+). The possible categories are announcements, assignments, collaborations, conferences, discussions, files, general, grades, groups, modules, other, pages, and quizzes.  This and the other department-level endpoints have three variations which all return the same style of data but for different subsets of courses. All share the prefix /api/v1/accounts/&lt;account_id&gt;/analytics. The possible suffixes are:   * /current: includes all available courses in the default term  * /completed: includes all concluded courses in the default term  * /terms/&lt;term_id&gt;: includes all available or concluded courses in the    given term.  Courses not yet offered or which have been deleted are never included.  /current and /completed are intended for use when the account has only one term. /terms/&lt;term_id&gt; is intended for use when the account has multiple terms.  The action follows the suffix.
     */
    @Test
    public void getDepartmentLevelParticipationDataCompletedTest() {
        String accountId = null;
        // api.getDepartmentLevelParticipationDataCompleted(accountId);

        // TODO: test validations
    }

    /**
     * Get department-level participation data
     *
     * Returns page view hits summed across all courses in the department. Two groupings of these counts are returned; one by day (+by_date+), the other by category (+by_category+). The possible categories are announcements, assignments, collaborations, conferences, discussions, files, general, grades, groups, modules, other, pages, and quizzes.  This and the other department-level endpoints have three variations which all return the same style of data but for different subsets of courses. All share the prefix /api/v1/accounts/&lt;account_id&gt;/analytics. The possible suffixes are:   * /current: includes all available courses in the default term  * /completed: includes all concluded courses in the default term  * /terms/&lt;term_id&gt;: includes all available or concluded courses in the    given term.  Courses not yet offered or which have been deleted are never included.  /current and /completed are intended for use when the account has only one term. /terms/&lt;term_id&gt; is intended for use when the account has multiple terms.  The action follows the suffix.
     */
    @Test
    public void getDepartmentLevelParticipationDataCurrentTest() {
        String accountId = null;
        // api.getDepartmentLevelParticipationDataCurrent(accountId);

        // TODO: test validations
    }

    /**
     * Get department-level participation data
     *
     * Returns page view hits summed across all courses in the department. Two groupings of these counts are returned; one by day (+by_date+), the other by category (+by_category+). The possible categories are announcements, assignments, collaborations, conferences, discussions, files, general, grades, groups, modules, other, pages, and quizzes.  This and the other department-level endpoints have three variations which all return the same style of data but for different subsets of courses. All share the prefix /api/v1/accounts/&lt;account_id&gt;/analytics. The possible suffixes are:   * /current: includes all available courses in the default term  * /completed: includes all concluded courses in the default term  * /terms/&lt;term_id&gt;: includes all available or concluded courses in the    given term.  Courses not yet offered or which have been deleted are never included.  /current and /completed are intended for use when the account has only one term. /terms/&lt;term_id&gt; is intended for use when the account has multiple terms.  The action follows the suffix.
     */
    @Test
    public void getDepartmentLevelParticipationDataTermsTest() {
        String accountId = null;
        String termId = null;
        // api.getDepartmentLevelParticipationDataTerms(accountId, termId);

        // TODO: test validations
    }

    /**
     * Get department-level statistics
     *
     * Returns numeric statistics about the department and term (or filter).  Shares the same variations on endpoint as the participation data.
     */
    @Test
    public void getDepartmentLevelStatisticsCompletedTest() {
        String accountId = null;
        // api.getDepartmentLevelStatisticsCompleted(accountId);

        // TODO: test validations
    }

    /**
     * Get department-level statistics
     *
     * Returns numeric statistics about the department and term (or filter).  Shares the same variations on endpoint as the participation data.
     */
    @Test
    public void getDepartmentLevelStatisticsCurrentTest() {
        String accountId = null;
        // api.getDepartmentLevelStatisticsCurrent(accountId);

        // TODO: test validations
    }

    /**
     * Get department-level statistics
     *
     * Returns numeric statistics about the department and term (or filter).  Shares the same variations on endpoint as the participation data.
     */
    @Test
    public void getDepartmentLevelStatisticsTermsTest() {
        String accountId = null;
        String termId = null;
        // api.getDepartmentLevelStatisticsTerms(accountId, termId);

        // TODO: test validations
    }

    /**
     * Get user-in-a-course-level assignment data
     *
     * Returns a list of assignments for the course sorted by due date. For each assignment returns basic assignment information, the grade breakdown (including the student&#x27;s actual grade), and the basic submission information for the student&#x27;s submission if it exists.
     */
    @Test
    public void getUserInACourseLevelAssignmentDataTest() {
        String courseId = null;
        String studentId = null;
        // api.getUserInACourseLevelAssignmentData(courseId, studentId);

        // TODO: test validations
    }

    /**
     * Get user-in-a-course-level messaging data
     *
     * Returns messaging \&quot;hits\&quot; grouped by day through the entire history of the course. Returns a hash containing the number of instructor-to-student messages, and student-to-instructor messages, where the hash keys are dates in the format \&quot;YYYY-MM-DD\&quot;. Message hits include Conversation messages and comments on homework submissions.
     */
    @Test
    public void getUserInACourseLevelMessagingDataTest() {
        String courseId = null;
        String studentId = null;
        // api.getUserInACourseLevelMessagingData(courseId, studentId);

        // TODO: test validations
    }

    /**
     * Get user-in-a-course-level participation data
     *
     * Returns page view hits grouped by hour, and participation details through the entire history of the course.  &#x60;page_views&#x60; are returned as a hash, where the keys are iso8601 dates, bucketed by the hour. &#x60;participations&#x60; are returned as an array of hashes, sorted oldest to newest.
     */
    @Test
    public void getUserInACourseLevelParticipationDataTest() {
        String courseId = null;
        String studentId = null;
        // api.getUserInACourseLevelParticipationData(courseId, studentId);

        // TODO: test validations
    }

}
