package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface GradingPeriodsApi extends ApiClient.Api {

  /**
   * Delete a grading period
   * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
   * @param accountId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/grading_periods/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteGradingPeriodAccounts(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Delete a grading period
   * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
   * @param courseId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/grading_periods/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteGradingPeriodCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Get a single grading period
   * Returns the grading period with the given id
   * @param courseId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/grading_periods/{id}")
  @Headers({
      "Accept: */*",
  })
  void getSingleGradingPeriod(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * List grading periods
   * Returns the paginated list of grading periods for the current course.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/grading_periods")
  @Headers({
      "Accept: */*",
  })
  void listGradingPeriodsAccounts(@Param("accountId") String accountId);
  
  /**
   * List grading periods
   * Returns the paginated list of grading periods for the current course.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/grading_periods")
  @Headers({
      "Accept: */*",
  })
  void listGradingPeriodsCourses(@Param("courseId") String courseId);
  
  /**
   * Update a single grading period
   * Update an existing grading period.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param gradingPeriodsStartDate  (optional)
   * @param gradingPeriodsEndDate  (optional)
   * @param gradingPeriodsWeight  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/grading_periods/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateSingleGradingPeriod(@Param("courseId") String courseId, @Param("id") String id, @Param("gradingPeriodsStartDate") List<LocalDate> gradingPeriodsStartDate, @Param("gradingPeriodsEndDate") List<LocalDate> gradingPeriodsEndDate, @Param("gradingPeriodsWeight") List<BigDecimal> gradingPeriodsWeight);
  
}
