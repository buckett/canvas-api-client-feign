package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Bookmark;
import com.instructure.canvas.model.Folder;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface BookmarksApi extends ApiClient.Api {

  /**
   * Create bookmark
   * Creates a bookmark.
   * @param name  (optional)
   * @param url  (optional)
   * @param position  (optional)
   * @param data  (optional)
   * @return Bookmark
   */
  @RequestLine("POST /v1/users/self/bookmarks")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Bookmark createBookmark(@Param("name") String name, @Param("url") String url, @Param("position") Integer position, @Param("data") String data);
  
  /**
   * Delete bookmark
   * Deletes a bookmark
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/users/self/bookmarks/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteBookmark(@Param("id") String id);
  
  /**
   * Get bookmark
   * Returns the details for a bookmark.
   * @param id ID (required)
   * @return Bookmark
   */
  @RequestLine("GET /v1/users/self/bookmarks/{id}")
  @Headers({
      "Accept: application/json",
  })
  Bookmark getBookmark(@Param("id") String id);
  
  /**
   * List bookmarks
   * Returns the paginated list of bookmarks.
   * @return List&lt;Bookmark&gt;
   */
  @RequestLine("GET /v1/users/self/bookmarks")
  @Headers({
      "Accept: application/json",
  })
  List<Bookmark> listBookmarks();

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Bookmark&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Bookmark> listBookmarks(URI uri);
  
  /**
   * Update bookmark
   * Updates a bookmark
   * @param id ID (required)
   * @param name  (optional)
   * @param url  (optional)
   * @param position  (optional)
   * @param data  (optional)
   * @return Folder
   */
  @RequestLine("PUT /v1/users/self/bookmarks/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder updateBookmark(@Param("id") String id, @Param("name") String name, @Param("url") String url, @Param("position") Integer position, @Param("data") String data);
  
}
