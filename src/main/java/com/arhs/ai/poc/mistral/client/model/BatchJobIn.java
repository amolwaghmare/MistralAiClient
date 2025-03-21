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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.*;

/**
 * BatchJobIn
 */
@JsonPropertyOrder({
  BatchJobIn.JSON_PROPERTY_INPUT_FILES,
  BatchJobIn.JSON_PROPERTY_ENDPOINT,
  BatchJobIn.JSON_PROPERTY_MODEL,
  BatchJobIn.JSON_PROPERTY_METADATA,
  BatchJobIn.JSON_PROPERTY_TIMEOUT_HOURS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class BatchJobIn {
  public static final String JSON_PROPERTY_INPUT_FILES = "input_files";
  @jakarta.annotation.Nonnull
  private List<UUID> inputFiles = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  @jakarta.annotation.Nonnull
  private ApiEndpoint endpoint;

  public static final String JSON_PROPERTY_MODEL = "model";
  @jakarta.annotation.Nonnull
  private String model;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nullable
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_TIMEOUT_HOURS = "timeout_hours";
  @jakarta.annotation.Nullable
  private Integer timeoutHours = 24;

  public BatchJobIn() {
  }

  public BatchJobIn inputFiles(@jakarta.annotation.Nonnull List<UUID> inputFiles) {
    
    this.inputFiles = inputFiles;
    return this;
  }

  public BatchJobIn addInputFilesItem(UUID inputFilesItem) {
    if (this.inputFiles == null) {
      this.inputFiles = new ArrayList<>();
    }
    this.inputFiles.add(inputFilesItem);
    return this;
  }

  /**
   * Get inputFiles
   * @return inputFiles
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UUID> getInputFiles() {
    return inputFiles;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputFiles(@jakarta.annotation.Nonnull List<UUID> inputFiles) {
    this.inputFiles = inputFiles;
  }

  public BatchJobIn endpoint(@jakarta.annotation.Nonnull ApiEndpoint endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ApiEndpoint getEndpoint() {
    return endpoint;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndpoint(@jakarta.annotation.Nonnull ApiEndpoint endpoint) {
    this.endpoint = endpoint;
  }

  public BatchJobIn model(@jakarta.annotation.Nonnull String model) {
    
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

  public BatchJobIn metadata(@jakarta.annotation.Nullable Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    
    return this;
  }

  public BatchJobIn putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, String>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(@jakarta.annotation.Nullable Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
  }

  public BatchJobIn timeoutHours(@jakarta.annotation.Nullable Integer timeoutHours) {
    
    this.timeoutHours = timeoutHours;
    return this;
  }

  /**
   * Get timeoutHours
   * @return timeoutHours
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutHours() {
    return timeoutHours;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutHours(@jakarta.annotation.Nullable Integer timeoutHours) {
    this.timeoutHours = timeoutHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchJobIn batchJobIn = (BatchJobIn) o;
    return Objects.equals(this.inputFiles, batchJobIn.inputFiles) &&
        Objects.equals(this.endpoint, batchJobIn.endpoint) &&
        Objects.equals(this.model, batchJobIn.model) &&
        equalsNullable(this.metadata, batchJobIn.metadata) &&
        Objects.equals(this.timeoutHours, batchJobIn.timeoutHours);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFiles, endpoint, model, hashCodeNullable(metadata), timeoutHours);
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
    sb.append("class BatchJobIn {\n");
    sb.append("    inputFiles: ").append(toIndentedString(inputFiles)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    timeoutHours: ").append(toIndentedString(timeoutHours)).append("\n");
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

