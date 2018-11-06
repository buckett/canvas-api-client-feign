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
import com.instructure.canvas.model.ModuleItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Module
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Module {

  @JsonProperty("completed_at")

  private OffsetDateTime completedAt = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("items")

  private List<ModuleItem> items = null;

  @JsonProperty("items_count")

  private Integer itemsCount = null;

  @JsonProperty("items_url")

  private String itemsUrl = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("position")

  private Integer position = null;

  @JsonProperty("prerequisite_module_ids")

  private List<Integer> prerequisiteModuleIds = null;

  @JsonProperty("publish_final_grade")

  private Boolean publishFinalGrade = null;

  @JsonProperty("published")

  private Boolean published = null;

  @JsonProperty("require_sequential_progress")

  private Boolean requireSequentialProgress = null;

  @JsonProperty("state")

  private String state = null;

  @JsonProperty("unlock_at")

  private OffsetDateTime unlockAt = null;

  @JsonProperty("workflow_state")

  private String workflowState = null;
  public Module completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  

  /**
  * the date the calling user completed the module (Optional; present only if the caller is a student or if the optional parameter &#x27;student_id&#x27; is included)
  * @return completedAt
  **/
  @Schema(description = "the date the calling user completed the module (Optional; present only if the caller is a student or if the optional parameter 'student_id' is included)")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }
  public Module id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the unique identifier for the module
  * @return id
  **/
  @Schema(example = "123", description = "the unique identifier for the module")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Module items(List<ModuleItem> items) {
    this.items = items;
    return this;
  }

  public Module addItemsItem(ModuleItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ModuleItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
  * The contents of this module, as an array of Module Items. (Present only if requested via include[]&#x3D;items AND the module is not deemed too large by Canvas.)
  * @return items
  **/
  @Schema(description = "The contents of this module, as an array of Module Items. (Present only if requested via include[]=items AND the module is not deemed too large by Canvas.)")
  public List<ModuleItem> getItems() {
    return items;
  }
  public void setItems(List<ModuleItem> items) {
    this.items = items;
  }
  public Module itemsCount(Integer itemsCount) {
    this.itemsCount = itemsCount;
    return this;
  }

  

  /**
  * The number of items in the module
  * @return itemsCount
  **/
  @Schema(example = "10", description = "The number of items in the module")
  public Integer getItemsCount() {
    return itemsCount;
  }
  public void setItemsCount(Integer itemsCount) {
    this.itemsCount = itemsCount;
  }
  public Module itemsUrl(String itemsUrl) {
    this.itemsUrl = itemsUrl;
    return this;
  }

  

  /**
  * The API URL to retrive this module&#x27;s items
  * @return itemsUrl
  **/
  @Schema(example = "https://canvas.example.com/api/v1/modules/123/items", description = "The API URL to retrive this module's items")
  public String getItemsUrl() {
    return itemsUrl;
  }
  public void setItemsUrl(String itemsUrl) {
    this.itemsUrl = itemsUrl;
  }
  public Module name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * the name of this module
  * @return name
  **/
  @Schema(example = "Imaginary Numbers and You", description = "the name of this module")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Module position(Integer position) {
    this.position = position;
    return this;
  }

  

  /**
  * the position of this module in the course (1-based)
  * @return position
  **/
  @Schema(example = "2", description = "the position of this module in the course (1-based)")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }
  public Module prerequisiteModuleIds(List<Integer> prerequisiteModuleIds) {
    this.prerequisiteModuleIds = prerequisiteModuleIds;
    return this;
  }

  public Module addPrerequisiteModuleIdsItem(Integer prerequisiteModuleIdsItem) {
    if (this.prerequisiteModuleIds == null) {
      this.prerequisiteModuleIds = new ArrayList<Integer>();
    }
    this.prerequisiteModuleIds.add(prerequisiteModuleIdsItem);
    return this;
  }

  /**
  * IDs of Modules that must be completed before this one is unlocked
  * @return prerequisiteModuleIds
  **/
  @Schema(example = "[121, 122]", description = "IDs of Modules that must be completed before this one is unlocked")
  public List<Integer> getPrerequisiteModuleIds() {
    return prerequisiteModuleIds;
  }
  public void setPrerequisiteModuleIds(List<Integer> prerequisiteModuleIds) {
    this.prerequisiteModuleIds = prerequisiteModuleIds;
  }
  public Module publishFinalGrade(Boolean publishFinalGrade) {
    this.publishFinalGrade = publishFinalGrade;
    return this;
  }

  

  /**
  * if the student&#x27;s final grade for the course should be published to the SIS upon completion of this module
  * @return publishFinalGrade
  **/
  @Schema(description = "if the student's final grade for the course should be published to the SIS upon completion of this module")
  public Boolean isPublishFinalGrade() {
    return publishFinalGrade;
  }
  public void setPublishFinalGrade(Boolean publishFinalGrade) {
    this.publishFinalGrade = publishFinalGrade;
  }
  public Module published(Boolean published) {
    this.published = published;
    return this;
  }

  

  /**
  * (Optional) Whether this module is published. This field is present only if the caller has permission to view unpublished modules.
  * @return published
  **/
  @Schema(example = "true", description = "(Optional) Whether this module is published. This field is present only if the caller has permission to view unpublished modules.")
  public Boolean isPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }
  public Module requireSequentialProgress(Boolean requireSequentialProgress) {
    this.requireSequentialProgress = requireSequentialProgress;
    return this;
  }

  

  /**
  * Whether module items must be unlocked in order
  * @return requireSequentialProgress
  **/
  @Schema(example = "true", description = "Whether module items must be unlocked in order")
  public Boolean isRequireSequentialProgress() {
    return requireSequentialProgress;
  }
  public void setRequireSequentialProgress(Boolean requireSequentialProgress) {
    this.requireSequentialProgress = requireSequentialProgress;
  }
  public Module state(String state) {
    this.state = state;
    return this;
  }

  

  /**
  * The state of this Module for the calling user one of &#x27;locked&#x27;, &#x27;unlocked&#x27;, &#x27;started&#x27;, &#x27;completed&#x27; (Optional; present only if the caller is a student or if the optional parameter &#x27;student_id&#x27; is included)
  * @return state
  **/
  @Schema(example = "started", description = "The state of this Module for the calling user one of 'locked', 'unlocked', 'started', 'completed' (Optional; present only if the caller is a student or if the optional parameter 'student_id' is included)")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public Module unlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
    return this;
  }

  

  /**
  * (Optional) the date this module will unlock
  * @return unlockAt
  **/
  @Schema(description = "(Optional) the date this module will unlock")
  public OffsetDateTime getUnlockAt() {
    return unlockAt;
  }
  public void setUnlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
  }
  public Module workflowState(String workflowState) {
    this.workflowState = workflowState;
    return this;
  }

  

  /**
  * the state of the module: &#x27;active&#x27;, &#x27;deleted&#x27;
  * @return workflowState
  **/
  @Schema(example = "active", description = "the state of the module: 'active', 'deleted'")
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
    Module module = (Module) o;
    return Objects.equals(this.completedAt, module.completedAt) &&
        Objects.equals(this.id, module.id) &&
        Objects.equals(this.items, module.items) &&
        Objects.equals(this.itemsCount, module.itemsCount) &&
        Objects.equals(this.itemsUrl, module.itemsUrl) &&
        Objects.equals(this.name, module.name) &&
        Objects.equals(this.position, module.position) &&
        Objects.equals(this.prerequisiteModuleIds, module.prerequisiteModuleIds) &&
        Objects.equals(this.publishFinalGrade, module.publishFinalGrade) &&
        Objects.equals(this.published, module.published) &&
        Objects.equals(this.requireSequentialProgress, module.requireSequentialProgress) &&
        Objects.equals(this.state, module.state) &&
        Objects.equals(this.unlockAt, module.unlockAt) &&
        Objects.equals(this.workflowState, module.workflowState);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(completedAt, id, items, itemsCount, itemsUrl, name, position, prerequisiteModuleIds, publishFinalGrade, published, requireSequentialProgress, state, unlockAt, workflowState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Module {\n");
    
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    itemsUrl: ").append(toIndentedString(itemsUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    prerequisiteModuleIds: ").append(toIndentedString(prerequisiteModuleIds)).append("\n");
    sb.append("    publishFinalGrade: ").append(toIndentedString(publishFinalGrade)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    requireSequentialProgress: ").append(toIndentedString(requireSequentialProgress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
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
