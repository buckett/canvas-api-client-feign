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
import java.util.ArrayList;
import java.util.List;

/**
 * RubricAssessment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class RubricAssessment {

  @JsonProperty("artifact_attempt")

  private Integer artifactAttempt = null;

  @JsonProperty("artifact_id")

  private Integer artifactId = null;

  @JsonProperty("artifact_type")

  private String artifactType = null;

  @JsonProperty("assessment_type")

  private String assessmentType = null;

  @JsonProperty("assessor_id")

  private Integer assessorId = null;

  @JsonProperty("comments")

  private List<String> comments = null;

  @JsonProperty("data")

  private List<Object> data = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("rubric_association_id")

  private Integer rubricAssociationId = null;

  @JsonProperty("rubric_id")

  private Integer rubricId = null;

  @JsonProperty("score")

  private Integer score = null;
  public RubricAssessment artifactAttempt(Integer artifactAttempt) {
    this.artifactAttempt = artifactAttempt;
    return this;
  }

  

  /**
  * the current number of attempts made on the object of the assessment
  * @return artifactAttempt
  **/
  @Schema(example = "2", description = "the current number of attempts made on the object of the assessment")
  public Integer getArtifactAttempt() {
    return artifactAttempt;
  }
  public void setArtifactAttempt(Integer artifactAttempt) {
    this.artifactAttempt = artifactAttempt;
  }
  public RubricAssessment artifactId(Integer artifactId) {
    this.artifactId = artifactId;
    return this;
  }

  

  /**
  * the id of the object of the assessment
  * @return artifactId
  **/
  @Schema(example = "3", description = "the id of the object of the assessment")
  public Integer getArtifactId() {
    return artifactId;
  }
  public void setArtifactId(Integer artifactId) {
    this.artifactId = artifactId;
  }
  public RubricAssessment artifactType(String artifactType) {
    this.artifactType = artifactType;
    return this;
  }

  

  /**
  * the object of the assessment
  * @return artifactType
  **/
  @Schema(example = "Submission", description = "the object of the assessment")
  public String getArtifactType() {
    return artifactType;
  }
  public void setArtifactType(String artifactType) {
    this.artifactType = artifactType;
  }
  public RubricAssessment assessmentType(String assessmentType) {
    this.assessmentType = assessmentType;
    return this;
  }

  

  /**
  * the type of assessment. values will be either &#x27;grading&#x27;, &#x27;peer_review&#x27;, or &#x27;provisional_grade&#x27;
  * @return assessmentType
  **/
  @Schema(example = "grading", description = "the type of assessment. values will be either 'grading', 'peer_review', or 'provisional_grade'")
  public String getAssessmentType() {
    return assessmentType;
  }
  public void setAssessmentType(String assessmentType) {
    this.assessmentType = assessmentType;
  }
  public RubricAssessment assessorId(Integer assessorId) {
    this.assessorId = assessorId;
    return this;
  }

  

  /**
  * user id of the person who made the assessment
  * @return assessorId
  **/
  @Schema(example = "6", description = "user id of the person who made the assessment")
  public Integer getAssessorId() {
    return assessorId;
  }
  public void setAssessorId(Integer assessorId) {
    this.assessorId = assessorId;
  }
  public RubricAssessment comments(List<String> comments) {
    this.comments = comments;
    return this;
  }

  public RubricAssessment addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<String>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
  * (Optional) If &#x27;comments_only&#x27; is included in the &#x27;style&#x27; parameter, returned assessments will include only the comments portion of their data hash. If the user does not request a style, this key will be absent.
  * @return comments
  **/
  @Schema(description = "(Optional) If 'comments_only' is included in the 'style' parameter, returned assessments will include only the comments portion of their data hash. If the user does not request a style, this key will be absent.")
  public List<String> getComments() {
    return comments;
  }
  public void setComments(List<String> comments) {
    this.comments = comments;
  }
  public RubricAssessment data(List<Object> data) {
    this.data = data;
    return this;
  }

  public RubricAssessment addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Object>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
  * (Optional) If &#x27;full&#x27; is included in the &#x27;style&#x27; parameter, returned assessments will have their full details contained in their data hash. If the user does not request a style, this key will be absent.
  * @return data
  **/
  @Schema(description = "(Optional) If 'full' is included in the 'style' parameter, returned assessments will have their full details contained in their data hash. If the user does not request a style, this key will be absent.")
  public List<Object> getData() {
    return data;
  }
  public void setData(List<Object> data) {
    this.data = data;
  }
  public RubricAssessment id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the ID of the rubric
  * @return id
  **/
  @Schema(example = "1", description = "the ID of the rubric")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public RubricAssessment rubricAssociationId(Integer rubricAssociationId) {
    this.rubricAssociationId = rubricAssociationId;
    return this;
  }

  

  /**
  * Get rubricAssociationId
  * @return rubricAssociationId
  **/
  @Schema(example = "2", description = "")
  public Integer getRubricAssociationId() {
    return rubricAssociationId;
  }
  public void setRubricAssociationId(Integer rubricAssociationId) {
    this.rubricAssociationId = rubricAssociationId;
  }
  public RubricAssessment rubricId(Integer rubricId) {
    this.rubricId = rubricId;
    return this;
  }

  

  /**
  * the rubric the assessment belongs to
  * @return rubricId
  **/
  @Schema(example = "1", description = "the rubric the assessment belongs to")
  public Integer getRubricId() {
    return rubricId;
  }
  public void setRubricId(Integer rubricId) {
    this.rubricId = rubricId;
  }
  public RubricAssessment score(Integer score) {
    this.score = score;
    return this;
  }

  

  /**
  * Get score
  * @return score
  **/
  @Schema(description = "")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RubricAssessment rubricAssessment = (RubricAssessment) o;
    return Objects.equals(this.artifactAttempt, rubricAssessment.artifactAttempt) &&
        Objects.equals(this.artifactId, rubricAssessment.artifactId) &&
        Objects.equals(this.artifactType, rubricAssessment.artifactType) &&
        Objects.equals(this.assessmentType, rubricAssessment.assessmentType) &&
        Objects.equals(this.assessorId, rubricAssessment.assessorId) &&
        Objects.equals(this.comments, rubricAssessment.comments) &&
        Objects.equals(this.data, rubricAssessment.data) &&
        Objects.equals(this.id, rubricAssessment.id) &&
        Objects.equals(this.rubricAssociationId, rubricAssessment.rubricAssociationId) &&
        Objects.equals(this.rubricId, rubricAssessment.rubricId) &&
        Objects.equals(this.score, rubricAssessment.score);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(artifactAttempt, artifactId, artifactType, assessmentType, assessorId, comments, data, id, rubricAssociationId, rubricId, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RubricAssessment {\n");
    
    sb.append("    artifactAttempt: ").append(toIndentedString(artifactAttempt)).append("\n");
    sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
    sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
    sb.append("    assessmentType: ").append(toIndentedString(assessmentType)).append("\n");
    sb.append("    assessorId: ").append(toIndentedString(assessorId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rubricAssociationId: ").append(toIndentedString(rubricAssociationId)).append("\n");
    sb.append("    rubricId: ").append(toIndentedString(rubricId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
