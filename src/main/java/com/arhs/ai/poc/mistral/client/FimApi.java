package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.FIMCompletionRequest;
import com.arhs.ai.poc.mistral.client.model.FIMCompletionResponse;
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
public class FimApi extends BaseApi {

    public FimApi() {
        super(new ApiClient());
    }

    public FimApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Fim Completion
     * FIM completion.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param fiMCompletionRequest  (required)
     * @return FIMCompletionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FIMCompletionResponse fimCompletionV1FimCompletionsPost(FIMCompletionRequest fiMCompletionRequest) throws RestClientException {
        return fimCompletionV1FimCompletionsPostWithHttpInfo(fiMCompletionRequest).getBody();
    }

    /**
     * Fim Completion
     * FIM completion.
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param fiMCompletionRequest  (required)
     * @return ResponseEntity&lt;FIMCompletionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FIMCompletionResponse> fimCompletionV1FimCompletionsPostWithHttpInfo(FIMCompletionRequest fiMCompletionRequest) throws RestClientException {
        Object localVarPostBody = fiMCompletionRequest;
        
        // verify the required parameter 'fiMCompletionRequest' is set
        if (fiMCompletionRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fiMCompletionRequest' when calling fimCompletionV1FimCompletionsPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/event-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<FIMCompletionResponse> localReturnType = new ParameterizedTypeReference<FIMCompletionResponse>() {};
        return apiClient.invokeAPI("/v1/fim/completions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json", "text/event-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
