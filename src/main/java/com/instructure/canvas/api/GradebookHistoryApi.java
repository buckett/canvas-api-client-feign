package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Day;
import com.instructure.canvas.model.Grader;
import com.instructure.canvas.model.SubmissionHistory;
import com.instructure.canvas.model.SubmissionVersion;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface GradebookHistoryApi extends ApiClient.Api {

  /**
   * Days in gradebook history for this course
   * Returns a map of dates to grader/assignment groups
   * @param courseId The id of the contextual course for this API call (required)
   * @return List&lt;Day&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/gradebook_history/days")
  @Headers({
      "Accept: application/json",
  })
  List<Day> daysInGradebookHistoryForThisCourse(@Param("courseId") Integer courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Day&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Day> daysInGradebookHistoryForThisCourse(URI uri);
  
  /**
   * Details for a given date in gradebook history for this course
   * Returns the graders who worked on this day, along with the assignments they worked on. More details can be obtained by selecting a grader and assignment and calling the &#x27;submissions&#x27; api endpoint for a given date.
   * @param courseId The id of the contextual course for this API call (required)
   * @param date The date for which you would like to see detailed information (required)
   * @return List&lt;Grader&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/gradebook_history/{date}")
  @Headers({
      "Accept: application/json",
  })
  List<Grader> detailsForGivenDateInGradebookHistoryForThisCourse(@Param("courseId") Integer courseId, @Param("date") String date);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Grader&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Grader> detailsForGivenDateInGradebookHistoryForThisCourse(URI uri);
  
  /**
   * List uncollated submission versions
   * Gives a paginated, uncollated list of submission versions for all matching submissions in the context. This SubmissionVersion objects will not include the +new_grade+ or +previous_grade+ keys, only the +grade+; same for +graded_at+ and +grader+.
   * @param courseId The id of the contextual course for this API call (required)
   * @param assignmentId The ID of the assignment for which you want to see submissions. If absent, versions of submissions from any assignment in the course are included. (optional)
   * @param userId The ID of the user for which you want to see submissions. If absent, versions of submissions from any user in the course are included. (optional)
   * @param ascending Returns submission versions in ascending date order (oldest first). If absent, returns submission versions in descending date order (newest first). (optional)
   * @return List&lt;SubmissionVersion&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/gradebook_history/feed?assignment_id={assignmentId}&user_id={userId}&ascending={ascending}")
  @Headers({
      "Accept: application/json",
  })
  List<SubmissionVersion> listUncollatedSubmissionVersions(@Param("courseId") Integer courseId, @Param("assignmentId") Integer assignmentId, @Param("userId") Integer userId, @Param("ascending") Boolean ascending);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;SubmissionVersion&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<SubmissionVersion> listUncollatedSubmissionVersions(URI uri);
  

  /**
   * List uncollated submission versions
   * Gives a paginated, uncollated list of submission versions for all matching submissions in the context. This SubmissionVersion objects will not include the +new_grade+ or +previous_grade+ keys, only the +grade+; same for +graded_at+ and +grader+.
   * Note, this is equivalent to the other <code>listUncollatedSubmissionVersions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUncollatedSubmissionVersionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId The id of the contextual course for this API call (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>assignmentId - The ID of the assignment for which you want to see submissions. If absent, versions of submissions from any assignment in the course are included. (optional)</li>
   *   <li>userId - The ID of the user for which you want to see submissions. If absent, versions of submissions from any user in the course are included. (optional)</li>
   *   <li>ascending - Returns submission versions in ascending date order (oldest first). If absent, returns submission versions in descending date order (newest first). (optional)</li>
   *   </ul>
   * @return List&lt;SubmissionVersion&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/gradebook_history/feed?assignment_id={assignmentId}&user_id={userId}&ascending={ascending}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<SubmissionVersion> listUncollatedSubmissionVersions(@Param("courseId") Integer courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listUncollatedSubmissionVersions</code> method in a fluent style.
   */
  public static class ListUncollatedSubmissionVersionsQueryParams extends HashMap<String, Object> {
    public ListUncollatedSubmissionVersionsQueryParams assignmentId(final Integer value) {
      put("assignment_id", EncodingUtils.encode(value));
      return this;
    }
    public ListUncollatedSubmissionVersionsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
    public ListUncollatedSubmissionVersionsQueryParams ascending(final Boolean value) {
      put("ascending", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Lists submissions
   * Gives a nested list of submission versions
   * @param courseId The id of the contextual course for this API call (required)
   * @param date The date for which you would like to see submissions (required)
   * @param graderId The ID of the grader for which you want to see submissions (required)
   * @param assignmentId The ID of the assignment for which you want to see submissions (required)
   * @return List&lt;SubmissionHistory&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/gradebook_history/{date}/graders/{graderId}/assignments/{assignmentId}/submissions")
  @Headers({
      "Accept: application/json",
  })
  List<SubmissionHistory> listsSubmissions(@Param("courseId") Integer courseId, @Param("date") String date, @Param("graderId") Integer graderId, @Param("assignmentId") Integer assignmentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;SubmissionHistory&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<SubmissionHistory> listsSubmissions(URI uri);
  
}
