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
import com.instructure.canvas.model.ConferenceRecording;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Conference
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Conference {

  @JsonProperty("conference_key")

  private String conferenceKey = null;

  @JsonProperty("conference_type")

  private String conferenceType = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("duration")

  private Integer duration = null;

  @JsonProperty("ended_at")

  private OffsetDateTime endedAt = null;

  @JsonProperty("has_advanced_settings")

  private Boolean hasAdvancedSettings = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("join_url")

  private String joinUrl = null;

  @JsonProperty("long_running")

  private Boolean longRunning = null;

  @JsonProperty("recordings")

  private List<ConferenceRecording> recordings = null;

  @JsonProperty("started_at")

  private OffsetDateTime startedAt = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("user_settings")

  private Object userSettings = null;

  @JsonProperty("users")

  private List<Integer> users = null;
  public Conference conferenceKey(String conferenceKey) {
    this.conferenceKey = conferenceKey;
    return this;
  }

  

  /**
  * The 3rd party&#x27;s ID for the conference
  * @return conferenceKey
  **/
  @Schema(example = "abcdjoelisgreatxyz", description = "The 3rd party's ID for the conference")
  public String getConferenceKey() {
    return conferenceKey;
  }
  public void setConferenceKey(String conferenceKey) {
    this.conferenceKey = conferenceKey;
  }
  public Conference conferenceType(String conferenceType) {
    this.conferenceType = conferenceType;
    return this;
  }

  

  /**
  * The type of conference
  * @return conferenceType
  **/
  @Schema(example = "AdobeConnect", description = "The type of conference")
  public String getConferenceType() {
    return conferenceType;
  }
  public void setConferenceType(String conferenceType) {
    this.conferenceType = conferenceType;
  }
  public Conference description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The description for the conference
  * @return description
  **/
  @Schema(example = "Conference Description", description = "The description for the conference")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Conference duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  

  /**
  * The expected duration the conference is supposed to last
  * @return duration
  **/
  @Schema(example = "60", description = "The expected duration the conference is supposed to last")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }
  public Conference endedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
    return this;
  }

  

  /**
  * The date that the conference ended at, null if it hasn&#x27;t ended
  * @return endedAt
  **/
  @Schema(description = "The date that the conference ended at, null if it hasn't ended")
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }
  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }
  public Conference hasAdvancedSettings(Boolean hasAdvancedSettings) {
    this.hasAdvancedSettings = hasAdvancedSettings;
    return this;
  }

  

  /**
  * True if the conference type has advanced settings.
  * @return hasAdvancedSettings
  **/
  @Schema(example = "false", description = "True if the conference type has advanced settings.")
  public Boolean isHasAdvancedSettings() {
    return hasAdvancedSettings;
  }
  public void setHasAdvancedSettings(Boolean hasAdvancedSettings) {
    this.hasAdvancedSettings = hasAdvancedSettings;
  }
  public Conference id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The id of the conference
  * @return id
  **/
  @Schema(example = "170", description = "The id of the conference")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Conference joinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
    return this;
  }

  

  /**
  * URL to join the conference, may be null if the conference type doesn&#x27;t set it
  * @return joinUrl
  **/
  @Schema(description = "URL to join the conference, may be null if the conference type doesn't set it")
  public String getJoinUrl() {
    return joinUrl;
  }
  public void setJoinUrl(String joinUrl) {
    this.joinUrl = joinUrl;
  }
  public Conference longRunning(Boolean longRunning) {
    this.longRunning = longRunning;
    return this;
  }

  

  /**
  * If true the conference is long running and has no expected end time
  * @return longRunning
  **/
  @Schema(example = "false", description = "If true the conference is long running and has no expected end time")
  public Boolean isLongRunning() {
    return longRunning;
  }
  public void setLongRunning(Boolean longRunning) {
    this.longRunning = longRunning;
  }
  public Conference recordings(List<ConferenceRecording> recordings) {
    this.recordings = recordings;
    return this;
  }

  public Conference addRecordingsItem(ConferenceRecording recordingsItem) {
    if (this.recordings == null) {
      this.recordings = new ArrayList<ConferenceRecording>();
    }
    this.recordings.add(recordingsItem);
    return this;
  }

  /**
  * A List of recordings for the conference
  * @return recordings
  **/
  @Schema(description = "A List of recordings for the conference")
  public List<ConferenceRecording> getRecordings() {
    return recordings;
  }
  public void setRecordings(List<ConferenceRecording> recordings) {
    this.recordings = recordings;
  }
  public Conference startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  

  /**
  * The date the conference started at, null if it hasn&#x27;t started
  * @return startedAt
  **/
  @Schema(description = "The date the conference started at, null if it hasn't started")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }
  public Conference title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * The title of the conference
  * @return title
  **/
  @Schema(example = "Test conference", description = "The title of the conference")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public Conference url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * URL for the conference, may be null if the conference type doesn&#x27;t set it
  * @return url
  **/
  @Schema(description = "URL for the conference, may be null if the conference type doesn't set it")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public Conference userSettings(Object userSettings) {
    this.userSettings = userSettings;
    return this;
  }

  

  /**
  * A collection of settings specific to the conference type
  * @return userSettings
  **/
  @Schema(example = "{\"record\":true}", description = "A collection of settings specific to the conference type")
  public Object getUserSettings() {
    return userSettings;
  }
  public void setUserSettings(Object userSettings) {
    this.userSettings = userSettings;
  }
  public Conference users(List<Integer> users) {
    this.users = users;
    return this;
  }

  public Conference addUsersItem(Integer usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<Integer>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
  * Array of user ids that are participants in the conference
  * @return users
  **/
  @Schema(example = "[1, 7, 8, 9, 10]", description = "Array of user ids that are participants in the conference")
  public List<Integer> getUsers() {
    return users;
  }
  public void setUsers(List<Integer> users) {
    this.users = users;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conference conference = (Conference) o;
    return Objects.equals(this.conferenceKey, conference.conferenceKey) &&
        Objects.equals(this.conferenceType, conference.conferenceType) &&
        Objects.equals(this.description, conference.description) &&
        Objects.equals(this.duration, conference.duration) &&
        Objects.equals(this.endedAt, conference.endedAt) &&
        Objects.equals(this.hasAdvancedSettings, conference.hasAdvancedSettings) &&
        Objects.equals(this.id, conference.id) &&
        Objects.equals(this.joinUrl, conference.joinUrl) &&
        Objects.equals(this.longRunning, conference.longRunning) &&
        Objects.equals(this.recordings, conference.recordings) &&
        Objects.equals(this.startedAt, conference.startedAt) &&
        Objects.equals(this.title, conference.title) &&
        Objects.equals(this.url, conference.url) &&
        Objects.equals(this.userSettings, conference.userSettings) &&
        Objects.equals(this.users, conference.users);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(conferenceKey, conferenceType, description, duration, endedAt, hasAdvancedSettings, id, joinUrl, longRunning, recordings, startedAt, title, url, userSettings, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conference {\n");
    
    sb.append("    conferenceKey: ").append(toIndentedString(conferenceKey)).append("\n");
    sb.append("    conferenceType: ").append(toIndentedString(conferenceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    hasAdvancedSettings: ").append(toIndentedString(hasAdvancedSettings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    joinUrl: ").append(toIndentedString(joinUrl)).append("\n");
    sb.append("    longRunning: ").append(toIndentedString(longRunning)).append("\n");
    sb.append("    recordings: ").append(toIndentedString(recordings)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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