package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Quiz;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizzesApi extends ApiClient.Api {

  /**
   * Create a quiz
   * Create a new quiz for this course.
   * @param courseId ID (required)
   * @param quizTitle  (optional)
   * @param quizDescription  (optional)
   * @param quizQuizType  (optional)
   * @param quizAssignmentGroupId  (optional)
   * @param quizTimeLimit  (optional)
   * @param quizShuffleAnswers  (optional)
   * @param quizHideResults  (optional)
   * @param quizShowCorrectAnswers  (optional)
   * @param quizShowCorrectAnswersLastAttempt  (optional)
   * @param quizShowCorrectAnswersAt  (optional)
   * @param quizHideCorrectAnswersAt  (optional)
   * @param quizAllowedAttempts  (optional)
   * @param quizScoringPolicy  (optional)
   * @param quizOneQuestionAtATime  (optional)
   * @param quizCantGoBack  (optional)
   * @param quizAccessCode  (optional)
   * @param quizIpFilter  (optional)
   * @param quizDueAt  (optional)
   * @param quizLockAt  (optional)
   * @param quizUnlockAt  (optional)
   * @param quizPublished  (optional)
   * @param quizOneTimeResults  (optional)
   * @param quizOnlyVisibleToOverrides  (optional)
   * @return Quiz
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Quiz createQuiz(@Param("courseId") String courseId, @Param("quizTitle") String quizTitle, @Param("quizDescription") String quizDescription, @Param("quizQuizType") String quizQuizType, @Param("quizAssignmentGroupId") Integer quizAssignmentGroupId, @Param("quizTimeLimit") Integer quizTimeLimit, @Param("quizShuffleAnswers") Boolean quizShuffleAnswers, @Param("quizHideResults") String quizHideResults, @Param("quizShowCorrectAnswers") Boolean quizShowCorrectAnswers, @Param("quizShowCorrectAnswersLastAttempt") Boolean quizShowCorrectAnswersLastAttempt, @Param("quizShowCorrectAnswersAt") String quizShowCorrectAnswersAt, @Param("quizHideCorrectAnswersAt") String quizHideCorrectAnswersAt, @Param("quizAllowedAttempts") Integer quizAllowedAttempts, @Param("quizScoringPolicy") String quizScoringPolicy, @Param("quizOneQuestionAtATime") Boolean quizOneQuestionAtATime, @Param("quizCantGoBack") Boolean quizCantGoBack, @Param("quizAccessCode") String quizAccessCode, @Param("quizIpFilter") String quizIpFilter, @Param("quizDueAt") String quizDueAt, @Param("quizLockAt") String quizLockAt, @Param("quizUnlockAt") String quizUnlockAt, @Param("quizPublished") Boolean quizPublished, @Param("quizOneTimeResults") Boolean quizOneTimeResults, @Param("quizOnlyVisibleToOverrides") Boolean quizOnlyVisibleToOverrides);
  
  /**
   * Delete a quiz
   * 
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Quiz
   */
  @RequestLine("DELETE /v1/courses/{courseId}/quizzes/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Quiz deleteQuiz(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * Edit a quiz
   * Modify an existing quiz. See the documentation for quiz creation.  Additional arguments:
   * @param courseId ID (required)
   * @param id ID (required)
   * @param quizNotifyOfUpdate  (optional)
   * @return Quiz
   */
  @RequestLine("PUT /v1/courses/{courseId}/quizzes/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Quiz editQuiz(@Param("courseId") String courseId, @Param("id") String id, @Param("quizNotifyOfUpdate") Boolean quizNotifyOfUpdate);
  
  /**
   * Get a single quiz
   * Returns the quiz with the given id.
   * @param courseId ID (required)
   * @param id ID (required)
   * @return Quiz
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{id}")
  @Headers({
      "Accept: application/json",
  })
  Quiz getSingleQuiz(@Param("courseId") String courseId, @Param("id") String id);
  
  /**
   * List quizzes in a course
   * Returns the paginated list of Quizzes in this course.
   * @param courseId ID (required)
   * @param searchTerm The partial title of the quizzes to match and return. (optional)
   * @return List&lt;Quiz&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes?search_term={searchTerm}")
  @Headers({
      "Accept: application/json",
  })
  List<Quiz> listQuizzesInCourse(@Param("courseId") String courseId, @Param("searchTerm") String searchTerm);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Quiz&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Quiz> listQuizzesInCourse(URI uri);
  

  /**
   * List quizzes in a course
   * Returns the paginated list of Quizzes in this course.
   * Note, this is equivalent to the other <code>listQuizzesInCourse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListQuizzesInCourseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>searchTerm - The partial title of the quizzes to match and return. (optional)</li>
   *   </ul>
   * @return List&lt;Quiz&gt;

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes?search_term={searchTerm}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  List<Quiz> listQuizzesInCourse(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listQuizzesInCourse</code> method in a fluent style.
   */
  public static class ListQuizzesInCourseQueryParams extends HashMap<String, Object> {
    public ListQuizzesInCourseQueryParams searchTerm(final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
  }
  /**
   * Reorder quiz items
   * Change order of the quiz questions or groups within the quiz  &lt;b&gt;204 No Content&lt;/b&gt; response code is returned if the reorder was successful.
   * @param courseId ID (required)
   * @param id ID (required)
   * @param orderId  (optional)
   * @param orderType  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{id}/reorder")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reorderQuizItems(@Param("courseId") String courseId, @Param("id") String id, @Param("orderId") List<Integer> orderId, @Param("orderType") List<String> orderType);
  
  /**
   * Validate quiz access code
   * Accepts an access code and returns a boolean indicating whether that access code is correct
   * @param courseId ID (required)
   * @param id ID (required)
   * @param accessCode  (optional)
   * @return Boolean
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{id}/validate_access_code")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  Boolean validateQuizAccessCode(@Param("courseId") String courseId, @Param("id") String id, @Param("accessCode") String accessCode);
  
}
