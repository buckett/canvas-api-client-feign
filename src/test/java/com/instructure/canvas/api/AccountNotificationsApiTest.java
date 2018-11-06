package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.AccountNotification;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountNotificationsApi
 */
public class AccountNotificationsApiTest {

    private AccountNotificationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AccountNotificationsApi.class);
    }

    /**
     * Close notification for user
     *
     * If the current user no long wants to see this notification it can be excused with this call
     */
    @Test
    public void closeNotificationForUserTest() {
        String accountId = null;
        String id = null;
        // AccountNotification response = api.closeNotificationForUser(accountId, id);

        // TODO: test validations
    }

    /**
     * Create a global notification
     *
     * Create and return a new global notification for an account.
     */
    @Test
    public void createGlobalNotificationTest() {
        String accountId = null;
        String accountNotificationSubject = null;
        String accountNotificationMessage = null;
        String accountNotificationStartAt = null;
        String accountNotificationEndAt = null;
        String accountNotificationIcon = null;
        List<String> accountNotificationRoles = null;
        // api.createGlobalNotification(accountId, accountNotificationSubject, accountNotificationMessage, accountNotificationStartAt, accountNotificationEndAt, accountNotificationIcon, accountNotificationRoles);

        // TODO: test validations
    }

    /**
     * Index of active global notification for the user
     *
     * Returns a list of all global notifications in the account for the current user Any notifications that have been closed by the user will not be returned
     */
    @Test
    public void indexOfActiveGlobalNotificationForUserTest() {
        String accountId = null;
        // List<AccountNotification> response = api.indexOfActiveGlobalNotificationForUser(accountId);

        // TODO: test validations
    }

    /**
     * Show a global notification
     *
     * Returns a global notification for the current user A notification that has been closed by the user will not be returned
     */
    @Test
    public void showGlobalNotificationTest() {
        String accountId = null;
        String id = null;
        // AccountNotification response = api.showGlobalNotification(accountId, id);

        // TODO: test validations
    }

    /**
     * Update a global notification
     *
     * Update global notification for an account.
     */
    @Test
    public void updateGlobalNotificationTest() {
        String accountId = null;
        String id = null;
        String accountNotificationSubject = null;
        String accountNotificationMessage = null;
        String accountNotificationStartAt = null;
        String accountNotificationEndAt = null;
        String accountNotificationIcon = null;
        List<String> accountNotificationRoles = null;
        // api.updateGlobalNotification(accountId, id, accountNotificationSubject, accountNotificationMessage, accountNotificationStartAt, accountNotificationEndAt, accountNotificationIcon, accountNotificationRoles);

        // TODO: test validations
    }

}
