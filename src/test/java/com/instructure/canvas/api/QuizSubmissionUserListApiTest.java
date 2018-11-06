package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizSubmissionUserListApi
 */
public class QuizSubmissionUserListApiTest {

    private QuizSubmissionUserListApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizSubmissionUserListApi.class);
    }

    /**
     * Send a message to unsubmitted or submitted users for the quiz
     *
     * {   \&quot;body\&quot;: {     \&quot;type\&quot;: \&quot;string\&quot;,     \&quot;description\&quot;: \&quot;message body of the conversation to be created\&quot;,     \&quot;example\&quot;: \&quot;Please take the quiz.\&quot;   },   \&quot;recipients\&quot;: {     \&quot;type\&quot;: \&quot;string\&quot;,     \&quot;description\&quot;: \&quot;Who to send the message to. May be either &#x27;submitted&#x27; or &#x27;unsubmitted&#x27;\&quot;,     \&quot;example\&quot;: \&quot;submitted\&quot;   },   \&quot;subject\&quot;: {     \&quot;type\&quot;: \&quot;string\&quot;,     \&quot;description\&quot;: \&quot;Subject of the new Conversation created\&quot;,     \&quot;example\&quot;: \&quot;ATTN: Quiz 101 Students\&quot;   } }
     */
    @Test
    public void sendMessageToUnsubmittedOrSubmittedUsersForQuizTest() {
        String courseId = null;
        String id = null;
        Object conversations = null;
        // api.sendMessageToUnsubmittedOrSubmittedUsersForQuiz(courseId, id, conversations);

        // TODO: test validations
    }

}
