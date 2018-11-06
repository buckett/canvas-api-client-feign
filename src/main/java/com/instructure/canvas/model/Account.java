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
 * Account
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Account {

  @JsonProperty("default_group_storage_quota_mb")

  private Integer defaultGroupStorageQuotaMb = null;

  @JsonProperty("default_storage_quota_mb")

  private Integer defaultStorageQuotaMb = null;

  @JsonProperty("default_time_zone")

  private String defaultTimeZone = null;

  @JsonProperty("default_user_storage_quota_mb")

  private Integer defaultUserStorageQuotaMb = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("integration_id")

  private String integrationId = null;

  @JsonProperty("lti_guid")

  private String ltiGuid = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("parent_account_id")

  private Integer parentAccountId = null;

  @JsonProperty("root_account_id")

  private Integer rootAccountId = null;

  @JsonProperty("sis_account_id")

  private String sisAccountId = null;

  @JsonProperty("sis_import_id")

  private Integer sisImportId = null;

  @JsonProperty("uuid")

  private String uuid = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public Account defaultGroupStorageQuotaMb(Integer defaultGroupStorageQuotaMb) {
    this.defaultGroupStorageQuotaMb = defaultGroupStorageQuotaMb;
    return this;
  }

  

  /**
  * The storage quota for a group in the account in megabytes, if not otherwise specified
  * @return defaultGroupStorageQuotaMb
  **/
  @Schema(example = "50", description = "The storage quota for a group in the account in megabytes, if not otherwise specified")
  public Integer getDefaultGroupStorageQuotaMb() {
    return defaultGroupStorageQuotaMb;
  }
  public void setDefaultGroupStorageQuotaMb(Integer defaultGroupStorageQuotaMb) {
    this.defaultGroupStorageQuotaMb = defaultGroupStorageQuotaMb;
  }
  public Account defaultStorageQuotaMb(Integer defaultStorageQuotaMb) {
    this.defaultStorageQuotaMb = defaultStorageQuotaMb;
    return this;
  }

  

  /**
  * The storage quota for the account in megabytes, if not otherwise specified
  * @return defaultStorageQuotaMb
  **/
  @Schema(example = "500", description = "The storage quota for the account in megabytes, if not otherwise specified")
  public Integer getDefaultStorageQuotaMb() {
    return defaultStorageQuotaMb;
  }
  public void setDefaultStorageQuotaMb(Integer defaultStorageQuotaMb) {
    this.defaultStorageQuotaMb = defaultStorageQuotaMb;
  }
  public Account defaultTimeZone(String defaultTimeZone) {
    this.defaultTimeZone = defaultTimeZone;
    return this;
  }

  

  /**
  * The default time zone of the account. Allowed time zones are {http://www.iana.org/time-zones IANA time zones} or friendlier {http://api.rubyonrails.org/classes/ActiveSupport/TimeZone.html Ruby on Rails time zones}.
  * @return defaultTimeZone
  **/
  @Schema(example = "America/Denver", description = "The default time zone of the account. Allowed time zones are {http://www.iana.org/time-zones IANA time zones} or friendlier {http://api.rubyonrails.org/classes/ActiveSupport/TimeZone.html Ruby on Rails time zones}.")
  public String getDefaultTimeZone() {
    return defaultTimeZone;
  }
  public void setDefaultTimeZone(String defaultTimeZone) {
    this.defaultTimeZone = defaultTimeZone;
  }
  public Account defaultUserStorageQuotaMb(Integer defaultUserStorageQuotaMb) {
    this.defaultUserStorageQuotaMb = defaultUserStorageQuotaMb;
    return this;
  }

  

  /**
  * The storage quota for a user in the account in megabytes, if not otherwise specified
  * @return defaultUserStorageQuotaMb
  **/
  @Schema(example = "50", description = "The storage quota for a user in the account in megabytes, if not otherwise specified")
  public Integer getDefaultUserStorageQuotaMb() {
    return defaultUserStorageQuotaMb;
  }
  public void setDefaultUserStorageQuotaMb(Integer defaultUserStorageQuotaMb) {
    this.defaultUserStorageQuotaMb = defaultUserStorageQuotaMb;
  }
  public Account id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the ID of the Account object
  * @return id
  **/
  @Schema(example = "2", description = "the ID of the Account object")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Account integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  

  /**
  * The account&#x27;s identifier in the Student Information System. Only included if the user has permission to view SIS information.
  * @return integrationId
  **/
  @Schema(example = "123xyz", description = "The account's identifier in the Student Information System. Only included if the user has permission to view SIS information.")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }
  public Account ltiGuid(String ltiGuid) {
    this.ltiGuid = ltiGuid;
    return this;
  }

  

  /**
  * The account&#x27;s identifier that is sent as context_id in LTI launches.
  * @return ltiGuid
  **/
  @Schema(example = "123xyz", description = "The account's identifier that is sent as context_id in LTI launches.")
  public String getLtiGuid() {
    return ltiGuid;
  }
  public void setLtiGuid(String ltiGuid) {
    this.ltiGuid = ltiGuid;
  }
  public Account name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The display name of the account
  * @return name
  **/
  @Schema(example = "Canvas Account", description = "The display name of the account")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Account parentAccountId(Integer parentAccountId) {
    this.parentAccountId = parentAccountId;
    return this;
  }

  

  /**
  * The account&#x27;s parent ID, or null if this is the root account
  * @return parentAccountId
  **/
  @Schema(example = "1", description = "The account's parent ID, or null if this is the root account")
  public Integer getParentAccountId() {
    return parentAccountId;
  }
  public void setParentAccountId(Integer parentAccountId) {
    this.parentAccountId = parentAccountId;
  }
  public Account rootAccountId(Integer rootAccountId) {
    this.rootAccountId = rootAccountId;
    return this;
  }

  

  /**
  * The ID of the root account, or null if this is the root account
  * @return rootAccountId
  **/
  @Schema(example = "1", description = "The ID of the root account, or null if this is the root account")
  public Integer getRootAccountId() {
    return rootAccountId;
  }
  public void setRootAccountId(Integer rootAccountId) {
    this.rootAccountId = rootAccountId;
  }
  public Account sisAccountId(String sisAccountId) {
    this.sisAccountId = sisAccountId;
    return this;
  }

  

  /**
  * The account&#x27;s identifier in the Student Information System. Only included if the user has permission to view SIS information.
  * @return sisAccountId
  **/
  @Schema(example = "123xyz", description = "The account's identifier in the Student Information System. Only included if the user has permission to view SIS information.")
  public String getSisAccountId() {
    return sisAccountId;
  }
  public void setSisAccountId(String sisAccountId) {
    this.sisAccountId = sisAccountId;
  }
  public Account sisImportId(Integer sisImportId) {
    this.sisImportId = sisImportId;
    return this;
  }

  

  /**
  * The id of the SIS import if created through SIS. Only included if the user has permission to manage SIS information.
  * @return sisImportId
  **/
  @Schema(example = "12", description = "The id of the SIS import if created through SIS. Only included if the user has permission to manage SIS information.")
  public Integer getSisImportId() {
    return sisImportId;
  }
  public void setSisImportId(Integer sisImportId) {
    this.sisImportId = sisImportId;
  }
  public Account uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  

  /**
  * The UUID of the account
  * @return uuid
  **/
  @Schema(example = "WvAHhY5FINzq5IyRIJybGeiXyFkG3SqHUPb7jZY5", description = "The UUID of the account")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
  public Account workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * The state of the account. Can be &#x27;active&#x27; or &#x27;deleted&#x27;.
  * @return workflowState
  **/
  @Schema(example = "active", description = "The state of the account. Can be 'active' or 'deleted'.")
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
    Account account = (Account) o;
    return Objects.equals(this.defaultGroupStorageQuotaMb, account.defaultGroupStorageQuotaMb) &&
        Objects.equals(this.defaultStorageQuotaMb, account.defaultStorageQuotaMb) &&
        Objects.equals(this.defaultTimeZone, account.defaultTimeZone) &&
        Objects.equals(this.defaultUserStorageQuotaMb, account.defaultUserStorageQuotaMb) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.integrationId, account.integrationId) &&
        Objects.equals(this.ltiGuid, account.ltiGuid) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.parentAccountId, account.parentAccountId) &&
        Objects.equals(this.rootAccountId, account.rootAccountId) &&
        Objects.equals(this.sisAccountId, account.sisAccountId) &&
        Objects.equals(this.sisImportId, account.sisImportId) &&
        Objects.equals(this.uuid, account.uuid) &&
        Objects.equals(this.workflowState, account.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(defaultGroupStorageQuotaMb, defaultStorageQuotaMb, defaultTimeZone, defaultUserStorageQuotaMb, id, integrationId, ltiGuid, name, parentAccountId, rootAccountId, sisAccountId, sisImportId, uuid, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    defaultGroupStorageQuotaMb: ").append(toIndentedString(defaultGroupStorageQuotaMb)).append("\n");
    sb.append("    defaultStorageQuotaMb: ").append(toIndentedString(defaultStorageQuotaMb)).append("\n");
    sb.append("    defaultTimeZone: ").append(toIndentedString(defaultTimeZone)).append("\n");
    sb.append("    defaultUserStorageQuotaMb: ").append(toIndentedString(defaultUserStorageQuotaMb)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    ltiGuid: ").append(toIndentedString(ltiGuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
    sb.append("    rootAccountId: ").append(toIndentedString(rootAccountId)).append("\n");
    sb.append("    sisAccountId: ").append(toIndentedString(sisAccountId)).append("\n");
    sb.append("    sisImportId: ").append(toIndentedString(sisImportId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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