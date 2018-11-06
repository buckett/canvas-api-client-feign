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
 * Tab
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Tab {

  @JsonProperty("hidden")

  private Boolean hidden = null;

  @JsonProperty("html_url")

  private String htmlUrl = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("label")

  private String label = null;

  @JsonProperty("position")

  private Integer position = null;

  @JsonProperty("type")

  private String type = null;

  @JsonProperty("visibility")

  private String visibility = null;
  public Tab hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  

  /**
  * only included if true
  * @return hidden
  **/
  @Schema(example = "true", description = "only included if true")
  public Boolean isHidden() {
    return hidden;
  }
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }
  public Tab htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  

  /**
  * Get htmlUrl
  * @return htmlUrl
  **/
  @Schema(example = "/courses/1/external_tools/4", description = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }
  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }
  public Tab id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "context_external_tool_4", description = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public Tab label(String label) {
    this.label = label;
    return this;
  }

  

  /**
  * Get label
  * @return label
  **/
  @Schema(example = "WordPress", description = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public Tab position(Integer position) {
    this.position = position;
    return this;
  }

  

  /**
  * 1 based
  * @return position
  **/
  @Schema(example = "2", description = "1 based")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }
  public Tab type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(example = "external", description = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Tab visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  

  /**
  * possible values are: public, members, admins, and none
  * @return visibility
  **/
  @Schema(example = "public", description = "possible values are: public, members, admins, and none")
  public String getVisibility() {
    return visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tab tab = (Tab) o;
    return Objects.equals(this.hidden, tab.hidden) &&
        Objects.equals(this.htmlUrl, tab.htmlUrl) &&
        Objects.equals(this.id, tab.id) &&
        Objects.equals(this.label, tab.label) &&
        Objects.equals(this.position, tab.position) &&
        Objects.equals(this.type, tab.type) &&
        Objects.equals(this.visibility, tab.visibility);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(hidden, htmlUrl, id, label, position, type, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tab {\n");
    
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
