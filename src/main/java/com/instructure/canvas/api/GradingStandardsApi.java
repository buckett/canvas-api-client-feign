package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.GradingStandard;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface GradingStandardsApi extends ApiClient.Api {

  /**
   * Create a new grading standard
   * Create a new grading standard  If grading_scheme_entry arguments are omitted, then a default grading scheme will be set. The default scheme is as follows:      \&quot;A\&quot; : 94,      \&quot;A-\&quot; : 90,      \&quot;B+\&quot; : 87,      \&quot;B\&quot; : 84,      \&quot;B-\&quot; : 80,      \&quot;C+\&quot; : 77,      \&quot;C\&quot; : 74,      \&quot;C-\&quot; : 70,      \&quot;D+\&quot; : 67,      \&quot;D\&quot; : 64,      \&quot;D-\&quot; : 61,      \&quot;F\&quot; : 0,
   * @param accountId ID (required)
   * @param title  (optional)
   * @param gradingSchemeEntryName  (optional)
   * @param gradingSchemeEntryValue  (optional)
   * @return GradingStandard
   */
  @RequestLine("POST /v1/accounts/{accountId}/grading_standards")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GradingStandard createNewGradingStandardAccounts(@Param("accountId") String accountId, @Param("title") String title, @Param("gradingSchemeEntryName") List<String> gradingSchemeEntryName, @Param("gradingSchemeEntryValue") List<Integer> gradingSchemeEntryValue);
  
  /**
   * Create a new grading standard
   * Create a new grading standard  If grading_scheme_entry arguments are omitted, then a default grading scheme will be set. The default scheme is as follows:      \&quot;A\&quot; : 94,      \&quot;A-\&quot; : 90,      \&quot;B+\&quot; : 87,      \&quot;B\&quot; : 84,      \&quot;B-\&quot; : 80,      \&quot;C+\&quot; : 77,      \&quot;C\&quot; : 74,      \&quot;C-\&quot; : 70,      \&quot;D+\&quot; : 67,      \&quot;D\&quot; : 64,      \&quot;D-\&quot; : 61,      \&quot;F\&quot; : 0,
   * @param courseId ID (required)
   * @param title  (optional)
   * @param gradingSchemeEntryName  (optional)
   * @param gradingSchemeEntryValue  (optional)
   * @return GradingStandard
   */
  @RequestLine("POST /v1/courses/{courseId}/grading_standards")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  GradingStandard createNewGradingStandardCourses(@Param("courseId") String courseId, @Param("title") String title, @Param("gradingSchemeEntryName") List<String> gradingSchemeEntryName, @Param("gradingSchemeEntryValue") List<Integer> gradingSchemeEntryValue);
  
  /**
   * Get a single grading standard in a context.
   * Returns a grading standard for the given context that is visible to the user.
   * @param accountId ID (required)
   * @param gradingStandardId ID (required)
   * @return GradingStandard
   */
  @RequestLine("GET /v1/accounts/{accountId}/grading_standards/{gradingStandardId}")
  @Headers({
      "Accept: application/json",
  })
  GradingStandard getSingleGradingStandardInContextAccounts(@Param("accountId") String accountId, @Param("gradingStandardId") String gradingStandardId);
  
  /**
   * Get a single grading standard in a context.
   * Returns a grading standard for the given context that is visible to the user.
   * @param courseId ID (required)
   * @param gradingStandardId ID (required)
   * @return GradingStandard
   */
  @RequestLine("GET /v1/courses/{courseId}/grading_standards/{gradingStandardId}")
  @Headers({
      "Accept: application/json",
  })
  GradingStandard getSingleGradingStandardInContextCourses(@Param("courseId") String courseId, @Param("gradingStandardId") String gradingStandardId);
  
  /**
   * List the grading standards available in a context.
   * Returns the paginated list of grading standards for the given context that are visible to the user.
   * @param accountId ID (required)
   * @return List&lt;GradingStandard&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/grading_standards")
  @Headers({
      "Accept: application/json",
  })
  List<GradingStandard> listGradingStandardsAvailableInContextAccounts(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GradingStandard&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GradingStandard> listGradingStandardsAvailableInContextAccounts(URI uri);
  
  /**
   * List the grading standards available in a context.
   * Returns the paginated list of grading standards for the given context that are visible to the user.
   * @param courseId ID (required)
   * @return List&lt;GradingStandard&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/grading_standards")
  @Headers({
      "Accept: application/json",
  })
  List<GradingStandard> listGradingStandardsAvailableInContextCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;GradingStandard&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<GradingStandard> listGradingStandardsAvailableInContextCourses(URI uri);
  
}
