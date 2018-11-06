package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Report;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AccountReportsApi extends ApiClient.Api {

  /**
   * Delete a Report
   * Deletes a generated report instance.
   * @param accountId ID (required)
   * @param report ID (required)
   * @param id ID (required)
   * @return Report
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/reports/{report}/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Report deleteReport(@Param("accountId") String accountId, @Param("report") String report, @Param("id") String id);
  
  /**
   * Index of Reports
   * Shows all reports that have been run for the account of a specific type.
   * @param accountId ID (required)
   * @param report ID (required)
   * @return List&lt;Report&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/reports/{report}")
  @Headers({
      "Accept: application/json",
  })
  List<Report> indexOfReports(@Param("accountId") String accountId, @Param("report") String report);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Report&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Report> indexOfReports(URI uri);
  
  /**
   * List Available Reports
   * Returns a paginated list of reports for the current context.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/reports")
  @Headers({
      "Accept: */*",
  })
  void listAvailableReports(@Param("accountId") String accountId);
  
  /**
   * Start a Report
   * Generates a report instance for the account. Note that \&quot;report\&quot; in the request must match one of the available report names. To fetch a list of available report names and parameters for each report (including whether or not those parameters are required), see {api:AccountReportsController#available_reports List Available Reports}.
   * @param accountId ID (required)
   * @param report ID (required)
   * @param parameters  (optional)
   * @param parametersCourseId  (optional)
   * @param parametersUsers  (optional)
   * @return Report
   */
  @RequestLine("POST /v1/accounts/{accountId}/reports/{report}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Report startReport(@Param("accountId") String accountId, @Param("report") String report, @Param("parameters") String parameters, @Param("parametersCourseId") Integer parametersCourseId, @Param("parametersUsers") Boolean parametersUsers);
  
  /**
   * Status of a Report
   * Returns the status of a report.
   * @param accountId ID (required)
   * @param report ID (required)
   * @param id ID (required)
   * @return Report
   */
  @RequestLine("GET /v1/accounts/{accountId}/reports/{report}/{id}")
  @Headers({
      "Accept: application/json",
  })
  Report statusOfReport(@Param("accountId") String accountId, @Param("report") String report, @Param("id") String id);
  
}
