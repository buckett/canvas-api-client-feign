package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;


import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface LoginsApi extends ApiClient.Api {

  /**
   * Create a user login
   * Create a new login for an existing user in the given account.
   * @param accountId ID (required)
   * @param userId  (optional)
   * @param loginUniqueId  (optional)
   * @param loginPassword  (optional)
   * @param loginSisUserId  (optional)
   * @param loginIntegrationId  (optional)
   * @param loginAuthenticationProviderId  (optional)
   */
  @RequestLine("POST /v1/accounts/{accountId}/logins")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createUserLogin(@Param("accountId") String accountId, @Param("userId") String userId, @Param("loginUniqueId") String loginUniqueId, @Param("loginPassword") String loginPassword, @Param("loginSisUserId") String loginSisUserId, @Param("loginIntegrationId") String loginIntegrationId, @Param("loginAuthenticationProviderId") String loginAuthenticationProviderId);
  
  /**
   * Delete a user login
   * Delete an existing login.
   * @param userId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/users/{userId}/logins/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteUserLogin(@Param("userId") String userId, @Param("id") String id);
  
  /**
   * Edit a user login
   * Update an existing login for a user in the given account.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param loginUniqueId  (optional)
   * @param loginPassword  (optional)
   * @param loginSisUserId  (optional)
   * @param loginIntegrationId  (optional)
   */
  @RequestLine("PUT /v1/accounts/{accountId}/logins/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void editUserLogin(@Param("accountId") String accountId, @Param("id") String id, @Param("loginUniqueId") String loginUniqueId, @Param("loginPassword") String loginPassword, @Param("loginSisUserId") String loginSisUserId, @Param("loginIntegrationId") String loginIntegrationId);
  
  /**
   * List user logins
   * Given a user ID, return a paginated list of that user&#x27;s logins for the given account.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/logins")
  @Headers({
      "Accept: */*",
  })
  void listUserLoginsAccounts(@Param("accountId") String accountId);
  
  /**
   * List user logins
   * Given a user ID, return a paginated list of that user&#x27;s logins for the given account.
   * @param userId ID (required)
   */
  @RequestLine("GET /v1/users/{userId}/logins")
  @Headers({
      "Accept: */*",
  })
  void listUserLoginsUsers(@Param("userId") String userId);
  
}
