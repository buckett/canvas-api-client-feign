package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Bookmark;
import com.instructure.canvas.model.Folder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarksApi
 */
public class BookmarksApiTest {

    private BookmarksApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(BookmarksApi.class);
    }

    /**
     * Create bookmark
     *
     * Creates a bookmark.
     */
    @Test
    public void createBookmarkTest() {
        String name = null;
        String url = null;
        Integer position = null;
        String data = null;
        // Bookmark response = api.createBookmark(name, url, position, data);

        // TODO: test validations
    }

    /**
     * Delete bookmark
     *
     * Deletes a bookmark
     */
    @Test
    public void deleteBookmarkTest() {
        String id = null;
        // api.deleteBookmark(id);

        // TODO: test validations
    }

    /**
     * Get bookmark
     *
     * Returns the details for a bookmark.
     */
    @Test
    public void getBookmarkTest() {
        String id = null;
        // Bookmark response = api.getBookmark(id);

        // TODO: test validations
    }

    /**
     * List bookmarks
     *
     * Returns the paginated list of bookmarks.
     */
    @Test
    public void listBookmarksTest() {
        // List<Bookmark> response = api.listBookmarks();

        // TODO: test validations
    }

    /**
     * Update bookmark
     *
     * Updates a bookmark
     */
    @Test
    public void updateBookmarkTest() {
        String id = null;
        String name = null;
        String url = null;
        Integer position = null;
        String data = null;
        // Folder response = api.updateBookmark(id, name, url, position, data);

        // TODO: test validations
    }

}
