package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoginsApi
 */
public class LoginsApiTest {

    private LoginsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(LoginsApi.class);
    }

    /**
     * Create a user login
     *
     * Create a new login for an existing user in the given account.
     */
    @Test
    public void createUserLoginTest() {
        String accountId = null;
        String userId = null;
        String loginUniqueId = null;
        String loginPassword = null;
        String loginSisUserId = null;
        String loginIntegrationId = null;
        String loginAuthenticationProviderId = null;
        // api.createUserLogin(accountId, userId, loginUniqueId, loginPassword, loginSisUserId, loginIntegrationId, loginAuthenticationProviderId);

        // TODO: test validations
    }

    /**
     * Delete a user login
     *
     * Delete an existing login.
     */
    @Test
    public void deleteUserLoginTest() {
        String userId = null;
        String id = null;
        // api.deleteUserLogin(userId, id);

        // TODO: test validations
    }

    /**
     * Edit a user login
     *
     * Update an existing login for a user in the given account.
     */
    @Test
    public void editUserLoginTest() {
        String accountId = null;
        String id = null;
        String loginUniqueId = null;
        String loginPassword = null;
        String loginSisUserId = null;
        String loginIntegrationId = null;
        // api.editUserLogin(accountId, id, loginUniqueId, loginPassword, loginSisUserId, loginIntegrationId);

        // TODO: test validations
    }

    /**
     * List user logins
     *
     * Given a user ID, return a paginated list of that user&#x27;s logins for the given account.
     */
    @Test
    public void listUserLoginsAccountsTest() {
        String accountId = null;
        // api.listUserLoginsAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List user logins
     *
     * Given a user ID, return a paginated list of that user&#x27;s logins for the given account.
     */
    @Test
    public void listUserLoginsUsersTest() {
        String userId = null;
        // api.listUserLoginsUsers(userId);

        // TODO: test validations
    }

}
