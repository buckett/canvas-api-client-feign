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
import com.instructure.canvas.model.GradingRules;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * AssignmentGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class AssignmentGroup {

  @JsonProperty("assignments")

  private List<Integer> assignments = null;

  @JsonProperty("group_weight")

  private Integer groupWeight = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("integration_data")

  private Object integrationData = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("position")

  private Integer position = null;

  @JsonProperty("rules")

  private GradingRules rules = null;

  @JsonProperty("sis_source_id")

  private String sisSourceId = null;
  public AssignmentGroup assignments(List<Integer> assignments) {
    this.assignments = assignments;
    return this;
  }

  public AssignmentGroup addAssignmentsItem(Integer assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<Integer>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

  /**
  * the assignments in this Assignment Group (see the Assignment API for a detailed list of fields)
  * @return assignments
  **/
  @Schema(example = "[]", description = "the assignments in this Assignment Group (see the Assignment API for a detailed list of fields)")
  public List<Integer> getAssignments() {
    return assignments;
  }
  public void setAssignments(List<Integer> assignments) {
    this.assignments = assignments;
  }
  public AssignmentGroup groupWeight(Integer groupWeight) {
    this.groupWeight = groupWeight;
    return this;
  }

  

  /**
  * the weight of the Assignment Group
  * @return groupWeight
  **/
  @Schema(example = "20", description = "the weight of the Assignment Group")
  public Integer getGroupWeight() {
    return groupWeight;
  }
  public void setGroupWeight(Integer groupWeight) {
    this.groupWeight = groupWeight;
  }
  public AssignmentGroup id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * the id of the Assignment Group
  * @return id
  **/
  @Schema(example = "1", description = "the id of the Assignment Group")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public AssignmentGroup integrationData(Object integrationData) {
    this.integrationData = integrationData;
    return this;
  }

  

  /**
  * the integration data of the Assignment Group
  * @return integrationData
  **/
  @Schema(example = "{\"5678\":\"0954\"}", description = "the integration data of the Assignment Group")
  public Object getIntegrationData() {
    return integrationData;
  }
  public void setIntegrationData(Object integrationData) {
    this.integrationData = integrationData;
  }
  public AssignmentGroup name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * the name of the Assignment Group
  * @return name
  **/
  @Schema(example = "group2", description = "the name of the Assignment Group")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public AssignmentGroup position(Integer position) {
    this.position = position;
    return this;
  }

  

  /**
  * the position of the Assignment Group
  * @return position
  **/
  @Schema(example = "7", description = "the position of the Assignment Group")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
  }
  public AssignmentGroup rules(GradingRules rules) {
    this.rules = rules;
    return this;
  }

  

  /**
  * Get rules
  * @return rules
  **/
  @Schema(description = "")
  public GradingRules getRules() {
    return rules;
  }
  public void setRules(GradingRules rules) {
    this.rules = rules;
  }
  public AssignmentGroup sisSourceId(String sisSourceId) {
    this.sisSourceId = sisSourceId;
    return this;
  }

  

  /**
  * the sis source id of the Assignment Group
  * @return sisSourceId
  **/
  @Schema(example = "1234", description = "the sis source id of the Assignment Group")
  public String getSisSourceId() {
    return sisSourceId;
  }
  public void setSisSourceId(String sisSourceId) {
    this.sisSourceId = sisSourceId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentGroup assignmentGroup = (AssignmentGroup) o;
    return Objects.equals(this.assignments, assignmentGroup.assignments) &&
        Objects.equals(this.groupWeight, assignmentGroup.groupWeight) &&
        Objects.equals(this.id, assignmentGroup.id) &&
        Objects.equals(this.integrationData, assignmentGroup.integrationData) &&
        Objects.equals(this.name, assignmentGroup.name) &&
        Objects.equals(this.position, assignmentGroup.position) &&
        Objects.equals(this.rules, assignmentGroup.rules) &&
        Objects.equals(this.sisSourceId, assignmentGroup.sisSourceId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(assignments, groupWeight, id, integrationData, name, position, rules, sisSourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentGroup {\n");
    
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    groupWeight: ").append(toIndentedString(groupWeight)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationData: ").append(toIndentedString(integrationData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    sisSourceId: ").append(toIndentedString(sisSourceId)).append("\n");
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
