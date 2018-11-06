package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Folder;
import com.instructure.canvas.model.License;
import com.instructure.canvas.model.UsageRights;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface FilesApi extends ApiClient.Api {

  /**
   * Copy a file
   * Copy a file from elsewhere in Canvas into a folder.  Copying a file across contexts (between courses and users) is permitted, but the source and destination must belong to the same institution.
   * @param destFolderId ID (required)
   * @param sourceFileId  (optional)
   * @param onDuplicate  (optional)
   * @return java.io.File
   */
  @RequestLine("POST /v1/folders/{destFolderId}/copy_file")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  java.io.File copyFile(@Param("destFolderId") String destFolderId, @Param("sourceFileId") String sourceFileId, @Param("onDuplicate") String onDuplicate);
  
  /**
   * Copy a folder
   * Copy a folder (and its contents) from elsewhere in Canvas into a folder.  Copying a folder across contexts (between courses and users) is permitted, but the source and destination must belong to the same institution. If the source and destination folders are in the same context, the source folder may not contain the destination folder. A folder will be renamed at its destination if another folder with the same name already exists.
   * @param destFolderId ID (required)
   * @param sourceFolderId  (optional)
   * @return Folder
   */
  @RequestLine("POST /v1/folders/{destFolderId}/copy_folder")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder copyFolder(@Param("destFolderId") String destFolderId, @Param("sourceFolderId") String sourceFolderId);
  
  /**
   * Create folder
   * Creates a folder in the specified context
   * @param courseId ID (required)
   * @param name  (optional)
   * @param parentFolderId  (optional)
   * @param parentFolderPath  (optional)
   * @param lockAt  (optional)
   * @param unlockAt  (optional)
   * @param locked  (optional)
   * @param hidden  (optional)
   * @param position  (optional)
   * @return Folder
   */
  @RequestLine("POST /v1/courses/{courseId}/folders")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder createFolderCourses(@Param("courseId") String courseId, @Param("name") String name, @Param("parentFolderId") String parentFolderId, @Param("parentFolderPath") String parentFolderPath, @Param("lockAt") String lockAt, @Param("unlockAt") String unlockAt, @Param("locked") Boolean locked, @Param("hidden") Boolean hidden, @Param("position") Integer position);
  
  /**
   * Create folder
   * Creates a folder in the specified context
   * @param folderId ID (required)
   * @param name  (optional)
   * @param parentFolderId  (optional)
   * @param parentFolderPath  (optional)
   * @param lockAt  (optional)
   * @param unlockAt  (optional)
   * @param locked  (optional)
   * @param hidden  (optional)
   * @param position  (optional)
   * @return Folder
   */
  @RequestLine("POST /v1/folders/{folderId}/folders")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder createFolderFolders(@Param("folderId") String folderId, @Param("name") String name, @Param("parentFolderId") String parentFolderId, @Param("parentFolderPath") String parentFolderPath, @Param("lockAt") String lockAt, @Param("unlockAt") String unlockAt, @Param("locked") Boolean locked, @Param("hidden") Boolean hidden, @Param("position") Integer position);
  
  /**
   * Create folder
   * Creates a folder in the specified context
   * @param groupId ID (required)
   * @param name  (optional)
   * @param parentFolderId  (optional)
   * @param parentFolderPath  (optional)
   * @param lockAt  (optional)
   * @param unlockAt  (optional)
   * @param locked  (optional)
   * @param hidden  (optional)
   * @param position  (optional)
   * @return Folder
   */
  @RequestLine("POST /v1/groups/{groupId}/folders")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder createFolderGroups(@Param("groupId") String groupId, @Param("name") String name, @Param("parentFolderId") String parentFolderId, @Param("parentFolderPath") String parentFolderPath, @Param("lockAt") String lockAt, @Param("unlockAt") String unlockAt, @Param("locked") Boolean locked, @Param("hidden") Boolean hidden, @Param("position") Integer position);
  
  /**
   * Create folder
   * Creates a folder in the specified context
   * @param userId ID (required)
   * @param name  (optional)
   * @param parentFolderId  (optional)
   * @param parentFolderPath  (optional)
   * @param lockAt  (optional)
   * @param unlockAt  (optional)
   * @param locked  (optional)
   * @param hidden  (optional)
   * @param position  (optional)
   * @return Folder
   */
  @RequestLine("POST /v1/users/{userId}/folders")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder createFolderUsers(@Param("userId") String userId, @Param("name") String name, @Param("parentFolderId") String parentFolderId, @Param("parentFolderPath") String parentFolderPath, @Param("lockAt") String lockAt, @Param("unlockAt") String unlockAt, @Param("locked") Boolean locked, @Param("hidden") Boolean hidden, @Param("position") Integer position);
  
  /**
   * Delete file
   * Remove the specified file
   * @param id ID (required)
   * @param replace This action is irreversible. If replace is set to true the file contents will be replaced with a generic \&quot;file has been removed\&quot; file. This also destroys any previews that have been generated for the file. Must have manage files and become other users permissions (optional)
   * @return java.io.File
   */
  @RequestLine("DELETE /v1/files/{id}?replace={replace}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  java.io.File deleteFile(@Param("id") String id, @Param("replace") Boolean replace);
  

  /**
   * Delete file
   * Remove the specified file
   * Note, this is equivalent to the other <code>deleteFile</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFileQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>replace - This action is irreversible. If replace is set to true the file contents will be replaced with a generic \&quot;file has been removed\&quot; file. This also destroys any previews that have been generated for the file. Must have manage files and become other users permissions (optional)</li>
   *   </ul>
   * @return java.io.File

   */
  @RequestLine("DELETE /v1/files/{id}?replace={replace}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  java.io.File deleteFile(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteFile</code> method in a fluent style.
   */
  public static class DeleteFileQueryParams extends HashMap<String, Object> {
    public DeleteFileQueryParams replace(final Boolean value) {
      put("replace", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Delete folder
   * Remove the specified folder. You can only delete empty folders unless you set the &#x27;force&#x27; flag
   * @param id ID (required)
   * @param force Set to &#x27;true&#x27; to allow deleting a non-empty folder (optional)
   */
  @RequestLine("DELETE /v1/folders/{id}?force={force}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteFolder(@Param("id") String id, @Param("force") Boolean force);
  

  /**
   * Delete folder
   * Remove the specified folder. You can only delete empty folders unless you set the &#x27;force&#x27; flag
   * Note, this is equivalent to the other <code>deleteFolder</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFolderQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>force - Set to &#x27;true&#x27; to allow deleting a non-empty folder (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/folders/{id}?force={force}")
  @Headers({
      "Content-Type: application/json",
  })
  void deleteFolder(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteFolder</code> method in a fluent style.
   */
  public static class DeleteFolderQueryParams extends HashMap<String, Object> {
    public DeleteFolderQueryParams force(final Boolean value) {
      put("force", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get file
   * Returns the standard attachment json object
   * @param courseId ID (required)
   * @param id ID (required)
   * @param include Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)
   * @return java.io.File
   */
  @RequestLine("GET /v1/courses/{courseId}/files/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  java.io.File getFileCourses(@Param("courseId") String courseId, @Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get file
   * Returns the standard attachment json object
   * Note, this is equivalent to the other <code>getFileCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetFileCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)</li>
   *   </ul>
   * @return java.io.File

   */
  @RequestLine("GET /v1/courses/{courseId}/files/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  java.io.File getFileCourses(@Param("courseId") String courseId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getFileCourses</code> method in a fluent style.
   */
  public static class GetFileCoursesQueryParams extends HashMap<String, Object> {
    public GetFileCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get file
   * Returns the standard attachment json object
   * @param id ID (required)
   * @param include Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)
   * @return java.io.File
   */
  @RequestLine("GET /v1/files/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  java.io.File getFileFiles(@Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get file
   * Returns the standard attachment json object
   * Note, this is equivalent to the other <code>getFileFiles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetFileFilesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)</li>
   *   </ul>
   * @return java.io.File

   */
  @RequestLine("GET /v1/files/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  java.io.File getFileFiles(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getFileFiles</code> method in a fluent style.
   */
  public static class GetFileFilesQueryParams extends HashMap<String, Object> {
    public GetFileFilesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get file
   * Returns the standard attachment json object
   * @param groupId ID (required)
   * @param id ID (required)
   * @param include Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)
   * @return java.io.File
   */
  @RequestLine("GET /v1/groups/{groupId}/files/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  java.io.File getFileGroups(@Param("groupId") String groupId, @Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get file
   * Returns the standard attachment json object
   * Note, this is equivalent to the other <code>getFileGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetFileGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)</li>
   *   </ul>
   * @return java.io.File

   */
  @RequestLine("GET /v1/groups/{groupId}/files/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  java.io.File getFileGroups(@Param("groupId") String groupId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getFileGroups</code> method in a fluent style.
   */
  public static class GetFileGroupsQueryParams extends HashMap<String, Object> {
    public GetFileGroupsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get file
   * Returns the standard attachment json object
   * @param userId ID (required)
   * @param id ID (required)
   * @param include Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)
   * @return java.io.File
   */
  @RequestLine("GET /v1/users/{userId}/files/{id}?include={include}")
  @Headers({
      "Accept: application/json",
  })
  java.io.File getFileUsers(@Param("userId") String userId, @Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get file
   * Returns the standard attachment json object
   * Note, this is equivalent to the other <code>getFileUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetFileUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)</li>
   *   </ul>
   * @return java.io.File

   */
  @RequestLine("GET /v1/users/{userId}/files/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  java.io.File getFileUsers(@Param("userId") String userId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getFileUsers</code> method in a fluent style.
   */
  public static class GetFileUsersQueryParams extends HashMap<String, Object> {
    public GetFileUsersQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get folder
   * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Folder
   */
  @RequestLine("GET /v1/courses/{courseId}/folders/{id}")
  @Headers({
      "Accept: application/json",
  })
  Folder getFolderCourses(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Get folder
   * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
   * @param id ID (required)
   * @return Folder
   */
  @RequestLine("GET /v1/folders/{id}")
  @Headers({
      "Accept: application/json",
  })
  Folder getFolderFolders(@Param("id") String id);
  
  /**
   * Get folder
   * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
   * @param groupId ID (required)
   * @param id ID (required)
   * @return Folder
   */
  @RequestLine("GET /v1/groups/{groupId}/folders/{id}")
  @Headers({
      "Accept: application/json",
  })
  Folder getFolderGroups(@Param("groupId") String groupId, @Param("id") String id);
  
  /**
   * Get folder
   * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
   * @param userId ID (required)
   * @param id ID (required)
   * @return Folder
   */
  @RequestLine("GET /v1/users/{userId}/folders/{id}")
  @Headers({
      "Accept: application/json",
  })
  Folder getFolderUsers(@Param("userId") String userId, @Param("id") String id);
  
  /**
   * Get public inline preview url
   * Determine the URL that should be used for inline preview of the file.
   * @param id ID (required)
   * @param submissionId The id of the submission the file is associated with.  Provide this argument to gain access to a file that has been submitted to an assignment (Canvas will verify that the file belongs to the submission and the calling user has rights to view the submission). (optional)
   */
  @RequestLine("GET /v1/files/{id}/public_url?submission_id={submissionId}")
  @Headers({
      "Accept: */*",
  })
  void getPublicInlinePreviewUrl(@Param("id") String id, @Param("submissionId") Integer submissionId);
  

  /**
   * Get public inline preview url
   * Determine the URL that should be used for inline preview of the file.
   * Note, this is equivalent to the other <code>getPublicInlinePreviewUrl</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPublicInlinePreviewUrlQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>submissionId - The id of the submission the file is associated with.  Provide this argument to gain access to a file that has been submitted to an assignment (Canvas will verify that the file belongs to the submission and the calling user has rights to view the submission). (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/files/{id}/public_url?submission_id={submissionId}")
  @Headers({
      "Content-Type: */*",
  })
  void getPublicInlinePreviewUrl(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getPublicInlinePreviewUrl</code> method in a fluent style.
   */
  public static class GetPublicInlinePreviewUrlQueryParams extends HashMap<String, Object> {
    public GetPublicInlinePreviewUrlQueryParams submissionId(final Integer value) {
      put("submission_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get quota information
   * Returns the total and used storage quota for the course, group, or user.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/files/quota")
  @Headers({
      "Accept: */*",
  })
  void getQuotaInformationCourses(@Param("courseId") String courseId);
  
  /**
   * Get quota information
   * Returns the total and used storage quota for the course, group, or user.
   * @param groupId ID (required)
   */
  @RequestLine("GET /v1/groups/{groupId}/files/quota")
  @Headers({
      "Accept: */*",
  })
  void getQuotaInformationGroups(@Param("groupId") String groupId);
  
  /**
   * Get quota information
   * Returns the total and used storage quota for the course, group, or user.
   * @param userId ID (required)
   */
  @RequestLine("GET /v1/users/{userId}/files/quota")
  @Headers({
      "Accept: */*",
  })
  void getQuotaInformationUsers(@Param("userId") String userId);
  
  /**
   * List all folders
   * Returns the paginated list of all folders for the given context. This will be returned as a flat list containing all subfolders as well.
   * @param courseId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/folders")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listAllFoldersCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listAllFoldersCourses(URI uri);
  
  /**
   * List all folders
   * Returns the paginated list of all folders for the given context. This will be returned as a flat list containing all subfolders as well.
   * @param groupId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/folders")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listAllFoldersGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listAllFoldersGroups(URI uri);
  
  /**
   * List all folders
   * Returns the paginated list of all folders for the given context. This will be returned as a flat list containing all subfolders as well.
   * @param userId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/users/{userId}/folders")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listAllFoldersUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listAllFoldersUsers(URI uri);
  
  /**
   * List files
   * Returns the paginated list of files for the folder or course.
   * @param courseId ID (required)
   * @param contentTypes Filter results by content-type. You can specify type/subtype pairs (e.g., &#x27;image/jpeg&#x27;), or simply types (e.g., &#x27;image&#x27;, which will match &#x27;image/gif&#x27;, &#x27;image/jpeg&#x27;, etc.). (optional)
   * @param searchTerm The partial name of the files to match and return. (optional)
   * @param include Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)
   * @param only Array of information to restrict to. Overrides include[]  \&quot;names\&quot;:: only returns file name information (optional)
   * @param sort Sort results by this field. Defaults to &#x27;name&#x27;. Note that &#x60;sort&#x3D;user&#x60; implies &#x60;include[]&#x3D;user&#x60;. (optional)
   * @param order The sorting order. Defaults to &#x27;asc&#x27;. (optional)
   * @return List&lt;java.io.File&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/files?content_types={contentTypes}&search_term={searchTerm}&include={include}&only={only}&sort={sort}&order={order}")
  @Headers({
      "Accept: application/json",
  })
  List<java.io.File> listFilesCourses(@Param("courseId") String courseId, @Param("contentTypes") List<String> contentTypes, @Param("searchTerm") String searchTerm, @Param("include") List<String> include, @Param("only") List<List<Object>> only, @Param("sort") String sort, @Param("order") String order);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;java.io.File&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<java.io.File> listFilesCourses(URI uri);
  

  /**
   * List files
   * Returns the paginated list of files for the folder or course.
   * Note, this is equivalent to the other <code>listFilesCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListFilesCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>contentTypes - Filter results by content-type. You can specify type/subtype pairs (e.g., &#x27;image/jpeg&#x27;), or simply types (e.g., &#x27;image&#x27;, which will match &#x27;image/gif&#x27;, &#x27;image/jpeg&#x27;, etc.). (optional)</li>
   *   <li>searchTerm - The partial name of the files to match and return. (optional)</li>
   *   <li>include - Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)</li>
   *   <li>only - Array of information to restrict to. Overrides include[]  \&quot;names\&quot;:: only returns file name information (optional)</li>
   *   <li>sort - Sort results by this field. Defaults to &#x27;name&#x27;. Note that &#x60;sort&#x3D;user&#x60; implies &#x60;include[]&#x3D;user&#x60;. (optional)</li>
   *   <li>order - The sorting order. Defaults to &#x27;asc&#x27;. (optional)</li>
   *   </ul>
   * @return List&lt;java.io.File&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/files?content_types={contentTypes}&search_term={searchTerm}&include={include}&only={only}&sort={sort}&order={order}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<java.io.File> listFilesCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listFilesCourses</code> method in a fluent style.
   */
  public static class ListFilesCoursesQueryParams extends HashMap<String, Object> {
    public ListFilesCoursesQueryParams contentTypes(final List<String> value) {
      put("content_types", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListFilesCoursesQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListFilesCoursesQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListFilesCoursesQueryParams only(final List<List<Object>> value) {
      put("only", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListFilesCoursesQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public ListFilesCoursesQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List files
   * Returns the paginated list of files for the folder or course.
   * @param id ID (required)
   * @param contentTypes Filter results by content-type. You can specify type/subtype pairs (e.g., &#x27;image/jpeg&#x27;), or simply types (e.g., &#x27;image&#x27;, which will match &#x27;image/gif&#x27;, &#x27;image/jpeg&#x27;, etc.). (optional)
   * @param searchTerm The partial name of the files to match and return. (optional)
   * @param include Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)
   * @param only Array of information to restrict to. Overrides include[]  \&quot;names\&quot;:: only returns file name information (optional)
   * @param sort Sort results by this field. Defaults to &#x27;name&#x27;. Note that &#x60;sort&#x3D;user&#x60; implies &#x60;include[]&#x3D;user&#x60;. (optional)
   * @param order The sorting order. Defaults to &#x27;asc&#x27;. (optional)
   * @return List&lt;java.io.File&gt;
   */
  @RequestLine("GET /v1/folders/{id}/files?content_types={contentTypes}&search_term={searchTerm}&include={include}&only={only}&sort={sort}&order={order}")
  @Headers({
      "Accept: application/json",
  })
  List<java.io.File> listFilesFolders(@Param("id") String id, @Param("contentTypes") List<String> contentTypes, @Param("searchTerm") String searchTerm, @Param("include") List<String> include, @Param("only") List<List<Object>> only, @Param("sort") String sort, @Param("order") String order);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;java.io.File&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<java.io.File> listFilesFolders(URI uri);
  

  /**
   * List files
   * Returns the paginated list of files for the folder or course.
   * Note, this is equivalent to the other <code>listFilesFolders</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListFilesFoldersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>contentTypes - Filter results by content-type. You can specify type/subtype pairs (e.g., &#x27;image/jpeg&#x27;), or simply types (e.g., &#x27;image&#x27;, which will match &#x27;image/gif&#x27;, &#x27;image/jpeg&#x27;, etc.). (optional)</li>
   *   <li>searchTerm - The partial name of the files to match and return. (optional)</li>
   *   <li>include - Array of additional information to include.  \&quot;user\&quot;:: the user who uploaded the file or last edited its content \&quot;usage_rights\&quot;:: copyright and license information for the file (see UsageRights) (optional)</li>
   *   <li>only - Array of information to restrict to. Overrides include[]  \&quot;names\&quot;:: only returns file name information (optional)</li>
   *   <li>sort - Sort results by this field. Defaults to &#x27;name&#x27;. Note that &#x60;sort&#x3D;user&#x60; implies &#x60;include[]&#x3D;user&#x60;. (optional)</li>
   *   <li>order - The sorting order. Defaults to &#x27;asc&#x27;. (optional)</li>
   *   </ul>
   * @return List&lt;java.io.File&gt;

   */
  @RequestLine("GET /v1/folders/{id}/files?content_types={contentTypes}&search_term={searchTerm}&include={include}&only={only}&sort={sort}&order={order}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<java.io.File> listFilesFolders(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listFilesFolders</code> method in a fluent style.
   */
  public static class ListFilesFoldersQueryParams extends HashMap<String, Object> {
    public ListFilesFoldersQueryParams contentTypes(final List<String> value) {
      put("content_types", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListFilesFoldersQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public ListFilesFoldersQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListFilesFoldersQueryParams only(final List<List<Object>> value) {
      put("only", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListFilesFoldersQueryParams sort(final String value) {
      put("sort", EncodingUtils.encode(value));
      return this;
    }
    public ListFilesFoldersQueryParams order(final String value) {
      put("order", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List folders
   * Returns the paginated list of folders in the folder.
   * @param id ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/folders/{id}/folders")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listFolders(@Param("id") String id);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> listFolders(URI uri);
  
  /**
   * List licenses
   * A paginated list of licenses that can be applied
   * @param courseId ID (required)
   * @return List&lt;License&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/content_licenses")
  @Headers({
      "Accept: application/json",
  })
  List<License> listLicensesCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;License&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<License> listLicensesCourses(URI uri);
  
  /**
   * List licenses
   * A paginated list of licenses that can be applied
   * @param groupId ID (required)
   * @return List&lt;License&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/content_licenses")
  @Headers({
      "Accept: application/json",
  })
  List<License> listLicensesGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;License&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<License> listLicensesGroups(URI uri);
  
  /**
   * List licenses
   * A paginated list of licenses that can be applied
   * @param userId ID (required)
   * @return List&lt;License&gt;
   */
  @RequestLine("GET /v1/users/{userId}/content_licenses")
  @Headers({
      "Accept: application/json",
  })
  List<License> listLicensesUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;License&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<License> listLicensesUsers(URI uri);
  
  /**
   * Remove usage rights
   * Removes copyright and license information associated with one or more files
   * @param courseId ID (required)
   * @param fileIds List of ids of files to remove associated usage rights from. (required)
   * @param folderIds List of ids of folders. Usage rights will be removed from all files in these folders. (optional)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/usage_rights?file_ids={fileIds}&folder_ids={folderIds}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void removeUsageRightsCourses(@Param("courseId") String courseId, @Param("fileIds") List<String> fileIds, @Param("folderIds") List<String> folderIds);
  

  /**
   * Remove usage rights
   * Removes copyright and license information associated with one or more files
   * Note, this is equivalent to the other <code>removeUsageRightsCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveUsageRightsCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fileIds - List of ids of files to remove associated usage rights from. (required)</li>
   *   <li>folderIds - List of ids of folders. Usage rights will be removed from all files in these folders. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/courses/{courseId}/usage_rights?file_ids={fileIds}&folder_ids={folderIds}")
  @Headers({
      "Content-Type: application/json",
  })
  void removeUsageRightsCourses(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>removeUsageRightsCourses</code> method in a fluent style.
   */
  public static class RemoveUsageRightsCoursesQueryParams extends HashMap<String, Object> {
    public RemoveUsageRightsCoursesQueryParams fileIds(final List<String> value) {
      put("file_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public RemoveUsageRightsCoursesQueryParams folderIds(final List<String> value) {
      put("folder_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Remove usage rights
   * Removes copyright and license information associated with one or more files
   * @param groupId ID (required)
   * @param fileIds List of ids of files to remove associated usage rights from. (required)
   * @param folderIds List of ids of folders. Usage rights will be removed from all files in these folders. (optional)
   */
  @RequestLine("DELETE /v1/groups/{groupId}/usage_rights?file_ids={fileIds}&folder_ids={folderIds}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void removeUsageRightsGroups(@Param("groupId") String groupId, @Param("fileIds") List<String> fileIds, @Param("folderIds") List<String> folderIds);
  

  /**
   * Remove usage rights
   * Removes copyright and license information associated with one or more files
   * Note, this is equivalent to the other <code>removeUsageRightsGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveUsageRightsGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param groupId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fileIds - List of ids of files to remove associated usage rights from. (required)</li>
   *   <li>folderIds - List of ids of folders. Usage rights will be removed from all files in these folders. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/groups/{groupId}/usage_rights?file_ids={fileIds}&folder_ids={folderIds}")
  @Headers({
      "Content-Type: application/json",
  })
  void removeUsageRightsGroups(@Param("groupId") String groupId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>removeUsageRightsGroups</code> method in a fluent style.
   */
  public static class RemoveUsageRightsGroupsQueryParams extends HashMap<String, Object> {
    public RemoveUsageRightsGroupsQueryParams fileIds(final List<String> value) {
      put("file_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public RemoveUsageRightsGroupsQueryParams folderIds(final List<String> value) {
      put("folder_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Remove usage rights
   * Removes copyright and license information associated with one or more files
   * @param userId ID (required)
   * @param fileIds List of ids of files to remove associated usage rights from. (required)
   * @param folderIds List of ids of folders. Usage rights will be removed from all files in these folders. (optional)
   */
  @RequestLine("DELETE /v1/users/{userId}/usage_rights?file_ids={fileIds}&folder_ids={folderIds}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void removeUsageRightsUsers(@Param("userId") String userId, @Param("fileIds") List<String> fileIds, @Param("folderIds") List<String> folderIds);
  

  /**
   * Remove usage rights
   * Removes copyright and license information associated with one or more files
   * Note, this is equivalent to the other <code>removeUsageRightsUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RemoveUsageRightsUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fileIds - List of ids of files to remove associated usage rights from. (required)</li>
   *   <li>folderIds - List of ids of folders. Usage rights will be removed from all files in these folders. (optional)</li>
   *   </ul>

   */
  @RequestLine("DELETE /v1/users/{userId}/usage_rights?file_ids={fileIds}&folder_ids={folderIds}")
  @Headers({
      "Content-Type: application/json",
  })
  void removeUsageRightsUsers(@Param("userId") String userId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>removeUsageRightsUsers</code> method in a fluent style.
   */
  public static class RemoveUsageRightsUsersQueryParams extends HashMap<String, Object> {
    public RemoveUsageRightsUsersQueryParams fileIds(final List<String> value) {
      put("file_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public RemoveUsageRightsUsersQueryParams folderIds(final List<String> value) {
      put("folder_ids", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Resolve path
   * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
   * @param courseId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/folders/by_path")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathCourses(URI uri);
  
  /**
   * Resolve path
   * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
   * @param courseId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/folders/by_path/*full_path")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathCoursesFullPath(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathCoursesFullPath(URI uri);
  
  /**
   * Resolve path
   * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
   * @param groupId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/folders/by_path")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathGroups(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathGroups(URI uri);
  
  /**
   * Resolve path
   * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
   * @param groupId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/groups/{groupId}/folders/by_path/*full_path")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathGroupsFullPath(@Param("groupId") String groupId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathGroupsFullPath(URI uri);
  
  /**
   * Resolve path
   * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
   * @param userId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/users/{userId}/folders/by_path")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathUsers(URI uri);
  
  /**
   * Resolve path
   * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
   * @param userId ID (required)
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET /v1/users/{userId}/folders/by_path/*full_path")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathUsersFullPath(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Folder&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Folder> resolvePathUsersFullPath(URI uri);
  
  /**
   * Set usage rights
   * Sets copyright and license information for one or more files
   * @param courseId ID (required)
   * @param fileIds  (optional)
   * @param folderIds  (optional)
   * @param publish  (optional)
   * @param usageRightsUseJustification  (optional)
   * @param usageRightsLegalCopyright  (optional)
   * @param usageRightsLicense  (optional)
   * @return UsageRights
   */
  @RequestLine("PUT /v1/courses/{courseId}/usage_rights")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  UsageRights setUsageRightsCourses(@Param("courseId") String courseId, @Param("fileIds") List<String> fileIds, @Param("folderIds") List<String> folderIds, @Param("publish") Boolean publish, @Param("usageRightsUseJustification") String usageRightsUseJustification, @Param("usageRightsLegalCopyright") String usageRightsLegalCopyright, @Param("usageRightsLicense") String usageRightsLicense);
  
  /**
   * Set usage rights
   * Sets copyright and license information for one or more files
   * @param groupId ID (required)
   * @param fileIds  (optional)
   * @param folderIds  (optional)
   * @param publish  (optional)
   * @param usageRightsUseJustification  (optional)
   * @param usageRightsLegalCopyright  (optional)
   * @param usageRightsLicense  (optional)
   * @return UsageRights
   */
  @RequestLine("PUT /v1/groups/{groupId}/usage_rights")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  UsageRights setUsageRightsGroups(@Param("groupId") String groupId, @Param("fileIds") List<String> fileIds, @Param("folderIds") List<String> folderIds, @Param("publish") Boolean publish, @Param("usageRightsUseJustification") String usageRightsUseJustification, @Param("usageRightsLegalCopyright") String usageRightsLegalCopyright, @Param("usageRightsLicense") String usageRightsLicense);
  
  /**
   * Set usage rights
   * Sets copyright and license information for one or more files
   * @param userId ID (required)
   * @param fileIds  (optional)
   * @param folderIds  (optional)
   * @param publish  (optional)
   * @param usageRightsUseJustification  (optional)
   * @param usageRightsLegalCopyright  (optional)
   * @param usageRightsLicense  (optional)
   * @return UsageRights
   */
  @RequestLine("PUT /v1/users/{userId}/usage_rights")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  UsageRights setUsageRightsUsers(@Param("userId") String userId, @Param("fileIds") List<String> fileIds, @Param("folderIds") List<String> folderIds, @Param("publish") Boolean publish, @Param("usageRightsUseJustification") String usageRightsUseJustification, @Param("usageRightsLegalCopyright") String usageRightsLegalCopyright, @Param("usageRightsLicense") String usageRightsLicense);
  
  /**
   * Update file
   * Update some settings on the specified file
   * @param id ID (required)
   * @param name  (optional)
   * @param parentFolderId  (optional)
   * @param onDuplicate  (optional)
   * @param lockAt  (optional)
   * @param unlockAt  (optional)
   * @param locked  (optional)
   * @param hidden  (optional)
   * @return java.io.File
   */
  @RequestLine("PUT /v1/files/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  java.io.File updateFile(@Param("id") String id, @Param("name") String name, @Param("parentFolderId") String parentFolderId, @Param("onDuplicate") String onDuplicate, @Param("lockAt") String lockAt, @Param("unlockAt") String unlockAt, @Param("locked") Boolean locked, @Param("hidden") Boolean hidden);
  
  /**
   * Update folder
   * Updates a folder
   * @param id ID (required)
   * @param name  (optional)
   * @param parentFolderId  (optional)
   * @param lockAt  (optional)
   * @param unlockAt  (optional)
   * @param locked  (optional)
   * @param hidden  (optional)
   * @param position  (optional)
   * @return Folder
   */
  @RequestLine("PUT /v1/folders/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Folder updateFolder(@Param("id") String id, @Param("name") String name, @Param("parentFolderId") String parentFolderId, @Param("lockAt") String lockAt, @Param("unlockAt") String unlockAt, @Param("locked") Boolean locked, @Param("hidden") Boolean hidden, @Param("position") Integer position);
  
  /**
   * Upload a file
   * Upload a file to a folder.  This API endpoint is the first step in uploading a file. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  Only those with the \&quot;Manage Files\&quot; permission on a course or group can upload files to a folder in that course or group.
   * @param folderId ID (required)
   */
  @RequestLine("POST /v1/folders/{folderId}/files")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void uploadFile(@Param("folderId") String folderId);
  
}
