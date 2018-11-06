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
 * GradeChangeEventLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class GradeChangeEventLinks {

  @JsonProperty("assignment")

  private Integer assignment = null;

  @JsonProperty("course")

  private Integer course = null;

  @JsonProperty("grader")

  private Integer grader = null;

  @JsonProperty("page_view")

  private String pageView = null;

  @JsonProperty("student")

  private Integer student = null;
  public GradeChangeEventLinks assignment(Integer assignment) {
    this.assignment = assignment;
    return this;
  }

  

  /**
  * ID of the assignment associated with the event
  * @return assignment
  **/
  @Schema(example = "2319", description = "ID of the assignment associated with the event")
  public Integer getAssignment() {
    return assignment;
  }
  public void setAssignment(Integer assignment) {
    this.assignment = assignment;
  }
  public GradeChangeEventLinks course(Integer course) {
    this.course = course;
    return this;
  }

  

  /**
  * ID of the course associated with the event. will match the context_id in the associated assignment if the context type for the assignment is a course
  * @return course
  **/
  @Schema(example = "2319", description = "ID of the course associated with the event. will match the context_id in the associated assignment if the context type for the assignment is a course")
  public Integer getCourse() {
    return course;
  }
  public void setCourse(Integer course) {
    this.course = course;
  }
  public GradeChangeEventLinks grader(Integer grader) {
    this.grader = grader;
    return this;
  }

  

  /**
  * ID of the grader associated with the event. will match the grader_id in the associated submission.
  * @return grader
  **/
  @Schema(example = "2319", description = "ID of the grader associated with the event. will match the grader_id in the associated submission.")
  public Integer getGrader() {
    return grader;
  }
  public void setGrader(Integer grader) {
    this.grader = grader;
  }
  public GradeChangeEventLinks pageView(String pageView) {
    this.pageView = pageView;
    return this;
  }

  

  /**
  * ID of the page view during the event if it exists.
  * @return pageView
  **/
  @Schema(example = "e2b76430-27a5-0131-3ca1-48e0eb13f29b", description = "ID of the page view during the event if it exists.")
  public String getPageView() {
    return pageView;
  }
  public void setPageView(String pageView) {
    this.pageView = pageView;
  }
  public GradeChangeEventLinks student(Integer student) {
    this.student = student;
    return this;
  }

  

  /**
  * ID of the student associated with the event. will match the user_id in the associated submission.
  * @return student
  **/
  @Schema(example = "2319", description = "ID of the student associated with the event. will match the user_id in the associated submission.")
  public Integer getStudent() {
    return student;
  }
  public void setStudent(Integer student) {
    this.student = student;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradeChangeEventLinks gradeChangeEventLinks = (GradeChangeEventLinks) o;
    return Objects.equals(this.assignment, gradeChangeEventLinks.assignment) &&
        Objects.equals(this.course, gradeChangeEventLinks.course) &&
        Objects.equals(this.grader, gradeChangeEventLinks.grader) &&
        Objects.equals(this.pageView, gradeChangeEventLinks.pageView) &&
        Objects.equals(this.student, gradeChangeEventLinks.student);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(assignment, course, grader, pageView, student);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradeChangeEventLinks {\n");
    
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    grader: ").append(toIndentedString(grader)).append("\n");
    sb.append("    pageView: ").append(toIndentedString(pageView)).append("\n");
    sb.append("    student: ").append(toIndentedString(student)).append("\n");
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
