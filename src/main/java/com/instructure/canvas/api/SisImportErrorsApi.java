package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.SisImportError;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface SisImportErrorsApi extends ApiClient.Api {

  /**
   * Get SIS import error list
   * Returns the list of SIS import errors for an account or a SIS import. Import errors are only stored for 30 days.  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports/&lt;id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
   * @param accountId ID (required)
   * @return List&lt;SisImportError&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/sis_import_errors")
  @Headers({
      "Accept: application/json",
  })
  List<SisImportError> getSisImportErrorListSisImportErrors(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;SisImportError&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<SisImportError> getSisImportErrorListSisImportErrors(URI uri);
  
  /**
   * Get SIS import error list
   * Returns the list of SIS import errors for an account or a SIS import. Import errors are only stored for 30 days.  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports/&lt;id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
   * @param accountId ID (required)
   * @param id ID (required)
   * @return List&lt;SisImportError&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/sis_imports/{id}/errors")
  @Headers({
      "Accept: application/json",
  })
  List<SisImportError> getSisImportErrorListSisImports(@Param("accountId") String accountId, @Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;SisImportError&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<SisImportError> getSisImportErrorListSisImports(URI uri);
  
}
