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

/**
 * Permissions the user has for the quiz
 */
@Schema(description = "Permissions the user has for the quiz")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class QuizPermissions {

  @JsonProperty("create")

  private Boolean create = null;

  @JsonProperty("manage")

  private Boolean manage = null;

  @JsonProperty("read")

  private Boolean read = null;

  @JsonProperty("read_statistics")

  private Boolean readStatistics = null;

  @JsonProperty("review_grades")

  private Boolean reviewGrades = null;

  @JsonProperty("submit")

  private Boolean submit = null;

  @JsonProperty("update")

  private Boolean update = null;
  public QuizPermissions create(Boolean create) {
    this.create = create;
    return this;
  }

  

  /**
  * whether the user may create a new quiz
  * @return create
  **/
  @Schema(example = "true", description = "whether the user may create a new quiz")
  public Boolean isCreate() {
    return create;
  }
  public void setCreate(Boolean create) {
    this.create = create;
  }
  public QuizPermissions manage(Boolean manage) {
    this.manage = manage;
    return this;
  }

  

  /**
  * whether the user may edit, update, or delete the quiz
  * @return manage
  **/
  @Schema(example = "true", description = "whether the user may edit, update, or delete the quiz")
  public Boolean isManage() {
    return manage;
  }
  public void setManage(Boolean manage) {
    this.manage = manage;
  }
  public QuizPermissions read(Boolean read) {
    this.read = read;
    return this;
  }

  

  /**
  * whether the user can view the quiz
  * @return read
  **/
  @Schema(example = "true", description = "whether the user can view the quiz")
  public Boolean isRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }
  public QuizPermissions readStatistics(Boolean readStatistics) {
    this.readStatistics = readStatistics;
    return this;
  }

  

  /**
  * whether the user may view quiz statistics for this quiz
  * @return readStatistics
  **/
  @Schema(example = "true", description = "whether the user may view quiz statistics for this quiz")
  public Boolean isReadStatistics() {
    return readStatistics;
  }
  public void setReadStatistics(Boolean readStatistics) {
    this.readStatistics = readStatistics;
  }
  public QuizPermissions reviewGrades(Boolean reviewGrades) {
    this.reviewGrades = reviewGrades;
    return this;
  }

  

  /**
  * whether the user may review grades for all quiz submissions for this quiz
  * @return reviewGrades
  **/
  @Schema(example = "true", description = "whether the user may review grades for all quiz submissions for this quiz")
  public Boolean isReviewGrades() {
    return reviewGrades;
  }
  public void setReviewGrades(Boolean reviewGrades) {
    this.reviewGrades = reviewGrades;
  }
  public QuizPermissions submit(Boolean submit) {
    this.submit = submit;
    return this;
  }

  

  /**
  * whether the user may submit a submission for the quiz
  * @return submit
  **/
  @Schema(example = "true", description = "whether the user may submit a submission for the quiz")
  public Boolean isSubmit() {
    return submit;
  }
  public void setSubmit(Boolean submit) {
    this.submit = submit;
  }
  public QuizPermissions update(Boolean update) {
    this.update = update;
    return this;
  }

  

  /**
  * whether the user may update the quiz
  * @return update
  **/
  @Schema(example = "true", description = "whether the user may update the quiz")
  public Boolean isUpdate() {
    return update;
  }
  public void setUpdate(Boolean update) {
    this.update = update;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizPermissions quizPermissions = (QuizPermissions) o;
    return Objects.equals(this.create, quizPermissions.create) &&
        Objects.equals(this.manage, quizPermissions.manage) &&
        Objects.equals(this.read, quizPermissions.read) &&
        Objects.equals(this.readStatistics, quizPermissions.readStatistics) &&
        Objects.equals(this.reviewGrades, quizPermissions.reviewGrades) &&
        Objects.equals(this.submit, quizPermissions.submit) &&
        Objects.equals(this.update, quizPermissions.update);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(create, manage, read, readStatistics, reviewGrades, submit, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPermissions {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    manage: ").append(toIndentedString(manage)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    readStatistics: ").append(toIndentedString(readStatistics)).append("\n");
    sb.append("    reviewGrades: ").append(toIndentedString(reviewGrades)).append("\n");
    sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
