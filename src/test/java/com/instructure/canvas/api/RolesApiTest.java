package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Role;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
public class RolesApiTest {

    private RolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RolesApi.class);
    }

    /**
     * Activate a role
     *
     * Re-activates an inactive role (allowing it to be assigned to new users)
     */
    @Test
    public void activateRoleTest() {
        String accountId = null;
        String id = null;
        Integer roleId = null;
        Object role = null;
        // Role response = api.activateRole(accountId, id, roleId, role);

        // TODO: test validations
    }

    /**
     * Create a new role
     *
     * Create a new course-level or account-level role.
     */
    @Test
    public void createNewRoleTest() {
        String accountId = null;
        String label = null;
        String role = null;
        String baseRoleType = null;
        Boolean permissionsXExplicit = null;
        Boolean permissionsXEnabled = null;
        Boolean permissionsXLocked = null;
        Boolean permissionsXAppliesToSelf = null;
        Boolean permissionsXAppliesToDescendants = null;
        // Role response = api.createNewRole(accountId, label, role, baseRoleType, permissionsXExplicit, permissionsXEnabled, permissionsXLocked, permissionsXAppliesToSelf, permissionsXAppliesToDescendants);

        // TODO: test validations
    }

    /**
     * Deactivate a role
     *
     * Deactivates a custom role.  This hides it in the user interface and prevents it from being assigned to new users.  Existing users assigned to the role will continue to function with the same permissions they had previously. Built-in roles cannot be deactivated.
     */
    @Test
    public void deactivateRoleTest() {
        String accountId = null;
        String id = null;
        Integer roleId = null;
        String role = null;
        // Role response = api.deactivateRole(accountId, id, roleId, role);

        // TODO: test validations
    }

    /**
     * Deactivate a role
     *
     * Deactivates a custom role.  This hides it in the user interface and prevents it from being assigned to new users.  Existing users assigned to the role will continue to function with the same permissions they had previously. Built-in roles cannot be deactivated.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deactivateRoleTestQueryMap() {
        String accountId = null;
        String id = null;
        RolesApi.DeactivateRoleQueryParams queryParams = new RolesApi.DeactivateRoleQueryParams()
            .roleId(null)
            .role(null);
        // Role response = api.deactivateRole(accountId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single role
     *
     * Retrieve information about a single role
     */
    @Test
    public void getSingleRoleTest() {
        String id = null;
        String accountId = null;
        Integer roleId = null;
        String role = null;
        // Role response = api.getSingleRole(id, accountId, roleId, role);

        // TODO: test validations
    }

    /**
     * Get a single role
     *
     * Retrieve information about a single role
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleRoleTestQueryMap() {
        String id = null;
        String accountId = null;
        RolesApi.GetSingleRoleQueryParams queryParams = new RolesApi.GetSingleRoleQueryParams()
            .roleId(null)
            .role(null);
        // Role response = api.getSingleRole(id, accountId, queryParams);

    // TODO: test validations
    }
    /**
     * List roles
     *
     * A paginated list of the roles available to an account.
     */
    @Test
    public void listRolesTest() {
        String accountId = null;
        List<String> state = null;
        Boolean showInherited = null;
        // List<Role> response = api.listRoles(accountId, state, showInherited);

        // TODO: test validations
    }

    /**
     * List roles
     *
     * A paginated list of the roles available to an account.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listRolesTestQueryMap() {
        String accountId = null;
        RolesApi.ListRolesQueryParams queryParams = new RolesApi.ListRolesQueryParams()
            .state(null)
            .showInherited(null);
        // List<Role> response = api.listRoles(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Update a role
     *
     * Update permissions for an existing role.  Recognized roles are: * TeacherEnrollment * StudentEnrollment * TaEnrollment * ObserverEnrollment * DesignerEnrollment * AccountAdmin * Any previously created custom role
     */
    @Test
    public void updateRoleTest() {
        String accountId = null;
        String id = null;
        String label = null;
        Boolean permissionsXExplicit = null;
        Boolean permissionsXEnabled = null;
        Boolean permissionsXAppliesToSelf = null;
        Boolean permissionsXAppliesToDescendants = null;
        // Role response = api.updateRole(accountId, id, label, permissionsXExplicit, permissionsXEnabled, permissionsXAppliesToSelf, permissionsXAppliesToDescendants);

        // TODO: test validations
    }

}
