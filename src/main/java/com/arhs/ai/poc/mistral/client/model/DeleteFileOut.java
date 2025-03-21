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
import java.util.UUID;

/**
 * DeleteFileOut
 */
@JsonPropertyOrder({
  DeleteFileOut.JSON_PROPERTY_ID,
  DeleteFileOut.JSON_PROPERTY_OBJECT,
  DeleteFileOut.JSON_PROPERTY_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class DeleteFileOut {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nonnull
  private UUID id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  @jakarta.annotation.Nonnull
  private String _object;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  @jakarta.annotation.Nonnull
  private Boolean deleted;

  public DeleteFileOut() {
  }

  public DeleteFileOut id(@jakarta.annotation.Nonnull UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the deleted file.
   * @return id
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@jakarta.annotation.Nonnull UUID id) {
    this.id = id;
  }

  public DeleteFileOut _object(@jakarta.annotation.Nonnull String _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * The object type that was deleted
   * @return _object
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@jakarta.annotation.Nonnull String _object) {
    this._object = _object;
  }

  public DeleteFileOut deleted(@jakarta.annotation.Nonnull Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

  /**
   * The deletion status.
   * @return deleted
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeleted(@jakarta.annotation.Nonnull Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteFileOut deleteFileOut = (DeleteFileOut) o;
    return Objects.equals(this.id, deleteFileOut.id) &&
        Objects.equals(this._object, deleteFileOut._object) &&
        Objects.equals(this.deleted, deleteFileOut.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFileOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

