package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.GroupCategory;
import com.instructure.canvas.model.GroupMembership;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupCategoriesApi
 */
public class GroupCategoriesApiTest {

    private GroupCategoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GroupCategoriesApi.class);
    }

    /**
     * Assign unassigned members
     *
     * Assign all unassigned members as evenly as possible among the existing student groups.
     */
    @Test
    public void assignUnassignedMembersTest() {
        String groupCategoryId = null;
        Boolean sync = null;
        // GroupMembership response = api.assignUnassignedMembers(groupCategoryId, sync);

        // TODO: test validations
    }

    /**
     * Create a Group Category
     *
     * Create a new group category
     */
    @Test
    public void createGroupCategoryAccountsTest() {
        String accountId = null;
        String name = null;
        String selfSignup = null;
        String autoLeader = null;
        Integer groupLimit = null;
        String sisGroupCategoryId = null;
        Integer createGroupCount = null;
        String splitGroupCount = null;
        // GroupCategory response = api.createGroupCategoryAccounts(accountId, name, selfSignup, autoLeader, groupLimit, sisGroupCategoryId, createGroupCount, splitGroupCount);

        // TODO: test validations
    }

    /**
     * Create a Group Category
     *
     * Create a new group category
     */
    @Test
    public void createGroupCategoryCoursesTest() {
        String courseId = null;
        String name = null;
        String selfSignup = null;
        String autoLeader = null;
        Integer groupLimit = null;
        String sisGroupCategoryId = null;
        Integer createGroupCount = null;
        String splitGroupCount = null;
        // GroupCategory response = api.createGroupCategoryCourses(courseId, name, selfSignup, autoLeader, groupLimit, sisGroupCategoryId, createGroupCount, splitGroupCount);

        // TODO: test validations
    }

    /**
     * Delete a Group Category
     *
     * Deletes a group category and all groups under it. Protected group categories can not be deleted, i.e. \&quot;communities\&quot; and \&quot;student_organized\&quot;.
     */
    @Test
    public void deleteGroupCategoryTest() {
        String groupCategoryId = null;
        // api.deleteGroupCategory(groupCategoryId);

        // TODO: test validations
    }

    /**
     * Get a single group category
     *
     * Returns the data for a single group category, or a 401 if the caller doesn&#x27;t have the rights to see it.
     */
    @Test
    public void getSingleGroupCategoryTest() {
        String groupCategoryId = null;
        // GroupCategory response = api.getSingleGroupCategory(groupCategoryId);

        // TODO: test validations
    }

    /**
     * List group categories for a context
     *
     * Returns a paginated list of group categories in a context
     */
    @Test
    public void listGroupCategoriesForContextAccountsTest() {
        String accountId = null;
        // List<GroupCategory> response = api.listGroupCategoriesForContextAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List group categories for a context
     *
     * Returns a paginated list of group categories in a context
     */
    @Test
    public void listGroupCategoriesForContextCoursesTest() {
        String courseId = null;
        // List<GroupCategory> response = api.listGroupCategoriesForContextCourses(courseId);

        // TODO: test validations
    }

    /**
     * List users in group category
     *
     * Returns a paginated list of users in the group category.
     */
    @Test
    public void listUsersInGroupCategoryTest() {
        String groupCategoryId = null;
        String searchTerm = null;
        Boolean unassigned = null;
        // List<User> response = api.listUsersInGroupCategory(groupCategoryId, searchTerm, unassigned);

        // TODO: test validations
    }

    /**
     * List users in group category
     *
     * Returns a paginated list of users in the group category.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUsersInGroupCategoryTestQueryMap() {
        String groupCategoryId = null;
        GroupCategoriesApi.ListUsersInGroupCategoryQueryParams queryParams = new GroupCategoriesApi.ListUsersInGroupCategoryQueryParams()
            .searchTerm(null)
            .unassigned(null);
        // List<User> response = api.listUsersInGroupCategory(groupCategoryId, queryParams);

    // TODO: test validations
    }
    /**
     * Update a Group Category
     *
     * Modifies an existing group category.
     */
    @Test
    public void updateGroupCategoryTest() {
        String groupCategoryId = null;
        String name = null;
        String selfSignup = null;
        String autoLeader = null;
        Integer groupLimit = null;
        String sisGroupCategoryId = null;
        Integer createGroupCount = null;
        String splitGroupCount = null;
        // GroupCategory response = api.updateGroupCategory(groupCategoryId, name, selfSignup, autoLeader, groupLimit, sisGroupCategoryId, createGroupCount, splitGroupCount);

        // TODO: test validations
    }

}
