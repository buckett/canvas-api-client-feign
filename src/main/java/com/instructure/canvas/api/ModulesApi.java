package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Module;
import com.instructure.canvas.model.ModuleItem;
import com.instructure.canvas.model.ModuleItemSequence;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ModulesApi extends ApiClient.Api {

  /**
   * Create a module
   * Create and return a new module
   * @param courseId ID (required)
   * @param moduleName  (optional)
   * @param moduleUnlockAt  (optional)
   * @param modulePosition  (optional)
   * @param moduleRequireSequentialProgress  (optional)
   * @param modulePrerequisiteModuleIds  (optional)
   * @param modulePublishFinalGrade  (optional)
   * @return Module
   */
  @RequestLine("POST /v1/courses/{courseId}/modules")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Module createModule(@Param("courseId") String courseId, @Param("moduleName") String moduleName, @Param("moduleUnlockAt") String moduleUnlockAt, @Param("modulePosition") Integer modulePosition, @Param("moduleRequireSequentialProgress") Boolean moduleRequireSequentialProgress, @Param("modulePrerequisiteModuleIds") List<String> modulePrerequisiteModuleIds, @Param("modulePublishFinalGrade") Boolean modulePublishFinalGrade);
  
  /**
   * Create a module item
   * Create and return a new module item
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param moduleItemTitle  (optional)
   * @param moduleItemType  (optional)
   * @param moduleItemContentId  (optional)
   * @param moduleItemPosition  (optional)
   * @param moduleItemIndent  (optional)
   * @param moduleItemPageUrl  (optional)
   * @param moduleItemExternalUrl  (optional)
   * @param moduleItemNewTab  (optional)
   * @param moduleItemCompletionRequirementType  (optional)
   * @param moduleItemCompletionRequirementMinScore  (optional)
   * @return ModuleItem
   */
  @RequestLine("POST /v1/courses/{courseId}/modules/{moduleId}/items")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ModuleItem createModuleItem(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("moduleItemTitle") String moduleItemTitle, @Param("moduleItemType") String moduleItemType, @Param("moduleItemContentId") String moduleItemContentId, @Param("moduleItemPosition") Integer moduleItemPosition, @Param("moduleItemIndent") Integer moduleItemIndent, @Param("moduleItemPageUrl") String moduleItemPageUrl, @Param("moduleItemExternalUrl") String moduleItemExternalUrl, @Param("moduleItemNewTab") Boolean moduleItemNewTab, @Param("moduleItemCompletionRequirementType") String moduleItemCompletionRequirementType, @Param("moduleItemCompletionRequirementMinScore") Integer moduleItemCompletionRequirementMinScore);
  
  /**
   * Delete module
   * Delete a module
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Module
   */
  @RequestLine("DELETE /v1/courses/{courseId}/modules/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Module deleteModule(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Delete module item
   * Delete a module item
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   * @return ModuleItem
   */
  @RequestLine("DELETE /v1/courses/{courseId}/modules/{moduleId}/items/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ModuleItem deleteModuleItem(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id);
  
  /**
   * Get module item sequence
   * Given an asset in a course, find the ModuleItem it belongs to, the previous and next Module Items in the course sequence, and also any applicable mastery path rules
   * @param courseId ID (required)
   * @param assetType The type of asset to find module sequence information for. Use the ModuleItem if it is known (e.g., the user navigated from a module item), since this will avoid ambiguity if the asset appears more than once in the module sequence. (optional)
   * @param assetId The id of the asset (or the url in the case of a Page) (optional)
   * @return ModuleItemSequence
   */
  @RequestLine("GET /v1/courses/{courseId}/module_item_sequence?asset_type={assetType}&asset_id={assetId}")
  @Headers({
      "Accept: application/json",
  })
  ModuleItemSequence getModuleItemSequence(@Param("courseId") String courseId, @Param("assetType") String assetType, @Param("assetId") Integer assetId);
  

  /**
   * Get module item sequence
   * Given an asset in a course, find the ModuleItem it belongs to, the previous and next Module Items in the course sequence, and also any applicable mastery path rules
   * Note, this is equivalent to the other <code>getModuleItemSequence</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetModuleItemSequenceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>assetType - The type of asset to find module sequence information for. Use the ModuleItem if it is known (e.g., the user navigated from a module item), since this will avoid ambiguity if the asset appears more than once in the module sequence. (optional)</li>
   *   <li>assetId - The id of the asset (or the url in the case of a Page) (optional)</li>
   *   </ul>
   * @return ModuleItemSequence

   */
  @RequestLine("GET /v1/courses/{courseId}/module_item_sequence?asset_type={assetType}&asset_id={assetId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  ModuleItemSequence getModuleItemSequence(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getModuleItemSequence</code> method in a fluent style.
   */
  public static class GetModuleItemSequenceQueryParams extends HashMap<String, Object> {
    public GetModuleItemSequenceQueryParams assetType(final String value) {
      put("asset_type", EncodingUtils.encode(value));
      return this;
    }
    public GetModuleItemSequenceQueryParams assetId(final Integer value) {
      put("asset_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List module items
   * A paginated list of the items in a module
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param include If included, will return additional details specific to the content associated with each item. Refer to the {api:Modules:Module%20Item Module Item specification} for more details. Includes standard lock information for each item. (optional)
   * @param searchTerm The partial title of the items to match and return. (optional)
   * @param studentId Returns module completion information for the student with this id. (optional)
   * @return List&lt;ModuleItem&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/modules/{moduleId}/items?include={include}&search_term={searchTerm}&student_id={studentId}")
  @Headers({
      "Accept: application/json",
  })
  List<ModuleItem> listModuleItems(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("include") List<String> include, @Param("searchTerm") String searchTerm, @Param("studentId") String studentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ModuleItem&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ModuleItem> listModuleItems(URI uri);
  

  /**
   * List module items
   * A paginated list of the items in a module
   * Note, this is equivalent to the other <code>listModuleItems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListModuleItemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If included, will return additional details specific to the content associated with each item. Refer to the {api:Modules:Module%20Item Module Item specification} for more details. Includes standard lock information for each item. (optional)</li>
   *   <li>searchTerm - The partial title of the items to match and return. (optional)</li>
   *   <li>studentId - Returns module completion information for the student with this id. (optional)</li>
   *   </ul>
   * @return List&lt;ModuleItem&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/modules/{moduleId}/items?include={include}&search_term={searchTerm}&student_id={studentId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<ModuleItem> listModuleItems(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listModuleItems</code> method in a fluent style.
   */
  public static class ListModuleItemsQueryParams extends HashMap<String, Object> {
    public ListModuleItemsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListModuleItemsQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListModuleItemsQueryParams studentId(final String value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List modules
   * A paginated list of the modules in a course
   * @param courseId ID (required)
   * @param include - \&quot;items\&quot;: Return module items inline if possible.   This parameter suggests that Canvas return module items directly   in the Module object JSON, to avoid having to make separate API   requests for each module when enumerating modules and items. Canvas   is free to omit &#x27;items&#x27; for any particular module if it deems them   too numerous to return inline. Callers must be prepared to use the   {api:ContextModuleItemsApiController#index List Module Items API}   if items are not returned. - \&quot;content_details\&quot;: Requires include[&#x27;items&#x27;]. Returns additional   details with module items specific to their associated content items.   Includes standard lock information for each item. (optional)
   * @param searchTerm The partial name of the modules (and module items, if include[&#x27;items&#x27;] is specified) to match and return. (optional)
   * @param studentId Returns module completion information for the student with this id. (optional)
   * @return List&lt;Module&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/modules?include={include}&search_term={searchTerm}&student_id={studentId}")
  @Headers({
      "Accept: application/json",
  })
  List<Module> listModules(@Param("courseId") String courseId, @Param("include") List<String> include, @Param("searchTerm") String searchTerm, @Param("studentId") String studentId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Module&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Module> listModules(URI uri);
  

  /**
   * List modules
   * A paginated list of the modules in a course
   * Note, this is equivalent to the other <code>listModules</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListModulesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;items\&quot;: Return module items inline if possible.   This parameter suggests that Canvas return module items directly   in the Module object JSON, to avoid having to make separate API   requests for each module when enumerating modules and items. Canvas   is free to omit &#x27;items&#x27; for any particular module if it deems them   too numerous to return inline. Callers must be prepared to use the   {api:ContextModuleItemsApiController#index List Module Items API}   if items are not returned. - \&quot;content_details\&quot;: Requires include[&#x27;items&#x27;]. Returns additional   details with module items specific to their associated content items.   Includes standard lock information for each item. (optional)</li>
   *   <li>searchTerm - The partial name of the modules (and module items, if include[&#x27;items&#x27;] is specified) to match and return. (optional)</li>
   *   <li>studentId - Returns module completion information for the student with this id. (optional)</li>
   *   </ul>
   * @return List&lt;Module&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/modules?include={include}&search_term={searchTerm}&student_id={studentId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Module> listModules(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listModules</code> method in a fluent style.
   */
  public static class ListModulesQueryParams extends HashMap<String, Object> {
    public ListModulesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListModulesQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListModulesQueryParams studentId(final String value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Mark module item as done/not done
   * Mark a module item as done/not done. Use HTTP method PUT to mark as done, and DELETE to mark as not done.
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/modules/{moduleId}/items/{id}/done")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markModuleItemAsDoneNotDone(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id);
  
  /**
   * Mark module item read
   * Fulfills \&quot;must view\&quot; requirement for a module item. It is generally not necessary to do this explicitly, but it is provided for applications that need to access external content directly (bypassing the html_url redirect that normally allows Canvas to fulfill \&quot;must view\&quot; requirements).  This endpoint cannot be used to complete requirements on locked or unpublished module items.
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   */
  @RequestLine("POST /v1/courses/{courseId}/modules/{moduleId}/items/{id}/mark_read")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void markModuleItemRead(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id);
  
  /**
   * Re-lock module progressions
   * Resets module progressions to their default locked state and recalculates them based on the current requirements.  Adding progression requirements to an active course will not lock students out of modules they have already unlocked unless this action is called.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Module
   */
  @RequestLine("PUT /v1/courses/{courseId}/modules/{id}/relock")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Module reLockModuleProgressions(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Select a mastery path
   * Select a mastery path when module item includes several possible paths. Requires Mastery Paths feature to be enabled.  Returns a compound document with the assignments included in the given path and any module items related to those assignments
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   * @param assignmentSetId  (optional)
   * @param studentId  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/modules/{moduleId}/items/{id}/select_mastery_path")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void selectMasteryPath(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id, @Param("assignmentSetId") String assignmentSetId, @Param("studentId") String studentId);
  
  /**
   * Show module
   * Get information about a single module
   * @param courseId ID (required)
   * @param id ID (required)
   * @param include - \&quot;items\&quot;: Return module items inline if possible.   This parameter suggests that Canvas return module items directly   in the Module object JSON, to avoid having to make separate API   requests for each module when enumerating modules and items. Canvas   is free to omit &#x27;items&#x27; for any particular module if it deems them   too numerous to return inline. Callers must be prepared to use the   {api:ContextModuleItemsApiController#index List Module Items API}   if items are not returned. - \&quot;content_details\&quot;: Requires include[&#x27;items&#x27;]. Returns additional   details with module items specific to their associated content items.   Includes standard lock information for each item. (optional)
   * @param studentId Returns module completion information for the student with this id. (optional)
   * @return Module
   */
  @RequestLine("GET /v1/courses/{courseId}/modules/{id}?include={include}&student_id={studentId}")
  @Headers({
      "Accept: application/json",
  })
  Module showModule(@Param("courseId") String courseId, @Param("id") String id, @Param("include") List<String> include, @Param("studentId") String studentId);
  

  /**
   * Show module
   * Get information about a single module
   * Note, this is equivalent to the other <code>showModule</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowModuleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - - \&quot;items\&quot;: Return module items inline if possible.   This parameter suggests that Canvas return module items directly   in the Module object JSON, to avoid having to make separate API   requests for each module when enumerating modules and items. Canvas   is free to omit &#x27;items&#x27; for any particular module if it deems them   too numerous to return inline. Callers must be prepared to use the   {api:ContextModuleItemsApiController#index List Module Items API}   if items are not returned. - \&quot;content_details\&quot;: Requires include[&#x27;items&#x27;]. Returns additional   details with module items specific to their associated content items.   Includes standard lock information for each item. (optional)</li>
   *   <li>studentId - Returns module completion information for the student with this id. (optional)</li>
   *   </ul>
   * @return Module

   */
  @RequestLine("GET /v1/courses/{courseId}/modules/{id}?include={include}&student_id={studentId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  Module showModule(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showModule</code> method in a fluent style.
   */
  public static class ShowModuleQueryParams extends HashMap<String, Object> {
    public ShowModuleQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ShowModuleQueryParams studentId(final String value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show module item
   * Get information about a single module item
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   * @param include If included, will return additional details specific to the content associated with this item. Refer to the {api:Modules:Module%20Item Module Item specification} for more details. Includes standard lock information for each item. (optional)
   * @param studentId Returns module completion information for the student with this id. (optional)
   * @return ModuleItem
   */
  @RequestLine("GET /v1/courses/{courseId}/modules/{moduleId}/items/{id}?include={include}&student_id={studentId}")
  @Headers({
      "Accept: application/json",
  })
  ModuleItem showModuleItem(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id, @Param("include") List<String> include, @Param("studentId") String studentId);
  

  /**
   * Show module item
   * Get information about a single module item
   * Note, this is equivalent to the other <code>showModuleItem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowModuleItemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - If included, will return additional details specific to the content associated with this item. Refer to the {api:Modules:Module%20Item Module Item specification} for more details. Includes standard lock information for each item. (optional)</li>
   *   <li>studentId - Returns module completion information for the student with this id. (optional)</li>
   *   </ul>
   * @return ModuleItem

   */
  @RequestLine("GET /v1/courses/{courseId}/modules/{moduleId}/items/{id}?include={include}&student_id={studentId}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  ModuleItem showModuleItem(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showModuleItem</code> method in a fluent style.
   */
  public static class ShowModuleItemQueryParams extends HashMap<String, Object> {
    public ShowModuleItemQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ShowModuleItemQueryParams studentId(final String value) {
      put("student_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Update a module
   * Update and return an existing module
   * @param courseId ID (required)
   * @param id ID (required)
   * @param moduleName  (optional)
   * @param moduleUnlockAt  (optional)
   * @param modulePosition  (optional)
   * @param moduleRequireSequentialProgress  (optional)
   * @param modulePrerequisiteModuleIds  (optional)
   * @param modulePublishFinalGrade  (optional)
   * @param modulePublished  (optional)
   * @return Module
   */
  @RequestLine("PUT /v1/courses/{courseId}/modules/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Module updateModule(@Param("courseId") String courseId, @Param("id") String id, @Param("moduleName") String moduleName, @Param("moduleUnlockAt") String moduleUnlockAt, @Param("modulePosition") Integer modulePosition, @Param("moduleRequireSequentialProgress") Boolean moduleRequireSequentialProgress, @Param("modulePrerequisiteModuleIds") List<String> modulePrerequisiteModuleIds, @Param("modulePublishFinalGrade") Boolean modulePublishFinalGrade, @Param("modulePublished") Boolean modulePublished);
  
  /**
   * Update a module item
   * Update and return an existing module item
   * @param courseId ID (required)
   * @param moduleId ID (required)
   * @param id ID (required)
   * @param moduleItemTitle  (optional)
   * @param moduleItemPosition  (optional)
   * @param moduleItemIndent  (optional)
   * @param moduleItemExternalUrl  (optional)
   * @param moduleItemNewTab  (optional)
   * @param moduleItemCompletionRequirementType  (optional)
   * @param moduleItemCompletionRequirementMinScore  (optional)
   * @param moduleItemPublished  (optional)
   * @param moduleItemModuleId  (optional)
   * @return ModuleItem
   */
  @RequestLine("PUT /v1/courses/{courseId}/modules/{moduleId}/items/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ModuleItem updateModuleItem(@Param("courseId") String courseId, @Param("moduleId") String moduleId, @Param("id") String id, @Param("moduleItemTitle") String moduleItemTitle, @Param("moduleItemPosition") Integer moduleItemPosition, @Param("moduleItemIndent") Integer moduleItemIndent, @Param("moduleItemExternalUrl") String moduleItemExternalUrl, @Param("moduleItemNewTab") Boolean moduleItemNewTab, @Param("moduleItemCompletionRequirementType") String moduleItemCompletionRequirementType, @Param("moduleItemCompletionRequirementMinScore") Integer moduleItemCompletionRequirementMinScore, @Param("moduleItemPublished") Boolean moduleItemPublished, @Param("moduleItemModuleId") String moduleItemModuleId);
  
}
