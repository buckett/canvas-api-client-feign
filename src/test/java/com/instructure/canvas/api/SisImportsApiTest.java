package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Progress;
import com.instructure.canvas.model.SisImport;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SisImportsApi
 */
public class SisImportsApiTest {

    private SisImportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SisImportsApi.class);
    }

    /**
     * Abort all pending SIS imports
     *
     * Abort already created but not processed or processing SIS imports.
     */
    @Test
    public void abortAllPendingSisImportsTest() {
        String accountId = null;
        // Boolean response = api.abortAllPendingSisImports(accountId);

        // TODO: test validations
    }

    /**
     * Abort SIS import
     *
     * Abort a SIS import that has not completed.
     */
    @Test
    public void abortSisImportTest() {
        String accountId = null;
        String id = null;
        // SisImport response = api.abortSisImport(accountId, id);

        // TODO: test validations
    }

    /**
     * Get SIS import list
     *
     * Returns the list of SIS imports for an account  Example:   curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
     */
    @Test
    public void getSisImportListTest() {
        String accountId = null;
        String createdSince = null;
        // List<SisImport> response = api.getSisImportList(accountId, createdSince);

        // TODO: test validations
    }

    /**
     * Get SIS import list
     *
     * Returns the list of SIS imports for an account  Example:   curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports \\     -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSisImportListTestQueryMap() {
        String accountId = null;
        SisImportsApi.GetSisImportListQueryParams queryParams = new SisImportsApi.GetSisImportListQueryParams()
            .createdSince(null);
        // List<SisImport> response = api.getSisImportList(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Get SIS import status
     *
     * Get the status of an already created SIS import.    Examples:     curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports/&lt;sis_import_id&gt; \\         -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
     */
    @Test
    public void getSisImportStatusTest() {
        String accountId = null;
        String id = null;
        // SisImport response = api.getSisImportStatus(accountId, id);

        // TODO: test validations
    }

    /**
     * Import SIS data
     *
     * Import SIS data into Canvas. Must be on a root account with SIS imports enabled.  For more information on the format that&#x27;s expected here, please see the \&quot;SIS CSV\&quot; section in the API docs.
     */
    @Test
    public void importSisDataTest() {
        String accountId = null;
        String importType = null;
        String attachment = null;
        String extension = null;
        Boolean batchMode = null;
        String batchModeTermId = null;
        Boolean multiTermBatchMode = null;
        Boolean skipDeletes = null;
        Boolean overrideSisStickiness = null;
        Boolean addSisStickiness = null;
        Boolean clearSisStickiness = null;
        String diffingDataSetIdentifier = null;
        Boolean diffingRemasterDataSet = null;
        String diffingDropStatus = null;
        Integer changeThreshold = null;
        // SisImport response = api.importSisData(accountId, importType, attachment, extension, batchMode, batchModeTermId, multiTermBatchMode, skipDeletes, overrideSisStickiness, addSisStickiness, clearSisStickiness, diffingDataSetIdentifier, diffingRemasterDataSet, diffingDropStatus, changeThreshold);

        // TODO: test validations
    }

    /**
     * Restore workflow_states of SIS imported items
     *
     * This will restore the the workflow_state for all the items that changed their workflow_state during the import being restored. This will restore states for items imported with the following importers: accounts.csv terms.csv courses.csv sections.csv group_categories.csv groups.csv users.csv admins.csv This also restores states for other items that changed during the import. An example would be if an enrollment was deleted from a sis import and the group_membership was also deleted as a result of the enrollment deletion, both items would be restored when the sis batch is restored.
     */
    @Test
    public void restoreWorkflowStatesOfSisImportedItemsTest() {
        String accountId = null;
        String id = null;
        Boolean batchMode = null;
        Boolean undeleteOnly = null;
        Boolean unconcludeOnly = null;
        // Progress response = api.restoreWorkflowStatesOfSisImportedItems(accountId, id, batchMode, undeleteOnly, unconcludeOnly);

        // TODO: test validations
    }

}
