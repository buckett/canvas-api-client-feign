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
import com.instructure.canvas.model.GradeChangeEventLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * GradeChangeEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class GradeChangeEvent {

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("event_type")

  private String eventType = null;

  @JsonProperty("excused_after")

  private Boolean excusedAfter = null;

  @JsonProperty("excused_before")

  private Boolean excusedBefore = null;

  @JsonProperty("grade_after")

  private String gradeAfter = null;

  @JsonProperty("grade_before")

  private String gradeBefore = null;

  @JsonProperty("graded_anonymously")

  private Boolean gradedAnonymously = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("links")

  private GradeChangeEventLinks links = null;

  @JsonProperty("request_id")

  private String requestId = null;

  @JsonProperty("version_number")

  private String versionNumber = null;
  public GradeChangeEvent createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * timestamp of the event
  * @return createdAt
  **/
  @Schema(description = "timestamp of the event")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public GradeChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  

  /**
  * GradeChange event type
  * @return eventType
  **/
  @Schema(example = "grade_change", description = "GradeChange event type")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }
  public GradeChangeEvent excusedAfter(Boolean excusedAfter) {
    this.excusedAfter = excusedAfter;
    return this;
  }

  

  /**
  * Boolean indicating whether the submission was excused after the change.
  * @return excusedAfter
  **/
  @Schema(example = "true", description = "Boolean indicating whether the submission was excused after the change.")
  public Boolean isExcusedAfter() {
    return excusedAfter;
  }
  public void setExcusedAfter(Boolean excusedAfter) {
    this.excusedAfter = excusedAfter;
  }
  public GradeChangeEvent excusedBefore(Boolean excusedBefore) {
    this.excusedBefore = excusedBefore;
    return this;
  }

  

  /**
  * Boolean indicating whether the submission was excused before the change.
  * @return excusedBefore
  **/
  @Schema(example = "false", description = "Boolean indicating whether the submission was excused before the change.")
  public Boolean isExcusedBefore() {
    return excusedBefore;
  }
  public void setExcusedBefore(Boolean excusedBefore) {
    this.excusedBefore = excusedBefore;
  }
  public GradeChangeEvent gradeAfter(String gradeAfter) {
    this.gradeAfter = gradeAfter;
    return this;
  }

  

  /**
  * The grade after the change.
  * @return gradeAfter
  **/
  @Schema(example = "8", description = "The grade after the change.")
  public String getGradeAfter() {
    return gradeAfter;
  }
  public void setGradeAfter(String gradeAfter) {
    this.gradeAfter = gradeAfter;
  }
  public GradeChangeEvent gradeBefore(String gradeBefore) {
    this.gradeBefore = gradeBefore;
    return this;
  }

  

  /**
  * The grade before the change.
  * @return gradeBefore
  **/
  @Schema(example = "8", description = "The grade before the change.")
  public String getGradeBefore() {
    return gradeBefore;
  }
  public void setGradeBefore(String gradeBefore) {
    this.gradeBefore = gradeBefore;
  }
  public GradeChangeEvent gradedAnonymously(Boolean gradedAnonymously) {
    this.gradedAnonymously = gradedAnonymously;
    return this;
  }

  

  /**
  * Boolean indicating whether the student name was visible when the grade was given. Could be null if the grade change record was created before this feature existed.
  * @return gradedAnonymously
  **/
  @Schema(example = "true", description = "Boolean indicating whether the student name was visible when the grade was given. Could be null if the grade change record was created before this feature existed.")
  public Boolean isGradedAnonymously() {
    return gradedAnonymously;
  }
  public void setGradedAnonymously(Boolean gradedAnonymously) {
    this.gradedAnonymously = gradedAnonymously;
  }
  public GradeChangeEvent id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * ID of the event.
  * @return id
  **/
  @Schema(example = "e2b76430-27a5-0131-3ca1-48e0eb13f29b", description = "ID of the event.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public GradeChangeEvent links(GradeChangeEventLinks links) {
    this.links = links;
    return this;
  }

  

  /**
  * Get links
  * @return links
  **/
  @Schema(description = "")
  public GradeChangeEventLinks getLinks() {
    return links;
  }
  public void setLinks(GradeChangeEventLinks links) {
    this.links = links;
  }
  public GradeChangeEvent requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  

  /**
  * The unique request id of the request during the grade change.
  * @return requestId
  **/
  @Schema(example = "e2b76430-27a5-0131-3ca1-48e0eb13f29b", description = "The unique request id of the request during the grade change.")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
  public GradeChangeEvent versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  

  /**
  * Version Number of the grade change submission.
  * @return versionNumber
  **/
  @Schema(example = "1", description = "Version Number of the grade change submission.")
  public String getVersionNumber() {
    return versionNumber;
  }
  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeChangeEvent gradeChangeEvent = (GradeChangeEvent) o;
    return Objects.equals(this.createdAt, gradeChangeEvent.createdAt) &&
        Objects.equals(this.eventType, gradeChangeEvent.eventType) &&
        Objects.equals(this.excusedAfter, gradeChangeEvent.excusedAfter) &&
        Objects.equals(this.excusedBefore, gradeChangeEvent.excusedBefore) &&
        Objects.equals(this.gradeAfter, gradeChangeEvent.gradeAfter) &&
        Objects.equals(this.gradeBefore, gradeChangeEvent.gradeBefore) &&
        Objects.equals(this.gradedAnonymously, gradeChangeEvent.gradedAnonymously) &&
        Objects.equals(this.id, gradeChangeEvent.id) &&
        Objects.equals(this.links, gradeChangeEvent.links) &&
        Objects.equals(this.requestId, gradeChangeEvent.requestId) &&
        Objects.equals(this.versionNumber, gradeChangeEvent.versionNumber);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(createdAt, eventType, excusedAfter, excusedBefore, gradeAfter, gradeBefore, gradedAnonymously, id, links, requestId, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeChangeEvent {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    excusedAfter: ").append(toIndentedString(excusedAfter)).append("\n");
    sb.append("    excusedBefore: ").append(toIndentedString(excusedBefore)).append("\n");
    sb.append("    gradeAfter: ").append(toIndentedString(gradeAfter)).append("\n");
    sb.append("    gradeBefore: ").append(toIndentedString(gradeBefore)).append("\n");
    sb.append("    gradedAnonymously: ").append(toIndentedString(gradedAnonymously)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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
