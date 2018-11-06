package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Module;
import com.instructure.canvas.model.ModuleItem;
import com.instructure.canvas.model.ModuleItemSequence;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModulesApi
 */
public class ModulesApiTest {

    private ModulesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ModulesApi.class);
    }

    /**
     * Create a module
     *
     * Create and return a new module
     */
    @Test
    public void createModuleTest() {
        String courseId = null;
        String moduleName = null;
        String moduleUnlockAt = null;
        Integer modulePosition = null;
        Boolean moduleRequireSequentialProgress = null;
        List<String> modulePrerequisiteModuleIds = null;
        Boolean modulePublishFinalGrade = null;
        // Module response = api.createModule(courseId, moduleName, moduleUnlockAt, modulePosition, moduleRequireSequentialProgress, modulePrerequisiteModuleIds, modulePublishFinalGrade);

        // TODO: test validations
    }

    /**
     * Create a module item
     *
     * Create and return a new module item
     */
    @Test
    public void createModuleItemTest() {
        String courseId = null;
        String moduleId = null;
        String moduleItemTitle = null;
        String moduleItemType = null;
        String moduleItemContentId = null;
        Integer moduleItemPosition = null;
        Integer moduleItemIndent = null;
        String moduleItemPageUrl = null;
        String moduleItemExternalUrl = null;
        Boolean moduleItemNewTab = null;
        String moduleItemCompletionRequirementType = null;
        Integer moduleItemCompletionRequirementMinScore = null;
        // ModuleItem response = api.createModuleItem(courseId, moduleId, moduleItemTitle, moduleItemType, moduleItemContentId, moduleItemPosition, moduleItemIndent, moduleItemPageUrl, moduleItemExternalUrl, moduleItemNewTab, moduleItemCompletionRequirementType, moduleItemCompletionRequirementMinScore);

        // TODO: test validations
    }

    /**
     * Delete module
     *
     * Delete a module
     */
    @Test
    public void deleteModuleTest() {
        String courseId = null;
        String id = null;
        // Module response = api.deleteModule(courseId, id);

        // TODO: test validations
    }

    /**
     * Delete module item
     *
     * Delete a module item
     */
    @Test
    public void deleteModuleItemTest() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        // ModuleItem response = api.deleteModuleItem(courseId, moduleId, id);

        // TODO: test validations
    }

    /**
     * Get module item sequence
     *
     * Given an asset in a course, find the ModuleItem it belongs to, the previous and next Module Items in the course sequence, and also any applicable mastery path rules
     */
    @Test
    public void getModuleItemSequenceTest() {
        String courseId = null;
        String assetType = null;
        Integer assetId = null;
        // ModuleItemSequence response = api.getModuleItemSequence(courseId, assetType, assetId);

        // TODO: test validations
    }

    /**
     * Get module item sequence
     *
     * Given an asset in a course, find the ModuleItem it belongs to, the previous and next Module Items in the course sequence, and also any applicable mastery path rules
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getModuleItemSequenceTestQueryMap() {
        String courseId = null;
        ModulesApi.GetModuleItemSequenceQueryParams queryParams = new ModulesApi.GetModuleItemSequenceQueryParams()
            .assetType(null)
            .assetId(null);
        // ModuleItemSequence response = api.getModuleItemSequence(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List module items
     *
     * A paginated list of the items in a module
     */
    @Test
    public void listModuleItemsTest() {
        String courseId = null;
        String moduleId = null;
        List<String> include = null;
        String searchTerm = null;
        String studentId = null;
        // List<ModuleItem> response = api.listModuleItems(courseId, moduleId, include, searchTerm, studentId);

        // TODO: test validations
    }

    /**
     * List module items
     *
     * A paginated list of the items in a module
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listModuleItemsTestQueryMap() {
        String courseId = null;
        String moduleId = null;
        ModulesApi.ListModuleItemsQueryParams queryParams = new ModulesApi.ListModuleItemsQueryParams()
            .include(null)
            .searchTerm(null)
            .studentId(null);
        // List<ModuleItem> response = api.listModuleItems(courseId, moduleId, queryParams);

    // TODO: test validations
    }
    /**
     * List modules
     *
     * A paginated list of the modules in a course
     */
    @Test
    public void listModulesTest() {
        String courseId = null;
        List<String> include = null;
        String searchTerm = null;
        String studentId = null;
        // List<Module> response = api.listModules(courseId, include, searchTerm, studentId);

        // TODO: test validations
    }

    /**
     * List modules
     *
     * A paginated list of the modules in a course
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listModulesTestQueryMap() {
        String courseId = null;
        ModulesApi.ListModulesQueryParams queryParams = new ModulesApi.ListModulesQueryParams()
            .include(null)
            .searchTerm(null)
            .studentId(null);
        // List<Module> response = api.listModules(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Mark module item as done/not done
     *
     * Mark a module item as done/not done. Use HTTP method PUT to mark as done, and DELETE to mark as not done.
     */
    @Test
    public void markModuleItemAsDoneNotDoneTest() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        // api.markModuleItemAsDoneNotDone(courseId, moduleId, id);

        // TODO: test validations
    }

    /**
     * Mark module item read
     *
     * Fulfills \&quot;must view\&quot; requirement for a module item. It is generally not necessary to do this explicitly, but it is provided for applications that need to access external content directly (bypassing the html_url redirect that normally allows Canvas to fulfill \&quot;must view\&quot; requirements).  This endpoint cannot be used to complete requirements on locked or unpublished module items.
     */
    @Test
    public void markModuleItemReadTest() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        // api.markModuleItemRead(courseId, moduleId, id);

        // TODO: test validations
    }

    /**
     * Re-lock module progressions
     *
     * Resets module progressions to their default locked state and recalculates them based on the current requirements.  Adding progression requirements to an active course will not lock students out of modules they have already unlocked unless this action is called.
     */
    @Test
    public void reLockModuleProgressionsTest() {
        String courseId = null;
        String id = null;
        // Module response = api.reLockModuleProgressions(courseId, id);

        // TODO: test validations
    }

    /**
     * Select a mastery path
     *
     * Select a mastery path when module item includes several possible paths. Requires Mastery Paths feature to be enabled.  Returns a compound document with the assignments included in the given path and any module items related to those assignments
     */
    @Test
    public void selectMasteryPathTest() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        String assignmentSetId = null;
        String studentId = null;
        // api.selectMasteryPath(courseId, moduleId, id, assignmentSetId, studentId);

        // TODO: test validations
    }

    /**
     * Show module
     *
     * Get information about a single module
     */
    @Test
    public void showModuleTest() {
        String courseId = null;
        String id = null;
        List<String> include = null;
        String studentId = null;
        // Module response = api.showModule(courseId, id, include, studentId);

        // TODO: test validations
    }

    /**
     * Show module
     *
     * Get information about a single module
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showModuleTestQueryMap() {
        String courseId = null;
        String id = null;
        ModulesApi.ShowModuleQueryParams queryParams = new ModulesApi.ShowModuleQueryParams()
            .include(null)
            .studentId(null);
        // Module response = api.showModule(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Show module item
     *
     * Get information about a single module item
     */
    @Test
    public void showModuleItemTest() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        List<String> include = null;
        String studentId = null;
        // ModuleItem response = api.showModuleItem(courseId, moduleId, id, include, studentId);

        // TODO: test validations
    }

    /**
     * Show module item
     *
     * Get information about a single module item
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showModuleItemTestQueryMap() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        ModulesApi.ShowModuleItemQueryParams queryParams = new ModulesApi.ShowModuleItemQueryParams()
            .include(null)
            .studentId(null);
        // ModuleItem response = api.showModuleItem(courseId, moduleId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Update a module
     *
     * Update and return an existing module
     */
    @Test
    public void updateModuleTest() {
        String courseId = null;
        String id = null;
        String moduleName = null;
        String moduleUnlockAt = null;
        Integer modulePosition = null;
        Boolean moduleRequireSequentialProgress = null;
        List<String> modulePrerequisiteModuleIds = null;
        Boolean modulePublishFinalGrade = null;
        Boolean modulePublished = null;
        // Module response = api.updateModule(courseId, id, moduleName, moduleUnlockAt, modulePosition, moduleRequireSequentialProgress, modulePrerequisiteModuleIds, modulePublishFinalGrade, modulePublished);

        // TODO: test validations
    }

    /**
     * Update a module item
     *
     * Update and return an existing module item
     */
    @Test
    public void updateModuleItemTest() {
        String courseId = null;
        String moduleId = null;
        String id = null;
        String moduleItemTitle = null;
        Integer moduleItemPosition = null;
        Integer moduleItemIndent = null;
        String moduleItemExternalUrl = null;
        Boolean moduleItemNewTab = null;
        String moduleItemCompletionRequirementType = null;
        Integer moduleItemCompletionRequirementMinScore = null;
        Boolean moduleItemPublished = null;
        String moduleItemModuleId = null;
        // ModuleItem response = api.updateModuleItem(courseId, moduleId, id, moduleItemTitle, moduleItemPosition, moduleItemIndent, moduleItemExternalUrl, moduleItemNewTab, moduleItemCompletionRequirementType, moduleItemCompletionRequirementMinScore, moduleItemPublished, moduleItemModuleId);

        // TODO: test validations
    }

}
