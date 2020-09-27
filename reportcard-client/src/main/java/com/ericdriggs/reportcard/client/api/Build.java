/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ericdriggs.reportcard.client.api;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Build
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-26T23:36:11.148-07:00")
public class Build {
  @JsonProperty("appBranchFk")
  private Integer appBranchFk = null;

  @JsonProperty("buildCreated")
  private DateTime buildCreated = null;

  @JsonProperty("buildId")
  private Long buildId = null;

  @JsonProperty("buildUniqueString")
  private String buildUniqueString = null;

  @JsonProperty("buildUniqueStringShort")
  private String buildUniqueStringShort = null;

  public Build appBranchFk(Integer appBranchFk) {
    this.appBranchFk = appBranchFk;
    return this;
  }

   /**
   * Get appBranchFk
   * @return appBranchFk
  **/
  @ApiModelProperty(value = "")
  public Integer getAppBranchFk() {
    return appBranchFk;
  }

  public void setAppBranchFk(Integer appBranchFk) {
    this.appBranchFk = appBranchFk;
  }

  public Build buildCreated(DateTime buildCreated) {
    this.buildCreated = buildCreated;
    return this;
  }

   /**
   * Get buildCreated
   * @return buildCreated
  **/
  @ApiModelProperty(value = "")
  public DateTime getBuildCreated() {
    return buildCreated;
  }

  public void setBuildCreated(DateTime buildCreated) {
    this.buildCreated = buildCreated;
  }

  public Build buildId(Long buildId) {
    this.buildId = buildId;
    return this;
  }

   /**
   * Get buildId
   * @return buildId
  **/
  @ApiModelProperty(value = "")
  public Long getBuildId() {
    return buildId;
  }

  public void setBuildId(Long buildId) {
    this.buildId = buildId;
  }

  public Build buildUniqueString(String buildUniqueString) {
    this.buildUniqueString = buildUniqueString;
    return this;
  }

   /**
   * Get buildUniqueString
   * @return buildUniqueString
  **/
  @ApiModelProperty(value = "")
  public String getBuildUniqueString() {
    return buildUniqueString;
  }

  public void setBuildUniqueString(String buildUniqueString) {
    this.buildUniqueString = buildUniqueString;
  }

  public Build buildUniqueStringShort(String buildUniqueStringShort) {
    this.buildUniqueStringShort = buildUniqueStringShort;
    return this;
  }

   /**
   * Get buildUniqueStringShort
   * @return buildUniqueStringShort
  **/
  @ApiModelProperty(value = "")
  public String getBuildUniqueStringShort() {
    return buildUniqueStringShort;
  }

  public void setBuildUniqueStringShort(String buildUniqueStringShort) {
    this.buildUniqueStringShort = buildUniqueStringShort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Build build = (Build) o;
    return Objects.equals(this.appBranchFk, build.appBranchFk) &&
        Objects.equals(this.buildCreated, build.buildCreated) &&
        Objects.equals(this.buildId, build.buildId) &&
        Objects.equals(this.buildUniqueString, build.buildUniqueString) &&
        Objects.equals(this.buildUniqueStringShort, build.buildUniqueStringShort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appBranchFk, buildCreated, buildId, buildUniqueString, buildUniqueStringShort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Build {\n");
    
    sb.append("    appBranchFk: ").append(toIndentedString(appBranchFk)).append("\n");
    sb.append("    buildCreated: ").append(toIndentedString(buildCreated)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    buildUniqueString: ").append(toIndentedString(buildUniqueString)).append("\n");
    sb.append("    buildUniqueStringShort: ").append(toIndentedString(buildUniqueStringShort)).append("\n");
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
