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
 * Collaboration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Collaboration {

  @JsonProperty("collaboration_type")

  private String collaborationType = null;

  @JsonProperty("context_id")

  private Integer contextId = null;

  @JsonProperty("context_type")

  private String contextType = null;

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("document_id")

  private String documentId = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("title")

  private String title = null;

  @JsonProperty("type")

  private String type = null;

  @JsonProperty("update_url")

  private String updateUrl = null;

  @JsonProperty("updated_at")

  private OffsetDateTime updatedAt = null;

  @JsonProperty("url")

  private String url = null;

  @JsonProperty("user_id")

  private Integer userId = null;

  @JsonProperty("user_name")

  private String userName = null;
  public Collaboration collaborationType(String collaborationType) {
    this.collaborationType = collaborationType;
    return this;
  }

  

  /**
  * A name for the type of collaboration
  * @return collaborationType
  **/
  @Schema(example = "Microsoft Office", description = "A name for the type of collaboration")
  public String getCollaborationType() {
    return collaborationType;
  }
  public void setCollaborationType(String collaborationType) {
    this.collaborationType = collaborationType;
  }
  public Collaboration contextId(Integer contextId) {
    this.contextId = contextId;
    return this;
  }

  

  /**
  * The canvas id of the course or group to which the collaboration belongs
  * @return contextId
  **/
  @Schema(example = "77", description = "The canvas id of the course or group to which the collaboration belongs")
  public Integer getContextId() {
    return contextId;
  }
  public void setContextId(Integer contextId) {
    this.contextId = contextId;
  }
  public Collaboration contextType(String contextType) {
    this.contextType = contextType;
    return this;
  }

  

  /**
  * The canvas type of the course or group to which the collaboration belongs
  * @return contextType
  **/
  @Schema(example = "Course", description = "The canvas type of the course or group to which the collaboration belongs")
  public String getContextType() {
    return contextType;
  }
  public void setContextType(String contextType) {
    this.contextType = contextType;
  }
  public Collaboration createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * The timestamp when the collaboration was created
  * @return createdAt
  **/
  @Schema(description = "The timestamp when the collaboration was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public Collaboration description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Get description
  * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Collaboration documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  

  /**
  * The collaboration document identifier for the collaboration provider
  * @return documentId
  **/
  @Schema(example = "oinwoenfe8w8ef_onweufe89fef", description = "The collaboration document identifier for the collaboration provider")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }
  public Collaboration id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The unique identifier for the collaboration
  * @return id
  **/
  @Schema(example = "43", description = "The unique identifier for the collaboration")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Collaboration title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * Get title
  * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public Collaboration type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * Another representation of the collaboration type
  * @return type
  **/
  @Schema(example = "ExternalToolCollaboration", description = "Another representation of the collaboration type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Collaboration updateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
    return this;
  }

  

  /**
  * The LTI launch url to edit the collaboration
  * @return updateUrl
  **/
  @Schema(description = "The LTI launch url to edit the collaboration")
  public String getUpdateUrl() {
    return updateUrl;
  }
  public void setUpdateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
  }
  public Collaboration updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  /**
  * The timestamp when the collaboration was last modified
  * @return updatedAt
  **/
  @Schema(description = "The timestamp when the collaboration was last modified")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public Collaboration url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * The LTI launch url to view collaboration.
  * @return url
  **/
  @Schema(description = "The LTI launch url to view collaboration.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public Collaboration userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  

  /**
  * The canvas id of the user who created the collaboration
  * @return userId
  **/
  @Schema(example = "92", description = "The canvas id of the user who created the collaboration")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public Collaboration userName(String userName) {
    this.userName = userName;
    return this;
  }

  

  /**
  * The name of the user who owns the collaboration
  * @return userName
  **/
  @Schema(example = "John Danger", description = "The name of the user who owns the collaboration")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collaboration collaboration = (Collaboration) o;
    return Objects.equals(this.collaborationType, collaboration.collaborationType) &&
        Objects.equals(this.contextId, collaboration.contextId) &&
        Objects.equals(this.contextType, collaboration.contextType) &&
        Objects.equals(this.createdAt, collaboration.createdAt) &&
        Objects.equals(this.description, collaboration.description) &&
        Objects.equals(this.documentId, collaboration.documentId) &&
        Objects.equals(this.id, collaboration.id) &&
        Objects.equals(this.title, collaboration.title) &&
        Objects.equals(this.type, collaboration.type) &&
        Objects.equals(this.updateUrl, collaboration.updateUrl) &&
        Objects.equals(this.updatedAt, collaboration.updatedAt) &&
        Objects.equals(this.url, collaboration.url) &&
        Objects.equals(this.userId, collaboration.userId) &&
        Objects.equals(this.userName, collaboration.userName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(collaborationType, contextId, contextType, createdAt, description, documentId, id, title, type, updateUrl, updatedAt, url, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collaboration {\n");
    
    sb.append("    collaborationType: ").append(toIndentedString(collaborationType)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateUrl: ").append(toIndentedString(updateUrl)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
