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
import org.openapitools.client.model.ApiKeyData;
import org.openapitools.client.model.UserData;

/**
 * UserInfoResponseModel
 */
@ApiModel(description = "UserInfoResponseModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-19T06:19:02.654880600-07:00[America/Los_Angeles]")
public class UserInfoResponseModel {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code = 200;

  public static final String SERIALIZED_NAME_ROUTER = "router";
  @SerializedName(SERIALIZED_NAME_ROUTER)
  private String router = "";

  public static final String SERIALIZED_NAME_API_KEY_DATA = "api_key_data";
  @SerializedName(SERIALIZED_NAME_API_KEY_DATA)
  private ApiKeyData apiKeyData;

  public static final String SERIALIZED_NAME_USER_DATA = "user_data";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private UserData userData;


  public UserInfoResponseModel code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code，HTTP status code | HTTP状态码
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code，HTTP status code | HTTP状态码")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public UserInfoResponseModel router(String router) {
    
    this.router = router;
    return this;
  }

   /**
   * Router，The endpoint that generated this response | 生成此响应的端点
   * @return router
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Router，The endpoint that generated this response | 生成此响应的端点")

  public String getRouter() {
    return router;
  }


  public void setRouter(String router) {
    this.router = router;
  }


  public UserInfoResponseModel apiKeyData(ApiKeyData apiKeyData) {
    
    this.apiKeyData = apiKeyData;
    return this;
  }

   /**
   * Get apiKeyData
   * @return apiKeyData
  **/
  @ApiModelProperty(required = true, value = "")

  public ApiKeyData getApiKeyData() {
    return apiKeyData;
  }


  public void setApiKeyData(ApiKeyData apiKeyData) {
    this.apiKeyData = apiKeyData;
  }


  public UserInfoResponseModel userData(UserData userData) {
    
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(required = true, value = "")

  public UserData getUserData() {
    return userData;
  }


  public void setUserData(UserData userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoResponseModel userInfoResponseModel = (UserInfoResponseModel) o;
    return Objects.equals(this.code, userInfoResponseModel.code) &&
        Objects.equals(this.router, userInfoResponseModel.router) &&
        Objects.equals(this.apiKeyData, userInfoResponseModel.apiKeyData) &&
        Objects.equals(this.userData, userInfoResponseModel.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, router, apiKeyData, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    router: ").append(toIndentedString(router)).append("\n");
    sb.append("    apiKeyData: ").append(toIndentedString(apiKeyData)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

