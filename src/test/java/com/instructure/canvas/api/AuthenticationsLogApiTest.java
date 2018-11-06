package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationsLogApi
 */
public class AuthenticationsLogApiTest {

    private AuthenticationsLogApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AuthenticationsLogApi.class);
    }

    /**
     * Query by account.
     *
     * List authentication events for a given account.
     */
    @Test
    public void queryByAccountTest() {
        String accountId = null;
        String startTime = null;
        String endTime = null;
        // api.queryByAccount(accountId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by account.
     *
     * List authentication events for a given account.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByAccountTestQueryMap() {
        String accountId = null;
        AuthenticationsLogApi.QueryByAccountQueryParams queryParams = new AuthenticationsLogApi.QueryByAccountQueryParams()
            .startTime(null)
            .endTime(null);
        // api.queryByAccount(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Query by login.
     *
     * List authentication events for a given login.
     */
    @Test
    public void queryByLoginTest() {
        String loginId = null;
        String startTime = null;
        String endTime = null;
        // api.queryByLogin(loginId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by login.
     *
     * List authentication events for a given login.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByLoginTestQueryMap() {
        String loginId = null;
        AuthenticationsLogApi.QueryByLoginQueryParams queryParams = new AuthenticationsLogApi.QueryByLoginQueryParams()
            .startTime(null)
            .endTime(null);
        // api.queryByLogin(loginId, queryParams);

    // TODO: test validations
    }
    /**
     * Query by user.
     *
     * List authentication events for a given user.
     */
    @Test
    public void queryByUserTest() {
        String userId = null;
        String startTime = null;
        String endTime = null;
        // api.queryByUser(userId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by user.
     *
     * List authentication events for a given user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByUserTestQueryMap() {
        String userId = null;
        AuthenticationsLogApi.QueryByUserQueryParams queryParams = new AuthenticationsLogApi.QueryByUserQueryParams()
            .startTime(null)
            .endTime(null);
        // api.queryByUser(userId, queryParams);

    // TODO: test validations
    }
}
