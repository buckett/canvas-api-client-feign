package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.ContextExternalTool;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalToolsApi
 */
public class ExternalToolsApiTest {

    private ExternalToolsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ExternalToolsApi.class);
    }

    /**
     * Create an external tool
     *
     * Create an external tool in the specified course/account. The created tool will be returned, see the \&quot;show\&quot; endpoint for an example.
     */
    @Test
    public void createExternalToolAccountsTest() {
        String accountId = null;
        String name = null;
        String privacyLevel = null;
        String consumerKey = null;
        String sharedSecret = null;
        String description = null;
        String url = null;
        String domain = null;
        String iconUrl = null;
        String text = null;
        String customFieldsFieldName = null;
        String accountNavigationUrl = null;
        Boolean accountNavigationEnabled = null;
        String accountNavigationText = null;
        String accountNavigationSelectionWidth = null;
        String accountNavigationSelectionHeight = null;
        String accountNavigationDisplayType = null;
        String userNavigationUrl = null;
        Boolean userNavigationEnabled = null;
        String userNavigationText = null;
        String userNavigationVisibility = null;
        String courseHomeSubNavigationUrl = null;
        Boolean courseHomeSubNavigationEnabled = null;
        String courseHomeSubNavigationText = null;
        String courseHomeSubNavigationIconUrl = null;
        Boolean courseNavigationEnabled = null;
        String courseNavigationText = null;
        String courseNavigationVisibility = null;
        String courseNavigationWindowTarget = null;
        Boolean courseNavigationDefault = null;
        String courseNavigationDisplayType = null;
        String editorButtonUrl = null;
        Boolean editorButtonEnabled = null;
        String editorButtonIconUrl = null;
        String editorButtonSelectionWidth = null;
        String editorButtonSelectionHeight = null;
        String editorButtonMessageType = null;
        String homeworkSubmissionUrl = null;
        Boolean homeworkSubmissionEnabled = null;
        String homeworkSubmissionText = null;
        String homeworkSubmissionMessageType = null;
        String linkSelectionUrl = null;
        Boolean linkSelectionEnabled = null;
        String linkSelectionText = null;
        String linkSelectionMessageType = null;
        String migrationSelectionUrl = null;
        Boolean migrationSelectionEnabled = null;
        String migrationSelectionMessageType = null;
        String toolConfigurationUrl = null;
        Boolean toolConfigurationEnabled = null;
        String toolConfigurationMessageType = null;
        Boolean toolConfigurationPreferSisEmail = null;
        String resourceSelectionUrl = null;
        Boolean resourceSelectionEnabled = null;
        String resourceSelectionIconUrl = null;
        String resourceSelectionSelectionWidth = null;
        String resourceSelectionSelectionHeight = null;
        String configType = null;
        String configXml = null;
        String configUrl = null;
        Boolean notSelectable = null;
        Boolean oauthCompliant = null;
        // api.createExternalToolAccounts(accountId, name, privacyLevel, consumerKey, sharedSecret, description, url, domain, iconUrl, text, customFieldsFieldName, accountNavigationUrl, accountNavigationEnabled, accountNavigationText, accountNavigationSelectionWidth, accountNavigationSelectionHeight, accountNavigationDisplayType, userNavigationUrl, userNavigationEnabled, userNavigationText, userNavigationVisibility, courseHomeSubNavigationUrl, courseHomeSubNavigationEnabled, courseHomeSubNavigationText, courseHomeSubNavigationIconUrl, courseNavigationEnabled, courseNavigationText, courseNavigationVisibility, courseNavigationWindowTarget, courseNavigationDefault, courseNavigationDisplayType, editorButtonUrl, editorButtonEnabled, editorButtonIconUrl, editorButtonSelectionWidth, editorButtonSelectionHeight, editorButtonMessageType, homeworkSubmissionUrl, homeworkSubmissionEnabled, homeworkSubmissionText, homeworkSubmissionMessageType, linkSelectionUrl, linkSelectionEnabled, linkSelectionText, linkSelectionMessageType, migrationSelectionUrl, migrationSelectionEnabled, migrationSelectionMessageType, toolConfigurationUrl, toolConfigurationEnabled, toolConfigurationMessageType, toolConfigurationPreferSisEmail, resourceSelectionUrl, resourceSelectionEnabled, resourceSelectionIconUrl, resourceSelectionSelectionWidth, resourceSelectionSelectionHeight, configType, configXml, configUrl, notSelectable, oauthCompliant);

        // TODO: test validations
    }

    /**
     * Create an external tool
     *
     * Create an external tool in the specified course/account. The created tool will be returned, see the \&quot;show\&quot; endpoint for an example.
     */
    @Test
    public void createExternalToolCoursesTest() {
        String courseId = null;
        String name = null;
        String privacyLevel = null;
        String consumerKey = null;
        String sharedSecret = null;
        String description = null;
        String url = null;
        String domain = null;
        String iconUrl = null;
        String text = null;
        String customFieldsFieldName = null;
        String accountNavigationUrl = null;
        Boolean accountNavigationEnabled = null;
        String accountNavigationText = null;
        String accountNavigationSelectionWidth = null;
        String accountNavigationSelectionHeight = null;
        String accountNavigationDisplayType = null;
        String userNavigationUrl = null;
        Boolean userNavigationEnabled = null;
        String userNavigationText = null;
        String userNavigationVisibility = null;
        String courseHomeSubNavigationUrl = null;
        Boolean courseHomeSubNavigationEnabled = null;
        String courseHomeSubNavigationText = null;
        String courseHomeSubNavigationIconUrl = null;
        Boolean courseNavigationEnabled = null;
        String courseNavigationText = null;
        String courseNavigationVisibility = null;
        String courseNavigationWindowTarget = null;
        Boolean courseNavigationDefault = null;
        String courseNavigationDisplayType = null;
        String editorButtonUrl = null;
        Boolean editorButtonEnabled = null;
        String editorButtonIconUrl = null;
        String editorButtonSelectionWidth = null;
        String editorButtonSelectionHeight = null;
        String editorButtonMessageType = null;
        String homeworkSubmissionUrl = null;
        Boolean homeworkSubmissionEnabled = null;
        String homeworkSubmissionText = null;
        String homeworkSubmissionMessageType = null;
        String linkSelectionUrl = null;
        Boolean linkSelectionEnabled = null;
        String linkSelectionText = null;
        String linkSelectionMessageType = null;
        String migrationSelectionUrl = null;
        Boolean migrationSelectionEnabled = null;
        String migrationSelectionMessageType = null;
        String toolConfigurationUrl = null;
        Boolean toolConfigurationEnabled = null;
        String toolConfigurationMessageType = null;
        Boolean toolConfigurationPreferSisEmail = null;
        String resourceSelectionUrl = null;
        Boolean resourceSelectionEnabled = null;
        String resourceSelectionIconUrl = null;
        String resourceSelectionSelectionWidth = null;
        String resourceSelectionSelectionHeight = null;
        String configType = null;
        String configXml = null;
        String configUrl = null;
        Boolean notSelectable = null;
        Boolean oauthCompliant = null;
        // api.createExternalToolCourses(courseId, name, privacyLevel, consumerKey, sharedSecret, description, url, domain, iconUrl, text, customFieldsFieldName, accountNavigationUrl, accountNavigationEnabled, accountNavigationText, accountNavigationSelectionWidth, accountNavigationSelectionHeight, accountNavigationDisplayType, userNavigationUrl, userNavigationEnabled, userNavigationText, userNavigationVisibility, courseHomeSubNavigationUrl, courseHomeSubNavigationEnabled, courseHomeSubNavigationText, courseHomeSubNavigationIconUrl, courseNavigationEnabled, courseNavigationText, courseNavigationVisibility, courseNavigationWindowTarget, courseNavigationDefault, courseNavigationDisplayType, editorButtonUrl, editorButtonEnabled, editorButtonIconUrl, editorButtonSelectionWidth, editorButtonSelectionHeight, editorButtonMessageType, homeworkSubmissionUrl, homeworkSubmissionEnabled, homeworkSubmissionText, homeworkSubmissionMessageType, linkSelectionUrl, linkSelectionEnabled, linkSelectionText, linkSelectionMessageType, migrationSelectionUrl, migrationSelectionEnabled, migrationSelectionMessageType, toolConfigurationUrl, toolConfigurationEnabled, toolConfigurationMessageType, toolConfigurationPreferSisEmail, resourceSelectionUrl, resourceSelectionEnabled, resourceSelectionIconUrl, resourceSelectionSelectionWidth, resourceSelectionSelectionHeight, configType, configXml, configUrl, notSelectable, oauthCompliant);

        // TODO: test validations
    }

    /**
     * Create Tool from ToolConfiguration
     *
     * Creates context_external_tool from attached tool_configuration of the provided developer_key if not already present in context. DeveloperKey must have a ToolConfiguration to create tool or 404 will be raised. Will return an existing ContextExternalTool if one already exists.
     */
    @Test
    public void createToolFromToolconfigurationAccountsTest() {
        String accountId = null;
        String developerKeyId = null;
        String courseId = null;
        // ContextExternalTool response = api.createToolFromToolconfigurationAccounts(accountId, developerKeyId, courseId);

        // TODO: test validations
    }

    /**
     * Create Tool from ToolConfiguration
     *
     * Creates context_external_tool from attached tool_configuration of the provided developer_key if not already present in context. DeveloperKey must have a ToolConfiguration to create tool or 404 will be raised. Will return an existing ContextExternalTool if one already exists.
     */
    @Test
    public void createToolFromToolconfigurationCoursesTest() {
        String courseId = null;
        String developerKeyId = null;
        String accountId = null;
        // ContextExternalTool response = api.createToolFromToolconfigurationCourses(courseId, developerKeyId, accountId);

        // TODO: test validations
    }

    /**
     * Delete an external tool
     *
     * Remove the specified external tool
     */
    @Test
    public void deleteExternalToolAccountsTest() {
        String accountId = null;
        String externalToolId = null;
        // api.deleteExternalToolAccounts(accountId, externalToolId);

        // TODO: test validations
    }

    /**
     * Delete an external tool
     *
     * Remove the specified external tool
     */
    @Test
    public void deleteExternalToolCoursesTest() {
        String courseId = null;
        String externalToolId = null;
        // api.deleteExternalToolCourses(courseId, externalToolId);

        // TODO: test validations
    }

    /**
     * Edit an external tool
     *
     * Update the specified external tool. Uses same parameters as create
     */
    @Test
    public void editExternalToolAccountsTest() {
        String accountId = null;
        String externalToolId = null;
        // api.editExternalToolAccounts(accountId, externalToolId);

        // TODO: test validations
    }

    /**
     * Edit an external tool
     *
     * Update the specified external tool. Uses same parameters as create
     */
    @Test
    public void editExternalToolCoursesTest() {
        String courseId = null;
        String externalToolId = null;
        // api.editExternalToolCourses(courseId, externalToolId);

        // TODO: test validations
    }

    /**
     * Get a sessionless launch url for an external tool.
     *
     * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
     */
    @Test
    public void getSessionlessLaunchUrlForExternalToolAccountsTest() {
        String accountId = null;
        String id = null;
        String url = null;
        String assignmentId = null;
        String moduleItemId = null;
        String launchType = null;
        // api.getSessionlessLaunchUrlForExternalToolAccounts(accountId, id, url, assignmentId, moduleItemId, launchType);

        // TODO: test validations
    }

    /**
     * Get a sessionless launch url for an external tool.
     *
     * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSessionlessLaunchUrlForExternalToolAccountsTestQueryMap() {
        String accountId = null;
        ExternalToolsApi.GetSessionlessLaunchUrlForExternalToolAccountsQueryParams queryParams = new ExternalToolsApi.GetSessionlessLaunchUrlForExternalToolAccountsQueryParams()
            .id(null)
            .url(null)
            .assignmentId(null)
            .moduleItemId(null)
            .launchType(null);
        // api.getSessionlessLaunchUrlForExternalToolAccounts(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a sessionless launch url for an external tool.
     *
     * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
     */
    @Test
    public void getSessionlessLaunchUrlForExternalToolCoursesTest() {
        String courseId = null;
        String id = null;
        String url = null;
        String assignmentId = null;
        String moduleItemId = null;
        String launchType = null;
        // api.getSessionlessLaunchUrlForExternalToolCourses(courseId, id, url, assignmentId, moduleItemId, launchType);

        // TODO: test validations
    }

    /**
     * Get a sessionless launch url for an external tool.
     *
     * Returns a sessionless launch url for an external tool.  NOTE: Either the id or url must be provided unless launch_type is assessment or module_item.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSessionlessLaunchUrlForExternalToolCoursesTestQueryMap() {
        String courseId = null;
        ExternalToolsApi.GetSessionlessLaunchUrlForExternalToolCoursesQueryParams queryParams = new ExternalToolsApi.GetSessionlessLaunchUrlForExternalToolCoursesQueryParams()
            .id(null)
            .url(null)
            .assignmentId(null)
            .moduleItemId(null)
            .launchType(null);
        // api.getSessionlessLaunchUrlForExternalToolCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single external tool
     *
     * Returns the specified external tool.
     */
    @Test
    public void getSingleExternalToolAccountsTest() {
        String accountId = null;
        String externalToolId = null;
        // api.getSingleExternalToolAccounts(accountId, externalToolId);

        // TODO: test validations
    }

    /**
     * Get a single external tool
     *
     * Returns the specified external tool.
     */
    @Test
    public void getSingleExternalToolCoursesTest() {
        String courseId = null;
        String externalToolId = null;
        // api.getSingleExternalToolCourses(courseId, externalToolId);

        // TODO: test validations
    }

    /**
     * List external tools
     *
     * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
     */
    @Test
    public void listExternalToolsAccountsTest() {
        String accountId = null;
        String searchTerm = null;
        Boolean selectable = null;
        Boolean includeParents = null;
        // api.listExternalToolsAccounts(accountId, searchTerm, selectable, includeParents);

        // TODO: test validations
    }

    /**
     * List external tools
     *
     * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listExternalToolsAccountsTestQueryMap() {
        String accountId = null;
        ExternalToolsApi.ListExternalToolsAccountsQueryParams queryParams = new ExternalToolsApi.ListExternalToolsAccountsQueryParams()
            .searchTerm(null)
            .selectable(null)
            .includeParents(null);
        // api.listExternalToolsAccounts(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * List external tools
     *
     * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
     */
    @Test
    public void listExternalToolsCoursesTest() {
        String courseId = null;
        String searchTerm = null;
        Boolean selectable = null;
        Boolean includeParents = null;
        // api.listExternalToolsCourses(courseId, searchTerm, selectable, includeParents);

        // TODO: test validations
    }

    /**
     * List external tools
     *
     * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listExternalToolsCoursesTestQueryMap() {
        String courseId = null;
        ExternalToolsApi.ListExternalToolsCoursesQueryParams queryParams = new ExternalToolsApi.ListExternalToolsCoursesQueryParams()
            .searchTerm(null)
            .selectable(null)
            .includeParents(null);
        // api.listExternalToolsCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List external tools
     *
     * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
     */
    @Test
    public void listExternalToolsGroupsTest() {
        String groupId = null;
        String searchTerm = null;
        Boolean selectable = null;
        Boolean includeParents = null;
        // api.listExternalToolsGroups(groupId, searchTerm, selectable, includeParents);

        // TODO: test validations
    }

    /**
     * List external tools
     *
     * Returns the paginated list of external tools for the current context. See the get request docs for a single tool for a list of properties on an external tool.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listExternalToolsGroupsTestQueryMap() {
        String groupId = null;
        ExternalToolsApi.ListExternalToolsGroupsQueryParams queryParams = new ExternalToolsApi.ListExternalToolsGroupsQueryParams()
            .searchTerm(null)
            .selectable(null)
            .includeParents(null);
        // api.listExternalToolsGroups(groupId, queryParams);

    // TODO: test validations
    }
}
