package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Admin;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminsApi
 */
public class AdminsApiTest {

    private AdminsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AdminsApi.class);
    }

    /**
     * List account admins
     *
     * A paginated list of the admins in the account
     */
    @Test
    public void listAccountAdminsTest() {
        String accountId = null;
        List<String> userId = null;
        // List<Admin> response = api.listAccountAdmins(accountId, userId);

        // TODO: test validations
    }

    /**
     * List account admins
     *
     * A paginated list of the admins in the account
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAccountAdminsTestQueryMap() {
        String accountId = null;
        AdminsApi.ListAccountAdminsQueryParams queryParams = new AdminsApi.ListAccountAdminsQueryParams()
            .userId(null);
        // List<Admin> response = api.listAccountAdmins(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Make an account admin
     *
     * Flag an existing user as an admin within the account.
     */
    @Test
    public void makeAccountAdminTest() {
        String accountId = null;
        Integer userId = null;
        String role = null;
        Integer roleId = null;
        Boolean sendConfirmation = null;
        // Admin response = api.makeAccountAdmin(accountId, userId, role, roleId, sendConfirmation);

        // TODO: test validations
    }

    /**
     * Remove account admin
     *
     * Remove the rights associated with an account admin role from a user.
     */
    @Test
    public void removeAccountAdminTest() {
        String accountId = null;
        String userId = null;
        String role = null;
        Integer roleId = null;
        // Admin response = api.removeAccountAdmin(accountId, userId, role, roleId);

        // TODO: test validations
    }

    /**
     * Remove account admin
     *
     * Remove the rights associated with an account admin role from a user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void removeAccountAdminTestQueryMap() {
        String accountId = null;
        String userId = null;
        AdminsApi.RemoveAccountAdminQueryParams queryParams = new AdminsApi.RemoveAccountAdminQueryParams()
            .role(null)
            .roleId(null);
        // Admin response = api.removeAccountAdmin(accountId, userId, queryParams);

    // TODO: test validations
    }
}
