package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Rubric;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface RubricsApi extends ApiClient.Api {

  /**
   * Get a single rubric
   * Returns the rubric with the given id.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param include If included, the type of associated rubric assessments to return. If not included, assessments will be omitted. (optional)
   * @param style Applicable only if assessments are being returned. If included, returns either all criteria data associated with the assessment, or just the comments. If not included, both data and comments are omitted. (optional)
   * @return Rubric
   */
  @RequestLine("GET /v1/accounts/{accountId}/rubrics/{id}?include={include}&style={style}")
  @Headers({
      "Accept: application/json",
  })
  Rubric getSingleRubricAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("include") String include, @Param("style") String style);
  

  /**
   * Get a single rubric
   * Returns the rubric with the given id.
   * Note, this is equivalent to the other <code>getSingleRubricAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleRubricAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If included, the type of associated rubric assessments to return. If not included, assessments will be omitted. (optional)</li>
   *   <li>style - Applicable only if assessments are being returned. If included, returns either all criteria data associated with the assessment, or just the comments. If not included, both data and comments are omitted. (optional)</li>
   *   </ul>
   * @return Rubric

   */
  @RequestLine("GET /v1/accounts/{accountId}/rubrics/{id}?include={include}&style={style}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Rubric getSingleRubricAccounts(@Param("accountId") String accountId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleRubricAccounts</code> method in a fluent style.
   */
  public static class GetSingleRubricAccountsQueryParams extends HashMap<String, Object> {
    public GetSingleRubricAccountsQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleRubricAccountsQueryParams style(final String value) {
      put("style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a single rubric
   * Returns the rubric with the given id.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param include If included, the type of associated rubric assessments to return. If not included, assessments will be omitted. (optional)
   * @param style Applicable only if assessments are being returned. If included, returns either all criteria data associated with the assessment, or just the comments. If not included, both data and comments are omitted. (optional)
   * @return Rubric
   */
  @RequestLine("GET /v1/courses/{courseId}/rubrics/{id}?include={include}&style={style}")
  @Headers({
      "Accept: application/json",
  })
  Rubric getSingleRubricCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("include") String include, @Param("style") String style);
  

  /**
   * Get a single rubric
   * Returns the rubric with the given id.
   * Note, this is equivalent to the other <code>getSingleRubricCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleRubricCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If included, the type of associated rubric assessments to return. If not included, assessments will be omitted. (optional)</li>
   *   <li>style - Applicable only if assessments are being returned. If included, returns either all criteria data associated with the assessment, or just the comments. If not included, both data and comments are omitted. (optional)</li>
   *   </ul>
   * @return Rubric

   */
  @RequestLine("GET /v1/courses/{courseId}/rubrics/{id}?include={include}&style={style}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Rubric getSingleRubricCourses(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleRubricCourses</code> method in a fluent style.
   */
  public static class GetSingleRubricCoursesQueryParams extends HashMap<String, Object> {
    public GetSingleRubricCoursesQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
    public GetSingleRubricCoursesQueryParams style(final String value) {
      put("style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List rubrics
   * Returns the paginated list of active rubrics for the current context.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/rubrics")
  @Headers({
      "Accept: */*",
  })
  void listRubricsAccounts(@Param("accountId") String accountId);
  
  /**
   * List rubrics
   * Returns the paginated list of active rubrics for the current context.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/rubrics")
  @Headers({
      "Accept: */*",
  })
  void listRubricsCourses(@Param("courseId") String courseId);
  
}
