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
import com.instructure.canvas.model.LockInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * ContentDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class ContentDetails {

  @JsonProperty("due_at")

  private OffsetDateTime dueAt = null;

  @JsonProperty("lock_at")

  private OffsetDateTime lockAt = null;

  @JsonProperty("lock_explanation")

  private String lockExplanation = null;

  @JsonProperty("lock_info")

  private LockInfo lockInfo = null;

  @JsonProperty("locked_for_user")

  private Boolean lockedForUser = null;

  @JsonProperty("points_possible")

  private Integer pointsPossible = null;

  @JsonProperty("unlock_at")

  private OffsetDateTime unlockAt = null;
  public ContentDetails dueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
    return this;
  }

  

  /**
  * Get dueAt
  * @return dueAt
  **/
  @Schema(description = "")
  public OffsetDateTime getDueAt() {
    return dueAt;
  }
  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }
  public ContentDetails lockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
    return this;
  }

  

  /**
  * Get lockAt
  * @return lockAt
  **/
  @Schema(description = "")
  public OffsetDateTime getLockAt() {
    return lockAt;
  }
  public void setLockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
  }
  public ContentDetails lockExplanation(String lockExplanation) {
    this.lockExplanation = lockExplanation;
    return this;
  }

  

  /**
  * Get lockExplanation
  * @return lockExplanation
  **/
  @Schema(example = "This quiz is part of an unpublished module and is not available yet.", description = "")
  public String getLockExplanation() {
    return lockExplanation;
  }
  public void setLockExplanation(String lockExplanation) {
    this.lockExplanation = lockExplanation;
  }
  public ContentDetails lockInfo(LockInfo lockInfo) {
    this.lockInfo = lockInfo;
    return this;
  }

  

  /**
  * Get lockInfo
  * @return lockInfo
  **/
  @Schema(description = "")
  public LockInfo getLockInfo() {
    return lockInfo;
  }
  public void setLockInfo(LockInfo lockInfo) {
    this.lockInfo = lockInfo;
  }
  public ContentDetails lockedForUser(Boolean lockedForUser) {
    this.lockedForUser = lockedForUser;
    return this;
  }

  

  /**
  * Get lockedForUser
  * @return lockedForUser
  **/
  @Schema(example = "true", description = "")
  public Boolean isLockedForUser() {
    return lockedForUser;
  }
  public void setLockedForUser(Boolean lockedForUser) {
    this.lockedForUser = lockedForUser;
  }
  public ContentDetails pointsPossible(Integer pointsPossible) {
    this.pointsPossible = pointsPossible;
    return this;
  }

  

  /**
  * Get pointsPossible
  * @return pointsPossible
  **/
  @Schema(example = "20", description = "")
  public Integer getPointsPossible() {
    return pointsPossible;
  }
  public void setPointsPossible(Integer pointsPossible) {
    this.pointsPossible = pointsPossible;
  }
  public ContentDetails unlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
    return this;
  }

  

  /**
  * Get unlockAt
  * @return unlockAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUnlockAt() {
    return unlockAt;
  }
  public void setUnlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentDetails contentDetails = (ContentDetails) o;
    return Objects.equals(this.dueAt, contentDetails.dueAt) &&
        Objects.equals(this.lockAt, contentDetails.lockAt) &&
        Objects.equals(this.lockExplanation, contentDetails.lockExplanation) &&
        Objects.equals(this.lockInfo, contentDetails.lockInfo) &&
        Objects.equals(this.lockedForUser, contentDetails.lockedForUser) &&
        Objects.equals(this.pointsPossible, contentDetails.pointsPossible) &&
        Objects.equals(this.unlockAt, contentDetails.unlockAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(dueAt, lockAt, lockExplanation, lockInfo, lockedForUser, pointsPossible, unlockAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentDetails {\n");
    
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    lockExplanation: ").append(toIndentedString(lockExplanation)).append("\n");
    sb.append("    lockInfo: ").append(toIndentedString(lockInfo)).append("\n");
    sb.append("    lockedForUser: ").append(toIndentedString(lockedForUser)).append("\n");
    sb.append("    pointsPossible: ").append(toIndentedString(pointsPossible)).append("\n");
    sb.append("    unlockAt: ").append(toIndentedString(unlockAt)).append("\n");
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