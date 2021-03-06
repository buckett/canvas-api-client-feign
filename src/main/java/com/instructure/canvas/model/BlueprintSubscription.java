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
 * Associates a course with a blueprint
 */
@Schema(description = "Associates a course with a blueprint")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class BlueprintSubscription {

  @JsonProperty("blueprint_course")

  private Object blueprintCourse = null;

  @JsonProperty("id")

  private Long id = null;

  @JsonProperty("template_id")

  private Long templateId = null;
  public BlueprintSubscription blueprintCourse(Object blueprintCourse) {
    this.blueprintCourse = blueprintCourse;
    return this;
  }

  

  /**
  * The blueprint course subscribed to
  * @return blueprintCourse
  **/
  @Schema(example = "{\"course_code\":\"BIOL 100 BP\",\"id\":2,\"name\":\"Biology 100 Blueprint\",\"term_name\":\"Default term\"}", description = "The blueprint course subscribed to")
  public Object getBlueprintCourse() {
    return blueprintCourse;
  }
  public void setBlueprintCourse(Object blueprintCourse) {
    this.blueprintCourse = blueprintCourse;
  }
  public BlueprintSubscription id(Long id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of the blueprint course subscription
  * @return id
  **/
  @Schema(example = "101", description = "The ID of the blueprint course subscription")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public BlueprintSubscription templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

  

  /**
  * The ID of the blueprint template the associated course is subscribed to
  * @return templateId
  **/
  @Schema(example = "1", description = "The ID of the blueprint template the associated course is subscribed to")
  public Long getTemplateId() {
    return templateId;
  }
  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlueprintSubscription blueprintSubscription = (BlueprintSubscription) o;
    return Objects.equals(this.blueprintCourse, blueprintSubscription.blueprintCourse) &&
        Objects.equals(this.id, blueprintSubscription.id) &&
        Objects.equals(this.templateId, blueprintSubscription.templateId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(blueprintCourse, id, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintSubscription {\n");
    
    sb.append("    blueprintCourse: ").append(toIndentedString(blueprintCourse)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
