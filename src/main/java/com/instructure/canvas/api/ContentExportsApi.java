package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.ContentExport;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface ContentExportsApi extends ApiClient.Api {

  /**
   * Export content
   * Begin a content export job for a course, group, or user.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The migration&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:ContentExportsApiController#show Show content export} endpoint to retrieve a download URL for the exported content.
   * @param courseId ID (required)
   * @param exportType  (optional)
   * @param skipNotifications  (optional)
   * @param select  (optional)
   * @return ContentExport
   */
  @RequestLine("POST /v1/courses/{courseId}/content_exports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentExport exportContentCourses(@Param("courseId") String courseId, @Param("exportType") String exportType, @Param("skipNotifications") Boolean skipNotifications, @Param("select") Object select);
  
  /**
   * Export content
   * Begin a content export job for a course, group, or user.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The migration&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:ContentExportsApiController#show Show content export} endpoint to retrieve a download URL for the exported content.
   * @param groupId ID (required)
   * @param exportType  (optional)
   * @param skipNotifications  (optional)
   * @param select  (optional)
   * @return ContentExport
   */
  @RequestLine("POST /v1/groups/{groupId}/content_exports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentExport exportContentGroups(@Param("groupId") String groupId, @Param("exportType") String exportType, @Param("skipNotifications") Boolean skipNotifications, @Param("select") Object select);
  
  /**
   * Export content
   * Begin a content export job for a course, group, or user.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The migration&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:ContentExportsApiController#show Show content export} endpoint to retrieve a download URL for the exported content.
   * @param userId ID (required)
   * @param exportType  (optional)
   * @param skipNotifications  (optional)
   * @param select  (optional)
   * @return ContentExport
   */
  @RequestLine("POST /v1/users/{userId}/content_exports")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ContentExport exportContentUsers(@Param("userId") String userId, @Param("exportType") String exportType, @Param("skipNotifications") Boolean skipNotifications, @Param("select") Object select);
  
  /**
   * List content exports
   * A paginated list of the past and pending content export jobs for a course, group, or user. Exports are returned newest first.
   * @param courseId ID (required)
   * @return List&lt;ContentExport&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/content_exports")
  @Headers({
      "Accept: application/json",
  })
  List<ContentExport> listContentExportsCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentExport&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentExport> listContentExportsCourses(URI uri);
  
  /**
   * List content exports
   * A paginated list of the past and pending content export jobs for a course, group, or user. Exports are returned newest first.
   * @param groupId ID (required)
   * @return List&lt;ContentExport&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/content_exports")
  @Headers({
      "Accept: application/json",
  })
  List<ContentExport> listContentExportsGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentExport&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentExport> listContentExportsGroups(URI uri);
  
  /**
   * List content exports
   * A paginated list of the past and pending content export jobs for a course, group, or user. Exports are returned newest first.
   * @param userId ID (required)
   * @return List&lt;ContentExport&gt;
   */
  @RequestLine("GET /v1/users/{userId}/content_exports")
  @Headers({
      "Accept: application/json",
  })
  List<ContentExport> listContentExportsUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ContentExport&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ContentExport> listContentExportsUsers(URI uri);
  
  /**
   * Show content export
   * Get information about a single content export.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return ContentExport
   */
  @RequestLine("GET /v1/courses/{courseId}/content_exports/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentExport showContentExportCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Show content export
   * Get information about a single content export.
   * @param groupId ID (required)
   * @param id ID (required)
   * @return ContentExport
   */
  @RequestLine("GET /v1/groups/{groupId}/content_exports/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentExport showContentExportGroups(@Param("groupId") String groupId, @Param("id") String id);
  
  /**
   * Show content export
   * Get information about a single content export.
   * @param userId ID (required)
   * @param id ID (required)
   * @return ContentExport
   */
  @RequestLine("GET /v1/users/{userId}/content_exports/{id}")
  @Headers({
      "Accept: application/json",
  })
  ContentExport showContentExportUsers(@Param("userId") String userId, @Param("id") String id);
  
}
