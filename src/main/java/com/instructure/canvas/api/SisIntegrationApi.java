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
public interface SisIntegrationApi extends ApiClient.Api {

  /**
   * Disable assignments currently enabled for grade export to SIS
   * Disable all assignments flagged as \&quot;post_to_sis\&quot;, with the option of making it specific to a grading period, in a course.  On success, the response will be 204 No Content with an empty body.  On failure, the response will be 400 Bad Request with a body of a specific message.  For disabling assignments in a specific grading period
   * @param courseId The ID of the course. (required)
   * @param gradingPeriodId  (optional)
   */
  @RequestLine("PUT /sis/courses/{courseId}/disable_post_to_sis")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void disableAssignmentsCurrentlyEnabledForGradeExportToSis(@Param("courseId") Integer courseId, @Param("gradingPeriodId") Integer gradingPeriodId);
  
  /**
   * Retrieve assignments enabled for grade export to SIS
   * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
   * @param accountId The ID of the account to query. (required)
   * @param courseId The ID of the course to query. (optional)
   * @param startsBefore When searching on an account, (optional)
   * @param endsAfter When searching on an account, (optional)
   * @param include Array of additional (optional)
   */
  @RequestLine("GET /sis/accounts/{accountId}/assignments?course_id={courseId}&starts_before={startsBefore}&ends_after={endsAfter}&include={include}")
  @Headers({
      "Accept: */*",
  })
  void retrieveAssignmentsEnabledForGradeExportToSisAccounts(@Param("accountId") Integer accountId, @Param("courseId") Integer courseId, @Param("startsBefore") String startsBefore, @Param("endsAfter") String endsAfter, @Param("include") String include);
  

  /**
   * Retrieve assignments enabled for grade export to SIS
   * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
   * Note, this is equivalent to the other <code>retrieveAssignmentsEnabledForGradeExportToSisAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId The ID of the account to query. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>courseId - The ID of the course to query. (optional)</li>
   *   <li>startsBefore - When searching on an account, (optional)</li>
   *   <li>endsAfter - When searching on an account, (optional)</li>
   *   <li>include - Array of additional (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /sis/accounts/{accountId}/assignments?course_id={courseId}&starts_before={startsBefore}&ends_after={endsAfter}&include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void retrieveAssignmentsEnabledForGradeExportToSisAccounts(@Param("accountId") Integer accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAssignmentsEnabledForGradeExportToSisAccounts</code> method in a fluent style.
   */
  public static class RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams extends HashMap<String, Object> {
    public RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams courseId(final Integer value) {
      put("course_id", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams startsBefore(final String value) {
      put("starts_before", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams endsAfter(final String value) {
      put("ends_after", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAssignmentsEnabledForGradeExportToSisAccountsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Retrieve assignments enabled for grade export to SIS
   * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
   * @param courseId The ID of the course to query. (required)
   * @param accountId The ID of the account to query. (optional)
   * @param startsBefore When searching on an account, (optional)
   * @param endsAfter When searching on an account, (optional)
   * @param include Array of additional (optional)
   */
  @RequestLine("GET /sis/courses/{courseId}/assignments?account_id={accountId}&starts_before={startsBefore}&ends_after={endsAfter}&include={include}")
  @Headers({
      "Accept: */*",
  })
  void retrieveAssignmentsEnabledForGradeExportToSisCourses(@Param("courseId") Integer courseId, @Param("accountId") Integer accountId, @Param("startsBefore") String startsBefore, @Param("endsAfter") String endsAfter, @Param("include") String include);
  

  /**
   * Retrieve assignments enabled for grade export to SIS
   * Retrieve a list of published assignments flagged as \&quot;post_to_sis\&quot;. See the Assignments API for more details on assignments. Assignment group and section information are included for convenience.  Each section includes course information for the origin course and the cross-listed course, if applicable. The &#x60;origin_course&#x60; is the course to which the section belongs or the course from which the section was cross-listed. Generally, the &#x60;origin_course&#x60; should be preferred when performing integration work. The &#x60;xlist_course&#x60; is provided for consistency and is only present when the section has been cross-listed. See Sections API and Courses Api for me details.  The &#x60;override&#x60; is only provided if the Differentiated Assignments course feature is turned on and the assignment has an override for that section. When there is an override for the assignment the override object&#x27;s keys/values can be merged with the top level assignment object to create a view of the assignment object specific to that section. See Assignments api for more information on assignment overrides.  restricts to courses that start before this date (if they have a start date) restricts to courses that end after this date (if they have an end date) information to include.    \&quot;student_overrides\&quot;:: returns individual student override information
   * Note, this is equivalent to the other <code>retrieveAssignmentsEnabledForGradeExportToSisCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId The ID of the course to query. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>accountId - The ID of the account to query. (optional)</li>
   *   <li>startsBefore - When searching on an account, (optional)</li>
   *   <li>endsAfter - When searching on an account, (optional)</li>
   *   <li>include - Array of additional (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /sis/courses/{courseId}/assignments?account_id={accountId}&starts_before={startsBefore}&ends_after={endsAfter}&include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void retrieveAssignmentsEnabledForGradeExportToSisCourses(@Param("courseId") Integer courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAssignmentsEnabledForGradeExportToSisCourses</code> method in a fluent style.
   */
  public static class RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams extends HashMap<String, Object> {
    public RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams accountId(final Integer value) {
      put("account_id", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams startsBefore(final String value) {
      put("starts_before", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams endsAfter(final String value) {
      put("ends_after", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAssignmentsEnabledForGradeExportToSisCoursesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }
}
