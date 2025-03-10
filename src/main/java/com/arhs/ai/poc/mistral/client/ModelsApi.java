package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.*;
import com.arhs.ai.poc.mistral.client.model.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class ModelsApi extends BaseApi {

    public ModelsApi() {
        super(new ApiClient());
    }

    public ModelsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete Model
     * Delete a fine-tuned model.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param modelId The ID of the model to delete. (required)
     * @return DeleteModelOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteModelOut deleteModelV1ModelsModelIdDelete(String modelId) throws RestClientException {
        return deleteModelV1ModelsModelIdDeleteWithHttpInfo(modelId).getBody();
    }

    /**
     * Delete Model
     * Delete a fine-tuned model.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param modelId The ID of the model to delete. (required)
     * @return ResponseEntity&lt;DeleteModelOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteModelOut> deleteModelV1ModelsModelIdDeleteWithHttpInfo(String modelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling deleteModelV1ModelsModelIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model_id", modelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<DeleteModelOut> localReturnType = new ParameterizedTypeReference<DeleteModelOut>() {};
        return apiClient.invokeAPI("/v1/models/{model_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Archive Fine Tuned Model
     * Archive a fine-tuned model.
     * <p><b>200</b> - OK
     * @param modelId The ID of the model to archive. (required)
     * @return ArchiveFTModelOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ArchiveFTModelOut jobsApiRoutesFineTuningArchiveFineTunedModel(String modelId) throws RestClientException {
        return jobsApiRoutesFineTuningArchiveFineTunedModelWithHttpInfo(modelId).getBody();
    }

    /**
     * Archive Fine Tuned Model
     * Archive a fine-tuned model.
     * <p><b>200</b> - OK
     * @param modelId The ID of the model to archive. (required)
     * @return ResponseEntity&lt;ArchiveFTModelOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ArchiveFTModelOut> jobsApiRoutesFineTuningArchiveFineTunedModelWithHttpInfo(String modelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling jobsApiRoutesFineTuningArchiveFineTunedModel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model_id", modelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ArchiveFTModelOut> localReturnType = new ParameterizedTypeReference<ArchiveFTModelOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/models/{model_id}/archive", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unarchive Fine Tuned Model
     * Un-archive a fine-tuned model.
     * <p><b>200</b> - OK
     * @param modelId The ID of the model to unarchive. (required)
     * @return UnarchiveFTModelOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UnarchiveFTModelOut jobsApiRoutesFineTuningUnarchiveFineTunedModel(String modelId) throws RestClientException {
        return jobsApiRoutesFineTuningUnarchiveFineTunedModelWithHttpInfo(modelId).getBody();
    }

    /**
     * Unarchive Fine Tuned Model
     * Un-archive a fine-tuned model.
     * <p><b>200</b> - OK
     * @param modelId The ID of the model to unarchive. (required)
     * @return ResponseEntity&lt;UnarchiveFTModelOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UnarchiveFTModelOut> jobsApiRoutesFineTuningUnarchiveFineTunedModelWithHttpInfo(String modelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling jobsApiRoutesFineTuningUnarchiveFineTunedModel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model_id", modelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<UnarchiveFTModelOut> localReturnType = new ParameterizedTypeReference<UnarchiveFTModelOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/models/{model_id}/archive", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Fine Tuned Model
     * Update a model name or description.
     * <p><b>200</b> - OK
     * @param modelId The ID of the model to update. (required)
     * @param updateFTModelIn  (required)
     * @return FTModelOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FTModelOut jobsApiRoutesFineTuningUpdateFineTunedModel(String modelId, UpdateFTModelIn updateFTModelIn) throws RestClientException {
        return jobsApiRoutesFineTuningUpdateFineTunedModelWithHttpInfo(modelId, updateFTModelIn).getBody();
    }

    /**
     * Update Fine Tuned Model
     * Update a model name or description.
     * <p><b>200</b> - OK
     * @param modelId The ID of the model to update. (required)
     * @param updateFTModelIn  (required)
     * @return ResponseEntity&lt;FTModelOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FTModelOut> jobsApiRoutesFineTuningUpdateFineTunedModelWithHttpInfo(String modelId, UpdateFTModelIn updateFTModelIn) throws RestClientException {
        Object localVarPostBody = updateFTModelIn;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling jobsApiRoutesFineTuningUpdateFineTunedModel");
        }
        
        // verify the required parameter 'updateFTModelIn' is set
        if (updateFTModelIn == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateFTModelIn' when calling jobsApiRoutesFineTuningUpdateFineTunedModel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model_id", modelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<FTModelOut> localReturnType = new ParameterizedTypeReference<FTModelOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/models/{model_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Models
     * List all models available to the user.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @return ModelList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelList listModelsV1ModelsGet() throws RestClientException {
        return listModelsV1ModelsGetWithHttpInfo().getBody();
    }

    /**
     * List Models
     * List all models available to the user.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @return ResponseEntity&lt;ModelList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelList> listModelsV1ModelsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ModelList> localReturnType = new ParameterizedTypeReference<ModelList>() {};
        return apiClient.invokeAPI("/v1/models", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve Model
     * Retrieve a model information.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param modelId The ID of the model to retrieve. (required)
     * @return ResponseRetrieveModelV1ModelsModelIdGet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseRetrieveModelV1ModelsModelIdGet retrieveModelV1ModelsModelIdGet(String modelId) throws RestClientException {
        return retrieveModelV1ModelsModelIdGetWithHttpInfo(modelId).getBody();
    }

    /**
     * Retrieve Model
     * Retrieve a model information.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param modelId The ID of the model to retrieve. (required)
     * @return ResponseEntity&lt;ResponseRetrieveModelV1ModelsModelIdGet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseRetrieveModelV1ModelsModelIdGet> retrieveModelV1ModelsModelIdGetWithHttpInfo(String modelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling retrieveModelV1ModelsModelIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model_id", modelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ResponseRetrieveModelV1ModelsModelIdGet> localReturnType = new ParameterizedTypeReference<ResponseRetrieveModelV1ModelsModelIdGet>() {};
        return apiClient.invokeAPI("/v1/models/{model_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
