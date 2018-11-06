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
 * Attributes of student.  See Users API for more details
 */
@Schema(description = "Attributes of student.  See Users API for more details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class StudentAttributes {

  @JsonProperty("sis_user_id")

  private String sisUserId = null;

  @JsonProperty("user_id")

  private Integer userId = null;
  public StudentAttributes sisUserId(String sisUserId) {
    this.sisUserId = sisUserId;
    return this;
  }

  

  /**
  * The SIS ID associated with the user.  This field is only included if the user came from a SIS import and has permissions to view SIS information.
  * @return sisUserId
  **/
  @Schema(example = "SHEL93921", description = "The SIS ID associated with the user.  This field is only included if the user came from a SIS import and has permissions to view SIS information.")
  public String getSisUserId() {
    return sisUserId;
  }
  public void setSisUserId(String sisUserId) {
    this.sisUserId = sisUserId;
  }
  public StudentAttributes userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * The unique Canvas identifier for the user
  * @return userId
  **/
  @Schema(example = "511", description = "The unique Canvas identifier for the user")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentAttributes studentAttributes = (StudentAttributes) o;
    return Objects.equals(this.sisUserId, studentAttributes.sisUserId) &&
        Objects.equals(this.userId, studentAttributes.userId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(sisUserId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentAttributes {\n");
    
    sb.append("    sisUserId: ").append(toIndentedString(sisUserId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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