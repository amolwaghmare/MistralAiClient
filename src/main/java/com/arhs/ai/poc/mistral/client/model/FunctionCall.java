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
 * FunctionCall
 */
@JsonPropertyOrder({
  FunctionCall.JSON_PROPERTY_NAME,
  FunctionCall.JSON_PROPERTY_ARGUMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class FunctionCall {
  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  @jakarta.annotation.Nonnull
  private Arguments arguments;

  public FunctionCall() {
  }

  public FunctionCall name(@jakarta.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }

  public FunctionCall arguments(@jakarta.annotation.Nonnull Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

  /**
   * Get arguments
   * @return arguments
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Arguments getArguments() {
    return arguments;
  }


  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArguments(@jakarta.annotation.Nonnull Arguments arguments) {
    this.arguments = arguments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionCall functionCall = (FunctionCall) o;
    return Objects.equals(this.name, functionCall.name) &&
        Objects.equals(this.arguments, functionCall.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionCall {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

