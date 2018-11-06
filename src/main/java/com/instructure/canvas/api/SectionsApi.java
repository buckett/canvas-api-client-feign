package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Section;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface SectionsApi extends ApiClient.Api {

  /**
   * Create course section
   * Creates a new section for this course.
   * @param courseId ID (required)
   * @param courseSectionName  (optional)
   * @param courseSectionSisSectionId  (optional)
   * @param courseSectionIntegrationId  (optional)
   * @param courseSectionStartAt  (optional)
   * @param courseSectionEndAt  (optional)
   * @param courseSectionRestrictEnrollmentsToSectionDates  (optional)
   * @param enableSisReactivation  (optional)
   * @return Section
   */
  @RequestLine("POST /v1/courses/{courseId}/sections")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Section createCourseSection(@Param("courseId") String courseId, @Param("courseSectionName") String courseSectionName, @Param("courseSectionSisSectionId") String courseSectionSisSectionId, @Param("courseSectionIntegrationId") String courseSectionIntegrationId, @Param("courseSectionStartAt") String courseSectionStartAt, @Param("courseSectionEndAt") String courseSectionEndAt, @Param("courseSectionRestrictEnrollmentsToSectionDates") Boolean courseSectionRestrictEnrollmentsToSectionDates, @Param("enableSisReactivation") Boolean enableSisReactivation);
  
  /**
   * Cross-list a Section
   * Move the Section to another course.  The new course may be in a different account (department), but must belong to the same root account (institution).
   * @param id ID (required)
   * @param newCourseId ID (required)
   * @return Section
   */
  @RequestLine("POST /v1/sections/{id}/crosslist/{newCourseId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Section crossListSection(@Param("id") String id, @Param("newCourseId") String newCourseId);
  
  /**
   * De-cross-list a Section
   * Undo cross-listing of a Section, returning it to its original course.
   * @param id ID (required)
   * @return Section
   */
  @RequestLine("DELETE /v1/sections/{id}/crosslist")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Section deCrossListSection(@Param("id") String id);
  
  /**
   * Delete a section
   * Delete an existing section.  Returns the former Section.
   * @param id ID (required)
   * @return Section
   */
  @RequestLine("DELETE /v1/sections/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Section deleteSection(@Param("id") String id);
  
  /**
   * Edit a section
   * Modify an existing section.
   * @param id ID (required)
   * @param courseSectionName  (optional)
   * @param courseSectionSisSectionId  (optional)
   * @param courseSectionIntegrationId  (optional)
   * @param courseSectionStartAt  (optional)
   * @param courseSectionEndAt  (optional)
   * @param courseSectionRestrictEnrollmentsToSectionDates  (optional)
   * @return Section
   */
  @RequestLine("PUT /v1/sections/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Section editSection(@Param("id") String id, @Param("courseSectionName") String courseSectionName, @Param("courseSectionSisSectionId") String courseSectionSisSectionId, @Param("courseSectionIntegrationId") String courseSectionIntegrationId, @Param("courseSectionStartAt") String courseSectionStartAt, @Param("courseSectionEndAt") String courseSectionEndAt, @Param("courseSectionRestrictEnrollmentsToSectionDates") Boolean courseSectionRestrictEnrollmentsToSectionDates);
  
  /**
   * Get section information
   * Gets details about a specific section
   * @param courseId ID (required)
   * @param id ID (required)
   * @param include - \&quot;students\&quot;: Associations to include with the group. Note: this is only   available if you have permission to view users or grades in the course - \&quot;avatar_url\&quot;: Include the avatar URLs for students returned. - \&quot;enrollments\&quot;: If &#x27;students&#x27; is also included, return the section   enrollment for each student - \&quot;total_students\&quot;: Returns the total amount of active and invited students   for the course section - \&quot;passback_status\&quot;: Include the grade passback status. (optional)
   * @return Section
   */
  @RequestLine("GET /v1/courses/{courseId}/sections/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  Section getSectionInformationCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get section information
   * Gets details about a specific section
   * Note, this is equivalent to the other <code>getSectionInformationCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSectionInformationCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;students\&quot;: Associations to include with the group. Note: this is only   available if you have permission to view users or grades in the course - \&quot;avatar_url\&quot;: Include the avatar URLs for students returned. - \&quot;enrollments\&quot;: If &#x27;students&#x27; is also included, return the section   enrollment for each student - \&quot;total_students\&quot;: Returns the total amount of active and invited students   for the course section - \&quot;passback_status\&quot;: Include the grade passback status. (optional)</li>
   *   </ul>
   * @return Section

   */
  @RequestLine("GET /v1/courses/{courseId}/sections/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Section getSectionInformationCourses(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSectionInformationCourses</code> method in a fluent style.
   */
  public static class GetSectionInformationCoursesQueryParams extends HashMap<String, Object> {
    public GetSectionInformationCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get section information
   * Gets details about a specific section
   * @param id ID (required)
   * @param include - \&quot;students\&quot;: Associations to include with the group. Note: this is only   available if you have permission to view users or grades in the course - \&quot;avatar_url\&quot;: Include the avatar URLs for students returned. - \&quot;enrollments\&quot;: If &#x27;students&#x27; is also included, return the section   enrollment for each student - \&quot;total_students\&quot;: Returns the total amount of active and invited students   for the course section - \&quot;passback_status\&quot;: Include the grade passback status. (optional)
   * @return Section
   */
  @RequestLine("GET /v1/sections/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  Section getSectionInformationSections(@Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get section information
   * Gets details about a specific section
   * Note, this is equivalent to the other <code>getSectionInformationSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSectionInformationSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;students\&quot;: Associations to include with the group. Note: this is only   available if you have permission to view users or grades in the course - \&quot;avatar_url\&quot;: Include the avatar URLs for students returned. - \&quot;enrollments\&quot;: If &#x27;students&#x27; is also included, return the section   enrollment for each student - \&quot;total_students\&quot;: Returns the total amount of active and invited students   for the course section - \&quot;passback_status\&quot;: Include the grade passback status. (optional)</li>
   *   </ul>
   * @return Section

   */
  @RequestLine("GET /v1/sections/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Section getSectionInformationSections(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSectionInformationSections</code> method in a fluent style.
   */
  public static class GetSectionInformationSectionsQueryParams extends HashMap<String, Object> {
    public GetSectionInformationSectionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List course sections
   * A paginated list of the list of sections for this course.
   * @param courseId ID (required)
   * @param include - \&quot;students\&quot;: Associations to include with the group. Note: this is only   available if you have permission to view users or grades in the course - \&quot;avatar_url\&quot;: Include the avatar URLs for students returned. - \&quot;enrollments\&quot;: If &#x27;students&#x27; is also included, return the section   enrollment for each student - \&quot;total_students\&quot;: Returns the total amount of active and invited students   for the course section - \&quot;passback_status\&quot;: Include the grade passback status. (optional)
   * @return List&lt;Section&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/sections?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Section> listCourseSections(@Param("courseId") String courseId, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Section&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Section> listCourseSections(URI uri);
  

  /**
   * List course sections
   * A paginated list of the list of sections for this course.
   * Note, this is equivalent to the other <code>listCourseSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCourseSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;students\&quot;: Associations to include with the group. Note: this is only   available if you have permission to view users or grades in the course - \&quot;avatar_url\&quot;: Include the avatar URLs for students returned. - \&quot;enrollments\&quot;: If &#x27;students&#x27; is also included, return the section   enrollment for each student - \&quot;total_students\&quot;: Returns the total amount of active and invited students   for the course section - \&quot;passback_status\&quot;: Include the grade passback status. (optional)</li>
   *   </ul>
   * @return List&lt;Section&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/sections?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Section> listCourseSections(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCourseSections</code> method in a fluent style.
   */
  public static class ListCourseSectionsQueryParams extends HashMap<String, Object> {
    public ListCourseSectionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
}
