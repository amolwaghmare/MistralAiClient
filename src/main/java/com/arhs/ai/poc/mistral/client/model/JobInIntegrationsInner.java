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
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Arrays;
import java.util.Objects;

/**
 * JobInIntegrationsInner
 */
@JsonPropertyOrder({
  JobInIntegrationsInner.JSON_PROPERTY_TYPE,
  JobInIntegrationsInner.JSON_PROPERTY_PROJECT,
  JobInIntegrationsInner.JSON_PROPERTY_NAME,
  JobInIntegrationsInner.JSON_PROPERTY_API_KEY,
  JobInIntegrationsInner.JSON_PROPERTY_RUN_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = WandbIntegration.class, name = "wandb"),
  @JsonSubTypes.Type(value = WandbIntegration.class, name = "WandbIntegration"),
})

public class JobInIntegrationsInner {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    WANDB(String.valueOf("wandb"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @jakarta.annotation.Nullable
  private TypeEnum type = TypeEnum.WANDB;

  public static final String JSON_PROPERTY_PROJECT = "project";
  @jakarta.annotation.Nonnull
  private String project;

  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_API_KEY = "api_key";
  @jakarta.annotation.Nonnull
  private String apiKey;

  public static final String JSON_PROPERTY_RUN_NAME = "run_name";
  @jakarta.annotation.Nullable
  private JsonNullable<String> runName = JsonNullable.<String>undefined();

  public JobInIntegrationsInner() {
  }

  public JobInIntegrationsInner type(@jakarta.annotation.Nullable TypeEnum type) {
    
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

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@jakarta.annotation.Nullable TypeEnum type) {
    this.type = type;
  }

  public JobInIntegrationsInner project(@jakarta.annotation.Nonnull String project) {
    
    this.project = project;
    return this;
  }

  /**
   * The name of the project that the new run will be created under.
   * @return project
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProject(@jakarta.annotation.Nonnull String project) {
    this.project = project;
  }

  public JobInIntegrationsInner name(@jakarta.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public JobInIntegrationsInner apiKey(@jakarta.annotation.Nonnull String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The WandB API key to use for authentication.
   * @return apiKey
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiKey(@jakarta.annotation.Nonnull String apiKey) {
    this.apiKey = apiKey;
  }

  public JobInIntegrationsInner runName(@jakarta.annotation.Nullable String runName) {
    this.runName = JsonNullable.<String>of(runName);
    
    return this;
  }

  /**
   * Get runName
   * @return runName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getRunName() {
        return runName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRunName_JsonNullable() {
    return runName;
  }
  
  @JsonProperty(JSON_PROPERTY_RUN_NAME)
  public void setRunName_JsonNullable(JsonNullable<String> runName) {
    this.runName = runName;
  }

  public void setRunName(@jakarta.annotation.Nullable String runName) {
    this.runName = JsonNullable.<String>of(runName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobInIntegrationsInner jobInIntegrationsInner = (JobInIntegrationsInner) o;
    return Objects.equals(this.type, jobInIntegrationsInner.type) &&
        Objects.equals(this.project, jobInIntegrationsInner.project) &&
        equalsNullable(this.name, jobInIntegrationsInner.name) &&
        Objects.equals(this.apiKey, jobInIntegrationsInner.apiKey) &&
        equalsNullable(this.runName, jobInIntegrationsInner.runName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, project, hashCodeNullable(name), apiKey, hashCodeNullable(runName));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInIntegrationsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    runName: ").append(toIndentedString(runName)).append("\n");
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

