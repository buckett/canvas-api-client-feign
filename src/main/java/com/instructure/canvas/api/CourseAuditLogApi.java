package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.CourseEvent;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CourseAuditLogApi extends ApiClient.Api {

  /**
   * Query by course.
   * List course change events for a given course.
   * @param courseId ID (required)
   * @param startTime The beginning of the time range from which you want events. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   * @return List&lt;CourseEvent&gt;
   */
  @RequestLine("GET /v1/audit/course/courses/{courseId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<CourseEvent> queryByCourse(@Param("courseId") String courseId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CourseEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CourseEvent> queryByCourse(URI uri);
  

  /**
   * Query by course.
   * List course change events for a given course.
   * Note, this is equivalent to the other <code>queryByCourse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByCourseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>
   * @return List&lt;CourseEvent&gt;

   */
  @RequestLine("GET /v1/audit/course/courses/{courseId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<CourseEvent> queryByCourse(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByCourse</code> method in a fluent style.
   */
  public static class QueryByCourseQueryParams extends HashMap<String, Object> {
    public QueryByCourseQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByCourseQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
}
