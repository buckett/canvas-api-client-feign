package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.ContextExternalTool;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ExternalToolsApi extends ApiClient.Api {

  /**
   * Create an external tool
   * Create an external tool in the specified course/account. The created tool will be returned, see the \&quot;show\&quot; endpoint for an example.
   * @param accountId ID (required)
   * @param name  (optional)
   * @param privacyLevel  (optional)
   * @param consumerKey  (optional)
   * @param sharedSecret  (optional)
   * @param description  (optional)
   * @param url  (optional)
   * @param domain  (optional)
   * @param iconUrl  (optional)
   * @param text  (optional)
   * @param customFieldsFieldName  (optional)
   * @param accountNavigationUrl  (optional)
   * @param accountNavigationEnabled  (optional)
   * @param accountNavigationText  (optional)
   * @param accountNavigationSelectionWidth  (optional)
   * @param accountNavigationSelectionHeight  (optional)
   * @param accountNavigationDisplayType  (optional)
   * @param userNavigationUrl  (optional)
   * @param userNavigationEnabled  (optional)
   * @param userNavigationText  (optional)
   * @param userNavigationVisibility  (optional)
   * @param courseHomeSubNavigationUrl  (optional)
   * @param courseHomeSubNavigationEnabled  (optional)
   * @param courseHomeSubNavigationText  (optional)
   * @param courseHomeSubNavigationIconUrl  (optional)
   * @param courseNavigationEnabled  (optional)
   * @param courseNavigationText  (optional)
   * @param courseNavigationVisibility  (optional)
   * @param courseNavigationWindowTarget  (optional)
   * @param courseNavigationDefault  (optional)
   * @param courseNavigationDisplayType  (optional)
   * @param editorButtonUrl  (optional)
   * @param editorButtonEnabled  (optional)
   * @param editorButtonIconUrl  (optional)
   * @param editorButtonSelectionWidth  (optional)
   * @param editorButtonSelectionHeight  (optional)
   * @param editorButtonMessageType  (optional)
   * @param homeworkSubmissionUrl  (optional)
   * @param homeworkSubmissionEnabled  (optional)
   * @param homeworkSubmissionText  (optional)
   * @param homeworkSubmissionMessageType  (optional)
   * @param linkSelectionUrl  (optional)
   * @param linkSelectionEnabled  (optional)
   * @param linkSelectionText  (optional)
   * @param linkSelectionMessageType  (optional)
   * @param migrationSelectionUrl  (optional)
   * @param migrationSelectionEnabled  (optional)
   * @param migrationSelectionMessageType  (optional)
   * @param toolConfigurationUrl  (optional)
   * @param toolConfigurationEnabled  (optional)
   * @param toolConfigurationMessageType  (optional)
   * @param toolConfigurationPreferSisEmail  (optional)
   * @param resourceSelectionUrl  (optional)
   * @param resourceSelectionEnabled  (optional)
   * @param resourceSelectionIconUrl  (optional)
   * @param resourceSelectionSelectionWidth  (optional)
   * @param resourceSelectionSelectionHeight  (optional)
   * @param configType  (optional)
   * @param configXml  (optional)
   * @param configUrl  (optional)
   * @param notSelectable  (optional)
   * @param oauthCompliant  (optional)
   */
  @RequestLine("POST /v1/accounts/{accountId}/external_tools")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createExternalToolAccounts(@Param("accountId") String accountId, @Param("name") String name, @Param("privacyLevel") String privacyLevel, @Param("consumerKey") String consumerKey, @Param("sharedSecret") String sharedSecret, @Param("description") String description, @Param("url") String url, @Param("domain") String domain, @Param("iconUrl") String iconUrl, @Param("text") String text, @Param("customFieldsFieldName") String customFieldsFieldName, @Param("accountNavigationUrl") String accountNavigationUrl, @Param("accountNavigationEnabled") Boolean accountNavigationEnabled, @Param("accountNavigationText") String accountNavigationText, @Param("accountNavigationSelectionWidth") String accountNavigationSelectionWidth, @Param("accountNavigationSelectionHeight") String accountNavigationSelectionHeight, @Param("accountNavigationDisplayType") String accountNavigationDisplayType, @Param("userNavigationUrl") String userNavigationUrl, @Param("userNavigationEnabled") Boolean userNavigationEnabled, @Param("userNavigationText") String userNavigationText, @Param("userNavigationVisibility") String userNavigationVisibility, @Param("courseHomeSubNavigationUrl") String courseHomeSubNavigationUrl, @Param("courseHomeSubNavigationEnabled") Boolean courseHomeSubNavigationEnabled, @Param("courseHomeSubNavigationText") String courseHomeSubNavigationText, @Param("courseHomeSubNavigationIconUrl") String courseHomeSubNavigationIconUrl, @Param("courseNavigationEnabled") Boolean courseNavigationEnabled, @Param("courseNavigationText") String courseNavigationText, @Param("courseNavigationVisibility") String courseNavigationVisibility, @Param("courseNavigationWindowTarget") String courseNavigationWindowTarget, @Param("courseNavigationDefault") Boolean courseNavigationDefault, @Param("courseNavigationDisplayType") String courseNavigationDisplayType, @Param("editorButtonUrl") String editorButtonUrl, @Param("editorButtonEnabled") Boolean editorButtonEnabled, @Param("editorButtonIconUrl") String editorButtonIconUrl, @Param("editorButtonSelectionWidth") String editorButtonSelectionWidth, @Param("editorButtonSelectionHeight") String editorButtonSelectionHeight, @Param("editorButtonMessageType") String editorButtonMessageType, @Param("homeworkSubmissionUrl") String homeworkSubmissionUrl, @Param("homeworkSubmissionEnabled") Boolean homeworkSubmissionEnabled, @Param("homeworkSubmissionText") String homeworkSubmissionText, @Param("homeworkSubmissionMessageType") String homeworkSubmissionMessageType, @Param("linkSelectionUrl") String linkSelectionUrl, @Param("linkSelectionEnabled") Boolean linkSelectionEnabled, @Param("linkSelectionText") String linkSelectionText, @Param("linkSelectionMessageType") String linkSelectionMessageType, @Param("migrationSelectionUrl") String migrationSelectionUrl, @Param("migrationSelectionEnabled") Boolean migrationSelectionEnabled, @Param("migrationSelectionMessageType") String migrationSelectionMessageType, @Param("toolConfigurationUrl") String toolConfigurationUrl, @Param("toolConfigurationEnabled") Boolean toolConfigurationEnabled, @Param("toolConfigurationMessageType") String toolConfigurationMessageType, @Param("toolConfigurationPreferSisEmail") Boolean toolConfigurationPreferSisEmail, @Param("resourceSelectionUrl") String resourceSelectionUrl, @Param("resourceSelectionEnabled") Boolean resourceSelectionEnabled, @Param("resourceSelectionIconUrl") String resourceSelectionIconUrl, @Param("resourceSelectionSelectionWidth") String resourceSelectionSelectionWidth, @Param("resourceSelectionSelectionHeight") String resourceSelectionSelectionHeight, @Param("configType") String configType, @Param("configXml") String configXml, @Param("configUrl") String configUrl, @Param("notSelectable") Boolean notSelectable, @Param("oauthCompliant") Boolean oauthCompliant);
  
  /**
   * Create an external tool
   * Create an external tool in the specified course/account. The created tool will be returned, see the \&quot;show\&quot; endpoint for an example.
   * @param courseId ID (required)
   * @param name  (optional)
   * @param privacyLevel  (optional)
   * @param consumerKey  (optional)
   * @param sharedSecret  (optional)
   * @param description  (optional)
   * @param url  (optional)
   * @param domain  (optional)
   * @param iconUrl  (optional)
   * @param text  (optional)
   * @param customFieldsFieldName  (optional)
   * @param accountNavigationUrl  (optional)
   * @param accountNavigationEnabled  (optional)
   * @param accountNavigationText  (optional)
   * @param accountNavigationSelectionWidth  (optional)
   * @param accountNavigationSelectionHeight  (optional)
   * @param accountNavigationDisplayType  (optional)
   * @param userNavigationUrl  (optional)
   * @param userNavigationEnabled  (optional)
   * @param userNavigationText  (optional)
   * @param userNavigationVisibility  (optional)
   * @param courseHomeSubNavigationUrl  (optional)
   * @param courseHomeSubNavigationEnabled  (optional)
   * @param courseHomeSubNavigationText  (optional)
   * @param courseHomeSubNavigationIconUrl  (optional)
   * @param courseNavigationEnabled  (optional)
   * @param courseNavigationText  (optional)
   * @param courseNavigationVisibility  (optional)
   * @param courseNavigationWindowTarget  (optional)
   * @param courseNavigationDefault  (optional)
   * @param courseNavigationDisplayType  (optional)
   * @param editorButtonUrl  (optional)
   * @param editorButtonEnabled  (optional)
   * @param editorButtonIconUrl  (optional)
   * @param editorButtonSelectionWidth  (optional)
   * @param editorButtonSelectionHeight  (optional)
   * @param editorButtonMessageType  (optional)
   * @param homeworkSubmissionUrl  (optional)
   * @param homeworkSubmissionEnabled  (optional)
   * @param homeworkSubmissionText  (optional)
   * @param homeworkSubmissionMessageType  (optional)
   * @param linkSelectionUrl  (optional)
   * @param linkSelectionEnabled  (optional)
   * @param linkSelectionText  (optional)
   * @param linkSelectionMessageType  (optional)
   * @param migrationSelectionUrl  (optional)
   * @param migrationSelectionEnabled  (optional)
   * @param migrationSelectionMessageType  (optional)
   * @param toolConfigurationUrl  (optional)
   * @param toolConfigurationEnabled  (optional)
   * @param toolConfigurationMessageType  (optional)
   * @param toolConfigurationPreferSisEmail  (optional)
   * @param resourceSelectionUrl  (optional)
   * @param resourceSelectionEnabled  (optional)
   * @param resourceSelectionIconUrl  (optional)
   * @param resourceSelectionSelectionWidth  (optional)
   * @param resourceSelectionSelectionHeight  (optional)
   * @param configType  (optional)
   * @param configXml  (optional)
   * @param configUrl  (optional)
   * @param notSelectable  (optional)
   * @param oauthCompliant  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/external_tools")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createExternalToolCourses(@Param("courseId") String courseId, @Param("name") String name, @Param("privacyLevel") String privacyLevel, @Param("consumerKey") String consumerKey, @Param("sharedSecret") String sharedSecret, @Param("description") String description, @Param("url") String url, @Param("domain") String domain, @Param("iconUrl") String iconUrl, @Param("text") String text, @Param("customFieldsFieldName") String customFieldsFieldName, @Param("accountNavigationUrl") String accountNavigationUrl, @Param("accountNavigationEnabled") Boolean accountNavigationEnabled, @Param("accountNavigationText") String accountNavigationText, @Param("accountNavigationSelectionWidth") String accountNavigationSelectionWidth, @Param("accountNavigationSelectionHeight") String accountNavigationSelectionHeight, @Param("accountNavigationDisplayType") String accountNavigationDisplayType, @Param("userNavigationUrl") String userNavigationUrl, @Param("userNavigationEnabled") Boolean userNavigationEnabled, @Param("userNavigationText") String userNavigationText, @Param("userNavigationVisibility") String userNavigationVisibility, @Param("courseHomeSubNavigationUrl") String courseHomeSubNavigationUrl, @Param("courseHomeSubNavigationEnabled") Boolean courseHomeSubNavigationEnabled, @Param("courseHomeSubNavigationText") String courseHomeSubNavigationText, @Param("courseHomeSubNavigationIconUrl") String courseHomeSubNavigationIconUrl, @Param("courseNavigationEnabled") Boolean courseNavigationEnabled, @Param("courseNavigationText") String courseNavigationText, @Param("courseNavigationVisibility") String courseNavigationVisibility, @Param("courseNavigationWindowTarget") String courseNavigationWindowTarget, @Param("courseNavigationDefault") Boolean courseNavigationDefault, @Param("courseNavigationDisplayType") String courseNavigationDisplayType, @Param("editorButtonUrl") String editorButtonUrl, @Param("editorButtonEnabled") Boolean editorButtonEnabled, @Param("editorButtonIconUrl") String editorButtonIconUrl, @Param("editorButtonSelectionWidth") String editorButtonSelectionWidth, @Param("editorButtonSelectionHeight") String editorButtonSelectionHeight, @Param("editorButtonMessageType") String editorButtonMessageType, @Param("homeworkSubmissionUrl") String homeworkSubmissionUrl, @Param("homeworkSubmissionEnabled") Boolean homeworkSubmissionEnabled, @Param("homeworkSubmissionText") String homeworkSubmissionText, @Param("homeworkSubmissionMessageType") String homeworkSubmissionMessageType, @Param("linkSelectionUrl") String linkSelectionUrl, @Param("linkSelectionEnabled") Boolean linkSelectionEnabled, @Param("linkSelectionText") String linkSelectionText, @Param("linkSelectionMessageType") String linkSelectionMessageType, @Param("migrationSelectionUrl") String migrationSelectionUrl, @Param("migrationSelectionEnabled") Boolean migrationSelectionEnabled, @Param("migrationSelectionMessageType") String migrationSelectionMessageType, @Param("toolConfigurationUrl") String toolConfigurationUrl, @Param("toolConfigurationEnabled") Boolean toolConfigurationEnabled, @Param("toolConfigurationMessageType") String toolConfigurationMessageType, @Param("toolConfigurationPreferSisEmail") Boolean toolConfigurationPreferSisEmail, @Param("resourceSelectionUrl") String resourceSelectionUrl, @Param("resourceSelectionEnabled") Boolean resourceSelectionEnabled, @Param("resourceSelectionIconUrl") String resourceSelectionIconUrl, @Param("resourceSelectionSelectionWidth") String resourceSelectionSelectionWidth, @Param("resourceSelectionSelectionHeight") String resourceSelectionSelectionHeight, @Param("configType") String configType, @Param("configXml") String configXml, @Param("configUrl") String configUrl, @Param("notSelectable") Boolean notSelectable, @Param("oauthCompliant") Boolean oauthCompliant);
  
  /**
   * Create Tool from ToolConfiguration
   * Creates context_external_tool from attached tool_configuration of the provided developer_key if not already present in context. DeveloperKey must have a ToolConfiguration to create tool or 404 will be raised. Will return an existing ContextExternalTool if one already exists.
   * @param accountId if account (required)
   * @param developerKeyId no description (required)
   * @param courseId  (optional)
   * @return ContextExternalTool
   */
  @RequestLine("POST /v1/accounts/{accountId}/developer_keys/{developerKeyId}/create_tool")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContextExternalTool createToolFromToolconfigurationAccounts(@Param("accountId") String accountId, @Param("developerKeyId") String developerKeyId, @Param("courseId") String courseId);
  
  /**
   * Create Tool from ToolConfiguration
   * Creates context_external_tool from attached tool_configuration of the provided developer_key if not already present in context. DeveloperKey must have a ToolConfiguration to create tool or 404 will be raised. Will return an existing ContextExternalTool if one already exists.
   * @param courseId if course (required)
   * @param developerKeyId no description (required)
   * @param accountId  (optional)
   * @return ContextExternalTool
   */
  @RequestLine("POST /v1/courses/{courseId}/developer_keys/{developerKeyId}/create_tool")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContextExternalTool createToolFromToolconfigurationCourses(@Param("courseId") String courseId, @Param("developerKeyId") String developerKeyId, @Param("accountId") String accountId);
  
  /**
   * Delete an external tool
   * Remove the specified external tool
   * @param accountId ID (required)
   * @param externalToolId ID (required)
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/external_tools/{externalToolId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteExternalToolAccounts(@Param("accountId") String accountId, @Param("externalToolId") String externalToolId);
  
  /**
   * Delete an external tool
   * Remove the specified external tool
   * @param courseId ID (required)
   * @param externalToolId ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/external_tools/{externalToolId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteExternalToolCourses(@Param("courseId") String courseId, @Param("externalToolId") String externalToolId);
  
  /**
   * Edit an external tool
   * Update the specified external tool. Uses same parameters as create
   * @param accountId ID (required)
   * @param externalToolId ID (required)
   */
  @RequestLine("PUT /v1/accounts/{accountId}/external_tools/{externalToolId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void editExternalToolAccounts(@Param("accountId") String accountId, @Param("externalToolId") String externalToolId);
  
  /**
   * Edit an external tool
   * Update the specified external tool. Uses same parameters as create
   * @param courseId ID (required)
   * @param externalToolId ID (required)
   */
  @RequestLine("PUT /v1/courses/{courseId}/external_tools/{externalToolId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void editExternalToolCourses(@Param("courseId") String courseId, @Param("externalToolId") String externalToolId);
  
  /**
   * Get a sessionless launch url for an external tool.
   * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
   * @param accountId ID (required)
   * @param id The external id of the tool to launch. (optional)
   * @param url The LTI launch url for the external tool. (optional)
   * @param assignmentId The assignment id for an assignment launch. Required if launch_type is set to \&quot;assessment\&quot;. (optional)
   * @param moduleItemId The assignment id for a module item launch. Required if launch_type is set to \&quot;module_item\&quot;. (optional)
   * @param launchType The type of launch to perform on the external tool. Placement names (eg. \&quot;course_navigation\&quot;) can also be specified to use the custom launch url for that placement; if done, the tool id must be provided. (optional)
   */
  @RequestLine("GET /v1/accounts/{accountId}/external_tools/sessionless_launch?id={id}&url={url}&assignment_id={assignmentId}&module_item_id={moduleItemId}&launch_type={launchType}")
  @Headers({
      "Accept: */*",
  })
  void getSessionlessLaunchUrlForExternalToolAccounts(@Param("accountId") String accountId, @Param("id") String id, @Param("url") String url, @Param("assignmentId") String assignmentId, @Param("moduleItemId") String moduleItemId, @Param("launchType") String launchType);
  

  /**
   * Get a sessionless launch url for an external tool.
   * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
   * Note, this is equivalent to the other <code>getSessionlessLaunchUrlForExternalToolAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSessionlessLaunchUrlForExternalToolAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>id - The external id of the tool to launch. (optional)</li>
   *   <li>url - The LTI launch url for the external tool. (optional)</li>
   *   <li>assignmentId - The assignment id for an assignment launch. Required if launch_type is set to \&quot;assessment\&quot;. (optional)</li>
   *   <li>moduleItemId - The assignment id for a module item launch. Required if launch_type is set to \&quot;module_item\&quot;. (optional)</li>
   *   <li>launchType - The type of launch to perform on the external tool. Placement names (eg. \&quot;course_navigation\&quot;) can also be specified to use the custom launch url for that placement; if done, the tool id must be provided. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/accounts/{accountId}/external_tools/sessionless_launch?id={id}&url={url}&assignment_id={assignmentId}&module_item_id={moduleItemId}&launch_type={launchType}")
  @Headers({
      "Content-Type: */*",
  })
  void getSessionlessLaunchUrlForExternalToolAccounts(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSessionlessLaunchUrlForExternalToolAccounts</code> method in a fluent style.
   */
  public static class GetSessionlessLaunchUrlForExternalToolAccountsQueryParams extends HashMap<String, Object> {
    public GetSessionlessLaunchUrlForExternalToolAccountsQueryParams id(final String value) {
      put("id", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolAccountsQueryParams url(final String value) {
      put("url", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolAccountsQueryParams assignmentId(final String value) {
      put("assignment_id", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolAccountsQueryParams moduleItemId(final String value) {
      put("module_item_id", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolAccountsQueryParams launchType(final String value) {
      put("launch_type", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a sessionless launch url for an external tool.
   * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
   * @param courseId ID (required)
   * @param id The external id of the tool to launch. (optional)
   * @param url The LTI launch url for the external tool. (optional)
   * @param assignmentId The assignment id for an assignment launch. Required if launch_type is set to \&quot;assessment\&quot;. (optional)
   * @param moduleItemId The assignment id for a module item launch. Required if launch_type is set to \&quot;module_item\&quot;. (optional)
   * @param launchType The type of launch to perform on the external tool. Placement names (eg. \&quot;course_navigation\&quot;) can also be specified to use the custom launch url for that placement; if done, the tool id must be provided. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/external_tools/sessionless_launch?id={id}&url={url}&assignment_id={assignmentId}&module_item_id={moduleItemId}&launch_type={launchType}")
  @Headers({
      "Accept: */*",
  })
  void getSessionlessLaunchUrlForExternalToolCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("url") String url, @Param("assignmentId") String assignmentId, @Param("moduleItemId") String moduleItemId, @Param("launchType") String launchType);
  

  /**
   * Get a sessionless launch url for an external tool.
   * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
   * Note, this is equivalent to the other <code>getSessionlessLaunchUrlForExternalToolCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSessionlessLaunchUrlForExternalToolCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>id - The external id of the tool to launch. (optional)</li>
   *   <li>url - The LTI launch url for the external tool. (optional)</li>
   *   <li>assignmentId - The assignment id for an assignment launch. Required if launch_type is set to \&quot;assessment\&quot;. (optional)</li>
   *   <li>moduleItemId - The assignment id for a module item launch. Required if launch_type is set to \&quot;module_item\&quot;. (optional)</li>
   *   <li>launchType - The type of launch to perform on the external tool. Placement names (eg. \&quot;course_navigation\&quot;) can also be specified to use the custom launch url for that placement; if done, the tool id must be provided. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/external_tools/sessionless_launch?id={id}&url={url}&assignment_id={assignmentId}&module_item_id={moduleItemId}&launch_type={launchType}")
  @Headers({
      "Content-Type: */*",
  })
  void getSessionlessLaunchUrlForExternalToolCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSessionlessLaunchUrlForExternalToolCourses</code> method in a fluent style.
   */
  public static class GetSessionlessLaunchUrlForExternalToolCoursesQueryParams extends HashMap<String, Object> {
    public GetSessionlessLaunchUrlForExternalToolCoursesQueryParams id(final String value) {
      put("id", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolCoursesQueryParams url(final String value) {
      put("url", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolCoursesQueryParams assignmentId(final String value) {
      put("assignment_id", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolCoursesQueryParams moduleItemId(final String value) {
      put("module_item_id", EncodingUtils.encode(value));
      return this;
    }
    public GetSessionlessLaunchUrlForExternalToolCoursesQueryParams launchType(final String value) {
      put("launch_type", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get a single external tool
   * Returns the specified external tool.
   * @param accountId ID (required)
   * @param externalToolId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/external_tools/{externalToolId}")
  @Headers({
      "Accept: */*",
  })
  void getSingleExternalToolAccounts(@Param("accountId") String accountId, @Param("externalToolId") String externalToolId);
  
  /**
   * Get a single external tool
   * Returns the specified external tool.
   * @param courseId ID (required)
   * @param externalToolId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/external_tools/{externalToolId}")
  @Headers({
      "Accept: */*",
  })
  void getSingleExternalToolCourses(@Param("courseId") String courseId, @Param("externalToolId") String externalToolId);
  
  /**
   * List external tools
   * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
   * @param accountId ID (required)
   * @param searchTerm The partial name of the tools to match and return. (optional)
   * @param selectable If true, then only tools that are meant to be selectable are returned (optional)
   * @param includeParents If true, then include tools installed in all accounts above the current context (optional)
   */
  @RequestLine("GET /v1/accounts/{accountId}/external_tools?search_term={searchTerm}&selectable={selectable}&include_parents={includeParents}")
  @Headers({
      "Accept: */*",
  })
  void listExternalToolsAccounts(@Param("accountId") String accountId, @Param("searchTerm") String searchTerm, @Param("selectable") Boolean selectable, @Param("includeParents") Boolean includeParents);
  

  /**
   * List external tools
   * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
   * Note, this is equivalent to the other <code>listExternalToolsAccounts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListExternalToolsAccountsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name of the tools to match and return. (optional)</li>
   *   <li>selectable - If true, then only tools that are meant to be selectable are returned (optional)</li>
   *   <li>includeParents - If true, then include tools installed in all accounts above the current context (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/accounts/{accountId}/external_tools?search_term={searchTerm}&selectable={selectable}&include_parents={includeParents}")
  @Headers({
      "Content-Type: */*",
  })
  void listExternalToolsAccounts(@Param("accountId") String accountId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listExternalToolsAccounts</code> method in a fluent style.
   */
  public static class ListExternalToolsAccountsQueryParams extends HashMap<String, Object> {
    public ListExternalToolsAccountsQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListExternalToolsAccountsQueryParams selectable(final Boolean value) {
      put("selectable", EncodingUtils.encode(value));
      return this;
    }
    public ListExternalToolsAccountsQueryParams includeParents(final Boolean value) {
      put("include_parents", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List external tools
   * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
   * @param courseId ID (required)
   * @param searchTerm The partial name of the tools to match and return. (optional)
   * @param selectable If true, then only tools that are meant to be selectable are returned (optional)
   * @param includeParents If true, then include tools installed in all accounts above the current context (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/external_tools?search_term={searchTerm}&selectable={selectable}&include_parents={includeParents}")
  @Headers({
      "Accept: */*",
  })
  void listExternalToolsCourses(@Param("courseId") String courseId, @Param("searchTerm") String searchTerm, @Param("selectable") Boolean selectable, @Param("includeParents") Boolean includeParents);
  

  /**
   * List external tools
   * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
   * Note, this is equivalent to the other <code>listExternalToolsCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListExternalToolsCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name of the tools to match and return. (optional)</li>
   *   <li>selectable - If true, then only tools that are meant to be selectable are returned (optional)</li>
   *   <li>includeParents - If true, then include tools installed in all accounts above the current context (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/external_tools?search_term={searchTerm}&selectable={selectable}&include_parents={includeParents}")
  @Headers({
      "Content-Type: */*",
  })
  void listExternalToolsCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listExternalToolsCourses</code> method in a fluent style.
   */
  public static class ListExternalToolsCoursesQueryParams extends HashMap<String, Object> {
    public ListExternalToolsCoursesQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListExternalToolsCoursesQueryParams selectable(final Boolean value) {
      put("selectable", EncodingUtils.encode(value));
      return this;
    }
    public ListExternalToolsCoursesQueryParams includeParents(final Boolean value) {
      put("include_parents", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List external tools
   * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
   * @param groupId ID (required)
   * @param searchTerm The partial name of the tools to match and return. (optional)
   * @param selectable If true, then only tools that are meant to be selectable are returned (optional)
   * @param includeParents If true, then include tools installed in all accounts above the current context (optional)
   */
  @RequestLine("GET /v1/groups/{groupId}/external_tools?search_term={searchTerm}&selectable={selectable}&include_parents={includeParents}")
  @Headers({
      "Accept: */*",
  })
  void listExternalToolsGroups(@Param("groupId") String groupId, @Param("searchTerm") String searchTerm, @Param("selectable") Boolean selectable, @Param("includeParents") Boolean includeParents);
  

  /**
   * List external tools
   * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
   * Note, this is equivalent to the other <code>listExternalToolsGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListExternalToolsGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial name of the tools to match and return. (optional)</li>
   *   <li>selectable - If true, then only tools that are meant to be selectable are returned (optional)</li>
   *   <li>includeParents - If true, then include tools installed in all accounts above the current context (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/groups/{groupId}/external_tools?search_term={searchTerm}&selectable={selectable}&include_parents={includeParents}")
  @Headers({
      "Content-Type: */*",
  })
  void listExternalToolsGroups(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listExternalToolsGroups</code> method in a fluent style.
   */
  public static class ListExternalToolsGroupsQueryParams extends HashMap<String, Object> {
    public ListExternalToolsGroupsQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListExternalToolsGroupsQueryParams selectable(final Boolean value) {
      put("selectable", EncodingUtils.encode(value));
      return this;
    }
    public ListExternalToolsGroupsQueryParams includeParents(final Boolean value) {
      put("include_parents", EncodingUtils.encode(value));
      return this;
    }
  }
}
