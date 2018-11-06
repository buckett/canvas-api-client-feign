package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.OutcomeGroup;
import com.instructure.canvas.model.OutcomeLink;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface OutcomeGroupsApi extends ApiClient.Api {

  /**
   * Create/link an outcome
   * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param outcomeId  (optional)
   * @param moveFrom  (optional)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return OutcomeLink
   */
  @RequestLine("POST /v1/accounts/{accountId}/outcome_groups/{id}/outcomes")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeLink createLinkOutcomeAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("outcomeId") Integer outcomeId, @Param("moveFrom") Integer moveFrom, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
  /**
   * Create/link an outcome
   * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param outcomeId The ID of the existing outcome to link. (required)
   * @param moveFrom  (optional)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return OutcomeLink
   */
  @RequestLine("PUT /v1/accounts/{accountId}/outcome_groups/{id}/outcomes/{outcomeId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeLink createLinkOutcomeAccountsOutcomeId(@Param("accountId") String accountId, @Param("id") String id, @Param("outcomeId") Integer outcomeId, @Param("moveFrom") Integer moveFrom, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
  /**
   * Create/link an outcome
   * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param outcomeId  (optional)
   * @param moveFrom  (optional)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return OutcomeLink
   */
  @RequestLine("POST /v1/courses/{courseId}/outcome_groups/{id}/outcomes")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeLink createLinkOutcomeCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("outcomeId") Integer outcomeId, @Param("moveFrom") Integer moveFrom, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
  /**
   * Create/link an outcome
   * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param outcomeId The ID of the existing outcome to link. (required)
   * @param moveFrom  (optional)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return OutcomeLink
   */
  @RequestLine("PUT /v1/courses/{courseId}/outcome_groups/{id}/outcomes/{outcomeId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeLink createLinkOutcomeCoursesOutcomeId(@Param("courseId") String courseId, @Param("id") String id, @Param("outcomeId") Integer outcomeId, @Param("moveFrom") Integer moveFrom, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
  /**
   * Create/link an outcome
   * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
   * @param id ID (required)
   * @param outcomeId  (optional)
   * @param moveFrom  (optional)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return OutcomeLink
   */
  @RequestLine("POST /v1/global/outcome_groups/{id}/outcomes")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeLink createLinkOutcomeGlobal(@Param("id") String id, @Param("outcomeId") Integer outcomeId, @Param("moveFrom") Integer moveFrom, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
  /**
   * Create/link an outcome
   * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
   * @param id ID (required)
   * @param outcomeId The ID of the existing outcome to link. (required)
   * @param moveFrom  (optional)
   * @param title  (optional)
   * @param displayName  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param masteryPoints  (optional)
   * @param ratingsDescription  (optional)
   * @param ratingsPoints  (optional)
   * @param calculationMethod  (optional)
   * @param calculationInt  (optional)
   * @return OutcomeLink
   */
  @RequestLine("PUT /v1/global/outcome_groups/{id}/outcomes/{outcomeId}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeLink createLinkOutcomeGlobalOutcomeId(@Param("id") String id, @Param("outcomeId") Integer outcomeId, @Param("moveFrom") Integer moveFrom, @Param("title") String title, @Param("displayName") String displayName, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("masteryPoints") Integer masteryPoints, @Param("ratingsDescription") List<String> ratingsDescription, @Param("ratingsPoints") List<Integer> ratingsPoints, @Param("calculationMethod") String calculationMethod, @Param("calculationInt") Integer calculationInt);
  
  /**
   * Create a subgroup
   * Creates a new empty subgroup under the outcome group with the given title and description.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param title  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("POST /v1/accounts/{accountId}/outcome_groups/{id}/subgroups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup createSubgroupAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("title") String title, @Param("description") String description, @Param("vendorGuid") String vendorGuid);
  
  /**
   * Create a subgroup
   * Creates a new empty subgroup under the outcome group with the given title and description.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param title  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("POST /v1/courses/{courseId}/outcome_groups/{id}/subgroups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup createSubgroupCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("title") String title, @Param("description") String description, @Param("vendorGuid") String vendorGuid);
  
  /**
   * Create a subgroup
   * Creates a new empty subgroup under the outcome group with the given title and description.
   * @param id ID (required)
   * @param title  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("POST /v1/global/outcome_groups/{id}/subgroups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup createSubgroupGlobal(@Param("id") String id, @Param("title") String title, @Param("description") String description, @Param("vendorGuid") String vendorGuid);
  
  /**
   * Delete an outcome group
   * Deleting an outcome group deletes descendant outcome groups and outcome links. The linked outcomes themselves are only deleted if all links to the outcome were deleted.  Aligned outcomes cannot be deleted; as such, if all remaining links to an aligned outcome are included in this group&#x27;s descendants, the group deletion will fail.
   * @param accountId ID (required)
   * @param id ID (required)
   * @return OutcomeGroup
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/outcome_groups/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  OutcomeGroup deleteOutcomeGroupAccounts(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Delete an outcome group
   * Deleting an outcome group deletes descendant outcome groups and outcome links. The linked outcomes themselves are only deleted if all links to the outcome were deleted.  Aligned outcomes cannot be deleted; as such, if all remaining links to an aligned outcome are included in this group&#x27;s descendants, the group deletion will fail.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return OutcomeGroup
   */
  @RequestLine("DELETE /v1/courses/{courseId}/outcome_groups/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  OutcomeGroup deleteOutcomeGroupCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Delete an outcome group
   * Deleting an outcome group deletes descendant outcome groups and outcome links. The linked outcomes themselves are only deleted if all links to the outcome were deleted.  Aligned outcomes cannot be deleted; as such, if all remaining links to an aligned outcome are included in this group&#x27;s descendants, the group deletion will fail.
   * @param id ID (required)
   * @return OutcomeGroup
   */
  @RequestLine("DELETE /v1/global/outcome_groups/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  OutcomeGroup deleteOutcomeGroupGlobal(@Param("id") String id);
  
  /**
   * Get all outcome groups for context
   * 
   * @param accountId ID (required)
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_groups")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> getAllOutcomeGroupsForContextAccounts(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> getAllOutcomeGroupsForContextAccounts(URI uri);
  
  /**
   * Get all outcome groups for context
   * 
   * @param courseId ID (required)
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_groups")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> getAllOutcomeGroupsForContextCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> getAllOutcomeGroupsForContextCourses(URI uri);
  
  /**
   * Get all outcome links for context
   * 
   * @param accountId ID (required)
   * @param outcomeStyle The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @param outcomeGroupStyle The detail level of the outcome groups. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_group_links?outcome_style={outcomeStyle}&outcome_group_style={outcomeGroupStyle}")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> getAllOutcomeLinksForContextAccounts(@Param("accountId") String accountId, @Param("outcomeStyle") String outcomeStyle, @Param("outcomeGroupStyle") String outcomeGroupStyle);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> getAllOutcomeLinksForContextAccounts(URI uri);
  

  /**
   * Get all outcome links for context
   * 
   * Note, this is equivalent to the other <code>getAllOutcomeLinksForContextAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllOutcomeLinksForContextAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>outcomeStyle - The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   <li>outcomeGroupStyle - The detail level of the outcome groups. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   </ul>
   * @return List&lt;OutcomeLink&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_group_links?outcome_style={outcomeStyle}&outcome_group_style={outcomeGroupStyle}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<OutcomeLink> getAllOutcomeLinksForContextAccounts(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllOutcomeLinksForContextAccounts</code> method in a fluent style.
   */
  public static class GetAllOutcomeLinksForContextAccountsQueryParams extends HashMap<String, Object> {
    public GetAllOutcomeLinksForContextAccountsQueryParams outcomeStyle(final String value) {
      put("outcome_style", EncodingUtils.encode(value));
      return this;
    }
    public GetAllOutcomeLinksForContextAccountsQueryParams outcomeGroupStyle(final String value) {
      put("outcome_group_style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get all outcome links for context
   * 
   * @param courseId ID (required)
   * @param outcomeStyle The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @param outcomeGroupStyle The detail level of the outcome groups. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_group_links?outcome_style={outcomeStyle}&outcome_group_style={outcomeGroupStyle}")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> getAllOutcomeLinksForContextCourses(@Param("courseId") String courseId, @Param("outcomeStyle") String outcomeStyle, @Param("outcomeGroupStyle") String outcomeGroupStyle);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> getAllOutcomeLinksForContextCourses(URI uri);
  

  /**
   * Get all outcome links for context
   * 
   * Note, this is equivalent to the other <code>getAllOutcomeLinksForContextCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllOutcomeLinksForContextCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>outcomeStyle - The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   <li>outcomeGroupStyle - The detail level of the outcome groups. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   </ul>
   * @return List&lt;OutcomeLink&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_group_links?outcome_style={outcomeStyle}&outcome_group_style={outcomeGroupStyle}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<OutcomeLink> getAllOutcomeLinksForContextCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllOutcomeLinksForContextCourses</code> method in a fluent style.
   */
  public static class GetAllOutcomeLinksForContextCoursesQueryParams extends HashMap<String, Object> {
    public GetAllOutcomeLinksForContextCoursesQueryParams outcomeStyle(final String value) {
      put("outcome_style", EncodingUtils.encode(value));
      return this;
    }
    public GetAllOutcomeLinksForContextCoursesQueryParams outcomeGroupStyle(final String value) {
      put("outcome_group_style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Import an outcome group
   * Creates a new subgroup of the outcome group with the same title and description as the source group, then creates links in that new subgroup to the same outcomes that are linked in the source group. Recurses on the subgroups of the source group, importing them each in turn into the new subgroup.  Allows you to copy organizational structure, but does not create copies of the outcomes themselves, only new links.  The source group must be either global, from the same context as this outcome group, or from an associated account. The source group cannot be the root outcome group of its context.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param sourceOutcomeGroupId  (optional)
   * @param async  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("POST /v1/accounts/{accountId}/outcome_groups/{id}/import")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup importOutcomeGroupAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("sourceOutcomeGroupId") Integer sourceOutcomeGroupId, @Param("async") Boolean async);
  
  /**
   * Import an outcome group
   * Creates a new subgroup of the outcome group with the same title and description as the source group, then creates links in that new subgroup to the same outcomes that are linked in the source group. Recurses on the subgroups of the source group, importing them each in turn into the new subgroup.  Allows you to copy organizational structure, but does not create copies of the outcomes themselves, only new links.  The source group must be either global, from the same context as this outcome group, or from an associated account. The source group cannot be the root outcome group of its context.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param sourceOutcomeGroupId  (optional)
   * @param async  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("POST /v1/courses/{courseId}/outcome_groups/{id}/import")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup importOutcomeGroupCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("sourceOutcomeGroupId") Integer sourceOutcomeGroupId, @Param("async") Boolean async);
  
  /**
   * Import an outcome group
   * Creates a new subgroup of the outcome group with the same title and description as the source group, then creates links in that new subgroup to the same outcomes that are linked in the source group. Recurses on the subgroups of the source group, importing them each in turn into the new subgroup.  Allows you to copy organizational structure, but does not create copies of the outcomes themselves, only new links.  The source group must be either global, from the same context as this outcome group, or from an associated account. The source group cannot be the root outcome group of its context.
   * @param id ID (required)
   * @param sourceOutcomeGroupId  (optional)
   * @param async  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("POST /v1/global/outcome_groups/{id}/import")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup importOutcomeGroupGlobal(@Param("id") String id, @Param("sourceOutcomeGroupId") Integer sourceOutcomeGroupId, @Param("async") Boolean async);
  
  /**
   * List linked outcomes
   * A paginated list of the immediate OutcomeLink children of the outcome group.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param outcomeStyle The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_groups/{id}/outcomes?outcome_style={outcomeStyle}")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("outcomeStyle") String outcomeStyle);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesAccounts(URI uri);
  

  /**
   * List linked outcomes
   * A paginated list of the immediate OutcomeLink children of the outcome group.
   * Note, this is equivalent to the other <code>listLinkedOutcomesAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListLinkedOutcomesAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>outcomeStyle - The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   </ul>
   * @return List&lt;OutcomeLink&gt;

   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_groups/{id}/outcomes?outcome_style={outcomeStyle}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesAccounts(@Param("accountId") String accountId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listLinkedOutcomesAccounts</code> method in a fluent style.
   */
  public static class ListLinkedOutcomesAccountsQueryParams extends HashMap<String, Object> {
    public ListLinkedOutcomesAccountsQueryParams outcomeStyle(final String value) {
      put("outcome_style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List linked outcomes
   * A paginated list of the immediate OutcomeLink children of the outcome group.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param outcomeStyle The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_groups/{id}/outcomes?outcome_style={outcomeStyle}")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("outcomeStyle") String outcomeStyle);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesCourses(URI uri);
  

  /**
   * List linked outcomes
   * A paginated list of the immediate OutcomeLink children of the outcome group.
   * Note, this is equivalent to the other <code>listLinkedOutcomesCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListLinkedOutcomesCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>outcomeStyle - The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   </ul>
   * @return List&lt;OutcomeLink&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_groups/{id}/outcomes?outcome_style={outcomeStyle}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesCourses(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listLinkedOutcomesCourses</code> method in a fluent style.
   */
  public static class ListLinkedOutcomesCoursesQueryParams extends HashMap<String, Object> {
    public ListLinkedOutcomesCoursesQueryParams outcomeStyle(final String value) {
      put("outcome_style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List linked outcomes
   * A paginated list of the immediate OutcomeLink children of the outcome group.
   * @param id ID (required)
   * @param outcomeStyle The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET /v1/global/outcome_groups/{id}/outcomes?outcome_style={outcomeStyle}")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesGlobal(@Param("id") String id, @Param("outcomeStyle") String outcomeStyle);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeLink&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesGlobal(URI uri);
  

  /**
   * List linked outcomes
   * A paginated list of the immediate OutcomeLink children of the outcome group.
   * Note, this is equivalent to the other <code>listLinkedOutcomesGlobal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListLinkedOutcomesGlobalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>outcomeStyle - The detail level of the outcomes. Defaults to \&quot;abbrev\&quot;. Specify \&quot;full\&quot; for more information. (optional)</li>
   *   </ul>
   * @return List&lt;OutcomeLink&gt;

   */
  @RequestLine("GET /v1/global/outcome_groups/{id}/outcomes?outcome_style={outcomeStyle}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<OutcomeLink> listLinkedOutcomesGlobal(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listLinkedOutcomesGlobal</code> method in a fluent style.
   */
  public static class ListLinkedOutcomesGlobalQueryParams extends HashMap<String, Object> {
    public ListLinkedOutcomesGlobalQueryParams outcomeStyle(final String value) {
      put("outcome_style", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List subgroups
   * A paginated list of the immediate OutcomeGroup children of the outcome group.
   * @param accountId ID (required)
   * @param id ID (required)
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_groups/{id}/subgroups")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> listSubgroupsAccounts(@Param("accountId") String accountId, @Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> listSubgroupsAccounts(URI uri);
  
  /**
   * List subgroups
   * A paginated list of the immediate OutcomeGroup children of the outcome group.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_groups/{id}/subgroups")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> listSubgroupsCourses(@Param("courseId") String courseId, @Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> listSubgroupsCourses(URI uri);
  
  /**
   * List subgroups
   * A paginated list of the immediate OutcomeGroup children of the outcome group.
   * @param id ID (required)
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET /v1/global/outcome_groups/{id}/subgroups")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> listSubgroupsGlobal(@Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;OutcomeGroup&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<OutcomeGroup> listSubgroupsGlobal(URI uri);
  
  /**
   * Redirect to root outcome group for context
   * Convenience redirect to find the root outcome group for a particular context. Will redirect to the appropriate outcome group&#x27;s URL.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/root_outcome_group")
  @Headers({
      "Accept: */*",
  })
  void redirectToRootOutcomeGroupForContextAccounts(@Param("accountId") String accountId);
  
  /**
   * Redirect to root outcome group for context
   * Convenience redirect to find the root outcome group for a particular context. Will redirect to the appropriate outcome group&#x27;s URL.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/root_outcome_group")
  @Headers({
      "Accept: */*",
  })
  void redirectToRootOutcomeGroupForContextCourses(@Param("courseId") String courseId);
  
  /**
   * Redirect to root outcome group for context
   * Convenience redirect to find the root outcome group for a particular context. Will redirect to the appropriate outcome group&#x27;s URL.
   */
  @RequestLine("GET /v1/global/root_outcome_group")
  @Headers({
      "Accept: */*",
  })
  void redirectToRootOutcomeGroupForContextGlobal();
  
  /**
   * Show an outcome group
   * 
   * @param accountId ID (required)
   * @param id ID (required)
   * @return OutcomeGroup
   */
  @RequestLine("GET /v1/accounts/{accountId}/outcome_groups/{id}")
  @Headers({
      "Accept: application/json",
  })
  OutcomeGroup showOutcomeGroupAccounts(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Show an outcome group
   * 
   * @param courseId ID (required)
   * @param id ID (required)
   * @return OutcomeGroup
   */
  @RequestLine("GET /v1/courses/{courseId}/outcome_groups/{id}")
  @Headers({
      "Accept: application/json",
  })
  OutcomeGroup showOutcomeGroupCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Show an outcome group
   * 
   * @param id ID (required)
   * @return OutcomeGroup
   */
  @RequestLine("GET /v1/global/outcome_groups/{id}")
  @Headers({
      "Accept: application/json",
  })
  OutcomeGroup showOutcomeGroupGlobal(@Param("id") String id);
  
  /**
   * Unlink an outcome
   * Unlinking an outcome only deletes the outcome itself if this was the last link to the outcome in any group in any context. Aligned outcomes cannot be deleted; as such, if this is the last link to an aligned outcome, the unlinking will fail.
   * @param accountId ID (required)
   * @param id ID (required)
   * @param outcomeId ID (required)
   * @return OutcomeLink
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/outcome_groups/{id}/outcomes/{outcomeId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  OutcomeLink unlinkOutcomeAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("outcomeId") String outcomeId);
  
  /**
   * Unlink an outcome
   * Unlinking an outcome only deletes the outcome itself if this was the last link to the outcome in any group in any context. Aligned outcomes cannot be deleted; as such, if this is the last link to an aligned outcome, the unlinking will fail.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param outcomeId ID (required)
   * @return OutcomeLink
   */
  @RequestLine("DELETE /v1/courses/{courseId}/outcome_groups/{id}/outcomes/{outcomeId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  OutcomeLink unlinkOutcomeCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("outcomeId") String outcomeId);
  
  /**
   * Unlink an outcome
   * Unlinking an outcome only deletes the outcome itself if this was the last link to the outcome in any group in any context. Aligned outcomes cannot be deleted; as such, if this is the last link to an aligned outcome, the unlinking will fail.
   * @param id ID (required)
   * @param outcomeId ID (required)
   * @return OutcomeLink
   */
  @RequestLine("DELETE /v1/global/outcome_groups/{id}/outcomes/{outcomeId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  OutcomeLink unlinkOutcomeGlobal(@Param("id") String id, @Param("outcomeId") String outcomeId);
  
  /**
   * Update an outcome group
   * Modify an existing outcome group. Fields not provided are left as is; unrecognized fields are ignored.  When changing the parent outcome group, the new parent group must belong to the same context as this outcome group, and must not be a descendant of this outcome group (i.e. no cycles allowed).
   * @param accountId ID (required)
   * @param id ID (required)
   * @param title  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param parentOutcomeGroupId  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("PUT /v1/accounts/{accountId}/outcome_groups/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup updateOutcomeGroupAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("title") String title, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("parentOutcomeGroupId") Integer parentOutcomeGroupId);
  
  /**
   * Update an outcome group
   * Modify an existing outcome group. Fields not provided are left as is; unrecognized fields are ignored.  When changing the parent outcome group, the new parent group must belong to the same context as this outcome group, and must not be a descendant of this outcome group (i.e. no cycles allowed).
   * @param courseId ID (required)
   * @param id ID (required)
   * @param title  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param parentOutcomeGroupId  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("PUT /v1/courses/{courseId}/outcome_groups/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup updateOutcomeGroupCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("title") String title, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("parentOutcomeGroupId") Integer parentOutcomeGroupId);
  
  /**
   * Update an outcome group
   * Modify an existing outcome group. Fields not provided are left as is; unrecognized fields are ignored.  When changing the parent outcome group, the new parent group must belong to the same context as this outcome group, and must not be a descendant of this outcome group (i.e. no cycles allowed).
   * @param id ID (required)
   * @param title  (optional)
   * @param description  (optional)
   * @param vendorGuid  (optional)
   * @param parentOutcomeGroupId  (optional)
   * @return OutcomeGroup
   */
  @RequestLine("PUT /v1/global/outcome_groups/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  OutcomeGroup updateOutcomeGroupGlobal(@Param("id") String id, @Param("title") String title, @Param("description") String description, @Param("vendorGuid") String vendorGuid, @Param("parentOutcomeGroupId") Integer parentOutcomeGroupId);
  
}
