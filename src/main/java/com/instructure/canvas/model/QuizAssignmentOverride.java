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
 * Set of assignment-overridden dates for a quiz.
 */
@Schema(description = "Set of assignment-overridden dates for a quiz.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class QuizAssignmentOverride {

  @JsonProperty("base")

  private Boolean base = null;

  @JsonProperty("due_at")

  private OffsetDateTime dueAt = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("lock_at")

  private OffsetDateTime lockAt = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("unlock_at")

  private OffsetDateTime unlockAt = null;
  public QuizAssignmentOverride base(Boolean base) {
    this.base = base;
    return this;
  }

  

  /**
  * If this property is present, it means that dates in this structure are not based on an assignment override, but are instead for all students.
  * @return base
  **/
  @Schema(example = "true", description = "If this property is present, it means that dates in this structure are not based on an assignment override, but are instead for all students.")
  public Boolean isBase() {
    return base;
  }
  public void setBase(Boolean base) {
    this.base = base;
  }
  public QuizAssignmentOverride dueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
    return this;
  }

  

  /**
  * The date after which any quiz submission is considered late.
  * @return dueAt
  **/
  @Schema(description = "The date after which any quiz submission is considered late.")
  public OffsetDateTime getDueAt() {
    return dueAt;
  }
  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }
  public QuizAssignmentOverride id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * ID of the assignment override, unless this is the base construct, in which case the &#x27;id&#x27; field is omitted.
  * @return id
  **/
  @Schema(example = "1", description = "ID of the assignment override, unless this is the base construct, in which case the 'id' field is omitted.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public QuizAssignmentOverride lockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
    return this;
  }

  

  /**
  * When the quiz will stop being available for taking. A value of null means it can always be taken.
  * @return lockAt
  **/
  @Schema(description = "When the quiz will stop being available for taking. A value of null means it can always be taken.")
  public OffsetDateTime getLockAt() {
    return lockAt;
  }
  public void setLockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
  }
  public QuizAssignmentOverride title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * Title of the section this assignment override is for, if any.
  * @return title
  **/
  @Schema(example = "Project X", description = "Title of the section this assignment override is for, if any.")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public QuizAssignmentOverride unlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
    return this;
  }

  

  /**
  * Date when the quiz becomes available for taking.
  * @return unlockAt
  **/
  @Schema(description = "Date when the quiz becomes available for taking.")
  public OffsetDateTime getUnlockAt() {
    return unlockAt;
  }
  public void setUnlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizAssignmentOverride quizAssignmentOverride = (QuizAssignmentOverride) o;
    return Objects.equals(this.base, quizAssignmentOverride.base) &&
        Objects.equals(this.dueAt, quizAssignmentOverride.dueAt) &&
        Objects.equals(this.id, quizAssignmentOverride.id) &&
        Objects.equals(this.lockAt, quizAssignmentOverride.lockAt) &&
        Objects.equals(this.title, quizAssignmentOverride.title) &&
        Objects.equals(this.unlockAt, quizAssignmentOverride.unlockAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(base, dueAt, id, lockAt, title, unlockAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizAssignmentOverride {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
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
