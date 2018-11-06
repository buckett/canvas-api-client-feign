package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.CourseEpubExport;
import com.instructure.canvas.model.EpubExport;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface EPubExportsApi extends ApiClient.Api {

  /**
   * Create ePub Export
   * Begin an ePub export for a course.  You can use the {api:ProgressController#show Progress API} to track the progress of the export. The export&#x27;s progress is linked to with the _progress_url_ value.  When the export completes, use the {api:EpubExportsController#show Show content export} endpoint to retrieve a download URL for the exported content.
   * @param courseId ID (required)
   * @return EpubExport
   */
  @RequestLine("POST /v1/courses/{courseId}/epub_exports")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  EpubExport createEpubExport(@Param("courseId") String courseId);
  
  /**
   * List courses with their latest ePub export
   * A paginated list of all courses a user is actively participating in, and the latest ePub export associated with the user &amp; course.
   * @return List&lt;CourseEpubExport&gt;
   */
  @RequestLine("GET /v1/epub_exports")
  @Headers({
      "Accept: application/json",
  })
  List<CourseEpubExport> listCoursesWithTheirLatestEpubExport();

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CourseEpubExport&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CourseEpubExport> listCoursesWithTheirLatestEpubExport(URI uri);
  
  /**
   * Show ePub export
   * Get information about a single ePub export.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return EpubExport
   */
  @RequestLine("GET /v1/courses/{courseId}/epub_exports/{id}")
  @Headers({
      "Accept: application/json",
  })
  EpubExport showEpubExport(@Param("courseId") String courseId, @Param("id") String id);
  
}
