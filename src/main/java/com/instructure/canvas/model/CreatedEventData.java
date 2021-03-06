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
import org.threeten.bp.OffsetDateTime;

/**
 * The created event data object returns all the fields that were set in the format of the following example.  If a field does not exist it was not set. The value of each field changed is in the format of [:old_value, :new_value].  The created event type also includes a created_source field to specify what triggered the creation of the course.
 */
@Schema(description = "The created event data object returns all the fields that were set in the format of the following example.  If a field does not exist it was not set. The value of each field changed is in the format of [:old_value, :new_value].  The created event type also includes a created_source field to specify what triggered the creation of the course.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class CreatedEventData {

  @JsonProperty("conclude_at")

  private List<OffsetDateTime> concludeAt = null;

  @JsonProperty("created_source")

  private String createdSource = null;

  @JsonProperty("is_public")

  private List<Boolean> isPublic = null;

  @JsonProperty("name")

  private List<String> name = null;

  @JsonProperty("start_at")

  private List<OffsetDateTime> startAt = null;
  public CreatedEventData concludeAt(List<OffsetDateTime> concludeAt) {
    this.concludeAt = concludeAt;
    return this;
  }

  public CreatedEventData addConcludeAtItem(OffsetDateTime concludeAtItem) {
    if (this.concludeAt == null) {
      this.concludeAt = new ArrayList<OffsetDateTime>();
    }
    this.concludeAt.add(concludeAtItem);
    return this;
  }

  /**
  * Get concludeAt
  * @return concludeAt
  **/
  @Schema(example = "[2012-01-19T15:00:00-08:00]", description = "")
  public List<OffsetDateTime> getConcludeAt() {
    return concludeAt;
  }
  public void setConcludeAt(List<OffsetDateTime> concludeAt) {
    this.concludeAt = concludeAt;
  }
  public CreatedEventData createdSource(String createdSource) {
    this.createdSource = createdSource;
    return this;
  }

  

  /**
  * The type of action that triggered the creation of the course.
  * @return createdSource
  **/
  @Schema(example = "manual|sis|api", description = "The type of action that triggered the creation of the course.")
  public String getCreatedSource() {
    return createdSource;
  }
  public void setCreatedSource(String createdSource) {
    this.createdSource = createdSource;
  }
  public CreatedEventData isPublic(List<Boolean> isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  public CreatedEventData addIsPublicItem(Boolean isPublicItem) {
    if (this.isPublic == null) {
      this.isPublic = new ArrayList<Boolean>();
    }
    this.isPublic.add(isPublicItem);
    return this;
  }

  /**
  * Get isPublic
  * @return isPublic
  **/
  @Schema(example = "[false]", description = "")
  public List<Boolean> getIsPublic() {
    return isPublic;
  }
  public void setIsPublic(List<Boolean> isPublic) {
    this.isPublic = isPublic;
  }
  public CreatedEventData name(List<String> name) {
    this.name = name;
    return this;
  }

  public CreatedEventData addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
  * Get name
  * @return name
  **/
  @Schema(example = "[Course 1]", description = "")
  public List<String> getName() {
    return name;
  }
  public void setName(List<String> name) {
    this.name = name;
  }
  public CreatedEventData startAt(List<OffsetDateTime> startAt) {
    this.startAt = startAt;
    return this;
  }

  public CreatedEventData addStartAtItem(OffsetDateTime startAtItem) {
    if (this.startAt == null) {
      this.startAt = new ArrayList<OffsetDateTime>();
    }
    this.startAt.add(startAtItem);
    return this;
  }

  /**
  * Get startAt
  * @return startAt
  **/
  @Schema(example = "[2012-01-19T15:00:00-06:00]", description = "")
  public List<OffsetDateTime> getStartAt() {
    return startAt;
  }
  public void setStartAt(List<OffsetDateTime> startAt) {
    this.startAt = startAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedEventData createdEventData = (CreatedEventData) o;
    return Objects.equals(this.concludeAt, createdEventData.concludeAt) &&
        Objects.equals(this.createdSource, createdEventData.createdSource) &&
        Objects.equals(this.isPublic, createdEventData.isPublic) &&
        Objects.equals(this.name, createdEventData.name) &&
        Objects.equals(this.startAt, createdEventData.startAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(concludeAt, createdSource, isPublic, name, startAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedEventData {\n");
    
    sb.append("    concludeAt: ").append(toIndentedString(concludeAt)).append("\n");
    sb.append("    createdSource: ").append(toIndentedString(createdSource)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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
