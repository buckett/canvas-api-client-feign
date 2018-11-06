package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Account;
import com.instructure.canvas.model.HelpLinks;
import com.instructure.canvas.model.TermsOfService;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AccountsApi extends ApiClient.Api {

  /**
   * Create a new sub-account
   * Add a new sub-account to a given account.
   * @param accountId ID (required)
   * @param accountName  (optional)
   * @param accountSisAccountId  (optional)
   * @param accountDefaultStorageQuotaMb  (optional)
   * @param accountDefaultUserStorageQuotaMb  (optional)
   * @param accountDefaultGroupStorageQuotaMb  (optional)
   * @return Account
   */
  @RequestLine("POST /v1/accounts/{accountId}/sub_accounts")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Account createNewSubAccount(@Param("accountId") String accountId, @Param("accountName") String accountName, @Param("accountSisAccountId") String accountSisAccountId, @Param("accountDefaultStorageQuotaMb") Integer accountDefaultStorageQuotaMb, @Param("accountDefaultUserStorageQuotaMb") Integer accountDefaultUserStorageQuotaMb, @Param("accountDefaultGroupStorageQuotaMb") Integer accountDefaultGroupStorageQuotaMb);
  
  /**
   * Delete a sub-account
   * Cannot delete an account with active courses or active sub_accounts. Cannot delete a root_account
   * @param accountId ID (required)
   * @param id ID (required)
   * @return Account
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/sub_accounts/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Account deleteSubAccount(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Delete a user from the root account
   * Delete a user record from a Canvas root account. If a user is associated with multiple root accounts (in a multi-tenant instance of Canvas), this action will NOT remove them from the other accounts.  WARNING: This API will allow a user to remove themselves from the account. If they do this, they won&#x27;t be able to make API calls or log into Canvas at that account.
   * @param accountId ID (required)
   * @param userId ID (required)
   * @return User
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/users/{userId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  User deleteUserFromRootAccount(@Param("accountId") String accountId, @Param("userId") String userId);
  
  /**
   * Get help links
   * Returns the help links for that account
   * @param accountId ID (required)
   * @return HelpLinks
   */
  @RequestLine("GET /v1/accounts/{accountId}/help_links")
  @Headers({
      "Accept: application/json",
  })
  HelpLinks getHelpLinks(@Param("accountId") String accountId);
  
  /**
   * Get a single account
   * Retrieve information on an individual account, given by id or sis sis_account_id.
   * @param id ID (required)
   * @return Account
   */
  @RequestLine("GET /v1/accounts/{id}")
  @Headers({
      "Accept: application/json",
  })
  Account getSingleAccount(@Param("id") String id);
  
  /**
   * Get the sub-accounts of an account
   * List accounts that are sub-accounts of the given account.
   * @param accountId ID (required)
   * @param recursive If true, the entire account tree underneath this account will be returned (though still paginated). If false, only direct sub-accounts of this account will be returned. Defaults to false. (optional)
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/sub_accounts?recursive={recursive}")
  @Headers({
      "Accept: application/json",
  })
  List<Account> getSubAccountsOfAccount(@Param("accountId") String accountId, @Param("recursive") Boolean recursive);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Account> getSubAccountsOfAccount(URI uri);
  

  /**
   * Get the sub-accounts of an account
   * List accounts that are sub-accounts of the given account.
   * Note, this is equivalent to the other <code>getSubAccountsOfAccount</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSubAccountsOfAccountQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>recursive - If true, the entire account tree underneath this account will be returned (though still paginated). If false, only direct sub-accounts of this account will be returned. Defaults to false. (optional)</li>
   *   </ul>
   * @return List&lt;Account&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/sub_accounts?recursive={recursive}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Account> getSubAccountsOfAccount(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSubAccountsOfAccount</code> method in a fluent style.
   */
  public static class GetSubAccountsOfAccountQueryParams extends HashMap<String, Object> {
    public GetSubAccountsOfAccountQueryParams recursive(final Boolean value) {
      put("recursive", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get the Terms of Service
   * Returns the terms of service for that account
   * @param accountId ID (required)
   * @return TermsOfService
   */
  @RequestLine("GET /v1/accounts/{accountId}/terms_of_service")
  @Headers({
      "Accept: application/json",
  })
  TermsOfService getTermsOfService(@Param("accountId") String accountId);
  
  /**
   * List accounts
   * A paginated list of accounts that the current user can view or manage. Typically, students and even teachers will get an empty list in response, only account admins can view the accounts that they are in.
   * @param include Array of additional information to include.  \&quot;lti_guid\&quot;:: the &#x27;tool_consumer_instance_guid&#x27; that will be sent for this account on LTI launches \&quot;registration_settings\&quot;:: returns info about the privacy policy and terms of use \&quot;services\&quot;:: returns services and whether they are enabled (requires account management permissions) (optional)
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET /v1/accounts?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Account> listAccounts(@Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Account> listAccounts(URI uri);
  

  /**
   * List accounts
   * A paginated list of accounts that the current user can view or manage. Typically, students and even teachers will get an empty list in response, only account admins can view the accounts that they are in.
   * Note, this is equivalent to the other <code>listAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Array of additional information to include.  \&quot;lti_guid\&quot;:: the &#x27;tool_consumer_instance_guid&#x27; that will be sent for this account on LTI launches \&quot;registration_settings\&quot;:: returns info about the privacy policy and terms of use \&quot;services\&quot;:: returns services and whether they are enabled (requires account management permissions) (optional)</li>
   *   </ul>
   * @return List&lt;Account&gt;

   */
  @RequestLine("GET /v1/accounts?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Account> listAccounts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAccounts</code> method in a fluent style.
   */
  public static class ListAccountsQueryParams extends HashMap<String, Object> {
    public ListAccountsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List accounts for course admins
   * A paginated list of accounts that the current user can view through their admin course enrollments. (Teacher, TA, or designer enrollments). Only returns \&quot;id\&quot;, \&quot;name\&quot;, \&quot;workflow_state\&quot;, \&quot;root_account_id\&quot; and \&quot;parent_account_id\&quot;
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET /v1/course_accounts")
  @Headers({
      "Accept: application/json",
  })
  List<Account> listAccountsForCourseAdmins();

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Account&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Account> listAccountsForCourseAdmins(URI uri);
  
  /**
   * Permissions
   * Returns permission information for the calling user and the given account. You may use &#x60;self&#x60; as the account id to check permissions against the domain root account. The caller must have an account role or admin (teacher/TA/designer) enrollment in a course in the account.  See also the {api:CoursesController#permissions Course} and {api:GroupsController#permissions Group} counterparts.
   * @param accountId ID (required)
   * @param permissions List of permissions to check against the authenticated user. Permission names are documented in the {api:RoleOverridesController#add_role Create a role} endpoint. (optional)
   */
  @RequestLine("GET /v1/accounts/{accountId}/permissions?permissions={permissions}")
  @Headers({
      "Accept: */*",
  })
  void permissions(@Param("accountId") String accountId, @Param("permissions") List<String> permissions);
  

  /**
   * Permissions
   * Returns permission information for the calling user and the given account. You may use &#x60;self&#x60; as the account id to check permissions against the domain root account. The caller must have an account role or admin (teacher/TA/designer) enrollment in a course in the account.  See also the {api:CoursesController#permissions Course} and {api:GroupsController#permissions Group} counterparts.
   * Note, this is equivalent to the other <code>permissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PermissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>permissions - List of permissions to check against the authenticated user. Permission names are documented in the {api:RoleOverridesController#add_role Create a role} endpoint. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/accounts/{accountId}/permissions?permissions={permissions}")
  @Headers({
      "Content-Type: */*",
  })
  void permissions(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>permissions</code> method in a fluent style.
   */
  public static class PermissionsQueryParams extends HashMap<String, Object> {
    public PermissionsQueryParams permissions(final List<String> value) {
      put("permissions", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Update an account
   * Update an existing account.
   * @param id ID (required)
   * @param accountName  (optional)
   * @param accountSisAccountId  (optional)
   * @param accountDefaultTimeZone  (optional)
   * @param accountDefaultStorageQuotaMb  (optional)
   * @param accountDefaultUserStorageQuotaMb  (optional)
   * @param accountDefaultGroupStorageQuotaMb  (optional)
   * @param accountSettingsRestrictStudentPastViewValue  (optional)
   * @param accountSettingsRestrictStudentPastViewLocked  (optional)
   * @param accountSettingsRestrictStudentFutureViewValue  (optional)
   * @param accountSettingsRestrictStudentFutureViewLocked  (optional)
   * @param accountSettingsLockAllAnnouncementsValue  (optional)
   * @param accountSettingsLockAllAnnouncementsLocked  (optional)
   * @param accountSettingsRestrictStudentFutureListingValue  (optional)
   * @param accountSettingsRestrictStudentFutureListingLocked  (optional)
   * @param accountServices  (optional)
   * @return Account
   */
  @RequestLine("PUT /v1/accounts/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Account updateAccount(@Param("id") String id, @Param("accountName") String accountName, @Param("accountSisAccountId") String accountSisAccountId, @Param("accountDefaultTimeZone") String accountDefaultTimeZone, @Param("accountDefaultStorageQuotaMb") Integer accountDefaultStorageQuotaMb, @Param("accountDefaultUserStorageQuotaMb") Integer accountDefaultUserStorageQuotaMb, @Param("accountDefaultGroupStorageQuotaMb") Integer accountDefaultGroupStorageQuotaMb, @Param("accountSettingsRestrictStudentPastViewValue") Boolean accountSettingsRestrictStudentPastViewValue, @Param("accountSettingsRestrictStudentPastViewLocked") Boolean accountSettingsRestrictStudentPastViewLocked, @Param("accountSettingsRestrictStudentFutureViewValue") Boolean accountSettingsRestrictStudentFutureViewValue, @Param("accountSettingsRestrictStudentFutureViewLocked") Boolean accountSettingsRestrictStudentFutureViewLocked, @Param("accountSettingsLockAllAnnouncementsValue") Boolean accountSettingsLockAllAnnouncementsValue, @Param("accountSettingsLockAllAnnouncementsLocked") Boolean accountSettingsLockAllAnnouncementsLocked, @Param("accountSettingsRestrictStudentFutureListingValue") Boolean accountSettingsRestrictStudentFutureListingValue, @Param("accountSettingsRestrictStudentFutureListingLocked") Boolean accountSettingsRestrictStudentFutureListingLocked, @Param("accountServices") Object accountServices);
  
}
