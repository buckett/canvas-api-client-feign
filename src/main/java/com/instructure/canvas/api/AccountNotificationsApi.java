package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.AccountNotification;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AccountNotificationsApi extends ApiClient.Api {

  /**
   * Close notification for user
   * If the current user no long wants to see this notification it can be excused with this call
   * @param accountId ID (required)
   * @param id ID (required)
   * @return AccountNotification
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/account_notifications/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  AccountNotification closeNotificationForUser(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Create a global notification
   * Create and return a new global notification for an account.
   * @param accountId ID (required)
   * @param accountNotificationSubject  (optional)
   * @param accountNotificationMessage  (optional)
   * @param accountNotificationStartAt  (optional)
   * @param accountNotificationEndAt  (optional)
   * @param accountNotificationIcon  (optional)
   * @param accountNotificationRoles  (optional)
   */
  @RequestLine("POST /v1/accounts/{accountId}/account_notifications")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createGlobalNotification(@Param("accountId") String accountId, @Param("accountNotificationSubject") String accountNotificationSubject, @Param("accountNotificationMessage") String accountNotificationMessage, @Param("accountNotificationStartAt") String accountNotificationStartAt, @Param("accountNotificationEndAt") String accountNotificationEndAt, @Param("accountNotificationIcon") String accountNotificationIcon, @Param("accountNotificationRoles") List<String> accountNotificationRoles);
  
  /**
   * Index of active global notification for the user
   * Returns a list of all global notifications in the account for the current user Any notifications that have been closed by the user will not be returned
   * @param accountId ID (required)
   * @return List&lt;AccountNotification&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/account_notifications")
  @Headers({
      "Accept: application/json",
  })
  List<AccountNotification> indexOfActiveGlobalNotificationForUser(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;AccountNotification&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<AccountNotification> indexOfActiveGlobalNotificationForUser(URI uri);
  
  /**
   * Show a global notification
   * Returns a global notification for the current user A notification that has been closed by the user will not be returned
   * @param accountId ID (required)
   * @param id ID (required)
   * @return AccountNotification
   */
  @RequestLine("GET /v1/accounts/{accountId}/account_notifications/{id}")
  @Headers({
      "Accept: application/json",
  })
  AccountNotification showGlobalNotification(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Update a global notification
   * Update global notification for an account.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param accountNotificationSubject  (optional)
   * @param accountNotificationMessage  (optional)
   * @param accountNotificationStartAt  (optional)
   * @param accountNotificationEndAt  (optional)
   * @param accountNotificationIcon  (optional)
   * @param accountNotificationRoles  (optional)
   */
  @RequestLine("PUT /v1/accounts/{accountId}/account_notifications/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateGlobalNotification(@Param("accountId") String accountId, @Param("id") String id, @Param("accountNotificationSubject") String accountNotificationSubject, @Param("accountNotificationMessage") String accountNotificationMessage, @Param("accountNotificationStartAt") String accountNotificationStartAt, @Param("accountNotificationEndAt") String accountNotificationEndAt, @Param("accountNotificationIcon") String accountNotificationIcon, @Param("accountNotificationRoles") List<String> accountNotificationRoles);
  
}
