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
import org.threeten.bp.OffsetDateTime;

/**
 * LockInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class LockInfo {

  @JsonProperty("asset_string")

  private String assetString = null;

  @JsonProperty("context_module")

  private String contextModule = null;

  @JsonProperty("lock_at")

  private OffsetDateTime lockAt = null;

  @JsonProperty("manually_locked")

  private Boolean manuallyLocked = null;

  @JsonProperty("unlock_at")

  private OffsetDateTime unlockAt = null;
  public LockInfo assetString(String assetString) {
    this.assetString = assetString;
    return this;
  }

  

  /**
  * Asset string for the object causing the lock
  * @return assetString
  **/
  @Schema(example = "assignment_4", description = "Asset string for the object causing the lock")
  public String getAssetString() {
    return assetString;
  }
  public void setAssetString(String assetString) {
    this.assetString = assetString;
  }
  public LockInfo contextModule(String contextModule) {
    this.contextModule = contextModule;
    return this;
  }

  

  /**
  * (Optional) Context module causing the lock.
  * @return contextModule
  **/
  @Schema(example = "{}", description = "(Optional) Context module causing the lock.")
  public String getContextModule() {
    return contextModule;
  }
  public void setContextModule(String contextModule) {
    this.contextModule = contextModule;
  }
  public LockInfo lockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
    return this;
  }

  

  /**
  * (Optional) Time at which this was/will be locked. Must be after the due date.
  * @return lockAt
  **/
  @Schema(description = "(Optional) Time at which this was/will be locked. Must be after the due date.")
  public OffsetDateTime getLockAt() {
    return lockAt;
  }
  public void setLockAt(OffsetDateTime lockAt) {
    this.lockAt = lockAt;
  }
  public LockInfo manuallyLocked(Boolean manuallyLocked) {
    this.manuallyLocked = manuallyLocked;
    return this;
  }

  

  /**
  * Get manuallyLocked
  * @return manuallyLocked
  **/
  @Schema(example = "true", description = "")
  public Boolean isManuallyLocked() {
    return manuallyLocked;
  }
  public void setManuallyLocked(Boolean manuallyLocked) {
    this.manuallyLocked = manuallyLocked;
  }
  public LockInfo unlockAt(OffsetDateTime unlockAt) {
    this.unlockAt = unlockAt;
    return this;
  }

  

  /**
  * (Optional) Time at which this was/will be unlocked. Must be before the due date.
  * @return unlockAt
  **/
  @Schema(description = "(Optional) Time at which this was/will be unlocked. Must be before the due date.")
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
    LockInfo lockInfo = (LockInfo) o;
    return Objects.equals(this.assetString, lockInfo.assetString) &&
        Objects.equals(this.contextModule, lockInfo.contextModule) &&
        Objects.equals(this.lockAt, lockInfo.lockAt) &&
        Objects.equals(this.manuallyLocked, lockInfo.manuallyLocked) &&
        Objects.equals(this.unlockAt, lockInfo.unlockAt);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(assetString, contextModule, lockAt, manuallyLocked, unlockAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockInfo {\n");
    
    sb.append("    assetString: ").append(toIndentedString(assetString)).append("\n");
    sb.append("    contextModule: ").append(toIndentedString(contextModule)).append("\n");
    sb.append("    lockAt: ").append(toIndentedString(lockAt)).append("\n");
    sb.append("    manuallyLocked: ").append(toIndentedString(manuallyLocked)).append("\n");
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
