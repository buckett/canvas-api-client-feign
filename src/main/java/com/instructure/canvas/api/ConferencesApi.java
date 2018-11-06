package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Conference;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ConferencesApi extends ApiClient.Api {

  /**
   * List conferences
   * Retrieve the paginated list of conferences for this context  This API returns a JSON object containing the list of conferences, the key for the list of conferences is \&quot;conferences\&quot;
   * @param courseId ID (required)
   * @return List&lt;Conference&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/conferences")
  @Headers({
      "Accept: application/json",
  })
  List<Conference> listConferencesCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Conference&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Conference> listConferencesCourses(URI uri);
  
  /**
   * List conferences
   * Retrieve the paginated list of conferences for this context  This API returns a JSON object containing the list of conferences, the key for the list of conferences is \&quot;conferences\&quot;
   * @param groupId ID (required)
   * @return List&lt;Conference&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/conferences")
  @Headers({
      "Accept: application/json",
  })
  List<Conference> listConferencesGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Conference&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Conference> listConferencesGroups(URI uri);
  
}
