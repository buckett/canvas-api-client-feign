package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.PeerReview;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface PeerReviewsApi extends ApiClient.Api {

  /**
   * Create Peer Review
   * Create a peer review for the assignment
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param userId  (optional)
   * @return PeerReview
   */
  @RequestLine("POST /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  PeerReview createPeerReviewCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("userId") Integer userId);
  
  /**
   * Create Peer Review
   * Create a peer review for the assignment
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param userId  (optional)
   * @return PeerReview
   */
  @RequestLine("POST /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  PeerReview createPeerReviewSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("userId") Integer userId);
  
  /**
   * Delete Peer Review
   * Delete a peer review for the assignment
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param userId user_id to delete as reviewer on this assignment (required)
   * @return PeerReview
   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?user_id={userId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PeerReview deletePeerReviewCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("userId") Integer userId);
  

  /**
   * Delete Peer Review
   * Delete a peer review for the assignment
   * Note, this is equivalent to the other <code>deletePeerReviewCourses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePeerReviewCoursesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - user_id to delete as reviewer on this assignment (required)</li>
   *   </ul>
   * @return PeerReview

   */
  @RequestLine("DELETE /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?user_id={userId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PeerReview deletePeerReviewCourses(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deletePeerReviewCourses</code> method in a fluent style.
   */
  public static class DeletePeerReviewCoursesQueryParams extends HashMap<String, Object> {
    public DeletePeerReviewCoursesQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Delete Peer Review
   * Delete a peer review for the assignment
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param userId user_id to delete as reviewer on this assignment (required)
   * @return PeerReview
   */
  @RequestLine("DELETE /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?user_id={userId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PeerReview deletePeerReviewSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("userId") Integer userId);
  

  /**
   * Delete Peer Review
   * Delete a peer review for the assignment
   * Note, this is equivalent to the other <code>deletePeerReviewSections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePeerReviewSectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - user_id to delete as reviewer on this assignment (required)</li>
   *   </ul>
   * @return PeerReview

   */
  @RequestLine("DELETE /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?user_id={userId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  PeerReview deletePeerReviewSections(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deletePeerReviewSections</code> method in a fluent style.
   */
  public static class DeletePeerReviewSectionsQueryParams extends HashMap<String, Object> {
    public DeletePeerReviewSectionsQueryParams userId(final Integer value) {
      put("user_id", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param include Associations to include with the peer review. (optional)
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/peer_reviews?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsCoursesPeerReviews(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsCoursesPeerReviews(URI uri);
  

  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * Note, this is equivalent to the other <code>getAllPeerReviewsCoursesPeerReviews</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPeerReviewsCoursesPeerReviewsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the peer review. (optional)</li>
   *   </ul>
   * @return List&lt;PeerReview&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/peer_reviews?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsCoursesPeerReviews(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllPeerReviewsCoursesPeerReviews</code> method in a fluent style.
   */
  public static class GetAllPeerReviewsCoursesPeerReviewsQueryParams extends HashMap<String, Object> {
    public GetAllPeerReviewsCoursesPeerReviewsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param include Associations to include with the peer review. (optional)
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsCoursesSubmissions(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsCoursesSubmissions(URI uri);
  

  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * Note, this is equivalent to the other <code>getAllPeerReviewsCoursesSubmissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPeerReviewsCoursesSubmissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the peer review. (optional)</li>
   *   </ul>
   * @return List&lt;PeerReview&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsCoursesSubmissions(@Param("courseId") String courseId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllPeerReviewsCoursesSubmissions</code> method in a fluent style.
   */
  public static class GetAllPeerReviewsCoursesSubmissionsQueryParams extends HashMap<String, Object> {
    public GetAllPeerReviewsCoursesSubmissionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param include Associations to include with the peer review. (optional)
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/peer_reviews?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsSectionsPeerReviews(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsSectionsPeerReviews(URI uri);
  

  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * Note, this is equivalent to the other <code>getAllPeerReviewsSectionsPeerReviews</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPeerReviewsSectionsPeerReviewsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the peer review. (optional)</li>
   *   </ul>
   * @return List&lt;PeerReview&gt;

   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/peer_reviews?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsSectionsPeerReviews(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllPeerReviewsSectionsPeerReviews</code> method in a fluent style.
   */
  public static class GetAllPeerReviewsSectionsPeerReviewsQueryParams extends HashMap<String, Object> {
    public GetAllPeerReviewsSectionsPeerReviewsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param include Associations to include with the peer review. (optional)
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?include={include}")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsSectionsSubmissions(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @Param("include") List<String> include);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;PeerReview&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsSectionsSubmissions(URI uri);
  

  /**
   * Get all Peer Reviews
   * Get a list of all Peer Reviews for this assignment
   * Note, this is equivalent to the other <code>getAllPeerReviewsSectionsSubmissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllPeerReviewsSectionsSubmissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param sectionId ID (required)
   * @param assignmentId ID (required)
   * @param submissionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the peer review. (optional)</li>
   *   </ul>
   * @return List&lt;PeerReview&gt;

   */
  @RequestLine("GET /v1/sections/{sectionId}/assignments/{assignmentId}/submissions/{submissionId}/peer_reviews?include={include}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<PeerReview> getAllPeerReviewsSectionsSubmissions(@Param("sectionId") String sectionId, @Param("assignmentId") String assignmentId, @Param("submissionId") String submissionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllPeerReviewsSectionsSubmissions</code> method in a fluent style.
   */
  public static class GetAllPeerReviewsSectionsSubmissionsQueryParams extends HashMap<String, Object> {
    public GetAllPeerReviewsSectionsSubmissionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
}
