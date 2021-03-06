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
 * RubricRating
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class RubricRating {

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("long_description")

  private String longDescription = null;

  @JsonProperty("points")

  private Integer points = null;
  public RubricRating description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Get description
  * @return description
  **/
  @Schema(example = "Full marks", description = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public RubricRating id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "rat1", description = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public RubricRating longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  

  /**
  * Get longDescription
  * @return longDescription
  **/
  @Schema(example = "Student completed the assignment flawlessly.", description = "")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }
  public RubricRating points(Integer points) {
    this.points = points;
    return this;
  }

  

  /**
  * Get points
  * @return points
  **/
  @Schema(example = "10", description = "")
  public Integer getPoints() {
    return points;
  }
  public void setPoints(Integer points) {
    this.points = points;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RubricRating rubricRating = (RubricRating) o;
    return Objects.equals(this.description, rubricRating.description) &&
        Objects.equals(this.id, rubricRating.id) &&
        Objects.equals(this.longDescription, rubricRating.longDescription) &&
        Objects.equals(this.points, rubricRating.points);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(description, id, longDescription, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RubricRating {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
