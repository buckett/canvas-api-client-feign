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
 * SisImportCounts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class SisImportCounts {

  @JsonProperty("abstract_courses")

  private Integer abstractCourses = null;

  @JsonProperty("accounts")

  private Integer accounts = null;

  @JsonProperty("batch_courses_deleted")

  private Integer batchCoursesDeleted = null;

  @JsonProperty("batch_enrollments_deleted")

  private Integer batchEnrollmentsDeleted = null;

  @JsonProperty("batch_sections_deleted")

  private Integer batchSectionsDeleted = null;

  @JsonProperty("courses")

  private Integer courses = null;

  @JsonProperty("enrollments")

  private Integer enrollments = null;

  @JsonProperty("error_count")

  private Integer errorCount = null;

  @JsonProperty("grade_publishing_results")

  private Integer gradePublishingResults = null;

  @JsonProperty("group_memberships")

  private Integer groupMemberships = null;

  @JsonProperty("groups")

  private Integer groups = null;

  @JsonProperty("sections")

  private Integer sections = null;

  @JsonProperty("terms")

  private Integer terms = null;

  @JsonProperty("users")

  private Integer users = null;

  @JsonProperty("warning_count")

  private Integer warningCount = null;

  @JsonProperty("xlists")

  private Integer xlists = null;
  public SisImportCounts abstractCourses(Integer abstractCourses) {
    this.abstractCourses = abstractCourses;
    return this;
  }

  

  /**
  * Get abstractCourses
  * @return abstractCourses
  **/
  @Schema(example = "0", description = "")
  public Integer getAbstractCourses() {
    return abstractCourses;
  }
  public void setAbstractCourses(Integer abstractCourses) {
    this.abstractCourses = abstractCourses;
  }
  public SisImportCounts accounts(Integer accounts) {
    this.accounts = accounts;
    return this;
  }

  

  /**
  * Get accounts
  * @return accounts
  **/
  @Schema(example = "0", description = "")
  public Integer getAccounts() {
    return accounts;
  }
  public void setAccounts(Integer accounts) {
    this.accounts = accounts;
  }
  public SisImportCounts batchCoursesDeleted(Integer batchCoursesDeleted) {
    this.batchCoursesDeleted = batchCoursesDeleted;
    return this;
  }

  

  /**
  * the number of courses that were removed because they were not included in the batch for batch_mode imports. Only included if courses were deleted
  * @return batchCoursesDeleted
  **/
  @Schema(example = "11", description = "the number of courses that were removed because they were not included in the batch for batch_mode imports. Only included if courses were deleted")
  public Integer getBatchCoursesDeleted() {
    return batchCoursesDeleted;
  }
  public void setBatchCoursesDeleted(Integer batchCoursesDeleted) {
    this.batchCoursesDeleted = batchCoursesDeleted;
  }
  public SisImportCounts batchEnrollmentsDeleted(Integer batchEnrollmentsDeleted) {
    this.batchEnrollmentsDeleted = batchEnrollmentsDeleted;
    return this;
  }

  

  /**
  * the number of enrollments that were removed because they were not included in the batch for batch_mode imports. Only included if enrollments were deleted
  * @return batchEnrollmentsDeleted
  **/
  @Schema(example = "150", description = "the number of enrollments that were removed because they were not included in the batch for batch_mode imports. Only included if enrollments were deleted")
  public Integer getBatchEnrollmentsDeleted() {
    return batchEnrollmentsDeleted;
  }
  public void setBatchEnrollmentsDeleted(Integer batchEnrollmentsDeleted) {
    this.batchEnrollmentsDeleted = batchEnrollmentsDeleted;
  }
  public SisImportCounts batchSectionsDeleted(Integer batchSectionsDeleted) {
    this.batchSectionsDeleted = batchSectionsDeleted;
    return this;
  }

  

  /**
  * the number of sections that were removed because they were not included in the batch for batch_mode imports. Only included if sections were deleted
  * @return batchSectionsDeleted
  **/
  @Schema(example = "0", description = "the number of sections that were removed because they were not included in the batch for batch_mode imports. Only included if sections were deleted")
  public Integer getBatchSectionsDeleted() {
    return batchSectionsDeleted;
  }
  public void setBatchSectionsDeleted(Integer batchSectionsDeleted) {
    this.batchSectionsDeleted = batchSectionsDeleted;
  }
  public SisImportCounts courses(Integer courses) {
    this.courses = courses;
    return this;
  }

  

  /**
  * Get courses
  * @return courses
  **/
  @Schema(example = "121", description = "")
  public Integer getCourses() {
    return courses;
  }
  public void setCourses(Integer courses) {
    this.courses = courses;
  }
  public SisImportCounts enrollments(Integer enrollments) {
    this.enrollments = enrollments;
    return this;
  }

  

  /**
  * Get enrollments
  * @return enrollments
  **/
  @Schema(example = "1542", description = "")
  public Integer getEnrollments() {
    return enrollments;
  }
  public void setEnrollments(Integer enrollments) {
    this.enrollments = enrollments;
  }
  public SisImportCounts errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  

  /**
  * Get errorCount
  * @return errorCount
  **/
  @Schema(example = "0", description = "")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }
  public SisImportCounts gradePublishingResults(Integer gradePublishingResults) {
    this.gradePublishingResults = gradePublishingResults;
    return this;
  }

  

  /**
  * Get gradePublishingResults
  * @return gradePublishingResults
  **/
  @Schema(example = "0", description = "")
  public Integer getGradePublishingResults() {
    return gradePublishingResults;
  }
  public void setGradePublishingResults(Integer gradePublishingResults) {
    this.gradePublishingResults = gradePublishingResults;
  }
  public SisImportCounts groupMemberships(Integer groupMemberships) {
    this.groupMemberships = groupMemberships;
    return this;
  }

  

  /**
  * Get groupMemberships
  * @return groupMemberships
  **/
  @Schema(example = "0", description = "")
  public Integer getGroupMemberships() {
    return groupMemberships;
  }
  public void setGroupMemberships(Integer groupMemberships) {
    this.groupMemberships = groupMemberships;
  }
  public SisImportCounts groups(Integer groups) {
    this.groups = groups;
    return this;
  }

  

  /**
  * Get groups
  * @return groups
  **/
  @Schema(example = "0", description = "")
  public Integer getGroups() {
    return groups;
  }
  public void setGroups(Integer groups) {
    this.groups = groups;
  }
  public SisImportCounts sections(Integer sections) {
    this.sections = sections;
    return this;
  }

  

  /**
  * Get sections
  * @return sections
  **/
  @Schema(example = "278", description = "")
  public Integer getSections() {
    return sections;
  }
  public void setSections(Integer sections) {
    this.sections = sections;
  }
  public SisImportCounts terms(Integer terms) {
    this.terms = terms;
    return this;
  }

  

  /**
  * Get terms
  * @return terms
  **/
  @Schema(example = "3", description = "")
  public Integer getTerms() {
    return terms;
  }
  public void setTerms(Integer terms) {
    this.terms = terms;
  }
  public SisImportCounts users(Integer users) {
    this.users = users;
    return this;
  }

  

  /**
  * Get users
  * @return users
  **/
  @Schema(example = "346", description = "")
  public Integer getUsers() {
    return users;
  }
  public void setUsers(Integer users) {
    this.users = users;
  }
  public SisImportCounts warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

  

  /**
  * Get warningCount
  * @return warningCount
  **/
  @Schema(example = "0", description = "")
  public Integer getWarningCount() {
    return warningCount;
  }
  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }
  public SisImportCounts xlists(Integer xlists) {
    this.xlists = xlists;
    return this;
  }

  

  /**
  * Get xlists
  * @return xlists
  **/
  @Schema(example = "0", description = "")
  public Integer getXlists() {
    return xlists;
  }
  public void setXlists(Integer xlists) {
    this.xlists = xlists;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SisImportCounts sisImportCounts = (SisImportCounts) o;
    return Objects.equals(this.abstractCourses, sisImportCounts.abstractCourses) &&
        Objects.equals(this.accounts, sisImportCounts.accounts) &&
        Objects.equals(this.batchCoursesDeleted, sisImportCounts.batchCoursesDeleted) &&
        Objects.equals(this.batchEnrollmentsDeleted, sisImportCounts.batchEnrollmentsDeleted) &&
        Objects.equals(this.batchSectionsDeleted, sisImportCounts.batchSectionsDeleted) &&
        Objects.equals(this.courses, sisImportCounts.courses) &&
        Objects.equals(this.enrollments, sisImportCounts.enrollments) &&
        Objects.equals(this.errorCount, sisImportCounts.errorCount) &&
        Objects.equals(this.gradePublishingResults, sisImportCounts.gradePublishingResults) &&
        Objects.equals(this.groupMemberships, sisImportCounts.groupMemberships) &&
        Objects.equals(this.groups, sisImportCounts.groups) &&
        Objects.equals(this.sections, sisImportCounts.sections) &&
        Objects.equals(this.terms, sisImportCounts.terms) &&
        Objects.equals(this.users, sisImportCounts.users) &&
        Objects.equals(this.warningCount, sisImportCounts.warningCount) &&
        Objects.equals(this.xlists, sisImportCounts.xlists);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(abstractCourses, accounts, batchCoursesDeleted, batchEnrollmentsDeleted, batchSectionsDeleted, courses, enrollments, errorCount, gradePublishingResults, groupMemberships, groups, sections, terms, users, warningCount, xlists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SisImportCounts {\n");
    
    sb.append("    abstractCourses: ").append(toIndentedString(abstractCourses)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    batchCoursesDeleted: ").append(toIndentedString(batchCoursesDeleted)).append("\n");
    sb.append("    batchEnrollmentsDeleted: ").append(toIndentedString(batchEnrollmentsDeleted)).append("\n");
    sb.append("    batchSectionsDeleted: ").append(toIndentedString(batchSectionsDeleted)).append("\n");
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    gradePublishingResults: ").append(toIndentedString(gradePublishingResults)).append("\n");
    sb.append("    groupMemberships: ").append(toIndentedString(groupMemberships)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    xlists: ").append(toIndentedString(xlists)).append("\n");
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
