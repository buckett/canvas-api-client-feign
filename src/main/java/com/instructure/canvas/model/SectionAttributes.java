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
import com.instructure.canvas.model.CourseAttributes;
import com.instructure.canvas.model.SectionAssignmentOverrideAttributes;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Some of the attributes of a section. For more details see Sections API.
 */
@Schema(description = "Some of the attributes of a section. For more details see Sections API.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class SectionAttributes {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("integration_id")

  private String integrationId = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("origin_course")

  private CourseAttributes originCourse = null;

  @JsonProperty("override")

  private SectionAssignmentOverrideAttributes override = null;

  @JsonProperty("sis_id")

  private String sisId = null;

  @JsonProperty("xlist_course")

  private CourseAttributes xlistCourse = null;
  public SectionAttributes id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The unique identifier for the section.
  * @return id
  **/
  @Schema(example = "1", description = "The unique identifier for the section.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public SectionAttributes integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  

  /**
  * Optional: The integration ID of the section.
  * @return integrationId
  **/
  @Schema(example = "3452342345", description = "Optional: The integration ID of the section.")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }
  public SectionAttributes name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The name of the section.
  * @return name
  **/
  @Schema(example = "Section A", description = "The name of the section.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public SectionAttributes originCourse(CourseAttributes originCourse) {
    this.originCourse = originCourse;
    return this;
  }

  

  /**
  * Get originCourse
  * @return originCourse
  **/
  @Schema(description = "")
  public CourseAttributes getOriginCourse() {
    return originCourse;
  }
  public void setOriginCourse(CourseAttributes originCourse) {
    this.originCourse = originCourse;
  }
  public SectionAttributes override(SectionAssignmentOverrideAttributes override) {
    this.override = override;
    return this;
  }

  

  /**
  * Get override
  * @return override
  **/
  @Schema(description = "")
  public SectionAssignmentOverrideAttributes getOverride() {
    return override;
  }
  public void setOverride(SectionAssignmentOverrideAttributes override) {
    this.override = override;
  }
  public SectionAttributes sisId(String sisId) {
    this.sisId = sisId;
    return this;
  }

  

  /**
  * The sis id of the section.
  * @return sisId
  **/
  @Schema(example = "s34643", description = "The sis id of the section.")
  public String getSisId() {
    return sisId;
  }
  public void setSisId(String sisId) {
    this.sisId = sisId;
  }
  public SectionAttributes xlistCourse(CourseAttributes xlistCourse) {
    this.xlistCourse = xlistCourse;
    return this;
  }

  

  /**
  * Get xlistCourse
  * @return xlistCourse
  **/
  @Schema(description = "")
  public CourseAttributes getXlistCourse() {
    return xlistCourse;
  }
  public void setXlistCourse(CourseAttributes xlistCourse) {
    this.xlistCourse = xlistCourse;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionAttributes sectionAttributes = (SectionAttributes) o;
    return Objects.equals(this.id, sectionAttributes.id) &&
        Objects.equals(this.integrationId, sectionAttributes.integrationId) &&
        Objects.equals(this.name, sectionAttributes.name) &&
        Objects.equals(this.originCourse, sectionAttributes.originCourse) &&
        Objects.equals(this.override, sectionAttributes.override) &&
        Objects.equals(this.sisId, sectionAttributes.sisId) &&
        Objects.equals(this.xlistCourse, sectionAttributes.xlistCourse);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, integrationId, name, originCourse, override, sisId, xlistCourse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originCourse: ").append(toIndentedString(originCourse)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    xlistCourse: ").append(toIndentedString(xlistCourse)).append("\n");
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
