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
 * Possible avatar for a user.
 */
@Schema(description = "Possible avatar for a user.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Avatar {

  @JsonProperty("content-type")

  private String contentType = null;

  @JsonProperty("display_name")

  private String displayName = null;

  @JsonProperty("filename")

  private String filename = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("size")

  private Integer size = null;

  @JsonProperty("token")

  private String token = null;

  @JsonProperty("type")

  private String type = null;

  @JsonProperty("url")

  private String url = null;
  public Avatar contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  

  /**
  * [&#x27;attachment&#x27; type only] the content-type of the attachment.
  * @return contentType
  **/
  @Schema(example = "image/jpeg", description = "['attachment' type only] the content-type of the attachment.")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }
  public Avatar displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  

  /**
  * A textual description of the avatar record.
  * @return displayName
  **/
  @Schema(example = "user, sample", required = true, description = "A textual description of the avatar record.")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public Avatar filename(String filename) {
    this.filename = filename;
    return this;
  }

  

  /**
  * [&#x27;attachment&#x27; type only] the filename of the attachment
  * @return filename
  **/
  @Schema(example = "profile.jpg", description = "['attachment' type only] the filename of the attachment")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }
  public Avatar id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * [&#x27;attachment&#x27; type only] the internal id of the attachment
  * @return id
  **/
  @Schema(example = "12", description = "['attachment' type only] the internal id of the attachment")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Avatar size(Integer size) {
    this.size = size;
    return this;
  }

  

  /**
  * [&#x27;attachment&#x27; type only] the size of the attachment
  * @return size
  **/
  @Schema(example = "32649", description = "['attachment' type only] the size of the attachment")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }
  public Avatar token(String token) {
    this.token = token;
    return this;
  }

  

  /**
  * A unique representation of the avatar record which can be used to set the avatar with the user update endpoint. Note: this is an internal representation and is subject to change without notice. It should be consumed with this api endpoint and used in the user update endpoint, and should not be constructed by the client.
  * @return token
  **/
  @Schema(example = "<opaque_token>", required = true, description = "A unique representation of the avatar record which can be used to set the avatar with the user update endpoint. Note: this is an internal representation and is subject to change without notice. It should be consumed with this api endpoint and used in the user update endpoint, and should not be constructed by the client.")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  public Avatar type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * [&#x27;gravatar&#x27;|&#x27;attachment&#x27;|&#x27;no_pic&#x27;] The type of avatar record, for categorization purposes.
  * @return type
  **/
  @Schema(example = "gravatar", required = true, description = "['gravatar'|'attachment'|'no_pic'] The type of avatar record, for categorization purposes.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Avatar url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * The url of the avatar
  * @return url
  **/
  @Schema(example = "https://secure.gravatar.com/avatar/2284...", required = true, description = "The url of the avatar")
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
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.contentType, avatar.contentType) &&
        Objects.equals(this.displayName, avatar.displayName) &&
        Objects.equals(this.filename, avatar.filename) &&
        Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.size, avatar.size) &&
        Objects.equals(this.token, avatar.token) &&
        Objects.equals(this.type, avatar.type) &&
        Objects.equals(this.url, avatar.url);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(contentType, displayName, filename, id, size, token, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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