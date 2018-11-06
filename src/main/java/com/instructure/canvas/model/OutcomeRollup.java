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
import com.instructure.canvas.model.OutcomeRollupLinks;
import com.instructure.canvas.model.OutcomeRollupScore;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OutcomeRollup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class OutcomeRollup {

  @JsonProperty("links")

  private OutcomeRollupLinks links = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("scores")

  private OutcomeRollupScore scores = null;
  public OutcomeRollup links(OutcomeRollupLinks links) {
    this.links = links;
    return this;
  }

  

  /**
  * Get links
  * @return links
  **/
  @Schema(description = "")
  public OutcomeRollupLinks getLinks() {
    return links;
  }
  public void setLinks(OutcomeRollupLinks links) {
    this.links = links;
  }
  public OutcomeRollup name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The name of the resource for this rollup. For example, the user name.
  * @return name
  **/
  @Schema(example = "John Doe", description = "The name of the resource for this rollup. For example, the user name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public OutcomeRollup scores(OutcomeRollupScore scores) {
    this.scores = scores;
    return this;
  }

  

  /**
  * Get scores
  * @return scores
  **/
  @Schema(description = "")
  public OutcomeRollupScore getScores() {
    return scores;
  }
  public void setScores(OutcomeRollupScore scores) {
    this.scores = scores;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeRollup outcomeRollup = (OutcomeRollup) o;
    return Objects.equals(this.links, outcomeRollup.links) &&
        Objects.equals(this.name, outcomeRollup.name) &&
        Objects.equals(this.scores, outcomeRollup.scores);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(links, name, scores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeRollup {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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