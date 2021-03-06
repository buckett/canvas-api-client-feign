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
 * ProvisionalGrade
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class ProvisionalGrade {

  @JsonProperty("final")

  private Boolean _final = null;

  @JsonProperty("grade")

  private String grade = null;

  @JsonProperty("grade_matches_current_submission")

  private Boolean gradeMatchesCurrentSubmission = null;

  @JsonProperty("graded_at")

  private OffsetDateTime gradedAt = null;

  @JsonProperty("provisional_grade_id")

  private Integer provisionalGradeId = null;

  @JsonProperty("score")

  private Integer score = null;

  @JsonProperty("speedgrader_url")

  private String speedgraderUrl = null;
  public ProvisionalGrade _final(Boolean _final) {
    this._final = _final;
    return this;
  }

  

  /**
  * Whether this is the &#x27;final&#x27; provisional grade created by the moderator
  * @return _final
  **/
  @Schema(example = "false", description = "Whether this is the 'final' provisional grade created by the moderator")
  public Boolean isFinal() {
    return _final;
  }
  public void setFinal(Boolean _final) {
    this._final = _final;
  }
  public ProvisionalGrade grade(String grade) {
    this.grade = grade;
    return this;
  }

  

  /**
  * The grade
  * @return grade
  **/
  @Schema(example = "A-", description = "The grade")
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }
  public ProvisionalGrade gradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
    return this;
  }

  

  /**
  * Whether the grade was applied to the most current submission (false if the student resubmitted after grading)
  * @return gradeMatchesCurrentSubmission
  **/
  @Schema(example = "true", description = "Whether the grade was applied to the most current submission (false if the student resubmitted after grading)")
  public Boolean isGradeMatchesCurrentSubmission() {
    return gradeMatchesCurrentSubmission;
  }
  public void setGradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
  }
  public ProvisionalGrade gradedAt(OffsetDateTime gradedAt) {
    this.gradedAt = gradedAt;
    return this;
  }

  

  /**
  * When the grade was given
  * @return gradedAt
  **/
  @Schema(description = "When the grade was given")
  public OffsetDateTime getGradedAt() {
    return gradedAt;
  }
  public void setGradedAt(OffsetDateTime gradedAt) {
    this.gradedAt = gradedAt;
  }
  public ProvisionalGrade provisionalGradeId(Integer provisionalGradeId) {
    this.provisionalGradeId = provisionalGradeId;
    return this;
  }

  

  /**
  * The identifier for the provisional grade
  * @return provisionalGradeId
  **/
  @Schema(example = "23", description = "The identifier for the provisional grade")
  public Integer getProvisionalGradeId() {
    return provisionalGradeId;
  }
  public void setProvisionalGradeId(Integer provisionalGradeId) {
    this.provisionalGradeId = provisionalGradeId;
  }
  public ProvisionalGrade score(Integer score) {
    this.score = score;
    return this;
  }

  

  /**
  * The numeric score
  * @return score
  **/
  @Schema(example = "90", description = "The numeric score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public ProvisionalGrade speedgraderUrl(String speedgraderUrl) {
    this.speedgraderUrl = speedgraderUrl;
    return this;
  }

  

  /**
  * A link to view this provisional grade in SpeedGrader™
  * @return speedgraderUrl
  **/
  @Schema(example = "http://www.example.com/courses/123/gradebook/speed_grader?...", description = "A link to view this provisional grade in SpeedGrader™")
  public String getSpeedgraderUrl() {
    return speedgraderUrl;
  }
  public void setSpeedgraderUrl(String speedgraderUrl) {
    this.speedgraderUrl = speedgraderUrl;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionalGrade provisionalGrade = (ProvisionalGrade) o;
    return Objects.equals(this._final, provisionalGrade._final) &&
        Objects.equals(this.grade, provisionalGrade.grade) &&
        Objects.equals(this.gradeMatchesCurrentSubmission, provisionalGrade.gradeMatchesCurrentSubmission) &&
        Objects.equals(this.gradedAt, provisionalGrade.gradedAt) &&
        Objects.equals(this.provisionalGradeId, provisionalGrade.provisionalGradeId) &&
        Objects.equals(this.score, provisionalGrade.score) &&
        Objects.equals(this.speedgraderUrl, provisionalGrade.speedgraderUrl);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(_final, grade, gradeMatchesCurrentSubmission, gradedAt, provisionalGradeId, score, speedgraderUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionalGrade {\n");
    
    sb.append("    _final: ").append(toIndentedString(_final)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradeMatchesCurrentSubmission: ").append(toIndentedString(gradeMatchesCurrentSubmission)).append("\n");
    sb.append("    gradedAt: ").append(toIndentedString(gradedAt)).append("\n");
    sb.append("    provisionalGradeId: ").append(toIndentedString(provisionalGradeId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    speedgraderUrl: ").append(toIndentedString(speedgraderUrl)).append("\n");
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
