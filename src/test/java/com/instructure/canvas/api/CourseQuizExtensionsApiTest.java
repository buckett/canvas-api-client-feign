package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CourseQuizExtensionsApi
 */
public class CourseQuizExtensionsApiTest {

    private CourseQuizExtensionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CourseQuizExtensionsApi.class);
    }

    /**
     * Set extensions for student quiz submissions
     *
     * &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if you are not allowed to extend quizzes for this course
     */
    @Test
    public void setExtensionsForStudentQuizSubmissionsTest() {
        String courseId = null;
        Integer userId = null;
        Integer extraAttempts = null;
        Integer extraTime = null;
        Boolean manuallyUnlocked = null;
        Integer extendFromNow = null;
        Integer extendFromEndAt = null;
        // api.setExtensionsForStudentQuizSubmissions(courseId, userId, extraAttempts, extraTime, manuallyUnlocked, extendFromNow, extendFromEndAt);

        // TODO: test validations
    }

}
