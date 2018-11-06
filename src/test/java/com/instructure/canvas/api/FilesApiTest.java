package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Folder;
import com.instructure.canvas.model.License;
import com.instructure.canvas.model.UsageRights;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
public class FilesApiTest {

    private FilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(FilesApi.class);
    }

    /**
     * Copy a file
     *
     * Copy a file from elsewhere in Canvas into a folder.  Copying a file across contexts (between courses and users) is permitted, but the source and destination must belong to the same institution.
     */
    @Test
    public void copyFileTest() {
        String destFolderId = null;
        String sourceFileId = null;
        String onDuplicate = null;
        // java.io.File response = api.copyFile(destFolderId, sourceFileId, onDuplicate);

        // TODO: test validations
    }

    /**
     * Copy a folder
     *
     * Copy a folder (and its contents) from elsewhere in Canvas into a folder.  Copying a folder across contexts (between courses and users) is permitted, but the source and destination must belong to the same institution. If the source and destination folders are in the same context, the source folder may not contain the destination folder. A folder will be renamed at its destination if another folder with the same name already exists.
     */
    @Test
    public void copyFolderTest() {
        String destFolderId = null;
        String sourceFolderId = null;
        // Folder response = api.copyFolder(destFolderId, sourceFolderId);

        // TODO: test validations
    }

    /**
     * Create folder
     *
     * Creates a folder in the specified context
     */
    @Test
    public void createFolderCoursesTest() {
        String courseId = null;
        String name = null;
        String parentFolderId = null;
        String parentFolderPath = null;
        String lockAt = null;
        String unlockAt = null;
        Boolean locked = null;
        Boolean hidden = null;
        Integer position = null;
        // Folder response = api.createFolderCourses(courseId, name, parentFolderId, parentFolderPath, lockAt, unlockAt, locked, hidden, position);

        // TODO: test validations
    }

    /**
     * Create folder
     *
     * Creates a folder in the specified context
     */
    @Test
    public void createFolderFoldersTest() {
        String folderId = null;
        String name = null;
        String parentFolderId = null;
        String parentFolderPath = null;
        String lockAt = null;
        String unlockAt = null;
        Boolean locked = null;
        Boolean hidden = null;
        Integer position = null;
        // Folder response = api.createFolderFolders(folderId, name, parentFolderId, parentFolderPath, lockAt, unlockAt, locked, hidden, position);

        // TODO: test validations
    }

    /**
     * Create folder
     *
     * Creates a folder in the specified context
     */
    @Test
    public void createFolderGroupsTest() {
        String groupId = null;
        String name = null;
        String parentFolderId = null;
        String parentFolderPath = null;
        String lockAt = null;
        String unlockAt = null;
        Boolean locked = null;
        Boolean hidden = null;
        Integer position = null;
        // Folder response = api.createFolderGroups(groupId, name, parentFolderId, parentFolderPath, lockAt, unlockAt, locked, hidden, position);

        // TODO: test validations
    }

    /**
     * Create folder
     *
     * Creates a folder in the specified context
     */
    @Test
    public void createFolderUsersTest() {
        String userId = null;
        String name = null;
        String parentFolderId = null;
        String parentFolderPath = null;
        String lockAt = null;
        String unlockAt = null;
        Boolean locked = null;
        Boolean hidden = null;
        Integer position = null;
        // Folder response = api.createFolderUsers(userId, name, parentFolderId, parentFolderPath, lockAt, unlockAt, locked, hidden, position);

        // TODO: test validations
    }

    /**
     * Delete file
     *
     * Remove the specified file
     */
    @Test
    public void deleteFileTest() {
        String id = null;
        Boolean replace = null;
        // java.io.File response = api.deleteFile(id, replace);

        // TODO: test validations
    }

    /**
     * Delete file
     *
     * Remove the specified file
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteFileTestQueryMap() {
        String id = null;
        FilesApi.DeleteFileQueryParams queryParams = new FilesApi.DeleteFileQueryParams()
            .replace(null);
        // java.io.File response = api.deleteFile(id, queryParams);

    // TODO: test validations
    }
    /**
     * Delete folder
     *
     * Remove the specified folder. You can only delete empty folders unless you set the &#x27;force&#x27; flag
     */
    @Test
    public void deleteFolderTest() {
        String id = null;
        Boolean force = null;
        // api.deleteFolder(id, force);

        // TODO: test validations
    }

    /**
     * Delete folder
     *
     * Remove the specified folder. You can only delete empty folders unless you set the &#x27;force&#x27; flag
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deleteFolderTestQueryMap() {
        String id = null;
        FilesApi.DeleteFolderQueryParams queryParams = new FilesApi.DeleteFolderQueryParams()
            .force(null);
        // api.deleteFolder(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get file
     *
     * Returns the standard attachment json object
     */
    @Test
    public void getFileCoursesTest() {
        String courseId = null;
        String id = null;
        List<String> include = null;
        // java.io.File response = api.getFileCourses(courseId, id, include);

        // TODO: test validations
    }

    /**
     * Get file
     *
     * Returns the standard attachment json object
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getFileCoursesTestQueryMap() {
        String courseId = null;
        String id = null;
        FilesApi.GetFileCoursesQueryParams queryParams = new FilesApi.GetFileCoursesQueryParams()
            .include(null);
        // java.io.File response = api.getFileCourses(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get file
     *
     * Returns the standard attachment json object
     */
    @Test
    public void getFileFilesTest() {
        String id = null;
        List<String> include = null;
        // java.io.File response = api.getFileFiles(id, include);

        // TODO: test validations
    }

    /**
     * Get file
     *
     * Returns the standard attachment json object
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getFileFilesTestQueryMap() {
        String id = null;
        FilesApi.GetFileFilesQueryParams queryParams = new FilesApi.GetFileFilesQueryParams()
            .include(null);
        // java.io.File response = api.getFileFiles(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get file
     *
     * Returns the standard attachment json object
     */
    @Test
    public void getFileGroupsTest() {
        String groupId = null;
        String id = null;
        List<String> include = null;
        // java.io.File response = api.getFileGroups(groupId, id, include);

        // TODO: test validations
    }

    /**
     * Get file
     *
     * Returns the standard attachment json object
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getFileGroupsTestQueryMap() {
        String groupId = null;
        String id = null;
        FilesApi.GetFileGroupsQueryParams queryParams = new FilesApi.GetFileGroupsQueryParams()
            .include(null);
        // java.io.File response = api.getFileGroups(groupId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get file
     *
     * Returns the standard attachment json object
     */
    @Test
    public void getFileUsersTest() {
        String userId = null;
        String id = null;
        List<String> include = null;
        // java.io.File response = api.getFileUsers(userId, id, include);

        // TODO: test validations
    }

    /**
     * Get file
     *
     * Returns the standard attachment json object
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getFileUsersTestQueryMap() {
        String userId = null;
        String id = null;
        FilesApi.GetFileUsersQueryParams queryParams = new FilesApi.GetFileUsersQueryParams()
            .include(null);
        // java.io.File response = api.getFileUsers(userId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get folder
     *
     * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
     */
    @Test
    public void getFolderCoursesTest() {
        String courseId = null;
        String id = null;
        // Folder response = api.getFolderCourses(courseId, id);

        // TODO: test validations
    }

    /**
     * Get folder
     *
     * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
     */
    @Test
    public void getFolderFoldersTest() {
        String id = null;
        // Folder response = api.getFolderFolders(id);

        // TODO: test validations
    }

    /**
     * Get folder
     *
     * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
     */
    @Test
    public void getFolderGroupsTest() {
        String groupId = null;
        String id = null;
        // Folder response = api.getFolderGroups(groupId, id);

        // TODO: test validations
    }

    /**
     * Get folder
     *
     * Returns the details for a folder  You can get the root folder from a context by using &#x27;root&#x27; as the :id. For example, you could get the root folder for a course like:
     */
    @Test
    public void getFolderUsersTest() {
        String userId = null;
        String id = null;
        // Folder response = api.getFolderUsers(userId, id);

        // TODO: test validations
    }

    /**
     * Get public inline preview url
     *
     * Determine the URL that should be used for inline preview of the file.
     */
    @Test
    public void getPublicInlinePreviewUrlTest() {
        String id = null;
        Integer submissionId = null;
        // api.getPublicInlinePreviewUrl(id, submissionId);

        // TODO: test validations
    }

    /**
     * Get public inline preview url
     *
     * Determine the URL that should be used for inline preview of the file.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getPublicInlinePreviewUrlTestQueryMap() {
        String id = null;
        FilesApi.GetPublicInlinePreviewUrlQueryParams queryParams = new FilesApi.GetPublicInlinePreviewUrlQueryParams()
            .submissionId(null);
        // api.getPublicInlinePreviewUrl(id, queryParams);

    // TODO: test validations
    }
    /**
     * Get quota information
     *
     * Returns the total and used storage quota for the course, group, or user.
     */
    @Test
    public void getQuotaInformationCoursesTest() {
        String courseId = null;
        // api.getQuotaInformationCourses(courseId);

        // TODO: test validations
    }

    /**
     * Get quota information
     *
     * Returns the total and used storage quota for the course, group, or user.
     */
    @Test
    public void getQuotaInformationGroupsTest() {
        String groupId = null;
        // api.getQuotaInformationGroups(groupId);

        // TODO: test validations
    }

    /**
     * Get quota information
     *
     * Returns the total and used storage quota for the course, group, or user.
     */
    @Test
    public void getQuotaInformationUsersTest() {
        String userId = null;
        // api.getQuotaInformationUsers(userId);

        // TODO: test validations
    }

    /**
     * List all folders
     *
     * Returns the paginated list of all folders for the given context. This will be returned as a flat list containing all subfolders as well.
     */
    @Test
    public void listAllFoldersCoursesTest() {
        String courseId = null;
        // List<Folder> response = api.listAllFoldersCourses(courseId);

        // TODO: test validations
    }

    /**
     * List all folders
     *
     * Returns the paginated list of all folders for the given context. This will be returned as a flat list containing all subfolders as well.
     */
    @Test
    public void listAllFoldersGroupsTest() {
        String groupId = null;
        // List<Folder> response = api.listAllFoldersGroups(groupId);

        // TODO: test validations
    }

    /**
     * List all folders
     *
     * Returns the paginated list of all folders for the given context. This will be returned as a flat list containing all subfolders as well.
     */
    @Test
    public void listAllFoldersUsersTest() {
        String userId = null;
        // List<Folder> response = api.listAllFoldersUsers(userId);

        // TODO: test validations
    }

    /**
     * List files
     *
     * Returns the paginated list of files for the folder or course.
     */
    @Test
    public void listFilesCoursesTest() {
        String courseId = null;
        List<String> contentTypes = null;
        String searchTerm = null;
        List<String> include = null;
        List<List<Object>> only = null;
        String sort = null;
        String order = null;
        // List<java.io.File> response = api.listFilesCourses(courseId, contentTypes, searchTerm, include, only, sort, order);

        // TODO: test validations
    }

    /**
     * List files
     *
     * Returns the paginated list of files for the folder or course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listFilesCoursesTestQueryMap() {
        String courseId = null;
        FilesApi.ListFilesCoursesQueryParams queryParams = new FilesApi.ListFilesCoursesQueryParams()
            .contentTypes(null)
            .searchTerm(null)
            .include(null)
            .only(null)
            .sort(null)
            .order(null);
        // List<java.io.File> response = api.listFilesCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List files
     *
     * Returns the paginated list of files for the folder or course.
     */
    @Test
    public void listFilesFoldersTest() {
        String id = null;
        List<String> contentTypes = null;
        String searchTerm = null;
        List<String> include = null;
        List<List<Object>> only = null;
        String sort = null;
        String order = null;
        // List<java.io.File> response = api.listFilesFolders(id, contentTypes, searchTerm, include, only, sort, order);

        // TODO: test validations
    }

    /**
     * List files
     *
     * Returns the paginated list of files for the folder or course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listFilesFoldersTestQueryMap() {
        String id = null;
        FilesApi.ListFilesFoldersQueryParams queryParams = new FilesApi.ListFilesFoldersQueryParams()
            .contentTypes(null)
            .searchTerm(null)
            .include(null)
            .only(null)
            .sort(null)
            .order(null);
        // List<java.io.File> response = api.listFilesFolders(id, queryParams);

    // TODO: test validations
    }
    /**
     * List folders
     *
     * Returns the paginated list of folders in the folder.
     */
    @Test
    public void listFoldersTest() {
        String id = null;
        // List<Folder> response = api.listFolders(id);

        // TODO: test validations
    }

    /**
     * List licenses
     *
     * A paginated list of licenses that can be applied
     */
    @Test
    public void listLicensesCoursesTest() {
        String courseId = null;
        // List<License> response = api.listLicensesCourses(courseId);

        // TODO: test validations
    }

    /**
     * List licenses
     *
     * A paginated list of licenses that can be applied
     */
    @Test
    public void listLicensesGroupsTest() {
        String groupId = null;
        // List<License> response = api.listLicensesGroups(groupId);

        // TODO: test validations
    }

    /**
     * List licenses
     *
     * A paginated list of licenses that can be applied
     */
    @Test
    public void listLicensesUsersTest() {
        String userId = null;
        // List<License> response = api.listLicensesUsers(userId);

        // TODO: test validations
    }

    /**
     * Remove usage rights
     *
     * Removes copyright and license information associated with one or more files
     */
    @Test
    public void removeUsageRightsCoursesTest() {
        String courseId = null;
        List<String> fileIds = null;
        List<String> folderIds = null;
        // api.removeUsageRightsCourses(courseId, fileIds, folderIds);

        // TODO: test validations
    }

    /**
     * Remove usage rights
     *
     * Removes copyright and license information associated with one or more files
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void removeUsageRightsCoursesTestQueryMap() {
        String courseId = null;
        FilesApi.RemoveUsageRightsCoursesQueryParams queryParams = new FilesApi.RemoveUsageRightsCoursesQueryParams()
            .fileIds(null)
            .folderIds(null);
        // api.removeUsageRightsCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Remove usage rights
     *
     * Removes copyright and license information associated with one or more files
     */
    @Test
    public void removeUsageRightsGroupsTest() {
        String groupId = null;
        List<String> fileIds = null;
        List<String> folderIds = null;
        // api.removeUsageRightsGroups(groupId, fileIds, folderIds);

        // TODO: test validations
    }

    /**
     * Remove usage rights
     *
     * Removes copyright and license information associated with one or more files
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void removeUsageRightsGroupsTestQueryMap() {
        String groupId = null;
        FilesApi.RemoveUsageRightsGroupsQueryParams queryParams = new FilesApi.RemoveUsageRightsGroupsQueryParams()
            .fileIds(null)
            .folderIds(null);
        // api.removeUsageRightsGroups(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * Remove usage rights
     *
     * Removes copyright and license information associated with one or more files
     */
    @Test
    public void removeUsageRightsUsersTest() {
        String userId = null;
        List<String> fileIds = null;
        List<String> folderIds = null;
        // api.removeUsageRightsUsers(userId, fileIds, folderIds);

        // TODO: test validations
    }

    /**
     * Remove usage rights
     *
     * Removes copyright and license information associated with one or more files
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void removeUsageRightsUsersTestQueryMap() {
        String userId = null;
        FilesApi.RemoveUsageRightsUsersQueryParams queryParams = new FilesApi.RemoveUsageRightsUsersQueryParams()
            .fileIds(null)
            .folderIds(null);
        // api.removeUsageRightsUsers(userId, queryParams);

    // TODO: test validations
    }
    /**
     * Resolve path
     *
     * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
     */
    @Test
    public void resolvePathCoursesTest() {
        String courseId = null;
        // List<Folder> response = api.resolvePathCourses(courseId);

        // TODO: test validations
    }

    /**
     * Resolve path
     *
     * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
     */
    @Test
    public void resolvePathCoursesFullPathTest() {
        String courseId = null;
        // List<Folder> response = api.resolvePathCoursesFullPath(courseId);

        // TODO: test validations
    }

    /**
     * Resolve path
     *
     * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
     */
    @Test
    public void resolvePathGroupsTest() {
        String groupId = null;
        // List<Folder> response = api.resolvePathGroups(groupId);

        // TODO: test validations
    }

    /**
     * Resolve path
     *
     * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
     */
    @Test
    public void resolvePathGroupsFullPathTest() {
        String groupId = null;
        // List<Folder> response = api.resolvePathGroupsFullPath(groupId);

        // TODO: test validations
    }

    /**
     * Resolve path
     *
     * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
     */
    @Test
    public void resolvePathUsersTest() {
        String userId = null;
        // List<Folder> response = api.resolvePathUsers(userId);

        // TODO: test validations
    }

    /**
     * Resolve path
     *
     * Given the full path to a folder, returns a list of all Folders in the path hierarchy, starting at the root folder, and ending at the requested folder. The given path is relative to the context&#x27;s root folder and does not include the root folder&#x27;s name (e.g., \&quot;course files\&quot;). If an empty path is given, the context&#x27;s root folder alone is returned. Otherwise, if no folder exists with the given full path, a Not Found error is returned.
     */
    @Test
    public void resolvePathUsersFullPathTest() {
        String userId = null;
        // List<Folder> response = api.resolvePathUsersFullPath(userId);

        // TODO: test validations
    }

    /**
     * Set usage rights
     *
     * Sets copyright and license information for one or more files
     */
    @Test
    public void setUsageRightsCoursesTest() {
        String courseId = null;
        List<String> fileIds = null;
        List<String> folderIds = null;
        Boolean publish = null;
        String usageRightsUseJustification = null;
        String usageRightsLegalCopyright = null;
        String usageRightsLicense = null;
        // UsageRights response = api.setUsageRightsCourses(courseId, fileIds, folderIds, publish, usageRightsUseJustification, usageRightsLegalCopyright, usageRightsLicense);

        // TODO: test validations
    }

    /**
     * Set usage rights
     *
     * Sets copyright and license information for one or more files
     */
    @Test
    public void setUsageRightsGroupsTest() {
        String groupId = null;
        List<String> fileIds = null;
        List<String> folderIds = null;
        Boolean publish = null;
        String usageRightsUseJustification = null;
        String usageRightsLegalCopyright = null;
        String usageRightsLicense = null;
        // UsageRights response = api.setUsageRightsGroups(groupId, fileIds, folderIds, publish, usageRightsUseJustification, usageRightsLegalCopyright, usageRightsLicense);

        // TODO: test validations
    }

    /**
     * Set usage rights
     *
     * Sets copyright and license information for one or more files
     */
    @Test
    public void setUsageRightsUsersTest() {
        String userId = null;
        List<String> fileIds = null;
        List<String> folderIds = null;
        Boolean publish = null;
        String usageRightsUseJustification = null;
        String usageRightsLegalCopyright = null;
        String usageRightsLicense = null;
        // UsageRights response = api.setUsageRightsUsers(userId, fileIds, folderIds, publish, usageRightsUseJustification, usageRightsLegalCopyright, usageRightsLicense);

        // TODO: test validations
    }

    /**
     * Update file
     *
     * Update some settings on the specified file
     */
    @Test
    public void updateFileTest() {
        String id = null;
        String name = null;
        String parentFolderId = null;
        String onDuplicate = null;
        String lockAt = null;
        String unlockAt = null;
        Boolean locked = null;
        Boolean hidden = null;
        // java.io.File response = api.updateFile(id, name, parentFolderId, onDuplicate, lockAt, unlockAt, locked, hidden);

        // TODO: test validations
    }

    /**
     * Update folder
     *
     * Updates a folder
     */
    @Test
    public void updateFolderTest() {
        String id = null;
        String name = null;
        String parentFolderId = null;
        String lockAt = null;
        String unlockAt = null;
        Boolean locked = null;
        Boolean hidden = null;
        Integer position = null;
        // Folder response = api.updateFolder(id, name, parentFolderId, lockAt, unlockAt, locked, hidden, position);

        // TODO: test validations
    }

    /**
     * Upload a file
     *
     * Upload a file to a folder.  This API endpoint is the first step in uploading a file. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  Only those with the \&quot;Manage Files\&quot; permission on a course or group can upload files to a folder in that course or group.
     */
    @Test
    public void uploadFileTest() {
        String folderId = null;
        // api.uploadFile(folderId);

        // TODO: test validations
    }

}
