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
 * Some of the attributes of an Assignment Group. See Assignments API for more details
 */
@Schema(description = "Some of the attributes of an Assignment Group. See Assignments API for more details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class AssignmentGroupAttributes {

  @JsonProperty("group_weight")

  private Integer groupWeight = null;

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("integration_data")

  private Object integrationData = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("sis_source_id")

  private String sisSourceId = null;
  public AssignmentGroupAttributes groupWeight(Integer groupWeight) {
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
  public AssignmentGroupAttributes id(Integer id) {
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
  public AssignmentGroupAttributes integrationData(Object integrationData) {
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
  public AssignmentGroupAttributes name(String name) {
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
  public AssignmentGroupAttributes sisSourceId(String sisSourceId) {
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
    AssignmentGroupAttributes assignmentGroupAttributes = (AssignmentGroupAttributes) o;
    return Objects.equals(this.groupWeight, assignmentGroupAttributes.groupWeight) &&
        Objects.equals(this.id, assignmentGroupAttributes.id) &&
        Objects.equals(this.integrationData, assignmentGroupAttributes.integrationData) &&
        Objects.equals(this.name, assignmentGroupAttributes.name) &&
        Objects.equals(this.sisSourceId, assignmentGroupAttributes.sisSourceId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(groupWeight, id, integrationData, name, sisSourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentGroupAttributes {\n");
    
    sb.append("    groupWeight: ").append(toIndentedString(groupWeight)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationData: ").append(toIndentedString(integrationData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
