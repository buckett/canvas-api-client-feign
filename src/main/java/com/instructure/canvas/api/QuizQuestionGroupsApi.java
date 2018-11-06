package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.QuizGroup;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizQuestionGroupsApi extends ApiClient.Api {

  /**
   * Create a question group
   * Create a new question group for this quiz  &lt;b&gt;201 Created&lt;/b&gt; response code is returned if the creation was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param quizGroupsName  (optional)
   * @param quizGroupsPickCount  (optional)
   * @param quizGroupsQuestionPoints  (optional)
   * @param quizGroupsAssessmentQuestionBankId  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/groups")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void createQuestionGroup(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("quizGroupsName") List<String> quizGroupsName, @Param("quizGroupsPickCount") List<Integer> quizGroupsPickCount, @Param("quizGroupsQuestionPoints") List<Integer> quizGroupsQuestionPoints, @Param("quizGroupsAssessmentQuestionBankId") List<Integer> quizGroupsAssessmentQuestionBankId);
  
  /**
   * Delete a question group
   * Delete a question group  &lt;b&gt;204 No Content&lt;b&gt; response code is returned if the deletion was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   */
  @RequestLine("DELETE /v1/courses/{courseId}/quizzes/{quizId}/groups/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteQuestionGroup(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id);
  
  /**
   * Get a single quiz group
   * Returns details of the quiz group with the given id.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @return QuizGroup
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/{quizId}/groups/{id}")
  @Headers({
      "Accept: application/json",
  })
  QuizGroup getSingleQuizGroup(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id);
  
  /**
   * Reorder question groups
   * Change the order of the quiz questions within the group  &lt;b&gt;204 No Content&lt;b&gt; response code is returned if the reorder was successful.
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param orderId  (optional)
   * @param orderType  (optional)
   */
  @RequestLine("POST /v1/courses/{courseId}/quizzes/{quizId}/groups/{id}/reorder")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void reorderQuestionGroups(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("orderId") List<Integer> orderId, @Param("orderType") List<String> orderType);
  
  /**
   * Update a question group
   * Update a question group
   * @param courseId ID (required)
   * @param quizId ID (required)
   * @param id ID (required)
   * @param quizGroupsName  (optional)
   * @param quizGroupsPickCount  (optional)
   * @param quizGroupsQuestionPoints  (optional)
   */
  @RequestLine("PUT /v1/courses/{courseId}/quizzes/{quizId}/groups/{id}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateQuestionGroup(@Param("courseId") String courseId, @Param("quizId") String quizId, @Param("id") String id, @Param("quizGroupsName") List<String> quizGroupsName, @Param("quizGroupsPickCount") List<Integer> quizGroupsPickCount, @Param("quizGroupsQuestionPoints") List<Integer> quizGroupsQuestionPoints);
  
}
