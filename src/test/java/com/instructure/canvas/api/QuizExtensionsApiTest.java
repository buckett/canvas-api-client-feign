package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizExtensionsApi
 */
public class QuizExtensionsApiTest {

    private QuizExtensionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizExtensionsApi.class);
    }

    /**
     * Set extensions for student quiz submissions
     *
     * &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if you are not allowed to extend quizzes for this course
     */
    @Test
    public void setExtensionsForStudentQuizSubmissionsTest() {
        String courseId = null;
        String quizId = null;
        List<Integer> quizExtensionsUserId = null;
        List<Integer> quizExtensionsExtraAttempts = null;
        List<Integer> quizExtensionsExtraTime = null;
        List<Boolean> quizExtensionsManuallyUnlocked = null;
        List<Integer> quizExtensionsExtendFromNow = null;
        List<Integer> quizExtensionsExtendFromEndAt = null;
        // api.setExtensionsForStudentQuizSubmissions(courseId, quizId, quizExtensionsUserId, quizExtensionsExtraAttempts, quizExtensionsExtraTime, quizExtensionsManuallyUnlocked, quizExtensionsExtendFromNow, quizExtensionsExtendFromEndAt);

        // TODO: test validations
    }

}
