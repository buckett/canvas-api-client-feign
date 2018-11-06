package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.GradeChangeEvent;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface GradeChangeLogApi extends ApiClient.Api {

  /**
   * Query by assignment.
   * List grade change events for a given assignment.
   * @param assignmentId ID (required)
   * @param startTime The beginning of the time range from which you want events. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET /v1/audit/grade_change/assignments/{assignmentId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByAssignment(@Param("assignmentId") String assignmentId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByAssignment(URI uri);
  

  /**
   * Query by assignment.
   * List grade change events for a given assignment.
   * Note, this is equivalent to the other <code>queryByAssignment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByAssignmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>
   * @return List&lt;GradeChangeEvent&gt;

   */
  @RequestLine("GET /v1/audit/grade_change/assignments/{assignmentId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByAssignment(@Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByAssignment</code> method in a fluent style.
   */
  public static class QueryByAssignmentQueryParams extends HashMap<String, Object> {
    public QueryByAssignmentQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByAssignmentQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Query by course.
   * List grade change events for a given course.
   * @param courseId ID (required)
   * @param startTime The beginning of the time range from which you want events. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET /v1/audit/grade_change/courses/{courseId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByCourse(@Param("courseId") String courseId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByCourse(URI uri);
  

  /**
   * Query by course.
   * List grade change events for a given course.
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
   * @return List&lt;GradeChangeEvent&gt;

   */
  @RequestLine("GET /v1/audit/grade_change/courses/{courseId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByCourse(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

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
  /**
   * Query by grader.
   * List grade change events for a given grader.
   * @param graderId ID (required)
   * @param startTime The beginning of the time range from which you want events. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET /v1/audit/grade_change/graders/{graderId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByGrader(@Param("graderId") String graderId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByGrader(URI uri);
  

  /**
   * Query by grader.
   * List grade change events for a given grader.
   * Note, this is equivalent to the other <code>queryByGrader</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByGraderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param graderId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>
   * @return List&lt;GradeChangeEvent&gt;

   */
  @RequestLine("GET /v1/audit/grade_change/graders/{graderId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByGrader(@Param("graderId") String graderId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByGrader</code> method in a fluent style.
   */
  public static class QueryByGraderQueryParams extends HashMap<String, Object> {
    public QueryByGraderQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByGraderQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Query by student.
   * List grade change events for a given student.
   * @param studentId ID (required)
   * @param startTime The beginning of the time range from which you want events. (optional)
   * @param endTime The end of the time range from which you want events. (optional)
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET /v1/audit/grade_change/students/{studentId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByStudent(@Param("studentId") String studentId, @Param("startTime") String startTime, @Param("endTime") String endTime);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GradeChangeEvent&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByStudent(URI uri);
  

  /**
   * Query by student.
   * List grade change events for a given student.
   * Note, this is equivalent to the other <code>queryByStudent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryByStudentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param studentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startTime - The beginning of the time range from which you want events. (optional)</li>
   *   <li>endTime - The end of the time range from which you want events. (optional)</li>
   *   </ul>
   * @return List&lt;GradeChangeEvent&gt;

   */
  @RequestLine("GET /v1/audit/grade_change/students/{studentId}?start_time={startTime}&end_time={endTime}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<GradeChangeEvent> queryByStudent(@Param("studentId") String studentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryByStudent</code> method in a fluent style.
   */
  public static class QueryByStudentQueryParams extends HashMap<String, Object> {
    public QueryByStudentQueryParams startTime(final String value) {
      put("start_time", EncodingUtils.encode(value));
      return this;
    }
    public QueryByStudentQueryParams endTime(final String value) {
      put("end_time", EncodingUtils.encode(value));
      return this;
    }
  }
}
