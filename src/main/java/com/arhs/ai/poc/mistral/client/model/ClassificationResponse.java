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
 * ClassificationResponse
 */
@JsonPropertyOrder({
  ClassificationResponse.JSON_PROPERTY_ID,
  ClassificationResponse.JSON_PROPERTY_MODEL,
  ClassificationResponse.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class ClassificationResponse {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_MODEL = "model";
  @jakarta.annotation.Nullable
  private String model;

  public static final String JSON_PROPERTY_RESULTS = "results";
  @jakarta.annotation.Nullable
  private List<String> results = new ArrayList<>();

  public ClassificationResponse() {
  }

  public ClassificationResponse id(@jakarta.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable String id) {
    this.id = id;
  }

  public ClassificationResponse model(@jakarta.annotation.Nullable String model) {
    
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModel(@jakarta.annotation.Nullable String model) {
    this.model = model;
  }

  public ClassificationResponse results(@jakarta.annotation.Nullable List<String> results) {
    
    this.results = results;
    return this;
  }

  public ClassificationResponse addResultsItem(String resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(@jakarta.annotation.Nullable List<String> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationResponse classificationResponse = (ClassificationResponse) o;
    return Objects.equals(this.id, classificationResponse.id) &&
        Objects.equals(this.model, classificationResponse.model) &&
        Objects.equals(this.results, classificationResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

