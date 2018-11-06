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
 * ConferenceRecording
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class ConferenceRecording {

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("duration_minutes")

  private Integer durationMinutes = null;

  @JsonProperty("playback_url")

  private String playbackUrl = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("updated_at")

  private OffsetDateTime updatedAt = null;
  public ConferenceRecording createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * Get createdAt
  * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public ConferenceRecording durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

  

  /**
  * Get durationMinutes
  * @return durationMinutes
  **/
  @Schema(example = "0", description = "")
  public Integer getDurationMinutes() {
    return durationMinutes;
  }
  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }
  public ConferenceRecording playbackUrl(String playbackUrl) {
    this.playbackUrl = playbackUrl;
    return this;
  }

  

  /**
  * Get playbackUrl
  * @return playbackUrl
  **/
  @Schema(example = "http://example.com/recording_url", description = "")
  public String getPlaybackUrl() {
    return playbackUrl;
  }
  public void setPlaybackUrl(String playbackUrl) {
    this.playbackUrl = playbackUrl;
  }
  public ConferenceRecording title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * Get title
  * @return title
  **/
  @Schema(example = "course2: Test conference 3 [170]_0", description = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public ConferenceRecording updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  /**
  * Get updatedAt
  * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceRecording conferenceRecording = (ConferenceRecording) o;
    return Objects.equals(this.createdAt, conferenceRecording.createdAt) &&
        Objects.equals(this.durationMinutes, conferenceRecording.durationMinutes) &&
        Objects.equals(this.playbackUrl, conferenceRecording.playbackUrl) &&
        Objects.equals(this.title, conferenceRecording.title) &&
        Objects.equals(this.updatedAt, conferenceRecording.updatedAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(createdAt, durationMinutes, playbackUrl, title, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceRecording {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    playbackUrl: ").append(toIndentedString(playbackUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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