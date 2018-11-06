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
import com.instructure.canvas.model.Progress;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GroupCategory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class GroupCategory {

  @JsonProperty("account_id")

  private Integer accountId = null;

  @JsonProperty("auto_leader")

  private String autoLeader = null;

  @JsonProperty("context_type")

  private String contextType = null;

  @JsonProperty("group_limit")

  private Integer groupLimit = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("progress")

  private Progress progress = null;

  @JsonProperty("role")

  private String role = null;

  @JsonProperty("self_signup")

  private String selfSignup = null;

  @JsonProperty("sis_group_category_id")

  private String sisGroupCategoryId = null;

  @JsonProperty("sis_import_id")

  private Integer sisImportId = null;
  public GroupCategory accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  

  /**
  * Get accountId
  * @return accountId
  **/
  @Schema(example = "3", description = "")
  public Integer getAccountId() {
    return accountId;
  }
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }
  public GroupCategory autoLeader(String autoLeader) {
    this.autoLeader = autoLeader;
    return this;
  }

  

  /**
  * Gives instructors the ability to automatically have group leaders assigned.  Values include &#x27;random&#x27;, &#x27;first&#x27;, and null; &#x27;random&#x27; picks a student from the group at random as the leader, &#x27;first&#x27; sets the first student to be assigned to the group as the leader
  * @return autoLeader
  **/
  @Schema(description = "Gives instructors the ability to automatically have group leaders assigned.  Values include 'random', 'first', and null; 'random' picks a student from the group at random as the leader, 'first' sets the first student to be assigned to the group as the leader")
  public String getAutoLeader() {
    return autoLeader;
  }
  public void setAutoLeader(String autoLeader) {
    this.autoLeader = autoLeader;
  }
  public GroupCategory contextType(String contextType) {
    this.contextType = contextType;
    return this;
  }

  

  /**
  * The course or account that the category group belongs to. The pattern here is that whatever the context_type is, there will be an _id field named after that type. So if instead context_type was &#x27;Course&#x27;, the course_id field would be replaced by an course_id field.
  * @return contextType
  **/
  @Schema(example = "Account", description = "The course or account that the category group belongs to. The pattern here is that whatever the context_type is, there will be an _id field named after that type. So if instead context_type was 'Course', the course_id field would be replaced by an course_id field.")
  public String getContextType() {
    return contextType;
  }
  public void setContextType(String contextType) {
    this.contextType = contextType;
  }
  public GroupCategory groupLimit(Integer groupLimit) {
    this.groupLimit = groupLimit;
    return this;
  }

  

  /**
  * If self-signup is enabled, group_limit can be set to cap the number of users in each group. If null, there is no limit.
  * @return groupLimit
  **/
  @Schema(description = "If self-signup is enabled, group_limit can be set to cap the number of users in each group. If null, there is no limit.")
  public Integer getGroupLimit() {
    return groupLimit;
  }
  public void setGroupLimit(Integer groupLimit) {
    this.groupLimit = groupLimit;
  }
  public GroupCategory id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of the group category.
  * @return id
  **/
  @Schema(example = "17", description = "The ID of the group category.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public GroupCategory name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The display name of the group category.
  * @return name
  **/
  @Schema(example = "Math Groups", description = "The display name of the group category.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public GroupCategory progress(Progress progress) {
    this.progress = progress;
    return this;
  }

  

  /**
  * Get progress
  * @return progress
  **/
  @Schema(description = "")
  public Progress getProgress() {
    return progress;
  }
  public void setProgress(Progress progress) {
    this.progress = progress;
  }
  public GroupCategory role(String role) {
    this.role = role;
    return this;
  }

  

  /**
  * Certain types of group categories have special role designations. Currently, these include: &#x27;communities&#x27;, &#x27;student_organized&#x27;, and &#x27;imported&#x27;. Regular course/account group categories have a role of null.
  * @return role
  **/
  @Schema(example = "communities", description = "Certain types of group categories have special role designations. Currently, these include: 'communities', 'student_organized', and 'imported'. Regular course/account group categories have a role of null.")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public GroupCategory selfSignup(String selfSignup) {
    this.selfSignup = selfSignup;
    return this;
  }

  

  /**
  * If the group category allows users to join a group themselves, thought they may only be a member of one group per group category at a time. Values include &#x27;restricted&#x27;, &#x27;enabled&#x27;, and null &#x27;enabled&#x27; allows students to assign themselves to a group &#x27;restricted&#x27; restricts them to only joining a group in their section null disallows students from joining groups
  * @return selfSignup
  **/
  @Schema(description = "If the group category allows users to join a group themselves, thought they may only be a member of one group per group category at a time. Values include 'restricted', 'enabled', and null 'enabled' allows students to assign themselves to a group 'restricted' restricts them to only joining a group in their section null disallows students from joining groups")
  public String getSelfSignup() {
    return selfSignup;
  }
  public void setSelfSignup(String selfSignup) {
    this.selfSignup = selfSignup;
  }
  public GroupCategory sisGroupCategoryId(String sisGroupCategoryId) {
    this.sisGroupCategoryId = sisGroupCategoryId;
    return this;
  }

  

  /**
  * The SIS identifier for the group category. This field is only included if the user has permission to manage or view SIS information.
  * @return sisGroupCategoryId
  **/
  @Schema(description = "The SIS identifier for the group category. This field is only included if the user has permission to manage or view SIS information.")
  public String getSisGroupCategoryId() {
    return sisGroupCategoryId;
  }
  public void setSisGroupCategoryId(String sisGroupCategoryId) {
    this.sisGroupCategoryId = sisGroupCategoryId;
  }
  public GroupCategory sisImportId(Integer sisImportId) {
    this.sisImportId = sisImportId;
    return this;
  }

  

  /**
  * The unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information.
  * @return sisImportId
  **/
  @Schema(description = "The unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information.")
  public Integer getSisImportId() {
    return sisImportId;
  }
  public void setSisImportId(Integer sisImportId) {
    this.sisImportId = sisImportId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupCategory groupCategory = (GroupCategory) o;
    return Objects.equals(this.accountId, groupCategory.accountId) &&
        Objects.equals(this.autoLeader, groupCategory.autoLeader) &&
        Objects.equals(this.contextType, groupCategory.contextType) &&
        Objects.equals(this.groupLimit, groupCategory.groupLimit) &&
        Objects.equals(this.id, groupCategory.id) &&
        Objects.equals(this.name, groupCategory.name) &&
        Objects.equals(this.progress, groupCategory.progress) &&
        Objects.equals(this.role, groupCategory.role) &&
        Objects.equals(this.selfSignup, groupCategory.selfSignup) &&
        Objects.equals(this.sisGroupCategoryId, groupCategory.sisGroupCategoryId) &&
        Objects.equals(this.sisImportId, groupCategory.sisImportId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(accountId, autoLeader, contextType, groupLimit, id, name, progress, role, selfSignup, sisGroupCategoryId, sisImportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupCategory {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    autoLeader: ").append(toIndentedString(autoLeader)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    groupLimit: ").append(toIndentedString(groupLimit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    selfSignup: ").append(toIndentedString(selfSignup)).append("\n");
    sb.append("    sisGroupCategoryId: ").append(toIndentedString(sisGroupCategoryId)).append("\n");
    sb.append("    sisImportId: ").append(toIndentedString(sisImportId)).append("\n");
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
