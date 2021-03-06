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
 * MigrationIssue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class MigrationIssue {

  @JsonProperty("content_migration_url")

  private String contentMigrationUrl = null;

  @JsonProperty("created_at")

  private OffsetDateTime createdAt = null;

  @JsonProperty("description")

  private String description = null;

  @JsonProperty("error_message")

  private String errorMessage = null;

  @JsonProperty("error_report_html_url")

  private String errorReportHtmlUrl = null;

  @JsonProperty("fix_issue_html_url")

  private String fixIssueHtmlUrl = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("issue_type")

  private String issueType = null;

  @JsonProperty("updated_at")

  private OffsetDateTime updatedAt = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public MigrationIssue contentMigrationUrl(String contentMigrationUrl) {
    this.contentMigrationUrl = contentMigrationUrl;
    return this;
  }

  

  /**
  * API url to the content migration
  * @return contentMigrationUrl
  **/
  @Schema(example = "https://example.com/api/v1/courses/1/content_migrations/1", description = "API url to the content migration")
  public String getContentMigrationUrl() {
    return contentMigrationUrl;
  }
  public void setContentMigrationUrl(String contentMigrationUrl) {
    this.contentMigrationUrl = contentMigrationUrl;
  }
  public MigrationIssue createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  

  /**
  * timestamp
  * @return createdAt
  **/
  @Schema(description = "timestamp")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public MigrationIssue description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Description of the issue for the end-user
  * @return description
  **/
  @Schema(example = "Questions in this quiz couldn't be converted", description = "Description of the issue for the end-user")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public MigrationIssue errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  

  /**
  * Site administrator error message (If the requesting user has permissions)
  * @return errorMessage
  **/
  @Schema(example = "admin only message", description = "Site administrator error message (If the requesting user has permissions)")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  public MigrationIssue errorReportHtmlUrl(String errorReportHtmlUrl) {
    this.errorReportHtmlUrl = errorReportHtmlUrl;
    return this;
  }

  

  /**
  * Link to a Canvas error report if present (If the requesting user has permissions)
  * @return errorReportHtmlUrl
  **/
  @Schema(example = "https://example.com/error_reports/3", description = "Link to a Canvas error report if present (If the requesting user has permissions)")
  public String getErrorReportHtmlUrl() {
    return errorReportHtmlUrl;
  }
  public void setErrorReportHtmlUrl(String errorReportHtmlUrl) {
    this.errorReportHtmlUrl = errorReportHtmlUrl;
  }
  public MigrationIssue fixIssueHtmlUrl(String fixIssueHtmlUrl) {
    this.fixIssueHtmlUrl = fixIssueHtmlUrl;
    return this;
  }

  

  /**
  * HTML Url to the Canvas page to investigate the issue
  * @return fixIssueHtmlUrl
  **/
  @Schema(example = "https://example.com/courses/1/quizzes/2", description = "HTML Url to the Canvas page to investigate the issue")
  public String getFixIssueHtmlUrl() {
    return fixIssueHtmlUrl;
  }
  public void setFixIssueHtmlUrl(String fixIssueHtmlUrl) {
    this.fixIssueHtmlUrl = fixIssueHtmlUrl;
  }
  public MigrationIssue id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the unique identifier for the issue
  * @return id
  **/
  @Schema(example = "370663", description = "the unique identifier for the issue")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public MigrationIssue issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

  

  /**
  * Severity of the issue: todo, warning, error
  * @return issueType
  **/
  @Schema(example = "warning", description = "Severity of the issue: todo, warning, error")
  public String getIssueType() {
    return issueType;
  }
  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }
  public MigrationIssue updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  

  /**
  * timestamp
  * @return updatedAt
  **/
  @Schema(description = "timestamp")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public MigrationIssue workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * Current state of the issue: active, resolved
  * @return workflowState
  **/
  @Schema(example = "active", description = "Current state of the issue: active, resolved")
  public String getWorkflowState() {
    return workflowState;
  }
  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationIssue migrationIssue = (MigrationIssue) o;
    return Objects.equals(this.contentMigrationUrl, migrationIssue.contentMigrationUrl) &&
        Objects.equals(this.createdAt, migrationIssue.createdAt) &&
        Objects.equals(this.description, migrationIssue.description) &&
        Objects.equals(this.errorMessage, migrationIssue.errorMessage) &&
        Objects.equals(this.errorReportHtmlUrl, migrationIssue.errorReportHtmlUrl) &&
        Objects.equals(this.fixIssueHtmlUrl, migrationIssue.fixIssueHtmlUrl) &&
        Objects.equals(this.id, migrationIssue.id) &&
        Objects.equals(this.issueType, migrationIssue.issueType) &&
        Objects.equals(this.updatedAt, migrationIssue.updatedAt) &&
        Objects.equals(this.workflowState, migrationIssue.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(contentMigrationUrl, createdAt, description, errorMessage, errorReportHtmlUrl, fixIssueHtmlUrl, id, issueType, updatedAt, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationIssue {\n");
    
    sb.append("    contentMigrationUrl: ").append(toIndentedString(contentMigrationUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorReportHtmlUrl: ").append(toIndentedString(errorReportHtmlUrl)).append("\n");
    sb.append("    fixIssueHtmlUrl: ").append(toIndentedString(fixIssueHtmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowState: ").append(toIndentedString(workflowState)).append("\n");
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
