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

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClassificationObject
 */
@JsonPropertyOrder({
  ClassificationObject.JSON_PROPERTY_CATEGORIES,
  ClassificationObject.JSON_PROPERTY_CATEGORY_SCORES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class ClassificationObject {
  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  @jakarta.annotation.Nullable
  private Map<String, Boolean> categories = new HashMap<>();

  public static final String JSON_PROPERTY_CATEGORY_SCORES = "category_scores";
  @jakarta.annotation.Nullable
  private Map<String, BigDecimal> categoryScores = new HashMap<>();

  public ClassificationObject() {
  }

  public ClassificationObject categories(@jakarta.annotation.Nullable Map<String, Boolean> categories) {
    
    this.categories = categories;
    return this;
  }

  public ClassificationObject putCategoriesItem(String key, Boolean categoriesItem) {
    if (this.categories == null) {
      this.categories = new HashMap<>();
    }
    this.categories.put(key, categoriesItem);
    return this;
  }

  /**
   * Classifier result thresholded
   * @return categories
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Boolean> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(@jakarta.annotation.Nullable Map<String, Boolean> categories) {
    this.categories = categories;
  }

  public ClassificationObject categoryScores(@jakarta.annotation.Nullable Map<String, BigDecimal> categoryScores) {
    
    this.categoryScores = categoryScores;
    return this;
  }

  public ClassificationObject putCategoryScoresItem(String key, BigDecimal categoryScoresItem) {
    if (this.categoryScores == null) {
      this.categoryScores = new HashMap<>();
    }
    this.categoryScores.put(key, categoryScoresItem);
    return this;
  }

  /**
   * Classifier result
   * @return categoryScores
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, BigDecimal> getCategoryScores() {
    return categoryScores;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryScores(@jakarta.annotation.Nullable Map<String, BigDecimal> categoryScores) {
    this.categoryScores = categoryScores;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationObject classificationObject = (ClassificationObject) o;
    return Objects.equals(this.categories, classificationObject.categories) &&
        Objects.equals(this.categoryScores, classificationObject.categoryScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, categoryScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationObject {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
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

