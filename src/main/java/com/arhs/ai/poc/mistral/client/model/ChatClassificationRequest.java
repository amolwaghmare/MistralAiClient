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
 * ChatClassificationRequest
 */
@JsonPropertyOrder({
  ChatClassificationRequest.JSON_PROPERTY_INPUT,
  ChatClassificationRequest.JSON_PROPERTY_MODEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class ChatClassificationRequest {
  public static final String JSON_PROPERTY_INPUT = "input";
  @jakarta.annotation.Nonnull
  private Input1 input;

  public static final String JSON_PROPERTY_MODEL = "model";
  @jakarta.annotation.Nullable
  private String model;

  public ChatClassificationRequest() {
  }

  public ChatClassificationRequest input(@jakarta.annotation.Nonnull Input1 input) {
    
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Input1 getInput() {
    return input;
  }


  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInput(@jakarta.annotation.Nonnull Input1 input) {
    this.input = input;
  }

  public ChatClassificationRequest model(@jakarta.annotation.Nullable String model) {
    
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(@jakarta.annotation.Nullable String model) {
    this.model = model;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatClassificationRequest chatClassificationRequest = (ChatClassificationRequest) o;
    return Objects.equals(this.input, chatClassificationRequest.input) &&
        Objects.equals(this.model, chatClassificationRequest.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatClassificationRequest {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

