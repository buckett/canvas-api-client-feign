package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizSubmissionsApi
 */
public class QuizSubmissionsApiTest {

    private QuizSubmissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizSubmissionsApi.class);
    }

    /**
     * Complete the quiz submission (turn it in).
     *
     * Complete the quiz submission by marking it as complete and grading it. When the quiz submission has been marked as complete, no further modifications will be allowed.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if an invalid access code is specified * &lt;b&gt;403 Forbidden&lt;/b&gt; if the Quiz&#x27;s IP filter restriction does not pass * &lt;b&gt;403 Forbidden&lt;/b&gt; if an invalid token is specified * &lt;b&gt;400 Bad Request&lt;/b&gt; if the QS is already complete * &lt;b&gt;400 Bad Request&lt;/b&gt; if the attempt parameter is missing * &lt;b&gt;400 Bad Request&lt;/b&gt; if the attempt parameter is not the latest attempt
     */
    @Test
    public void completeQuizSubmissionTurnItInTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        Integer attempt = null;
        String validationToken = null;
        String accessCode = null;
        // api.completeQuizSubmissionTurnItIn(courseId, quizId, id, attempt, validationToken, accessCode);

        // TODO: test validations
    }

    /**
     * Create the quiz submission (start a quiz-taking session)
     *
     * Start taking a Quiz by creating a QuizSubmission which you can use to answer questions and submit your answers.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;400 Bad Request&lt;/b&gt; if the quiz is locked * &lt;b&gt;403 Forbidden&lt;/b&gt; if an invalid access code is specified * &lt;b&gt;403 Forbidden&lt;/b&gt; if the Quiz&#x27;s IP filter restriction does not pass * &lt;b&gt;409 Conflict&lt;/b&gt; if a QuizSubmission already exists for this user and quiz
     */
    @Test
    public void createQuizSubmissionStartQuizTakingSessionTest() {
        String courseId = null;
        String quizId = null;
        String accessCode = null;
        Boolean preview = null;
        // api.createQuizSubmissionStartQuizTakingSession(courseId, quizId, accessCode, preview);

        // TODO: test validations
    }

    /**
     * Get all quiz submissions.
     *
     * Get a list of all submissions for this quiz. Users who can view or manage grades for a course will have submissions from multiple users returned. A user who can only submit will have only their own submissions returned. When a user has an in-progress submission, only that submission is returned. When there isn&#x27;t an in-progress quiz_submission, all completed submissions, including previous attempts, are returned.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     */
    @Test
    public void getAllQuizSubmissionsTest() {
        String courseId = null;
        String quizId = null;
        List<String> include = null;
        // api.getAllQuizSubmissions(courseId, quizId, include);

        // TODO: test validations
    }

    /**
     * Get all quiz submissions.
     *
     * Get a list of all submissions for this quiz. Users who can view or manage grades for a course will have submissions from multiple users returned. A user who can only submit will have only their own submissions returned. When a user has an in-progress submission, only that submission is returned. When there isn&#x27;t an in-progress quiz_submission, all completed submissions, including previous attempts, are returned.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllQuizSubmissionsTestQueryMap() {
        String courseId = null;
        String quizId = null;
        QuizSubmissionsApi.GetAllQuizSubmissionsQueryParams queryParams = new QuizSubmissionsApi.GetAllQuizSubmissionsQueryParams()
            .include(null);
        // api.getAllQuizSubmissions(courseId, quizId, queryParams);

    // TODO: test validations
    }
    /**
     * Get current quiz submission times.
     *
     * Get the current timing data for the quiz attempt, both the end_at timestamp and the time_left parameter.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful
     */
    @Test
    public void getCurrentQuizSubmissionTimesTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        // api.getCurrentQuizSubmissionTimes(courseId, quizId, id);

        // TODO: test validations
    }

    /**
     * Get the quiz submission.
     *
     * Get the submission for this quiz for the current user.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     */
    @Test
    public void getQuizSubmissionTest() {
        String courseId = null;
        String quizId = null;
        List<String> include = null;
        // api.getQuizSubmission(courseId, quizId, include);

        // TODO: test validations
    }

    /**
     * Get the quiz submission.
     *
     * Get the submission for this quiz for the current user.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getQuizSubmissionTestQueryMap() {
        String courseId = null;
        String quizId = null;
        QuizSubmissionsApi.GetQuizSubmissionQueryParams queryParams = new QuizSubmissionsApi.GetQuizSubmissionQueryParams()
            .include(null);
        // api.getQuizSubmission(courseId, quizId, queryParams);

    // TODO: test validations
    }
    /**
     * Get a single quiz submission.
     *
     * Get a single quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     */
    @Test
    public void getSingleQuizSubmissionTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        List<String> include = null;
        // api.getSingleQuizSubmission(courseId, quizId, id, include);

        // TODO: test validations
    }

    /**
     * Get a single quiz submission.
     *
     * Get a single quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSingleQuizSubmissionTestQueryMap() {
        String courseId = null;
        String quizId = null;
        String id = null;
        QuizSubmissionsApi.GetSingleQuizSubmissionQueryParams queryParams = new QuizSubmissionsApi.GetSingleQuizSubmissionQueryParams()
            .include(null);
        // api.getSingleQuizSubmission(courseId, quizId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Update student question scores and comments.
     *
     * Update the amount of points a student has scored for questions they&#x27;ve answered, provide comments for the student about their answer(s), or simply fudge the total score by a specific amount of points.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if you are not a teacher in this course * &lt;b&gt;400 Bad Request&lt;/b&gt; if the attempt parameter is missing or invalid * &lt;b&gt;400 Bad Request&lt;/b&gt; if the specified QS attempt is not yet complete
     */
    @Test
    public void updateStudentQuestionScoresAndCommentsTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        List<Integer> quizSubmissionsAttempt = null;
        List<BigDecimal> quizSubmissionsFudgePoints = null;
        List<String> quizSubmissionsQuestions = null;
        // api.updateStudentQuestionScoresAndComments(courseId, quizId, id, quizSubmissionsAttempt, quizSubmissionsFudgePoints, quizSubmissionsQuestions);

        // TODO: test validations
    }

}
