package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.QuizGroup;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizQuestionGroupsApi
 */
public class QuizQuestionGroupsApiTest {

    private QuizQuestionGroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizQuestionGroupsApi.class);
    }

    /**
     * Create a question group
     *
     * Create a new question group for this quiz  &lt;b&gt;201 Created&lt;/b&gt; response code is returned if the creation was successful.
     */
    @Test
    public void createQuestionGroupTest() {
        String courseId = null;
        String quizId = null;
        List<String> quizGroupsName = null;
        List<Integer> quizGroupsPickCount = null;
        List<Integer> quizGroupsQuestionPoints = null;
        List<Integer> quizGroupsAssessmentQuestionBankId = null;
        // api.createQuestionGroup(courseId, quizId, quizGroupsName, quizGroupsPickCount, quizGroupsQuestionPoints, quizGroupsAssessmentQuestionBankId);

        // TODO: test validations
    }

    /**
     * Delete a question group
     *
     * Delete a question group  &lt;b&gt;204 No Content&lt;b&gt; response code is returned if the deletion was successful.
     */
    @Test
    public void deleteQuestionGroupTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        // api.deleteQuestionGroup(courseId, quizId, id);

        // TODO: test validations
    }

    /**
     * Get a single quiz group
     *
     * Returns details of the quiz group with the given id.
     */
    @Test
    public void getSingleQuizGroupTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        // QuizGroup response = api.getSingleQuizGroup(courseId, quizId, id);

        // TODO: test validations
    }

    /**
     * Reorder question groups
     *
     * Change the order of the quiz questions within the group  &lt;b&gt;204 No Content&lt;b&gt; response code is returned if the reorder was successful.
     */
    @Test
    public void reorderQuestionGroupsTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        List<Integer> orderId = null;
        List<String> orderType = null;
        // api.reorderQuestionGroups(courseId, quizId, id, orderId, orderType);

        // TODO: test validations
    }

    /**
     * Update a question group
     *
     * Update a question group
     */
    @Test
    public void updateQuestionGroupTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        List<String> quizGroupsName = null;
        List<Integer> quizGroupsPickCount = null;
        List<Integer> quizGroupsQuestionPoints = null;
        // api.updateQuestionGroup(courseId, quizId, id, quizGroupsName, quizGroupsPickCount, quizGroupsQuestionPoints);

        // TODO: test validations
    }

}
