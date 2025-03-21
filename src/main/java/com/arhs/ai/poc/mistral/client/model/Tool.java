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
 * Tool
 */
@JsonPropertyOrder({
  Tool.JSON_PROPERTY_TYPE,
  Tool.JSON_PROPERTY_FUNCTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class Tool {
  public static final String JSON_PROPERTY_TYPE = "type";
  @jakarta.annotation.Nullable
  private ToolTypes type;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  @jakarta.annotation.Nonnull
  private Function function;

  public Tool() {
  }

  public Tool type(@jakarta.annotation.Nullable ToolTypes type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ToolTypes getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@jakarta.annotation.Nullable ToolTypes type) {
    this.type = type;
  }

  public Tool function(@jakarta.annotation.Nonnull Function function) {
    
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Function getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFunction(@jakarta.annotation.Nonnull Function function) {
    this.function = function;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.type, tool.type) &&
        Objects.equals(this.function, tool.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

