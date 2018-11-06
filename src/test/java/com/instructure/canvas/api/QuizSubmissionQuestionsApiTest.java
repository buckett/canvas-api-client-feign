package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.QuizSubmissionQuestion;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizSubmissionQuestionsApi
 */
public class QuizSubmissionQuestionsApiTest {

    private QuizSubmissionQuestionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizSubmissionQuestionsApi.class);
    }

    /**
     * Answering questions
     *
     * Provide or update an answer to one or more QuizQuestions.
     */
    @Test
    public void answeringQuestionsTest() {
        String quizSubmissionId = null;
        Integer attempt = null;
        String validationToken = null;
        String accessCode = null;
        List<String> quizQuestions = null;
        // List<QuizSubmissionQuestion> response = api.answeringQuestions(quizSubmissionId, attempt, validationToken, accessCode, quizQuestions);

        // TODO: test validations
    }

    /**
     * Flagging a question.
     *
     * Set a flag on a quiz question to indicate that you want to return to it later.
     */
    @Test
    public void flaggingQuestionTest() {
        String quizSubmissionId = null;
        String id = null;
        Integer attempt = null;
        String validationToken = null;
        String accessCode = null;
        // api.flaggingQuestion(quizSubmissionId, id, attempt, validationToken, accessCode);

        // TODO: test validations
    }

    /**
     * Get all quiz submission questions.
     *
     * Get a list of all the question records for this quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     */
    @Test
    public void getAllQuizSubmissionQuestionsTest() {
        String quizSubmissionId = null;
        List<String> include = null;
        // api.getAllQuizSubmissionQuestions(quizSubmissionId, include);

        // TODO: test validations
    }

    /**
     * Get all quiz submission questions.
     *
     * Get a list of all the question records for this quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getAllQuizSubmissionQuestionsTestQueryMap() {
        String quizSubmissionId = null;
        QuizSubmissionQuestionsApi.GetAllQuizSubmissionQuestionsQueryParams queryParams = new QuizSubmissionQuestionsApi.GetAllQuizSubmissionQuestionsQueryParams()
            .include(null);
        // api.getAllQuizSubmissionQuestions(quizSubmissionId, queryParams);

    // TODO: test validations
    }
    /**
     * Unflagging a question.
     *
     * Remove the flag that you previously set on a quiz question after you&#x27;ve returned to it.
     */
    @Test
    public void unflaggingQuestionTest() {
        String quizSubmissionId = null;
        String id = null;
        Integer attempt = null;
        String validationToken = null;
        String accessCode = null;
        // api.unflaggingQuestion(quizSubmissionId, id, attempt, validationToken, accessCode);

        // TODO: test validations
    }

}
