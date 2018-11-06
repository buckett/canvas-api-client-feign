package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Account;
import com.instructure.canvas.model.HelpLinks;
import com.instructure.canvas.model.TermsOfService;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
public class AccountsApiTest {

    private AccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AccountsApi.class);
    }

    /**
     * Create a new sub-account
     *
     * Add a new sub-account to a given account.
     */
    @Test
    public void createNewSubAccountTest() {
        String accountId = null;
        String accountName = null;
        String accountSisAccountId = null;
        Integer accountDefaultStorageQuotaMb = null;
        Integer accountDefaultUserStorageQuotaMb = null;
        Integer accountDefaultGroupStorageQuotaMb = null;
        // Account response = api.createNewSubAccount(accountId, accountName, accountSisAccountId, accountDefaultStorageQuotaMb, accountDefaultUserStorageQuotaMb, accountDefaultGroupStorageQuotaMb);

        // TODO: test validations
    }

    /**
     * Delete a sub-account
     *
     * Cannot delete an account with active courses or active sub_accounts. Cannot delete a root_account
     */
    @Test
    public void deleteSubAccountTest() {
        String accountId = null;
        String id = null;
        // Account response = api.deleteSubAccount(accountId, id);

        // TODO: test validations
    }

    /**
     * Delete a user from the root account
     *
     * Delete a user record from a Canvas root account. If a user is associated with multiple root accounts (in a multi-tenant instance of Canvas), this action will NOT remove them from the other accounts.  WARNING: This API will allow a user to remove themselves from the account. If they do this, they won&#x27;t be able to make API calls or log into Canvas at that account.
     */
    @Test
    public void deleteUserFromRootAccountTest() {
        String accountId = null;
        String userId = null;
        // User response = api.deleteUserFromRootAccount(accountId, userId);

        // TODO: test validations
    }

    /**
     * Get help links
     *
     * Returns the help links for that account
     */
    @Test
    public void getHelpLinksTest() {
        String accountId = null;
        // HelpLinks response = api.getHelpLinks(accountId);

        // TODO: test validations
    }

    /**
     * Get a single account
     *
     * Retrieve information on an individual account, given by id or sis sis_account_id.
     */
    @Test
    public void getSingleAccountTest() {
        String id = null;
        // Account response = api.getSingleAccount(id);

        // TODO: test validations
    }

    /**
     * Get the sub-accounts of an account
     *
     * List accounts that are sub-accounts of the given account.
     */
    @Test
    public void getSubAccountsOfAccountTest() {
        String accountId = null;
        Boolean recursive = null;
        // List<Account> response = api.getSubAccountsOfAccount(accountId, recursive);

        // TODO: test validations
    }

    /**
     * Get the sub-accounts of an account
     *
     * List accounts that are sub-accounts of the given account.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSubAccountsOfAccountTestQueryMap() {
        String accountId = null;
        AccountsApi.GetSubAccountsOfAccountQueryParams queryParams = new AccountsApi.GetSubAccountsOfAccountQueryParams()
            .recursive(null);
        // List<Account> response = api.getSubAccountsOfAccount(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Get the Terms of Service
     *
     * Returns the terms of service for that account
     */
    @Test
    public void getTermsOfServiceTest() {
        String accountId = null;
        // TermsOfService response = api.getTermsOfService(accountId);

        // TODO: test validations
    }

    /**
     * List accounts
     *
     * A paginated list of accounts that the current user can view or manage. Typically, students and even teachers will get an empty list in response, only account admins can view the accounts that they are in.
     */
    @Test
    public void listAccountsTest() {
        List<String> include = null;
        // List<Account> response = api.listAccounts(include);

        // TODO: test validations
    }

    /**
     * List accounts
     *
     * A paginated list of accounts that the current user can view or manage. Typically, students and even teachers will get an empty list in response, only account admins can view the accounts that they are in.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listAccountsTestQueryMap() {
        AccountsApi.ListAccountsQueryParams queryParams = new AccountsApi.ListAccountsQueryParams()
            .include(null);
        // List<Account> response = api.listAccounts(queryParams);

    // TODO: test validations
    }
    /**
     * List accounts for course admins
     *
     * A paginated list of accounts that the current user can view through their admin course enrollments. (Teacher, TA, or designer enrollments). Only returns \&quot;id\&quot;, \&quot;name\&quot;, \&quot;workflow_state\&quot;, \&quot;root_account_id\&quot; and \&quot;parent_account_id\&quot;
     */
    @Test
    public void listAccountsForCourseAdminsTest() {
        // List<Account> response = api.listAccountsForCourseAdmins();

        // TODO: test validations
    }

    /**
     * Permissions
     *
     * Returns permission information for the calling user and the given account. You may use &#x60;self&#x60; as the account id to check permissions against the domain root account. The caller must have an account role or admin (teacher/TA/designer) enrollment in a course in the account.  See also the {api:CoursesController#permissions Course} and {api:GroupsController#permissions Group} counterparts.
     */
    @Test
    public void permissionsTest() {
        String accountId = null;
        List<String> permissions = null;
        // api.permissions(accountId, permissions);

        // TODO: test validations
    }

    /**
     * Permissions
     *
     * Returns permission information for the calling user and the given account. You may use &#x60;self&#x60; as the account id to check permissions against the domain root account. The caller must have an account role or admin (teacher/TA/designer) enrollment in a course in the account.  See also the {api:CoursesController#permissions Course} and {api:GroupsController#permissions Group} counterparts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void permissionsTestQueryMap() {
        String accountId = null;
        AccountsApi.PermissionsQueryParams queryParams = new AccountsApi.PermissionsQueryParams()
            .permissions(null);
        // api.permissions(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Update an account
     *
     * Update an existing account.
     */
    @Test
    public void updateAccountTest() {
        String id = null;
        String accountName = null;
        String accountSisAccountId = null;
        String accountDefaultTimeZone = null;
        Integer accountDefaultStorageQuotaMb = null;
        Integer accountDefaultUserStorageQuotaMb = null;
        Integer accountDefaultGroupStorageQuotaMb = null;
        Boolean accountSettingsRestrictStudentPastViewValue = null;
        Boolean accountSettingsRestrictStudentPastViewLocked = null;
        Boolean accountSettingsRestrictStudentFutureViewValue = null;
        Boolean accountSettingsRestrictStudentFutureViewLocked = null;
        Boolean accountSettingsLockAllAnnouncementsValue = null;
        Boolean accountSettingsLockAllAnnouncementsLocked = null;
        Boolean accountSettingsRestrictStudentFutureListingValue = null;
        Boolean accountSettingsRestrictStudentFutureListingLocked = null;
        Object accountServices = null;
        // Account response = api.updateAccount(id, accountName, accountSisAccountId, accountDefaultTimeZone, accountDefaultStorageQuotaMb, accountDefaultUserStorageQuotaMb, accountDefaultGroupStorageQuotaMb, accountSettingsRestrictStudentPastViewValue, accountSettingsRestrictStudentPastViewLocked, accountSettingsRestrictStudentFutureViewValue, accountSettingsRestrictStudentFutureViewLocked, accountSettingsLockAllAnnouncementsValue, accountSettingsLockAllAnnouncementsLocked, accountSettingsRestrictStudentFutureListingValue, accountSettingsRestrictStudentFutureListingLocked, accountServices);

        // TODO: test validations
    }

}
