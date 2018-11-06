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
import org.threeten.bp.OffsetDateTime;

/**
 * A Canvas assignment
 */
@Schema(description = "A Canvas assignment")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class LtiAssignment {

  @JsonProperty("course_id")

  private Integer courseId = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("due_at")

  private OffsetDateTime dueAt = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("lti_course_id")

  private String ltiCourseId = null;

  @JsonProperty("lti_id")

  private String ltiId = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("points_possible")

  private Integer pointsPossible = null;
  public LtiAssignment courseId(Integer courseId) {
    this.courseId = courseId;
    return this;
  }

  

  /**
  * Get courseId
  * @return courseId
  **/
  @Schema(example = "10000000000060", description = "")
  public Integer getCourseId() {
    return courseId;
  }
  public void setCourseId(Integer courseId) {
    this.courseId = courseId;
  }
  public LtiAssignment description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Get description
  * @return description
  **/
  @Schema(example = "<p>Do the following:</p>...", description = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public LtiAssignment dueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
    return this;
  }

  

  /**
  * The due date for the assignment. If a user id is supplied and an assignment override is in place this field will reflect the due date as it applies to the user.
  * @return dueAt
  **/
  @Schema(description = "The due date for the assignment. If a user id is supplied and an assignment override is in place this field will reflect the due date as it applies to the user.")
  public OffsetDateTime getDueAt() {
    return dueAt;
  }
  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }
  public LtiAssignment id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "4", description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public LtiAssignment ltiCourseId(String ltiCourseId) {
    this.ltiCourseId = ltiCourseId;
    return this;
  }

  

  /**
  * Get ltiCourseId
  * @return ltiCourseId
  **/
  @Schema(example = "66157096483e6b3a50bfedc6bac902c0b20a8241", description = "")
  public String getLtiCourseId() {
    return ltiCourseId;
  }
  public void setLtiCourseId(String ltiCourseId) {
    this.ltiCourseId = ltiCourseId;
  }
  public LtiAssignment ltiId(String ltiId) {
    this.ltiId = ltiId;
    return this;
  }

  

  /**
  * Get ltiId
  * @return ltiId
  **/
  @Schema(example = "86157096483e6b3a50bfedc6bac902c0b20a824f", description = "")
  public String getLtiId() {
    return ltiId;
  }
  public void setLtiId(String ltiId) {
    this.ltiId = ltiId;
  }
  public LtiAssignment name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(example = "Midterm Review", description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public LtiAssignment pointsPossible(Integer pointsPossible) {
    this.pointsPossible = pointsPossible;
    return this;
  }

  

  /**
  * Get pointsPossible
  * @return pointsPossible
  **/
  @Schema(example = "10", description = "")
  public Integer getPointsPossible() {
    return pointsPossible;
  }
  public void setPointsPossible(Integer pointsPossible) {
    this.pointsPossible = pointsPossible;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtiAssignment ltiAssignment = (LtiAssignment) o;
    return Objects.equals(this.courseId, ltiAssignment.courseId) &&
        Objects.equals(this.description, ltiAssignment.description) &&
        Objects.equals(this.dueAt, ltiAssignment.dueAt) &&
        Objects.equals(this.id, ltiAssignment.id) &&
        Objects.equals(this.ltiCourseId, ltiAssignment.ltiCourseId) &&
        Objects.equals(this.ltiId, ltiAssignment.ltiId) &&
        Objects.equals(this.name, ltiAssignment.name) &&
        Objects.equals(this.pointsPossible, ltiAssignment.pointsPossible);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(courseId, description, dueAt, id, ltiCourseId, ltiId, name, pointsPossible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtiAssignment {\n");
    
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ltiCourseId: ").append(toIndentedString(ltiCourseId)).append("\n");
    sb.append("    ltiId: ").append(toIndentedString(ltiId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pointsPossible: ").append(toIndentedString(pointsPossible)).append("\n");
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