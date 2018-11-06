package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Group;
import com.instructure.canvas.model.GroupMembership;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private GroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GroupsApi.class);
    }

    /**
     * Create a group
     *
     * Creates a new group. Groups created using the \&quot;/api/v1/groups/\&quot; endpoint will be community groups.
     */
    @Test
    public void createGroupGroupCategoriesTest() {
        String groupCategoryId = null;
        String name = null;
        String description = null;
        Boolean isPublic = null;
        String joinLevel = null;
        Integer storageQuotaMb = null;
        String sisGroupId = null;
        // Group response = api.createGroupGroupCategories(groupCategoryId, name, description, isPublic, joinLevel, storageQuotaMb, sisGroupId);

        // TODO: test validations
    }

    /**
     * Create a group
     *
     * Creates a new group. Groups created using the \&quot;/api/v1/groups/\&quot; endpoint will be community groups.
     */
    @Test
    public void createGroupGroupsTest() {
        String name = null;
        String description = null;
        Boolean isPublic = null;
        String joinLevel = null;
        Integer storageQuotaMb = null;
        String sisGroupId = null;
        // Group response = api.createGroupGroups(name, description, isPublic, joinLevel, storageQuotaMb, sisGroupId);

        // TODO: test validations
    }

    /**
     * Create a membership
     *
     * Join, or request to join, a group, depending on the join_level of the group.  If the membership or join request already exists, then it is simply returned
     */
    @Test
    public void createMembershipTest() {
        String groupId = null;
        String userId = null;
        // GroupMembership response = api.createMembership(groupId, userId);

        // TODO: test validations
    }

    /**
     * Delete a group
     *
     * Deletes a group and removes all members.
     */
    @Test
    public void deleteGroupTest() {
        String groupId = null;
        // Group response = api.deleteGroup(groupId);

        // TODO: test validations
    }

    /**
     * Edit a group
     *
     * Modifies an existing group.  Note that to set an avatar image for the group, you must first upload the image file to the group, and the use the id in the response as the argument to this function.  See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.
     */
    @Test
    public void editGroupTest() {
        String groupId = null;
        String name = null;
        String description = null;
        Boolean isPublic = null;
        String joinLevel = null;
        Integer avatarId = null;
        Integer storageQuotaMb = null;
        List<String> members = null;
        String sisGroupId = null;
        // Group response = api.editGroup(groupId, name, description, isPublic, joinLevel, avatarId, storageQuotaMb, members, sisGroupId);

        // TODO: test validations
    }

    /**
     * Get a single group
     *
     * Returns the data for a single group, or a 401 if the caller doesn&#x27;t have the rights to see it.
     */
    @Test
    public void getSingleGroupTest() {
        String groupId = null;
        List<String> include = null;
        // Group response = api.getSingleGroup(groupId, include);

        // TODO: test validations
    }

    /**
     * Get a single group
     *
     * Returns the data for a single group, or a 401 if the caller doesn&#x27;t have the rights to see it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleGroupTestQueryMap() {
        String groupId = null;
        GroupsApi.GetSingleGroupQueryParams queryParams = new GroupsApi.GetSingleGroupQueryParams()
            .include(null);
        // Group response = api.getSingleGroup(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single group membership
     *
     * Returns the group membership with the given membership id or user id.
     */
    @Test
    public void getSingleGroupMembershipMembershipsTest() {
        String groupId = null;
        String membershipId = null;
        // GroupMembership response = api.getSingleGroupMembershipMemberships(groupId, membershipId);

        // TODO: test validations
    }

    /**
     * Get a single group membership
     *
     * Returns the group membership with the given membership id or user id.
     */
    @Test
    public void getSingleGroupMembershipUsersTest() {
        String groupId = null;
        String userId = null;
        // GroupMembership response = api.getSingleGroupMembershipUsers(groupId, userId);

        // TODO: test validations
    }

    /**
     * Group activity stream
     *
     * Returns the current user&#x27;s group-specific activity stream, paginated.  For full documentation, see the API documentation for the user activity stream, in the user api.
     */
    @Test
    public void groupActivityStreamTest() {
        String groupId = null;
        // api.groupActivityStream(groupId);

        // TODO: test validations
    }

    /**
     * Group activity stream summary
     *
     * Returns a summary of the current user&#x27;s group-specific activity stream.  For full documentation, see the API documentation for the user activity stream summary, in the user api.
     */
    @Test
    public void groupActivityStreamSummaryTest() {
        String groupId = null;
        // api.groupActivityStreamSummary(groupId);

        // TODO: test validations
    }

    /**
     * Invite others to a group
     *
     * Sends an invitation to all supplied email addresses which will allow the receivers to join the group.
     */
    @Test
    public void inviteOthersToGroupTest() {
        String groupId = null;
        List<String> invitees = null;
        // api.inviteOthersToGroup(groupId, invitees);

        // TODO: test validations
    }

    /**
     * Leave a group
     *
     * Leave a group if you are allowed to leave (some groups, such as sets of course groups created by teachers, cannot be left). You may also use &#x27;self&#x27; in place of a membership_id.
     */
    @Test
    public void leaveGroupMembershipsTest() {
        String groupId = null;
        String membershipId = null;
        // api.leaveGroupMemberships(groupId, membershipId);

        // TODO: test validations
    }

    /**
     * Leave a group
     *
     * Leave a group if you are allowed to leave (some groups, such as sets of course groups created by teachers, cannot be left). You may also use &#x27;self&#x27; in place of a membership_id.
     */
    @Test
    public void leaveGroupUsersTest() {
        String groupId = null;
        String userId = null;
        // api.leaveGroupUsers(groupId, userId);

        // TODO: test validations
    }

    /**
     * List group memberships
     *
     * A paginated list of the members of a group.
     */
    @Test
    public void listGroupMembershipsTest() {
        String groupId = null;
        List<String> filterStates = null;
        // List<GroupMembership> response = api.listGroupMemberships(groupId, filterStates);

        // TODO: test validations
    }

    /**
     * List group memberships
     *
     * A paginated list of the members of a group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listGroupMembershipsTestQueryMap() {
        String groupId = null;
        GroupsApi.ListGroupMembershipsQueryParams queryParams = new GroupsApi.ListGroupMembershipsQueryParams()
            .filterStates(null);
        // List<GroupMembership> response = api.listGroupMemberships(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * List group&#x27;s users
     *
     * Returns a paginated list of users in the group.
     */
    @Test
    public void listGroupSUsersTest() {
        String groupId = null;
        String searchTerm = null;
        List<String> include = null;
        // List<User> response = api.listGroupSUsers(groupId, searchTerm, include);

        // TODO: test validations
    }

    /**
     * List group&#x27;s users
     *
     * Returns a paginated list of users in the group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listGroupSUsersTestQueryMap() {
        String groupId = null;
        GroupsApi.ListGroupSUsersQueryParams queryParams = new GroupsApi.ListGroupSUsersQueryParams()
            .searchTerm(null)
            .include(null);
        // List<User> response = api.listGroupSUsers(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * List the groups available in a context.
     *
     * Returns the paginated list of active groups in the given context that are visible to user.
     */
    @Test
    public void listGroupsAvailableInContextAccountsTest() {
        String accountId = null;
        Boolean onlyOwnGroups = null;
        List<String> include = null;
        // List<Group> response = api.listGroupsAvailableInContextAccounts(accountId, onlyOwnGroups, include);

        // TODO: test validations
    }

    /**
     * List the groups available in a context.
     *
     * Returns the paginated list of active groups in the given context that are visible to user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listGroupsAvailableInContextAccountsTestQueryMap() {
        String accountId = null;
        GroupsApi.ListGroupsAvailableInContextAccountsQueryParams queryParams = new GroupsApi.ListGroupsAvailableInContextAccountsQueryParams()
            .onlyOwnGroups(null)
            .include(null);
        // List<Group> response = api.listGroupsAvailableInContextAccounts(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * List the groups available in a context.
     *
     * Returns the paginated list of active groups in the given context that are visible to user.
     */
    @Test
    public void listGroupsAvailableInContextCoursesTest() {
        String courseId = null;
        Boolean onlyOwnGroups = null;
        List<String> include = null;
        // List<Group> response = api.listGroupsAvailableInContextCourses(courseId, onlyOwnGroups, include);

        // TODO: test validations
    }

    /**
     * List the groups available in a context.
     *
     * Returns the paginated list of active groups in the given context that are visible to user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listGroupsAvailableInContextCoursesTestQueryMap() {
        String courseId = null;
        GroupsApi.ListGroupsAvailableInContextCoursesQueryParams queryParams = new GroupsApi.ListGroupsAvailableInContextCoursesQueryParams()
            .onlyOwnGroups(null)
            .include(null);
        // List<Group> response = api.listGroupsAvailableInContextCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List your groups
     *
     * Returns a paginated list of active groups for the current user.
     */
    @Test
    public void listYourGroupsTest() {
        String contextType = null;
        List<String> include = null;
        // List<Group> response = api.listYourGroups(contextType, include);

        // TODO: test validations
    }

    /**
     * List your groups
     *
     * Returns a paginated list of active groups for the current user.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listYourGroupsTestQueryMap() {
        GroupsApi.ListYourGroupsQueryParams queryParams = new GroupsApi.ListYourGroupsQueryParams()
            .contextType(null)
            .include(null);
        // List<Group> response = api.listYourGroups(queryParams);

    // TODO: test validations
    }
    /**
     * Permissions
     *
     * Returns permission information for the calling user in the given group. See also the {api:AccountsController#permissions Account} and {api:CoursesController#permissions Course} counterparts.
     */
    @Test
    public void permissionsTest() {
        String groupId = null;
        List<String> permissions = null;
        // api.permissions(groupId, permissions);

        // TODO: test validations
    }

    /**
     * Permissions
     *
     * Returns permission information for the calling user in the given group. See also the {api:AccountsController#permissions Account} and {api:CoursesController#permissions Course} counterparts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void permissionsTestQueryMap() {
        String groupId = null;
        GroupsApi.PermissionsQueryParams queryParams = new GroupsApi.PermissionsQueryParams()
            .permissions(null);
        // api.permissions(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * Preview processed html
     *
     * Preview html content processed for this group
     */
    @Test
    public void previewProcessedHtmlTest() {
        String groupId = null;
        String html = null;
        // api.previewProcessedHtml(groupId, html);

        // TODO: test validations
    }

    /**
     * Update a membership
     *
     * Accept a membership request, or add/remove moderator rights.
     */
    @Test
    public void updateMembershipMembershipsTest() {
        String groupId = null;
        String membershipId = null;
        String workflowState = null;
        String moderator = null;
        // GroupMembership response = api.updateMembershipMemberships(groupId, membershipId, workflowState, moderator);

        // TODO: test validations
    }

    /**
     * Update a membership
     *
     * Accept a membership request, or add/remove moderator rights.
     */
    @Test
    public void updateMembershipUsersTest() {
        String groupId = null;
        String userId = null;
        String workflowState = null;
        String moderator = null;
        // GroupMembership response = api.updateMembershipUsers(groupId, userId, workflowState, moderator);

        // TODO: test validations
    }

    /**
     * Upload a file
     *
     * Upload a file to the group.  This API endpoint is the first step in uploading a file to a group. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  Only those with the \&quot;Manage Files\&quot; permission on a group can upload files to the group. By default, this is anybody participating in the group, or any admin over the group.
     */
    @Test
    public void uploadFileTest() {
        String groupId = null;
        // api.uploadFile(groupId);

        // TODO: test validations
    }

}
