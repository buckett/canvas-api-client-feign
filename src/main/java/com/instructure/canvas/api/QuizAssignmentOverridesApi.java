package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.QuizAssignmentOverrideSetContainer;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface QuizAssignmentOverridesApi extends ApiClient.Api {

  /**
   * Retrieve assignment-overridden dates for quizzes
   * Retrieve the actual due-at, unlock-at, and available-at dates for quizzes based on the assignment overrides active for the current API user.
   * @param courseId ID (required)
   * @param quizAssignmentOverrides0QuizIds An array of quiz IDs. If omitted, overrides for all quizzes available to the operating user will be returned. (optional)
   * @return QuizAssignmentOverrideSetContainer
   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/assignment_overrides?quiz_assignment_overrides[0][quiz_ids]={quizAssignmentOverrides0QuizIds}")
  @Headers({
      "Accept: application/json",
  })
  QuizAssignmentOverrideSetContainer retrieveAssignmentOverriddenDatesForQuizzes(@Param("courseId") String courseId, @Param("quizAssignmentOverrides0QuizIds") List<Integer> quizAssignmentOverrides0QuizIds);
  

  /**
   * Retrieve assignment-overridden dates for quizzes
   * Retrieve the actual due-at, unlock-at, and available-at dates for quizzes based on the assignment overrides active for the current API user.
   * Note, this is equivalent to the other <code>retrieveAssignmentOverriddenDatesForQuizzes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAssignmentOverriddenDatesForQuizzesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param courseId ID (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>quizAssignmentOverrides0QuizIds - An array of quiz IDs. If omitted, overrides for all quizzes available to the operating user will be returned. (optional)</li>
   *   </ul>
   * @return QuizAssignmentOverrideSetContainer

   */
  @RequestLine("GET /v1/courses/{courseId}/quizzes/assignment_overrides?quiz_assignment_overrides[0][quiz_ids]={quizAssignmentOverrides0QuizIds}")
  @Headers({
      "Content-Type: */*",
      "Accept: application/json",
  })
  QuizAssignmentOverrideSetContainer retrieveAssignmentOverriddenDatesForQuizzes(@Param("courseId") String courseId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAssignmentOverriddenDatesForQuizzes</code> method in a fluent style.
   */
  public static class RetrieveAssignmentOverriddenDatesForQuizzesQueryParams extends HashMap<String, Object> {
    public RetrieveAssignmentOverriddenDatesForQuizzesQueryParams quizAssignmentOverrides0QuizIds(final List<Integer> value) {
      put("quiz_assignment_overrides[0][quiz_ids]", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }
}
