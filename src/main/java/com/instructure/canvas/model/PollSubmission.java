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
 * PollSubmission
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class PollSubmission {

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("poll_choice_id")

  private Integer pollChoiceId = null;

  @JsonProperty("user_id")

  private Integer userId = null;
  public PollSubmission createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * The date and time the poll submission was submitted.
  * @return createdAt
  **/
  @Schema(description = "The date and time the poll submission was submitted.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public PollSubmission id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The unique identifier for the poll submission.
  * @return id
  **/
  @Schema(example = "1023", required = true, description = "The unique identifier for the poll submission.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public PollSubmission pollChoiceId(Integer pollChoiceId) {
    this.pollChoiceId = pollChoiceId;
    return this;
  }

  

  /**
  * The unique identifier of the poll choice chosen for this submission.
  * @return pollChoiceId
  **/
  @Schema(example = "155", description = "The unique identifier of the poll choice chosen for this submission.")
  public Integer getPollChoiceId() {
    return pollChoiceId;
  }
  public void setPollChoiceId(Integer pollChoiceId) {
    this.pollChoiceId = pollChoiceId;
  }
  public PollSubmission userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * the unique identifier of the user who submitted this poll submission.
  * @return userId
  **/
  @Schema(example = "4555", description = "the unique identifier of the user who submitted this poll submission.")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
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
    PollSubmission pollSubmission = (PollSubmission) o;
    return Objects.equals(this.createdAt, pollSubmission.createdAt) &&
        Objects.equals(this.id, pollSubmission.id) &&
        Objects.equals(this.pollChoiceId, pollSubmission.pollChoiceId) &&
        Objects.equals(this.userId, pollSubmission.userId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(createdAt, id, pollChoiceId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollSubmission {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pollChoiceId: ").append(toIndentedString(pollChoiceId)).append("\n");
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