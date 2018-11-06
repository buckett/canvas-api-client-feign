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
import com.instructure.canvas.model.Assignment;
import com.instructure.canvas.model.AssignmentOverride;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * AssignmentEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class AssignmentEvent {

  @JsonProperty("all_day")

  private Boolean allDay = null;

  @JsonProperty("all_day_date")

  private OffsetDateTime allDayDate = null;

  @JsonProperty("assignment")

  private Assignment assignment = null;

  @JsonProperty("assignment_overrides")

  private AssignmentOverride assignmentOverrides = null;

  @JsonProperty("context_code")

  private String contextCode = null;

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("end_at")

  private OffsetDateTime endAt = null;

  @JsonProperty("html_url")

  private String htmlUrl = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("start_at")

  private OffsetDateTime startAt = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("updated_at")

  private OffsetDateTime updatedAt = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public AssignmentEvent allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

  

  /**
  * Boolean indicating whether this is an all-day event (e.g. assignment due at midnight)
  * @return allDay
  **/
  @Schema(example = "true", description = "Boolean indicating whether this is an all-day event (e.g. assignment due at midnight)")
  public Boolean isAllDay() {
    return allDay;
  }
  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }
  public AssignmentEvent allDayDate(OffsetDateTime allDayDate) {
    this.allDayDate = allDayDate;
    return this;
  }

  

  /**
  * The due date of this assignment
  * @return allDayDate
  **/
  @Schema(description = "The due date of this assignment")
  public OffsetDateTime getAllDayDate() {
    return allDayDate;
  }
  public void setAllDayDate(OffsetDateTime allDayDate) {
    this.allDayDate = allDayDate;
  }
  public AssignmentEvent assignment(Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

  

  /**
  * Get assignment
  * @return assignment
  **/
  @Schema(description = "")
  public Assignment getAssignment() {
    return assignment;
  }
  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }
  public AssignmentEvent assignmentOverrides(AssignmentOverride assignmentOverrides) {
    this.assignmentOverrides = assignmentOverrides;
    return this;
  }

  

  /**
  * Get assignmentOverrides
  * @return assignmentOverrides
  **/
  @Schema(description = "")
  public AssignmentOverride getAssignmentOverrides() {
    return assignmentOverrides;
  }
  public void setAssignmentOverrides(AssignmentOverride assignmentOverrides) {
    this.assignmentOverrides = assignmentOverrides;
  }
  public AssignmentEvent contextCode(String contextCode) {
    this.contextCode = contextCode;
    return this;
  }

  

  /**
  * the context code of the (course) calendar this assignment belongs to
  * @return contextCode
  **/
  @Schema(example = "course_123", description = "the context code of the (course) calendar this assignment belongs to")
  public String getContextCode() {
    return contextCode;
  }
  public void setContextCode(String contextCode) {
    this.contextCode = contextCode;
  }
  public AssignmentEvent createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * When the assignment was created
  * @return createdAt
  **/
  @Schema(description = "When the assignment was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public AssignmentEvent description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The HTML description of the assignment
  * @return description
  **/
  @Schema(example = "<b>Write an essay. Whatever you want.</b>", description = "The HTML description of the assignment")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public AssignmentEvent endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  

  /**
  * The due_at timestamp of the assignment
  * @return endAt
  **/
  @Schema(description = "The due_at timestamp of the assignment")
  public OffsetDateTime getEndAt() {
    return endAt;
  }
  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }
  public AssignmentEvent htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  

  /**
  * URL for a user to view this assignment
  * @return htmlUrl
  **/
  @Schema(example = "http://example.com/courses/123/assignments/987", description = "URL for a user to view this assignment")
  public String getHtmlUrl() {
    return htmlUrl;
  }
  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }
  public AssignmentEvent id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * A synthetic ID for the assignment
  * @return id
  **/
  @Schema(example = "assignment_987", description = "A synthetic ID for the assignment")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public AssignmentEvent startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  

  /**
  * The due_at timestamp of the assignment
  * @return startAt
  **/
  @Schema(description = "The due_at timestamp of the assignment")
  public OffsetDateTime getStartAt() {
    return startAt;
  }
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }
  public AssignmentEvent title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * The title of the assignment
  * @return title
  **/
  @Schema(example = "Essay", description = "The title of the assignment")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public AssignmentEvent updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  /**
  * When the assignment was last updated
  * @return updatedAt
  **/
  @Schema(description = "When the assignment was last updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public AssignmentEvent url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * URL for this assignment (note that updating/deleting should be done via the Assignments API)
  * @return url
  **/
  @Schema(example = "https://example.com/api/v1/calendar_events/assignment_987", description = "URL for this assignment (note that updating/deleting should be done via the Assignments API)")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public AssignmentEvent workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * Current state of the assignment (&#x27;published&#x27; or &#x27;deleted&#x27;)
  * @return workflowState
  **/
  @Schema(example = "published", description = "Current state of the assignment ('published' or 'deleted')")
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
    AssignmentEvent assignmentEvent = (AssignmentEvent) o;
    return Objects.equals(this.allDay, assignmentEvent.allDay) &&
        Objects.equals(this.allDayDate, assignmentEvent.allDayDate) &&
        Objects.equals(this.assignment, assignmentEvent.assignment) &&
        Objects.equals(this.assignmentOverrides, assignmentEvent.assignmentOverrides) &&
        Objects.equals(this.contextCode, assignmentEvent.contextCode) &&
        Objects.equals(this.createdAt, assignmentEvent.createdAt) &&
        Objects.equals(this.description, assignmentEvent.description) &&
        Objects.equals(this.endAt, assignmentEvent.endAt) &&
        Objects.equals(this.htmlUrl, assignmentEvent.htmlUrl) &&
        Objects.equals(this.id, assignmentEvent.id) &&
        Objects.equals(this.startAt, assignmentEvent.startAt) &&
        Objects.equals(this.title, assignmentEvent.title) &&
        Objects.equals(this.updatedAt, assignmentEvent.updatedAt) &&
        Objects.equals(this.url, assignmentEvent.url) &&
        Objects.equals(this.workflowState, assignmentEvent.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(allDay, allDayDate, assignment, assignmentOverrides, contextCode, createdAt, description, endAt, htmlUrl, id, startAt, title, updatedAt, url, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentEvent {\n");
    
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    allDayDate: ").append(toIndentedString(allDayDate)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    assignmentOverrides: ").append(toIndentedString(assignmentOverrides)).append("\n");
    sb.append("    contextCode: ").append(toIndentedString(contextCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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