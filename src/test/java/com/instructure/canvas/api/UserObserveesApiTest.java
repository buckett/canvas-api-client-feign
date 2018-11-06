package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserObserveesApi
 */
public class UserObserveesApiTest {

    private UserObserveesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserObserveesApi.class);
    }

    /**
     * Add an observee
     *
     * Registers a user as being observed by the given user.
     */
    @Test
    public void addObserveeTest() {
        String userId = null;
        String observeeId = null;
        Integer rootAccountId = null;
        // User response = api.addObservee(userId, observeeId, rootAccountId);

        // TODO: test validations
    }

    /**
     * Add an observee with credentials
     *
     * Register the given user to observe another user, given the observee&#x27;s credentials.  *Note:* all users are allowed to add their own observees, given the observee&#x27;s credentials or access token are provided. Administrators can add observees given credentials, access token or the {api:UserObserveesController#update observee&#x27;s id}.
     */
    @Test
    public void addObserveeWithCredentialsTest() {
        String userId = null;
        String observeeUniqueId = null;
        String observeePassword = null;
        String accessToken = null;
        String pairingCode = null;
        Integer rootAccountId = null;
        // User response = api.addObserveeWithCredentials(userId, observeeUniqueId, observeePassword, accessToken, pairingCode, rootAccountId);

        // TODO: test validations
    }

    /**
     * List observees
     *
     * A paginated list of the users that the given user is observing.  *Note:* all users are allowed to list their own observees. Administrators can list other users&#x27; observees.  The returned observees will include an attribute \&quot;observation_link_root_account_ids\&quot;, a list of ids for the root accounts the observer and observee are linked on. The observer will only be able to observe in courses associated with these root accounts.
     */
    @Test
    public void listObserveesTest() {
        String userId = null;
        List<String> include = null;
        // List<User> response = api.listObservees(userId, include);

        // TODO: test validations
    }

    /**
     * List observees
     *
     * A paginated list of the users that the given user is observing.  *Note:* all users are allowed to list their own observees. Administrators can list other users&#x27; observees.  The returned observees will include an attribute \&quot;observation_link_root_account_ids\&quot;, a list of ids for the root accounts the observer and observee are linked on. The observer will only be able to observe in courses associated with these root accounts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listObserveesTestQueryMap() {
        String userId = null;
        UserObserveesApi.ListObserveesQueryParams queryParams = new UserObserveesApi.ListObserveesQueryParams()
            .include(null);
        // List<User> response = api.listObservees(userId, queryParams);

    // TODO: test validations
    }
    /**
     * Remove an observee
     *
     * Unregisters a user as being observed by the given user.
     */
    @Test
    public void removeObserveeTest() {
        String userId = null;
        String observeeId = null;
        Integer rootAccountId = null;
        // User response = api.removeObservee(userId, observeeId, rootAccountId);

        // TODO: test validations
    }

    /**
     * Remove an observee
     *
     * Unregisters a user as being observed by the given user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void removeObserveeTestQueryMap() {
        String userId = null;
        String observeeId = null;
        UserObserveesApi.RemoveObserveeQueryParams queryParams = new UserObserveesApi.RemoveObserveeQueryParams()
            .rootAccountId(null);
        // User response = api.removeObservee(userId, observeeId, queryParams);

    // TODO: test validations
    }
    /**
     * Show an observee
     *
     * Gets information about an observed user.  *Note:* all users are allowed to view their own observees.
     */
    @Test
    public void showObserveeTest() {
        String userId = null;
        String observeeId = null;
        // User response = api.showObservee(userId, observeeId);

        // TODO: test validations
    }

}
