package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Quiz;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizzesApi
 */
public class QuizzesApiTest {

    private QuizzesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizzesApi.class);
    }

    /**
     * Create a quiz
     *
     * Create a new quiz for this course.
     */
    @Test
    public void createQuizTest() {
        String courseId = null;
        String quizTitle = null;
        String quizDescription = null;
        String quizQuizType = null;
        Integer quizAssignmentGroupId = null;
        Integer quizTimeLimit = null;
        Boolean quizShuffleAnswers = null;
        String quizHideResults = null;
        Boolean quizShowCorrectAnswers = null;
        Boolean quizShowCorrectAnswersLastAttempt = null;
        String quizShowCorrectAnswersAt = null;
        String quizHideCorrectAnswersAt = null;
        Integer quizAllowedAttempts = null;
        String quizScoringPolicy = null;
        Boolean quizOneQuestionAtATime = null;
        Boolean quizCantGoBack = null;
        String quizAccessCode = null;
        String quizIpFilter = null;
        String quizDueAt = null;
        String quizLockAt = null;
        String quizUnlockAt = null;
        Boolean quizPublished = null;
        Boolean quizOneTimeResults = null;
        Boolean quizOnlyVisibleToOverrides = null;
        // Quiz response = api.createQuiz(courseId, quizTitle, quizDescription, quizQuizType, quizAssignmentGroupId, quizTimeLimit, quizShuffleAnswers, quizHideResults, quizShowCorrectAnswers, quizShowCorrectAnswersLastAttempt, quizShowCorrectAnswersAt, quizHideCorrectAnswersAt, quizAllowedAttempts, quizScoringPolicy, quizOneQuestionAtATime, quizCantGoBack, quizAccessCode, quizIpFilter, quizDueAt, quizLockAt, quizUnlockAt, quizPublished, quizOneTimeResults, quizOnlyVisibleToOverrides);

        // TODO: test validations
    }

    /**
     * Delete a quiz
     *
     * 
     */
    @Test
    public void deleteQuizTest() {
        String courseId = null;
        String id = null;
        // Quiz response = api.deleteQuiz(courseId, id);

        // TODO: test validations
    }

    /**
     * Edit a quiz
     *
     * Modify an existing quiz. See the documentation for quiz creation.  Additional arguments:
     */
    @Test
    public void editQuizTest() {
        String courseId = null;
        String id = null;
        Boolean quizNotifyOfUpdate = null;
        // Quiz response = api.editQuiz(courseId, id, quizNotifyOfUpdate);

        // TODO: test validations
    }

    /**
     * Get a single quiz
     *
     * Returns the quiz with the given id.
     */
    @Test
    public void getSingleQuizTest() {
        String courseId = null;
        String id = null;
        // Quiz response = api.getSingleQuiz(courseId, id);

        // TODO: test validations
    }

    /**
     * List quizzes in a course
     *
     * Returns the paginated list of Quizzes in this course.
     */
    @Test
    public void listQuizzesInCourseTest() {
        String courseId = null;
        String searchTerm = null;
        // List<Quiz> response = api.listQuizzesInCourse(courseId, searchTerm);

        // TODO: test validations
    }

    /**
     * List quizzes in a course
     *
     * Returns the paginated list of Quizzes in this course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listQuizzesInCourseTestQueryMap() {
        String courseId = null;
        QuizzesApi.ListQuizzesInCourseQueryParams queryParams = new QuizzesApi.ListQuizzesInCourseQueryParams()
            .searchTerm(null);
        // List<Quiz> response = api.listQuizzesInCourse(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Reorder quiz items
     *
     * Change order of the quiz questions or groups within the quiz  &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the reorder was successful.
     */
    @Test
    public void reorderQuizItemsTest() {
        String courseId = null;
        String id = null;
        List<Integer> orderId = null;
        List<String> orderType = null;
        // api.reorderQuizItems(courseId, id, orderId, orderType);

        // TODO: test validations
    }

    /**
     * Validate quiz access code
     *
     * Accepts an access code and returns a boolean indicating whether that access code is correct
     */
    @Test
    public void validateQuizAccessCodeTest() {
        String courseId = null;
        String id = null;
        String accessCode = null;
        // Boolean response = api.validateQuizAccessCode(courseId, id, accessCode);

        // TODO: test validations
    }

}
