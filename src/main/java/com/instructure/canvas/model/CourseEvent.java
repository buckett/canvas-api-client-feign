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
import com.instructure.canvas.model.CourseEventLink;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * CourseEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class CourseEvent {

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("event_data")

  private String eventData = null;

  @JsonProperty("event_source")

  private String eventSource = null;

  @JsonProperty("event_type")

  private String eventType = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("links")

  private CourseEventLink links = null;
  public CourseEvent createdAt(OffsetDateTime createdAt) {
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
  public CourseEvent eventData(String eventData) {
    this.eventData = eventData;
    return this;
  }

  

  /**
  * Course event data depending on the event type.  This will return an object containing the relevant event data.  An updated event type will return an UpdatedEventData object.
  * @return eventData
  **/
  @Schema(example = "{}", description = "Course event data depending on the event type.  This will return an object containing the relevant event data.  An updated event type will return an UpdatedEventData object.")
  public String getEventData() {
    return eventData;
  }
  public void setEventData(String eventData) {
    this.eventData = eventData;
  }
  public CourseEvent eventSource(String eventSource) {
    this.eventSource = eventSource;
    return this;
  }

  

  /**
  * Course event source depending on the event type.  This will return a string containing the source of the event.
  * @return eventSource
  **/
  @Schema(example = "manual|sis|api", description = "Course event source depending on the event type.  This will return a string containing the source of the event.")
  public String getEventSource() {
    return eventSource;
  }
  public void setEventSource(String eventSource) {
    this.eventSource = eventSource;
  }
  public CourseEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  

  /**
  * Course event type The event type defines the type and schema of the event_data object.
  * @return eventType
  **/
  @Schema(example = "updated", description = "Course event type The event type defines the type and schema of the event_data object.")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }
  public CourseEvent id(String id) {
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
  public CourseEvent links(CourseEventLink links) {
    this.links = links;
    return this;
  }

  

  /**
  * Get links
  * @return links
  **/
  @Schema(description = "")
  public CourseEventLink getLinks() {
    return links;
  }
  public void setLinks(CourseEventLink links) {
    this.links = links;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseEvent courseEvent = (CourseEvent) o;
    return Objects.equals(this.createdAt, courseEvent.createdAt) &&
        Objects.equals(this.eventData, courseEvent.eventData) &&
        Objects.equals(this.eventSource, courseEvent.eventSource) &&
        Objects.equals(this.eventType, courseEvent.eventType) &&
        Objects.equals(this.id, courseEvent.id) &&
        Objects.equals(this.links, courseEvent.links);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(createdAt, eventData, eventSource, eventType, id, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseEvent {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
