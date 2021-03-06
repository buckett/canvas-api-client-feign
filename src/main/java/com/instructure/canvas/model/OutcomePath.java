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
import com.instructure.canvas.model.OutcomePathPart;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The full path to an outcome
 */
@Schema(description = "The full path to an outcome")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class OutcomePath {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("parts")

  private OutcomePathPart parts = null;
  public OutcomePath id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * A unique identifier for this outcome
  * @return id
  **/
  @Schema(example = "42", description = "A unique identifier for this outcome")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public OutcomePath parts(OutcomePathPart parts) {
    this.parts = parts;
    return this;
  }

  

  /**
  * Get parts
  * @return parts
  **/
  @Schema(description = "")
  public OutcomePathPart getParts() {
    return parts;
  }
  public void setParts(OutcomePathPart parts) {
    this.parts = parts;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomePath outcomePath = (OutcomePath) o;
    return Objects.equals(this.id, outcomePath.id) &&
        Objects.equals(this.parts, outcomePath.parts);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomePath {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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
