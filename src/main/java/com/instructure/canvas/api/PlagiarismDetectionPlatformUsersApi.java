package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PlagiarismDetectionPlatformUsersApi extends ApiClient.Api {

  /**
   * Get all users in a group (lti)
   * Get all Canvas users in a group. Tool providers may only access groups that belong to the context the tool is installed in.
   * @param groupId ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /lti/groups/{groupId}/users")
  @Headers({
      "Accept: application/json",
  })
  List<User> getAllUsersInGroupLti(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> getAllUsersInGroupLti(URI uri);
  
  /**
   * Get a single user (lti)
   * Get a single Canvas user by Canvas id or LTI id. Tool providers may only access users that have been assigned an assignment associated with their tool.
   * @param id ID (required)
   * @return User
   */
  @RequestLine("GET /lti/users/{id}")
  @Headers({
      "Accept: application/json",
  })
  User getSingleUserLti(@Param("id") String id);
  
}
