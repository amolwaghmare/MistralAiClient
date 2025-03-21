/*
 * Mistral AI API
 * Our Chat Completion and Embeddings APIs specification. Create your account on [La Plateforme](https://console.mistral.ai) to get access and read the [docs](https://docs.mistral.ai) to learn how to use it.
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.arhs.ai.poc.mistral.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * UsageInfo
 */
@JsonPropertyOrder({
  UsageInfo.JSON_PROPERTY_PROMPT_TOKENS,
  UsageInfo.JSON_PROPERTY_COMPLETION_TOKENS,
  UsageInfo.JSON_PROPERTY_TOTAL_TOKENS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class UsageInfo {
  public static final String JSON_PROPERTY_PROMPT_TOKENS = "prompt_tokens";
  @jakarta.annotation.Nonnull
  private Integer promptTokens;

  public static final String JSON_PROPERTY_COMPLETION_TOKENS = "completion_tokens";
  @jakarta.annotation.Nonnull
  private Integer completionTokens;

  public static final String JSON_PROPERTY_TOTAL_TOKENS = "total_tokens";
  @jakarta.annotation.Nonnull
  private Integer totalTokens;

  public UsageInfo() {
  }

  public UsageInfo promptTokens(@jakarta.annotation.Nonnull Integer promptTokens) {
    
    this.promptTokens = promptTokens;
    return this;
  }

  /**
   * Get promptTokens
   * @return promptTokens
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROMPT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPromptTokens() {
    return promptTokens;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPromptTokens(@jakarta.annotation.Nonnull Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public UsageInfo completionTokens(@jakarta.annotation.Nonnull Integer completionTokens) {
    
    this.completionTokens = completionTokens;
    return this;
  }

  /**
   * Get completionTokens
   * @return completionTokens
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLETION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCompletionTokens() {
    return completionTokens;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompletionTokens(@jakarta.annotation.Nonnull Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public UsageInfo totalTokens(@jakarta.annotation.Nonnull Integer totalTokens) {
    
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * Get totalTokens
   * @return totalTokens
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalTokens() {
    return totalTokens;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalTokens(@jakarta.annotation.Nonnull Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageInfo usageInfo = (UsageInfo) o;
    return Objects.equals(this.promptTokens, usageInfo.promptTokens) &&
        Objects.equals(this.completionTokens, usageInfo.completionTokens) &&
        Objects.equals(this.totalTokens, usageInfo.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptTokens, completionTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageInfo {\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

