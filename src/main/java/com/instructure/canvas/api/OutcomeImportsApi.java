package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.OutcomeImport;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface OutcomeImportsApi extends ApiClient.Api {

  /**
   * Get Outcome import status
   * Get the status of an already created Outcome import. Pass &#x27;latest&#x27; for the outcome import id for the latest import.    Examples:     curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;     curl &#x27;https://&lt;canvas&gt;/api/v1/courses/&lt;course_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
   * @param accountId ID (required)
   * @param id ID (required)
   * @return OutcomeImport
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_imports/{id}")
  @Headers({
      "Accept: application/json",
  })
  OutcomeImport getOutcomeImportStatusAccounts(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Get Outcome import status
   * Get the status of an already created Outcome import. Pass &#x27;latest&#x27; for the outcome import id for the latest import.    Examples:     curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;     curl &#x27;https://&lt;canvas&gt;/api/v1/courses/&lt;course_id&gt;/outcome_imports/&lt;outcome_import_id&gt;&#x27; \\         -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
   * @param courseId ID (required)
   * @param id ID (required)
   * @return OutcomeImport
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_imports/{id}")
  @Headers({
      "Accept: application/json",
  })
  OutcomeImport getOutcomeImportStatusCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Import Outcomes
   * Import outcomes into Canvas.  For more information on the format that&#x27;s expected here, please see the \&quot;Outcomes CSV\&quot; section in the API docs.
   * @param accountId ID (required)
   * @param importType  (optional)
   * @param attachment  (optional)
   * @param extension  (optional)
   * @return OutcomeImport
   */
  @RequestLine("POST /v1/accounts/{accountId}/outcome_imports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeImport importOutcomesAccounts(@Param("accountId") String accountId, @Param("importType") String importType, @Param("attachment") String attachment, @Param("extension") String extension);
  
  /**
   * Import Outcomes
   * Import outcomes into Canvas.  For more information on the format that&#x27;s expected here, please see the \&quot;Outcomes CSV\&quot; section in the API docs.
   * @param courseId ID (required)
   * @param importType  (optional)
   * @param attachment  (optional)
   * @param extension  (optional)
   * @return OutcomeImport
   */
  @RequestLine("POST /v1/courses/{courseId}/outcome_imports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeImport importOutcomesCourses(@Param("courseId") String courseId, @Param("importType") String importType, @Param("attachment") String attachment, @Param("extension") String extension);
  
}
