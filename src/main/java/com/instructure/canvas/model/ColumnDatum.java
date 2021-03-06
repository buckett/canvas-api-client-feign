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
 * ColumnDatum objects contain the entry for a column for each user.
 */
@Schema(description = "ColumnDatum objects contain the entry for a column for each user.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class ColumnDatum {

  @JsonProperty("content")

  private String content = null;

  @JsonProperty("user_id")

  private Integer userId = null;
  public ColumnDatum content(String content) {
    this.content = content;
    return this;
  }

  

  /**
  * Get content
  * @return content
  **/
  @Schema(example = "Nut allergy", description = "")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public ColumnDatum userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * Get userId
  * @return userId
  **/
  @Schema(example = "2", description = "")
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
    ColumnDatum columnDatum = (ColumnDatum) o;
    return Objects.equals(this.content, columnDatum.content) &&
        Objects.equals(this.userId, columnDatum.userId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(content, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnDatum {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
