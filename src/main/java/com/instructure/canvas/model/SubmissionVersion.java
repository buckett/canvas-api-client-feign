/*
 * canvas.instructure.com
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.instructure.canvas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * A SubmissionVersion object contains all the fields that a Submission object does, plus additional fields prefixed with current_* new_* and previous_* described below.
 */
@Schema(description = "A SubmissionVersion object contains all the fields that a Submission object does, plus additional fields prefixed with current_* new_* and previous_* described below.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class SubmissionVersion {

  @JsonProperty("assignment_id")

  private Integer assignmentId = null;

  @JsonProperty("assignment_name")

  private String assignmentName = null;

  @JsonProperty("body")

  private String body = null;

  @JsonProperty("current_grade")

  private String currentGrade = null;

  @JsonProperty("current_graded_at")

  private OffsetDateTime currentGradedAt = null;

  @JsonProperty("current_grader")

  private String currentGrader = null;

  @JsonProperty("grade_matches_current_submission")

  private Boolean gradeMatchesCurrentSubmission = null;

  @JsonProperty("graded_at")

  private OffsetDateTime gradedAt = null;

  @JsonProperty("grader")

  private String grader = null;

  @JsonProperty("grader_id")

  private Integer graderId = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("new_grade")

  private String newGrade = null;

  @JsonProperty("new_graded_at")

  private OffsetDateTime newGradedAt = null;

  @JsonProperty("new_grader")

  private String newGrader = null;

  @JsonProperty("previous_grade")

  private String previousGrade = null;

  @JsonProperty("previous_graded_at")

  private OffsetDateTime previousGradedAt = null;

  @JsonProperty("previous_grader")

  private String previousGrader = null;

  @JsonProperty("score")

  private Integer score = null;

  @JsonProperty("submission_type")

  private String submissionType = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("user_id")

  private Integer userId = null;

  @JsonProperty("user_name")

  private String userName = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public SubmissionVersion assignmentId(Integer assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

  

  /**
  * the id of the assignment this submissions is for
  * @return assignmentId
  **/
  @Schema(example = "22604", description = "the id of the assignment this submissions is for")
  public Integer getAssignmentId() {
    return assignmentId;
  }
  public void setAssignmentId(Integer assignmentId) {
    this.assignmentId = assignmentId;
  }
  public SubmissionVersion assignmentName(String assignmentName) {
    this.assignmentName = assignmentName;
    return this;
  }

  

  /**
  * the name of the assignment this submission is for
  * @return assignmentName
  **/
  @Schema(example = "some assignment", description = "the name of the assignment this submission is for")
  public String getAssignmentName() {
    return assignmentName;
  }
  public void setAssignmentName(String assignmentName) {
    this.assignmentName = assignmentName;
  }
  public SubmissionVersion body(String body) {
    this.body = body;
    return this;
  }

  

  /**
  * the body text of the submission
  * @return body
  **/
  @Schema(example = "text from the submission", description = "the body text of the submission")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }
  public SubmissionVersion currentGrade(String currentGrade) {
    this.currentGrade = currentGrade;
    return this;
  }

  

  /**
  * the most up to date grade for the current version of this submission
  * @return currentGrade
  **/
  @Schema(example = "100", description = "the most up to date grade for the current version of this submission")
  public String getCurrentGrade() {
    return currentGrade;
  }
  public void setCurrentGrade(String currentGrade) {
    this.currentGrade = currentGrade;
  }
  public SubmissionVersion currentGradedAt(OffsetDateTime currentGradedAt) {
    this.currentGradedAt = currentGradedAt;
    return this;
  }

  

  /**
  * the latest time stamp for the grading of this submission
  * @return currentGradedAt
  **/
  @Schema(description = "the latest time stamp for the grading of this submission")
  public OffsetDateTime getCurrentGradedAt() {
    return currentGradedAt;
  }
  public void setCurrentGradedAt(OffsetDateTime currentGradedAt) {
    this.currentGradedAt = currentGradedAt;
  }
  public SubmissionVersion currentGrader(String currentGrader) {
    this.currentGrader = currentGrader;
    return this;
  }

  

  /**
  * the name of the most recent grader for this submission
  * @return currentGrader
  **/
  @Schema(example = "Grader Name", description = "the name of the most recent grader for this submission")
  public String getCurrentGrader() {
    return currentGrader;
  }
  public void setCurrentGrader(String currentGrader) {
    this.currentGrader = currentGrader;
  }
  public SubmissionVersion gradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
    return this;
  }

  

  /**
  * boolean indicating whether the grade is equal to the current submission grade
  * @return gradeMatchesCurrentSubmission
  **/
  @Schema(example = "true", description = "boolean indicating whether the grade is equal to the current submission grade")
  public Boolean isGradeMatchesCurrentSubmission() {
    return gradeMatchesCurrentSubmission;
  }
  public void setGradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
  }
  public SubmissionVersion gradedAt(OffsetDateTime gradedAt) {
    this.gradedAt = gradedAt;
    return this;
  }

  

  /**
  * time stamp for the grading of this version of the submission
  * @return gradedAt
  **/
  @Schema(description = "time stamp for the grading of this version of the submission")
  public OffsetDateTime getGradedAt() {
    return gradedAt;
  }
  public void setGradedAt(OffsetDateTime gradedAt) {
    this.gradedAt = gradedAt;
  }
  public SubmissionVersion grader(String grader) {
    this.grader = grader;
    return this;
  }

  

  /**
  * the name of the user who graded this version of the submission
  * @return grader
  **/
  @Schema(example = "Grader Name", description = "the name of the user who graded this version of the submission")
  public String getGrader() {
    return grader;
  }
  public void setGrader(String grader) {
    this.grader = grader;
  }
  public SubmissionVersion graderId(Integer graderId) {
    this.graderId = graderId;
    return this;
  }

  

  /**
  * the user id of the user who graded this version of the submission
  * @return graderId
  **/
  @Schema(example = "67379", description = "the user id of the user who graded this version of the submission")
  public Integer getGraderId() {
    return graderId;
  }
  public void setGraderId(Integer graderId) {
    this.graderId = graderId;
  }
  public SubmissionVersion id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the id of the submission of which this is a version
  * @return id
  **/
  @Schema(example = "11607", description = "the id of the submission of which this is a version")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public SubmissionVersion newGrade(String newGrade) {
    this.newGrade = newGrade;
    return this;
  }

  

  /**
  * the updated grade provided in this version of the submission
  * @return newGrade
  **/
  @Schema(example = "100", description = "the updated grade provided in this version of the submission")
  public String getNewGrade() {
    return newGrade;
  }
  public void setNewGrade(String newGrade) {
    this.newGrade = newGrade;
  }
  public SubmissionVersion newGradedAt(OffsetDateTime newGradedAt) {
    this.newGradedAt = newGradedAt;
    return this;
  }

  

  /**
  * the timestamp for the grading of this version of the submission (alias for graded_at)
  * @return newGradedAt
  **/
  @Schema(description = "the timestamp for the grading of this version of the submission (alias for graded_at)")
  public OffsetDateTime getNewGradedAt() {
    return newGradedAt;
  }
  public void setNewGradedAt(OffsetDateTime newGradedAt) {
    this.newGradedAt = newGradedAt;
  }
  public SubmissionVersion newGrader(String newGrader) {
    this.newGrader = newGrader;
    return this;
  }

  

  /**
  * alias for &#x27;grader&#x27;
  * @return newGrader
  **/
  @Schema(example = "Grader Name", description = "alias for 'grader'")
  public String getNewGrader() {
    return newGrader;
  }
  public void setNewGrader(String newGrader) {
    this.newGrader = newGrader;
  }
  public SubmissionVersion previousGrade(String previousGrade) {
    this.previousGrade = previousGrade;
    return this;
  }

  

  /**
  * the grade for the submission version immediately preceding this one
  * @return previousGrade
  **/
  @Schema(example = "90", description = "the grade for the submission version immediately preceding this one")
  public String getPreviousGrade() {
    return previousGrade;
  }
  public void setPreviousGrade(String previousGrade) {
    this.previousGrade = previousGrade;
  }
  public SubmissionVersion previousGradedAt(OffsetDateTime previousGradedAt) {
    this.previousGradedAt = previousGradedAt;
    return this;
  }

  

  /**
  * the timestamp for the grading of the submission version immediately preceding this one
  * @return previousGradedAt
  **/
  @Schema(description = "the timestamp for the grading of the submission version immediately preceding this one")
  public OffsetDateTime getPreviousGradedAt() {
    return previousGradedAt;
  }
  public void setPreviousGradedAt(OffsetDateTime previousGradedAt) {
    this.previousGradedAt = previousGradedAt;
  }
  public SubmissionVersion previousGrader(String previousGrader) {
    this.previousGrader = previousGrader;
    return this;
  }

  

  /**
  * the name of the grader who graded the version of this submission immediately preceding this one
  * @return previousGrader
  **/
  @Schema(example = "Graded on submission", description = "the name of the grader who graded the version of this submission immediately preceding this one")
  public String getPreviousGrader() {
    return previousGrader;
  }
  public void setPreviousGrader(String previousGrader) {
    this.previousGrader = previousGrader;
  }
  public SubmissionVersion score(Integer score) {
    this.score = score;
    return this;
  }

  

  /**
  * the score for this version of the submission
  * @return score
  **/
  @Schema(example = "100", description = "the score for this version of the submission")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public SubmissionVersion submissionType(String submissionType) {
    this.submissionType = submissionType;
    return this;
  }

  

  /**
  * the type of submission
  * @return submissionType
  **/
  @Schema(example = "online", description = "the type of submission")
  public String getSubmissionType() {
    return submissionType;
  }
  public void setSubmissionType(String submissionType) {
    this.submissionType = submissionType;
  }
  public SubmissionVersion url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * the url of the submission, if there is one
  * @return url
  **/
  @Schema(description = "the url of the submission, if there is one")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public SubmissionVersion userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * the user ID of the student who created this submission
  * @return userId
  **/
  @Schema(example = "67376", description = "the user ID of the student who created this submission")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public SubmissionVersion userName(String userName) {
    this.userName = userName;
    return this;
  }

  

  /**
  * the name of the student who created this submission
  * @return userName
  **/
  @Schema(example = "student@example.com", description = "the name of the student who created this submission")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public SubmissionVersion workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * the state of the submission at this version
  * @return workflowState
  **/
  @Schema(example = "unsubmitted", description = "the state of the submission at this version")
  public String getWorkflowState() {
    return workflowState;
  }
  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionVersion submissionVersion = (SubmissionVersion) o;
    return Objects.equals(this.assignmentId, submissionVersion.assignmentId) &&
        Objects.equals(this.assignmentName, submissionVersion.assignmentName) &&
        Objects.equals(this.body, submissionVersion.body) &&
        Objects.equals(this.currentGrade, submissionVersion.currentGrade) &&
        Objects.equals(this.currentGradedAt, submissionVersion.currentGradedAt) &&
        Objects.equals(this.currentGrader, submissionVersion.currentGrader) &&
        Objects.equals(this.gradeMatchesCurrentSubmission, submissionVersion.gradeMatchesCurrentSubmission) &&
        Objects.equals(this.gradedAt, submissionVersion.gradedAt) &&
        Objects.equals(this.grader, submissionVersion.grader) &&
        Objects.equals(this.graderId, submissionVersion.graderId) &&
        Objects.equals(this.id, submissionVersion.id) &&
        Objects.equals(this.newGrade, submissionVersion.newGrade) &&
        Objects.equals(this.newGradedAt, submissionVersion.newGradedAt) &&
        Objects.equals(this.newGrader, submissionVersion.newGrader) &&
        Objects.equals(this.previousGrade, submissionVersion.previousGrade) &&
        Objects.equals(this.previousGradedAt, submissionVersion.previousGradedAt) &&
        Objects.equals(this.previousGrader, submissionVersion.previousGrader) &&
        Objects.equals(this.score, submissionVersion.score) &&
        Objects.equals(this.submissionType, submissionVersion.submissionType) &&
        Objects.equals(this.url, submissionVersion.url) &&
        Objects.equals(this.userId, submissionVersion.userId) &&
        Objects.equals(this.userName, submissionVersion.userName) &&
        Objects.equals(this.workflowState, submissionVersion.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(assignmentId, assignmentName, body, currentGrade, currentGradedAt, currentGrader, gradeMatchesCurrentSubmission, gradedAt, grader, graderId, id, newGrade, newGradedAt, newGrader, previousGrade, previousGradedAt, previousGrader, score, submissionType, url, userId, userName, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionVersion {\n");
    
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    assignmentName: ").append(toIndentedString(assignmentName)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    currentGrade: ").append(toIndentedString(currentGrade)).append("\n");
    sb.append("    currentGradedAt: ").append(toIndentedString(currentGradedAt)).append("\n");
    sb.append("    currentGrader: ").append(toIndentedString(currentGrader)).append("\n");
    sb.append("    gradeMatchesCurrentSubmission: ").append(toIndentedString(gradeMatchesCurrentSubmission)).append("\n");
    sb.append("    gradedAt: ").append(toIndentedString(gradedAt)).append("\n");
    sb.append("    grader: ").append(toIndentedString(grader)).append("\n");
    sb.append("    graderId: ").append(toIndentedString(graderId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newGrade: ").append(toIndentedString(newGrade)).append("\n");
    sb.append("    newGradedAt: ").append(toIndentedString(newGradedAt)).append("\n");
    sb.append("    newGrader: ").append(toIndentedString(newGrader)).append("\n");
    sb.append("    previousGrade: ").append(toIndentedString(previousGrade)).append("\n");
    sb.append("    previousGradedAt: ").append(toIndentedString(previousGradedAt)).append("\n");
    sb.append("    previousGrader: ").append(toIndentedString(previousGrader)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    submissionType: ").append(toIndentedString(submissionType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
