package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.OutcomeGroup;
import com.instructure.canvas.model.OutcomeLink;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutcomeGroupsApi
 */
public class OutcomeGroupsApiTest {

    private OutcomeGroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OutcomeGroupsApi.class);
    }

    /**
     * Create/link an outcome
     *
     * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
     */
    @Test
    public void createLinkOutcomeAccountsTest() {
        String accountId = null;
        String id = null;
        Integer outcomeId = null;
        Integer moveFrom = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // OutcomeLink response = api.createLinkOutcomeAccounts(accountId, id, outcomeId, moveFrom, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

    /**
     * Create/link an outcome
     *
     * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
     */
    @Test
    public void createLinkOutcomeAccountsOutcomeIdTest() {
        String accountId = null;
        String id = null;
        Integer outcomeId = null;
        Integer moveFrom = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // OutcomeLink response = api.createLinkOutcomeAccountsOutcomeId(accountId, id, outcomeId, moveFrom, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

    /**
     * Create/link an outcome
     *
     * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
     */
    @Test
    public void createLinkOutcomeCoursesTest() {
        String courseId = null;
        String id = null;
        Integer outcomeId = null;
        Integer moveFrom = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // OutcomeLink response = api.createLinkOutcomeCourses(courseId, id, outcomeId, moveFrom, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

    /**
     * Create/link an outcome
     *
     * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
     */
    @Test
    public void createLinkOutcomeCoursesOutcomeIdTest() {
        String courseId = null;
        String id = null;
        Integer outcomeId = null;
        Integer moveFrom = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // OutcomeLink response = api.createLinkOutcomeCoursesOutcomeId(courseId, id, outcomeId, moveFrom, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

    /**
     * Create/link an outcome
     *
     * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
     */
    @Test
    public void createLinkOutcomeGlobalTest() {
        String id = null;
        Integer outcomeId = null;
        Integer moveFrom = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // OutcomeLink response = api.createLinkOutcomeGlobal(id, outcomeId, moveFrom, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

    /**
     * Create/link an outcome
     *
     * Link an outcome into the outcome group. The outcome to link can either be specified by a PUT to the link URL for a specific outcome (the outcome_id in the PUT URLs) or by supplying the information for a new outcome (title, description, ratings, mastery_points) in a POST to the collection.  If linking an existing outcome, the outcome_id must identify an outcome available to this context; i.e. an outcome owned by this group&#x27;s context, an outcome owned by an associated account, or a global outcome. With outcome_id present, any other parameters (except move_from) are ignored.  If defining a new outcome, the outcome is created in the outcome group&#x27;s context using the provided title, description, ratings, and mastery points; the title is required but all other fields are optional. The new outcome is then linked into the outcome group.  If ratings are provided when creating a new outcome, an embedded rubric criterion is included in the new outcome. This criterion&#x27;s mastery_points default to the maximum points in the highest rating if not specified in the mastery_points parameter. Any ratings lacking a description are given a default of \&quot;No description\&quot;. Any ratings lacking a point value are given a default of 0. If no ratings are provided, the mastery_points parameter is ignored.
     */
    @Test
    public void createLinkOutcomeGlobalOutcomeIdTest() {
        String id = null;
        Integer outcomeId = null;
        Integer moveFrom = null;
        String title = null;
        String displayName = null;
        String description = null;
        String vendorGuid = null;
        Integer masteryPoints = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        String calculationMethod = null;
        Integer calculationInt = null;
        // OutcomeLink response = api.createLinkOutcomeGlobalOutcomeId(id, outcomeId, moveFrom, title, displayName, description, vendorGuid, masteryPoints, ratingsDescription, ratingsPoints, calculationMethod, calculationInt);

        // TODO: test validations
    }

    /**
     * Create a subgroup
     *
     * Creates a new empty subgroup under the outcome group with the given title and description.
     */
    @Test
    public void createSubgroupAccountsTest() {
        String accountId = null;
        String id = null;
        String title = null;
        String description = null;
        String vendorGuid = null;
        // OutcomeGroup response = api.createSubgroupAccounts(accountId, id, title, description, vendorGuid);

        // TODO: test validations
    }

    /**
     * Create a subgroup
     *
     * Creates a new empty subgroup under the outcome group with the given title and description.
     */
    @Test
    public void createSubgroupCoursesTest() {
        String courseId = null;
        String id = null;
        String title = null;
        String description = null;
        String vendorGuid = null;
        // OutcomeGroup response = api.createSubgroupCourses(courseId, id, title, description, vendorGuid);

        // TODO: test validations
    }

    /**
     * Create a subgroup
     *
     * Creates a new empty subgroup under the outcome group with the given title and description.
     */
    @Test
    public void createSubgroupGlobalTest() {
        String id = null;
        String title = null;
        String description = null;
        String vendorGuid = null;
        // OutcomeGroup response = api.createSubgroupGlobal(id, title, description, vendorGuid);

        // TODO: test validations
    }

    /**
     * Delete an outcome group
     *
     * Deleting an outcome group deletes descendant outcome groups and outcome links. The linked outcomes themselves are only deleted if all links to the outcome were deleted.  Aligned outcomes cannot be deleted; as such, if all remaining links to an aligned outcome are included in this group&#x27;s descendants, the group deletion will fail.
     */
    @Test
    public void deleteOutcomeGroupAccountsTest() {
        String accountId = null;
        String id = null;
        // OutcomeGroup response = api.deleteOutcomeGroupAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * Delete an outcome group
     *
     * Deleting an outcome group deletes descendant outcome groups and outcome links. The linked outcomes themselves are only deleted if all links to the outcome were deleted.  Aligned outcomes cannot be deleted; as such, if all remaining links to an aligned outcome are included in this group&#x27;s descendants, the group deletion will fail.
     */
    @Test
    public void deleteOutcomeGroupCoursesTest() {
        String courseId = null;
        String id = null;
        // OutcomeGroup response = api.deleteOutcomeGroupCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Delete an outcome group
     *
     * Deleting an outcome group deletes descendant outcome groups and outcome links. The linked outcomes themselves are only deleted if all links to the outcome were deleted.  Aligned outcomes cannot be deleted; as such, if all remaining links to an aligned outcome are included in this group&#x27;s descendants, the group deletion will fail.
     */
    @Test
    public void deleteOutcomeGroupGlobalTest() {
        String id = null;
        // OutcomeGroup response = api.deleteOutcomeGroupGlobal(id);

        // TODO: test validations
    }

    /**
     * Get all outcome groups for context
     *
     * 
     */
    @Test
    public void getAllOutcomeGroupsForContextAccountsTest() {
        String accountId = null;
        // List<OutcomeGroup> response = api.getAllOutcomeGroupsForContextAccounts(accountId);

        // TODO: test validations
    }

    /**
     * Get all outcome groups for context
     *
     * 
     */
    @Test
    public void getAllOutcomeGroupsForContextCoursesTest() {
        String courseId = null;
        // List<OutcomeGroup> response = api.getAllOutcomeGroupsForContextCourses(courseId);

        // TODO: test validations
    }

    /**
     * Get all outcome links for context
     *
     * 
     */
    @Test
    public void getAllOutcomeLinksForContextAccountsTest() {
        String accountId = null;
        String outcomeStyle = null;
        String outcomeGroupStyle = null;
        // List<OutcomeLink> response = api.getAllOutcomeLinksForContextAccounts(accountId, outcomeStyle, outcomeGroupStyle);

        // TODO: test validations
    }

    /**
     * Get all outcome links for context
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllOutcomeLinksForContextAccountsTestQueryMap() {
        String accountId = null;
        OutcomeGroupsApi.GetAllOutcomeLinksForContextAccountsQueryParams queryParams = new OutcomeGroupsApi.GetAllOutcomeLinksForContextAccountsQueryParams()
            .outcomeStyle(null)
            .outcomeGroupStyle(null);
        // List<OutcomeLink> response = api.getAllOutcomeLinksForContextAccounts(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Get all outcome links for context
     *
     * 
     */
    @Test
    public void getAllOutcomeLinksForContextCoursesTest() {
        String courseId = null;
        String outcomeStyle = null;
        String outcomeGroupStyle = null;
        // List<OutcomeLink> response = api.getAllOutcomeLinksForContextCourses(courseId, outcomeStyle, outcomeGroupStyle);

        // TODO: test validations
    }

    /**
     * Get all outcome links for context
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllOutcomeLinksForContextCoursesTestQueryMap() {
        String courseId = null;
        OutcomeGroupsApi.GetAllOutcomeLinksForContextCoursesQueryParams queryParams = new OutcomeGroupsApi.GetAllOutcomeLinksForContextCoursesQueryParams()
            .outcomeStyle(null)
            .outcomeGroupStyle(null);
        // List<OutcomeLink> response = api.getAllOutcomeLinksForContextCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Import an outcome group
     *
     * Creates a new subgroup of the outcome group with the same title and description as the source group, then creates links in that new subgroup to the same outcomes that are linked in the source group. Recurses on the subgroups of the source group, importing them each in turn into the new subgroup.  Allows you to copy organizational structure, but does not create copies of the outcomes themselves, only new links.  The source group must be either global, from the same context as this outcome group, or from an associated account. The source group cannot be the root outcome group of its context.
     */
    @Test
    public void importOutcomeGroupAccountsTest() {
        String accountId = null;
        String id = null;
        Integer sourceOutcomeGroupId = null;
        Boolean async = null;
        // OutcomeGroup response = api.importOutcomeGroupAccounts(accountId, id, sourceOutcomeGroupId, async);

        // TODO: test validations
    }

    /**
     * Import an outcome group
     *
     * Creates a new subgroup of the outcome group with the same title and description as the source group, then creates links in that new subgroup to the same outcomes that are linked in the source group. Recurses on the subgroups of the source group, importing them each in turn into the new subgroup.  Allows you to copy organizational structure, but does not create copies of the outcomes themselves, only new links.  The source group must be either global, from the same context as this outcome group, or from an associated account. The source group cannot be the root outcome group of its context.
     */
    @Test
    public void importOutcomeGroupCoursesTest() {
        String courseId = null;
        String id = null;
        Integer sourceOutcomeGroupId = null;
        Boolean async = null;
        // OutcomeGroup response = api.importOutcomeGroupCourses(courseId, id, sourceOutcomeGroupId, async);

        // TODO: test validations
    }

    /**
     * Import an outcome group
     *
     * Creates a new subgroup of the outcome group with the same title and description as the source group, then creates links in that new subgroup to the same outcomes that are linked in the source group. Recurses on the subgroups of the source group, importing them each in turn into the new subgroup.  Allows you to copy organizational structure, but does not create copies of the outcomes themselves, only new links.  The source group must be either global, from the same context as this outcome group, or from an associated account. The source group cannot be the root outcome group of its context.
     */
    @Test
    public void importOutcomeGroupGlobalTest() {
        String id = null;
        Integer sourceOutcomeGroupId = null;
        Boolean async = null;
        // OutcomeGroup response = api.importOutcomeGroupGlobal(id, sourceOutcomeGroupId, async);

        // TODO: test validations
    }

    /**
     * List linked outcomes
     *
     * A paginated list of the immediate OutcomeLink children of the outcome group.
     */
    @Test
    public void listLinkedOutcomesAccountsTest() {
        String accountId = null;
        String id = null;
        String outcomeStyle = null;
        // List<OutcomeLink> response = api.listLinkedOutcomesAccounts(accountId, id, outcomeStyle);

        // TODO: test validations
    }

    /**
     * List linked outcomes
     *
     * A paginated list of the immediate OutcomeLink children of the outcome group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listLinkedOutcomesAccountsTestQueryMap() {
        String accountId = null;
        String id = null;
        OutcomeGroupsApi.ListLinkedOutcomesAccountsQueryParams queryParams = new OutcomeGroupsApi.ListLinkedOutcomesAccountsQueryParams()
            .outcomeStyle(null);
        // List<OutcomeLink> response = api.listLinkedOutcomesAccounts(accountId, id, queryParams);

    // TODO: test validations
    }
    /**
     * List linked outcomes
     *
     * A paginated list of the immediate OutcomeLink children of the outcome group.
     */
    @Test
    public void listLinkedOutcomesCoursesTest() {
        String courseId = null;
        String id = null;
        String outcomeStyle = null;
        // List<OutcomeLink> response = api.listLinkedOutcomesCourses(courseId, id, outcomeStyle);

        // TODO: test validations
    }

    /**
     * List linked outcomes
     *
     * A paginated list of the immediate OutcomeLink children of the outcome group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listLinkedOutcomesCoursesTestQueryMap() {
        String courseId = null;
        String id = null;
        OutcomeGroupsApi.ListLinkedOutcomesCoursesQueryParams queryParams = new OutcomeGroupsApi.ListLinkedOutcomesCoursesQueryParams()
            .outcomeStyle(null);
        // List<OutcomeLink> response = api.listLinkedOutcomesCourses(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * List linked outcomes
     *
     * A paginated list of the immediate OutcomeLink children of the outcome group.
     */
    @Test
    public void listLinkedOutcomesGlobalTest() {
        String id = null;
        String outcomeStyle = null;
        // List<OutcomeLink> response = api.listLinkedOutcomesGlobal(id, outcomeStyle);

        // TODO: test validations
    }

    /**
     * List linked outcomes
     *
     * A paginated list of the immediate OutcomeLink children of the outcome group.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listLinkedOutcomesGlobalTestQueryMap() {
        String id = null;
        OutcomeGroupsApi.ListLinkedOutcomesGlobalQueryParams queryParams = new OutcomeGroupsApi.ListLinkedOutcomesGlobalQueryParams()
            .outcomeStyle(null);
        // List<OutcomeLink> response = api.listLinkedOutcomesGlobal(id, queryParams);

    // TODO: test validations
    }
    /**
     * List subgroups
     *
     * A paginated list of the immediate OutcomeGroup children of the outcome group.
     */
    @Test
    public void listSubgroupsAccountsTest() {
        String accountId = null;
        String id = null;
        // List<OutcomeGroup> response = api.listSubgroupsAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * List subgroups
     *
     * A paginated list of the immediate OutcomeGroup children of the outcome group.
     */
    @Test
    public void listSubgroupsCoursesTest() {
        String courseId = null;
        String id = null;
        // List<OutcomeGroup> response = api.listSubgroupsCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * List subgroups
     *
     * A paginated list of the immediate OutcomeGroup children of the outcome group.
     */
    @Test
    public void listSubgroupsGlobalTest() {
        String id = null;
        // List<OutcomeGroup> response = api.listSubgroupsGlobal(id);

        // TODO: test validations
    }

    /**
     * Redirect to root outcome group for context
     *
     * Convenience redirect to find the root outcome group for a particular context. Will redirect to the appropriate outcome group&#x27;s URL.
     */
    @Test
    public void redirectToRootOutcomeGroupForContextAccountsTest() {
        String accountId = null;
        // api.redirectToRootOutcomeGroupForContextAccounts(accountId);

        // TODO: test validations
    }

    /**
     * Redirect to root outcome group for context
     *
     * Convenience redirect to find the root outcome group for a particular context. Will redirect to the appropriate outcome group&#x27;s URL.
     */
    @Test
    public void redirectToRootOutcomeGroupForContextCoursesTest() {
        String courseId = null;
        // api.redirectToRootOutcomeGroupForContextCourses(courseId);

        // TODO: test validations
    }

    /**
     * Redirect to root outcome group for context
     *
     * Convenience redirect to find the root outcome group for a particular context. Will redirect to the appropriate outcome group&#x27;s URL.
     */
    @Test
    public void redirectToRootOutcomeGroupForContextGlobalTest() {
        // api.redirectToRootOutcomeGroupForContextGlobal();

        // TODO: test validations
    }

    /**
     * Show an outcome group
     *
     * 
     */
    @Test
    public void showOutcomeGroupAccountsTest() {
        String accountId = null;
        String id = null;
        // OutcomeGroup response = api.showOutcomeGroupAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * Show an outcome group
     *
     * 
     */
    @Test
    public void showOutcomeGroupCoursesTest() {
        String courseId = null;
        String id = null;
        // OutcomeGroup response = api.showOutcomeGroupCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Show an outcome group
     *
     * 
     */
    @Test
    public void showOutcomeGroupGlobalTest() {
        String id = null;
        // OutcomeGroup response = api.showOutcomeGroupGlobal(id);

        // TODO: test validations
    }

    /**
     * Unlink an outcome
     *
     * Unlinking an outcome only deletes the outcome itself if this was the last link to the outcome in any group in any context. Aligned outcomes cannot be deleted; as such, if this is the last link to an aligned outcome, the unlinking will fail.
     */
    @Test
    public void unlinkOutcomeAccountsTest() {
        String accountId = null;
        String id = null;
        String outcomeId = null;
        // OutcomeLink response = api.unlinkOutcomeAccounts(accountId, id, outcomeId);

        // TODO: test validations
    }

    /**
     * Unlink an outcome
     *
     * Unlinking an outcome only deletes the outcome itself if this was the last link to the outcome in any group in any context. Aligned outcomes cannot be deleted; as such, if this is the last link to an aligned outcome, the unlinking will fail.
     */
    @Test
    public void unlinkOutcomeCoursesTest() {
        String courseId = null;
        String id = null;
        String outcomeId = null;
        // OutcomeLink response = api.unlinkOutcomeCourses(courseId, id, outcomeId);

        // TODO: test validations
    }

    /**
     * Unlink an outcome
     *
     * Unlinking an outcome only deletes the outcome itself if this was the last link to the outcome in any group in any context. Aligned outcomes cannot be deleted; as such, if this is the last link to an aligned outcome, the unlinking will fail.
     */
    @Test
    public void unlinkOutcomeGlobalTest() {
        String id = null;
        String outcomeId = null;
        // OutcomeLink response = api.unlinkOutcomeGlobal(id, outcomeId);

        // TODO: test validations
    }

    /**
     * Update an outcome group
     *
     * Modify an existing outcome group. Fields not provided are left as is; unrecognized fields are ignored.  When changing the parent outcome group, the new parent group must belong to the same context as this outcome group, and must not be a descendant of this outcome group (i.e. no cycles allowed).
     */
    @Test
    public void updateOutcomeGroupAccountsTest() {
        String accountId = null;
        String id = null;
        String title = null;
        String description = null;
        String vendorGuid = null;
        Integer parentOutcomeGroupId = null;
        // OutcomeGroup response = api.updateOutcomeGroupAccounts(accountId, id, title, description, vendorGuid, parentOutcomeGroupId);

        // TODO: test validations
    }

    /**
     * Update an outcome group
     *
     * Modify an existing outcome group. Fields not provided are left as is; unrecognized fields are ignored.  When changing the parent outcome group, the new parent group must belong to the same context as this outcome group, and must not be a descendant of this outcome group (i.e. no cycles allowed).
     */
    @Test
    public void updateOutcomeGroupCoursesTest() {
        String courseId = null;
        String id = null;
        String title = null;
        String description = null;
        String vendorGuid = null;
        Integer parentOutcomeGroupId = null;
        // OutcomeGroup response = api.updateOutcomeGroupCourses(courseId, id, title, description, vendorGuid, parentOutcomeGroupId);

        // TODO: test validations
    }

    /**
     * Update an outcome group
     *
     * Modify an existing outcome group. Fields not provided are left as is; unrecognized fields are ignored.  When changing the parent outcome group, the new parent group must belong to the same context as this outcome group, and must not be a descendant of this outcome group (i.e. no cycles allowed).
     */
    @Test
    public void updateOutcomeGroupGlobalTest() {
        String id = null;
        String title = null;
        String description = null;
        String vendorGuid = null;
        Integer parentOutcomeGroupId = null;
        // OutcomeGroup response = api.updateOutcomeGroupGlobal(id, title, description, vendorGuid, parentOutcomeGroupId);

        // TODO: test validations
    }

}
