package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.DetailedJobOut;
import com.arhs.ai.poc.mistral.client.model.JobIn;
import com.arhs.ai.poc.mistral.client.model.JobsOut;
import com.arhs.ai.poc.mistral.client.model.Response;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class FineTuningApi extends BaseApi {

    public FineTuningApi() {
        super(new ApiClient());
    }

    public FineTuningApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Cancel Fine Tuning Job
     * Request the cancellation of a fine tuning job.
     * <p><b>200</b> - OK
     * @param jobId The ID of the job to cancel. (required)
     * @return DetailedJobOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedJobOut jobsApiRoutesFineTuningCancelFineTuningJob(UUID jobId) throws RestClientException {
        return jobsApiRoutesFineTuningCancelFineTuningJobWithHttpInfo(jobId).getBody();
    }

    /**
     * Cancel Fine Tuning Job
     * Request the cancellation of a fine tuning job.
     * <p><b>200</b> - OK
     * @param jobId The ID of the job to cancel. (required)
     * @return ResponseEntity&lt;DetailedJobOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedJobOut> jobsApiRoutesFineTuningCancelFineTuningJobWithHttpInfo(UUID jobId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobId' when calling jobsApiRoutesFineTuningCancelFineTuningJob");
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

        ParameterizedTypeReference<DetailedJobOut> localReturnType = new ParameterizedTypeReference<DetailedJobOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/jobs/{job_id}/cancel", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Fine Tuning Job
     * Create a new fine-tuning job, it will be queued for processing.
     * <p><b>200</b> - OK
     * @param jobIn  (required)
     * @param dryRun * If &#x60;true&#x60; the job is not spawned, instead the query returns a handful of useful metadata   for the user to perform sanity checks (see &#x60;LegacyJobMetadataOut&#x60; response). * Otherwise, the job is started and the query returns the job ID along with some of the   input parameters (see &#x60;JobOut&#x60; response).  (optional)
     * @return Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Response jobsApiRoutesFineTuningCreateFineTuningJob(JobIn jobIn, Boolean dryRun) throws RestClientException {
        return jobsApiRoutesFineTuningCreateFineTuningJobWithHttpInfo(jobIn, dryRun).getBody();
    }

    /**
     * Create Fine Tuning Job
     * Create a new fine-tuning job, it will be queued for processing.
     * <p><b>200</b> - OK
     * @param jobIn  (required)
     * @param dryRun * If &#x60;true&#x60; the job is not spawned, instead the query returns a handful of useful metadata   for the user to perform sanity checks (see &#x60;LegacyJobMetadataOut&#x60; response). * Otherwise, the job is started and the query returns the job ID along with some of the   input parameters (see &#x60;JobOut&#x60; response).  (optional)
     * @return ResponseEntity&lt;Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Response> jobsApiRoutesFineTuningCreateFineTuningJobWithHttpInfo(JobIn jobIn, Boolean dryRun) throws RestClientException {
        Object localVarPostBody = jobIn;
        
        // verify the required parameter 'jobIn' is set
        if (jobIn == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobIn' when calling jobsApiRoutesFineTuningCreateFineTuningJob");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dry_run", dryRun));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<Response> localReturnType = new ParameterizedTypeReference<Response>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/jobs", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Fine Tuning Job
     * Get a fine-tuned job details by its UUID.
     * <p><b>200</b> - OK
     * @param jobId The ID of the job to analyse. (required)
     * @return DetailedJobOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedJobOut jobsApiRoutesFineTuningGetFineTuningJob(UUID jobId) throws RestClientException {
        return jobsApiRoutesFineTuningGetFineTuningJobWithHttpInfo(jobId).getBody();
    }

    /**
     * Get Fine Tuning Job
     * Get a fine-tuned job details by its UUID.
     * <p><b>200</b> - OK
     * @param jobId The ID of the job to analyse. (required)
     * @return ResponseEntity&lt;DetailedJobOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedJobOut> jobsApiRoutesFineTuningGetFineTuningJobWithHttpInfo(UUID jobId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobId' when calling jobsApiRoutesFineTuningGetFineTuningJob");
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

        ParameterizedTypeReference<DetailedJobOut> localReturnType = new ParameterizedTypeReference<DetailedJobOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/jobs/{job_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Fine Tuning Jobs
     * Get a list of fine-tuning jobs for your organization and user.
     * <p><b>200</b> - OK
     * @param page The page number of the results to be returned. (optional, default to 0)
     * @param pageSize The number of items to return per page. (optional, default to 100)
     * @param model The model name used for fine-tuning to filter on. When set, the other results are not displayed. (optional)
     * @param createdAfter The date/time to filter on. When set, the results for previous creation times are not displayed. (optional)
     * @param createdByMe When set, only return results for jobs created by the API caller. Other results are not displayed. (optional, default to false)
     * @param status The current job state to filter on. When set, the other results are not displayed. (optional)
     * @param wandbProject The Weights and Biases project to filter on. When set, the other results are not displayed. (optional)
     * @param wandbName The Weight and Biases run name to filter on. When set, the other results are not displayed. (optional)
     * @param suffix The model suffix to filter on. When set, the other results are not displayed. (optional)
     * @return JobsOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobsOut jobsApiRoutesFineTuningGetFineTuningJobs(Integer page, Integer pageSize, String model, OffsetDateTime createdAfter, Boolean createdByMe, String status, String wandbProject, String wandbName, String suffix) throws RestClientException {
        return jobsApiRoutesFineTuningGetFineTuningJobsWithHttpInfo(page, pageSize, model, createdAfter, createdByMe, status, wandbProject, wandbName, suffix).getBody();
    }

    /**
     * Get Fine Tuning Jobs
     * Get a list of fine-tuning jobs for your organization and user.
     * <p><b>200</b> - OK
     * @param page The page number of the results to be returned. (optional, default to 0)
     * @param pageSize The number of items to return per page. (optional, default to 100)
     * @param model The model name used for fine-tuning to filter on. When set, the other results are not displayed. (optional)
     * @param createdAfter The date/time to filter on. When set, the results for previous creation times are not displayed. (optional)
     * @param createdByMe When set, only return results for jobs created by the API caller. Other results are not displayed. (optional, default to false)
     * @param status The current job state to filter on. When set, the other results are not displayed. (optional)
     * @param wandbProject The Weights and Biases project to filter on. When set, the other results are not displayed. (optional)
     * @param wandbName The Weight and Biases run name to filter on. When set, the other results are not displayed. (optional)
     * @param suffix The model suffix to filter on. When set, the other results are not displayed. (optional)
     * @return ResponseEntity&lt;JobsOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobsOut> jobsApiRoutesFineTuningGetFineTuningJobsWithHttpInfo(Integer page, Integer pageSize, String model, OffsetDateTime createdAfter, Boolean createdByMe, String status, String wandbProject, String wandbName, String suffix) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "model", model));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "created_after", createdAfter));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "created_by_me", createdByMe));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "wandb_project", wandbProject));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "wandb_name", wandbName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "suffix", suffix));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<JobsOut> localReturnType = new ParameterizedTypeReference<JobsOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/jobs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start Fine Tuning Job
     * Request the start of a validated fine tuning job.
     * <p><b>200</b> - OK
     * @param jobId  (required)
     * @return DetailedJobOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedJobOut jobsApiRoutesFineTuningStartFineTuningJob(UUID jobId) throws RestClientException {
        return jobsApiRoutesFineTuningStartFineTuningJobWithHttpInfo(jobId).getBody();
    }

    /**
     * Start Fine Tuning Job
     * Request the start of a validated fine tuning job.
     * <p><b>200</b> - OK
     * @param jobId  (required)
     * @return ResponseEntity&lt;DetailedJobOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedJobOut> jobsApiRoutesFineTuningStartFineTuningJobWithHttpInfo(UUID jobId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'jobId' when calling jobsApiRoutesFineTuningStartFineTuningJob");
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

        ParameterizedTypeReference<DetailedJobOut> localReturnType = new ParameterizedTypeReference<DetailedJobOut>() {};
        return apiClient.invokeAPI("/v1/fine_tuning/jobs/{job_id}/start", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
