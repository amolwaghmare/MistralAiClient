package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.EmbeddingRequest;
import com.arhs.ai.poc.mistral.client.model.EmbeddingResponse;
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
public class EmbeddingsApi extends BaseApi {

    public EmbeddingsApi() {
        super(new ApiClient());
    }

    public EmbeddingsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Embeddings
     * Embeddings
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param embeddingRequest  (required)
     * @return EmbeddingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EmbeddingResponse embeddingsV1EmbeddingsPost(EmbeddingRequest embeddingRequest) throws RestClientException {
        return embeddingsV1EmbeddingsPostWithHttpInfo(embeddingRequest).getBody();
    }

    /**
     * Embeddings
     * Embeddings
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param embeddingRequest  (required)
     * @return ResponseEntity&lt;EmbeddingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmbeddingResponse> embeddingsV1EmbeddingsPostWithHttpInfo(EmbeddingRequest embeddingRequest) throws RestClientException {
        Object localVarPostBody = embeddingRequest;
        
        // verify the required parameter 'embeddingRequest' is set
        if (embeddingRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'embeddingRequest' when calling embeddingsV1EmbeddingsPost");
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

        ParameterizedTypeReference<EmbeddingResponse> localReturnType = new ParameterizedTypeReference<EmbeddingResponse>() {};
        return apiClient.invokeAPI("/v1/embeddings", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
