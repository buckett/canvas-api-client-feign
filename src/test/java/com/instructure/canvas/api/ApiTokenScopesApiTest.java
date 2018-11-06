package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Scope;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiTokenScopesApi
 */
public class ApiTokenScopesApiTest {

    private ApiTokenScopesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ApiTokenScopesApi.class);
    }

    /**
     * List scopes
     *
     * A list of scopes that can be applied to developer keys and access tokens.
     */
    @Test
    public void listScopesTest() {
        String accountId = null;
        String groupBy = null;
        // List<Scope> response = api.listScopes(accountId, groupBy);

        // TODO: test validations
    }

    /**
     * List scopes
     *
     * A list of scopes that can be applied to developer keys and access tokens.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listScopesTestQueryMap() {
        String accountId = null;
        ApiTokenScopesApi.ListScopesQueryParams queryParams = new ApiTokenScopesApi.ListScopesQueryParams()
            .groupBy(null);
        // List<Scope> response = api.listScopes(accountId, queryParams);

    // TODO: test validations
    }
}
