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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BatchJobStatus
 */
public enum BatchJobStatus {
  
  QUEUED("QUEUED"),
  
  RUNNING("RUNNING"),
  
  SUCCESS("SUCCESS"),
  
  FAILED("FAILED"),
  
  TIMEOUT_EXCEEDED("TIMEOUT_EXCEEDED"),
  
  CANCELLATION_REQUESTED("CANCELLATION_REQUESTED"),
  
  CANCELLED("CANCELLED");

  private String value;

  BatchJobStatus(String value) {
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
  public static BatchJobStatus fromValue(String value) {
    for (BatchJobStatus b : BatchJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

