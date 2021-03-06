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
import java.util.ArrayList;
import java.util.List;

/**
 * HelpLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class HelpLink {

  @JsonProperty("available_to")

  private List<String> availableTo = null;

  @JsonProperty("id")

  private String id = null;

  @JsonProperty("subtext")

  private String subtext = null;

  @JsonProperty("text")

  private String text = null;
  /**
   * The type of the help link
   */
  public enum TypeEnum {
    DEFAULT("default"),
    CUSTOM("custom");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("type")

  private TypeEnum type = null;

  @JsonProperty("url")

  private String url = null;
  public HelpLink availableTo(List<String> availableTo) {
    this.availableTo = availableTo;
    return this;
  }

  public HelpLink addAvailableToItem(String availableToItem) {
    if (this.availableTo == null) {
      this.availableTo = new ArrayList<String>();
    }
    this.availableTo.add(availableToItem);
    return this;
  }

  /**
  * The roles that have access to this help link
  * @return availableTo
  **/
  @Schema(example = "[user, student, teacher, admin, observer, unenrolled]", description = "The roles that have access to this help link")
  public List<String> getAvailableTo() {
    return availableTo;
  }
  public void setAvailableTo(List<String> availableTo) {
    this.availableTo = availableTo;
  }
  public HelpLink id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of the help link
  * @return id
  **/
  @Schema(example = "instructor_question", description = "The ID of the help link")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public HelpLink subtext(String subtext) {
    this.subtext = subtext;
    return this;
  }

  

  /**
  * The description of the help link
  * @return subtext
  **/
  @Schema(example = "Questions are submitted to your instructor", description = "The description of the help link")
  public String getSubtext() {
    return subtext;
  }
  public void setSubtext(String subtext) {
    this.subtext = subtext;
  }
  public HelpLink text(String text) {
    this.text = text;
    return this;
  }

  

  /**
  * The name of the help link
  * @return text
  **/
  @Schema(example = "Ask Your Instructor a Question", description = "The name of the help link")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public HelpLink type(TypeEnum type) {
    this.type = type;
    return this;
  }

  

  /**
  * The type of the help link
  * @return type
  **/
  @Schema(example = "default", description = "The type of the help link")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public HelpLink url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * The URL of the help link
  * @return url
  **/
  @Schema(example = "#teacher_feedback", description = "The URL of the help link")
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
    HelpLink helpLink = (HelpLink) o;
    return Objects.equals(this.availableTo, helpLink.availableTo) &&
        Objects.equals(this.id, helpLink.id) &&
        Objects.equals(this.subtext, helpLink.subtext) &&
        Objects.equals(this.text, helpLink.text) &&
        Objects.equals(this.type, helpLink.type) &&
        Objects.equals(this.url, helpLink.url);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(availableTo, id, subtext, text, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpLink {\n");
    
    sb.append("    availableTo: ").append(toIndentedString(availableTo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subtext: ").append(toIndentedString(subtext)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
