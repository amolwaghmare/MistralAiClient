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

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;

/**
 * CompletionResponseStreamChoice
 */
@JsonPropertyOrder({
  CompletionResponseStreamChoice.JSON_PROPERTY_INDEX,
  CompletionResponseStreamChoice.JSON_PROPERTY_DELTA,
  CompletionResponseStreamChoice.JSON_PROPERTY_FINISH_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class CompletionResponseStreamChoice {
  public static final String JSON_PROPERTY_INDEX = "index";
  @jakarta.annotation.Nonnull
  private Integer index;

  public static final String JSON_PROPERTY_DELTA = "delta";
  @jakarta.annotation.Nonnull
  private DeltaMessage delta;

  /**
   * Gets or Sets finishReason
   */
  public enum FinishReasonEnum {
    STOP(String.valueOf("stop")),
    
    LENGTH(String.valueOf("length")),
    
    ERROR(String.valueOf("error")),
    
    TOOL_CALLS(String.valueOf("tool_calls"));

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FinishReasonEnum fromValue(String value) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_FINISH_REASON = "finish_reason";
  @jakarta.annotation.Nullable
  private FinishReasonEnum finishReason;

  public CompletionResponseStreamChoice() {
  }

  public CompletionResponseStreamChoice index(@jakarta.annotation.Nonnull Integer index) {
    
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(@jakarta.annotation.Nonnull Integer index) {
    this.index = index;
  }

  public CompletionResponseStreamChoice delta(@jakarta.annotation.Nonnull DeltaMessage delta) {
    
    this.delta = delta;
    return this;
  }

  /**
   * Get delta
   * @return delta
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DeltaMessage getDelta() {
    return delta;
  }


  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelta(@jakarta.annotation.Nonnull DeltaMessage delta) {
    this.delta = delta;
  }

  public CompletionResponseStreamChoice finishReason(@jakarta.annotation.Nullable FinishReasonEnum finishReason) {
    
    this.finishReason = finishReason;
    return this;
  }

  /**
   * Get finishReason
   * @return finishReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISH_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }


  @JsonProperty(JSON_PROPERTY_FINISH_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinishReason(@jakarta.annotation.Nullable FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionResponseStreamChoice completionResponseStreamChoice = (CompletionResponseStreamChoice) o;
    return Objects.equals(this.index, completionResponseStreamChoice.index) &&
        Objects.equals(this.delta, completionResponseStreamChoice.delta) &&
        Objects.equals(this.finishReason, completionResponseStreamChoice.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, delta, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionResponseStreamChoice {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

