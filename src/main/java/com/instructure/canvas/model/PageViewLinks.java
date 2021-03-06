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
 * The links of a page view access in Canvas
 */
@Schema(description = "The links of a page view access in Canvas")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public class PageViewLinks {

  @JsonProperty("account")

  private Long account = null;

  @JsonProperty("asset")

  private Long asset = null;

  @JsonProperty("context")

  private Long context = null;

  @JsonProperty("real_user")

  private Long realUser = null;

  @JsonProperty("user")

  private Long user = null;
  public PageViewLinks account(Long account) {
    this.account = account;
    return this;
  }

  

  /**
  * The ID of the account context for this page view
  * @return account
  **/
  @Schema(example = "1234", description = "The ID of the account context for this page view")
  public Long getAccount() {
    return account;
  }
  public void setAccount(Long account) {
    this.account = account;
  }
  public PageViewLinks asset(Long asset) {
    this.asset = asset;
    return this;
  }

  

  /**
  * The ID of the asset for the request, if any
  * @return asset
  **/
  @Schema(example = "1234", description = "The ID of the asset for the request, if any")
  public Long getAsset() {
    return asset;
  }
  public void setAsset(Long asset) {
    this.asset = asset;
  }
  public PageViewLinks context(Long context) {
    this.context = context;
    return this;
  }

  

  /**
  * The ID of the context for the request (course id if context_type is Course, etc)
  * @return context
  **/
  @Schema(example = "1234", description = "The ID of the context for the request (course id if context_type is Course, etc)")
  public Long getContext() {
    return context;
  }
  public void setContext(Long context) {
    this.context = context;
  }
  public PageViewLinks realUser(Long realUser) {
    this.realUser = realUser;
    return this;
  }

  

  /**
  * The ID of the actual user who made this request, if the request was made by a user who was masquerading
  * @return realUser
  **/
  @Schema(example = "1234", description = "The ID of the actual user who made this request, if the request was made by a user who was masquerading")
  public Long getRealUser() {
    return realUser;
  }
  public void setRealUser(Long realUser) {
    this.realUser = realUser;
  }
  public PageViewLinks user(Long user) {
    this.user = user;
    return this;
  }

  

  /**
  * The ID of the user for this page view
  * @return user
  **/
  @Schema(example = "1234", description = "The ID of the user for this page view")
  public Long getUser() {
    return user;
  }
  public void setUser(Long user) {
    this.user = user;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageViewLinks pageViewLinks = (PageViewLinks) o;
    return Objects.equals(this.account, pageViewLinks.account) &&
        Objects.equals(this.asset, pageViewLinks.asset) &&
        Objects.equals(this.context, pageViewLinks.context) &&
        Objects.equals(this.realUser, pageViewLinks.realUser) &&
        Objects.equals(this.user, pageViewLinks.user);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(account, asset, context, realUser, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageViewLinks {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    realUser: ").append(toIndentedString(realUser)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
