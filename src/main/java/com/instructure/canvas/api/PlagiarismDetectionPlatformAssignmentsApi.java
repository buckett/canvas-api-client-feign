package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.LtiAssignment;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PlagiarismDetectionPlatformAssignmentsApi extends ApiClient.Api {

  /**
   * Get a single assignment (lti)
   * Get a single Canvas assignment by Canvas id or LTI id. Tool providers may only access assignments that are associated with their tool.
   * @param assignmentId ID (required)
   * @param userId The id of the user. Can be a Canvas or LTI id for the user. (optional)
   * @return LtiAssignment
   */
  @RequestLine("GET /lti/assignments/{assignmentId}?user_id={userId}")
  @Headers({
      "Accept: application/json",
  })
  LtiAssignment getSingleAssignmentLti(@Param("assignmentId") String assignmentId, @Param("userId") String userId);
  

  /**
   * Get a single assignment (lti)
   * Get a single Canvas assignment by Canvas id or LTI id. Tool providers may only access assignments that are associated with their tool.
   * Note, this is equivalent to the other <code>getSingleAssignmentLti</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleAssignmentLtiQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - The id of the user. Can be a Canvas or LTI id for the user. (optional)</li>
   *   </ul>
   * @return LtiAssignment

   */
  @RequestLine("GET /lti/assignments/{assignmentId}?user_id={userId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  LtiAssignment getSingleAssignmentLti(@Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleAssignmentLti</code> method in a fluent style.
   */
  public static class GetSingleAssignmentLtiQueryParams extends HashMap<String, Object> {
    public GetSingleAssignmentLtiQueryParams userId(final String value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
  }
}
