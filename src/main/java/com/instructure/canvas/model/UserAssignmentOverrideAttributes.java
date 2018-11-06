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
import com.instructure.canvas.model.StudentAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Attributes of assignment overrides that apply to users.  See Assignments API for more details
 */
@Schema(description = "Attributes of assignment overrides that apply to users.  See Assignments API for more details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class UserAssignmentOverrideAttributes {

  @JsonProperty("due_at")

  private OffsetDateTime dueAt = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("lock_at")

  private OffsetDateTime lockAt = null;

  @JsonProperty("students")

  private List<StudentAttributes> students = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("unlock_at")

  private OffsetDateTime unlockAt = null;
  public UserAssignmentOverrideAttributes dueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
    return this;
  }

  

  /**
  * The time at which this assignment is due
  * @return dueAt
  **/
  @Schema(description = "The time at which this assignment is due")
  public OffsetDateTime getDueAt() {
    return dueAt;
  }
  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }
  public UserAssignmentOverrideAttributes id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The unique Canvas identifier for the assignment override
  * @return id
  **/
  @Schema(example = "218", description = "The unique Canvas identifier for the assignment override")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public UserAssignmentOverrideAttributes lockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
    return this;
  }

  

  /**
  * (Optional) Time at which this was/will be locked.
  * @return lockAt
  **/
  @Schema(description = "(Optional) Time at which this was/will be locked.")
  public OffsetDateTime getLockAt() {
    return lockAt;
  }
  public void setLockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
  }
  public UserAssignmentOverrideAttributes students(List<StudentAttributes> students) {
    this.students = students;
    return this;
  }

  public UserAssignmentOverrideAttributes addStudentsItem(StudentAttributes studentsItem) {
    if (this.students == null) {
      this.students = new ArrayList<StudentAttributes>();
    }
    this.students.add(studentsItem);
    return this;
  }

  /**
  * Includes attributes of a student for convenience. For more details see Users API.
  * @return students
  **/
  @Schema(description = "Includes attributes of a student for convenience. For more details see Users API.")
  public List<StudentAttributes> getStudents() {
    return students;
  }
  public void setStudents(List<StudentAttributes> students) {
    this.students = students;
  }
  public UserAssignmentOverrideAttributes title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * The title of the assignment override.
  * @return title
  **/
  @Schema(example = "Override title", description = "The title of the assignment override.")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public UserAssignmentOverrideAttributes unlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
    return this;
  }

  

  /**
  * (Optional) Time at which this was/will be unlocked.
  * @return unlockAt
  **/
  @Schema(description = "(Optional) Time at which this was/will be unlocked.")
  public OffsetDateTime getUnlockAt() {
    return unlockAt;
  }
  public void setUnlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAssignmentOverrideAttributes userAssignmentOverrideAttributes = (UserAssignmentOverrideAttributes) o;
    return Objects.equals(this.dueAt, userAssignmentOverrideAttributes.dueAt) &&
        Objects.equals(this.id, userAssignmentOverrideAttributes.id) &&
        Objects.equals(this.lockAt, userAssignmentOverrideAttributes.lockAt) &&
        Objects.equals(this.students, userAssignmentOverrideAttributes.students) &&
        Objects.equals(this.title, userAssignmentOverrideAttributes.title) &&
        Objects.equals(this.unlockAt, userAssignmentOverrideAttributes.unlockAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(dueAt, id, lockAt, students, title, unlockAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssignmentOverrideAttributes {\n");
    
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
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
