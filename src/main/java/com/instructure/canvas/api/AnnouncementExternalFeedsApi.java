package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.ExternalFeed;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface AnnouncementExternalFeedsApi extends ApiClient.Api {

  /**
   * Create an external feed
   * Create a new external feed for the course or group.
   * @param courseId ID (required)
   * @param url  (optional)
   * @param headerMatch  (optional)
   * @param verbosity  (optional)
   * @return ExternalFeed
   */
  @RequestLine("POST /v1/courses/{courseId}/external_feeds")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ExternalFeed createExternalFeedCourses(@Param("courseId") String courseId, @Param("url") String url, @Param("headerMatch") Boolean headerMatch, @Param("verbosity") String verbosity);
  
  /**
   * Create an external feed
   * Create a new external feed for the course or group.
   * @param groupId ID (required)
   * @param url  (optional)
   * @param headerMatch  (optional)
   * @param verbosity  (optional)
   * @return ExternalFeed
   */
  @RequestLine("POST /v1/groups/{groupId}/external_feeds")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  ExternalFeed createExternalFeedGroups(@Param("groupId") String groupId, @Param("url") String url, @Param("headerMatch") Boolean headerMatch, @Param("verbosity") String verbosity);
  
  /**
   * Delete an external feed
   * Deletes the external feed.
   * @param courseId ID (required)
   * @param externalFeedId ID (required)
   * @return ExternalFeed
   */
  @RequestLine("DELETE /v1/courses/{courseId}/external_feeds/{externalFeedId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ExternalFeed deleteExternalFeedCourses(@Param("courseId") String courseId, @Param("externalFeedId") String externalFeedId);
  
  /**
   * Delete an external feed
   * Deletes the external feed.
   * @param groupId ID (required)
   * @param externalFeedId ID (required)
   * @return ExternalFeed
   */
  @RequestLine("DELETE /v1/groups/{groupId}/external_feeds/{externalFeedId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  ExternalFeed deleteExternalFeedGroups(@Param("groupId") String groupId, @Param("externalFeedId") String externalFeedId);
  
  /**
   * List external feeds
   * Returns the paginated list of External Feeds this course or group.
   * @param courseId ID (required)
   * @return List&lt;ExternalFeed&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/external_feeds")
  @Headers({
      "Accept: application/json",
  })
  List<ExternalFeed> listExternalFeedsCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ExternalFeed&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ExternalFeed> listExternalFeedsCourses(URI uri);
  
  /**
   * List external feeds
   * Returns the paginated list of External Feeds this course or group.
   * @param groupId ID (required)
   * @return List&lt;ExternalFeed&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/external_feeds")
  @Headers({
      "Accept: application/json",
  })
  List<ExternalFeed> listExternalFeedsGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;ExternalFeed&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<ExternalFeed> listExternalFeedsGroups(URI uri);
  
}
