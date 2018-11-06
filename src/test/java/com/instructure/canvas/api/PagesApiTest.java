package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Page;
import com.instructure.canvas.model.PageRevision;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagesApi
 */
public class PagesApiTest {

    private PagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PagesApi.class);
    }

    /**
     * Create page
     *
     * Create a new wiki page
     */
    @Test
    public void createPageCoursesTest() {
        String courseId = null;
        String wikiPageTitle = null;
        String wikiPageBody = null;
        String wikiPageEditingRoles = null;
        Boolean wikiPageNotifyOfUpdate = null;
        Boolean wikiPagePublished = null;
        Boolean wikiPageFrontPage = null;
        // Page response = api.createPageCourses(courseId, wikiPageTitle, wikiPageBody, wikiPageEditingRoles, wikiPageNotifyOfUpdate, wikiPagePublished, wikiPageFrontPage);

        // TODO: test validations
    }

    /**
     * Create page
     *
     * Create a new wiki page
     */
    @Test
    public void createPageGroupsTest() {
        String groupId = null;
        String wikiPageTitle = null;
        String wikiPageBody = null;
        String wikiPageEditingRoles = null;
        Boolean wikiPageNotifyOfUpdate = null;
        Boolean wikiPagePublished = null;
        Boolean wikiPageFrontPage = null;
        // Page response = api.createPageGroups(groupId, wikiPageTitle, wikiPageBody, wikiPageEditingRoles, wikiPageNotifyOfUpdate, wikiPagePublished, wikiPageFrontPage);

        // TODO: test validations
    }

    /**
     * Delete page
     *
     * Delete a wiki page
     */
    @Test
    public void deletePageCoursesTest() {
        String courseId = null;
        String url = null;
        // Page response = api.deletePageCourses(courseId, url);

        // TODO: test validations
    }

    /**
     * Delete page
     *
     * Delete a wiki page
     */
    @Test
    public void deletePageGroupsTest() {
        String groupId = null;
        String url = null;
        // Page response = api.deletePageGroups(groupId, url);

        // TODO: test validations
    }

    /**
     * Duplicate page
     *
     * Duplicate a wiki page
     */
    @Test
    public void duplicatePageTest() {
        String courseId = null;
        String url = null;
        // Page response = api.duplicatePage(courseId, url);

        // TODO: test validations
    }

    /**
     * List pages
     *
     * A paginated list of the wiki pages associated with a course or group
     */
    @Test
    public void listPagesCoursesTest() {
        String courseId = null;
        String sort = null;
        String order = null;
        String searchTerm = null;
        Boolean published = null;
        // List<Page> response = api.listPagesCourses(courseId, sort, order, searchTerm, published);

        // TODO: test validations
    }

    /**
     * List pages
     *
     * A paginated list of the wiki pages associated with a course or group
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPagesCoursesTestQueryMap() {
        String courseId = null;
        PagesApi.ListPagesCoursesQueryParams queryParams = new PagesApi.ListPagesCoursesQueryParams()
            .sort(null)
            .order(null)
            .searchTerm(null)
            .published(null);
        // List<Page> response = api.listPagesCourses(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * List pages
     *
     * A paginated list of the wiki pages associated with a course or group
     */
    @Test
    public void listPagesGroupsTest() {
        String groupId = null;
        String sort = null;
        String order = null;
        String searchTerm = null;
        Boolean published = null;
        // List<Page> response = api.listPagesGroups(groupId, sort, order, searchTerm, published);

        // TODO: test validations
    }

    /**
     * List pages
     *
     * A paginated list of the wiki pages associated with a course or group
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listPagesGroupsTestQueryMap() {
        String groupId = null;
        PagesApi.ListPagesGroupsQueryParams queryParams = new PagesApi.ListPagesGroupsQueryParams()
            .sort(null)
            .order(null)
            .searchTerm(null)
            .published(null);
        // List<Page> response = api.listPagesGroups(groupId, queryParams);

    // TODO: test validations
    }
    /**
     * List revisions
     *
     * A paginated list of the revisions of a page. Callers must have update rights on the page in order to see page history.
     */
    @Test
    public void listRevisionsCoursesTest() {
        String courseId = null;
        String url = null;
        // List<PageRevision> response = api.listRevisionsCourses(courseId, url);

        // TODO: test validations
    }

    /**
     * List revisions
     *
     * A paginated list of the revisions of a page. Callers must have update rights on the page in order to see page history.
     */
    @Test
    public void listRevisionsGroupsTest() {
        String groupId = null;
        String url = null;
        // List<PageRevision> response = api.listRevisionsGroups(groupId, url);

        // TODO: test validations
    }

    /**
     * Revert to revision
     *
     * Revert a page to a prior revision.
     */
    @Test
    public void revertToRevisionCoursesTest() {
        String courseId = null;
        String url = null;
        Integer revisionId = null;
        // PageRevision response = api.revertToRevisionCourses(courseId, url, revisionId);

        // TODO: test validations
    }

    /**
     * Revert to revision
     *
     * Revert a page to a prior revision.
     */
    @Test
    public void revertToRevisionGroupsTest() {
        String groupId = null;
        String url = null;
        Integer revisionId = null;
        // PageRevision response = api.revertToRevisionGroups(groupId, url, revisionId);

        // TODO: test validations
    }

    /**
     * Show front page
     *
     * Retrieve the content of the front page
     */
    @Test
    public void showFrontPageCoursesTest() {
        String courseId = null;
        // Page response = api.showFrontPageCourses(courseId);

        // TODO: test validations
    }

    /**
     * Show front page
     *
     * Retrieve the content of the front page
     */
    @Test
    public void showFrontPageGroupsTest() {
        String groupId = null;
        // Page response = api.showFrontPageGroups(groupId);

        // TODO: test validations
    }

    /**
     * Show page
     *
     * Retrieve the content of a wiki page
     */
    @Test
    public void showPageCoursesTest() {
        String courseId = null;
        String url = null;
        // Page response = api.showPageCourses(courseId, url);

        // TODO: test validations
    }

    /**
     * Show page
     *
     * Retrieve the content of a wiki page
     */
    @Test
    public void showPageGroupsTest() {
        String groupId = null;
        String url = null;
        // Page response = api.showPageGroups(groupId, url);

        // TODO: test validations
    }

    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     */
    @Test
    public void showRevisionCoursesLatestTest() {
        String courseId = null;
        String url = null;
        Boolean summary = null;
        // PageRevision response = api.showRevisionCoursesLatest(courseId, url, summary);

        // TODO: test validations
    }

    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showRevisionCoursesLatestTestQueryMap() {
        String courseId = null;
        String url = null;
        PagesApi.ShowRevisionCoursesLatestQueryParams queryParams = new PagesApi.ShowRevisionCoursesLatestQueryParams()
            .summary(null);
        // PageRevision response = api.showRevisionCoursesLatest(courseId, url, queryParams);

    // TODO: test validations
    }
    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     */
    @Test
    public void showRevisionCoursesRevisionIdTest() {
        String courseId = null;
        String url = null;
        String revisionId = null;
        Boolean summary = null;
        // PageRevision response = api.showRevisionCoursesRevisionId(courseId, url, revisionId, summary);

        // TODO: test validations
    }

    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showRevisionCoursesRevisionIdTestQueryMap() {
        String courseId = null;
        String url = null;
        String revisionId = null;
        PagesApi.ShowRevisionCoursesRevisionIdQueryParams queryParams = new PagesApi.ShowRevisionCoursesRevisionIdQueryParams()
            .summary(null);
        // PageRevision response = api.showRevisionCoursesRevisionId(courseId, url, revisionId, queryParams);

    // TODO: test validations
    }
    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     */
    @Test
    public void showRevisionGroupsLatestTest() {
        String groupId = null;
        String url = null;
        Boolean summary = null;
        // PageRevision response = api.showRevisionGroupsLatest(groupId, url, summary);

        // TODO: test validations
    }

    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showRevisionGroupsLatestTestQueryMap() {
        String groupId = null;
        String url = null;
        PagesApi.ShowRevisionGroupsLatestQueryParams queryParams = new PagesApi.ShowRevisionGroupsLatestQueryParams()
            .summary(null);
        // PageRevision response = api.showRevisionGroupsLatest(groupId, url, queryParams);

    // TODO: test validations
    }
    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     */
    @Test
    public void showRevisionGroupsRevisionIdTest() {
        String groupId = null;
        String url = null;
        String revisionId = null;
        Boolean summary = null;
        // PageRevision response = api.showRevisionGroupsRevisionId(groupId, url, revisionId, summary);

        // TODO: test validations
    }

    /**
     * Show revision
     *
     * Retrieve the metadata and optionally content of a revision of the page. Note that retrieving historic versions of pages requires edit rights.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void showRevisionGroupsRevisionIdTestQueryMap() {
        String groupId = null;
        String url = null;
        String revisionId = null;
        PagesApi.ShowRevisionGroupsRevisionIdQueryParams queryParams = new PagesApi.ShowRevisionGroupsRevisionIdQueryParams()
            .summary(null);
        // PageRevision response = api.showRevisionGroupsRevisionId(groupId, url, revisionId, queryParams);

    // TODO: test validations
    }
    /**
     * Update/create front page
     *
     * Update the title or contents of the front page
     */
    @Test
    public void updateCreateFrontPageCoursesTest() {
        String courseId = null;
        String wikiPageTitle = null;
        String wikiPageBody = null;
        String wikiPageEditingRoles = null;
        Boolean wikiPageNotifyOfUpdate = null;
        Boolean wikiPagePublished = null;
        // Page response = api.updateCreateFrontPageCourses(courseId, wikiPageTitle, wikiPageBody, wikiPageEditingRoles, wikiPageNotifyOfUpdate, wikiPagePublished);

        // TODO: test validations
    }

    /**
     * Update/create front page
     *
     * Update the title or contents of the front page
     */
    @Test
    public void updateCreateFrontPageGroupsTest() {
        String groupId = null;
        String wikiPageTitle = null;
        String wikiPageBody = null;
        String wikiPageEditingRoles = null;
        Boolean wikiPageNotifyOfUpdate = null;
        Boolean wikiPagePublished = null;
        // Page response = api.updateCreateFrontPageGroups(groupId, wikiPageTitle, wikiPageBody, wikiPageEditingRoles, wikiPageNotifyOfUpdate, wikiPagePublished);

        // TODO: test validations
    }

    /**
     * Update/create page
     *
     * Update the title or contents of a wiki page
     */
    @Test
    public void updateCreatePageCoursesTest() {
        String courseId = null;
        String url = null;
        String wikiPageTitle = null;
        String wikiPageBody = null;
        String wikiPageEditingRoles = null;
        Boolean wikiPageNotifyOfUpdate = null;
        Boolean wikiPagePublished = null;
        Boolean wikiPageFrontPage = null;
        // Page response = api.updateCreatePageCourses(courseId, url, wikiPageTitle, wikiPageBody, wikiPageEditingRoles, wikiPageNotifyOfUpdate, wikiPagePublished, wikiPageFrontPage);

        // TODO: test validations
    }

    /**
     * Update/create page
     *
     * Update the title or contents of a wiki page
     */
    @Test
    public void updateCreatePageGroupsTest() {
        String groupId = null;
        String url = null;
        String wikiPageTitle = null;
        String wikiPageBody = null;
        String wikiPageEditingRoles = null;
        Boolean wikiPageNotifyOfUpdate = null;
        Boolean wikiPagePublished = null;
        Boolean wikiPageFrontPage = null;
        // Page response = api.updateCreatePageGroups(groupId, url, wikiPageTitle, wikiPageBody, wikiPageEditingRoles, wikiPageNotifyOfUpdate, wikiPagePublished, wikiPageFrontPage);

        // TODO: test validations
    }

}
