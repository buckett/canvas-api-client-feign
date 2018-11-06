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
 * Bookmark
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Bookmark {

  @JsonProperty("data")

  private Object data = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("position")

  private Integer position = null;

  @JsonProperty("url")

  private String url = null;
  public Bookmark data(Object data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(example = "{\"active_tab\":1}", description = "")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  public Bookmark id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "1", description = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Bookmark name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(example = "Biology 101", description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Bookmark position(Integer position) {
    this.position = position;
    return this;
  }

  

  /**
  * Get position
  * @return position
  **/
  @Schema(example = "1", description = "")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }
  public Bookmark url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * Get url
  * @return url
  **/
  @Schema(example = "/courses/1", description = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bookmark bookmark = (Bookmark) o;
    return Objects.equals(this.data, bookmark.data) &&
        Objects.equals(this.id, bookmark.id) &&
        Objects.equals(this.name, bookmark.name) &&
        Objects.equals(this.position, bookmark.position) &&
        Objects.equals(this.url, bookmark.url);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, id, name, position, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bookmark {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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