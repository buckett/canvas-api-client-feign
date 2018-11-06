package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;


import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizSubmissionUserListApi extends ApiClient.Api {

  /**
   * Send a message to unsubmitted or submitted users for the quiz
   * {   \&quot;body\&quot;: {     \&quot;type\&quot;: \&quot;string\&quot;,     \&quot;description\&quot;: \&quot;message body of the conversation to be created\&quot;,     \&quot;example\&quot;: \&quot;Please take the quiz.\&quot;   },   \&quot;recipients\&quot;: {     \&quot;type\&quot;: \&quot;string\&quot;,     \&quot;description\&quot;: \&quot;Who to send the message to. May be either &#x27;submitted&#x27; or &#x27;unsubmitted&#x27;\&quot;,     \&quot;example\&quot;: \&quot;submitted\&quot;   },   \&quot;subject\&quot;: {     \&quot;type\&quot;: \&quot;string\&quot;,     \&quot;description\&quot;: \&quot;Subject of the new Conversation created\&quot;,     \&quot;example\&quot;: \&quot;ATTN: Quiz 101 Students\&quot;   } }
   * @param courseId ID (required)
   * @param id ID (required)
   * @param conversations  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{id}/submission_users/message")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void sendMessageToUnsubmittedOrSubmittedUsersForQuiz(@Param("courseId") String courseId, @Param("id") String id, @Param("conversations") Object conversations);
  
}
