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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * A student&#x27;s result for an outcome
 */
@Schema(description = "A student's result for an outcome")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class OutcomeResult {

  @JsonProperty("id")

  private Integer id = null;

  @JsonProperty("links")

  private Object links = null;

  @JsonProperty("percent")

  private BigDecimal percent = null;

  @JsonProperty("score")

  private Integer score = null;

  @JsonProperty("submitted_or_assessed_at")

  private OffsetDateTime submittedOrAssessedAt = null;
  public OutcomeResult id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * A unique identifier for this result
  * @return id
  **/
  @Schema(example = "42", description = "A unique identifier for this result")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public OutcomeResult links(Object links) {
    this.links = links;
    return this;
  }

  

  /**
  * Unique identifiers of objects associated with this result
  * @return links
  **/
  @Schema(example = "{\"alignment\":\"53\",\"learning_outcome\":\"97\",\"user\":\"3\"}", description = "Unique identifiers of objects associated with this result")
  public Object getLinks() {
    return links;
  }
  public void setLinks(Object links) {
    this.links = links;
  }
  public OutcomeResult percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  

  /**
  * score&#x27;s percent of maximum points possible for outcome, scaled to reflect any custom mastery levels that differ from the learning outcome
  * @return percent
  **/
  @Schema(example = "0.65", description = "score's percent of maximum points possible for outcome, scaled to reflect any custom mastery levels that differ from the learning outcome")
  public BigDecimal getPercent() {
    return percent;
  }
  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }
  public OutcomeResult score(Integer score) {
    this.score = score;
    return this;
  }

  

  /**
  * The student&#x27;s score
  * @return score
  **/
  @Schema(example = "6", description = "The student's score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public OutcomeResult submittedOrAssessedAt(OffsetDateTime submittedOrAssessedAt) {
    this.submittedOrAssessedAt = submittedOrAssessedAt;
    return this;
  }

  

  /**
  * The datetime the resulting OutcomeResult was submitted at, or absent that, when it was assessed.
  * @return submittedOrAssessedAt
  **/
  @Schema(description = "The datetime the resulting OutcomeResult was submitted at, or absent that, when it was assessed.")
  public OffsetDateTime getSubmittedOrAssessedAt() {
    return submittedOrAssessedAt;
  }
  public void setSubmittedOrAssessedAt(OffsetDateTime submittedOrAssessedAt) {
    this.submittedOrAssessedAt = submittedOrAssessedAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeResult outcomeResult = (OutcomeResult) o;
    return Objects.equals(this.id, outcomeResult.id) &&
        Objects.equals(this.links, outcomeResult.links) &&
        Objects.equals(this.percent, outcomeResult.percent) &&
        Objects.equals(this.score, outcomeResult.score) &&
        Objects.equals(this.submittedOrAssessedAt, outcomeResult.submittedOrAssessedAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, links, percent, score, submittedOrAssessedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    submittedOrAssessedAt: ").append(toIndentedString(submittedOrAssessedAt)).append("\n");
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
