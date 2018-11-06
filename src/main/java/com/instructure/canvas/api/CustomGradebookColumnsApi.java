package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.ColumnDatum;
import com.instructure.canvas.model.CustomColumn;
import com.instructure.canvas.model.Progress;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CustomGradebookColumnsApi extends ApiClient.Api {

  /**
   * Bulk update column data
   * Set the content of custom columns  {   \&quot;column_data\&quot;: [     {       \&quot;column_id\&quot;: example_column_id,       \&quot;user_id\&quot;: example_student_id,       \&quot;content\&quot;: example_content       },       {       \&quot;column_id\&quot;: example_column_id,       \&quot;user_id\&quot;: example_student_id,       \&quot;content: example_content     }   ] }
   * @param courseId ID (required)
   * @param columnData  (optional)
   * @return Progress
   */
  @RequestLine("PUT /v1/courses/{courseId}/custom_gradebook_column_data")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress bulkUpdateColumnData(@Param("courseId") String courseId, @Param("columnData") List<List<Object>> columnData);
  
  /**
   * Create a custom gradebook column
   * Create a custom gradebook column
   * @param courseId ID (required)
   * @param columnTitle  (optional)
   * @param columnPosition  (optional)
   * @param columnHidden  (optional)
   * @param columnTeacherNotes  (optional)
   * @param columnReadOnly  (optional)
   * @return CustomColumn
   */
  @RequestLine("POST /v1/courses/{courseId}/custom_gradebook_columns")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  CustomColumn createCustomGradebookColumn(@Param("courseId") String courseId, @Param("columnTitle") String columnTitle, @Param("columnPosition") Integer columnPosition, @Param("columnHidden") Boolean columnHidden, @Param("columnTeacherNotes") Boolean columnTeacherNotes, @Param("columnReadOnly") Boolean columnReadOnly);
  
  /**
   * Delete a custom gradebook column
   * Permanently deletes a custom column and its associated data
   * @param courseId ID (required)
   * @param id ID (required)
   * @return CustomColumn
   */
  @RequestLine("DELETE /v1/courses/{courseId}/custom_gradebook_columns/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CustomColumn deleteCustomGradebookColumn(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * List custom gradebook columns
   * A paginated list of all custom gradebook columns for a course
   * @param courseId ID (required)
   * @param includeHidden Include hidden parameters (defaults to false) (optional)
   * @return List&lt;CustomColumn&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/custom_gradebook_columns?include_hidden={includeHidden}")
  @Headers({
      "Accept: application/json",
  })
  List<CustomColumn> listCustomGradebookColumns(@Param("courseId") String courseId, @Param("includeHidden") Boolean includeHidden);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CustomColumn&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CustomColumn> listCustomGradebookColumns(URI uri);
  

  /**
   * List custom gradebook columns
   * A paginated list of all custom gradebook columns for a course
   * Note, this is equivalent to the other <code>listCustomGradebookColumns</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCustomGradebookColumnsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>includeHidden - Include hidden parameters (defaults to false) (optional)</li>
   *   </ul>
   * @return List&lt;CustomColumn&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/custom_gradebook_columns?include_hidden={includeHidden}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<CustomColumn> listCustomGradebookColumns(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listCustomGradebookColumns</code> method in a fluent style.
   */
  public static class ListCustomGradebookColumnsQueryParams extends HashMap<String, Object> {
    public ListCustomGradebookColumnsQueryParams includeHidden(final Boolean value) {
      put("include_hidden", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List entries for a column
   * This does not list entries for students without associated data.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param includeHidden If true, hidden columns will be included in the result. If false or absent, only visible columns will be returned. (optional)
   * @return List&lt;ColumnDatum&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/custom_gradebook_columns/{id}/data?include_hidden={includeHidden}")
  @Headers({
      "Accept: application/json",
  })
  List<ColumnDatum> listEntriesForColumn(@Param("courseId") String courseId, @Param("id") String id, @Param("includeHidden") Boolean includeHidden);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ColumnDatum&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ColumnDatum> listEntriesForColumn(URI uri);
  

  /**
   * List entries for a column
   * This does not list entries for students without associated data.
   * Note, this is equivalent to the other <code>listEntriesForColumn</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEntriesForColumnQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>includeHidden - If true, hidden columns will be included in the result. If false or absent, only visible columns will be returned. (optional)</li>
   *   </ul>
   * @return List&lt;ColumnDatum&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/custom_gradebook_columns/{id}/data?include_hidden={includeHidden}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<ColumnDatum> listEntriesForColumn(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEntriesForColumn</code> method in a fluent style.
   */
  public static class ListEntriesForColumnQueryParams extends HashMap<String, Object> {
    public ListEntriesForColumnQueryParams includeHidden(final Boolean value) {
      put("include_hidden", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Reorder custom columns
   * Puts the given columns in the specified order  &lt;b&gt;200 OK&lt;/b&gt; is returned if successful
   * @param courseId ID (required)
   * @param order  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/custom_gradebook_columns/reorder")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reorderCustomColumns(@Param("courseId") String courseId, @Param("order") List<Integer> order);
  
  /**
   * Update column data
   * Set the content of a custom column
   * @param courseId ID (required)
   * @param id ID (required)
   * @param userId ID (required)
   * @param columnDataContent  (optional)
   * @return ColumnDatum
   */
  @RequestLine("PUT /v1/courses/{courseId}/custom_gradebook_columns/{id}/data/{userId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ColumnDatum updateColumnData(@Param("courseId") String courseId, @Param("id") String id, @Param("userId") String userId, @Param("columnDataContent") String columnDataContent);
  
  /**
   * Update a custom gradebook column
   * Accepts the same parameters as custom gradebook column creation
   * @param courseId ID (required)
   * @param id ID (required)
   * @return CustomColumn
   */
  @RequestLine("PUT /v1/courses/{courseId}/custom_gradebook_columns/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CustomColumn updateCustomGradebookColumn(@Param("courseId") String courseId, @Param("id") String id);
  
}
