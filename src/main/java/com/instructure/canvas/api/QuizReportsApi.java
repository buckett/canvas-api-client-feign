package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.QuizReport;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizReportsApi extends ApiClient.Api {

  /**
   * Abort the generation of a report, or remove a previously generated one
   * This API allows you to cancel a previous request you issued for a report to be generated. Or in the case of an already generated report, you&#x27;d like to remove it, perhaps to generate it another time with an updated version that provides new features.  You must check the report&#x27;s generation status before attempting to use this interface. See the \&quot;workflow_state\&quot; property of the QuizReport&#x27;s Progress object for more information. Only when the progress reports itself in a \&quot;queued\&quot; state can the generation be aborted.  *Responses*  - &lt;code&gt;204 No Content&lt;/code&gt; if your request was accepted - &lt;code&gt;422 Unprocessable Entity&lt;/code&gt; if the report is not being generated   or can not be aborted at this stage
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/quizzes/{quizId}/reports/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void abortGenerationOfReportOrRemovePreviouslyGeneratedOne(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id);
  
  /**
   * Create a quiz report
   * Create and return a new report for this quiz. If a previously generated report matches the arguments and is still current (i.e. there have been no new submissions), it will be returned.  *Responses*  * &lt;code&gt;400 Bad Request&lt;/code&gt; if the specified report type is invalid * &lt;code&gt;409 Conflict&lt;/code&gt; if a quiz report of the specified type is already being   generated
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param quizReportReportType  (optional)
   * @param quizReportIncludesAllVersions  (optional)
   * @param include  (optional)
   * @return QuizReport
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/reports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  QuizReport createQuizReport(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("quizReportReportType") String quizReportReportType, @Param("quizReportIncludesAllVersions") Boolean quizReportIncludesAllVersions, @Param("include") String include);
  
  /**
   * Get a quiz report
   * Returns the data for a single quiz report.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param include Whether the output should include documents for the file and/or progress objects associated with this report. (Note: JSON-API only) (optional)
   * @return QuizReport
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/reports/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  QuizReport getQuizReport(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("include") String include);
  

  /**
   * Get a quiz report
   * Returns the data for a single quiz report.
   * Note, this is equivalent to the other <code>getQuizReport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQuizReportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Whether the output should include documents for the file and/or progress objects associated with this report. (Note: JSON-API only) (optional)</li>
   *   </ul>
   * @return QuizReport

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/reports/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  QuizReport getQuizReport(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getQuizReport</code> method in a fluent style.
   */
  public static class GetQuizReportQueryParams extends HashMap<String, Object> {
    public GetQuizReportQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Retrieve all quiz reports
   * Returns a list of all available reports.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param includesAllVersions Whether to retrieve reports that consider all the submissions or only the most recent. Defaults to false, ignored for item_analysis reports. (optional)
   * @return List&lt;QuizReport&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/reports?includes_all_versions={includesAllVersions}")
  @Headers({
      "Accept: application/json",
  })
  List<QuizReport> retrieveAllQuizReports(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("includesAllVersions") Boolean includesAllVersions);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;QuizReport&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<QuizReport> retrieveAllQuizReports(URI uri);
  

  /**
   * Retrieve all quiz reports
   * Returns a list of all available reports.
   * Note, this is equivalent to the other <code>retrieveAllQuizReports</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAllQuizReportsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>includesAllVersions - Whether to retrieve reports that consider all the submissions or only the most recent. Defaults to false, ignored for item_analysis reports. (optional)</li>
   *   </ul>
   * @return List&lt;QuizReport&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/reports?includes_all_versions={includesAllVersions}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<QuizReport> retrieveAllQuizReports(@Param("courseId") String courseId, @Param("quizId") String quizId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAllQuizReports</code> method in a fluent style.
   */
  public static class RetrieveAllQuizReportsQueryParams extends HashMap<String, Object> {
    public RetrieveAllQuizReportsQueryParams includesAllVersions(final Boolean value) {
      put("includes_all_versions", EncodingUtils.encode(value));
      return this;
    }
  }
}
