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
 * CompletionRequirement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class CompletionRequirement {

  @JsonProperty("completed")

  private Boolean completed = null;

  @JsonProperty("min_score")

  private Integer minScore = null;

  @JsonProperty("type")

  private String type = null;
  public CompletionRequirement completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  

  /**
  * whether the calling user has met this requirement (Optional; present only if the caller is a student or if the optional parameter &#x27;student_id&#x27; is included)
  * @return completed
  **/
  @Schema(example = "true", description = "whether the calling user has met this requirement (Optional; present only if the caller is a student or if the optional parameter 'student_id' is included)")
  public Boolean isCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }
  public CompletionRequirement minScore(Integer minScore) {
    this.minScore = minScore;
    return this;
  }

  

  /**
  * minimum score required to complete (only present when type &#x3D;&#x3D; &#x27;min_score&#x27;)
  * @return minScore
  **/
  @Schema(example = "10", description = "minimum score required to complete (only present when type == 'min_score')")
  public Integer getMinScore() {
    return minScore;
  }
  public void setMinScore(Integer minScore) {
    this.minScore = minScore;
  }
  public CompletionRequirement type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * one of &#x27;must_view&#x27;, &#x27;must_submit&#x27;, &#x27;must_contribute&#x27;, &#x27;min_score&#x27;
  * @return type
  **/
  @Schema(example = "min_score", description = "one of 'must_view', 'must_submit', 'must_contribute', 'min_score'")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionRequirement completionRequirement = (CompletionRequirement) o;
    return Objects.equals(this.completed, completionRequirement.completed) &&
        Objects.equals(this.minScore, completionRequirement.minScore) &&
        Objects.equals(this.type, completionRequirement.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(completed, minScore, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionRequirement {\n");
    
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
