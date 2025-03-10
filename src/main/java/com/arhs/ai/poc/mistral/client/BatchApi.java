package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.BatchJobIn;
import com.arhs.ai.poc.mistral.client.model.BatchJobOut;
import com.arhs.ai.poc.mistral.client.model.BatchJobStatus;
import com.arhs.ai.poc.mistral.client.model.BatchJobsOut;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class BatchApi extends BaseApi {

    public BatchApi() {
        super(new ApiClient());
    }

    public BatchApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Cancel Batch Job
     * Request the cancellation of a batch job.
     * <p><b>200</b> - OK
     * @param jobId  (required)
     * @return BatchJobOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchJobOut jobsApiRoutesBatchCancelBatchJob(UUID jobId) throws RestClientException {
        return jobsApiRoutesBatchCancelBatchJobWithHttpInfo(jobId).getBody();
    }

    /**
     * Cancel Batch Job
     * Request the cancellation of a batch job.
     * <p><b>200</b> - OK
     * @param jobId  (required)
     * @return ResponseEntity&lt;BatchJobOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchJobOut> jobsApiRoutesBatchCancelBatchJobWithHttpInfo(UUID jobId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobId' when calling jobsApiRoutesBatchCancelBatchJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("job_id", jobId);

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

        ParameterizedTypeReference<BatchJobOut> localReturnType = new ParameterizedTypeReference<BatchJobOut>() {};
        return apiClient.invokeAPI("/v1/batch/jobs/{job_id}/cancel", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Batch Job
     * Create a new batch job, it will be queued for processing.
     * <p><b>200</b> - OK
     * @param batchJobIn  (required)
     * @return BatchJobOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchJobOut jobsApiRoutesBatchCreateBatchJob(BatchJobIn batchJobIn) throws RestClientException {
        return jobsApiRoutesBatchCreateBatchJobWithHttpInfo(batchJobIn).getBody();
    }

    /**
     * Create Batch Job
     * Create a new batch job, it will be queued for processing.
     * <p><b>200</b> - OK
     * @param batchJobIn  (required)
     * @return ResponseEntity&lt;BatchJobOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchJobOut> jobsApiRoutesBatchCreateBatchJobWithHttpInfo(BatchJobIn batchJobIn) throws RestClientException {
        Object localVarPostBody = batchJobIn;
        
        // verify the required parameter 'batchJobIn' is set
        if (batchJobIn == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchJobIn' when calling jobsApiRoutesBatchCreateBatchJob");
        }
        

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

        ParameterizedTypeReference<BatchJobOut> localReturnType = new ParameterizedTypeReference<BatchJobOut>() {};
        return apiClient.invokeAPI("/v1/batch/jobs", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Batch Job
     * Get a batch job details by its UUID.
     * <p><b>200</b> - OK
     * @param jobId  (required)
     * @return BatchJobOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchJobOut jobsApiRoutesBatchGetBatchJob(UUID jobId) throws RestClientException {
        return jobsApiRoutesBatchGetBatchJobWithHttpInfo(jobId).getBody();
    }

    /**
     * Get Batch Job
     * Get a batch job details by its UUID.
     * <p><b>200</b> - OK
     * @param jobId  (required)
     * @return ResponseEntity&lt;BatchJobOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchJobOut> jobsApiRoutesBatchGetBatchJobWithHttpInfo(UUID jobId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobId' when calling jobsApiRoutesBatchGetBatchJob");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("job_id", jobId);

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

        ParameterizedTypeReference<BatchJobOut> localReturnType = new ParameterizedTypeReference<BatchJobOut>() {};
        return apiClient.invokeAPI("/v1/batch/jobs/{job_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Batch Jobs
     * Get a list of batch jobs for your organization and user.
     * <p><b>200</b> - OK
     * @param page  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param model  (optional)
     * @param metadata  (optional)
     * @param createdAfter  (optional)
     * @param createdByMe  (optional, default to false)
     * @param status  (optional)
     * @return BatchJobsOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BatchJobsOut jobsApiRoutesBatchGetBatchJobs(Integer page, Integer pageSize, String model, Map<String, Object> metadata, OffsetDateTime createdAfter, Boolean createdByMe, BatchJobStatus status) throws RestClientException {
        return jobsApiRoutesBatchGetBatchJobsWithHttpInfo(page, pageSize, model, metadata, createdAfter, createdByMe, status).getBody();
    }

    /**
     * Get Batch Jobs
     * Get a list of batch jobs for your organization and user.
     * <p><b>200</b> - OK
     * @param page  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param model  (optional)
     * @param metadata  (optional)
     * @param createdAfter  (optional)
     * @param createdByMe  (optional, default to false)
     * @param status  (optional)
     * @return ResponseEntity&lt;BatchJobsOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BatchJobsOut> jobsApiRoutesBatchGetBatchJobsWithHttpInfo(Integer page, Integer pageSize, String model, Map<String, Object> metadata, OffsetDateTime createdAfter, Boolean createdByMe, BatchJobStatus status) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "model", model));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "created_after", createdAfter));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "created_by_me", createdByMe));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<BatchJobsOut> localReturnType = new ParameterizedTypeReference<BatchJobsOut>() {};
        return apiClient.invokeAPI("/v1/batch/jobs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
