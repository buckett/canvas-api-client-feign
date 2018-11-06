package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.QuizSubmissionQuestion;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizSubmissionQuestionsApi extends ApiClient.Api {

  /**
   * Answering questions
   * Provide or update an answer to one or more QuizQuestions.
   * @param quizSubmissionId ID (required)
   * @param attempt  (optional)
   * @param validationToken  (optional)
   * @param accessCode  (optional)
   * @param quizQuestions  (optional)
   * @return List&lt;QuizSubmissionQuestion&gt;
   */
  @RequestLine("POST /v1/quiz_submissions/{quizSubmissionId}/questions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<QuizSubmissionQuestion> answeringQuestions(@Param("quizSubmissionId") String quizSubmissionId, @Param("attempt") Integer attempt, @Param("validationToken") String validationToken, @Param("accessCode") String accessCode, @Param("quizQuestions") List<String> quizQuestions);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;QuizSubmissionQuestion&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  List<QuizSubmissionQuestion> answeringQuestions(URI uri);
  
  /**
   * Flagging a question.
   * Set a flag on a quiz question to indicate that you want to return to it later.
   * @param quizSubmissionId ID (required)
   * @param id ID (required)
   * @param attempt  (optional)
   * @param validationToken  (optional)
   * @param accessCode  (optional)
   */
  @RequestLine("PUT /v1/quiz_submissions/{quizSubmissionId}/questions/{id}/flag")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void flaggingQuestion(@Param("quizSubmissionId") String quizSubmissionId, @Param("id") String id, @Param("attempt") Integer attempt, @Param("validationToken") String validationToken, @Param("accessCode") String accessCode);
  
  /**
   * Get all quiz submission questions.
   * Get a list of all the question records for this quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * @param quizSubmissionId ID (required)
   * @param include Associations to include with the quiz submission question. (optional)
   */
  @RequestLine("GET /v1/quiz_submissions/{quizSubmissionId}/questions?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getAllQuizSubmissionQuestions(@Param("quizSubmissionId") String quizSubmissionId, @Param("include") List<String> include);
  

  /**
   * Get all quiz submission questions.
   * Get a list of all the question records for this quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * Note, this is equivalent to the other <code>getAllQuizSubmissionQuestions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllQuizSubmissionQuestionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param quizSubmissionId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the quiz submission question. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/quiz_submissions/{quizSubmissionId}/questions?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getAllQuizSubmissionQuestions(@Param("quizSubmissionId") String quizSubmissionId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllQuizSubmissionQuestions</code> method in a fluent style.
   */
  public static class GetAllQuizSubmissionQuestionsQueryParams extends HashMap<String, Object> {
    public GetAllQuizSubmissionQuestionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Unflagging a question.
   * Remove the flag that you previously set on a quiz question after you&#x27;ve returned to it.
   * @param quizSubmissionId ID (required)
   * @param id ID (required)
   * @param attempt  (optional)
   * @param validationToken  (optional)
   * @param accessCode  (optional)
   */
  @RequestLine("PUT /v1/quiz_submissions/{quizSubmissionId}/questions/{id}/unflag")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void unflaggingQuestion(@Param("quizSubmissionId") String quizSubmissionId, @Param("id") String id, @Param("attempt") Integer attempt, @Param("validationToken") String validationToken, @Param("accessCode") String accessCode);
  
}
