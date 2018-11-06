package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Course;
import com.instructure.canvas.model.Favorite;
import com.instructure.canvas.model.Group;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FavoritesApi
 */
public class FavoritesApiTest {

    private FavoritesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(FavoritesApi.class);
    }

    /**
     * Add course to favorites
     *
     * Add a course to the current user&#x27;s favorites.  If the course is already in the user&#x27;s favorites, nothing happens.
     */
    @Test
    public void addCourseToFavoritesTest() {
        String id = null;
        // Favorite response = api.addCourseToFavorites(id);

        // TODO: test validations
    }

    /**
     * Add group to favorites
     *
     * Add a group to the current user&#x27;s favorites.  If the group is already in the user&#x27;s favorites, nothing happens.
     */
    @Test
    public void addGroupToFavoritesTest() {
        String id = null;
        // Favorite response = api.addGroupToFavorites(id);

        // TODO: test validations
    }

    /**
     * List favorite courses
     *
     * Retrieve the paginated list of favorite courses for the current user. If the user has not chosen any favorites, then a selection of currently enrolled courses will be returned.  See the {api:CoursesController#index List courses API} for details on accepted include[] parameters.
     */
    @Test
    public void listFavoriteCoursesTest() {
        Boolean excludeBlueprintCourses = null;
        // List<Course> response = api.listFavoriteCourses(excludeBlueprintCourses);

        // TODO: test validations
    }

    /**
     * List favorite courses
     *
     * Retrieve the paginated list of favorite courses for the current user. If the user has not chosen any favorites, then a selection of currently enrolled courses will be returned.  See the {api:CoursesController#index List courses API} for details on accepted include[] parameters.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listFavoriteCoursesTestQueryMap() {
        FavoritesApi.ListFavoriteCoursesQueryParams queryParams = new FavoritesApi.ListFavoriteCoursesQueryParams()
            .excludeBlueprintCourses(null);
        // List<Course> response = api.listFavoriteCourses(queryParams);

    // TODO: test validations
    }
    /**
     * List favorite groups
     *
     * Retrieve the paginated list of favorite groups for the current user. If the user has not chosen any favorites, then a selection of groups that the user is a member of will be returned.
     */
    @Test
    public void listFavoriteGroupsTest() {
        // List<Group> response = api.listFavoriteGroups();

        // TODO: test validations
    }

    /**
     * Remove course from favorites
     *
     * Remove a course from the current user&#x27;s favorites.
     */
    @Test
    public void removeCourseFromFavoritesTest() {
        String id = null;
        // Favorite response = api.removeCourseFromFavorites(id);

        // TODO: test validations
    }

    /**
     * Remove group from favorites
     *
     * Remove a group from the current user&#x27;s favorites.
     */
    @Test
    public void removeGroupFromFavoritesTest() {
        String id = null;
        // Favorite response = api.removeGroupFromFavorites(id);

        // TODO: test validations
    }

    /**
     * Reset course favorites
     *
     * Reset the current user&#x27;s course favorites to the default automatically generated list of enrolled courses
     */
    @Test
    public void resetCourseFavoritesTest() {
        // api.resetCourseFavorites();

        // TODO: test validations
    }

    /**
     * Reset group favorites
     *
     * Reset the current user&#x27;s group favorites to the default automatically generated list of enrolled group
     */
    @Test
    public void resetGroupFavoritesTest() {
        // api.resetGroupFavorites();

        // TODO: test validations
    }

}
