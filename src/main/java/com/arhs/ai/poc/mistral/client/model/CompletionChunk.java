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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CompletionChunk
 */
@JsonPropertyOrder({
  CompletionChunk.JSON_PROPERTY_ID,
  CompletionChunk.JSON_PROPERTY_OBJECT,
  CompletionChunk.JSON_PROPERTY_CREATED,
  CompletionChunk.JSON_PROPERTY_MODEL,
  CompletionChunk.JSON_PROPERTY_USAGE,
  CompletionChunk.JSON_PROPERTY_CHOICES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class CompletionChunk {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  @jakarta.annotation.Nullable
  private String _object;

  public static final String JSON_PROPERTY_CREATED = "created";
  @jakarta.annotation.Nullable
  private Integer created;

  public static final String JSON_PROPERTY_MODEL = "model";
  @jakarta.annotation.Nonnull
  private String model;

  public static final String JSON_PROPERTY_USAGE = "usage";
  @jakarta.annotation.Nullable
  private UsageInfo usage;

  public static final String JSON_PROPERTY_CHOICES = "choices";
  @jakarta.annotation.Nonnull
  private List<CompletionResponseStreamChoice> choices = new ArrayList<>();

  public CompletionChunk() {
  }

  public CompletionChunk id(@jakarta.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@jakarta.annotation.Nonnull String id) {
    this.id = id;
  }

  public CompletionChunk _object(@jakarta.annotation.Nullable String _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(@jakarta.annotation.Nullable String _object) {
    this._object = _object;
  }

  public CompletionChunk created(@jakarta.annotation.Nullable Integer created) {
    
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(@jakarta.annotation.Nullable Integer created) {
    this.created = created;
  }

  public CompletionChunk model(@jakarta.annotation.Nonnull String model) {
    
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(@jakarta.annotation.Nonnull String model) {
    this.model = model;
  }

  public CompletionChunk usage(@jakarta.annotation.Nullable UsageInfo usage) {
    
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageInfo getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(@jakarta.annotation.Nullable UsageInfo usage) {
    this.usage = usage;
  }

  public CompletionChunk choices(@jakarta.annotation.Nonnull List<CompletionResponseStreamChoice> choices) {
    
    this.choices = choices;
    return this;
  }

  public CompletionChunk addChoicesItem(CompletionResponseStreamChoice choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * Get choices
   * @return choices
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHOICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CompletionResponseStreamChoice> getChoices() {
    return choices;
  }


  @JsonProperty(JSON_PROPERTY_CHOICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChoices(@jakarta.annotation.Nonnull List<CompletionResponseStreamChoice> choices) {
    this.choices = choices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionChunk completionChunk = (CompletionChunk) o;
    return Objects.equals(this.id, completionChunk.id) &&
        Objects.equals(this._object, completionChunk._object) &&
        Objects.equals(this.created, completionChunk.created) &&
        Objects.equals(this.model, completionChunk.model) &&
        Objects.equals(this.usage, completionChunk.usage) &&
        Objects.equals(this.choices, completionChunk.choices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, model, usage, choices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionChunk {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
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

