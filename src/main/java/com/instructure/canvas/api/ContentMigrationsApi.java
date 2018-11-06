package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.ContentMigration;
import com.instructure.canvas.model.MigrationIssue;
import com.instructure.canvas.model.Migrator;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ContentMigrationsApi extends ApiClient.Api {

  /**
   * Create a content migration
   * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
   * @param accountId ID (required)
   * @param migrationType  (optional)
   * @param preAttachmentName  (optional)
   * @param preAttachmentTodo  (optional)
   * @param settingsFileUrl  (optional)
   * @param settingsSourceCourseId  (optional)
   * @param settingsFolderId  (optional)
   * @param settingsOverwriteQuizzes  (optional)
   * @param settingsQuestionBankId  (optional)
   * @param settingsQuestionBankName  (optional)
   * @param dateShiftOptionsShiftDates  (optional)
   * @param dateShiftOptionsOldStartDate  (optional)
   * @param dateShiftOptionsOldEndDate  (optional)
   * @param dateShiftOptionsNewStartDate  (optional)
   * @param dateShiftOptionsNewEndDate  (optional)
   * @param dateShiftOptionsDaySubstitutionsX  (optional)
   * @param dateShiftOptionsRemoveDates  (optional)
   * @return ContentMigration
   */
  @RequestLine("POST /v1/accounts/{accountId}/content_migrations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentMigration createContentMigrationAccounts(@Param("accountId") String accountId, @Param("migrationType") String migrationType, @Param("preAttachmentName") String preAttachmentName, @Param("preAttachmentTodo") String preAttachmentTodo, @Param("settingsFileUrl") String settingsFileUrl, @Param("settingsSourceCourseId") String settingsSourceCourseId, @Param("settingsFolderId") String settingsFolderId, @Param("settingsOverwriteQuizzes") Boolean settingsOverwriteQuizzes, @Param("settingsQuestionBankId") Integer settingsQuestionBankId, @Param("settingsQuestionBankName") String settingsQuestionBankName, @Param("dateShiftOptionsShiftDates") Boolean dateShiftOptionsShiftDates, @Param("dateShiftOptionsOldStartDate") String dateShiftOptionsOldStartDate, @Param("dateShiftOptionsOldEndDate") String dateShiftOptionsOldEndDate, @Param("dateShiftOptionsNewStartDate") String dateShiftOptionsNewStartDate, @Param("dateShiftOptionsNewEndDate") String dateShiftOptionsNewEndDate, @Param("dateShiftOptionsDaySubstitutionsX") Integer dateShiftOptionsDaySubstitutionsX, @Param("dateShiftOptionsRemoveDates") Boolean dateShiftOptionsRemoveDates);
  
  /**
   * Create a content migration
   * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
   * @param courseId ID (required)
   * @param migrationType  (optional)
   * @param preAttachmentName  (optional)
   * @param preAttachmentTodo  (optional)
   * @param settingsFileUrl  (optional)
   * @param settingsSourceCourseId  (optional)
   * @param settingsFolderId  (optional)
   * @param settingsOverwriteQuizzes  (optional)
   * @param settingsQuestionBankId  (optional)
   * @param settingsQuestionBankName  (optional)
   * @param dateShiftOptionsShiftDates  (optional)
   * @param dateShiftOptionsOldStartDate  (optional)
   * @param dateShiftOptionsOldEndDate  (optional)
   * @param dateShiftOptionsNewStartDate  (optional)
   * @param dateShiftOptionsNewEndDate  (optional)
   * @param dateShiftOptionsDaySubstitutionsX  (optional)
   * @param dateShiftOptionsRemoveDates  (optional)
   * @return ContentMigration
   */
  @RequestLine("POST /v1/courses/{courseId}/content_migrations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentMigration createContentMigrationCourses(@Param("courseId") String courseId, @Param("migrationType") String migrationType, @Param("preAttachmentName") String preAttachmentName, @Param("preAttachmentTodo") String preAttachmentTodo, @Param("settingsFileUrl") String settingsFileUrl, @Param("settingsSourceCourseId") String settingsSourceCourseId, @Param("settingsFolderId") String settingsFolderId, @Param("settingsOverwriteQuizzes") Boolean settingsOverwriteQuizzes, @Param("settingsQuestionBankId") Integer settingsQuestionBankId, @Param("settingsQuestionBankName") String settingsQuestionBankName, @Param("dateShiftOptionsShiftDates") Boolean dateShiftOptionsShiftDates, @Param("dateShiftOptionsOldStartDate") String dateShiftOptionsOldStartDate, @Param("dateShiftOptionsOldEndDate") String dateShiftOptionsOldEndDate, @Param("dateShiftOptionsNewStartDate") String dateShiftOptionsNewStartDate, @Param("dateShiftOptionsNewEndDate") String dateShiftOptionsNewEndDate, @Param("dateShiftOptionsDaySubstitutionsX") Integer dateShiftOptionsDaySubstitutionsX, @Param("dateShiftOptionsRemoveDates") Boolean dateShiftOptionsRemoveDates);
  
  /**
   * Create a content migration
   * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
   * @param groupId ID (required)
   * @param migrationType  (optional)
   * @param preAttachmentName  (optional)
   * @param preAttachmentTodo  (optional)
   * @param settingsFileUrl  (optional)
   * @param settingsSourceCourseId  (optional)
   * @param settingsFolderId  (optional)
   * @param settingsOverwriteQuizzes  (optional)
   * @param settingsQuestionBankId  (optional)
   * @param settingsQuestionBankName  (optional)
   * @param dateShiftOptionsShiftDates  (optional)
   * @param dateShiftOptionsOldStartDate  (optional)
   * @param dateShiftOptionsOldEndDate  (optional)
   * @param dateShiftOptionsNewStartDate  (optional)
   * @param dateShiftOptionsNewEndDate  (optional)
   * @param dateShiftOptionsDaySubstitutionsX  (optional)
   * @param dateShiftOptionsRemoveDates  (optional)
   * @return ContentMigration
   */
  @RequestLine("POST /v1/groups/{groupId}/content_migrations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentMigration createContentMigrationGroups(@Param("groupId") String groupId, @Param("migrationType") String migrationType, @Param("preAttachmentName") String preAttachmentName, @Param("preAttachmentTodo") String preAttachmentTodo, @Param("settingsFileUrl") String settingsFileUrl, @Param("settingsSourceCourseId") String settingsSourceCourseId, @Param("settingsFolderId") String settingsFolderId, @Param("settingsOverwriteQuizzes") Boolean settingsOverwriteQuizzes, @Param("settingsQuestionBankId") Integer settingsQuestionBankId, @Param("settingsQuestionBankName") String settingsQuestionBankName, @Param("dateShiftOptionsShiftDates") Boolean dateShiftOptionsShiftDates, @Param("dateShiftOptionsOldStartDate") String dateShiftOptionsOldStartDate, @Param("dateShiftOptionsOldEndDate") String dateShiftOptionsOldEndDate, @Param("dateShiftOptionsNewStartDate") String dateShiftOptionsNewStartDate, @Param("dateShiftOptionsNewEndDate") String dateShiftOptionsNewEndDate, @Param("dateShiftOptionsDaySubstitutionsX") Integer dateShiftOptionsDaySubstitutionsX, @Param("dateShiftOptionsRemoveDates") Boolean dateShiftOptionsRemoveDates);
  
  /**
   * Create a content migration
   * Create a content migration. If the migration requires a file to be uploaded the actual processing of the file will start once the file upload process is completed. File uploading works as described in the {file:file_uploads.html File Upload Documentation} except that the values are set on a *pre_attachment* sub-hash.  For migrations that don&#x27;t require a file to be uploaded, like course copy, the processing will begin as soon as the migration is created.  You can use the {api:ProgressController#show Progress API} to track the progress of the migration. The migration&#x27;s progress is linked to with the _progress_url_ value.  The two general workflows are:  If no file upload is needed:  1. POST to create 2. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress  For file uploading:  1. POST to create with file info in *pre_attachment* 2. Do {file:file_uploads.html file upload processing} using the data in the *pre_attachment* data 3. {api:ContentMigrationsController#show GET} the ContentMigration 4. Use the {api:ProgressController#show Progress} specified in _progress_url_ to monitor progress   (required if doing .zip file upload)
   * @param userId ID (required)
   * @param migrationType  (optional)
   * @param preAttachmentName  (optional)
   * @param preAttachmentTodo  (optional)
   * @param settingsFileUrl  (optional)
   * @param settingsSourceCourseId  (optional)
   * @param settingsFolderId  (optional)
   * @param settingsOverwriteQuizzes  (optional)
   * @param settingsQuestionBankId  (optional)
   * @param settingsQuestionBankName  (optional)
   * @param dateShiftOptionsShiftDates  (optional)
   * @param dateShiftOptionsOldStartDate  (optional)
   * @param dateShiftOptionsOldEndDate  (optional)
   * @param dateShiftOptionsNewStartDate  (optional)
   * @param dateShiftOptionsNewEndDate  (optional)
   * @param dateShiftOptionsDaySubstitutionsX  (optional)
   * @param dateShiftOptionsRemoveDates  (optional)
   * @return ContentMigration
   */
  @RequestLine("POST /v1/users/{userId}/content_migrations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentMigration createContentMigrationUsers(@Param("userId") String userId, @Param("migrationType") String migrationType, @Param("preAttachmentName") String preAttachmentName, @Param("preAttachmentTodo") String preAttachmentTodo, @Param("settingsFileUrl") String settingsFileUrl, @Param("settingsSourceCourseId") String settingsSourceCourseId, @Param("settingsFolderId") String settingsFolderId, @Param("settingsOverwriteQuizzes") Boolean settingsOverwriteQuizzes, @Param("settingsQuestionBankId") Integer settingsQuestionBankId, @Param("settingsQuestionBankName") String settingsQuestionBankName, @Param("dateShiftOptionsShiftDates") Boolean dateShiftOptionsShiftDates, @Param("dateShiftOptionsOldStartDate") String dateShiftOptionsOldStartDate, @Param("dateShiftOptionsOldEndDate") String dateShiftOptionsOldEndDate, @Param("dateShiftOptionsNewStartDate") String dateShiftOptionsNewStartDate, @Param("dateShiftOptionsNewEndDate") String dateShiftOptionsNewEndDate, @Param("dateShiftOptionsDaySubstitutionsX") Integer dateShiftOptionsDaySubstitutionsX, @Param("dateShiftOptionsRemoveDates") Boolean dateShiftOptionsRemoveDates);
  
  /**
   * Get a content migration
   * Returns data on an individual content migration
   * @param accountId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("GET /v1/accounts/{accountId}/content_migrations/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentMigration getContentMigrationAccounts(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Get a content migration
   * Returns data on an individual content migration
   * @param courseId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("GET /v1/courses/{courseId}/content_migrations/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentMigration getContentMigrationCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Get a content migration
   * Returns data on an individual content migration
   * @param groupId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("GET /v1/groups/{groupId}/content_migrations/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentMigration getContentMigrationGroups(@Param("groupId") String groupId, @Param("id") String id);
  
  /**
   * Get a content migration
   * Returns data on an individual content migration
   * @param userId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("GET /v1/users/{userId}/content_migrations/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentMigration getContentMigrationUsers(@Param("userId") String userId, @Param("id") String id);
  
  /**
   * Get a migration issue
   * Returns data on an individual migration issue
   * @param accountId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @return MigrationIssue
   */
  @RequestLine("GET /v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Accept: application/json",
  })
  MigrationIssue getMigrationIssueAccounts(@Param("accountId") String accountId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id);
  
  /**
   * Get a migration issue
   * Returns data on an individual migration issue
   * @param courseId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @return MigrationIssue
   */
  @RequestLine("GET /v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Accept: application/json",
  })
  MigrationIssue getMigrationIssueCourses(@Param("courseId") String courseId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id);
  
  /**
   * Get a migration issue
   * Returns data on an individual migration issue
   * @param groupId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @return MigrationIssue
   */
  @RequestLine("GET /v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Accept: application/json",
  })
  MigrationIssue getMigrationIssueGroups(@Param("groupId") String groupId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id);
  
  /**
   * Get a migration issue
   * Returns data on an individual migration issue
   * @param userId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @return MigrationIssue
   */
  @RequestLine("GET /v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Accept: application/json",
  })
  MigrationIssue getMigrationIssueUsers(@Param("userId") String userId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id);
  
  /**
   * List content migrations
   * Returns paginated content migrations
   * @param accountId ID (required)
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/content_migrations")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsAccounts(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsAccounts(URI uri);
  
  /**
   * List content migrations
   * Returns paginated content migrations
   * @param courseId ID (required)
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/content_migrations")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsCourses(URI uri);
  
  /**
   * List content migrations
   * Returns paginated content migrations
   * @param groupId ID (required)
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/content_migrations")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsGroups(URI uri);
  
  /**
   * List content migrations
   * Returns paginated content migrations
   * @param userId ID (required)
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET /v1/users/{userId}/content_migrations")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentMigration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentMigration> listContentMigrationsUsers(URI uri);
  
  /**
   * List migration issues
   * Returns paginated migration issues
   * @param accountId ID (required)
   * @param contentMigrationId ID (required)
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesAccounts(@Param("accountId") String accountId, @Param("contentMigrationId") String contentMigrationId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesAccounts(URI uri);
  
  /**
   * List migration issues
   * Returns paginated migration issues
   * @param courseId ID (required)
   * @param contentMigrationId ID (required)
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesCourses(@Param("courseId") String courseId, @Param("contentMigrationId") String contentMigrationId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesCourses(URI uri);
  
  /**
   * List migration issues
   * Returns paginated migration issues
   * @param groupId ID (required)
   * @param contentMigrationId ID (required)
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesGroups(@Param("groupId") String groupId, @Param("contentMigrationId") String contentMigrationId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesGroups(URI uri);
  
  /**
   * List migration issues
   * Returns paginated migration issues
   * @param userId ID (required)
   * @param contentMigrationId ID (required)
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET /v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesUsers(@Param("userId") String userId, @Param("contentMigrationId") String contentMigrationId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;MigrationIssue&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<MigrationIssue> listMigrationIssuesUsers(URI uri);
  
  /**
   * List Migration Systems
   * Lists the currently available migration types. These values may change.
   * @param accountId ID (required)
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/content_migrations/migrators")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsAccounts(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsAccounts(URI uri);
  
  /**
   * List Migration Systems
   * Lists the currently available migration types. These values may change.
   * @param courseId ID (required)
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/content_migrations/migrators")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsCourses(URI uri);
  
  /**
   * List Migration Systems
   * Lists the currently available migration types. These values may change.
   * @param groupId ID (required)
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/content_migrations/migrators")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsGroups(URI uri);
  
  /**
   * List Migration Systems
   * Lists the currently available migration types. These values may change.
   * @param userId ID (required)
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET /v1/users/{userId}/content_migrations/migrators")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Migrator&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Migrator> listMigrationSystemsUsers(URI uri);
  
  /**
   * Update a content migration
   * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
   * @param accountId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("PUT /v1/accounts/{accountId}/content_migrations/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ContentMigration updateContentMigrationAccounts(@Param("accountId") String accountId, @Param("id") String id);
  
  /**
   * Update a content migration
   * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("PUT /v1/courses/{courseId}/content_migrations/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ContentMigration updateContentMigrationCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Update a content migration
   * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
   * @param groupId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("PUT /v1/groups/{groupId}/content_migrations/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ContentMigration updateContentMigrationGroups(@Param("groupId") String groupId, @Param("id") String id);
  
  /**
   * Update a content migration
   * Update a content migration. Takes same arguments as create except that you can&#x27;t change the migration type. However, changing most settings after the migration process has started will not do anything. Generally updating the content migration will be used when there is a file upload problem. If the first upload has a problem you can supply new _pre_attachment_ values to start the process again.
   * @param userId ID (required)
   * @param id ID (required)
   * @return ContentMigration
   */
  @RequestLine("PUT /v1/users/{userId}/content_migrations/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ContentMigration updateContentMigrationUsers(@Param("userId") String userId, @Param("id") String id);
  
  /**
   * Update a migration issue
   * Update the workflow_state of a migration issue
   * @param accountId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @param workflowState  (optional)
   * @return MigrationIssue
   */
  @RequestLine("PUT /v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  MigrationIssue updateMigrationIssueAccounts(@Param("accountId") String accountId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id, @Param("workflowState") String workflowState);
  
  /**
   * Update a migration issue
   * Update the workflow_state of a migration issue
   * @param courseId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @param workflowState  (optional)
   * @return MigrationIssue
   */
  @RequestLine("PUT /v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  MigrationIssue updateMigrationIssueCourses(@Param("courseId") String courseId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id, @Param("workflowState") String workflowState);
  
  /**
   * Update a migration issue
   * Update the workflow_state of a migration issue
   * @param groupId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @param workflowState  (optional)
   * @return MigrationIssue
   */
  @RequestLine("PUT /v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  MigrationIssue updateMigrationIssueGroups(@Param("groupId") String groupId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id, @Param("workflowState") String workflowState);
  
  /**
   * Update a migration issue
   * Update the workflow_state of a migration issue
   * @param userId ID (required)
   * @param contentMigrationId ID (required)
   * @param id ID (required)
   * @param workflowState  (optional)
   * @return MigrationIssue
   */
  @RequestLine("PUT /v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  MigrationIssue updateMigrationIssueUsers(@Param("userId") String userId, @Param("contentMigrationId") String contentMigrationId, @Param("id") String id, @Param("workflowState") String workflowState);
  
}
