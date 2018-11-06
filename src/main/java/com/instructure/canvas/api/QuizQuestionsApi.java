package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.QuizQuestion;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizQuestionsApi extends ApiClient.Api {

  /**
   * Create a single quiz question
   * Create a new quiz question for this quiz
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param questionQuestionName  (optional)
   * @param questionQuestionText  (optional)
   * @param questionQuizGroupId  (optional)
   * @param questionQuestionType  (optional)
   * @param questionPosition  (optional)
   * @param questionPointsPossible  (optional)
   * @param questionCorrectComments  (optional)
   * @param questionIncorrectComments  (optional)
   * @param questionNeutralComments  (optional)
   * @param questionTextAfterAnswers  (optional)
   * @param questionAnswers  (optional)
   * @return QuizQuestion
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/questions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  QuizQuestion createSingleQuizQuestion(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("questionQuestionName") String questionQuestionName, @Param("questionQuestionText") String questionQuestionText, @Param("questionQuizGroupId") Integer questionQuizGroupId, @Param("questionQuestionType") String questionQuestionType, @Param("questionPosition") Integer questionPosition, @Param("questionPointsPossible") Integer questionPointsPossible, @Param("questionCorrectComments") String questionCorrectComments, @Param("questionIncorrectComments") String questionIncorrectComments, @Param("questionNeutralComments") String questionNeutralComments, @Param("questionTextAfterAnswers") String questionTextAfterAnswers, @Param("questionAnswers") Object questionAnswers);
  
  /**
   * Delete a quiz question
   * &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the deletion was successful.
   * @param courseId ID (required)
   * @param quizId The associated quiz&#x27;s unique identifier (required)
   * @param id The quiz question&#x27;s unique identifier (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/quizzes/{quizId}/questions/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteQuizQuestion(@Param("courseId") String courseId, @Param("quizId") Integer quizId, @Param("id") Integer id);
  
  /**
   * Get a single quiz question
   * Returns the quiz question with the given id
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id The quiz question unique identifier. (required)
   * @return QuizQuestion
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/questions/{id}")
  @Headers({
      "Accept: application/json",
  })
  QuizQuestion getSingleQuizQuestion(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") Integer id);
  
  /**
   * List questions in a quiz or a submission
   * Returns the paginated list of QuizQuestions in this quiz.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param quizSubmissionId If specified, the endpoint will return the questions that were presented for that submission. This is useful if the quiz has been modified after the submission was created and the latest quiz version&#x27;s set of questions does not match the submission&#x27;s. NOTE: you must specify quiz_submission_attempt as well if you specify this parameter. (optional)
   * @param quizSubmissionAttempt The attempt of the submission you want the questions for. (optional)
   * @return List&lt;QuizQuestion&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/questions?quiz_submission_id={quizSubmissionId}&quiz_submission_attempt={quizSubmissionAttempt}")
  @Headers({
      "Accept: application/json",
  })
  List<QuizQuestion> listQuestionsInQuizOrSubmission(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("quizSubmissionId") Integer quizSubmissionId, @Param("quizSubmissionAttempt") Integer quizSubmissionAttempt);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;QuizQuestion&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<QuizQuestion> listQuestionsInQuizOrSubmission(URI uri);
  

  /**
   * List questions in a quiz or a submission
   * Returns the paginated list of QuizQuestions in this quiz.
   * Note, this is equivalent to the other <code>listQuestionsInQuizOrSubmission</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListQuestionsInQuizOrSubmissionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>quizSubmissionId - If specified, the endpoint will return the questions that were presented for that submission. This is useful if the quiz has been modified after the submission was created and the latest quiz version&#x27;s set of questions does not match the submission&#x27;s. NOTE: you must specify quiz_submission_attempt as well if you specify this parameter. (optional)</li>
   *   <li>quizSubmissionAttempt - The attempt of the submission you want the questions for. (optional)</li>
   *   </ul>
   * @return List&lt;QuizQuestion&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/questions?quiz_submission_id={quizSubmissionId}&quiz_submission_attempt={quizSubmissionAttempt}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<QuizQuestion> listQuestionsInQuizOrSubmission(@Param("courseId") String courseId, @Param("quizId") String quizId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listQuestionsInQuizOrSubmission</code> method in a fluent style.
   */
  public static class ListQuestionsInQuizOrSubmissionQueryParams extends HashMap<String, Object> {
    public ListQuestionsInQuizOrSubmissionQueryParams quizSubmissionId(final Integer value) {
      put("quiz_submission_id", EncodingUtils.encode(value));
      return this;
    }
    public ListQuestionsInQuizOrSubmissionQueryParams quizSubmissionAttempt(final Integer value) {
      put("quiz_submission_attempt", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Update an existing quiz question
   * Updates an existing quiz question for this quiz
   * @param courseId ID (required)
   * @param quizId The associated quiz&#x27;s unique identifier. (required)
   * @param id The quiz question&#x27;s unique identifier. (required)
   * @param questionQuestionName  (optional)
   * @param questionQuestionText  (optional)
   * @param questionQuizGroupId  (optional)
   * @param questionQuestionType  (optional)
   * @param questionPosition  (optional)
   * @param questionPointsPossible  (optional)
   * @param questionCorrectComments  (optional)
   * @param questionIncorrectComments  (optional)
   * @param questionNeutralComments  (optional)
   * @param questionTextAfterAnswers  (optional)
   * @param questionAnswers  (optional)
   * @return QuizQuestion
   */
  @RequestLine("PUT /v1/courses/{courseId}/quizzes/{quizId}/questions/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  QuizQuestion updateExistingQuizQuestion(@Param("courseId") String courseId, @Param("quizId") Integer quizId, @Param("id") Integer id, @Param("questionQuestionName") String questionQuestionName, @Param("questionQuestionText") String questionQuestionText, @Param("questionQuizGroupId") Integer questionQuizGroupId, @Param("questionQuestionType") String questionQuestionType, @Param("questionPosition") Integer questionPosition, @Param("questionPointsPossible") Integer questionPointsPossible, @Param("questionCorrectComments") String questionCorrectComments, @Param("questionIncorrectComments") String questionIncorrectComments, @Param("questionNeutralComments") String questionNeutralComments, @Param("questionTextAfterAnswers") String questionTextAfterAnswers, @Param("questionAnswers") Object questionAnswers);
  
}
