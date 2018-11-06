package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.PeerReview;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeerReviewsApi
 */
public class PeerReviewsApiTest {

    private PeerReviewsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(PeerReviewsApi.class);
    }

    /**
     * Create Peer Review
     *
     * Create a peer review for the assignment
     */
    @Test
    public void createPeerReviewCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String submissionId = null;
        Integer userId = null;
        // PeerReview response = api.createPeerReviewCourses(courseId, assignmentId, submissionId, userId);

        // TODO: test validations
    }

    /**
     * Create Peer Review
     *
     * Create a peer review for the assignment
     */
    @Test
    public void createPeerReviewSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String submissionId = null;
        Integer userId = null;
        // PeerReview response = api.createPeerReviewSections(sectionId, assignmentId, submissionId, userId);

        // TODO: test validations
    }

    /**
     * Delete Peer Review
     *
     * Delete a peer review for the assignment
     */
    @Test
    public void deletePeerReviewCoursesTest() {
        String courseId = null;
        String assignmentId = null;
        String submissionId = null;
        Integer userId = null;
        // PeerReview response = api.deletePeerReviewCourses(courseId, assignmentId, submissionId, userId);

        // TODO: test validations
    }

    /**
     * Delete Peer Review
     *
     * Delete a peer review for the assignment
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deletePeerReviewCoursesTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        String submissionId = null;
        PeerReviewsApi.DeletePeerReviewCoursesQueryParams queryParams = new PeerReviewsApi.DeletePeerReviewCoursesQueryParams()
            .userId(null);
        // PeerReview response = api.deletePeerReviewCourses(courseId, assignmentId, submissionId, queryParams);

    // TODO: test validations
    }
    /**
     * Delete Peer Review
     *
     * Delete a peer review for the assignment
     */
    @Test
    public void deletePeerReviewSectionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String submissionId = null;
        Integer userId = null;
        // PeerReview response = api.deletePeerReviewSections(sectionId, assignmentId, submissionId, userId);

        // TODO: test validations
    }

    /**
     * Delete Peer Review
     *
     * Delete a peer review for the assignment
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void deletePeerReviewSectionsTestQueryMap() {
        String sectionId = null;
        String assignmentId = null;
        String submissionId = null;
        PeerReviewsApi.DeletePeerReviewSectionsQueryParams queryParams = new PeerReviewsApi.DeletePeerReviewSectionsQueryParams()
            .userId(null);
        // PeerReview response = api.deletePeerReviewSections(sectionId, assignmentId, submissionId, queryParams);

    // TODO: test validations
    }
    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     */
    @Test
    public void getAllPeerReviewsCoursesPeerReviewsTest() {
        String courseId = null;
        String assignmentId = null;
        List<String> include = null;
        // List<PeerReview> response = api.getAllPeerReviewsCoursesPeerReviews(courseId, assignmentId, include);

        // TODO: test validations
    }

    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllPeerReviewsCoursesPeerReviewsTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        PeerReviewsApi.GetAllPeerReviewsCoursesPeerReviewsQueryParams queryParams = new PeerReviewsApi.GetAllPeerReviewsCoursesPeerReviewsQueryParams()
            .include(null);
        // List<PeerReview> response = api.getAllPeerReviewsCoursesPeerReviews(courseId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     */
    @Test
    public void getAllPeerReviewsCoursesSubmissionsTest() {
        String courseId = null;
        String assignmentId = null;
        String submissionId = null;
        List<String> include = null;
        // List<PeerReview> response = api.getAllPeerReviewsCoursesSubmissions(courseId, assignmentId, submissionId, include);

        // TODO: test validations
    }

    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllPeerReviewsCoursesSubmissionsTestQueryMap() {
        String courseId = null;
        String assignmentId = null;
        String submissionId = null;
        PeerReviewsApi.GetAllPeerReviewsCoursesSubmissionsQueryParams queryParams = new PeerReviewsApi.GetAllPeerReviewsCoursesSubmissionsQueryParams()
            .include(null);
        // List<PeerReview> response = api.getAllPeerReviewsCoursesSubmissions(courseId, assignmentId, submissionId, queryParams);

    // TODO: test validations
    }
    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     */
    @Test
    public void getAllPeerReviewsSectionsPeerReviewsTest() {
        String sectionId = null;
        String assignmentId = null;
        List<String> include = null;
        // List<PeerReview> response = api.getAllPeerReviewsSectionsPeerReviews(sectionId, assignmentId, include);

        // TODO: test validations
    }

    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllPeerReviewsSectionsPeerReviewsTestQueryMap() {
        String sectionId = null;
        String assignmentId = null;
        PeerReviewsApi.GetAllPeerReviewsSectionsPeerReviewsQueryParams queryParams = new PeerReviewsApi.GetAllPeerReviewsSectionsPeerReviewsQueryParams()
            .include(null);
        // List<PeerReview> response = api.getAllPeerReviewsSectionsPeerReviews(sectionId, assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     */
    @Test
    public void getAllPeerReviewsSectionsSubmissionsTest() {
        String sectionId = null;
        String assignmentId = null;
        String submissionId = null;
        List<String> include = null;
        // List<PeerReview> response = api.getAllPeerReviewsSectionsSubmissions(sectionId, assignmentId, submissionId, include);

        // TODO: test validations
    }

    /**
     * Get all Peer Reviews
     *
     * Get a list of all Peer Reviews for this assignment
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllPeerReviewsSectionsSubmissionsTestQueryMap() {
        String sectionId = null;
        String assignmentId = null;
        String submissionId = null;
        PeerReviewsApi.GetAllPeerReviewsSectionsSubmissionsQueryParams queryParams = new PeerReviewsApi.GetAllPeerReviewsSectionsSubmissionsQueryParams()
            .include(null);
        // List<PeerReview> response = api.getAllPeerReviewsSectionsSubmissions(sectionId, assignmentId, submissionId, queryParams);

    // TODO: test validations
    }
}
