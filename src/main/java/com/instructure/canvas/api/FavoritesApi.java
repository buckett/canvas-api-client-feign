package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Course;
import com.instructure.canvas.model.Favorite;
import com.instructure.canvas.model.Group;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface FavoritesApi extends ApiClient.Api {

  /**
   * Add course to favorites
   * Add a course to the current user&#x27;s favorites.  If the course is already in the user&#x27;s favorites, nothing happens.
   * @param id The ID or SIS ID of the course to add.  The current user must be registered in the course. (required)
   * @return Favorite
   */
  @RequestLine("POST /v1/users/self/favorites/courses/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Favorite addCourseToFavorites(@Param("id") String id);
  
  /**
   * Add group to favorites
   * Add a group to the current user&#x27;s favorites.  If the group is already in the user&#x27;s favorites, nothing happens.
   * @param id The ID or SIS ID of the group to add.  The current user must be a member of the group. (required)
   * @return Favorite
   */
  @RequestLine("POST /v1/users/self/favorites/groups/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Favorite addGroupToFavorites(@Param("id") String id);
  
  /**
   * List favorite courses
   * Retrieve the paginated list of favorite courses for the current user. If the user has not chosen any favorites, then a selection of currently enrolled courses will be returned.  See the {api:CoursesController#index List courses API} for details on accepted include[] parameters.
   * @param excludeBlueprintCourses When set, only return courses that are not configured as blueprint courses. (optional)
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET /v1/users/self/favorites/courses?exclude_blueprint_courses={excludeBlueprintCourses}")
  @Headers({
      "Accept: application/json",
  })
  List<Course> listFavoriteCourses(@Param("excludeBlueprintCourses") Boolean excludeBlueprintCourses);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Course&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Course> listFavoriteCourses(URI uri);
  

  /**
   * List favorite courses
   * Retrieve the paginated list of favorite courses for the current user. If the user has not chosen any favorites, then a selection of currently enrolled courses will be returned.  See the {api:CoursesController#index List courses API} for details on accepted include[] parameters.
   * Note, this is equivalent to the other <code>listFavoriteCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListFavoriteCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>excludeBlueprintCourses - When set, only return courses that are not configured as blueprint courses. (optional)</li>
   *   </ul>
   * @return List&lt;Course&gt;

   */
  @RequestLine("GET /v1/users/self/favorites/courses?exclude_blueprint_courses={excludeBlueprintCourses}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Course> listFavoriteCourses(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listFavoriteCourses</code> method in a fluent style.
   */
  public static class ListFavoriteCoursesQueryParams extends HashMap<String, Object> {
    public ListFavoriteCoursesQueryParams excludeBlueprintCourses(final Boolean value) {
      put("exclude_blueprint_courses", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * List favorite groups
   * Retrieve the paginated list of favorite groups for the current user. If the user has not chosen any favorites, then a selection of groups that the user is a member of will be returned.
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET /v1/users/self/favorites/groups")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listFavoriteGroups();

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Group&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Group> listFavoriteGroups(URI uri);
  
  /**
   * Remove course from favorites
   * Remove a course from the current user&#x27;s favorites.
   * @param id the ID or SIS ID of the course to remove (required)
   * @return Favorite
   */
  @RequestLine("DELETE /v1/users/self/favorites/courses/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Favorite removeCourseFromFavorites(@Param("id") String id);
  
  /**
   * Remove group from favorites
   * Remove a group from the current user&#x27;s favorites.
   * @param id the ID or SIS ID of the group to remove (required)
   * @return Favorite
   */
  @RequestLine("DELETE /v1/users/self/favorites/groups/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Favorite removeGroupFromFavorites(@Param("id") String id);
  
  /**
   * Reset course favorites
   * Reset the current user&#x27;s course favorites to the default automatically generated list of enrolled courses
   */
  @RequestLine("DELETE /v1/users/self/favorites/courses")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void resetCourseFavorites();
  
  /**
   * Reset group favorites
   * Reset the current user&#x27;s group favorites to the default automatically generated list of enrolled group
   */
  @RequestLine("DELETE /v1/users/self/favorites/groups")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void resetGroupFavorites();
  
}
