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
import com.instructure.canvas.model.QuizStatisticsLinks;
import com.instructure.canvas.model.QuizStatisticsQuestionStatistics;
import com.instructure.canvas.model.QuizStatisticsSubmissionStatistics;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * QuizStatistics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class QuizStatistics {

  @JsonProperty("generated_at")

  private OffsetDateTime generatedAt = null;

  @JsonProperty("html_url")

  private String htmlUrl = null;

  @JsonProperty("id")

  private Long id = null;

  @JsonProperty("includes_all_versions")

  private Boolean includesAllVersions = null;

  @JsonProperty("links")

  private QuizStatisticsLinks links = null;

  @JsonProperty("multiple_attempts_exist")

  private Boolean multipleAttemptsExist = null;

  @JsonProperty("question_statistics")

  private QuizStatisticsQuestionStatistics questionStatistics = null;

  @JsonProperty("quiz_id")

  private Long quizId = null;

  @JsonProperty("submission_statistics")

  private QuizStatisticsSubmissionStatistics submissionStatistics = null;

  @JsonProperty("url")

  private String url = null;
  public QuizStatistics generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  

  /**
  * The time at which the statistics were generated, which is usually after the occurrence of a quiz event, like a student submitting it.
  * @return generatedAt
  **/
  @Schema(description = "The time at which the statistics were generated, which is usually after the occurrence of a quiz event, like a student submitting it.")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }
  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }
  public QuizStatistics htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  

  /**
  * The HTTP/HTTPS URL to the page where the statistics can be seen visually.
  * @return htmlUrl
  **/
  @Schema(example = "http://canvas.example.edu/courses/1/quizzes/2/statistics", description = "The HTTP/HTTPS URL to the page where the statistics can be seen visually.")
  public String getHtmlUrl() {
    return htmlUrl;
  }
  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }
  public QuizStatistics id(Long id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of the quiz statistics report.
  * @return id
  **/
  @Schema(example = "1", required = true, description = "The ID of the quiz statistics report.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public QuizStatistics includesAllVersions(Boolean includesAllVersions) {
    this.includesAllVersions = includesAllVersions;
    return this;
  }

  

  /**
  * In the presence of multiple attempts, this field describes whether the statistics describe all the submission attempts and not only the latest ones.
  * @return includesAllVersions
  **/
  @Schema(example = "true", description = "In the presence of multiple attempts, this field describes whether the statistics describe all the submission attempts and not only the latest ones.")
  public Boolean isIncludesAllVersions() {
    return includesAllVersions;
  }
  public void setIncludesAllVersions(Boolean includesAllVersions) {
    this.includesAllVersions = includesAllVersions;
  }
  public QuizStatistics links(QuizStatisticsLinks links) {
    this.links = links;
    return this;
  }

  

  /**
  * Get links
  * @return links
  **/
  @Schema(description = "")
  public QuizStatisticsLinks getLinks() {
    return links;
  }
  public void setLinks(QuizStatisticsLinks links) {
    this.links = links;
  }
  public QuizStatistics multipleAttemptsExist(Boolean multipleAttemptsExist) {
    this.multipleAttemptsExist = multipleAttemptsExist;
    return this;
  }

  

  /**
  * Whether there are any students that have made mutliple submissions for this quiz.
  * @return multipleAttemptsExist
  **/
  @Schema(example = "true", description = "Whether there are any students that have made mutliple submissions for this quiz.")
  public Boolean isMultipleAttemptsExist() {
    return multipleAttemptsExist;
  }
  public void setMultipleAttemptsExist(Boolean multipleAttemptsExist) {
    this.multipleAttemptsExist = multipleAttemptsExist;
  }
  public QuizStatistics questionStatistics(QuizStatisticsQuestionStatistics questionStatistics) {
    this.questionStatistics = questionStatistics;
    return this;
  }

  

  /**
  * Get questionStatistics
  * @return questionStatistics
  **/
  @Schema(description = "")
  public QuizStatisticsQuestionStatistics getQuestionStatistics() {
    return questionStatistics;
  }
  public void setQuestionStatistics(QuizStatisticsQuestionStatistics questionStatistics) {
    this.questionStatistics = questionStatistics;
  }
  public QuizStatistics quizId(Long quizId) {
    this.quizId = quizId;
    return this;
  }

  

  /**
  * The ID of the Quiz the statistics report is for.  NOTE: AVAILABLE ONLY IN NON-JSON-API REQUESTS.
  * @return quizId
  **/
  @Schema(example = "2", required = true, description = "The ID of the Quiz the statistics report is for.  NOTE: AVAILABLE ONLY IN NON-JSON-API REQUESTS.")
  public Long getQuizId() {
    return quizId;
  }
  public void setQuizId(Long quizId) {
    this.quizId = quizId;
  }
  public QuizStatistics submissionStatistics(QuizStatisticsSubmissionStatistics submissionStatistics) {
    this.submissionStatistics = submissionStatistics;
    return this;
  }

  

  /**
  * Get submissionStatistics
  * @return submissionStatistics
  **/
  @Schema(description = "")
  public QuizStatisticsSubmissionStatistics getSubmissionStatistics() {
    return submissionStatistics;
  }
  public void setSubmissionStatistics(QuizStatisticsSubmissionStatistics submissionStatistics) {
    this.submissionStatistics = submissionStatistics;
  }
  public QuizStatistics url(String url) {
    this.url = url;
    return this;
  }

  

  /**
  * The API HTTP/HTTPS URL to this quiz statistics.
  * @return url
  **/
  @Schema(example = "http://canvas.example.edu/api/v1/courses/1/quizzes/2/statistics", description = "The API HTTP/HTTPS URL to this quiz statistics.")
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
    QuizStatistics quizStatistics = (QuizStatistics) o;
    return Objects.equals(this.generatedAt, quizStatistics.generatedAt) &&
        Objects.equals(this.htmlUrl, quizStatistics.htmlUrl) &&
        Objects.equals(this.id, quizStatistics.id) &&
        Objects.equals(this.includesAllVersions, quizStatistics.includesAllVersions) &&
        Objects.equals(this.links, quizStatistics.links) &&
        Objects.equals(this.multipleAttemptsExist, quizStatistics.multipleAttemptsExist) &&
        Objects.equals(this.questionStatistics, quizStatistics.questionStatistics) &&
        Objects.equals(this.quizId, quizStatistics.quizId) &&
        Objects.equals(this.submissionStatistics, quizStatistics.submissionStatistics) &&
        Objects.equals(this.url, quizStatistics.url);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(generatedAt, htmlUrl, id, includesAllVersions, links, multipleAttemptsExist, questionStatistics, quizId, submissionStatistics, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizStatistics {\n");
    
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includesAllVersions: ").append(toIndentedString(includesAllVersions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    multipleAttemptsExist: ").append(toIndentedString(multipleAttemptsExist)).append("\n");
    sb.append("    questionStatistics: ").append(toIndentedString(questionStatistics)).append("\n");
    sb.append("    quizId: ").append(toIndentedString(quizId)).append("\n");
    sb.append("    submissionStatistics: ").append(toIndentedString(submissionStatistics)).append("\n");
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