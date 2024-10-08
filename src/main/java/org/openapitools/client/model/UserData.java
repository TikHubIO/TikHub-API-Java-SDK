/*
 * Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 * High-performance asynchronous Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * UserData
 */
@ApiModel(description = "UserData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-19T06:19:02.654880600-07:00[America/Los_Angeles]")
public class UserData {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_FREE_CREDIT = "free_credit";
  @SerializedName(SERIALIZED_NAME_FREE_CREDIT)
  private BigDecimal freeCredit;

  public static final String SERIALIZED_NAME_EMAIL_VERIFIED = "email_verified";
  @SerializedName(SERIALIZED_NAME_EMAIL_VERIFIED)
  private Boolean emailVerified;

  public static final String SERIALIZED_NAME_ACCOUNT_DISABLED = "account_disabled";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DISABLED)
  private Boolean accountDisabled;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;


  public UserData email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserData balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "Balance")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public UserData freeCredit(BigDecimal freeCredit) {
    
    this.freeCredit = freeCredit;
    return this;
  }

   /**
   * Free Credit
   * @return freeCredit
  **/
  @ApiModelProperty(required = true, value = "Free Credit")

  public BigDecimal getFreeCredit() {
    return freeCredit;
  }


  public void setFreeCredit(BigDecimal freeCredit) {
    this.freeCredit = freeCredit;
  }


  public UserData emailVerified(Boolean emailVerified) {
    
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Email Verified
   * @return emailVerified
  **/
  @ApiModelProperty(required = true, value = "Email Verified")

  public Boolean getEmailVerified() {
    return emailVerified;
  }


  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public UserData accountDisabled(Boolean accountDisabled) {
    
    this.accountDisabled = accountDisabled;
    return this;
  }

   /**
   * Account Disabled
   * @return accountDisabled
  **/
  @ApiModelProperty(required = true, value = "Account Disabled")

  public Boolean getAccountDisabled() {
    return accountDisabled;
  }


  public void setAccountDisabled(Boolean accountDisabled) {
    this.accountDisabled = accountDisabled;
  }


  public UserData isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Is Active
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "Is Active")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserData userData = (UserData) o;
    return Objects.equals(this.email, userData.email) &&
        Objects.equals(this.balance, userData.balance) &&
        Objects.equals(this.freeCredit, userData.freeCredit) &&
        Objects.equals(this.emailVerified, userData.emailVerified) &&
        Objects.equals(this.accountDisabled, userData.accountDisabled) &&
        Objects.equals(this.isActive, userData.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, balance, freeCredit, emailVerified, accountDisabled, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    freeCredit: ").append(toIndentedString(freeCredit)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    accountDisabled: ").append(toIndentedString(accountDisabled)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

