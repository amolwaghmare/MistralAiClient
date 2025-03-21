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

import java.math.BigDecimal;
import java.util.*;

/**
 * Response
 */
@JsonPropertyOrder({
  Response.JSON_PROPERTY_ID,
  Response.JSON_PROPERTY_AUTO_START,
  Response.JSON_PROPERTY_HYPERPARAMETERS,
  Response.JSON_PROPERTY_MODEL,
  Response.JSON_PROPERTY_STATUS,
  Response.JSON_PROPERTY_JOB_TYPE,
  Response.JSON_PROPERTY_CREATED_AT,
  Response.JSON_PROPERTY_MODIFIED_AT,
  Response.JSON_PROPERTY_TRAINING_FILES,
  Response.JSON_PROPERTY_VALIDATION_FILES,
  Response.JSON_PROPERTY_OBJECT,
  Response.JSON_PROPERTY_FINE_TUNED_MODEL,
  Response.JSON_PROPERTY_SUFFIX,
  Response.JSON_PROPERTY_INTEGRATIONS,
  Response.JSON_PROPERTY_TRAINED_TOKENS,
  Response.JSON_PROPERTY_REPOSITORIES,
  Response.JSON_PROPERTY_METADATA,
  Response.JSON_PROPERTY_EXPECTED_DURATION_SECONDS,
  Response.JSON_PROPERTY_COST,
  Response.JSON_PROPERTY_COST_CURRENCY,
  Response.JSON_PROPERTY_TRAIN_TOKENS_PER_STEP,
  Response.JSON_PROPERTY_TRAIN_TOKENS,
  Response.JSON_PROPERTY_DATA_TOKENS,
  Response.JSON_PROPERTY_ESTIMATED_START_TIME,
  Response.JSON_PROPERTY_DEPRECATED,
  Response.JSON_PROPERTY_DETAILS,
  Response.JSON_PROPERTY_EPOCHS,
  Response.JSON_PROPERTY_TRAINING_STEPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class Response {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nonnull
  private UUID id;

  public static final String JSON_PROPERTY_AUTO_START = "auto_start";
  @jakarta.annotation.Nonnull
  private Boolean autoStart;

  public static final String JSON_PROPERTY_HYPERPARAMETERS = "hyperparameters";
  @jakarta.annotation.Nonnull
  private TrainingParameters hyperparameters;

  public static final String JSON_PROPERTY_MODEL = "model";
  @jakarta.annotation.Nonnull
  private FineTuneableModel model;

  /**
   * The current status of the fine-tuning job.
   */
  public enum StatusEnum {
    QUEUED(String.valueOf("QUEUED")),
    
    STARTED(String.valueOf("STARTED")),
    
    VALIDATING(String.valueOf("VALIDATING")),
    
    VALIDATED(String.valueOf("VALIDATED")),
    
    RUNNING(String.valueOf("RUNNING")),
    
    FAILED_VALIDATION(String.valueOf("FAILED_VALIDATION")),
    
    FAILED(String.valueOf("FAILED")),
    
    SUCCESS(String.valueOf("SUCCESS")),
    
    CANCELLED(String.valueOf("CANCELLED")),
    
    CANCELLATION_REQUESTED(String.valueOf("CANCELLATION_REQUESTED"));

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @jakarta.annotation.Nonnull
  private StatusEnum status;

  public static final String JSON_PROPERTY_JOB_TYPE = "job_type";
  @jakarta.annotation.Nonnull
  private String jobType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @jakarta.annotation.Nonnull
  private Integer createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  @jakarta.annotation.Nonnull
  private Integer modifiedAt;

  public static final String JSON_PROPERTY_TRAINING_FILES = "training_files";
  @jakarta.annotation.Nonnull
  private List<UUID> trainingFiles = new ArrayList<>();

  public static final String JSON_PROPERTY_VALIDATION_FILES = "validation_files";
  @jakarta.annotation.Nullable
  private JsonNullable<List<UUID>> validationFiles = JsonNullable.<List<UUID>>undefined();

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    JOB_METADATA(String.valueOf("job.metadata"));

    private String value;

    ObjectEnum(String value) {
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
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OBJECT = "object";
  @jakarta.annotation.Nullable
  private ObjectEnum _object = ObjectEnum.JOB_METADATA;

  public static final String JSON_PROPERTY_FINE_TUNED_MODEL = "fine_tuned_model";
  @jakarta.annotation.Nullable
  private JsonNullable<String> fineTunedModel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  @jakarta.annotation.Nullable
  private JsonNullable<String> suffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  @jakarta.annotation.Nullable
  private JsonNullable<List<JobOutIntegrationsInner>> integrations = JsonNullable.<List<JobOutIntegrationsInner>>undefined();

  public static final String JSON_PROPERTY_TRAINED_TOKENS = "trained_tokens";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> trainedTokens = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REPOSITORIES = "repositories";
  @jakarta.annotation.Nullable
  private List<RepositoriesInner> repositories = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nullable
  private JobMetadataOut metadata;

  public static final String JSON_PROPERTY_EXPECTED_DURATION_SECONDS = "expected_duration_seconds";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> expectedDurationSeconds = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_COST = "cost";
  @jakarta.annotation.Nullable
  private JsonNullable<BigDecimal> cost = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_COST_CURRENCY = "cost_currency";
  @jakarta.annotation.Nullable
  private JsonNullable<String> costCurrency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRAIN_TOKENS_PER_STEP = "train_tokens_per_step";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> trainTokensPerStep = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TRAIN_TOKENS = "train_tokens";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> trainTokens = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DATA_TOKENS = "data_tokens";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> dataTokens = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_START_TIME = "estimated_start_time";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> estimatedStartTime = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
  @jakarta.annotation.Nullable
  private Boolean deprecated = true;

  public static final String JSON_PROPERTY_DETAILS = "details";
  @jakarta.annotation.Nonnull
  private String details;

  public static final String JSON_PROPERTY_EPOCHS = "epochs";
  @jakarta.annotation.Nullable
  private JsonNullable<BigDecimal> epochs = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TRAINING_STEPS = "training_steps";
  @jakarta.annotation.Nullable
  private JsonNullable<Integer> trainingSteps = JsonNullable.<Integer>undefined();

  public Response() {
  }

  public Response id(@jakarta.annotation.Nonnull UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the job.
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

  public Response autoStart(@jakarta.annotation.Nonnull Boolean autoStart) {
    
    this.autoStart = autoStart;
    return this;
  }

  /**
   * Get autoStart
   * @return autoStart
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTO_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAutoStart() {
    return autoStart;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoStart(@jakarta.annotation.Nonnull Boolean autoStart) {
    this.autoStart = autoStart;
  }

  public Response hyperparameters(@jakarta.annotation.Nonnull TrainingParameters hyperparameters) {
    
    this.hyperparameters = hyperparameters;
    return this;
  }

  /**
   * Get hyperparameters
   * @return hyperparameters
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TrainingParameters getHyperparameters() {
    return hyperparameters;
  }


  @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHyperparameters(@jakarta.annotation.Nonnull TrainingParameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  public Response model(@jakarta.annotation.Nonnull FineTuneableModel model) {
    
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

  public FineTuneableModel getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(@jakarta.annotation.Nonnull FineTuneableModel model) {
    this.model = model;
  }

  public Response status(@jakarta.annotation.Nonnull StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * The current status of the fine-tuning job.
   * @return status
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@jakarta.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }

  public Response jobType(@jakarta.annotation.Nonnull String jobType) {
    
    this.jobType = jobType;
    return this;
  }

  /**
   * The type of job (&#x60;FT&#x60; for fine-tuning).
   * @return jobType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getJobType() {
    return jobType;
  }


  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobType(@jakarta.annotation.Nonnull String jobType) {
    this.jobType = jobType;
  }

  public Response createdAt(@jakarta.annotation.Nonnull Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The UNIX timestamp (in seconds) for when the fine-tuning job was created.
   * @return createdAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@jakarta.annotation.Nonnull Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Response modifiedAt(@jakarta.annotation.Nonnull Integer modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The UNIX timestamp (in seconds) for when the fine-tuning job was last modified.
   * @return modifiedAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedAt(@jakarta.annotation.Nonnull Integer modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public Response trainingFiles(@jakarta.annotation.Nonnull List<UUID> trainingFiles) {
    
    this.trainingFiles = trainingFiles;
    return this;
  }

  public Response addTrainingFilesItem(UUID trainingFilesItem) {
    if (this.trainingFiles == null) {
      this.trainingFiles = new ArrayList<>();
    }
    this.trainingFiles.add(trainingFilesItem);
    return this;
  }

  /**
   * A list containing the IDs of uploaded files that contain training data.
   * @return trainingFiles
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRAINING_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UUID> getTrainingFiles() {
    return trainingFiles;
  }


  @JsonProperty(JSON_PROPERTY_TRAINING_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrainingFiles(@jakarta.annotation.Nonnull List<UUID> trainingFiles) {
    this.trainingFiles = trainingFiles;
  }

  public Response validationFiles(@jakarta.annotation.Nullable List<UUID> validationFiles) {
    this.validationFiles = JsonNullable.<List<UUID>>of(validationFiles);
    
    return this;
  }

  public Response addValidationFilesItem(UUID validationFilesItem) {
    if (this.validationFiles == null || !this.validationFiles.isPresent()) {
      this.validationFiles = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.validationFiles.get().add(validationFilesItem);
    } catch (NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get validationFiles
   * @return validationFiles
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<UUID> getValidationFiles() {
        return validationFiles.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALIDATION_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getValidationFiles_JsonNullable() {
    return validationFiles;
  }
  
  @JsonProperty(JSON_PROPERTY_VALIDATION_FILES)
  public void setValidationFiles_JsonNullable(JsonNullable<List<UUID>> validationFiles) {
    this.validationFiles = validationFiles;
  }

  public void setValidationFiles(@jakarta.annotation.Nullable List<UUID> validationFiles) {
    this.validationFiles = JsonNullable.<List<UUID>>of(validationFiles);
  }

  public Response _object(@jakarta.annotation.Nullable ObjectEnum _object) {
    
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

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(@jakarta.annotation.Nullable ObjectEnum _object) {
    this._object = _object;
  }

  public Response fineTunedModel(@jakarta.annotation.Nullable String fineTunedModel) {
    this.fineTunedModel = JsonNullable.<String>of(fineTunedModel);
    
    return this;
  }

  /**
   * Get fineTunedModel
   * @return fineTunedModel
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getFineTunedModel() {
        return fineTunedModel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FINE_TUNED_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFineTunedModel_JsonNullable() {
    return fineTunedModel;
  }
  
  @JsonProperty(JSON_PROPERTY_FINE_TUNED_MODEL)
  public void setFineTunedModel_JsonNullable(JsonNullable<String> fineTunedModel) {
    this.fineTunedModel = fineTunedModel;
  }

  public void setFineTunedModel(@jakarta.annotation.Nullable String fineTunedModel) {
    this.fineTunedModel = JsonNullable.<String>of(fineTunedModel);
  }

  public Response suffix(@jakarta.annotation.Nullable String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
    
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSuffix() {
        return suffix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSuffix_JsonNullable() {
    return suffix;
  }
  
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  public void setSuffix_JsonNullable(JsonNullable<String> suffix) {
    this.suffix = suffix;
  }

  public void setSuffix(@jakarta.annotation.Nullable String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
  }

  public Response integrations(@jakarta.annotation.Nullable List<JobOutIntegrationsInner> integrations) {
    this.integrations = JsonNullable.<List<JobOutIntegrationsInner>>of(integrations);
    
    return this;
  }

  public Response addIntegrationsItem(JobOutIntegrationsInner integrationsItem) {
    if (this.integrations == null || !this.integrations.isPresent()) {
      this.integrations = JsonNullable.<List<JobOutIntegrationsInner>>of(new ArrayList<>());
    }
    try {
      this.integrations.get().add(integrationsItem);
    } catch (NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get integrations
   * @return integrations
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<JobOutIntegrationsInner> getIntegrations() {
        return integrations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<JobOutIntegrationsInner>> getIntegrations_JsonNullable() {
    return integrations;
  }
  
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  public void setIntegrations_JsonNullable(JsonNullable<List<JobOutIntegrationsInner>> integrations) {
    this.integrations = integrations;
  }

  public void setIntegrations(@jakarta.annotation.Nullable List<JobOutIntegrationsInner> integrations) {
    this.integrations = JsonNullable.<List<JobOutIntegrationsInner>>of(integrations);
  }

  public Response trainedTokens(@jakarta.annotation.Nullable Integer trainedTokens) {
    this.trainedTokens = JsonNullable.<Integer>of(trainedTokens);
    
    return this;
  }

  /**
   * Get trainedTokens
   * @return trainedTokens
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getTrainedTokens() {
        return trainedTokens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRAINED_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTrainedTokens_JsonNullable() {
    return trainedTokens;
  }
  
  @JsonProperty(JSON_PROPERTY_TRAINED_TOKENS)
  public void setTrainedTokens_JsonNullable(JsonNullable<Integer> trainedTokens) {
    this.trainedTokens = trainedTokens;
  }

  public void setTrainedTokens(@jakarta.annotation.Nullable Integer trainedTokens) {
    this.trainedTokens = JsonNullable.<Integer>of(trainedTokens);
  }

  public Response repositories(@jakarta.annotation.Nullable List<RepositoriesInner> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public Response addRepositoriesItem(RepositoriesInner repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

  /**
   * Get repositories
   * @return repositories
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RepositoriesInner> getRepositories() {
    return repositories;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositories(@jakarta.annotation.Nullable List<RepositoriesInner> repositories) {
    this.repositories = repositories;
  }

  public Response metadata(@jakarta.annotation.Nullable JobMetadataOut metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JobMetadataOut getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(@jakarta.annotation.Nullable JobMetadataOut metadata) {
    this.metadata = metadata;
  }

  public Response expectedDurationSeconds(@jakarta.annotation.Nullable Integer expectedDurationSeconds) {
    this.expectedDurationSeconds = JsonNullable.<Integer>of(expectedDurationSeconds);
    
    return this;
  }

  /**
   * Get expectedDurationSeconds
   * @return expectedDurationSeconds
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getExpectedDurationSeconds() {
        return expectedDurationSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPECTED_DURATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getExpectedDurationSeconds_JsonNullable() {
    return expectedDurationSeconds;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPECTED_DURATION_SECONDS)
  public void setExpectedDurationSeconds_JsonNullable(JsonNullable<Integer> expectedDurationSeconds) {
    this.expectedDurationSeconds = expectedDurationSeconds;
  }

  public void setExpectedDurationSeconds(@jakarta.annotation.Nullable Integer expectedDurationSeconds) {
    this.expectedDurationSeconds = JsonNullable.<Integer>of(expectedDurationSeconds);
  }

  public Response cost(@jakarta.annotation.Nullable BigDecimal cost) {
    this.cost = JsonNullable.<BigDecimal>of(cost);
    
    return this;
  }

  /**
   * Get cost
   * @return cost
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BigDecimal getCost() {
        return cost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getCost_JsonNullable() {
    return cost;
  }
  
  @JsonProperty(JSON_PROPERTY_COST)
  public void setCost_JsonNullable(JsonNullable<BigDecimal> cost) {
    this.cost = cost;
  }

  public void setCost(@jakarta.annotation.Nullable BigDecimal cost) {
    this.cost = JsonNullable.<BigDecimal>of(cost);
  }

  public Response costCurrency(@jakarta.annotation.Nullable String costCurrency) {
    this.costCurrency = JsonNullable.<String>of(costCurrency);
    
    return this;
  }

  /**
   * Get costCurrency
   * @return costCurrency
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCostCurrency() {
        return costCurrency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCostCurrency_JsonNullable() {
    return costCurrency;
  }
  
  @JsonProperty(JSON_PROPERTY_COST_CURRENCY)
  public void setCostCurrency_JsonNullable(JsonNullable<String> costCurrency) {
    this.costCurrency = costCurrency;
  }

  public void setCostCurrency(@jakarta.annotation.Nullable String costCurrency) {
    this.costCurrency = JsonNullable.<String>of(costCurrency);
  }

  public Response trainTokensPerStep(@jakarta.annotation.Nullable Integer trainTokensPerStep) {
    this.trainTokensPerStep = JsonNullable.<Integer>of(trainTokensPerStep);
    
    return this;
  }

  /**
   * Get trainTokensPerStep
   * @return trainTokensPerStep
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getTrainTokensPerStep() {
        return trainTokensPerStep.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRAIN_TOKENS_PER_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTrainTokensPerStep_JsonNullable() {
    return trainTokensPerStep;
  }
  
  @JsonProperty(JSON_PROPERTY_TRAIN_TOKENS_PER_STEP)
  public void setTrainTokensPerStep_JsonNullable(JsonNullable<Integer> trainTokensPerStep) {
    this.trainTokensPerStep = trainTokensPerStep;
  }

  public void setTrainTokensPerStep(@jakarta.annotation.Nullable Integer trainTokensPerStep) {
    this.trainTokensPerStep = JsonNullable.<Integer>of(trainTokensPerStep);
  }

  public Response trainTokens(@jakarta.annotation.Nullable Integer trainTokens) {
    this.trainTokens = JsonNullable.<Integer>of(trainTokens);
    
    return this;
  }

  /**
   * Get trainTokens
   * @return trainTokens
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getTrainTokens() {
        return trainTokens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRAIN_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTrainTokens_JsonNullable() {
    return trainTokens;
  }
  
  @JsonProperty(JSON_PROPERTY_TRAIN_TOKENS)
  public void setTrainTokens_JsonNullable(JsonNullable<Integer> trainTokens) {
    this.trainTokens = trainTokens;
  }

  public void setTrainTokens(@jakarta.annotation.Nullable Integer trainTokens) {
    this.trainTokens = JsonNullable.<Integer>of(trainTokens);
  }

  public Response dataTokens(@jakarta.annotation.Nullable Integer dataTokens) {
    this.dataTokens = JsonNullable.<Integer>of(dataTokens);
    
    return this;
  }

  /**
   * Get dataTokens
   * @return dataTokens
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getDataTokens() {
        return dataTokens.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDataTokens_JsonNullable() {
    return dataTokens;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA_TOKENS)
  public void setDataTokens_JsonNullable(JsonNullable<Integer> dataTokens) {
    this.dataTokens = dataTokens;
  }

  public void setDataTokens(@jakarta.annotation.Nullable Integer dataTokens) {
    this.dataTokens = JsonNullable.<Integer>of(dataTokens);
  }

  public Response estimatedStartTime(@jakarta.annotation.Nullable Integer estimatedStartTime) {
    this.estimatedStartTime = JsonNullable.<Integer>of(estimatedStartTime);
    
    return this;
  }

  /**
   * Get estimatedStartTime
   * @return estimatedStartTime
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getEstimatedStartTime() {
        return estimatedStartTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getEstimatedStartTime_JsonNullable() {
    return estimatedStartTime;
  }
  
  @JsonProperty(JSON_PROPERTY_ESTIMATED_START_TIME)
  public void setEstimatedStartTime_JsonNullable(JsonNullable<Integer> estimatedStartTime) {
    this.estimatedStartTime = estimatedStartTime;
  }

  public void setEstimatedStartTime(@jakarta.annotation.Nullable Integer estimatedStartTime) {
    this.estimatedStartTime = JsonNullable.<Integer>of(estimatedStartTime);
  }

  public Response deprecated(@jakarta.annotation.Nullable Boolean deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Get deprecated
   * @return deprecated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeprecated() {
    return deprecated;
  }


  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecated(@jakarta.annotation.Nullable Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public Response details(@jakarta.annotation.Nonnull String details) {
    
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetails(@jakarta.annotation.Nonnull String details) {
    this.details = details;
  }

  public Response epochs(@jakarta.annotation.Nullable BigDecimal epochs) {
    this.epochs = JsonNullable.<BigDecimal>of(epochs);
    
    return this;
  }

  /**
   * Get epochs
   * @return epochs
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public BigDecimal getEpochs() {
        return epochs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EPOCHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getEpochs_JsonNullable() {
    return epochs;
  }
  
  @JsonProperty(JSON_PROPERTY_EPOCHS)
  public void setEpochs_JsonNullable(JsonNullable<BigDecimal> epochs) {
    this.epochs = epochs;
  }

  public void setEpochs(@jakarta.annotation.Nullable BigDecimal epochs) {
    this.epochs = JsonNullable.<BigDecimal>of(epochs);
  }

  public Response trainingSteps(@jakarta.annotation.Nullable Integer trainingSteps) {
    this.trainingSteps = JsonNullable.<Integer>of(trainingSteps);
    
    return this;
  }

  /**
   * Get trainingSteps
   * @return trainingSteps
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getTrainingSteps() {
        return trainingSteps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRAINING_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTrainingSteps_JsonNullable() {
    return trainingSteps;
  }
  
  @JsonProperty(JSON_PROPERTY_TRAINING_STEPS)
  public void setTrainingSteps_JsonNullable(JsonNullable<Integer> trainingSteps) {
    this.trainingSteps = trainingSteps;
  }

  public void setTrainingSteps(@jakarta.annotation.Nullable Integer trainingSteps) {
    this.trainingSteps = JsonNullable.<Integer>of(trainingSteps);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.id, response.id) &&
        Objects.equals(this.autoStart, response.autoStart) &&
        Objects.equals(this.hyperparameters, response.hyperparameters) &&
        Objects.equals(this.model, response.model) &&
        Objects.equals(this.status, response.status) &&
        Objects.equals(this.jobType, response.jobType) &&
        Objects.equals(this.createdAt, response.createdAt) &&
        Objects.equals(this.modifiedAt, response.modifiedAt) &&
        Objects.equals(this.trainingFiles, response.trainingFiles) &&
        equalsNullable(this.validationFiles, response.validationFiles) &&
        Objects.equals(this._object, response._object) &&
        equalsNullable(this.fineTunedModel, response.fineTunedModel) &&
        equalsNullable(this.suffix, response.suffix) &&
        equalsNullable(this.integrations, response.integrations) &&
        equalsNullable(this.trainedTokens, response.trainedTokens) &&
        Objects.equals(this.repositories, response.repositories) &&
        Objects.equals(this.metadata, response.metadata) &&
        equalsNullable(this.expectedDurationSeconds, response.expectedDurationSeconds) &&
        equalsNullable(this.cost, response.cost) &&
        equalsNullable(this.costCurrency, response.costCurrency) &&
        equalsNullable(this.trainTokensPerStep, response.trainTokensPerStep) &&
        equalsNullable(this.trainTokens, response.trainTokens) &&
        equalsNullable(this.dataTokens, response.dataTokens) &&
        equalsNullable(this.estimatedStartTime, response.estimatedStartTime) &&
        Objects.equals(this.deprecated, response.deprecated) &&
        Objects.equals(this.details, response.details) &&
        equalsNullable(this.epochs, response.epochs) &&
        equalsNullable(this.trainingSteps, response.trainingSteps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, autoStart, hyperparameters, model, status, jobType, createdAt, modifiedAt, trainingFiles, hashCodeNullable(validationFiles), _object, hashCodeNullable(fineTunedModel), hashCodeNullable(suffix), hashCodeNullable(integrations), hashCodeNullable(trainedTokens), repositories, metadata, hashCodeNullable(expectedDurationSeconds), hashCodeNullable(cost), hashCodeNullable(costCurrency), hashCodeNullable(trainTokensPerStep), hashCodeNullable(trainTokens), hashCodeNullable(dataTokens), hashCodeNullable(estimatedStartTime), deprecated, details, hashCodeNullable(epochs), hashCodeNullable(trainingSteps));
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
    sb.append("class Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    autoStart: ").append(toIndentedString(autoStart)).append("\n");
    sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    trainingFiles: ").append(toIndentedString(trainingFiles)).append("\n");
    sb.append("    validationFiles: ").append(toIndentedString(validationFiles)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    fineTunedModel: ").append(toIndentedString(fineTunedModel)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    trainedTokens: ").append(toIndentedString(trainedTokens)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    expectedDurationSeconds: ").append(toIndentedString(expectedDurationSeconds)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    costCurrency: ").append(toIndentedString(costCurrency)).append("\n");
    sb.append("    trainTokensPerStep: ").append(toIndentedString(trainTokensPerStep)).append("\n");
    sb.append("    trainTokens: ").append(toIndentedString(trainTokens)).append("\n");
    sb.append("    dataTokens: ").append(toIndentedString(dataTokens)).append("\n");
    sb.append("    estimatedStartTime: ").append(toIndentedString(estimatedStartTime)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    epochs: ").append(toIndentedString(epochs)).append("\n");
    sb.append("    trainingSteps: ").append(toIndentedString(trainingSteps)).append("\n");
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

