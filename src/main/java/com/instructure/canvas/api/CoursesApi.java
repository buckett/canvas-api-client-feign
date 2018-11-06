package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Course;
import com.instructure.canvas.model.Progress;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CoursesApi extends ApiClient.Api {

  /**
   * Copy course content
   * DEPRECATED: Please use the {api:ContentMigrationsController#create Content Migrations API}  Copies content from one course into another. The default is to copy all course content. You can control specific types to copy by using either the &#x27;except&#x27; option or the &#x27;only&#x27; option.  The response is the same as the course copy status endpoint
   * @param courseId ID (required)
   * @param sourceCourse  (optional)
   * @param except  (optional)
   * @param only  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/course_copy")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void copyCourseContent(@Param("courseId") String courseId, @Param("sourceCourse") String sourceCourse, @Param("except") List<String> except, @Param("only") List<String> only);
  
  /**
   * Course activity stream
   * Returns the current user&#x27;s course-specific activity stream, paginated.  For full documentation, see the API documentation for the user activity stream, in the user api.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/activity_stream")
  @Headers({
      "Accept: */*",
  })
  void courseActivityStream(@Param("courseId") String courseId);
  
  /**
   * Course activity stream summary
   * Returns a summary of the current user&#x27;s course-specific activity stream.  For full documentation, see the API documentation for the user activity stream summary, in the user api.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/activity_stream/summary")
  @Headers({
      "Accept: */*",
  })
  void courseActivityStreamSummary(@Param("courseId") String courseId);
  
  /**
   * Course TODO items
   * Returns the current user&#x27;s course-specific todo items.  For full documentation, see the API documentation for the user todo items, in the user api.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/todo")
  @Headers({
      "Accept: */*",
  })
  void courseTodoItems(@Param("courseId") String courseId);
  
  /**
   * Create a new course
   * Create a new course
   * @param accountId ID (required)
   * @param courseName  (optional)
   * @param courseCourseCode  (optional)
   * @param courseStartAt  (optional)
   * @param courseEndAt  (optional)
   * @param courseLicense  (optional)
   * @param courseIsPublic  (optional)
   * @param courseIsPublicToAuthUsers  (optional)
   * @param coursePublicSyllabus  (optional)
   * @param coursePublicSyllabusToAuth  (optional)
   * @param coursePublicDescription  (optional)
   * @param courseAllowStudentWikiEdits  (optional)
   * @param courseAllowWikiComments  (optional)
   * @param courseAllowStudentForumAttachments  (optional)
   * @param courseOpenEnrollment  (optional)
   * @param courseSelfEnrollment  (optional)
   * @param courseRestrictEnrollmentsToCourseDates  (optional)
   * @param courseTermId  (optional)
   * @param courseSisCourseId  (optional)
   * @param courseIntegrationId  (optional)
   * @param courseHideFinalGrades  (optional)
   * @param courseApplyAssignmentGroupWeights  (optional)
   * @param courseTimeZone  (optional)
   * @param offer  (optional)
   * @param enrollMe  (optional)
   * @param courseDefaultView  (optional)
   * @param courseSyllabusBody  (optional)
   * @param courseGradingStandardId  (optional)
   * @param courseCourseFormat  (optional)
   * @param enableSisReactivation  (optional)
   * @return Course
   */
  @RequestLine("POST /v1/accounts/{accountId}/courses")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Course createNewCourse(@Param("accountId") String accountId, @Param("courseName") String courseName, @Param("courseCourseCode") String courseCourseCode, @Param("courseStartAt") String courseStartAt, @Param("courseEndAt") String courseEndAt, @Param("courseLicense") String courseLicense, @Param("courseIsPublic") Boolean courseIsPublic, @Param("courseIsPublicToAuthUsers") Boolean courseIsPublicToAuthUsers, @Param("coursePublicSyllabus") Boolean coursePublicSyllabus, @Param("coursePublicSyllabusToAuth") Boolean coursePublicSyllabusToAuth, @Param("coursePublicDescription") String coursePublicDescription, @Param("courseAllowStudentWikiEdits") Boolean courseAllowStudentWikiEdits, @Param("courseAllowWikiComments") Boolean courseAllowWikiComments, @Param("courseAllowStudentForumAttachments") Boolean courseAllowStudentForumAttachments, @Param("courseOpenEnrollment") Boolean courseOpenEnrollment, @Param("courseSelfEnrollment") Boolean courseSelfEnrollment, @Param("courseRestrictEnrollmentsToCourseDates") Boolean courseRestrictEnrollmentsToCourseDates, @Param("courseTermId") Integer courseTermId, @Param("courseSisCourseId") String courseSisCourseId, @Param("courseIntegrationId") String courseIntegrationId, @Param("courseHideFinalGrades") Boolean courseHideFinalGrades, @Param("courseApplyAssignmentGroupWeights") Boolean courseApplyAssignmentGroupWeights, @Param("courseTimeZone") String courseTimeZone, @Param("offer") Boolean offer, @Param("enrollMe") Boolean enrollMe, @Param("courseDefaultView") String courseDefaultView, @Param("courseSyllabusBody") String courseSyllabusBody, @Param("courseGradingStandardId") Integer courseGradingStandardId, @Param("courseCourseFormat") String courseCourseFormat, @Param("enableSisReactivation") Boolean enableSisReactivation);
  
  /**
   * Delete/Conclude a course
   * Delete or conclude an existing course
   * @param id ID (required)
   * @param event The action to take on the course. (required)
   */
  @RequestLine("DELETE /v1/courses/{id}?event={event}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteConcludeCourse(@Param("id") String id, @Param("event") String event);
  

  /**
   * Delete/Conclude a course
   * Delete or conclude an existing course
   * Note, this is equivalent to the other <code>deleteConcludeCourse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteConcludeCourseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>event - The action to take on the course. (required)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/courses/{id}?event={event}")
  @Headers({
      "Content-Type: application/json",
  })
  void deleteConcludeCourse(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteConcludeCourse</code> method in a fluent style.
   */
  public static class DeleteConcludeCourseQueryParams extends HashMap<String, Object> {
    public DeleteConcludeCourseQueryParams event(final String value) {
      put("event", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get course copy status
   * DEPRECATED: Please use the {api:ContentMigrationsController#create Content Migrations API}  Retrieve the status of a course copy
   * @param courseId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/course_copy/{id}")
  @Headers({
      "Accept: */*",
  })
  void getCourseCopyStatus(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Get course settings
   * Returns some of a course&#x27;s settings.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/settings")
  @Headers({
      "Accept: */*",
  })
  void getCourseSettings(@Param("courseId") String courseId);
  
  /**
   * Get effective due dates
   * For each assignment in the course, returns each assigned student&#x27;s ID and their corresponding due date along with some grading period data. Returns a collection with keys representing assignment IDs and values as a collection containing keys representing student IDs and values representing the student&#x27;s effective due_at, the grading_period_id of which the due_at falls in, and whether or not the grading period is closed (in_closed_grading_period)  The list of assignment IDs for which effective student due dates are requested. If not provided, all assignments in the course will be used.
   * @param courseId ID (required)
   * @param assignmentIds no description (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/effective_due_dates?assignment_ids={assignmentIds}")
  @Headers({
      "Accept: */*",
  })
  void getEffectiveDueDates(@Param("courseId") String courseId, @Param("assignmentIds") List<String> assignmentIds);
  

  /**
   * Get effective due dates
   * For each assignment in the course, returns each assigned student&#x27;s ID and their corresponding due date along with some grading period data. Returns a collection with keys representing assignment IDs and values as a collection containing keys representing student IDs and values representing the student&#x27;s effective due_at, the grading_period_id of which the due_at falls in, and whether or not the grading period is closed (in_closed_grading_period)  The list of assignment IDs for which effective student due dates are requested. If not provided, all assignments in the course will be used.
   * Note, this is equivalent to the other <code>getEffectiveDueDates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEffectiveDueDatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>assignmentIds - no description (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/effective_due_dates?assignment_ids={assignmentIds}")
  @Headers({
      "Content-Type: */*",
  })
  void getEffectiveDueDates(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEffectiveDueDates</code> method in a fluent style.
   */
  public static class GetEffectiveDueDatesQueryParams extends HashMap<String, Object> {
    public GetEffectiveDueDatesQueryParams assignmentIds(final List<String> value) {
      put("assignment_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single course
   * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
   * @param accountId ID (required)
   * @param id ID (required)
   * @param include - \&quot;all_courses\&quot;: Also search recently deleted courses. - \&quot;permissions\&quot;: Include permissions the current user has   for the course. - \&quot;observed_users\&quot;: include observed users in the enrollments - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)
   * @return Course
   */
  @RequestLine("GET /v1/accounts/{accountId}/courses/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  Course getSingleCourseAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get a single course
   * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
   * Note, this is equivalent to the other <code>getSingleCourseAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleCourseAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;all_courses\&quot;: Also search recently deleted courses. - \&quot;permissions\&quot;: Include permissions the current user has   for the course. - \&quot;observed_users\&quot;: include observed users in the enrollments - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)</li>
   *   </ul>
   * @return Course

   */
  @RequestLine("GET /v1/accounts/{accountId}/courses/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Course getSingleCourseAccounts(@Param("accountId") String accountId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleCourseAccounts</code> method in a fluent style.
   */
  public static class GetSingleCourseAccountsQueryParams extends HashMap<String, Object> {
    public GetSingleCourseAccountsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single course
   * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
   * @param id ID (required)
   * @param include - \&quot;all_courses\&quot;: Also search recently deleted courses. - \&quot;permissions\&quot;: Include permissions the current user has   for the course. - \&quot;observed_users\&quot;: include observed users in the enrollments - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)
   * @return Course
   */
  @RequestLine("GET /v1/courses/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  Course getSingleCourseCourses(@Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get a single course
   * Return information on a single course.  Accepts the same include[] parameters as the list action plus:
   * Note, this is equivalent to the other <code>getSingleCourseCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleCourseCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;all_courses\&quot;: Also search recently deleted courses. - \&quot;permissions\&quot;: Include permissions the current user has   for the course. - \&quot;observed_users\&quot;: include observed users in the enrollments - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)</li>
   *   </ul>
   * @return Course

   */
  @RequestLine("GET /v1/courses/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Course getSingleCourseCourses(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleCourseCourses</code> method in a fluent style.
   */
  public static class GetSingleCourseCoursesQueryParams extends HashMap<String, Object> {
    public GetSingleCourseCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get single user
   * Return information on a single user.  Accepts the same include[] parameters as the :users: action, and returns a single user with the same fields as that action.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return User
   */
  @RequestLine("GET /v1/courses/{courseId}/users/{id}")
  @Headers({
      "Accept: application/json",
  })
  User getSingleUser(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * List courses for a user
   * Returns a paginated list of active courses for this user. To view the course list for a user other than yourself, you must be either an observer of that user or an administrator.
   * @param userId ID (required)
   * @param include - \&quot;needs_grading_count\&quot;: Optional information to include with each Course.   When needs_grading_count is given, and the current user has grading   rights, the total number of submissions needing grading for all   assignments is returned. - \&quot;syllabus_body\&quot;: Optional information to include with each Course.   When syllabus_body is given the user-generated html for the course   syllabus is returned. - \&quot;public_description\&quot;: Optional information to include with each Course.   When public_description is given the user-generated text for the course   public description is returned. - \&quot;total_scores\&quot;: Optional information to include with each Course.   When total_scores is given, any student enrollments will also   include the fields &#x27;computed_current_score&#x27;, &#x27;computed_final_score&#x27;,   &#x27;computed_current_grade&#x27;, and &#x27;computed_final_grade&#x27; (see Enrollment   documentation for more information on these fields). This argument   is ignored if the course is configured to hide final grades. - \&quot;current_grading_period_scores\&quot;: Optional information to include with   each Course. When current_grading_period_scores is given and total_scores   is given, any student enrollments will also include the fields   &#x27;has_grading_periods&#x27;,   &#x27;totals_for_all_grading_periods_option&#x27;, &#x27;current_grading_period_title&#x27;,   &#x27;current_grading_period_id&#x27;, current_period_computed_current_score&#x27;,   &#x27;current_period_computed_final_score&#x27;,   &#x27;current_period_computed_current_grade&#x27;, and   &#x27;current_period_computed_final_grade&#x27;, as well as (if the user has permission)   &#x27;current_period_unposted_current_score&#x27;,   &#x27;current_period_unposted_final_score&#x27;,   &#x27;current_period_unposted_current_grade&#x27;, and   &#x27;current_period_unposted_final_grade&#x27; (see Enrollment documentation for   more information on these fields). In addition, when this argument is   passed, the course will have a &#x27;has_grading_periods&#x27; attribute   on it. This argument is ignored if the course is configured to hide final   grades or if the total_scores argument is not included. - \&quot;term\&quot;: Optional information to include with each Course. When   term is given, the information for the enrollment term for each course   is returned. - \&quot;account\&quot;: Optional information to include with each Course. When   account is given, the account json for each course is returned. - \&quot;course_progress\&quot;: Optional information to include with each Course.   When course_progress is given, each course will include a   &#x27;course_progress&#x27; object with the fields: &#x27;requirement_count&#x27;, an integer   specifying the total number of requirements in the course,   &#x27;requirement_completed_count&#x27;, an integer specifying the total number of   requirements in this course that have been completed, and   &#x27;next_requirement_url&#x27;, a string url to the next requirement item, and   &#x27;completed_at&#x27;, the date the course was completed (null if incomplete).   &#x27;next_requirement_url&#x27; will be null if all requirements have been   completed or the current module does not require sequential progress.   \&quot;course_progress\&quot; will return an error message if the course is not   module based or the user is not enrolled as a student in the course. - \&quot;sections\&quot;: Section enrollment information to include with each Course.   Returns an array of hashes containing the section ID (id), section name   (name), start and end dates (start_at, end_at), as well as the enrollment   type (enrollment_role, e.g. &#x27;StudentEnrollment&#x27;). - \&quot;storage_quota_used_mb\&quot;: The amount of storage space used by the files in this course - \&quot;total_students\&quot;: Optional information to include with each Course.   Returns an integer for the total amount of active and invited students. - \&quot;passback_status\&quot;: Include the grade passback_status - \&quot;favorites\&quot;: Optional information to include with each Course.   Indicates if the user has marked the course as a favorite course. - \&quot;teachers\&quot;: Teacher information to include with each Course.   Returns an array of hashes containing the {api:Users:UserDisplay UserDisplay} information   for each teacher in the course. - \&quot;observed_users\&quot;: Optional information to include with each Course.   Will include data for observed users if the current user has an   observer enrollment. - \&quot;tabs\&quot;: Optional information to include with each Course.   Will include the list of tabs configured for each course.  See the   {api:TabsController#index List available tabs API} for more information. - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)
   * @param state If set, only return courses that are in the given state(s). By default, \&quot;available\&quot; is returned for students and observers, and anything except \&quot;deleted\&quot;, for all other enrollment types (optional)
   * @param enrollmentState When set, only return courses where the user has an enrollment with the given state. This will respect section/course/term date overrides. (optional)
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET /v1/users/{userId}/courses?include={include}&state={state}&enrollment_state={enrollmentState}")
  @Headers({
      "Accept: application/json",
  })
  List<Course> listCoursesForUser(@Param("userId") String userId, @Param("include") List<String> include, @Param("state") List<String> state, @Param("enrollmentState") String enrollmentState);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Course> listCoursesForUser(URI uri);
  

  /**
   * List courses for a user
   * Returns a paginated list of active courses for this user. To view the course list for a user other than yourself, you must be either an observer of that user or an administrator.
   * Note, this is equivalent to the other <code>listCoursesForUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCoursesForUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;needs_grading_count\&quot;: Optional information to include with each Course.   When needs_grading_count is given, and the current user has grading   rights, the total number of submissions needing grading for all   assignments is returned. - \&quot;syllabus_body\&quot;: Optional information to include with each Course.   When syllabus_body is given the user-generated html for the course   syllabus is returned. - \&quot;public_description\&quot;: Optional information to include with each Course.   When public_description is given the user-generated text for the course   public description is returned. - \&quot;total_scores\&quot;: Optional information to include with each Course.   When total_scores is given, any student enrollments will also   include the fields &#x27;computed_current_score&#x27;, &#x27;computed_final_score&#x27;,   &#x27;computed_current_grade&#x27;, and &#x27;computed_final_grade&#x27; (see Enrollment   documentation for more information on these fields). This argument   is ignored if the course is configured to hide final grades. - \&quot;current_grading_period_scores\&quot;: Optional information to include with   each Course. When current_grading_period_scores is given and total_scores   is given, any student enrollments will also include the fields   &#x27;has_grading_periods&#x27;,   &#x27;totals_for_all_grading_periods_option&#x27;, &#x27;current_grading_period_title&#x27;,   &#x27;current_grading_period_id&#x27;, current_period_computed_current_score&#x27;,   &#x27;current_period_computed_final_score&#x27;,   &#x27;current_period_computed_current_grade&#x27;, and   &#x27;current_period_computed_final_grade&#x27;, as well as (if the user has permission)   &#x27;current_period_unposted_current_score&#x27;,   &#x27;current_period_unposted_final_score&#x27;,   &#x27;current_period_unposted_current_grade&#x27;, and   &#x27;current_period_unposted_final_grade&#x27; (see Enrollment documentation for   more information on these fields). In addition, when this argument is   passed, the course will have a &#x27;has_grading_periods&#x27; attribute   on it. This argument is ignored if the course is configured to hide final   grades or if the total_scores argument is not included. - \&quot;term\&quot;: Optional information to include with each Course. When   term is given, the information for the enrollment term for each course   is returned. - \&quot;account\&quot;: Optional information to include with each Course. When   account is given, the account json for each course is returned. - \&quot;course_progress\&quot;: Optional information to include with each Course.   When course_progress is given, each course will include a   &#x27;course_progress&#x27; object with the fields: &#x27;requirement_count&#x27;, an integer   specifying the total number of requirements in the course,   &#x27;requirement_completed_count&#x27;, an integer specifying the total number of   requirements in this course that have been completed, and   &#x27;next_requirement_url&#x27;, a string url to the next requirement item, and   &#x27;completed_at&#x27;, the date the course was completed (null if incomplete).   &#x27;next_requirement_url&#x27; will be null if all requirements have been   completed or the current module does not require sequential progress.   \&quot;course_progress\&quot; will return an error message if the course is not   module based or the user is not enrolled as a student in the course. - \&quot;sections\&quot;: Section enrollment information to include with each Course.   Returns an array of hashes containing the section ID (id), section name   (name), start and end dates (start_at, end_at), as well as the enrollment   type (enrollment_role, e.g. &#x27;StudentEnrollment&#x27;). - \&quot;storage_quota_used_mb\&quot;: The amount of storage space used by the files in this course - \&quot;total_students\&quot;: Optional information to include with each Course.   Returns an integer for the total amount of active and invited students. - \&quot;passback_status\&quot;: Include the grade passback_status - \&quot;favorites\&quot;: Optional information to include with each Course.   Indicates if the user has marked the course as a favorite course. - \&quot;teachers\&quot;: Teacher information to include with each Course.   Returns an array of hashes containing the {api:Users:UserDisplay UserDisplay} information   for each teacher in the course. - \&quot;observed_users\&quot;: Optional information to include with each Course.   Will include data for observed users if the current user has an   observer enrollment. - \&quot;tabs\&quot;: Optional information to include with each Course.   Will include the list of tabs configured for each course.  See the   {api:TabsController#index List available tabs API} for more information. - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)</li>
   *   <li>state - If set, only return courses that are in the given state(s). By default, \&quot;available\&quot; is returned for students and observers, and anything except \&quot;deleted\&quot;, for all other enrollment types (optional)</li>
   *   <li>enrollmentState - When set, only return courses where the user has an enrollment with the given state. This will respect section/course/term date overrides. (optional)</li>
   *   </ul>
   * @return List&lt;Course&gt;

   */
  @RequestLine("GET /v1/users/{userId}/courses?include={include}&state={state}&enrollment_state={enrollmentState}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Course> listCoursesForUser(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCoursesForUser</code> method in a fluent style.
   */
  public static class ListCoursesForUserQueryParams extends HashMap<String, Object> {
    public ListCoursesForUserQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListCoursesForUserQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListCoursesForUserQueryParams enrollmentState(final String value) {
      put("enrollment_state", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List recently logged in students
   * Returns the paginated list of users in this course, ordered by how recently they have logged in. The records include the &#x27;last_login&#x27; field which contains a timestamp of the last time that user logged into canvas.  The querying user must have the &#x27;View usage reports&#x27; permission.
   * @param courseId ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/recent_students")
  @Headers({
      "Accept: application/json",
  })
  List<User> listRecentlyLoggedInStudents(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listRecentlyLoggedInStudents(URI uri);
  
  /**
   * List students
   * Returns the paginated list of students enrolled in this course.  DEPRECATED: Please use the {api:CoursesController#users course users} endpoint and pass \&quot;student\&quot; as the enrollment_type.
   * @param courseId ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/students")
  @Headers({
      "Accept: application/json",
  })
  List<User> listStudents(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listStudents(URI uri);
  
  /**
   * List users in course
   * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
   * @param courseId ID (required)
   * @param searchTerm The partial name or full ID of the users to match and return in the results list. (optional)
   * @param enrollmentType When set, only return users where the user is enrolled as this type. \&quot;student_view\&quot; implies include[]&#x3D;test_student. This argument is ignored if enrollment_role is given. (optional)
   * @param enrollmentRole Deprecated When set, only return users enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a base role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)
   * @param enrollmentRoleId When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a built_in role id with type &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)
   * @param include - \&quot;email\&quot;: Optional user email. - \&quot;enrollments\&quot;: Optionally include with each Course the user&#x27;s current and invited enrollments. If the user is enrolled as a student, and the account has permission to manage or view all grades, each enrollment will include a &#x27;grades&#x27; key with &#x27;current_score&#x27;, &#x27;final_score&#x27;, &#x27;current_grade&#x27; and &#x27;final_grade&#x27; values. - \&quot;locked\&quot;: Optionally include whether an enrollment is locked. - \&quot;avatar_url\&quot;: Optionally include avatar_url. - \&quot;bio\&quot;: Optionally include each user&#x27;s bio. - \&quot;test_student\&quot;: Optionally include the course&#x27;s Test Student, if present. Default is to not include Test Student. - \&quot;custom_links\&quot;: Optionally include plugin-supplied custom links for each student, such as analytics information - \&quot;current_grading_period_scores\&quot;: if enrollments is included as well as this directive, the scores returned in the enrollment will be for the current grading period if there is one. A &#x27;grading_period_id&#x27; value will also be included with the scores. if grading_period_id is nil there is no current grading period and the score is a total score. (optional)
   * @param userId If this parameter is given and it corresponds to a user in the course, the +page+ parameter will be ignored and the page containing the specified user will be returned instead. (optional)
   * @param userIds If included, the course users set will only include users with IDs specified by the param. Note: this will not work in conjunction with the \&quot;user_id\&quot; argument but multiple user_ids can be included. (optional)
   * @param enrollmentState When set, only return users where the enrollment workflow state is of one of the given types. \&quot;active\&quot; and \&quot;invited\&quot; enrollments are returned by default. (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/search_users?search_term={searchTerm}&enrollment_type={enrollmentType}&enrollment_role={enrollmentRole}&enrollment_role_id={enrollmentRoleId}&include={include}&user_id={userId}&user_ids={userIds}&enrollment_state={enrollmentState}")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInCourseSearchUsers(@Param("courseId") String courseId, @Param("searchTerm") String searchTerm, @Param("enrollmentType") List<String> enrollmentType, @Param("enrollmentRole") String enrollmentRole, @Param("enrollmentRoleId") Integer enrollmentRoleId, @Param("include") List<String> include, @Param("userId") String userId, @Param("userIds") List<Integer> userIds, @Param("enrollmentState") List<String> enrollmentState);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInCourseSearchUsers(URI uri);
  

  /**
   * List users in course
   * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
   * Note, this is equivalent to the other <code>listUsersInCourseSearchUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUsersInCourseSearchUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name or full ID of the users to match and return in the results list. (optional)</li>
   *   <li>enrollmentType - When set, only return users where the user is enrolled as this type. \&quot;student_view\&quot; implies include[]&#x3D;test_student. This argument is ignored if enrollment_role is given. (optional)</li>
   *   <li>enrollmentRole - Deprecated When set, only return users enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a base role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)</li>
   *   <li>enrollmentRoleId - When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a built_in role id with type &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)</li>
   *   <li>include - - \&quot;email\&quot;: Optional user email. - \&quot;enrollments\&quot;: Optionally include with each Course the user&#x27;s current and invited enrollments. If the user is enrolled as a student, and the account has permission to manage or view all grades, each enrollment will include a &#x27;grades&#x27; key with &#x27;current_score&#x27;, &#x27;final_score&#x27;, &#x27;current_grade&#x27; and &#x27;final_grade&#x27; values. - \&quot;locked\&quot;: Optionally include whether an enrollment is locked. - \&quot;avatar_url\&quot;: Optionally include avatar_url. - \&quot;bio\&quot;: Optionally include each user&#x27;s bio. - \&quot;test_student\&quot;: Optionally include the course&#x27;s Test Student, if present. Default is to not include Test Student. - \&quot;custom_links\&quot;: Optionally include plugin-supplied custom links for each student, such as analytics information - \&quot;current_grading_period_scores\&quot;: if enrollments is included as well as this directive, the scores returned in the enrollment will be for the current grading period if there is one. A &#x27;grading_period_id&#x27; value will also be included with the scores. if grading_period_id is nil there is no current grading period and the score is a total score. (optional)</li>
   *   <li>userId - If this parameter is given and it corresponds to a user in the course, the +page+ parameter will be ignored and the page containing the specified user will be returned instead. (optional)</li>
   *   <li>userIds - If included, the course users set will only include users with IDs specified by the param. Note: this will not work in conjunction with the \&quot;user_id\&quot; argument but multiple user_ids can be included. (optional)</li>
   *   <li>enrollmentState - When set, only return users where the enrollment workflow state is of one of the given types. \&quot;active\&quot; and \&quot;invited\&quot; enrollments are returned by default. (optional)</li>
   *   </ul>
   * @return List&lt;User&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/search_users?search_term={searchTerm}&enrollment_type={enrollmentType}&enrollment_role={enrollmentRole}&enrollment_role_id={enrollmentRoleId}&include={include}&user_id={userId}&user_ids={userIds}&enrollment_state={enrollmentState}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<User> listUsersInCourseSearchUsers(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUsersInCourseSearchUsers</code> method in a fluent style.
   */
  public static class ListUsersInCourseSearchUsersQueryParams extends HashMap<String, Object> {
    public ListUsersInCourseSearchUsersQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams enrollmentType(final List<String> value) {
      put("enrollment_type", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams enrollmentRole(final String value) {
      put("enrollment_role", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams enrollmentRoleId(final Integer value) {
      put("enrollment_role_id", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams userId(final String value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams userIds(final List<Integer> value) {
      put("user_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListUsersInCourseSearchUsersQueryParams enrollmentState(final List<String> value) {
      put("enrollment_state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List users in course
   * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
   * @param courseId ID (required)
   * @param searchTerm The partial name or full ID of the users to match and return in the results list. (optional)
   * @param enrollmentType When set, only return users where the user is enrolled as this type. \&quot;student_view\&quot; implies include[]&#x3D;test_student. This argument is ignored if enrollment_role is given. (optional)
   * @param enrollmentRole Deprecated When set, only return users enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a base role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)
   * @param enrollmentRoleId When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a built_in role id with type &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)
   * @param include - \&quot;email\&quot;: Optional user email. - \&quot;enrollments\&quot;: Optionally include with each Course the user&#x27;s current and invited enrollments. If the user is enrolled as a student, and the account has permission to manage or view all grades, each enrollment will include a &#x27;grades&#x27; key with &#x27;current_score&#x27;, &#x27;final_score&#x27;, &#x27;current_grade&#x27; and &#x27;final_grade&#x27; values. - \&quot;locked\&quot;: Optionally include whether an enrollment is locked. - \&quot;avatar_url\&quot;: Optionally include avatar_url. - \&quot;bio\&quot;: Optionally include each user&#x27;s bio. - \&quot;test_student\&quot;: Optionally include the course&#x27;s Test Student, if present. Default is to not include Test Student. - \&quot;custom_links\&quot;: Optionally include plugin-supplied custom links for each student, such as analytics information - \&quot;current_grading_period_scores\&quot;: if enrollments is included as well as this directive, the scores returned in the enrollment will be for the current grading period if there is one. A &#x27;grading_period_id&#x27; value will also be included with the scores. if grading_period_id is nil there is no current grading period and the score is a total score. (optional)
   * @param userId If this parameter is given and it corresponds to a user in the course, the +page+ parameter will be ignored and the page containing the specified user will be returned instead. (optional)
   * @param userIds If included, the course users set will only include users with IDs specified by the param. Note: this will not work in conjunction with the \&quot;user_id\&quot; argument but multiple user_ids can be included. (optional)
   * @param enrollmentState When set, only return users where the enrollment workflow state is of one of the given types. \&quot;active\&quot; and \&quot;invited\&quot; enrollments are returned by default. (optional)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/users?search_term={searchTerm}&enrollment_type={enrollmentType}&enrollment_role={enrollmentRole}&enrollment_role_id={enrollmentRoleId}&include={include}&user_id={userId}&user_ids={userIds}&enrollment_state={enrollmentState}")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInCourseUsers(@Param("courseId") String courseId, @Param("searchTerm") String searchTerm, @Param("enrollmentType") List<String> enrollmentType, @Param("enrollmentRole") String enrollmentRole, @Param("enrollmentRoleId") Integer enrollmentRoleId, @Param("include") List<String> include, @Param("userId") String userId, @Param("userIds") List<Integer> userIds, @Param("enrollmentState") List<String> enrollmentState);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listUsersInCourseUsers(URI uri);
  

  /**
   * List users in course
   * Returns the paginated list of users in this course. And optionally the user&#x27;s enrollments in the course.
   * Note, this is equivalent to the other <code>listUsersInCourseUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUsersInCourseUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name or full ID of the users to match and return in the results list. (optional)</li>
   *   <li>enrollmentType - When set, only return users where the user is enrolled as this type. \&quot;student_view\&quot; implies include[]&#x3D;test_student. This argument is ignored if enrollment_role is given. (optional)</li>
   *   <li>enrollmentRole - Deprecated When set, only return users enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a base role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)</li>
   *   <li>enrollmentRoleId - When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a built_in role id with type &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)</li>
   *   <li>include - - \&quot;email\&quot;: Optional user email. - \&quot;enrollments\&quot;: Optionally include with each Course the user&#x27;s current and invited enrollments. If the user is enrolled as a student, and the account has permission to manage or view all grades, each enrollment will include a &#x27;grades&#x27; key with &#x27;current_score&#x27;, &#x27;final_score&#x27;, &#x27;current_grade&#x27; and &#x27;final_grade&#x27; values. - \&quot;locked\&quot;: Optionally include whether an enrollment is locked. - \&quot;avatar_url\&quot;: Optionally include avatar_url. - \&quot;bio\&quot;: Optionally include each user&#x27;s bio. - \&quot;test_student\&quot;: Optionally include the course&#x27;s Test Student, if present. Default is to not include Test Student. - \&quot;custom_links\&quot;: Optionally include plugin-supplied custom links for each student, such as analytics information - \&quot;current_grading_period_scores\&quot;: if enrollments is included as well as this directive, the scores returned in the enrollment will be for the current grading period if there is one. A &#x27;grading_period_id&#x27; value will also be included with the scores. if grading_period_id is nil there is no current grading period and the score is a total score. (optional)</li>
   *   <li>userId - If this parameter is given and it corresponds to a user in the course, the +page+ parameter will be ignored and the page containing the specified user will be returned instead. (optional)</li>
   *   <li>userIds - If included, the course users set will only include users with IDs specified by the param. Note: this will not work in conjunction with the \&quot;user_id\&quot; argument but multiple user_ids can be included. (optional)</li>
   *   <li>enrollmentState - When set, only return users where the enrollment workflow state is of one of the given types. \&quot;active\&quot; and \&quot;invited\&quot; enrollments are returned by default. (optional)</li>
   *   </ul>
   * @return List&lt;User&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/users?search_term={searchTerm}&enrollment_type={enrollmentType}&enrollment_role={enrollmentRole}&enrollment_role_id={enrollmentRoleId}&include={include}&user_id={userId}&user_ids={userIds}&enrollment_state={enrollmentState}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<User> listUsersInCourseUsers(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUsersInCourseUsers</code> method in a fluent style.
   */
  public static class ListUsersInCourseUsersQueryParams extends HashMap<String, Object> {
    public ListUsersInCourseUsersQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseUsersQueryParams enrollmentType(final List<String> value) {
      put("enrollment_type", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListUsersInCourseUsersQueryParams enrollmentRole(final String value) {
      put("enrollment_role", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseUsersQueryParams enrollmentRoleId(final Integer value) {
      put("enrollment_role_id", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseUsersQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListUsersInCourseUsersQueryParams userId(final String value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersInCourseUsersQueryParams userIds(final List<Integer> value) {
      put("user_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListUsersInCourseUsersQueryParams enrollmentState(final List<String> value) {
      put("enrollment_state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List your courses
   * Returns the paginated list of active courses for the current user.
   * @param enrollmentType When set, only return courses where the user is enrolled as this type. For example, set to \&quot;teacher\&quot; to return only courses where the user is enrolled as a Teacher.  This argument is ignored if enrollment_role is given. (optional)
   * @param enrollmentRole Deprecated When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a base role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)
   * @param enrollmentRoleId When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a built_in role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)
   * @param enrollmentState When set, only return courses where the user has an enrollment with the given state. This will respect section/course/term date overrides. (optional)
   * @param excludeBlueprintCourses When set, only return courses that are not configured as blueprint courses. (optional)
   * @param include - \&quot;needs_grading_count\&quot;: Optional information to include with each Course.   When needs_grading_count is given, and the current user has grading   rights, the total number of submissions needing grading for all   assignments is returned. - \&quot;syllabus_body\&quot;: Optional information to include with each Course.   When syllabus_body is given the user-generated html for the course   syllabus is returned. - \&quot;public_description\&quot;: Optional information to include with each Course.   When public_description is given the user-generated text for the course   public description is returned. - \&quot;total_scores\&quot;: Optional information to include with each Course.   When total_scores is given, any student enrollments will also   include the fields &#x27;computed_current_score&#x27;, &#x27;computed_final_score&#x27;,   &#x27;computed_current_grade&#x27;, and &#x27;computed_final_grade&#x27;, as well as (if   the user has permission) &#x27;unposted_current_score&#x27;,   &#x27;unposted_final_score&#x27;, &#x27;unposted_current_grade&#x27;, and   &#x27;unposted_final_grade&#x27; (see Enrollment documentation for more   information on these fields). This argument is ignored if the course is   configured to hide final grades. - \&quot;current_grading_period_scores\&quot;: Optional information to include with   each Course. When current_grading_period_scores is given and total_scores   is given, any student enrollments will also include the fields   &#x27;has_grading_periods&#x27;,   &#x27;totals_for_all_grading_periods_option&#x27;, &#x27;current_grading_period_title&#x27;,   &#x27;current_grading_period_id&#x27;, current_period_computed_current_score&#x27;,   &#x27;current_period_computed_final_score&#x27;,   &#x27;current_period_computed_current_grade&#x27;, and   &#x27;current_period_computed_final_grade&#x27;, as well as (if the user has permission)   &#x27;current_period_unposted_current_score&#x27;,   &#x27;current_period_unposted_final_score&#x27;,   &#x27;current_period_unposted_current_grade&#x27;, and   &#x27;current_period_unposted_final_grade&#x27; (see Enrollment documentation for   more information on these fields). In addition, when this argument is   passed, the course will have a &#x27;has_grading_periods&#x27; attribute   on it. This argument is ignored if the course is configured to hide final   grades or if the total_scores argument is not included. - \&quot;term\&quot;: Optional information to include with each Course. When   term is given, the information for the enrollment term for each course   is returned. - \&quot;account\&quot;: Optional information to include with each Course. When   account is given, the account json for each course is returned. - \&quot;course_progress\&quot;: Optional information to include with each Course.   When course_progress is given, each course will include a   &#x27;course_progress&#x27; object with the fields: &#x27;requirement_count&#x27;, an integer   specifying the total number of requirements in the course,   &#x27;requirement_completed_count&#x27;, an integer specifying the total number of   requirements in this course that have been completed, and   &#x27;next_requirement_url&#x27;, a string url to the next requirement item, and   &#x27;completed_at&#x27;, the date the course was completed (null if incomplete).   &#x27;next_requirement_url&#x27; will be null if all requirements have been   completed or the current module does not require sequential progress.   \&quot;course_progress\&quot; will return an error message if the course is not   module based or the user is not enrolled as a student in the course. - \&quot;sections\&quot;: Section enrollment information to include with each Course.   Returns an array of hashes containing the section ID (id), section name   (name), start and end dates (start_at, end_at), as well as the enrollment   type (enrollment_role, e.g. &#x27;StudentEnrollment&#x27;). - \&quot;storage_quota_used_mb\&quot;: The amount of storage space used by the files in this course - \&quot;total_students\&quot;: Optional information to include with each Course.   Returns an integer for the total amount of active and invited students. - \&quot;passback_status\&quot;: Include the grade passback_status - \&quot;favorites\&quot;: Optional information to include with each Course.   Indicates if the user has marked the course as a favorite course. - \&quot;teachers\&quot;: Teacher information to include with each Course.   Returns an array of hashes containing the {api:Users:UserDisplay UserDisplay} information   for each teacher in the course. - \&quot;observed_users\&quot;: Optional information to include with each Course.   Will include data for observed users if the current user has an   observer enrollment. - \&quot;tabs\&quot;: Optional information to include with each Course.   Will include the list of tabs configured for each course.  See the   {api:TabsController#index List available tabs API} for more information. - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)
   * @param state If set, only return courses that are in the given state(s). By default, \&quot;available\&quot; is returned for students and observers, and anything except \&quot;deleted\&quot;, for all other enrollment types (optional)
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET /v1/courses?enrollment_type={enrollmentType}&enrollment_role={enrollmentRole}&enrollment_role_id={enrollmentRoleId}&enrollment_state={enrollmentState}&exclude_blueprint_courses={excludeBlueprintCourses}&include={include}&state={state}")
  @Headers({
      "Accept: application/json",
  })
  List<Course> listYourCourses(@Param("enrollmentType") String enrollmentType, @Param("enrollmentRole") String enrollmentRole, @Param("enrollmentRoleId") Integer enrollmentRoleId, @Param("enrollmentState") String enrollmentState, @Param("excludeBlueprintCourses") Boolean excludeBlueprintCourses, @Param("include") List<String> include, @Param("state") List<String> state);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Course> listYourCourses(URI uri);
  

  /**
   * List your courses
   * Returns the paginated list of active courses for the current user.
   * Note, this is equivalent to the other <code>listYourCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListYourCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>enrollmentType - When set, only return courses where the user is enrolled as this type. For example, set to \&quot;teacher\&quot; to return only courses where the user is enrolled as a Teacher.  This argument is ignored if enrollment_role is given. (optional)</li>
   *   <li>enrollmentRole - Deprecated When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a base role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)</li>
   *   <li>enrollmentRoleId - When set, only return courses where the user is enrolled with the specified course-level role.  This can be a role created with the {api:RoleOverridesController#add_role Add Role API} or a built_in role type of &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;ObserverEnrollment&#x27;, or &#x27;DesignerEnrollment&#x27;. (optional)</li>
   *   <li>enrollmentState - When set, only return courses where the user has an enrollment with the given state. This will respect section/course/term date overrides. (optional)</li>
   *   <li>excludeBlueprintCourses - When set, only return courses that are not configured as blueprint courses. (optional)</li>
   *   <li>include - - \&quot;needs_grading_count\&quot;: Optional information to include with each Course.   When needs_grading_count is given, and the current user has grading   rights, the total number of submissions needing grading for all   assignments is returned. - \&quot;syllabus_body\&quot;: Optional information to include with each Course.   When syllabus_body is given the user-generated html for the course   syllabus is returned. - \&quot;public_description\&quot;: Optional information to include with each Course.   When public_description is given the user-generated text for the course   public description is returned. - \&quot;total_scores\&quot;: Optional information to include with each Course.   When total_scores is given, any student enrollments will also   include the fields &#x27;computed_current_score&#x27;, &#x27;computed_final_score&#x27;,   &#x27;computed_current_grade&#x27;, and &#x27;computed_final_grade&#x27;, as well as (if   the user has permission) &#x27;unposted_current_score&#x27;,   &#x27;unposted_final_score&#x27;, &#x27;unposted_current_grade&#x27;, and   &#x27;unposted_final_grade&#x27; (see Enrollment documentation for more   information on these fields). This argument is ignored if the course is   configured to hide final grades. - \&quot;current_grading_period_scores\&quot;: Optional information to include with   each Course. When current_grading_period_scores is given and total_scores   is given, any student enrollments will also include the fields   &#x27;has_grading_periods&#x27;,   &#x27;totals_for_all_grading_periods_option&#x27;, &#x27;current_grading_period_title&#x27;,   &#x27;current_grading_period_id&#x27;, current_period_computed_current_score&#x27;,   &#x27;current_period_computed_final_score&#x27;,   &#x27;current_period_computed_current_grade&#x27;, and   &#x27;current_period_computed_final_grade&#x27;, as well as (if the user has permission)   &#x27;current_period_unposted_current_score&#x27;,   &#x27;current_period_unposted_final_score&#x27;,   &#x27;current_period_unposted_current_grade&#x27;, and   &#x27;current_period_unposted_final_grade&#x27; (see Enrollment documentation for   more information on these fields). In addition, when this argument is   passed, the course will have a &#x27;has_grading_periods&#x27; attribute   on it. This argument is ignored if the course is configured to hide final   grades or if the total_scores argument is not included. - \&quot;term\&quot;: Optional information to include with each Course. When   term is given, the information for the enrollment term for each course   is returned. - \&quot;account\&quot;: Optional information to include with each Course. When   account is given, the account json for each course is returned. - \&quot;course_progress\&quot;: Optional information to include with each Course.   When course_progress is given, each course will include a   &#x27;course_progress&#x27; object with the fields: &#x27;requirement_count&#x27;, an integer   specifying the total number of requirements in the course,   &#x27;requirement_completed_count&#x27;, an integer specifying the total number of   requirements in this course that have been completed, and   &#x27;next_requirement_url&#x27;, a string url to the next requirement item, and   &#x27;completed_at&#x27;, the date the course was completed (null if incomplete).   &#x27;next_requirement_url&#x27; will be null if all requirements have been   completed or the current module does not require sequential progress.   \&quot;course_progress\&quot; will return an error message if the course is not   module based or the user is not enrolled as a student in the course. - \&quot;sections\&quot;: Section enrollment information to include with each Course.   Returns an array of hashes containing the section ID (id), section name   (name), start and end dates (start_at, end_at), as well as the enrollment   type (enrollment_role, e.g. &#x27;StudentEnrollment&#x27;). - \&quot;storage_quota_used_mb\&quot;: The amount of storage space used by the files in this course - \&quot;total_students\&quot;: Optional information to include with each Course.   Returns an integer for the total amount of active and invited students. - \&quot;passback_status\&quot;: Include the grade passback_status - \&quot;favorites\&quot;: Optional information to include with each Course.   Indicates if the user has marked the course as a favorite course. - \&quot;teachers\&quot;: Teacher information to include with each Course.   Returns an array of hashes containing the {api:Users:UserDisplay UserDisplay} information   for each teacher in the course. - \&quot;observed_users\&quot;: Optional information to include with each Course.   Will include data for observed users if the current user has an   observer enrollment. - \&quot;tabs\&quot;: Optional information to include with each Course.   Will include the list of tabs configured for each course.  See the   {api:TabsController#index List available tabs API} for more information. - \&quot;course_image\&quot;: Optional course image data for when there is a course image   and the course image feature flag has been enabled (optional)</li>
   *   <li>state - If set, only return courses that are in the given state(s). By default, \&quot;available\&quot; is returned for students and observers, and anything except \&quot;deleted\&quot;, for all other enrollment types (optional)</li>
   *   </ul>
   * @return List&lt;Course&gt;

   */
  @RequestLine("GET /v1/courses?enrollment_type={enrollmentType}&enrollment_role={enrollmentRole}&enrollment_role_id={enrollmentRoleId}&enrollment_state={enrollmentState}&exclude_blueprint_courses={excludeBlueprintCourses}&include={include}&state={state}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Course> listYourCourses(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listYourCourses</code> method in a fluent style.
   */
  public static class ListYourCoursesQueryParams extends HashMap<String, Object> {
    public ListYourCoursesQueryParams enrollmentType(final String value) {
      put("enrollment_type", EncodingUtils.encode(value));
      return this;
    }
    public ListYourCoursesQueryParams enrollmentRole(final String value) {
      put("enrollment_role", EncodingUtils.encode(value));
      return this;
    }
    public ListYourCoursesQueryParams enrollmentRoleId(final Integer value) {
      put("enrollment_role_id", EncodingUtils.encode(value));
      return this;
    }
    public ListYourCoursesQueryParams enrollmentState(final String value) {
      put("enrollment_state", EncodingUtils.encode(value));
      return this;
    }
    public ListYourCoursesQueryParams excludeBlueprintCourses(final Boolean value) {
      put("exclude_blueprint_courses", EncodingUtils.encode(value));
      return this;
    }
    public ListYourCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListYourCoursesQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Permissions
   * Returns permission information for the calling user in the given course. See also the {api:AccountsController#permissions Account} and {api:GroupsController#permissions Group} counterparts.
   * @param courseId ID (required)
   * @param permissions List of permissions to check against the authenticated user. Permission names are documented in the {api:RoleOverridesController#add_role Create a role} endpoint. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/permissions?permissions={permissions}")
  @Headers({
      "Accept: */*",
  })
  void permissions(@Param("courseId") String courseId, @Param("permissions") List<String> permissions);
  

  /**
   * Permissions
   * Returns permission information for the calling user in the given course. See also the {api:AccountsController#permissions Account} and {api:GroupsController#permissions Group} counterparts.
   * Note, this is equivalent to the other <code>permissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PermissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>permissions - List of permissions to check against the authenticated user. Permission names are documented in the {api:RoleOverridesController#add_role Create a role} endpoint. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/permissions?permissions={permissions}")
  @Headers({
      "Content-Type: */*",
  })
  void permissions(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>permissions</code> method in a fluent style.
   */
  public static class PermissionsQueryParams extends HashMap<String, Object> {
    public PermissionsQueryParams permissions(final List<String> value) {
      put("permissions", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Preview processed html
   * Preview html content processed for this course
   * @param courseId ID (required)
   * @param html  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/preview_html")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void previewProcessedHtml(@Param("courseId") String courseId, @Param("html") String html);
  
  /**
   * Reset a course
   * Deletes the current course, and creates a new equivalent course with no content, but all sections and users moved over.
   * @param courseId ID (required)
   * @return Course
   */
  @RequestLine("POST /v1/courses/{courseId}/reset_content")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Course resetCourse(@Param("courseId") String courseId);
  
  /**
   * Update a course
   * Update an existing course.  Arguments are the same as Courses#create, with a few exceptions (enroll_me).  If a user has content management rights, but not full course editing rights, the only attribute editable through this endpoint will be \&quot;syllabus_body\&quot;
   * @param id ID (required)
   * @param courseAccountId  (optional)
   * @param courseName  (optional)
   * @param courseCourseCode  (optional)
   * @param courseStartAt  (optional)
   * @param courseEndAt  (optional)
   * @param courseLicense  (optional)
   * @param courseIsPublic  (optional)
   * @param courseIsPublicToAuthUsers  (optional)
   * @param coursePublicSyllabus  (optional)
   * @param coursePublicSyllabusToAuth  (optional)
   * @param coursePublicDescription  (optional)
   * @param courseAllowStudentWikiEdits  (optional)
   * @param courseAllowWikiComments  (optional)
   * @param courseAllowStudentForumAttachments  (optional)
   * @param courseOpenEnrollment  (optional)
   * @param courseSelfEnrollment  (optional)
   * @param courseRestrictEnrollmentsToCourseDates  (optional)
   * @param courseTermId  (optional)
   * @param courseSisCourseId  (optional)
   * @param courseIntegrationId  (optional)
   * @param courseHideFinalGrades  (optional)
   * @param courseTimeZone  (optional)
   * @param courseApplyAssignmentGroupWeights  (optional)
   * @param courseStorageQuotaMb  (optional)
   * @param offer  (optional)
   * @param courseEvent  (optional)
   * @param courseDefaultView  (optional)
   * @param courseSyllabusBody  (optional)
   * @param courseGradingStandardId  (optional)
   * @param courseCourseFormat  (optional)
   * @param courseImageId  (optional)
   * @param courseImageUrl  (optional)
   * @param courseRemoveImage  (optional)
   * @param courseBlueprint  (optional)
   * @param courseBlueprintRestrictions  (optional)
   * @param courseUseBlueprintRestrictionsByObjectType  (optional)
   * @param courseBlueprintRestrictionsByObjectType  (optional)
   */
  @RequestLine("PUT /v1/courses/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateCourse(@Param("id") String id, @Param("courseAccountId") Integer courseAccountId, @Param("courseName") String courseName, @Param("courseCourseCode") String courseCourseCode, @Param("courseStartAt") String courseStartAt, @Param("courseEndAt") String courseEndAt, @Param("courseLicense") String courseLicense, @Param("courseIsPublic") Boolean courseIsPublic, @Param("courseIsPublicToAuthUsers") Boolean courseIsPublicToAuthUsers, @Param("coursePublicSyllabus") Boolean coursePublicSyllabus, @Param("coursePublicSyllabusToAuth") Boolean coursePublicSyllabusToAuth, @Param("coursePublicDescription") String coursePublicDescription, @Param("courseAllowStudentWikiEdits") Boolean courseAllowStudentWikiEdits, @Param("courseAllowWikiComments") Boolean courseAllowWikiComments, @Param("courseAllowStudentForumAttachments") Boolean courseAllowStudentForumAttachments, @Param("courseOpenEnrollment") Boolean courseOpenEnrollment, @Param("courseSelfEnrollment") Boolean courseSelfEnrollment, @Param("courseRestrictEnrollmentsToCourseDates") Boolean courseRestrictEnrollmentsToCourseDates, @Param("courseTermId") Integer courseTermId, @Param("courseSisCourseId") String courseSisCourseId, @Param("courseIntegrationId") String courseIntegrationId, @Param("courseHideFinalGrades") Boolean courseHideFinalGrades, @Param("courseTimeZone") String courseTimeZone, @Param("courseApplyAssignmentGroupWeights") Boolean courseApplyAssignmentGroupWeights, @Param("courseStorageQuotaMb") Integer courseStorageQuotaMb, @Param("offer") Boolean offer, @Param("courseEvent") String courseEvent, @Param("courseDefaultView") String courseDefaultView, @Param("courseSyllabusBody") String courseSyllabusBody, @Param("courseGradingStandardId") Integer courseGradingStandardId, @Param("courseCourseFormat") String courseCourseFormat, @Param("courseImageId") Integer courseImageId, @Param("courseImageUrl") String courseImageUrl, @Param("courseRemoveImage") Boolean courseRemoveImage, @Param("courseBlueprint") Boolean courseBlueprint, @Param("courseBlueprintRestrictions") Object courseBlueprintRestrictions, @Param("courseUseBlueprintRestrictionsByObjectType") Boolean courseUseBlueprintRestrictionsByObjectType, @Param("courseBlueprintRestrictionsByObjectType") Object courseBlueprintRestrictionsByObjectType);
  
  /**
   * Update course settings
   * Can update the following course settings:
   * @param courseId ID (required)
   * @param allowStudentDiscussionTopics  (optional)
   * @param allowStudentForumAttachments  (optional)
   * @param allowStudentDiscussionEditing  (optional)
   * @param allowStudentOrganizedGroups  (optional)
   * @param hideFinalGrades  (optional)
   * @param hideDistributionGraphs  (optional)
   * @param lockAllAnnouncements  (optional)
   * @param restrictStudentPastView  (optional)
   * @param restrictStudentFutureView  (optional)
   * @param showAnnouncementsOnHomePage  (optional)
   * @param homePageAnnouncementLimit  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/settings")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateCourseSettings(@Param("courseId") String courseId, @Param("allowStudentDiscussionTopics") Boolean allowStudentDiscussionTopics, @Param("allowStudentForumAttachments") Boolean allowStudentForumAttachments, @Param("allowStudentDiscussionEditing") Boolean allowStudentDiscussionEditing, @Param("allowStudentOrganizedGroups") Boolean allowStudentOrganizedGroups, @Param("hideFinalGrades") Boolean hideFinalGrades, @Param("hideDistributionGraphs") Boolean hideDistributionGraphs, @Param("lockAllAnnouncements") Boolean lockAllAnnouncements, @Param("restrictStudentPastView") Boolean restrictStudentPastView, @Param("restrictStudentFutureView") Boolean restrictStudentFutureView, @Param("showAnnouncementsOnHomePage") Boolean showAnnouncementsOnHomePage, @Param("homePageAnnouncementLimit") Integer homePageAnnouncementLimit);
  
  /**
   * Update courses
   * Update multiple courses in an account.  Operates asynchronously; use the {api:ProgressController#show progress endpoint} to query the status of an operation.  The action to take on each course.  Must be one of &#x27;offer&#x27;, &#x27;conclude&#x27;, &#x27;delete&#x27;, or &#x27;undelete&#x27;.   * &#x27;offer&#x27; makes a course visible to students. This action is also called \&quot;publish\&quot; on the web site.   * &#x27;conclude&#x27; prevents future enrollments and makes a course read-only for all participants. The course still appears     in prior-enrollment lists.   * &#x27;delete&#x27; completely removes the course from the web site (including course menus and prior-enrollment lists).     All enrollments are deleted. Course content may be physically deleted at a future date.   * &#x27;undelete&#x27; attempts to recover a course that has been deleted. (Recovery is not guaranteed; please conclude     rather than delete a course if there is any possibility the course will be used again.) The recovered course     will be unpublished. Deleted enrollments will not be recovered.
   * @param accountId ID (required)
   * @param courseIds  (optional)
   * @param event  (optional)
   * @return Progress
   */
  @RequestLine("PUT /v1/accounts/{accountId}/courses")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress updateCourses(@Param("accountId") String accountId, @Param("courseIds") List<String> courseIds, @Param("event") String event);
  
}
