package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Progress;
import com.instructure.canvas.model.SisImport;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface SisImportsApi extends ApiClient.Api {

  /**
   * Abort all pending SIS imports
   * Abort already created but not processed or processing SIS imports.
   * @param accountId ID (required)
   * @return Boolean
   */
  @RequestLine("PUT /v1/accounts/{accountId}/sis_imports/abort_all_pending")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Boolean abortAllPendingSisImports(@Param("accountId") String accountId);
  
  /**
   * Abort SIS import
   * Abort a SIS import that has not completed.
   * @param accountId ID (required)
   * @param id ID (required)
   * @return SisImport
   */
  @RequestLine("PUT /v1/accounts/{accountId}/sis_imports/{id}/abort")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SisImport abortSisImport(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Get SIS import list
   * Returns the list of SIS imports for an account  Example:   curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
   * @param accountId ID (required)
   * @param createdSince If set, only shows imports created after the specified date (use ISO8601 format) (optional)
   * @return List&lt;SisImport&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/sis_imports?created_since={createdSince}")
  @Headers({
      "Accept: application/json",
  })
  List<SisImport> getSisImportList(@Param("accountId") String accountId, @Param("createdSince") String createdSince);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;SisImport&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<SisImport> getSisImportList(URI uri);
  

  /**
   * Get SIS import list
   * Returns the list of SIS imports for an account  Example:   curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
   * Note, this is equivalent to the other <code>getSisImportList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSisImportListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>createdSince - If set, only shows imports created after the specified date (use ISO8601 format) (optional)</li>
   *   </ul>
   * @return List&lt;SisImport&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/sis_imports?created_since={createdSince}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<SisImport> getSisImportList(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSisImportList</code> method in a fluent style.
   */
  public static class GetSisImportListQueryParams extends HashMap<String, Object> {
    public GetSisImportListQueryParams createdSince(final String value) {
      put("created_since", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get SIS import status
   * Get the status of an already created SIS import.    Examples:     curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports/&lt;sis_import_id&gt; \\         -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
   * @param accountId ID (required)
   * @param id ID (required)
   * @return SisImport
   */
  @RequestLine("GET /v1/accounts/{accountId}/sis_imports/{id}")
  @Headers({
      "Accept: application/json",
  })
  SisImport getSisImportStatus(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Import SIS data
   * Import SIS data into Canvas. Must be on a root account with SIS imports enabled.  For more information on the format that&#x27;s expected here, please see the \&quot;SIS CSV\&quot; section in the API docs.
   * @param accountId ID (required)
   * @param importType  (optional)
   * @param attachment  (optional)
   * @param extension  (optional)
   * @param batchMode  (optional)
   * @param batchModeTermId  (optional)
   * @param multiTermBatchMode  (optional)
   * @param skipDeletes  (optional)
   * @param overrideSisStickiness  (optional)
   * @param addSisStickiness  (optional)
   * @param clearSisStickiness  (optional)
   * @param diffingDataSetIdentifier  (optional)
   * @param diffingRemasterDataSet  (optional)
   * @param diffingDropStatus  (optional)
   * @param changeThreshold  (optional)
   * @return SisImport
   */
  @RequestLine("POST /v1/accounts/{accountId}/sis_imports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  SisImport importSisData(@Param("accountId") String accountId, @Param("importType") String importType, @Param("attachment") String attachment, @Param("extension") String extension, @Param("batchMode") Boolean batchMode, @Param("batchModeTermId") String batchModeTermId, @Param("multiTermBatchMode") Boolean multiTermBatchMode, @Param("skipDeletes") Boolean skipDeletes, @Param("overrideSisStickiness") Boolean overrideSisStickiness, @Param("addSisStickiness") Boolean addSisStickiness, @Param("clearSisStickiness") Boolean clearSisStickiness, @Param("diffingDataSetIdentifier") String diffingDataSetIdentifier, @Param("diffingRemasterDataSet") Boolean diffingRemasterDataSet, @Param("diffingDropStatus") String diffingDropStatus, @Param("changeThreshold") Integer changeThreshold);
  
  /**
   * Restore workflow_states of SIS imported items
   * This will restore the the workflow_state for all the items that changed their workflow_state during the import being restored. This will restore states for items imported with the following importers: accounts.csv terms.csv courses.csv sections.csv group_categories.csv groups.csv users.csv admins.csv This also restores states for other items that changed during the import. An example would be if an enrollment was deleted from a sis import and the group_membership was also deleted as a result of the enrollment deletion, both items would be restored when the sis batch is restored.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param batchMode  (optional)
   * @param undeleteOnly  (optional)
   * @param unconcludeOnly  (optional)
   * @return Progress
   */
  @RequestLine("PUT /v1/accounts/{accountId}/sis_imports/{id}/restore_states")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Progress restoreWorkflowStatesOfSisImportedItems(@Param("accountId") String accountId, @Param("id") String id, @Param("batchMode") Boolean batchMode, @Param("undeleteOnly") Boolean undeleteOnly, @Param("unconcludeOnly") Boolean unconcludeOnly);
  
}
