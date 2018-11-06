package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.SisImportError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SisImportErrorsApi
 */
public class SisImportErrorsApiTest {

    private SisImportErrorsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SisImportErrorsApi.class);
    }

    /**
     * Get SIS import error list
     *
     * Returns the list of SIS import errors for an account or a SIS import. Import errors are only stored for 30 days.  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports/&lt;id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
     */
    @Test
    public void getSisImportErrorListSisImportErrorsTest() {
        String accountId = null;
        // List<SisImportError> response = api.getSisImportErrorListSisImportErrors(accountId);

        // TODO: test validations
    }

    /**
     * Get SIS import error list
     *
     * Returns the list of SIS import errors for an account or a SIS import. Import errors are only stored for 30 days.  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_imports/&lt;id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;  Example:   curl &#x27;https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/sis_import_errors&#x27; \\     -H \&quot;Authorization: Bearer &lt;token&gt;\&quot;
     */
    @Test
    public void getSisImportErrorListSisImportsTest() {
        String accountId = null;
        String id = null;
        // List<SisImportError> response = api.getSisImportErrorListSisImports(accountId, id);

        // TODO: test validations
    }

}
