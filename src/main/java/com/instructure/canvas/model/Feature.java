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
import com.instructure.canvas.model.FeatureFlag;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * Feature
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class Feature {

  @JsonProperty("applies_to")

  private String appliesTo = null;

  @JsonProperty("autoexpand")

  private Boolean autoexpand = null;

  @JsonProperty("beta")

  private Boolean beta = null;

  @JsonProperty("development")

  private Boolean development = null;

  @JsonProperty("display_name")

  private String displayName = null;

  @JsonProperty("enable_at")

  private OffsetDateTime enableAt = null;

  @JsonProperty("feature_flag")

  private FeatureFlag featureFlag = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("release_notes_url")

  private String releaseNotesUrl = null;

  @JsonProperty("root_opt_in")

  private Boolean rootOptIn = null;
  public Feature appliesTo(String appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

  

  /**
  * The type of object the feature applies to (RootAccount, Account, Course, or User):  * RootAccount features may only be controlled by flags on root accounts.  * Account features may be controlled by flags on accounts and their parent accounts.  * Course features may be controlled by flags on courses and their parent accounts.  * User features may be controlled by flags on users and site admin only.
  * @return appliesTo
  **/
  @Schema(example = "Course", description = "The type of object the feature applies to (RootAccount, Account, Course, or User):  * RootAccount features may only be controlled by flags on root accounts.  * Account features may be controlled by flags on accounts and their parent accounts.  * Course features may be controlled by flags on courses and their parent accounts.  * User features may be controlled by flags on users and site admin only.")
  public String getAppliesTo() {
    return appliesTo;
  }
  public void setAppliesTo(String appliesTo) {
    this.appliesTo = appliesTo;
  }
  public Feature autoexpand(Boolean autoexpand) {
    this.autoexpand = autoexpand;
    return this;
  }

  

  /**
  * Whether the details of the feature are autoexpanded on page load vs. the user clicking to expand.
  * @return autoexpand
  **/
  @Schema(example = "true", description = "Whether the details of the feature are autoexpanded on page load vs. the user clicking to expand.")
  public Boolean isAutoexpand() {
    return autoexpand;
  }
  public void setAutoexpand(Boolean autoexpand) {
    this.autoexpand = autoexpand;
  }
  public Feature beta(Boolean beta) {
    this.beta = beta;
    return this;
  }

  

  /**
  * Whether the feature is a beta feature. If true, the feature may not be fully polished and may be subject to change in the future.
  * @return beta
  **/
  @Schema(example = "true", description = "Whether the feature is a beta feature. If true, the feature may not be fully polished and may be subject to change in the future.")
  public Boolean isBeta() {
    return beta;
  }
  public void setBeta(Boolean beta) {
    this.beta = beta;
  }
  public Feature development(Boolean development) {
    this.development = development;
    return this;
  }

  

  /**
  * Whether the feature is in active development. Features in this state are only visible in test and beta instances and are not yet available for production use.
  * @return development
  **/
  @Schema(example = "false", description = "Whether the feature is in active development. Features in this state are only visible in test and beta instances and are not yet available for production use.")
  public Boolean isDevelopment() {
    return development;
  }
  public void setDevelopment(Boolean development) {
    this.development = development;
  }
  public Feature displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  

  /**
  * The user-visible name of the feature
  * @return displayName
  **/
  @Schema(example = "Fancy Wickets", description = "The user-visible name of the feature")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public Feature enableAt(OffsetDateTime enableAt) {
    this.enableAt = enableAt;
    return this;
  }

  

  /**
  * The date this feature will be globally enabled, or null if this is not planned. (This information is subject to change.)
  * @return enableAt
  **/
  @Schema(description = "The date this feature will be globally enabled, or null if this is not planned. (This information is subject to change.)")
  public OffsetDateTime getEnableAt() {
    return enableAt;
  }
  public void setEnableAt(OffsetDateTime enableAt) {
    this.enableAt = enableAt;
  }
  public Feature featureFlag(FeatureFlag featureFlag) {
    this.featureFlag = featureFlag;
    return this;
  }

  

  /**
  * Get featureFlag
  * @return featureFlag
  **/
  @Schema(description = "")
  public FeatureFlag getFeatureFlag() {
    return featureFlag;
  }
  public void setFeatureFlag(FeatureFlag featureFlag) {
    this.featureFlag = featureFlag;
  }
  public Feature name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The symbolic name of the feature, used in FeatureFlags
  * @return name
  **/
  @Schema(example = "fancy_wickets", description = "The symbolic name of the feature, used in FeatureFlags")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Feature releaseNotesUrl(String releaseNotesUrl) {
    this.releaseNotesUrl = releaseNotesUrl;
    return this;
  }

  

  /**
  * A URL to the release notes describing the feature
  * @return releaseNotesUrl
  **/
  @Schema(example = "http://canvas.example.com/release_notes#fancy_wickets", description = "A URL to the release notes describing the feature")
  public String getReleaseNotesUrl() {
    return releaseNotesUrl;
  }
  public void setReleaseNotesUrl(String releaseNotesUrl) {
    this.releaseNotesUrl = releaseNotesUrl;
  }
  public Feature rootOptIn(Boolean rootOptIn) {
    this.rootOptIn = rootOptIn;
    return this;
  }

  

  /**
  * If true, a feature that is &#x27;allowed&#x27; globally will be &#x27;off&#x27; by default in root accounts. Otherwise, root accounts inherit the global &#x27;allowed&#x27; setting, which allows sub-accounts and courses to turn features on with no root account action.
  * @return rootOptIn
  **/
  @Schema(example = "true", description = "If true, a feature that is 'allowed' globally will be 'off' by default in root accounts. Otherwise, root accounts inherit the global 'allowed' setting, which allows sub-accounts and courses to turn features on with no root account action.")
  public Boolean isRootOptIn() {
    return rootOptIn;
  }
  public void setRootOptIn(Boolean rootOptIn) {
    this.rootOptIn = rootOptIn;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.appliesTo, feature.appliesTo) &&
        Objects.equals(this.autoexpand, feature.autoexpand) &&
        Objects.equals(this.beta, feature.beta) &&
        Objects.equals(this.development, feature.development) &&
        Objects.equals(this.displayName, feature.displayName) &&
        Objects.equals(this.enableAt, feature.enableAt) &&
        Objects.equals(this.featureFlag, feature.featureFlag) &&
        Objects.equals(this.name, feature.name) &&
        Objects.equals(this.releaseNotesUrl, feature.releaseNotesUrl) &&
        Objects.equals(this.rootOptIn, feature.rootOptIn);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(appliesTo, autoexpand, beta, development, displayName, enableAt, featureFlag, name, releaseNotesUrl, rootOptIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
    sb.append("    autoexpand: ").append(toIndentedString(autoexpand)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enableAt: ").append(toIndentedString(enableAt)).append("\n");
    sb.append("    featureFlag: ").append(toIndentedString(featureFlag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseNotesUrl: ").append(toIndentedString(releaseNotesUrl)).append("\n");
    sb.append("    rootOptIn: ").append(toIndentedString(rootOptIn)).append("\n");
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
