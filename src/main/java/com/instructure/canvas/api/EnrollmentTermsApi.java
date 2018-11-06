package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.EnrollmentTerm;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface EnrollmentTermsApi extends ApiClient.Api {

  /**
   * Create enrollment term
   * Create a new enrollment term for the specified account.
   * @param accountId ID (required)
   * @param enrollmentTermName  (optional)
   * @param enrollmentTermStartAt  (optional)
   * @param enrollmentTermEndAt  (optional)
   * @param enrollmentTermSisTermId  (optional)
   * @param enrollmentTermOverridesEnrollmentTypeStartAt  (optional)
   * @param enrollmentTermOverridesEnrollmentTypeEndAt  (optional)
   * @return EnrollmentTerm
   */
  @RequestLine("POST /v1/accounts/{accountId}/terms")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  EnrollmentTerm createEnrollmentTerm(@Param("accountId") String accountId, @Param("enrollmentTermName") String enrollmentTermName, @Param("enrollmentTermStartAt") String enrollmentTermStartAt, @Param("enrollmentTermEndAt") String enrollmentTermEndAt, @Param("enrollmentTermSisTermId") String enrollmentTermSisTermId, @Param("enrollmentTermOverridesEnrollmentTypeStartAt") String enrollmentTermOverridesEnrollmentTypeStartAt, @Param("enrollmentTermOverridesEnrollmentTypeEndAt") String enrollmentTermOverridesEnrollmentTypeEndAt);
  
  /**
   * Delete enrollment term
   * Delete the specified enrollment term.
   * @param accountId ID (required)
   * @param id ID (required)
   * @return EnrollmentTerm
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/terms/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  EnrollmentTerm deleteEnrollmentTerm(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * List enrollment terms
   * A paginated list of all of the terms in the account.
   * @param accountId ID (required)
   * @param workflowState If set, only returns terms that are in the given state. Defaults to &#x27;active&#x27;. (optional)
   * @param include Array of additional information to include.  \&quot;overrides\&quot;:: term start/end dates overridden for different enrollment types (optional)
   * @return List&lt;EnrollmentTerm&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/terms?workflow_state={workflowState}&include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<EnrollmentTerm> listEnrollmentTerms(@Param("accountId") String accountId, @Param("workflowState") List<String> workflowState, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;EnrollmentTerm&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<EnrollmentTerm> listEnrollmentTerms(URI uri);
  

  /**
   * List enrollment terms
   * A paginated list of all of the terms in the account.
   * Note, this is equivalent to the other <code>listEnrollmentTerms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListEnrollmentTermsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>workflowState - If set, only returns terms that are in the given state. Defaults to &#x27;active&#x27;. (optional)</li>
   *   <li>include - Array of additional information to include.  \&quot;overrides\&quot;:: term start/end dates overridden for different enrollment types (optional)</li>
   *   </ul>
   * @return List&lt;EnrollmentTerm&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/terms?workflow_state={workflowState}&include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<EnrollmentTerm> listEnrollmentTerms(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listEnrollmentTerms</code> method in a fluent style.
   */
  public static class ListEnrollmentTermsQueryParams extends HashMap<String, Object> {
    public ListEnrollmentTermsQueryParams workflowState(final List<String> value) {
      put("workflow_state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListEnrollmentTermsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Update enrollment term
   * Update an existing enrollment term for the specified account.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param enrollmentTermName  (optional)
   * @param enrollmentTermStartAt  (optional)
   * @param enrollmentTermEndAt  (optional)
   * @param enrollmentTermSisTermId  (optional)
   * @param enrollmentTermOverridesEnrollmentTypeStartAt  (optional)
   * @param enrollmentTermOverridesEnrollmentTypeEndAt  (optional)
   * @return EnrollmentTerm
   */
  @RequestLine("PUT /v1/accounts/{accountId}/terms/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  EnrollmentTerm updateEnrollmentTerm(@Param("accountId") String accountId, @Param("id") String id, @Param("enrollmentTermName") String enrollmentTermName, @Param("enrollmentTermStartAt") String enrollmentTermStartAt, @Param("enrollmentTermEndAt") String enrollmentTermEndAt, @Param("enrollmentTermSisTermId") String enrollmentTermSisTermId, @Param("enrollmentTermOverridesEnrollmentTypeStartAt") String enrollmentTermOverridesEnrollmentTypeStartAt, @Param("enrollmentTermOverridesEnrollmentTypeEndAt") String enrollmentTermOverridesEnrollmentTypeEndAt);
  
}
