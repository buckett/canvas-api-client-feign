package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;


import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AnalyticsApi extends ApiClient.Api {

  /**
   * Get course-level assignment data
   * Returns a list of assignments for the course sorted by due date. For each assignment returns basic assignment information, the grade breakdown, and a breakdown of on-time/late status of homework submissions.
   * @param courseId ID (required)
   * @param async If async is true, then the course_assignments call can happen asynch- ronously and MAY return a response containing a progress_url key instead of an assignments array. If it does, then it is the caller&#x27;s responsibility to poll the API again to see if the progress is complete. If the data is ready (possibly even on the first async call) then it will be passed back normally, as documented in the example response. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/assignments?async={async}")
  @Headers({
      "Accept: */*",
  })
  void getCourseLevelAssignmentData(@Param("courseId") String courseId, @Param("async") Boolean async);
  

  /**
   * Get course-level assignment data
   * Returns a list of assignments for the course sorted by due date. For each assignment returns basic assignment information, the grade breakdown, and a breakdown of on-time/late status of homework submissions.
   * Note, this is equivalent to the other <code>getCourseLevelAssignmentData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCourseLevelAssignmentDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>async - If async is true, then the course_assignments call can happen asynch- ronously and MAY return a response containing a progress_url key instead of an assignments array. If it does, then it is the caller&#x27;s responsibility to poll the API again to see if the progress is complete. If the data is ready (possibly even on the first async call) then it will be passed back normally, as documented in the example response. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/assignments?async={async}")
  @Headers({
      "Content-Type: */*",
  })
  void getCourseLevelAssignmentData(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCourseLevelAssignmentData</code> method in a fluent style.
   */
  public static class GetCourseLevelAssignmentDataQueryParams extends HashMap<String, Object> {
    public GetCourseLevelAssignmentDataQueryParams async(final Boolean value) {
      put("async", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get course-level participation data
   * Returns page view hits and participation numbers grouped by day through the entire history of the course. Page views is returned as a hash, where the hash keys are dates in the format \&quot;YYYY-MM-DD\&quot;. The page_views result set includes page views broken out by access category. Participations is returned as an array of dates in the format \&quot;YYYY-MM-DD\&quot;.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/activity")
  @Headers({
      "Accept: */*",
  })
  void getCourseLevelParticipationData(@Param("courseId") String courseId);
  
  /**
   * Get course-level student summary data
   * Returns a summary of per-user access information for all students in a course. This includes total page views, total participations, and a breakdown of on-time/late status for all homework submissions in the course.  Each student&#x27;s summary also includes the maximum number of page views and participations by any student in the course, which may be useful for some visualizations (since determining maximums client side can be tricky with pagination).
   * @param courseId ID (required)
   * @param sortColumn The order results in which results are returned.  Defaults to \&quot;name\&quot;. (optional)
   * @param studentId If set, returns only the specified student. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/student_summaries?sort_column={sortColumn}&student_id={studentId}")
  @Headers({
      "Accept: */*",
  })
  void getCourseLevelStudentSummaryData(@Param("courseId") String courseId, @Param("sortColumn") String sortColumn, @Param("studentId") String studentId);
  

  /**
   * Get course-level student summary data
   * Returns a summary of per-user access information for all students in a course. This includes total page views, total participations, and a breakdown of on-time/late status for all homework submissions in the course.  Each student&#x27;s summary also includes the maximum number of page views and participations by any student in the course, which may be useful for some visualizations (since determining maximums client side can be tricky with pagination).
   * Note, this is equivalent to the other <code>getCourseLevelStudentSummaryData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCourseLevelStudentSummaryDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sortColumn - The order results in which results are returned.  Defaults to \&quot;name\&quot;. (optional)</li>
   *   <li>studentId - If set, returns only the specified student. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/student_summaries?sort_column={sortColumn}&student_id={studentId}")
  @Headers({
      "Content-Type: */*",
  })
  void getCourseLevelStudentSummaryData(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getCourseLevelStudentSummaryData</code> method in a fluent style.
   */
  public static class GetCourseLevelStudentSummaryDataQueryParams extends HashMap<String, Object> {
    public GetCourseLevelStudentSummaryDataQueryParams sortColumn(final String value) {
      put("sort_column", EncodingUtils.encode(value));
      return this;
    }
    public GetCourseLevelStudentSummaryDataQueryParams studentId(final String value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get department-level grade data
   * Returns the distribution of grades for students in courses in the department.  Each data point is one student&#x27;s current grade in one course; if a student is in multiple courses, he contributes one value per course, but if he&#x27;s enrolled multiple times in the same course (e.g. a lecture section and a lab section), he only constributes on value for that course.  Grades are binned to the nearest integer score; anomalous grades outside the 0 to 100 range are ignored. The raw counts are returned, not yet normalized by the total count.  Shares the same variations on endpoint as the participation data.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/completed/grades")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelGradeDataCompleted(@Param("accountId") String accountId);
  
  /**
   * Get department-level grade data
   * Returns the distribution of grades for students in courses in the department.  Each data point is one student&#x27;s current grade in one course; if a student is in multiple courses, he contributes one value per course, but if he&#x27;s enrolled multiple times in the same course (e.g. a lecture section and a lab section), he only constributes on value for that course.  Grades are binned to the nearest integer score; anomalous grades outside the 0 to 100 range are ignored. The raw counts are returned, not yet normalized by the total count.  Shares the same variations on endpoint as the participation data.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/current/grades")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelGradeDataCurrent(@Param("accountId") String accountId);
  
  /**
   * Get department-level grade data
   * Returns the distribution of grades for students in courses in the department.  Each data point is one student&#x27;s current grade in one course; if a student is in multiple courses, he contributes one value per course, but if he&#x27;s enrolled multiple times in the same course (e.g. a lecture section and a lab section), he only constributes on value for that course.  Grades are binned to the nearest integer score; anomalous grades outside the 0 to 100 range are ignored. The raw counts are returned, not yet normalized by the total count.  Shares the same variations on endpoint as the participation data.
   * @param accountId ID (required)
   * @param termId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/terms/{termId}/grades")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelGradeDataTerms(@Param("accountId") String accountId, @Param("termId") String termId);
  
  /**
   * Get department-level participation data
   * Returns page view hits summed across all courses in the department. Two groupings of these counts are returned; one by day (+by_date+), the other by category (+by_category+). The possible categories are announcements, assignments, collaborations, conferences, discussions, files, general, grades, groups, modules, other, pages, and quizzes.  This and the other department-level endpoints have three variations which all return the same style of data but for different subsets of courses. All share the prefix /api/v1/accounts/&lt;account_id&gt;/analytics. The possible suffixes are:   * /current: includes all available courses in the default term  * /completed: includes all concluded courses in the default term  * /terms/&lt;term_id&gt;: includes all available or concluded courses in the    given term.  Courses not yet offered or which have been deleted are never included.  /current and /completed are intended for use when the account has only one term. /terms/&lt;term_id&gt; is intended for use when the account has multiple terms.  The action follows the suffix.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/completed/activity")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelParticipationDataCompleted(@Param("accountId") String accountId);
  
  /**
   * Get department-level participation data
   * Returns page view hits summed across all courses in the department. Two groupings of these counts are returned; one by day (+by_date+), the other by category (+by_category+). The possible categories are announcements, assignments, collaborations, conferences, discussions, files, general, grades, groups, modules, other, pages, and quizzes.  This and the other department-level endpoints have three variations which all return the same style of data but for different subsets of courses. All share the prefix /api/v1/accounts/&lt;account_id&gt;/analytics. The possible suffixes are:   * /current: includes all available courses in the default term  * /completed: includes all concluded courses in the default term  * /terms/&lt;term_id&gt;: includes all available or concluded courses in the    given term.  Courses not yet offered or which have been deleted are never included.  /current and /completed are intended for use when the account has only one term. /terms/&lt;term_id&gt; is intended for use when the account has multiple terms.  The action follows the suffix.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/current/activity")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelParticipationDataCurrent(@Param("accountId") String accountId);
  
  /**
   * Get department-level participation data
   * Returns page view hits summed across all courses in the department. Two groupings of these counts are returned; one by day (+by_date+), the other by category (+by_category+). The possible categories are announcements, assignments, collaborations, conferences, discussions, files, general, grades, groups, modules, other, pages, and quizzes.  This and the other department-level endpoints have three variations which all return the same style of data but for different subsets of courses. All share the prefix /api/v1/accounts/&lt;account_id&gt;/analytics. The possible suffixes are:   * /current: includes all available courses in the default term  * /completed: includes all concluded courses in the default term  * /terms/&lt;term_id&gt;: includes all available or concluded courses in the    given term.  Courses not yet offered or which have been deleted are never included.  /current and /completed are intended for use when the account has only one term. /terms/&lt;term_id&gt; is intended for use when the account has multiple terms.  The action follows the suffix.
   * @param accountId ID (required)
   * @param termId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/terms/{termId}/activity")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelParticipationDataTerms(@Param("accountId") String accountId, @Param("termId") String termId);
  
  /**
   * Get department-level statistics
   * Returns numeric statistics about the department and term (or filter).  Shares the same variations on endpoint as the participation data.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/completed/statistics")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelStatisticsCompleted(@Param("accountId") String accountId);
  
  /**
   * Get department-level statistics
   * Returns numeric statistics about the department and term (or filter).  Shares the same variations on endpoint as the participation data.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/current/statistics")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelStatisticsCurrent(@Param("accountId") String accountId);
  
  /**
   * Get department-level statistics
   * Returns numeric statistics about the department and term (or filter).  Shares the same variations on endpoint as the participation data.
   * @param accountId ID (required)
   * @param termId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/analytics/terms/{termId}/statistics")
  @Headers({
      "Accept: */*",
  })
  void getDepartmentLevelStatisticsTerms(@Param("accountId") String accountId, @Param("termId") String termId);
  
  /**
   * Get user-in-a-course-level assignment data
   * Returns a list of assignments for the course sorted by due date. For each assignment returns basic assignment information, the grade breakdown (including the student&#x27;s actual grade), and the basic submission information for the student&#x27;s submission if it exists.
   * @param courseId ID (required)
   * @param studentId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/users/{studentId}/assignments")
  @Headers({
      "Accept: */*",
  })
  void getUserInACourseLevelAssignmentData(@Param("courseId") String courseId, @Param("studentId") String studentId);
  
  /**
   * Get user-in-a-course-level messaging data
   * Returns messaging \&quot;hits\&quot; grouped by day through the entire history of the course. Returns a hash containing the number of instructor-to-student messages, and student-to-instructor messages, where the hash keys are dates in the format \&quot;YYYY-MM-DD\&quot;. Message hits include Conversation messages and comments on homework submissions.
   * @param courseId ID (required)
   * @param studentId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/users/{studentId}/communication")
  @Headers({
      "Accept: */*",
  })
  void getUserInACourseLevelMessagingData(@Param("courseId") String courseId, @Param("studentId") String studentId);
  
  /**
   * Get user-in-a-course-level participation data
   * Returns page view hits grouped by hour, and participation details through the entire history of the course.  &#x60;page_views&#x60; are returned as a hash, where the keys are iso8601 dates, bucketed by the hour. &#x60;participations&#x60; are returned as an array of hashes, sorted oldest to newest.
   * @param courseId ID (required)
   * @param studentId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/analytics/users/{studentId}/activity")
  @Headers({
      "Accept: */*",
  })
  void getUserInACourseLevelParticipationData(@Param("courseId") String courseId, @Param("studentId") String studentId);
  
}
