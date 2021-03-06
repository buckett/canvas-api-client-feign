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
import com.instructure.canvas.model.ResultLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * A pass/fail results for a student
 */
@Schema(description = "A pass/fail results for a student")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Result {

  @JsonProperty("assessed_at")

  private OffsetDateTime assessedAt = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("links")

  private ResultLinks links = null;

  @JsonProperty("passed")

  private Boolean passed = null;
  public Result assessedAt(OffsetDateTime assessedAt) {
    this.assessedAt = assessedAt;
    return this;
  }

  

  /**
  * When this result was recorded
  * @return assessedAt
  **/
  @Schema(description = "When this result was recorded")
  public OffsetDateTime getAssessedAt() {
    return assessedAt;
  }
  public void setAssessedAt(OffsetDateTime assessedAt) {
    this.assessedAt = assessedAt;
  }
  public Result id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * A unique identifier for this result
  * @return id
  **/
  @Schema(example = "42", description = "A unique identifier for this result")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public Result links(ResultLinks links) {
    this.links = links;
    return this;
  }

  

  /**
  * Get links
  * @return links
  **/
  @Schema(description = "")
  public ResultLinks getLinks() {
    return links;
  }
  public void setLinks(ResultLinks links) {
    this.links = links;
  }
  public Result passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  

  /**
  * Whether the user passed or not
  * @return passed
  **/
  @Schema(example = "true", description = "Whether the user passed or not")
  public Boolean isPassed() {
    return passed;
  }
  public void setPassed(Boolean passed) {
    this.passed = passed;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.assessedAt, result.assessedAt) &&
        Objects.equals(this.id, result.id) &&
        Objects.equals(this.links, result.links) &&
        Objects.equals(this.passed, result.passed);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(assessedAt, id, links, passed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    assessedAt: ").append(toIndentedString(assessedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
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
