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
 * OutcomeRollupLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class OutcomeRollupLinks {

  @JsonProperty("course")

  private Integer course = null;

  @JsonProperty("section")

  private Integer section = null;

  @JsonProperty("user")

  private Integer user = null;
  public OutcomeRollupLinks course(Integer course) {
    this.course = course;
    return this;
  }

  

  /**
  * If an aggregate result was requested, the course field will be present. Otherwise, the user and section field will be present (Optional) The id of the course that this rollup applies to
  * @return course
  **/
  @Schema(example = "42", description = "If an aggregate result was requested, the course field will be present. Otherwise, the user and section field will be present (Optional) The id of the course that this rollup applies to")
  public Integer getCourse() {
    return course;
  }
  public void setCourse(Integer course) {
    this.course = course;
  }
  public OutcomeRollupLinks section(Integer section) {
    this.section = section;
    return this;
  }

  

  /**
  * (Optional) The id of the section the user is in
  * @return section
  **/
  @Schema(example = "57", description = "(Optional) The id of the section the user is in")
  public Integer getSection() {
    return section;
  }
  public void setSection(Integer section) {
    this.section = section;
  }
  public OutcomeRollupLinks user(Integer user) {
    this.user = user;
    return this;
  }

  

  /**
  * (Optional) The id of the user that this rollup applies to
  * @return user
  **/
  @Schema(example = "42", description = "(Optional) The id of the user that this rollup applies to")
  public Integer getUser() {
    return user;
  }
  public void setUser(Integer user) {
    this.user = user;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeRollupLinks outcomeRollupLinks = (OutcomeRollupLinks) o;
    return Objects.equals(this.course, outcomeRollupLinks.course) &&
        Objects.equals(this.section, outcomeRollupLinks.section) &&
        Objects.equals(this.user, outcomeRollupLinks.user);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(course, section, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeRollupLinks {\n");
    
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
