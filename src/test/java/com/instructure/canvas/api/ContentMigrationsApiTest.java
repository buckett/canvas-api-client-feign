package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.ContentMigration;
import com.instructure.canvas.model.MigrationIssue;
import com.instructure.canvas.model.Migrator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentMigrationsApi
 */
public class ContentMigrationsApiTest {

    private ContentMigrationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ContentMigrationsApi.class);
    }

    /**
     * Create a content migration
     *
     * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
     */
    @Test
    public void createContentMigrationAccountsTest() {
        String accountId = null;
        String migrationType = null;
        String preAttachmentName = null;
        String preAttachmentTodo = null;
        String settingsFileUrl = null;
        String settingsSourceCourseId = null;
        String settingsFolderId = null;
        Boolean settingsOverwriteQuizzes = null;
        Integer settingsQuestionBankId = null;
        String settingsQuestionBankName = null;
        Boolean dateShiftOptionsShiftDates = null;
        String dateShiftOptionsOldStartDate = null;
        String dateShiftOptionsOldEndDate = null;
        String dateShiftOptionsNewStartDate = null;
        String dateShiftOptionsNewEndDate = null;
        Integer dateShiftOptionsDaySubstitutionsX = null;
        Boolean dateShiftOptionsRemoveDates = null;
        // ContentMigration response = api.createContentMigrationAccounts(accountId, migrationType, preAttachmentName, preAttachmentTodo, settingsFileUrl, settingsSourceCourseId, settingsFolderId, settingsOverwriteQuizzes, settingsQuestionBankId, settingsQuestionBankName, dateShiftOptionsShiftDates, dateShiftOptionsOldStartDate, dateShiftOptionsOldEndDate, dateShiftOptionsNewStartDate, dateShiftOptionsNewEndDate, dateShiftOptionsDaySubstitutionsX, dateShiftOptionsRemoveDates);

        // TODO: test validations
    }

    /**
     * Create a content migration
     *
     * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
     */
    @Test
    public void createContentMigrationCoursesTest() {
        String courseId = null;
        String migrationType = null;
        String preAttachmentName = null;
        String preAttachmentTodo = null;
        String settingsFileUrl = null;
        String settingsSourceCourseId = null;
        String settingsFolderId = null;
        Boolean settingsOverwriteQuizzes = null;
        Integer settingsQuestionBankId = null;
        String settingsQuestionBankName = null;
        Boolean dateShiftOptionsShiftDates = null;
        String dateShiftOptionsOldStartDate = null;
        String dateShiftOptionsOldEndDate = null;
        String dateShiftOptionsNewStartDate = null;
        String dateShiftOptionsNewEndDate = null;
        Integer dateShiftOptionsDaySubstitutionsX = null;
        Boolean dateShiftOptionsRemoveDates = null;
        // ContentMigration response = api.createContentMigrationCourses(courseId, migrationType, preAttachmentName, preAttachmentTodo, settingsFileUrl, settingsSourceCourseId, settingsFolderId, settingsOverwriteQuizzes, settingsQuestionBankId, settingsQuestionBankName, dateShiftOptionsShiftDates, dateShiftOptionsOldStartDate, dateShiftOptionsOldEndDate, dateShiftOptionsNewStartDate, dateShiftOptionsNewEndDate, dateShiftOptionsDaySubstitutionsX, dateShiftOptionsRemoveDates);

        // TODO: test validations
    }

    /**
     * Create a content migration
     *
     * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
     */
    @Test
    public void createContentMigrationGroupsTest() {
        String groupId = null;
        String migrationType = null;
        String preAttachmentName = null;
        String preAttachmentTodo = null;
        String settingsFileUrl = null;
        String settingsSourceCourseId = null;
        String settingsFolderId = null;
        Boolean settingsOverwriteQuizzes = null;
        Integer settingsQuestionBankId = null;
        String settingsQuestionBankName = null;
        Boolean dateShiftOptionsShiftDates = null;
        String dateShiftOptionsOldStartDate = null;
        String dateShiftOptionsOldEndDate = null;
        String dateShiftOptionsNewStartDate = null;
        String dateShiftOptionsNewEndDate = null;
        Integer dateShiftOptionsDaySubstitutionsX = null;
        Boolean dateShiftOptionsRemoveDates = null;
        // ContentMigration response = api.createContentMigrationGroups(groupId, migrationType, preAttachmentName, preAttachmentTodo, settingsFileUrl, settingsSourceCourseId, settingsFolderId, settingsOverwriteQuizzes, settingsQuestionBankId, settingsQuestionBankName, dateShiftOptionsShiftDates, dateShiftOptionsOldStartDate, dateShiftOptionsOldEndDate, dateShiftOptionsNewStartDate, dateShiftOptionsNewEndDate, dateShiftOptionsDaySubstitutionsX, dateShiftOptionsRemoveDates);

        // TODO: test validations
    }

    /**
     * Create a content migration
     *
     * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
     */
    @Test
    public void createContentMigrationUsersTest() {
        String userId = null;
        String migrationType = null;
        String preAttachmentName = null;
        String preAttachmentTodo = null;
        String settingsFileUrl = null;
        String settingsSourceCourseId = null;
        String settingsFolderId = null;
        Boolean settingsOverwriteQuizzes = null;
        Integer settingsQuestionBankId = null;
        String settingsQuestionBankName = null;
        Boolean dateShiftOptionsShiftDates = null;
        String dateShiftOptionsOldStartDate = null;
        String dateShiftOptionsOldEndDate = null;
        String dateShiftOptionsNewStartDate = null;
        String dateShiftOptionsNewEndDate = null;
        Integer dateShiftOptionsDaySubstitutionsX = null;
        Boolean dateShiftOptionsRemoveDates = null;
        // ContentMigration response = api.createContentMigrationUsers(userId, migrationType, preAttachmentName, preAttachmentTodo, settingsFileUrl, settingsSourceCourseId, settingsFolderId, settingsOverwriteQuizzes, settingsQuestionBankId, settingsQuestionBankName, dateShiftOptionsShiftDates, dateShiftOptionsOldStartDate, dateShiftOptionsOldEndDate, dateShiftOptionsNewStartDate, dateShiftOptionsNewEndDate, dateShiftOptionsDaySubstitutionsX, dateShiftOptionsRemoveDates);

        // TODO: test validations
    }

    /**
     * Get a content migration
     *
     * Returns data on an individual content migration
     */
    @Test
    public void getContentMigrationAccountsTest() {
        String accountId = null;
        String id = null;
        // ContentMigration response = api.getContentMigrationAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * Get a content migration
     *
     * Returns data on an individual content migration
     */
    @Test
    public void getContentMigrationCoursesTest() {
        String courseId = null;
        String id = null;
        // ContentMigration response = api.getContentMigrationCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Get a content migration
     *
     * Returns data on an individual content migration
     */
    @Test
    public void getContentMigrationGroupsTest() {
        String groupId = null;
        String id = null;
        // ContentMigration response = api.getContentMigrationGroups(groupId, id);

        // TODO: test validations
    }

    /**
     * Get a content migration
     *
     * Returns data on an individual content migration
     */
    @Test
    public void getContentMigrationUsersTest() {
        String userId = null;
        String id = null;
        // ContentMigration response = api.getContentMigrationUsers(userId, id);

        // TODO: test validations
    }

    /**
     * Get a migration issue
     *
     * Returns data on an individual migration issue
     */
    @Test
    public void getMigrationIssueAccountsTest() {
        String accountId = null;
        String contentMigrationId = null;
        String id = null;
        // MigrationIssue response = api.getMigrationIssueAccounts(accountId, contentMigrationId, id);

        // TODO: test validations
    }

    /**
     * Get a migration issue
     *
     * Returns data on an individual migration issue
     */
    @Test
    public void getMigrationIssueCoursesTest() {
        String courseId = null;
        String contentMigrationId = null;
        String id = null;
        // MigrationIssue response = api.getMigrationIssueCourses(courseId, contentMigrationId, id);

        // TODO: test validations
    }

    /**
     * Get a migration issue
     *
     * Returns data on an individual migration issue
     */
    @Test
    public void getMigrationIssueGroupsTest() {
        String groupId = null;
        String contentMigrationId = null;
        String id = null;
        // MigrationIssue response = api.getMigrationIssueGroups(groupId, contentMigrationId, id);

        // TODO: test validations
    }

    /**
     * Get a migration issue
     *
     * Returns data on an individual migration issue
     */
    @Test
    public void getMigrationIssueUsersTest() {
        String userId = null;
        String contentMigrationId = null;
        String id = null;
        // MigrationIssue response = api.getMigrationIssueUsers(userId, contentMigrationId, id);

        // TODO: test validations
    }

    /**
     * List content migrations
     *
     * Returns paginated content migrations
     */
    @Test
    public void listContentMigrationsAccountsTest() {
        String accountId = null;
        // List<ContentMigration> response = api.listContentMigrationsAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List content migrations
     *
     * Returns paginated content migrations
     */
    @Test
    public void listContentMigrationsCoursesTest() {
        String courseId = null;
        // List<ContentMigration> response = api.listContentMigrationsCourses(courseId);

        // TODO: test validations
    }

    /**
     * List content migrations
     *
     * Returns paginated content migrations
     */
    @Test
    public void listContentMigrationsGroupsTest() {
        String groupId = null;
        // List<ContentMigration> response = api.listContentMigrationsGroups(groupId);

        // TODO: test validations
    }

    /**
     * List content migrations
     *
     * Returns paginated content migrations
     */
    @Test
    public void listContentMigrationsUsersTest() {
        String userId = null;
        // List<ContentMigration> response = api.listContentMigrationsUsers(userId);

        // TODO: test validations
    }

    /**
     * List migration issues
     *
     * Returns paginated migration issues
     */
    @Test
    public void listMigrationIssuesAccountsTest() {
        String accountId = null;
        String contentMigrationId = null;
        // List<MigrationIssue> response = api.listMigrationIssuesAccounts(accountId, contentMigrationId);

        // TODO: test validations
    }

    /**
     * List migration issues
     *
     * Returns paginated migration issues
     */
    @Test
    public void listMigrationIssuesCoursesTest() {
        String courseId = null;
        String contentMigrationId = null;
        // List<MigrationIssue> response = api.listMigrationIssuesCourses(courseId, contentMigrationId);

        // TODO: test validations
    }

    /**
     * List migration issues
     *
     * Returns paginated migration issues
     */
    @Test
    public void listMigrationIssuesGroupsTest() {
        String groupId = null;
        String contentMigrationId = null;
        // List<MigrationIssue> response = api.listMigrationIssuesGroups(groupId, contentMigrationId);

        // TODO: test validations
    }

    /**
     * List migration issues
     *
     * Returns paginated migration issues
     */
    @Test
    public void listMigrationIssuesUsersTest() {
        String userId = null;
        String contentMigrationId = null;
        // List<MigrationIssue> response = api.listMigrationIssuesUsers(userId, contentMigrationId);

        // TODO: test validations
    }

    /**
     * List Migration Systems
     *
     * Lists the currently available migration types. These values may change.
     */
    @Test
    public void listMigrationSystemsAccountsTest() {
        String accountId = null;
        // List<Migrator> response = api.listMigrationSystemsAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List Migration Systems
     *
     * Lists the currently available migration types. These values may change.
     */
    @Test
    public void listMigrationSystemsCoursesTest() {
        String courseId = null;
        // List<Migrator> response = api.listMigrationSystemsCourses(courseId);

        // TODO: test validations
    }

    /**
     * List Migration Systems
     *
     * Lists the currently available migration types. These values may change.
     */
    @Test
    public void listMigrationSystemsGroupsTest() {
        String groupId = null;
        // List<Migrator> response = api.listMigrationSystemsGroups(groupId);

        // TODO: test validations
    }

    /**
     * List Migration Systems
     *
     * Lists the currently available migration types. These values may change.
     */
    @Test
    public void listMigrationSystemsUsersTest() {
        String userId = null;
        // List<Migrator> response = api.listMigrationSystemsUsers(userId);

        // TODO: test validations
    }

    /**
     * Update a content migration
     *
     * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
     */
    @Test
    public void updateContentMigrationAccountsTest() {
        String accountId = null;
        String id = null;
        // ContentMigration response = api.updateContentMigrationAccounts(accountId, id);

        // TODO: test validations
    }

    /**
     * Update a content migration
     *
     * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
     */
    @Test
    public void updateContentMigrationCoursesTest() {
        String courseId = null;
        String id = null;
        // ContentMigration response = api.updateContentMigrationCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Update a content migration
     *
     * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
     */
    @Test
    public void updateContentMigrationGroupsTest() {
        String groupId = null;
        String id = null;
        // ContentMigration response = api.updateContentMigrationGroups(groupId, id);

        // TODO: test validations
    }

    /**
     * Update a content migration
     *
     * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
     */
    @Test
    public void updateContentMigrationUsersTest() {
        String userId = null;
        String id = null;
        // ContentMigration response = api.updateContentMigrationUsers(userId, id);

        // TODO: test validations
    }

    /**
     * Update a migration issue
     *
     * Update the workflow_state of a migration issue
     */
    @Test
    public void updateMigrationIssueAccountsTest() {
        String accountId = null;
        String contentMigrationId = null;
        String id = null;
        String workflowState = null;
        // MigrationIssue response = api.updateMigrationIssueAccounts(accountId, contentMigrationId, id, workflowState);

        // TODO: test validations
    }

    /**
     * Update a migration issue
     *
     * Update the workflow_state of a migration issue
     */
    @Test
    public void updateMigrationIssueCoursesTest() {
        String courseId = null;
        String contentMigrationId = null;
        String id = null;
        String workflowState = null;
        // MigrationIssue response = api.updateMigrationIssueCourses(courseId, contentMigrationId, id, workflowState);

        // TODO: test validations
    }

    /**
     * Update a migration issue
     *
     * Update the workflow_state of a migration issue
     */
    @Test
    public void updateMigrationIssueGroupsTest() {
        String groupId = null;
        String contentMigrationId = null;
        String id = null;
        String workflowState = null;
        // MigrationIssue response = api.updateMigrationIssueGroups(groupId, contentMigrationId, id, workflowState);

        // TODO: test validations
    }

    /**
     * Update a migration issue
     *
     * Update the workflow_state of a migration issue
     */
    @Test
    public void updateMigrationIssueUsersTest() {
        String userId = null;
        String contentMigrationId = null;
        String id = null;
        String workflowState = null;
        // MigrationIssue response = api.updateMigrationIssueUsers(userId, contentMigrationId, id, workflowState);

        // TODO: test validations
    }

}
