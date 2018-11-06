package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.QuizQuestion;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizQuestionsApi
 */
public class QuizQuestionsApiTest {

    private QuizQuestionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizQuestionsApi.class);
    }

    /**
     * Create a single quiz question
     *
     * Create a new quiz question for this quiz
     */
    @Test
    public void createSingleQuizQuestionTest() {
        String courseId = null;
        String quizId = null;
        String questionQuestionName = null;
        String questionQuestionText = null;
        Integer questionQuizGroupId = null;
        String questionQuestionType = null;
        Integer questionPosition = null;
        Integer questionPointsPossible = null;
        String questionCorrectComments = null;
        String questionIncorrectComments = null;
        String questionNeutralComments = null;
        String questionTextAfterAnswers = null;
        Object questionAnswers = null;
        // QuizQuestion response = api.createSingleQuizQuestion(courseId, quizId, questionQuestionName, questionQuestionText, questionQuizGroupId, questionQuestionType, questionPosition, questionPointsPossible, questionCorrectComments, questionIncorrectComments, questionNeutralComments, questionTextAfterAnswers, questionAnswers);

        // TODO: test validations
    }

    /**
     * Delete a quiz question
     *
     * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deleteQuizQuestionTest() {
        String courseId = null;
        Integer quizId = null;
        Integer id = null;
        // api.deleteQuizQuestion(courseId, quizId, id);

        // TODO: test validations
    }

    /**
     * Get a single quiz question
     *
     * Returns the quiz question with the given id
     */
    @Test
    public void getSingleQuizQuestionTest() {
        String courseId = null;
        String quizId = null;
        Integer id = null;
        // QuizQuestion response = api.getSingleQuizQuestion(courseId, quizId, id);

        // TODO: test validations
    }

    /**
     * List questions in a quiz or a submission
     *
     * Returns the paginated list of QuizQuestions in this quiz.
     */
    @Test
    public void listQuestionsInQuizOrSubmissionTest() {
        String courseId = null;
        String quizId = null;
        Integer quizSubmissionId = null;
        Integer quizSubmissionAttempt = null;
        // List<QuizQuestion> response = api.listQuestionsInQuizOrSubmission(courseId, quizId, quizSubmissionId, quizSubmissionAttempt);

        // TODO: test validations
    }

    /**
     * List questions in a quiz or a submission
     *
     * Returns the paginated list of QuizQuestions in this quiz.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listQuestionsInQuizOrSubmissionTestQueryMap() {
        String courseId = null;
        String quizId = null;
        QuizQuestionsApi.ListQuestionsInQuizOrSubmissionQueryParams queryParams = new QuizQuestionsApi.ListQuestionsInQuizOrSubmissionQueryParams()
            .quizSubmissionId(null)
            .quizSubmissionAttempt(null);
        // List<QuizQuestion> response = api.listQuestionsInQuizOrSubmission(courseId, quizId, queryParams);

    // TODO: test validations
    }
    /**
     * Update an existing quiz question
     *
     * Updates an existing quiz question for this quiz
     */
    @Test
    public void updateExistingQuizQuestionTest() {
        String courseId = null;
        Integer quizId = null;
        Integer id = null;
        String questionQuestionName = null;
        String questionQuestionText = null;
        Integer questionQuizGroupId = null;
        String questionQuestionType = null;
        Integer questionPosition = null;
        Integer questionPointsPossible = null;
        String questionCorrectComments = null;
        String questionIncorrectComments = null;
        String questionNeutralComments = null;
        String questionTextAfterAnswers = null;
        Object questionAnswers = null;
        // QuizQuestion response = api.updateExistingQuizQuestion(courseId, quizId, id, questionQuestionName, questionQuestionText, questionQuizGroupId, questionQuestionType, questionPosition, questionPointsPossible, questionCorrectComments, questionIncorrectComments, questionNeutralComments, questionTextAfterAnswers, questionAnswers);

        // TODO: test validations
    }

}
