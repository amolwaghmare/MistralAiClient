package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.ChatClassificationRequest;
import com.arhs.ai.poc.mistral.client.model.ClassificationRequest;
import com.arhs.ai.poc.mistral.client.model.ClassificationResponse;
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
public class ClassifiersApi extends BaseApi {

    public ClassifiersApi() {
        super(new ApiClient());
    }

    public ClassifiersApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Moderations Chat
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param chatClassificationRequest  (required)
     * @return ClassificationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClassificationResponse moderationsChatV1ChatModerationsPost(ChatClassificationRequest chatClassificationRequest) throws RestClientException {
        return moderationsChatV1ChatModerationsPostWithHttpInfo(chatClassificationRequest).getBody();
    }

    /**
     * Moderations Chat
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param chatClassificationRequest  (required)
     * @return ResponseEntity&lt;ClassificationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClassificationResponse> moderationsChatV1ChatModerationsPostWithHttpInfo(ChatClassificationRequest chatClassificationRequest) throws RestClientException {
        Object localVarPostBody = chatClassificationRequest;
        
        // verify the required parameter 'chatClassificationRequest' is set
        if (chatClassificationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatClassificationRequest' when calling moderationsChatV1ChatModerationsPost");
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

        ParameterizedTypeReference<ClassificationResponse> localReturnType = new ParameterizedTypeReference<ClassificationResponse>() {};
        return apiClient.invokeAPI("/v1/chat/moderations", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Moderations
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param classificationRequest  (required)
     * @return ClassificationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClassificationResponse moderationsV1ModerationsPost(ClassificationRequest classificationRequest) throws RestClientException {
        return moderationsV1ModerationsPostWithHttpInfo(classificationRequest).getBody();
    }

    /**
     * Moderations
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param classificationRequest  (required)
     * @return ResponseEntity&lt;ClassificationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClassificationResponse> moderationsV1ModerationsPostWithHttpInfo(ClassificationRequest classificationRequest) throws RestClientException {
        Object localVarPostBody = classificationRequest;
        
        // verify the required parameter 'classificationRequest' is set
        if (classificationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'classificationRequest' when calling moderationsV1ModerationsPost");
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

        ParameterizedTypeReference<ClassificationResponse> localReturnType = new ParameterizedTypeReference<ClassificationResponse>() {};
        return apiClient.invokeAPI("/v1/moderations", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
