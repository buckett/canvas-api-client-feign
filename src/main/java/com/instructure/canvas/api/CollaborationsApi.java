package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Collaboration;
import com.instructure.canvas.model.Collaborator;
import com.instructure.canvas.model.User;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CollaborationsApi extends ApiClient.Api {

  /**
   * List collaborations
   * A paginated list of collaborations the current user has access to in the context of the course provided in the url. NOTE: this only returns ExternalToolCollaboration type collaborations.    curl https://&lt;canvas&gt;/api/v1/courses/1/collaborations/
   * @param courseId ID (required)
   * @return List&lt;Collaboration&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/collaborations")
  @Headers({
      "Accept: application/json",
  })
  List<Collaboration> listCollaborationsCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Collaboration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Collaboration> listCollaborationsCourses(URI uri);
  
  /**
   * List collaborations
   * A paginated list of collaborations the current user has access to in the context of the course provided in the url. NOTE: this only returns ExternalToolCollaboration type collaborations.    curl https://&lt;canvas&gt;/api/v1/courses/1/collaborations/
   * @param groupId ID (required)
   * @return List&lt;Collaboration&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/collaborations")
  @Headers({
      "Accept: application/json",
  })
  List<Collaboration> listCollaborationsGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Collaboration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Collaboration> listCollaborationsGroups(URI uri);
  
  /**
   * List members of a collaboration.
   * A paginated list of the collaborators of a given collaboration
   * @param id ID (required)
   * @param include - \&quot;collaborator_lti_id\&quot;: Optional information to include with each member.   Represents an identifier to be used for the member in an LTI context. - \&quot;avatar_image_url\&quot;: Optional information to include with each member.   The url for the avatar of a collaborator with type &#x27;user&#x27;. (optional)
   * @return List&lt;Collaborator&gt;
   */
  @RequestLine("GET /v1/collaborations/{id}/members?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<Collaborator> listMembersOfCollaboration(@Param("id") String id, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Collaborator&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Collaborator> listMembersOfCollaboration(URI uri);
  

  /**
   * List members of a collaboration.
   * A paginated list of the collaborators of a given collaboration
   * Note, this is equivalent to the other <code>listMembersOfCollaboration</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMembersOfCollaborationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;collaborator_lti_id\&quot;: Optional information to include with each member.   Represents an identifier to be used for the member in an LTI context. - \&quot;avatar_image_url\&quot;: Optional information to include with each member.   The url for the avatar of a collaborator with type &#x27;user&#x27;. (optional)</li>
   *   </ul>
   * @return List&lt;Collaborator&gt;

   */
  @RequestLine("GET /v1/collaborations/{id}/members?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Collaborator> listMembersOfCollaboration(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listMembersOfCollaboration</code> method in a fluent style.
   */
  public static class ListMembersOfCollaborationQueryParams extends HashMap<String, Object> {
    public ListMembersOfCollaborationQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * List potential members
   * A paginated list of the users who can potentially be added to a collaboration in the given context.  For courses, this consists of all enrolled users.  For groups, it is comprised of the group members plus the admins of the course containing the group.
   * @param courseId ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/potential_collaborators")
  @Headers({
      "Accept: application/json",
  })
  List<User> listPotentialMembersCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listPotentialMembersCourses(URI uri);
  
  /**
   * List potential members
   * A paginated list of the users who can potentially be added to a collaboration in the given context.  For courses, this consists of all enrolled users.  For groups, it is comprised of the group members plus the admins of the course containing the group.
   * @param groupId ID (required)
   * @return List&lt;User&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/potential_collaborators")
  @Headers({
      "Accept: application/json",
  })
  List<User> listPotentialMembersGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;User&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<User> listPotentialMembersGroups(URI uri);
  
}
