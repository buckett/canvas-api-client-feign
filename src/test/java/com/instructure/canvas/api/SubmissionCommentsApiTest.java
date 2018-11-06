package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubmissionCommentsApi
 */
public class SubmissionCommentsApiTest {

    private SubmissionCommentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SubmissionCommentsApi.class);
    }

    /**
     * Upload a file
     *
     * Upload a file to attach to a submission comment  See the {file:file_uploads.html File Upload Documentation} for details on the file upload workflow.  The final step of the file upload workflow will return the attachment data, including the new file id. The caller can then PUT the file_id to the submission API to attach it to a comment
     */
    @Test
    public void uploadFileTest() {
        String courseId = null;
        String assignmentId = null;
        String userId = null;
        // api.uploadFile(courseId, assignmentId, userId);

        // TODO: test validations
    }

}
