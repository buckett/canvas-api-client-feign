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
import com.instructure.canvas.model.SubmissionComment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Submission
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Submission {

  @JsonProperty("assignment")

  private String assignment = null;

  @JsonProperty("assignment_id")

  private Integer assignmentId = null;

  @JsonProperty("assignment_visible")

  private Boolean assignmentVisible = null;

  @JsonProperty("attempt")

  private Integer attempt = null;

  @JsonProperty("body")

  private String body = null;

  @JsonProperty("course")

  private String course = null;

  @JsonProperty("excused")

  private Boolean excused = null;

  @JsonProperty("grade")

  private String grade = null;

  @JsonProperty("grade_matches_current_submission")

  private Boolean gradeMatchesCurrentSubmission = null;

  @JsonProperty("graded_at")

  private OffsetDateTime gradedAt = null;

  @JsonProperty("grader_id")

  private Integer graderId = null;

  @JsonProperty("html_url")

  private String htmlUrl = null;

  @JsonProperty("late")

  private Boolean late = null;

  @JsonProperty("late_policy_status")

  private String latePolicyStatus = null;

  @JsonProperty("missing")

  private Boolean missing = null;

  @JsonProperty("points_deducted")

  private BigDecimal pointsDeducted = null;

  @JsonProperty("preview_url")

  private String previewUrl = null;

  @JsonProperty("score")

  private BigDecimal score = null;

  @JsonProperty("seconds_late")

  private BigDecimal secondsLate = null;

  @JsonProperty("submission_comments")

  private List<SubmissionComment> submissionComments = null;

  @JsonProperty("submission_type")

  private String submissionType = null;

  @JsonProperty("submitted_at")

  private OffsetDateTime submittedAt = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("user")

  private String user = null;

  @JsonProperty("user_id")

  private Integer userId = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public Submission assignment(String assignment) {
    this.assignment = assignment;
    return this;
  }

  

  /**
  * The submission&#x27;s assignment (see the assignments API) (optional)
  * @return assignment
  **/
  @Schema(example = "Assignment", description = "The submission's assignment (see the assignments API) (optional)")
  public String getAssignment() {
    return assignment;
  }
  public void setAssignment(String assignment) {
    this.assignment = assignment;
  }
  public Submission assignmentId(Integer assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

  

  /**
  * The submission&#x27;s assignment id
  * @return assignmentId
  **/
  @Schema(example = "23", description = "The submission's assignment id")
  public Integer getAssignmentId() {
    return assignmentId;
  }
  public void setAssignmentId(Integer assignmentId) {
    this.assignmentId = assignmentId;
  }
  public Submission assignmentVisible(Boolean assignmentVisible) {
    this.assignmentVisible = assignmentVisible;
    return this;
  }

  

  /**
  * Whether the assignment is visible to the user who submitted the assignment. Submissions where &#x60;assignment_visible&#x60; is false no longer count towards the student&#x27;s grade and the assignment can no longer be accessed by the student. &#x60;assignment_visible&#x60; becomes false for submissions that do not have a grade and whose assignment is no longer assigned to the student&#x27;s section.
  * @return assignmentVisible
  **/
  @Schema(example = "true", description = "Whether the assignment is visible to the user who submitted the assignment. Submissions where `assignment_visible` is false no longer count towards the student's grade and the assignment can no longer be accessed by the student. `assignment_visible` becomes false for submissions that do not have a grade and whose assignment is no longer assigned to the student's section.")
  public Boolean isAssignmentVisible() {
    return assignmentVisible;
  }
  public void setAssignmentVisible(Boolean assignmentVisible) {
    this.assignmentVisible = assignmentVisible;
  }
  public Submission attempt(Integer attempt) {
    this.attempt = attempt;
    return this;
  }

  

  /**
  * This is the submission attempt number.
  * @return attempt
  **/
  @Schema(example = "1", description = "This is the submission attempt number.")
  public Integer getAttempt() {
    return attempt;
  }
  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }
  public Submission body(String body) {
    this.body = body;
    return this;
  }

  

  /**
  * The content of the submission, if it was submitted directly in a text field.
  * @return body
  **/
  @Schema(example = "There are three factors too...", description = "The content of the submission, if it was submitted directly in a text field.")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }
  public Submission course(String course) {
    this.course = course;
    return this;
  }

  

  /**
  * The submission&#x27;s course (see the course API) (optional)
  * @return course
  **/
  @Schema(example = "Course", description = "The submission's course (see the course API) (optional)")
  public String getCourse() {
    return course;
  }
  public void setCourse(String course) {
    this.course = course;
  }
  public Submission excused(Boolean excused) {
    this.excused = excused;
    return this;
  }

  

  /**
  * Whether the assignment is excused.  Excused assignments have no impact on a user&#x27;s grade.
  * @return excused
  **/
  @Schema(example = "true", description = "Whether the assignment is excused.  Excused assignments have no impact on a user's grade.")
  public Boolean isExcused() {
    return excused;
  }
  public void setExcused(Boolean excused) {
    this.excused = excused;
  }
  public Submission grade(String grade) {
    this.grade = grade;
    return this;
  }

  

  /**
  * The grade for the submission, translated into the assignment grading scheme (so a letter grade, for example).
  * @return grade
  **/
  @Schema(example = "A-", description = "The grade for the submission, translated into the assignment grading scheme (so a letter grade, for example).")
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }
  public Submission gradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
    return this;
  }

  

  /**
  * A boolean flag which is false if the student has re-submitted since the submission was last graded.
  * @return gradeMatchesCurrentSubmission
  **/
  @Schema(example = "true", description = "A boolean flag which is false if the student has re-submitted since the submission was last graded.")
  public Boolean isGradeMatchesCurrentSubmission() {
    return gradeMatchesCurrentSubmission;
  }
  public void setGradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
  }
  public Submission gradedAt(OffsetDateTime gradedAt) {
    this.gradedAt = gradedAt;
    return this;
  }

  

  /**
  * Get gradedAt
  * @return gradedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getGradedAt() {
    return gradedAt;
  }
  public void setGradedAt(OffsetDateTime gradedAt) {
    this.gradedAt = gradedAt;
  }
  public Submission graderId(Integer graderId) {
    this.graderId = graderId;
    return this;
  }

  

  /**
  * The id of the user who graded the submission. This will be null for submissions that haven&#x27;t been graded yet. It will be a positive number if a real user has graded the submission and a negative number if the submission was graded by a process (e.g. Quiz autograder and autograding LTI tools).  Specifically autograded quizzes set grader_id to the negative of the quiz id.  Submissions autograded by LTI tools set grader_id to the negative of the tool id.
  * @return graderId
  **/
  @Schema(example = "86", description = "The id of the user who graded the submission. This will be null for submissions that haven't been graded yet. It will be a positive number if a real user has graded the submission and a negative number if the submission was graded by a process (e.g. Quiz autograder and autograding LTI tools).  Specifically autograded quizzes set grader_id to the negative of the quiz id.  Submissions autograded by LTI tools set grader_id to the negative of the tool id.")
  public Integer getGraderId() {
    return graderId;
  }
  public void setGraderId(Integer graderId) {
    this.graderId = graderId;
  }
  public Submission htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  

  /**
  * URL to the submission. This will require the user to log in.
  * @return htmlUrl
  **/
  @Schema(example = "http://example.com/courses/255/assignments/543/submissions/134", description = "URL to the submission. This will require the user to log in.")
  public String getHtmlUrl() {
    return htmlUrl;
  }
  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }
  public Submission late(Boolean late) {
    this.late = late;
    return this;
  }

  

  /**
  * Whether the submission was made after the applicable due date
  * @return late
  **/
  @Schema(example = "false", description = "Whether the submission was made after the applicable due date")
  public Boolean isLate() {
    return late;
  }
  public void setLate(Boolean late) {
    this.late = late;
  }
  public Submission latePolicyStatus(String latePolicyStatus) {
    this.latePolicyStatus = latePolicyStatus;
    return this;
  }

  

  /**
  * The status of the submission in relation to the late policy. Can be late, missing, none, or null.
  * @return latePolicyStatus
  **/
  @Schema(example = "missing", description = "The status of the submission in relation to the late policy. Can be late, missing, none, or null.")
  public String getLatePolicyStatus() {
    return latePolicyStatus;
  }
  public void setLatePolicyStatus(String latePolicyStatus) {
    this.latePolicyStatus = latePolicyStatus;
  }
  public Submission missing(Boolean missing) {
    this.missing = missing;
    return this;
  }

  

  /**
  * Whether the assignment is missing.
  * @return missing
  **/
  @Schema(example = "true", description = "Whether the assignment is missing.")
  public Boolean isMissing() {
    return missing;
  }
  public void setMissing(Boolean missing) {
    this.missing = missing;
  }
  public Submission pointsDeducted(BigDecimal pointsDeducted) {
    this.pointsDeducted = pointsDeducted;
    return this;
  }

  

  /**
  * The amount of points automatically deducted from the score by the missing/late policy for a late or missing assignment.
  * @return pointsDeducted
  **/
  @Schema(example = "12.3", description = "The amount of points automatically deducted from the score by the missing/late policy for a late or missing assignment.")
  public BigDecimal getPointsDeducted() {
    return pointsDeducted;
  }
  public void setPointsDeducted(BigDecimal pointsDeducted) {
    this.pointsDeducted = pointsDeducted;
  }
  public Submission previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  

  /**
  * URL to the submission preview. This will require the user to log in.
  * @return previewUrl
  **/
  @Schema(example = "http://example.com/courses/255/assignments/543/submissions/134?preview=1", description = "URL to the submission preview. This will require the user to log in.")
  public String getPreviewUrl() {
    return previewUrl;
  }
  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }
  public Submission score(BigDecimal score) {
    this.score = score;
    return this;
  }

  

  /**
  * The raw score
  * @return score
  **/
  @Schema(example = "13.5", description = "The raw score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }
  public Submission secondsLate(BigDecimal secondsLate) {
    this.secondsLate = secondsLate;
    return this;
  }

  

  /**
  * The amount of time, in seconds, that an submission is late by.
  * @return secondsLate
  **/
  @Schema(example = "300.0", description = "The amount of time, in seconds, that an submission is late by.")
  public BigDecimal getSecondsLate() {
    return secondsLate;
  }
  public void setSecondsLate(BigDecimal secondsLate) {
    this.secondsLate = secondsLate;
  }
  public Submission submissionComments(List<SubmissionComment> submissionComments) {
    this.submissionComments = submissionComments;
    return this;
  }

  public Submission addSubmissionCommentsItem(SubmissionComment submissionCommentsItem) {
    if (this.submissionComments == null) {
      this.submissionComments = new ArrayList<SubmissionComment>();
    }
    this.submissionComments.add(submissionCommentsItem);
    return this;
  }

  /**
  * Associated comments for a submission (optional)
  * @return submissionComments
  **/
  @Schema(description = "Associated comments for a submission (optional)")
  public List<SubmissionComment> getSubmissionComments() {
    return submissionComments;
  }
  public void setSubmissionComments(List<SubmissionComment> submissionComments) {
    this.submissionComments = submissionComments;
  }
  public Submission submissionType(String submissionType) {
    this.submissionType = submissionType;
    return this;
  }

  

  /**
  * The types of submission ex: (&#x27;online_text_entry&#x27;|&#x27;online_url&#x27;|&#x27;online_upload&#x27;|&#x27;media_recording&#x27;)
  * @return submissionType
  **/
  @Schema(example = "online_text_entry", description = "The types of submission ex: ('online_text_entry'|'online_url'|'online_upload'|'media_recording')")
  public String getSubmissionType() {
    return submissionType;
  }
  public void setSubmissionType(String submissionType) {
    this.submissionType = submissionType;
  }
  public Submission submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

  

  /**
  * The timestamp when the assignment was submitted
  * @return submittedAt
  **/
  @Schema(description = "The timestamp when the assignment was submitted")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }
  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }
  public Submission url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * The URL of the submission (for &#x27;online_url&#x27; submissions).
  * @return url
  **/
  @Schema(description = "The URL of the submission (for 'online_url' submissions).")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public Submission user(String user) {
    this.user = user;
    return this;
  }

  

  /**
  * The submissions user (see user API) (optional)
  * @return user
  **/
  @Schema(example = "User", description = "The submissions user (see user API) (optional)")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  public Submission userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * The id of the user who created the submission
  * @return userId
  **/
  @Schema(example = "134", description = "The id of the user who created the submission")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public Submission workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * The current state of the submission
  * @return workflowState
  **/
  @Schema(example = "submitted", description = "The current state of the submission")
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
    Submission submission = (Submission) o;
    return Objects.equals(this.assignment, submission.assignment) &&
        Objects.equals(this.assignmentId, submission.assignmentId) &&
        Objects.equals(this.assignmentVisible, submission.assignmentVisible) &&
        Objects.equals(this.attempt, submission.attempt) &&
        Objects.equals(this.body, submission.body) &&
        Objects.equals(this.course, submission.course) &&
        Objects.equals(this.excused, submission.excused) &&
        Objects.equals(this.grade, submission.grade) &&
        Objects.equals(this.gradeMatchesCurrentSubmission, submission.gradeMatchesCurrentSubmission) &&
        Objects.equals(this.gradedAt, submission.gradedAt) &&
        Objects.equals(this.graderId, submission.graderId) &&
        Objects.equals(this.htmlUrl, submission.htmlUrl) &&
        Objects.equals(this.late, submission.late) &&
        Objects.equals(this.latePolicyStatus, submission.latePolicyStatus) &&
        Objects.equals(this.missing, submission.missing) &&
        Objects.equals(this.pointsDeducted, submission.pointsDeducted) &&
        Objects.equals(this.previewUrl, submission.previewUrl) &&
        Objects.equals(this.score, submission.score) &&
        Objects.equals(this.secondsLate, submission.secondsLate) &&
        Objects.equals(this.submissionComments, submission.submissionComments) &&
        Objects.equals(this.submissionType, submission.submissionType) &&
        Objects.equals(this.submittedAt, submission.submittedAt) &&
        Objects.equals(this.url, submission.url) &&
        Objects.equals(this.user, submission.user) &&
        Objects.equals(this.userId, submission.userId) &&
        Objects.equals(this.workflowState, submission.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(assignment, assignmentId, assignmentVisible, attempt, body, course, excused, grade, gradeMatchesCurrentSubmission, gradedAt, graderId, htmlUrl, late, latePolicyStatus, missing, pointsDeducted, previewUrl, score, secondsLate, submissionComments, submissionType, submittedAt, url, user, userId, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    assignmentVisible: ").append(toIndentedString(assignmentVisible)).append("\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    excused: ").append(toIndentedString(excused)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradeMatchesCurrentSubmission: ").append(toIndentedString(gradeMatchesCurrentSubmission)).append("\n");
    sb.append("    gradedAt: ").append(toIndentedString(gradedAt)).append("\n");
    sb.append("    graderId: ").append(toIndentedString(graderId)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    late: ").append(toIndentedString(late)).append("\n");
    sb.append("    latePolicyStatus: ").append(toIndentedString(latePolicyStatus)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    pointsDeducted: ").append(toIndentedString(pointsDeducted)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    secondsLate: ").append(toIndentedString(secondsLate)).append("\n");
    sb.append("    submissionComments: ").append(toIndentedString(submissionComments)).append("\n");
    sb.append("    submissionType: ").append(toIndentedString(submissionType)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
