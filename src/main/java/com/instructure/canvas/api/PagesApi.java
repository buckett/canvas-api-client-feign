package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Page;
import com.instructure.canvas.model.PageRevision;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PagesApi extends ApiClient.Api {

  /**
   * Create page
   * Create a new wiki page
   * @param courseId ID (required)
   * @param wikiPageTitle  (optional)
   * @param wikiPageBody  (optional)
   * @param wikiPageEditingRoles  (optional)
   * @param wikiPageNotifyOfUpdate  (optional)
   * @param wikiPagePublished  (optional)
   * @param wikiPageFrontPage  (optional)
   * @return Page
   */
  @RequestLine("POST /v1/courses/{courseId}/pages")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Page createPageCourses(@Param("courseId") String courseId, @Param("wikiPageTitle") String wikiPageTitle, @Param("wikiPageBody") String wikiPageBody, @Param("wikiPageEditingRoles") String wikiPageEditingRoles, @Param("wikiPageNotifyOfUpdate") Boolean wikiPageNotifyOfUpdate, @Param("wikiPagePublished") Boolean wikiPagePublished, @Param("wikiPageFrontPage") Boolean wikiPageFrontPage);
  
  /**
   * Create page
   * Create a new wiki page
   * @param groupId ID (required)
   * @param wikiPageTitle  (optional)
   * @param wikiPageBody  (optional)
   * @param wikiPageEditingRoles  (optional)
   * @param wikiPageNotifyOfUpdate  (optional)
   * @param wikiPagePublished  (optional)
   * @param wikiPageFrontPage  (optional)
   * @return Page
   */
  @RequestLine("POST /v1/groups/{groupId}/pages")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Page createPageGroups(@Param("groupId") String groupId, @Param("wikiPageTitle") String wikiPageTitle, @Param("wikiPageBody") String wikiPageBody, @Param("wikiPageEditingRoles") String wikiPageEditingRoles, @Param("wikiPageNotifyOfUpdate") Boolean wikiPageNotifyOfUpdate, @Param("wikiPagePublished") Boolean wikiPagePublished, @Param("wikiPageFrontPage") Boolean wikiPageFrontPage);
  
  /**
   * Delete page
   * Delete a wiki page
   * @param courseId ID (required)
   * @param url ID (required)
   * @return Page
   */
  @RequestLine("DELETE /v1/courses/{courseId}/pages/{url}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Page deletePageCourses(@Param("courseId") String courseId, @Param("url") String url);
  
  /**
   * Delete page
   * Delete a wiki page
   * @param groupId ID (required)
   * @param url ID (required)
   * @return Page
   */
  @RequestLine("DELETE /v1/groups/{groupId}/pages/{url}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Page deletePageGroups(@Param("groupId") String groupId, @Param("url") String url);
  
  /**
   * Duplicate page
   * Duplicate a wiki page
   * @param courseId ID (required)
   * @param url ID (required)
   * @return Page
   */
  @RequestLine("POST /v1/courses/{courseId}/pages/{url}/duplicate")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Page duplicatePage(@Param("courseId") String courseId, @Param("url") String url);
  
  /**
   * List pages
   * A paginated list of the wiki pages associated with a course or group
   * @param courseId ID (required)
   * @param sort Sort results by this field. (optional)
   * @param order The sorting order. Defaults to &#x27;asc&#x27;. (optional)
   * @param searchTerm The partial title of the pages to match and return. (optional)
   * @param published If true, include only published paqes. If false, exclude published pages. If not present, do not filter on published status. (optional)
   * @return List&lt;Page&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/pages?sort={sort}&order={order}&search_term={searchTerm}&published={published}")
  @Headers({
      "Accept: application/json",
  })
  List<Page> listPagesCourses(@Param("courseId") String courseId, @Param("sort") String sort, @Param("order") String order, @Param("searchTerm") String searchTerm, @Param("published") Boolean published);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Page&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Page> listPagesCourses(URI uri);
  

  /**
   * List pages
   * A paginated list of the wiki pages associated with a course or group
   * Note, this is equivalent to the other <code>listPagesCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPagesCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sort - Sort results by this field. (optional)</li>
   *   <li>order - The sorting order. Defaults to &#x27;asc&#x27;. (optional)</li>
   *   <li>searchTerm - The partial title of the pages to match and return. (optional)</li>
   *   <li>published - If true, include only published paqes. If false, exclude published pages. If not present, do not filter on published status. (optional)</li>
   *   </ul>
   * @return List&lt;Page&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/pages?sort={sort}&order={order}&search_term={searchTerm}&published={published}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Page> listPagesCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPagesCourses</code> method in a fluent style.
   */
  public static class ListPagesCoursesQueryParams extends HashMap<String, Object> {
    public ListPagesCoursesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public ListPagesCoursesQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public ListPagesCoursesQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListPagesCoursesQueryParams published(final Boolean value) {
      put("published", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List pages
   * A paginated list of the wiki pages associated with a course or group
   * @param groupId ID (required)
   * @param sort Sort results by this field. (optional)
   * @param order The sorting order. Defaults to &#x27;asc&#x27;. (optional)
   * @param searchTerm The partial title of the pages to match and return. (optional)
   * @param published If true, include only published paqes. If false, exclude published pages. If not present, do not filter on published status. (optional)
   * @return List&lt;Page&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/pages?sort={sort}&order={order}&search_term={searchTerm}&published={published}")
  @Headers({
      "Accept: application/json",
  })
  List<Page> listPagesGroups(@Param("groupId") String groupId, @Param("sort") String sort, @Param("order") String order, @Param("searchTerm") String searchTerm, @Param("published") Boolean published);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Page&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Page> listPagesGroups(URI uri);
  

  /**
   * List pages
   * A paginated list of the wiki pages associated with a course or group
   * Note, this is equivalent to the other <code>listPagesGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPagesGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sort - Sort results by this field. (optional)</li>
   *   <li>order - The sorting order. Defaults to &#x27;asc&#x27;. (optional)</li>
   *   <li>searchTerm - The partial title of the pages to match and return. (optional)</li>
   *   <li>published - If true, include only published paqes. If false, exclude published pages. If not present, do not filter on published status. (optional)</li>
   *   </ul>
   * @return List&lt;Page&gt;

   */
  @RequestLine("GET /v1/groups/{groupId}/pages?sort={sort}&order={order}&search_term={searchTerm}&published={published}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Page> listPagesGroups(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listPagesGroups</code> method in a fluent style.
   */
  public static class ListPagesGroupsQueryParams extends HashMap<String, Object> {
    public ListPagesGroupsQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public ListPagesGroupsQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
    public ListPagesGroupsQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListPagesGroupsQueryParams published(final Boolean value) {
      put("published", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List revisions
   * A paginated list of the revisions of a page. Callers must have update rights on the page in order to see page history.
   * @param courseId ID (required)
   * @param url ID (required)
   * @return List&lt;PageRevision&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/pages/{url}/revisions")
  @Headers({
      "Accept: application/json",
  })
  List<PageRevision> listRevisionsCourses(@Param("courseId") String courseId, @Param("url") String url);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PageRevision&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PageRevision> listRevisionsCourses(URI uri);
  
  /**
   * List revisions
   * A paginated list of the revisions of a page. Callers must have update rights on the page in order to see page history.
   * @param groupId ID (required)
   * @param url ID (required)
   * @return List&lt;PageRevision&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/pages/{url}/revisions")
  @Headers({
      "Accept: application/json",
  })
  List<PageRevision> listRevisionsGroups(@Param("groupId") String groupId, @Param("url") String url);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PageRevision&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PageRevision> listRevisionsGroups(URI uri);
  
  /**
   * Revert to revision
   * Revert a page to a prior revision.
   * @param courseId ID (required)
   * @param url ID (required)
   * @param revisionId The revision to revert to (use the {api:WikiPagesApiController#revisions List Revisions API} to see available revisions) (required)
   * @return PageRevision
   */
  @RequestLine("POST /v1/courses/{courseId}/pages/{url}/revisions/{revisionId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PageRevision revertToRevisionCourses(@Param("courseId") String courseId, @Param("url") String url, @Param("revisionId") Integer revisionId);
  
  /**
   * Revert to revision
   * Revert a page to a prior revision.
   * @param groupId ID (required)
   * @param url ID (required)
   * @param revisionId The revision to revert to (use the {api:WikiPagesApiController#revisions List Revisions API} to see available revisions) (required)
   * @return PageRevision
   */
  @RequestLine("POST /v1/groups/{groupId}/pages/{url}/revisions/{revisionId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PageRevision revertToRevisionGroups(@Param("groupId") String groupId, @Param("url") String url, @Param("revisionId") Integer revisionId);
  
  /**
   * Show front page
   * Retrieve the content of the front page
   * @param courseId ID (required)
   * @return Page
   */
  @RequestLine("GET /v1/courses/{courseId}/front_page")
  @Headers({
      "Accept: application/json",
  })
  Page showFrontPageCourses(@Param("courseId") String courseId);
  
  /**
   * Show front page
   * Retrieve the content of the front page
   * @param groupId ID (required)
   * @return Page
   */
  @RequestLine("GET /v1/groups/{groupId}/front_page")
  @Headers({
      "Accept: application/json",
  })
  Page showFrontPageGroups(@Param("groupId") String groupId);
  
  /**
   * Show page
   * Retrieve the content of a wiki page
   * @param courseId ID (required)
   * @param url ID (required)
   * @return Page
   */
  @RequestLine("GET /v1/courses/{courseId}/pages/{url}")
  @Headers({
      "Accept: application/json",
  })
  Page showPageCourses(@Param("courseId") String courseId, @Param("url") String url);
  
  /**
   * Show page
   * Retrieve the content of a wiki page
   * @param groupId ID (required)
   * @param url ID (required)
   * @return Page
   */
  @RequestLine("GET /v1/groups/{groupId}/pages/{url}")
  @Headers({
      "Accept: application/json",
  })
  Page showPageGroups(@Param("groupId") String groupId, @Param("url") String url);
  
  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * @param courseId ID (required)
   * @param url ID (required)
   * @param summary If set, exclude page content from results (optional)
   * @return PageRevision
   */
  @RequestLine("GET /v1/courses/{courseId}/pages/{url}/revisions/latest?summary={summary}")
  @Headers({
      "Accept: application/json",
  })
  PageRevision showRevisionCoursesLatest(@Param("courseId") String courseId, @Param("url") String url, @Param("summary") Boolean summary);
  

  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * Note, this is equivalent to the other <code>showRevisionCoursesLatest</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowRevisionCoursesLatestQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param url ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>summary - If set, exclude page content from results (optional)</li>
   *   </ul>
   * @return PageRevision

   */
  @RequestLine("GET /v1/courses/{courseId}/pages/{url}/revisions/latest?summary={summary}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  PageRevision showRevisionCoursesLatest(@Param("courseId") String courseId, @Param("url") String url, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showRevisionCoursesLatest</code> method in a fluent style.
   */
  public static class ShowRevisionCoursesLatestQueryParams extends HashMap<String, Object> {
    public ShowRevisionCoursesLatestQueryParams summary(final Boolean value) {
      put("summary", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * @param courseId ID (required)
   * @param url ID (required)
   * @param revisionId ID (required)
   * @param summary If set, exclude page content from results (optional)
   * @return PageRevision
   */
  @RequestLine("GET /v1/courses/{courseId}/pages/{url}/revisions/{revisionId}?summary={summary}")
  @Headers({
      "Accept: application/json",
  })
  PageRevision showRevisionCoursesRevisionId(@Param("courseId") String courseId, @Param("url") String url, @Param("revisionId") String revisionId, @Param("summary") Boolean summary);
  

  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * Note, this is equivalent to the other <code>showRevisionCoursesRevisionId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowRevisionCoursesRevisionIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param url ID (required)
   * @param revisionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>summary - If set, exclude page content from results (optional)</li>
   *   </ul>
   * @return PageRevision

   */
  @RequestLine("GET /v1/courses/{courseId}/pages/{url}/revisions/{revisionId}?summary={summary}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  PageRevision showRevisionCoursesRevisionId(@Param("courseId") String courseId, @Param("url") String url, @Param("revisionId") String revisionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showRevisionCoursesRevisionId</code> method in a fluent style.
   */
  public static class ShowRevisionCoursesRevisionIdQueryParams extends HashMap<String, Object> {
    public ShowRevisionCoursesRevisionIdQueryParams summary(final Boolean value) {
      put("summary", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * @param groupId ID (required)
   * @param url ID (required)
   * @param summary If set, exclude page content from results (optional)
   * @return PageRevision
   */
  @RequestLine("GET /v1/groups/{groupId}/pages/{url}/revisions/latest?summary={summary}")
  @Headers({
      "Accept: application/json",
  })
  PageRevision showRevisionGroupsLatest(@Param("groupId") String groupId, @Param("url") String url, @Param("summary") Boolean summary);
  

  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * Note, this is equivalent to the other <code>showRevisionGroupsLatest</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowRevisionGroupsLatestQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param url ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>summary - If set, exclude page content from results (optional)</li>
   *   </ul>
   * @return PageRevision

   */
  @RequestLine("GET /v1/groups/{groupId}/pages/{url}/revisions/latest?summary={summary}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  PageRevision showRevisionGroupsLatest(@Param("groupId") String groupId, @Param("url") String url, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showRevisionGroupsLatest</code> method in a fluent style.
   */
  public static class ShowRevisionGroupsLatestQueryParams extends HashMap<String, Object> {
    public ShowRevisionGroupsLatestQueryParams summary(final Boolean value) {
      put("summary", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * @param groupId ID (required)
   * @param url ID (required)
   * @param revisionId ID (required)
   * @param summary If set, exclude page content from results (optional)
   * @return PageRevision
   */
  @RequestLine("GET /v1/groups/{groupId}/pages/{url}/revisions/{revisionId}?summary={summary}")
  @Headers({
      "Accept: application/json",
  })
  PageRevision showRevisionGroupsRevisionId(@Param("groupId") String groupId, @Param("url") String url, @Param("revisionId") String revisionId, @Param("summary") Boolean summary);
  

  /**
   * Show revision
   * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
   * Note, this is equivalent to the other <code>showRevisionGroupsRevisionId</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ShowRevisionGroupsRevisionIdQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param url ID (required)
   * @param revisionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>summary - If set, exclude page content from results (optional)</li>
   *   </ul>
   * @return PageRevision

   */
  @RequestLine("GET /v1/groups/{groupId}/pages/{url}/revisions/{revisionId}?summary={summary}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  PageRevision showRevisionGroupsRevisionId(@Param("groupId") String groupId, @Param("url") String url, @Param("revisionId") String revisionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>showRevisionGroupsRevisionId</code> method in a fluent style.
   */
  public static class ShowRevisionGroupsRevisionIdQueryParams extends HashMap<String, Object> {
    public ShowRevisionGroupsRevisionIdQueryParams summary(final Boolean value) {
      put("summary", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Update/create front page
   * Update the title or contents of the front page
   * @param courseId ID (required)
   * @param wikiPageTitle  (optional)
   * @param wikiPageBody  (optional)
   * @param wikiPageEditingRoles  (optional)
   * @param wikiPageNotifyOfUpdate  (optional)
   * @param wikiPagePublished  (optional)
   * @return Page
   */
  @RequestLine("PUT /v1/courses/{courseId}/front_page")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Page updateCreateFrontPageCourses(@Param("courseId") String courseId, @Param("wikiPageTitle") String wikiPageTitle, @Param("wikiPageBody") String wikiPageBody, @Param("wikiPageEditingRoles") String wikiPageEditingRoles, @Param("wikiPageNotifyOfUpdate") Boolean wikiPageNotifyOfUpdate, @Param("wikiPagePublished") Boolean wikiPagePublished);
  
  /**
   * Update/create front page
   * Update the title or contents of the front page
   * @param groupId ID (required)
   * @param wikiPageTitle  (optional)
   * @param wikiPageBody  (optional)
   * @param wikiPageEditingRoles  (optional)
   * @param wikiPageNotifyOfUpdate  (optional)
   * @param wikiPagePublished  (optional)
   * @return Page
   */
  @RequestLine("PUT /v1/groups/{groupId}/front_page")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Page updateCreateFrontPageGroups(@Param("groupId") String groupId, @Param("wikiPageTitle") String wikiPageTitle, @Param("wikiPageBody") String wikiPageBody, @Param("wikiPageEditingRoles") String wikiPageEditingRoles, @Param("wikiPageNotifyOfUpdate") Boolean wikiPageNotifyOfUpdate, @Param("wikiPagePublished") Boolean wikiPagePublished);
  
  /**
   * Update/create page
   * Update the title or contents of a wiki page
   * @param courseId ID (required)
   * @param url ID (required)
   * @param wikiPageTitle  (optional)
   * @param wikiPageBody  (optional)
   * @param wikiPageEditingRoles  (optional)
   * @param wikiPageNotifyOfUpdate  (optional)
   * @param wikiPagePublished  (optional)
   * @param wikiPageFrontPage  (optional)
   * @return Page
   */
  @RequestLine("PUT /v1/courses/{courseId}/pages/{url}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Page updateCreatePageCourses(@Param("courseId") String courseId, @Param("url") String url, @Param("wikiPageTitle") String wikiPageTitle, @Param("wikiPageBody") String wikiPageBody, @Param("wikiPageEditingRoles") String wikiPageEditingRoles, @Param("wikiPageNotifyOfUpdate") Boolean wikiPageNotifyOfUpdate, @Param("wikiPagePublished") Boolean wikiPagePublished, @Param("wikiPageFrontPage") Boolean wikiPageFrontPage);
  
  /**
   * Update/create page
   * Update the title or contents of a wiki page
   * @param groupId ID (required)
   * @param url ID (required)
   * @param wikiPageTitle  (optional)
   * @param wikiPageBody  (optional)
   * @param wikiPageEditingRoles  (optional)
   * @param wikiPageNotifyOfUpdate  (optional)
   * @param wikiPagePublished  (optional)
   * @param wikiPageFrontPage  (optional)
   * @return Page
   */
  @RequestLine("PUT /v1/groups/{groupId}/pages/{url}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Page updateCreatePageGroups(@Param("groupId") String groupId, @Param("url") String url, @Param("wikiPageTitle") String wikiPageTitle, @Param("wikiPageBody") String wikiPageBody, @Param("wikiPageEditingRoles") String wikiPageEditingRoles, @Param("wikiPageNotifyOfUpdate") Boolean wikiPageNotifyOfUpdate, @Param("wikiPagePublished") Boolean wikiPagePublished, @Param("wikiPageFrontPage") Boolean wikiPageFrontPage);
  
}
