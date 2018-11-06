package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Enrollment;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface EnrollmentsApi extends ApiClient.Api {

  /**
   * Accept Course Invitation
   * accepts a pending course invitation for the current user
   * @param courseId ID (required)
   * @param id ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/enrollments/{id}/accept")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void acceptCourseInvitation(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Adds last attended date to student enrollment in course
   * 
   * @param courseId ID (required)
   * @param userId ID (required)
   * @return Enrollment
   */
  @RequestLine("PUT /v1/courses/{courseId}/users/{userId}/last_attended")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Enrollment addsLastAttendedDateToStudentEnrollmentInCourse(@Param("courseId") String courseId, @Param("userId") String userId);
  
  /**
   * Conclude, deactivate, or delete an enrollment
   * Conclude, deactivate, or delete an enrollment. If the +task+ argument isn&#x27;t given, the enrollment will be concluded.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param task The action to take on the enrollment. When inactive, a user will still appear in the course roster to admins, but be unable to participate. (\&quot;inactivate\&quot; and \&quot;deactivate\&quot; are equivalent tasks) (optional)
   * @return Enrollment
   */
  @RequestLine("DELETE /v1/courses/{courseId}/enrollments/{id}?task={task}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Enrollment concludeDeactivateOrDeleteEnrollment(@Param("courseId") String courseId, @Param("id") String id, @Param("task") String task);
  

  /**
   * Conclude, deactivate, or delete an enrollment
   * Conclude, deactivate, or delete an enrollment. If the +task+ argument isn&#x27;t given, the enrollment will be concluded.
   * Note, this is equivalent to the other <code>concludeDeactivateOrDeleteEnrollment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConcludeDeactivateOrDeleteEnrollmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>task - The action to take on the enrollment. When inactive, a user will still appear in the course roster to admins, but be unable to participate. (\&quot;inactivate\&quot; and \&quot;deactivate\&quot; are equivalent tasks) (optional)</li>
   *   </ul>
   * @return Enrollment

   */
  @RequestLine("DELETE /v1/courses/{courseId}/enrollments/{id}?task={task}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Enrollment concludeDeactivateOrDeleteEnrollment(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>concludeDeactivateOrDeleteEnrollment</code> method in a fluent style.
   */
  public static class ConcludeDeactivateOrDeleteEnrollmentQueryParams extends HashMap<String, Object> {
    public ConcludeDeactivateOrDeleteEnrollmentQueryParams task(final String value) {
      put("task", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Enroll a user
   * Create a new user enrollment for a course or section.
   * @param courseId ID (required)
   * @param enrollmentUserId  (optional)
   * @param enrollmentType  (optional)
   * @param enrollmentRole  (optional)
   * @param enrollmentRoleId  (optional)
   * @param enrollmentEnrollmentState  (optional)
   * @param enrollmentCourseSectionId  (optional)
   * @param enrollmentLimitPrivilegesToCourseSection  (optional)
   * @param enrollmentNotify  (optional)
   * @param enrollmentSelfEnrollmentCode  (optional)
   * @param enrollmentSelfEnrolled  (optional)
   * @param enrollmentAssociatedUserId  (optional)
   * @return Enrollment
   */
  @RequestLine("POST /v1/courses/{courseId}/enrollments")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Enrollment enrollUserCourses(@Param("courseId") String courseId, @Param("enrollmentUserId") String enrollmentUserId, @Param("enrollmentType") String enrollmentType, @Param("enrollmentRole") Object enrollmentRole, @Param("enrollmentRoleId") Integer enrollmentRoleId, @Param("enrollmentEnrollmentState") String enrollmentEnrollmentState, @Param("enrollmentCourseSectionId") Integer enrollmentCourseSectionId, @Param("enrollmentLimitPrivilegesToCourseSection") Boolean enrollmentLimitPrivilegesToCourseSection, @Param("enrollmentNotify") Boolean enrollmentNotify, @Param("enrollmentSelfEnrollmentCode") String enrollmentSelfEnrollmentCode, @Param("enrollmentSelfEnrolled") Boolean enrollmentSelfEnrolled, @Param("enrollmentAssociatedUserId") Integer enrollmentAssociatedUserId);
  
  /**
   * Enroll a user
   * Create a new user enrollment for a course or section.
   * @param sectionId ID (required)
   * @param enrollmentUserId  (optional)
   * @param enrollmentType  (optional)
   * @param enrollmentRole  (optional)
   * @param enrollmentRoleId  (optional)
   * @param enrollmentEnrollmentState  (optional)
   * @param enrollmentCourseSectionId  (optional)
   * @param enrollmentLimitPrivilegesToCourseSection  (optional)
   * @param enrollmentNotify  (optional)
   * @param enrollmentSelfEnrollmentCode  (optional)
   * @param enrollmentSelfEnrolled  (optional)
   * @param enrollmentAssociatedUserId  (optional)
   * @return Enrollment
   */
  @RequestLine("POST /v1/sections/{sectionId}/enrollments")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Enrollment enrollUserSections(@Param("sectionId") String sectionId, @Param("enrollmentUserId") String enrollmentUserId, @Param("enrollmentType") String enrollmentType, @Param("enrollmentRole") Object enrollmentRole, @Param("enrollmentRoleId") Integer enrollmentRoleId, @Param("enrollmentEnrollmentState") String enrollmentEnrollmentState, @Param("enrollmentCourseSectionId") Integer enrollmentCourseSectionId, @Param("enrollmentLimitPrivilegesToCourseSection") Boolean enrollmentLimitPrivilegesToCourseSection, @Param("enrollmentNotify") Boolean enrollmentNotify, @Param("enrollmentSelfEnrollmentCode") String enrollmentSelfEnrollmentCode, @Param("enrollmentSelfEnrolled") Boolean enrollmentSelfEnrolled, @Param("enrollmentAssociatedUserId") Integer enrollmentAssociatedUserId);
  
  /**
   * Enrollment by ID
   * Get an Enrollment object by Enrollment ID
   * @param accountId ID (required)
   * @param id The ID of the enrollment object (required)
   * @return Enrollment
   */
  @RequestLine("GET /v1/accounts/{accountId}/enrollments/{id}")
  @Headers({
      "Accept: application/json",
  })
  Enrollment enrollmentById(@Param("accountId") String accountId, @Param("id") Integer id);
  
  /**
   * List enrollments
   * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
   * @param courseId ID (required)
   * @param type A list of enrollment types to return. Accepted values are &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;DesignerEnrollment&#x27;, and &#x27;ObserverEnrollment.&#x27; If omitted, all enrollment types are returned. This argument is ignored if &#x60;role&#x60; is given. (optional)
   * @param role A list of enrollment roles to return. Accepted values include course-level roles created by the {api:RoleOverridesController#add_role Add Role API} as well as the base enrollment types accepted by the &#x60;type&#x60; argument above. (optional)
   * @param state Filter by enrollment state. If omitted, &#x27;active&#x27; and &#x27;invited&#x27; enrollments are returned. When querying a user&#x27;s enrollments (either via user_id argument or via user enrollments endpoint), the following additional synthetic states are supported: \&quot;current_and_invited\&quot;|\&quot;current_and_future\&quot;|\&quot;current_and_concluded\&quot; (optional)
   * @param include Array of additional information to include on the enrollment or user records. \&quot;avatar_url\&quot; and \&quot;group_ids\&quot; will be returned on the user record. (optional)
   * @param userId Filter by user_id (only valid for course or section enrollment queries). If set to the current user&#x27;s id, this is a way to determine if the user has any enrollments in the course or section, independent of whether the user has permission to view other people on the roster. (optional)
   * @param gradingPeriodId Return grades for the given grading_period.  If this parameter is not specified, the returned grades will be for the whole course. (optional)
   * @param enrollmentTermId Returns only enrollments for the specified enrollment term. This parameter only applies to the user enrollments path. May pass the ID from the enrollment terms api or the SIS id prepended with &#x27;sis_term_id:&#x27;. (optional)
   * @param sisAccountId Returns only enrollments for the specified SIS account ID(s). Does not look into sub_accounts. May pass in array or string. (optional)
   * @param sisCourseId Returns only enrollments matching the specified SIS course ID(s). May pass in array or string. (optional)
   * @param sisSectionId Returns only section enrollments matching the specified SIS section ID(s). May pass in array or string. (optional)
   * @param sisUserId Returns only enrollments for the specified SIS user ID(s). May pass in array or string. (optional)
   * @return List&lt;Enrollment&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/enrollments?type={type}&role={role}&state={state}&include={include}&user_id={userId}&grading_period_id={gradingPeriodId}&enrollment_term_id={enrollmentTermId}&sis_account_id={sisAccountId}&sis_course_id={sisCourseId}&sis_section_id={sisSectionId}&sis_user_id={sisUserId}")
  @Headers({
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsCourses(@Param("courseId") String courseId, @Param("type") List<String> type, @Param("role") List<String> role, @Param("state") List<String> state, @Param("include") List<String> include, @Param("userId") String userId, @Param("gradingPeriodId") Integer gradingPeriodId, @Param("enrollmentTermId") Integer enrollmentTermId, @Param("sisAccountId") List<String> sisAccountId, @Param("sisCourseId") List<String> sisCourseId, @Param("sisSectionId") List<String> sisSectionId, @Param("sisUserId") List<String> sisUserId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Enrollment&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsCourses(URI uri);
  

  /**
   * List enrollments
   * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
   * Note, this is equivalent to the other <code>listEnrollmentsCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEnrollmentsCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>type - A list of enrollment types to return. Accepted values are &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;DesignerEnrollment&#x27;, and &#x27;ObserverEnrollment.&#x27; If omitted, all enrollment types are returned. This argument is ignored if &#x60;role&#x60; is given. (optional)</li>
   *   <li>role - A list of enrollment roles to return. Accepted values include course-level roles created by the {api:RoleOverridesController#add_role Add Role API} as well as the base enrollment types accepted by the &#x60;type&#x60; argument above. (optional)</li>
   *   <li>state - Filter by enrollment state. If omitted, &#x27;active&#x27; and &#x27;invited&#x27; enrollments are returned. When querying a user&#x27;s enrollments (either via user_id argument or via user enrollments endpoint), the following additional synthetic states are supported: \&quot;current_and_invited\&quot;|\&quot;current_and_future\&quot;|\&quot;current_and_concluded\&quot; (optional)</li>
   *   <li>include - Array of additional information to include on the enrollment or user records. \&quot;avatar_url\&quot; and \&quot;group_ids\&quot; will be returned on the user record. (optional)</li>
   *   <li>userId - Filter by user_id (only valid for course or section enrollment queries). If set to the current user&#x27;s id, this is a way to determine if the user has any enrollments in the course or section, independent of whether the user has permission to view other people on the roster. (optional)</li>
   *   <li>gradingPeriodId - Return grades for the given grading_period.  If this parameter is not specified, the returned grades will be for the whole course. (optional)</li>
   *   <li>enrollmentTermId - Returns only enrollments for the specified enrollment term. This parameter only applies to the user enrollments path. May pass the ID from the enrollment terms api or the SIS id prepended with &#x27;sis_term_id:&#x27;. (optional)</li>
   *   <li>sisAccountId - Returns only enrollments for the specified SIS account ID(s). Does not look into sub_accounts. May pass in array or string. (optional)</li>
   *   <li>sisCourseId - Returns only enrollments matching the specified SIS course ID(s). May pass in array or string. (optional)</li>
   *   <li>sisSectionId - Returns only section enrollments matching the specified SIS section ID(s). May pass in array or string. (optional)</li>
   *   <li>sisUserId - Returns only enrollments for the specified SIS user ID(s). May pass in array or string. (optional)</li>
   *   </ul>
   * @return List&lt;Enrollment&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/enrollments?type={type}&role={role}&state={state}&include={include}&user_id={userId}&grading_period_id={gradingPeriodId}&enrollment_term_id={enrollmentTermId}&sis_account_id={sisAccountId}&sis_course_id={sisCourseId}&sis_section_id={sisSectionId}&sis_user_id={sisUserId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEnrollmentsCourses</code> method in a fluent style.
   */
  public static class ListEnrollmentsCoursesQueryParams extends HashMap<String, Object> {
    public ListEnrollmentsCoursesQueryParams type(final List<String> value) {
      put("type", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams role(final List<String> value) {
      put("role", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams userId(final String value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams enrollmentTermId(final Integer value) {
      put("enrollment_term_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams sisAccountId(final List<String> value) {
      put("sis_account_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams sisCourseId(final List<String> value) {
      put("sis_course_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams sisSectionId(final List<String> value) {
      put("sis_section_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsCoursesQueryParams sisUserId(final List<String> value) {
      put("sis_user_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List enrollments
   * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
   * @param sectionId ID (required)
   * @param type A list of enrollment types to return. Accepted values are &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;DesignerEnrollment&#x27;, and &#x27;ObserverEnrollment.&#x27; If omitted, all enrollment types are returned. This argument is ignored if &#x60;role&#x60; is given. (optional)
   * @param role A list of enrollment roles to return. Accepted values include course-level roles created by the {api:RoleOverridesController#add_role Add Role API} as well as the base enrollment types accepted by the &#x60;type&#x60; argument above. (optional)
   * @param state Filter by enrollment state. If omitted, &#x27;active&#x27; and &#x27;invited&#x27; enrollments are returned. When querying a user&#x27;s enrollments (either via user_id argument or via user enrollments endpoint), the following additional synthetic states are supported: \&quot;current_and_invited\&quot;|\&quot;current_and_future\&quot;|\&quot;current_and_concluded\&quot; (optional)
   * @param include Array of additional information to include on the enrollment or user records. \&quot;avatar_url\&quot; and \&quot;group_ids\&quot; will be returned on the user record. (optional)
   * @param userId Filter by user_id (only valid for course or section enrollment queries). If set to the current user&#x27;s id, this is a way to determine if the user has any enrollments in the course or section, independent of whether the user has permission to view other people on the roster. (optional)
   * @param gradingPeriodId Return grades for the given grading_period.  If this parameter is not specified, the returned grades will be for the whole course. (optional)
   * @param enrollmentTermId Returns only enrollments for the specified enrollment term. This parameter only applies to the user enrollments path. May pass the ID from the enrollment terms api or the SIS id prepended with &#x27;sis_term_id:&#x27;. (optional)
   * @param sisAccountId Returns only enrollments for the specified SIS account ID(s). Does not look into sub_accounts. May pass in array or string. (optional)
   * @param sisCourseId Returns only enrollments matching the specified SIS course ID(s). May pass in array or string. (optional)
   * @param sisSectionId Returns only section enrollments matching the specified SIS section ID(s). May pass in array or string. (optional)
   * @param sisUserId Returns only enrollments for the specified SIS user ID(s). May pass in array or string. (optional)
   * @return List&lt;Enrollment&gt;
   */
  @RequestLine("GET /v1/sections/{sectionId}/enrollments?type={type}&role={role}&state={state}&include={include}&user_id={userId}&grading_period_id={gradingPeriodId}&enrollment_term_id={enrollmentTermId}&sis_account_id={sisAccountId}&sis_course_id={sisCourseId}&sis_section_id={sisSectionId}&sis_user_id={sisUserId}")
  @Headers({
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsSections(@Param("sectionId") String sectionId, @Param("type") List<String> type, @Param("role") List<String> role, @Param("state") List<String> state, @Param("include") List<String> include, @Param("userId") String userId, @Param("gradingPeriodId") Integer gradingPeriodId, @Param("enrollmentTermId") Integer enrollmentTermId, @Param("sisAccountId") List<String> sisAccountId, @Param("sisCourseId") List<String> sisCourseId, @Param("sisSectionId") List<String> sisSectionId, @Param("sisUserId") List<String> sisUserId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Enrollment&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsSections(URI uri);
  

  /**
   * List enrollments
   * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
   * Note, this is equivalent to the other <code>listEnrollmentsSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEnrollmentsSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>type - A list of enrollment types to return. Accepted values are &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;DesignerEnrollment&#x27;, and &#x27;ObserverEnrollment.&#x27; If omitted, all enrollment types are returned. This argument is ignored if &#x60;role&#x60; is given. (optional)</li>
   *   <li>role - A list of enrollment roles to return. Accepted values include course-level roles created by the {api:RoleOverridesController#add_role Add Role API} as well as the base enrollment types accepted by the &#x60;type&#x60; argument above. (optional)</li>
   *   <li>state - Filter by enrollment state. If omitted, &#x27;active&#x27; and &#x27;invited&#x27; enrollments are returned. When querying a user&#x27;s enrollments (either via user_id argument or via user enrollments endpoint), the following additional synthetic states are supported: \&quot;current_and_invited\&quot;|\&quot;current_and_future\&quot;|\&quot;current_and_concluded\&quot; (optional)</li>
   *   <li>include - Array of additional information to include on the enrollment or user records. \&quot;avatar_url\&quot; and \&quot;group_ids\&quot; will be returned on the user record. (optional)</li>
   *   <li>userId - Filter by user_id (only valid for course or section enrollment queries). If set to the current user&#x27;s id, this is a way to determine if the user has any enrollments in the course or section, independent of whether the user has permission to view other people on the roster. (optional)</li>
   *   <li>gradingPeriodId - Return grades for the given grading_period.  If this parameter is not specified, the returned grades will be for the whole course. (optional)</li>
   *   <li>enrollmentTermId - Returns only enrollments for the specified enrollment term. This parameter only applies to the user enrollments path. May pass the ID from the enrollment terms api or the SIS id prepended with &#x27;sis_term_id:&#x27;. (optional)</li>
   *   <li>sisAccountId - Returns only enrollments for the specified SIS account ID(s). Does not look into sub_accounts. May pass in array or string. (optional)</li>
   *   <li>sisCourseId - Returns only enrollments matching the specified SIS course ID(s). May pass in array or string. (optional)</li>
   *   <li>sisSectionId - Returns only section enrollments matching the specified SIS section ID(s). May pass in array or string. (optional)</li>
   *   <li>sisUserId - Returns only enrollments for the specified SIS user ID(s). May pass in array or string. (optional)</li>
   *   </ul>
   * @return List&lt;Enrollment&gt;

   */
  @RequestLine("GET /v1/sections/{sectionId}/enrollments?type={type}&role={role}&state={state}&include={include}&user_id={userId}&grading_period_id={gradingPeriodId}&enrollment_term_id={enrollmentTermId}&sis_account_id={sisAccountId}&sis_course_id={sisCourseId}&sis_section_id={sisSectionId}&sis_user_id={sisUserId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsSections(@Param("sectionId") String sectionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEnrollmentsSections</code> method in a fluent style.
   */
  public static class ListEnrollmentsSectionsQueryParams extends HashMap<String, Object> {
    public ListEnrollmentsSectionsQueryParams type(final List<String> value) {
      put("type", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams role(final List<String> value) {
      put("role", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams userId(final String value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams enrollmentTermId(final Integer value) {
      put("enrollment_term_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams sisAccountId(final List<String> value) {
      put("sis_account_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams sisCourseId(final List<String> value) {
      put("sis_course_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams sisSectionId(final List<String> value) {
      put("sis_section_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsSectionsQueryParams sisUserId(final List<String> value) {
      put("sis_user_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List enrollments
   * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
   * @param userId Filter by user_id (only valid for course or section enrollment queries). If set to the current user&#x27;s id, this is a way to determine if the user has any enrollments in the course or section, independent of whether the user has permission to view other people on the roster. (required)
   * @param type A list of enrollment types to return. Accepted values are &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;DesignerEnrollment&#x27;, and &#x27;ObserverEnrollment.&#x27; If omitted, all enrollment types are returned. This argument is ignored if &#x60;role&#x60; is given. (optional)
   * @param role A list of enrollment roles to return. Accepted values include course-level roles created by the {api:RoleOverridesController#add_role Add Role API} as well as the base enrollment types accepted by the &#x60;type&#x60; argument above. (optional)
   * @param state Filter by enrollment state. If omitted, &#x27;active&#x27; and &#x27;invited&#x27; enrollments are returned. When querying a user&#x27;s enrollments (either via user_id argument or via user enrollments endpoint), the following additional synthetic states are supported: \&quot;current_and_invited\&quot;|\&quot;current_and_future\&quot;|\&quot;current_and_concluded\&quot; (optional)
   * @param include Array of additional information to include on the enrollment or user records. \&quot;avatar_url\&quot; and \&quot;group_ids\&quot; will be returned on the user record. (optional)
   * @param gradingPeriodId Return grades for the given grading_period.  If this parameter is not specified, the returned grades will be for the whole course. (optional)
   * @param enrollmentTermId Returns only enrollments for the specified enrollment term. This parameter only applies to the user enrollments path. May pass the ID from the enrollment terms api or the SIS id prepended with &#x27;sis_term_id:&#x27;. (optional)
   * @param sisAccountId Returns only enrollments for the specified SIS account ID(s). Does not look into sub_accounts. May pass in array or string. (optional)
   * @param sisCourseId Returns only enrollments matching the specified SIS course ID(s). May pass in array or string. (optional)
   * @param sisSectionId Returns only section enrollments matching the specified SIS section ID(s). May pass in array or string. (optional)
   * @param sisUserId Returns only enrollments for the specified SIS user ID(s). May pass in array or string. (optional)
   * @return List&lt;Enrollment&gt;
   */
  @RequestLine("GET /v1/users/{userId}/enrollments?type={type}&role={role}&state={state}&include={include}&grading_period_id={gradingPeriodId}&enrollment_term_id={enrollmentTermId}&sis_account_id={sisAccountId}&sis_course_id={sisCourseId}&sis_section_id={sisSectionId}&sis_user_id={sisUserId}")
  @Headers({
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsUsers(@Param("userId") String userId, @Param("type") List<String> type, @Param("role") List<String> role, @Param("state") List<String> state, @Param("include") List<String> include, @Param("gradingPeriodId") Integer gradingPeriodId, @Param("enrollmentTermId") Integer enrollmentTermId, @Param("sisAccountId") List<String> sisAccountId, @Param("sisCourseId") List<String> sisCourseId, @Param("sisSectionId") List<String> sisSectionId, @Param("sisUserId") List<String> sisUserId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Enrollment&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsUsers(URI uri);
  

  /**
   * List enrollments
   * Depending on the URL given, return a paginated list of either (1) all of the enrollments in a course, (2) all of the enrollments in a section or (3) all of a user&#x27;s enrollments. This includes student, teacher, TA, and observer enrollments.  If a user has multiple enrollments in a context (e.g. as a teacher and a student or in multiple course sections), each enrollment will be listed separately.  note: Currently, only a root level admin user can return other users&#x27; enrollments. A user can, however, return his/her own enrollments.
   * Note, this is equivalent to the other <code>listEnrollmentsUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEnrollmentsUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId Filter by user_id (only valid for course or section enrollment queries). If set to the current user&#x27;s id, this is a way to determine if the user has any enrollments in the course or section, independent of whether the user has permission to view other people on the roster. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>type - A list of enrollment types to return. Accepted values are &#x27;StudentEnrollment&#x27;, &#x27;TeacherEnrollment&#x27;, &#x27;TaEnrollment&#x27;, &#x27;DesignerEnrollment&#x27;, and &#x27;ObserverEnrollment.&#x27; If omitted, all enrollment types are returned. This argument is ignored if &#x60;role&#x60; is given. (optional)</li>
   *   <li>role - A list of enrollment roles to return. Accepted values include course-level roles created by the {api:RoleOverridesController#add_role Add Role API} as well as the base enrollment types accepted by the &#x60;type&#x60; argument above. (optional)</li>
   *   <li>state - Filter by enrollment state. If omitted, &#x27;active&#x27; and &#x27;invited&#x27; enrollments are returned. When querying a user&#x27;s enrollments (either via user_id argument or via user enrollments endpoint), the following additional synthetic states are supported: \&quot;current_and_invited\&quot;|\&quot;current_and_future\&quot;|\&quot;current_and_concluded\&quot; (optional)</li>
   *   <li>include - Array of additional information to include on the enrollment or user records. \&quot;avatar_url\&quot; and \&quot;group_ids\&quot; will be returned on the user record. (optional)</li>
   *   <li>gradingPeriodId - Return grades for the given grading_period.  If this parameter is not specified, the returned grades will be for the whole course. (optional)</li>
   *   <li>enrollmentTermId - Returns only enrollments for the specified enrollment term. This parameter only applies to the user enrollments path. May pass the ID from the enrollment terms api or the SIS id prepended with &#x27;sis_term_id:&#x27;. (optional)</li>
   *   <li>sisAccountId - Returns only enrollments for the specified SIS account ID(s). Does not look into sub_accounts. May pass in array or string. (optional)</li>
   *   <li>sisCourseId - Returns only enrollments matching the specified SIS course ID(s). May pass in array or string. (optional)</li>
   *   <li>sisSectionId - Returns only section enrollments matching the specified SIS section ID(s). May pass in array or string. (optional)</li>
   *   <li>sisUserId - Returns only enrollments for the specified SIS user ID(s). May pass in array or string. (optional)</li>
   *   </ul>
   * @return List&lt;Enrollment&gt;

   */
  @RequestLine("GET /v1/users/{userId}/enrollments?type={type}&role={role}&state={state}&include={include}&grading_period_id={gradingPeriodId}&enrollment_term_id={enrollmentTermId}&sis_account_id={sisAccountId}&sis_course_id={sisCourseId}&sis_section_id={sisSectionId}&sis_user_id={sisUserId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Enrollment> listEnrollmentsUsers(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEnrollmentsUsers</code> method in a fluent style.
   */
  public static class ListEnrollmentsUsersQueryParams extends HashMap<String, Object> {
    public ListEnrollmentsUsersQueryParams type(final List<String> value) {
      put("type", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams role(final List<String> value) {
      put("role", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams gradingPeriodId(final Integer value) {
      put("grading_period_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsUsersQueryParams enrollmentTermId(final Integer value) {
      put("enrollment_term_id", EncodingUtils.encode(value));
      return this;
    }
    public ListEnrollmentsUsersQueryParams sisAccountId(final List<String> value) {
      put("sis_account_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams sisCourseId(final List<String> value) {
      put("sis_course_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams sisSectionId(final List<String> value) {
      put("sis_section_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentsUsersQueryParams sisUserId(final List<String> value) {
      put("sis_user_id", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Re-activate an enrollment
   * Activates an inactive enrollment
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Enrollment
   */
  @RequestLine("PUT /v1/courses/{courseId}/enrollments/{id}/reactivate")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Enrollment reActivateEnrollment(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Reject Course Invitation
   * rejects a pending course invitation for the current user
   * @param courseId ID (required)
   * @param id ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/enrollments/{id}/reject")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void rejectCourseInvitation(@Param("courseId") String courseId, @Param("id") String id);
  
}
