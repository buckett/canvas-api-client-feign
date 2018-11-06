package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import java.math.BigDecimal;
import com.instructure.canvas.model.OriginalityReport;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface OriginalityReportsApi extends ApiClient.Api {

  /**
   * Create an Originality Report
   * Create a new OriginalityReport for the specified file
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param originalityReportFileId  (optional)
   * @param originalityReportOriginalityScore  (optional)
   * @param originalityReportOriginalityReportUrl  (optional)
   * @param originalityReportOriginalityReportFileId  (optional)
   * @param originalityReportToolSettingResourceTypeCode  (optional)
   * @param originalityReportToolSettingResourceUrl  (optional)
   * @param originalityReportWorkflowState  (optional)
   * @return OriginalityReport
   */
  @RequestLine("POST /lti/assignments/{assignmentId}/submissions/{submissionId}/originality_report")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OriginalityReport createOriginalityReport(@Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("originalityReportFileId") Integer originalityReportFileId, @Param("originalityReportOriginalityScore") BigDecimal originalityReportOriginalityScore, @Param("originalityReportOriginalityReportUrl") String originalityReportOriginalityReportUrl, @Param("originalityReportOriginalityReportFileId") Integer originalityReportOriginalityReportFileId, @Param("originalityReportToolSettingResourceTypeCode") String originalityReportToolSettingResourceTypeCode, @Param("originalityReportToolSettingResourceUrl") String originalityReportToolSettingResourceUrl, @Param("originalityReportWorkflowState") String originalityReportWorkflowState);
  
  /**
   * Edit an Originality Report
   * Modify an existing originality report. An alternative to this endpoint is to POST the same parameters listed below to the CREATE endpoint.
   * @param assignmentId ID (required)
   * @param fileId ID (required)
   * @param originalityReportOriginalityScore  (optional)
   * @param originalityReportOriginalityReportUrl  (optional)
   * @param originalityReportOriginalityReportFileId  (optional)
   * @param originalityReportToolSettingResourceTypeCode  (optional)
   * @param originalityReportToolSettingResourceUrl  (optional)
   * @param originalityReportWorkflowState  (optional)
   * @return OriginalityReport
   */
  @RequestLine("PUT /lti/assignments/{assignmentId}/files/{fileId}/originality_report")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OriginalityReport editOriginalityReportFiles(@Param("assignmentId") String assignmentId, @Param("fileId") String fileId, @Param("originalityReportOriginalityScore") BigDecimal originalityReportOriginalityScore, @Param("originalityReportOriginalityReportUrl") String originalityReportOriginalityReportUrl, @Param("originalityReportOriginalityReportFileId") Integer originalityReportOriginalityReportFileId, @Param("originalityReportToolSettingResourceTypeCode") String originalityReportToolSettingResourceTypeCode, @Param("originalityReportToolSettingResourceUrl") String originalityReportToolSettingResourceUrl, @Param("originalityReportWorkflowState") String originalityReportWorkflowState);
  
  /**
   * Edit an Originality Report
   * Modify an existing originality report. An alternative to this endpoint is to POST the same parameters listed below to the CREATE endpoint.
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param id ID (required)
   * @param originalityReportOriginalityScore  (optional)
   * @param originalityReportOriginalityReportUrl  (optional)
   * @param originalityReportOriginalityReportFileId  (optional)
   * @param originalityReportToolSettingResourceTypeCode  (optional)
   * @param originalityReportToolSettingResourceUrl  (optional)
   * @param originalityReportWorkflowState  (optional)
   * @return OriginalityReport
   */
  @RequestLine("PUT /lti/assignments/{assignmentId}/submissions/{submissionId}/originality_report/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OriginalityReport editOriginalityReportSubmissions(@Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("id") String id, @Param("originalityReportOriginalityScore") BigDecimal originalityReportOriginalityScore, @Param("originalityReportOriginalityReportUrl") String originalityReportOriginalityReportUrl, @Param("originalityReportOriginalityReportFileId") Integer originalityReportOriginalityReportFileId, @Param("originalityReportToolSettingResourceTypeCode") String originalityReportToolSettingResourceTypeCode, @Param("originalityReportToolSettingResourceUrl") String originalityReportToolSettingResourceUrl, @Param("originalityReportWorkflowState") String originalityReportWorkflowState);
  
  /**
   * Show an Originality Report
   * Get a single originality report
   * @param assignmentId ID (required)
   * @param fileId ID (required)
   * @return OriginalityReport
   */
  @RequestLine("GET /lti/assignments/{assignmentId}/files/{fileId}/originality_report")
  @Headers({
      "Accept: application/json",
  })
  OriginalityReport showOriginalityReportFiles(@Param("assignmentId") String assignmentId, @Param("fileId") String fileId);
  
  /**
   * Show an Originality Report
   * Get a single originality report
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param id ID (required)
   * @return OriginalityReport
   */
  @RequestLine("GET /lti/assignments/{assignmentId}/submissions/{submissionId}/originality_report/{id}")
  @Headers({
      "Accept: application/json",
  })
  OriginalityReport showOriginalityReportSubmissions(@Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("id") String id);
  
}
