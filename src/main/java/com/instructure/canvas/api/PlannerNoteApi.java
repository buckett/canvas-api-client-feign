package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.PlannerNote;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PlannerNoteApi extends ApiClient.Api {

  /**
   * Create a planner note
   * Create a planner note for the current user
   * @param title  (optional)
   * @param details  (optional)
   * @param todoDate  (optional)
   * @param courseId  (optional)
   * @param linkedObjectType  (optional)
   * @param linkedObjectId  (optional)
   * @return PlannerNote
   */
  @RequestLine("POST /v1/planner_notes")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  PlannerNote createPlannerNote(@Param("title") String title, @Param("details") String details, @Param("todoDate") String todoDate, @Param("courseId") Integer courseId, @Param("linkedObjectType") String linkedObjectType, @Param("linkedObjectId") Integer linkedObjectId);
  
  /**
   * Delete a planner note
   * Delete a planner note for the current user
   * @param id ID (required)
   * @return PlannerNote
   */
  @RequestLine("DELETE /v1/planner_notes/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PlannerNote deletePlannerNote(@Param("id") String id);
  
  /**
   * List planner notes
   * Retrieve the paginated list of planner notes  Retrieve planner note for a user
   * @param startDate Only return notes with todo dates since the start_date (inclusive). No default. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)
   * @param endDate Only return notes with todo dates before the end_date (inclusive). No default. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. If end_date and start_date are both specified and equivalent, then only notes with todo dates on that day are returned. (optional)
   * @param contextCodes List of context codes of courses whose notes you want to see. If not specified, defaults to all contexts that the user belongs to. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42 Including a code matching the user&#x27;s own context code (e.g. user_1) will include notes that are not associated with any particular course. (optional)
   * @return List&lt;PlannerNote&gt;
   */
  @RequestLine("GET /v1/planner_notes?start_date={startDate}&end_date={endDate}&context_codes={contextCodes}")
  @Headers({
      "Accept: application/json",
  })
  List<PlannerNote> listPlannerNotes(@Param("startDate") String startDate, @Param("endDate") String endDate, @Param("contextCodes") List<String> contextCodes);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PlannerNote&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PlannerNote> listPlannerNotes(URI uri);
  

  /**
   * List planner notes
   * Retrieve the paginated list of planner notes  Retrieve planner note for a user
   * Note, this is equivalent to the other <code>listPlannerNotes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPlannerNotesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>startDate - Only return notes with todo dates since the start_date (inclusive). No default. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. (optional)</li>
   *   <li>endDate - Only return notes with todo dates before the end_date (inclusive). No default. The value should be formatted as: yyyy-mm-dd or ISO 8601 YYYY-MM-DDTHH:MM:SSZ. If end_date and start_date are both specified and equivalent, then only notes with todo dates on that day are returned. (optional)</li>
   *   <li>contextCodes - List of context codes of courses whose notes you want to see. If not specified, defaults to all contexts that the user belongs to. The format of this field is the context type, followed by an underscore, followed by the context id. For example: course_42 Including a code matching the user&#x27;s own context code (e.g. user_1) will include notes that are not associated with any particular course. (optional)</li>
   *   </ul>
   * @return List&lt;PlannerNote&gt;

   */
  @RequestLine("GET /v1/planner_notes?start_date={startDate}&end_date={endDate}&context_codes={contextCodes}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<PlannerNote> listPlannerNotes(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPlannerNotes</code> method in a fluent style.
   */
  public static class ListPlannerNotesQueryParams extends HashMap<String, Object> {
    public ListPlannerNotesQueryParams startDate(final String value) {
      put("start_date", EncodingUtils.encode(value));
      return this;
    }
    public ListPlannerNotesQueryParams endDate(final String value) {
      put("end_date", EncodingUtils.encode(value));
      return this;
    }
    public ListPlannerNotesQueryParams contextCodes(final List<String> value) {
      put("context_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Show a PlannerNote
   * Retrieve a planner note for the current user
   * @param id ID (required)
   * @return PlannerNote
   */
  @RequestLine("GET /v1/planner_notes/{id}")
  @Headers({
      "Accept: application/json",
  })
  PlannerNote showPlannernote(@Param("id") String id);
  
  /**
   * Update a PlannerNote
   * Update a planner note for the current user
   * @param id ID (required)
   * @param title  (optional)
   * @param details  (optional)
   * @param todoDate  (optional)
   * @param courseId  (optional)
   * @return PlannerNote
   */
  @RequestLine("PUT /v1/planner_notes/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  PlannerNote updatePlannernote(@Param("id") String id, @Param("title") String title, @Param("details") String details, @Param("todoDate") String todoDate, @Param("courseId") Integer courseId);
  
}
