package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.BlueprintMigration;
import com.instructure.canvas.model.BlueprintSubscription;
import com.instructure.canvas.model.BlueprintTemplate;
import com.instructure.canvas.model.ChangeRecord;
import com.instructure.canvas.model.Course;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface BlueprintCoursesApi extends ApiClient.Api {

  /**
   * Begin a migration to push to associated courses
   * Begins a migration to push recently updated content to all associated courses. Only one migration can be running at a time.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @param comment  (optional)
   * @param sendNotification  (optional)
   * @param copySettings  (optional)
   * @return BlueprintMigration
   */
  @RequestLine("POST /v1/courses/{courseId}/blueprint_templates/{templateId}/migrations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  BlueprintMigration beginMigrationToPushToAssociatedCourses(@Param("courseId") String courseId, @Param("templateId") String templateId, @Param("comment") String comment, @Param("sendNotification") Boolean sendNotification, @Param("copySettings") Boolean copySettings);
  
  /**
   * Get associated course information
   * Returns a list of courses that are configured to receive updates from this blueprint
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_templates/{templateId}/associated_courses")
  @Headers({
      "Accept: application/json",
  })
  List<Course> getAssociatedCourseInformation(@Param("courseId") String courseId, @Param("templateId") String templateId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Course> getAssociatedCourseInformation(URI uri);
  
  /**
   * Get blueprint information
   * Using &#x27;default&#x27; as the template_id should suffice for the current implmentation (as there should be only one template per course). However, using specific template ids may become necessary in the future
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @return BlueprintTemplate
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_templates/{templateId}")
  @Headers({
      "Accept: application/json",
  })
  BlueprintTemplate getBlueprintInformation(@Param("courseId") String courseId, @Param("templateId") String templateId);
  
  /**
   * Get import details
   * Show the changes that were propagated to a course associated with a blueprint.  See also {api:MasterCourses::MasterTemplatesController#migration_details the blueprint course side}.
   * @param courseId ID (required)
   * @param subscriptionId ID (required)
   * @param id ID (required)
   * @return List&lt;ChangeRecord&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_subscriptions/{subscriptionId}/migrations/{id}/details")
  @Headers({
      "Accept: application/json",
  })
  List<ChangeRecord> getImportDetails(@Param("courseId") String courseId, @Param("subscriptionId") String subscriptionId, @Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ChangeRecord&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ChangeRecord> getImportDetails(URI uri);
  
  /**
   * Get migration details
   * Show the changes that were propagated in a blueprint migration. This endpoint can be called on a blueprint course. See also {api:MasterCourses::MasterTemplatesController#import_details the associated course side}.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @param id ID (required)
   * @return List&lt;ChangeRecord&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_templates/{templateId}/migrations/{id}/details")
  @Headers({
      "Accept: application/json",
  })
  List<ChangeRecord> getMigrationDetails(@Param("courseId") String courseId, @Param("templateId") String templateId, @Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ChangeRecord&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ChangeRecord> getMigrationDetails(URI uri);
  
  /**
   * Get unsynced changes
   * Retrieve a list of learning objects that have changed since the last blueprint sync operation.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @return List&lt;ChangeRecord&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_templates/{templateId}/unsynced_changes")
  @Headers({
      "Accept: application/json",
  })
  List<ChangeRecord> getUnsyncedChanges(@Param("courseId") String courseId, @Param("templateId") String templateId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ChangeRecord&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ChangeRecord> getUnsyncedChanges(URI uri);
  
  /**
   * List blueprint imports
   * Shows a paginated list of migrations imported into a course associated with a blueprint, starting with the most recent. See also {api:MasterCourses::MasterTemplatesController#migrations_index the blueprint course side}.  Use &#x27;default&#x27; as the subscription_id to use the currently active blueprint subscription.
   * @param courseId ID (required)
   * @param subscriptionId ID (required)
   * @return List&lt;BlueprintMigration&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_subscriptions/{subscriptionId}/migrations")
  @Headers({
      "Accept: application/json",
  })
  List<BlueprintMigration> listBlueprintImports(@Param("courseId") String courseId, @Param("subscriptionId") String subscriptionId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;BlueprintMigration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<BlueprintMigration> listBlueprintImports(URI uri);
  
  /**
   * List blueprint migrations
   * Shows a paginated list of migrations for the template, starting with the most recent. This endpoint can be called on a blueprint course. See also {api:MasterCourses::MasterTemplatesController#imports_index the associated course side}.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @return List&lt;BlueprintMigration&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_templates/{templateId}/migrations")
  @Headers({
      "Accept: application/json",
  })
  List<BlueprintMigration> listBlueprintMigrations(@Param("courseId") String courseId, @Param("templateId") String templateId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;BlueprintMigration&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<BlueprintMigration> listBlueprintMigrations(URI uri);
  
  /**
   * List blueprint subscriptions
   * Returns a list of blueprint subscriptions for the given course. (Currently a course may have no more than one.)
   * @param courseId ID (required)
   * @return List&lt;BlueprintSubscription&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_subscriptions")
  @Headers({
      "Accept: application/json",
  })
  List<BlueprintSubscription> listBlueprintSubscriptions(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;BlueprintSubscription&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<BlueprintSubscription> listBlueprintSubscriptions(URI uri);
  
  /**
   * Set or remove restrictions on a blueprint course object
   * If a blueprint course object is restricted, editing will be limited for copies in associated courses.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @param contentType  (optional)
   * @param contentId  (optional)
   * @param restricted  (optional)
   * @param restrictions  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/blueprint_templates/{templateId}/restrict_item")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void setOrRemoveRestrictionsOnBlueprintCourseObject(@Param("courseId") String courseId, @Param("templateId") String templateId, @Param("contentType") String contentType, @Param("contentId") Integer contentId, @Param("restricted") Boolean restricted, @Param("restrictions") Object restrictions);
  
  /**
   * Show a blueprint import
   * Shows the status of an import into a course associated with a blueprint. See also {api:MasterCourses::MasterTemplatesController#migrations_show the blueprint course side}.
   * @param courseId ID (required)
   * @param subscriptionId ID (required)
   * @param id ID (required)
   * @return BlueprintMigration
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_subscriptions/{subscriptionId}/migrations/{id}")
  @Headers({
      "Accept: application/json",
  })
  BlueprintMigration showBlueprintImport(@Param("courseId") String courseId, @Param("subscriptionId") String subscriptionId, @Param("id") String id);
  
  /**
   * Show a blueprint migration
   * Shows the status of a migration. This endpoint can be called on a blueprint course. See also {api:MasterCourses::MasterTemplatesController#imports_show the associated course side}.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @param id ID (required)
   * @return BlueprintMigration
   */
  @RequestLine("GET /v1/courses/{courseId}/blueprint_templates/{templateId}/migrations/{id}")
  @Headers({
      "Accept: application/json",
  })
  BlueprintMigration showBlueprintMigration(@Param("courseId") String courseId, @Param("templateId") String templateId, @Param("id") String id);
  
  /**
   * Update associated courses
   * Send a list of course ids to add or remove new associations for the template. Cannot add courses that do not belong to the blueprint course&#x27;s account. Also cannot add other blueprint courses or courses that already have an association with another blueprint course.
   * @param courseId ID (required)
   * @param templateId ID (required)
   * @param courseIdsToAdd  (optional)
   * @param courseIdsToRemove  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/blueprint_templates/{templateId}/update_associations")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateAssociatedCourses(@Param("courseId") String courseId, @Param("templateId") String templateId, @Param("courseIdsToAdd") List<String> courseIdsToAdd, @Param("courseIdsToRemove") List<String> courseIdsToRemove);
  
}
