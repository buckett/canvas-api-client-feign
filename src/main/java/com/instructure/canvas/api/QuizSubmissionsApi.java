package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import java.math.BigDecimal;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizSubmissionsApi extends ApiClient.Api {

  /**
   * Complete the quiz submission (turn it in).
   * Complete the quiz submission by marking it as complete and grading it. When the quiz submission has been marked as complete, no further modifications will be allowed.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if an invalid access code is specified * &lt;b&gt;403 Forbidden&lt;/b&gt; if the Quiz&#x27;s IP filter restriction does not pass * &lt;b&gt;403 Forbidden&lt;/b&gt; if an invalid token is specified * &lt;b&gt;400 Bad Request&lt;/b&gt; if the QS is already complete * &lt;b&gt;400 Bad Request&lt;/b&gt; if the attempt parameter is missing * &lt;b&gt;400 Bad Request&lt;/b&gt; if the attempt parameter is not the latest attempt
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param attempt  (optional)
   * @param validationToken  (optional)
   * @param accessCode  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}/complete")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void completeQuizSubmissionTurnItIn(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("attempt") Integer attempt, @Param("validationToken") String validationToken, @Param("accessCode") String accessCode);
  
  /**
   * Create the quiz submission (start a quiz-taking session)
   * Start taking a Quiz by creating a QuizSubmission which you can use to answer questions and submit your answers.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;400 Bad Request&lt;/b&gt; if the quiz is locked * &lt;b&gt;403 Forbidden&lt;/b&gt; if an invalid access code is specified * &lt;b&gt;403 Forbidden&lt;/b&gt; if the Quiz&#x27;s IP filter restriction does not pass * &lt;b&gt;409 Conflict&lt;/b&gt; if a QuizSubmission already exists for this user and quiz
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param accessCode  (optional)
   * @param preview  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/submissions")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createQuizSubmissionStartQuizTakingSession(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("accessCode") String accessCode, @Param("preview") Boolean preview);
  
  /**
   * Get all quiz submissions.
   * Get a list of all submissions for this quiz. Users who can view or manage grades for a course will have submissions from multiple users returned. A user who can only submit will have only their own submissions returned. When a user has an in-progress submission, only that submission is returned. When there isn&#x27;t an in-progress quiz_submission, all completed submissions, including previous attempts, are returned.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param include Associations to include with the quiz submission. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getAllQuizSubmissions(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("include") List<String> include);
  

  /**
   * Get all quiz submissions.
   * Get a list of all submissions for this quiz. Users who can view or manage grades for a course will have submissions from multiple users returned. A user who can only submit will have only their own submissions returned. When a user has an in-progress submission, only that submission is returned. When there isn&#x27;t an in-progress quiz_submission, all completed submissions, including previous attempts, are returned.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * Note, this is equivalent to the other <code>getAllQuizSubmissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllQuizSubmissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the quiz submission. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getAllQuizSubmissions(@Param("courseId") String courseId, @Param("quizId") String quizId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getAllQuizSubmissions</code> method in a fluent style.
   */
  public static class GetAllQuizSubmissionsQueryParams extends HashMap<String, Object> {
    public GetAllQuizSubmissionsQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get current quiz submission times.
   * Get the current timing data for the quiz attempt, both the end_at timestamp and the time_left parameter.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}/time")
  @Headers({
      "Accept: */*",
  })
  void getCurrentQuizSubmissionTimes(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id);
  
  /**
   * Get the quiz submission.
   * Get the submission for this quiz for the current user.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param include Associations to include with the quiz submission. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submission?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getQuizSubmission(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("include") List<String> include);
  

  /**
   * Get the quiz submission.
   * Get the submission for this quiz for the current user.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * Note, this is equivalent to the other <code>getQuizSubmission</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQuizSubmissionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the quiz submission. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submission?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getQuizSubmission(@Param("courseId") String courseId, @Param("quizId") String quizId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getQuizSubmission</code> method in a fluent style.
   */
  public static class GetQuizSubmissionQueryParams extends HashMap<String, Object> {
    public GetQuizSubmissionQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Get a single quiz submission.
   * Get a single quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param include Associations to include with the quiz submission. (optional)
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}?include={include}")
  @Headers({
      "Accept: */*",
  })
  void getSingleQuizSubmission(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("include") List<String> include);
  

  /**
   * Get a single quiz submission.
   * Get a single quiz submission.  &lt;b&gt;200 OK&lt;/b&gt; response code is returned if the request was successful.
   * Note, this is equivalent to the other <code>getSingleQuizSubmission</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetSingleQuizSubmissionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>include - Associations to include with the quiz submission. (optional)</li>
   *   </ul>

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}?include={include}")
  @Headers({
      "Content-Type: */*",
  })
  void getSingleQuizSubmission(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getSingleQuizSubmission</code> method in a fluent style.
   */
  public static class GetSingleQuizSubmissionQueryParams extends HashMap<String, Object> {
    public GetSingleQuizSubmissionQueryParams include(final List<String> value) {
      put("include", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
  /**
   * Update student question scores and comments.
   * Update the amount of points a student has scored for questions they&#x27;ve answered, provide comments for the student about their answer(s), or simply fudge the total score by a specific amount of points.  &lt;b&gt;Responses&lt;/b&gt;  * &lt;b&gt;200 OK&lt;/b&gt; if the request was successful * &lt;b&gt;403 Forbidden&lt;/b&gt; if you are not a teacher in this course * &lt;b&gt;400 Bad Request&lt;/b&gt; if the attempt parameter is missing or invalid * &lt;b&gt;400 Bad Request&lt;/b&gt; if the specified QS attempt is not yet complete
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param quizSubmissionsAttempt  (optional)
   * @param quizSubmissionsFudgePoints  (optional)
   * @param quizSubmissionsQuestions  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/quizzes/{quizId}/submissions/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateStudentQuestionScoresAndComments(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("quizSubmissionsAttempt") List<Integer> quizSubmissionsAttempt, @Param("quizSubmissionsFudgePoints") List<BigDecimal> quizSubmissionsFudgePoints, @Param("quizSubmissionsQuestions") List<String> quizSubmissionsQuestions);
  
}
