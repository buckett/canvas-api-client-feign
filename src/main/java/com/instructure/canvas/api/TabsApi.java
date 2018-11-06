package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Tab;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface TabsApi extends ApiClient.Api {

  /**
   * List available tabs for a course or group
   * Returns a paginated list of navigation tabs available in the current context.
   * @param courseId ID (required)
   * @param include \&quot;external\&quot;:: Optionally include external tool tabs in the returned list of tabs (Only has effect for courses, not groups) (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/tabs?include={include}")
  @Headers({
      "Accept: */*",
  })
  void listAvailableTabsForCourseOrGroupCourses(@Param("courseId") String courseId, @Param("include") List<String> include);
  

  /**
   * List available tabs for a course or group
   * Returns a paginated list of navigation tabs available in the current context.
   * Note, this is equivalent to the other <code>listAvailableTabsForCourseOrGroupCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAvailableTabsForCourseOrGroupCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - \&quot;external\&quot;:: Optionally include external tool tabs in the returned list of tabs (Only has effect for courses, not groups) (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/tabs?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listAvailableTabsForCourseOrGroupCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAvailableTabsForCourseOrGroupCourses</code> method in a fluent style.
   */
  public static class ListAvailableTabsForCourseOrGroupCoursesQueryParams extends HashMap<String, Object> {
    public ListAvailableTabsForCourseOrGroupCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List available tabs for a course or group
   * Returns a paginated list of navigation tabs available in the current context.
   * @param groupId ID (required)
   * @param include \&quot;external\&quot;:: Optionally include external tool tabs in the returned list of tabs (Only has effect for courses, not groups) (optional)
   */
  @RequestLine("GET /v1/groups/{groupId}/tabs?include={include}")
  @Headers({
      "Accept: */*",
  })
  void listAvailableTabsForCourseOrGroupGroups(@Param("groupId") String groupId, @Param("include") List<String> include);
  

  /**
   * List available tabs for a course or group
   * Returns a paginated list of navigation tabs available in the current context.
   * Note, this is equivalent to the other <code>listAvailableTabsForCourseOrGroupGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAvailableTabsForCourseOrGroupGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - \&quot;external\&quot;:: Optionally include external tool tabs in the returned list of tabs (Only has effect for courses, not groups) (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/groups/{groupId}/tabs?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void listAvailableTabsForCourseOrGroupGroups(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAvailableTabsForCourseOrGroupGroups</code> method in a fluent style.
   */
  public static class ListAvailableTabsForCourseOrGroupGroupsQueryParams extends HashMap<String, Object> {
    public ListAvailableTabsForCourseOrGroupGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Update a tab for a course
   * Home and Settings tabs are not manageable, and can&#x27;t be hidden or moved  Returns a tab object
   * @param courseId ID (required)
   * @param tabId ID (required)
   * @param position  (optional)
   * @param hidden  (optional)
   * @return Tab
   */
  @RequestLine("PUT /v1/courses/{courseId}/tabs/{tabId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Tab updateTabForCourse(@Param("courseId") String courseId, @Param("tabId") String tabId, @Param("position") Integer position, @Param("hidden") Boolean hidden);
  
}
