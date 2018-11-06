package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.BlueprintMigration;
import com.instructure.canvas.model.BlueprintSubscription;
import com.instructure.canvas.model.BlueprintTemplate;
import com.instructure.canvas.model.ChangeRecord;
import com.instructure.canvas.model.Course;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlueprintCoursesApi
 */
public class BlueprintCoursesApiTest {

    private BlueprintCoursesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(BlueprintCoursesApi.class);
    }

    /**
     * Begin a migration to push to associated courses
     *
     * Begins a migration to push recently updated content to all associated courses. Only one migration can be running at a time.
     */
    @Test
    public void beginMigrationToPushToAssociatedCoursesTest() {
        String courseId = null;
        String templateId = null;
        String comment = null;
        Boolean sendNotification = null;
        Boolean copySettings = null;
        // BlueprintMigration response = api.beginMigrationToPushToAssociatedCourses(courseId, templateId, comment, sendNotification, copySettings);

        // TODO: test validations
    }

    /**
     * Get associated course information
     *
     * Returns a list of courses that are configured to receive updates from this blueprint
     */
    @Test
    public void getAssociatedCourseInformationTest() {
        String courseId = null;
        String templateId = null;
        // List<Course> response = api.getAssociatedCourseInformation(courseId, templateId);

        // TODO: test validations
    }

    /**
     * Get blueprint information
     *
     * Using &#x27;default&#x27; as the template_id should suffice for the current implmentation (as there should be only one template per course). However, using specific template ids may become necessary in the future
     */
    @Test
    public void getBlueprintInformationTest() {
        String courseId = null;
        String templateId = null;
        // BlueprintTemplate response = api.getBlueprintInformation(courseId, templateId);

        // TODO: test validations
    }

    /**
     * Get import details
     *
     * Show the changes that were propagated to a course associated with a blueprint.  See also {api:MasterCourses::MasterTemplatesController#migration_details the blueprint course side}.
     */
    @Test
    public void getImportDetailsTest() {
        String courseId = null;
        String subscriptionId = null;
        String id = null;
        // List<ChangeRecord> response = api.getImportDetails(courseId, subscriptionId, id);

        // TODO: test validations
    }

    /**
     * Get migration details
     *
     * Show the changes that were propagated in a blueprint migration. This endpoint can be called on a blueprint course. See also {api:MasterCourses::MasterTemplatesController#import_details the associated course side}.
     */
    @Test
    public void getMigrationDetailsTest() {
        String courseId = null;
        String templateId = null;
        String id = null;
        // List<ChangeRecord> response = api.getMigrationDetails(courseId, templateId, id);

        // TODO: test validations
    }

    /**
     * Get unsynced changes
     *
     * Retrieve a list of learning objects that have changed since the last blueprint sync operation.
     */
    @Test
    public void getUnsyncedChangesTest() {
        String courseId = null;
        String templateId = null;
        // List<ChangeRecord> response = api.getUnsyncedChanges(courseId, templateId);

        // TODO: test validations
    }

    /**
     * List blueprint imports
     *
     * Shows a paginated list of migrations imported into a course associated with a blueprint, starting with the most recent. See also {api:MasterCourses::MasterTemplatesController#migrations_index the blueprint course side}.  Use &#x27;default&#x27; as the subscription_id to use the currently active blueprint subscription.
     */
    @Test
    public void listBlueprintImportsTest() {
        String courseId = null;
        String subscriptionId = null;
        // List<BlueprintMigration> response = api.listBlueprintImports(courseId, subscriptionId);

        // TODO: test validations
    }

    /**
     * List blueprint migrations
     *
     * Shows a paginated list of migrations for the template, starting with the most recent. This endpoint can be called on a blueprint course. See also {api:MasterCourses::MasterTemplatesController#imports_index the associated course side}.
     */
    @Test
    public void listBlueprintMigrationsTest() {
        String courseId = null;
        String templateId = null;
        // List<BlueprintMigration> response = api.listBlueprintMigrations(courseId, templateId);

        // TODO: test validations
    }

    /**
     * List blueprint subscriptions
     *
     * Returns a list of blueprint subscriptions for the given course. (Currently a course may have no more than one.)
     */
    @Test
    public void listBlueprintSubscriptionsTest() {
        String courseId = null;
        // List<BlueprintSubscription> response = api.listBlueprintSubscriptions(courseId);

        // TODO: test validations
    }

    /**
     * Set or remove restrictions on a blueprint course object
     *
     * If a blueprint course object is restricted, editing will be limited for copies in associated courses.
     */
    @Test
    public void setOrRemoveRestrictionsOnBlueprintCourseObjectTest() {
        String courseId = null;
        String templateId = null;
        String contentType = null;
        Integer contentId = null;
        Boolean restricted = null;
        Object restrictions = null;
        // api.setOrRemoveRestrictionsOnBlueprintCourseObject(courseId, templateId, contentType, contentId, restricted, restrictions);

        // TODO: test validations
    }

    /**
     * Show a blueprint import
     *
     * Shows the status of an import into a course associated with a blueprint. See also {api:MasterCourses::MasterTemplatesController#migrations_show the blueprint course side}.
     */
    @Test
    public void showBlueprintImportTest() {
        String courseId = null;
        String subscriptionId = null;
        String id = null;
        // BlueprintMigration response = api.showBlueprintImport(courseId, subscriptionId, id);

        // TODO: test validations
    }

    /**
     * Show a blueprint migration
     *
     * Shows the status of a migration. This endpoint can be called on a blueprint course. See also {api:MasterCourses::MasterTemplatesController#imports_show the associated course side}.
     */
    @Test
    public void showBlueprintMigrationTest() {
        String courseId = null;
        String templateId = null;
        String id = null;
        // BlueprintMigration response = api.showBlueprintMigration(courseId, templateId, id);

        // TODO: test validations
    }

    /**
     * Update associated courses
     *
     * Send a list of course ids to add or remove new associations for the template. Cannot add courses that do not belong to the blueprint course&#x27;s account. Also cannot add other blueprint courses or courses that already have an association with another blueprint course.
     */
    @Test
    public void updateAssociatedCoursesTest() {
        String courseId = null;
        String templateId = null;
        List<String> courseIdsToAdd = null;
        List<String> courseIdsToRemove = null;
        // api.updateAssociatedCourses(courseId, templateId, courseIdsToAdd, courseIdsToRemove);

        // TODO: test validations
    }

}
