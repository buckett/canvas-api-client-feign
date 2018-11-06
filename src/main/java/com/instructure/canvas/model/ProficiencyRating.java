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
import java.math.BigDecimal;

/**
 * ProficiencyRating
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class ProficiencyRating {

  @JsonProperty("color")

  private String color = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("mastery")

  private Boolean mastery = null;

  @JsonProperty("points")

  private BigDecimal points = null;
  public ProficiencyRating color(String color) {
    this.color = color;
    return this;
  }

  

  /**
  * The hex color code of the rating
  * @return color
  **/
  @Schema(example = "127A1B", description = "The hex color code of the rating")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public ProficiencyRating description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The description of the rating
  * @return description
  **/
  @Schema(example = "Exceeds Mastery", description = "The description of the rating")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ProficiencyRating mastery(Boolean mastery) {
    this.mastery = mastery;
    return this;
  }

  

  /**
  * Indicates the rating where mastery is first achieved
  * @return mastery
  **/
  @Schema(example = "false", description = "Indicates the rating where mastery is first achieved")
  public Boolean isMastery() {
    return mastery;
  }
  public void setMastery(Boolean mastery) {
    this.mastery = mastery;
  }
  public ProficiencyRating points(BigDecimal points) {
    this.points = points;
    return this;
  }

  

  /**
  * A non-negative number of points for the rating
  * @return points
  **/
  @Schema(example = "4.0", description = "A non-negative number of points for the rating")
  public BigDecimal getPoints() {
    return points;
  }
  public void setPoints(BigDecimal points) {
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
    ProficiencyRating proficiencyRating = (ProficiencyRating) o;
    return Objects.equals(this.color, proficiencyRating.color) &&
        Objects.equals(this.description, proficiencyRating.description) &&
        Objects.equals(this.mastery, proficiencyRating.mastery) &&
        Objects.equals(this.points, proficiencyRating.points);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(color, description, mastery, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProficiencyRating {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mastery: ").append(toIndentedString(mastery)).append("\n");
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