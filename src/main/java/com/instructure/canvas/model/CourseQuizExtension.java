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
 * CourseQuizExtension
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class CourseQuizExtension {

  @JsonProperty("end_at")

  private OffsetDateTime endAt = null;

  @JsonProperty("extra_attempts")

  private Long extraAttempts = null;

  @JsonProperty("extra_time")

  private Long extraTime = null;

  @JsonProperty("manually_unlocked")

  private Boolean manuallyUnlocked = null;

  @JsonProperty("user_id")

  private Long userId = null;
  public CourseQuizExtension endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  

  /**
  * The time at which the quiz submission will be overdue, and be flagged as a late submission.
  * @return endAt
  **/
  @Schema(description = "The time at which the quiz submission will be overdue, and be flagged as a late submission.")
  public OffsetDateTime getEndAt() {
    return endAt;
  }
  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }
  public CourseQuizExtension extraAttempts(Long extraAttempts) {
    this.extraAttempts = extraAttempts;
    return this;
  }

  

  /**
  * Number of times the student is allowed to re-take the quiz over the multiple-attempt limit.
  * @return extraAttempts
  **/
  @Schema(example = "1", description = "Number of times the student is allowed to re-take the quiz over the multiple-attempt limit.")
  public Long getExtraAttempts() {
    return extraAttempts;
  }
  public void setExtraAttempts(Long extraAttempts) {
    this.extraAttempts = extraAttempts;
  }
  public CourseQuizExtension extraTime(Long extraTime) {
    this.extraTime = extraTime;
    return this;
  }

  

  /**
  * Amount of extra time allowed for the quiz submission, in minutes.
  * @return extraTime
  **/
  @Schema(example = "60", description = "Amount of extra time allowed for the quiz submission, in minutes.")
  public Long getExtraTime() {
    return extraTime;
  }
  public void setExtraTime(Long extraTime) {
    this.extraTime = extraTime;
  }
  public CourseQuizExtension manuallyUnlocked(Boolean manuallyUnlocked) {
    this.manuallyUnlocked = manuallyUnlocked;
    return this;
  }

  

  /**
  * The student can take the quiz even if it&#x27;s locked for everyone else
  * @return manuallyUnlocked
  **/
  @Schema(example = "true", description = "The student can take the quiz even if it's locked for everyone else")
  public Boolean isManuallyUnlocked() {
    return manuallyUnlocked;
  }
  public void setManuallyUnlocked(Boolean manuallyUnlocked) {
    this.manuallyUnlocked = manuallyUnlocked;
  }
  public CourseQuizExtension userId(Long userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * The ID of the Student that needs the quiz extension.
  * @return userId
  **/
  @Schema(example = "3", required = true, description = "The ID of the Student that needs the quiz extension.")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseQuizExtension courseQuizExtension = (CourseQuizExtension) o;
    return Objects.equals(this.endAt, courseQuizExtension.endAt) &&
        Objects.equals(this.extraAttempts, courseQuizExtension.extraAttempts) &&
        Objects.equals(this.extraTime, courseQuizExtension.extraTime) &&
        Objects.equals(this.manuallyUnlocked, courseQuizExtension.manuallyUnlocked) &&
        Objects.equals(this.userId, courseQuizExtension.userId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(endAt, extraAttempts, extraTime, manuallyUnlocked, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseQuizExtension {\n");
    
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    extraAttempts: ").append(toIndentedString(extraAttempts)).append("\n");
    sb.append("    extraTime: ").append(toIndentedString(extraTime)).append("\n");
    sb.append("    manuallyUnlocked: ").append(toIndentedString(manuallyUnlocked)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
