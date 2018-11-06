package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizSubmissionFilesApi
 */
public class QuizSubmissionFilesApiTest {

    private QuizSubmissionFilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizSubmissionFilesApi.class);
    }

    /**
     * Upload a file
     *
     * Associate a new quiz submission file  This API endpoint is the first step in uploading a quiz submission file. See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow as these parameters are interpreted as per the documentation there.
     */
    @Test
    public void uploadFileTest() {
        String courseId = null;
        String quizId = null;
        String name = null;
        String onDuplicate = null;
        // api.uploadFile(courseId, quizId, name, onDuplicate);

        // TODO: test validations
    }

}
