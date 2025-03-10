package com.arhs.ai.poc.mistral.client;

import com.arhs.ai.poc.mistral.ApiClient;
import com.arhs.ai.poc.mistral.BaseApi;
import com.arhs.ai.poc.mistral.client.model.*;
import com.arhs.ai.poc.mistral.client.model.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.io.File;
import java.util.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T14:53:13.544788800+01:00[Europe/Berlin]", comments = "Generator version: 7.10.0")
public class FilesApi extends BaseApi {

    public FilesApi() {
        super(new ApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Delete File
     * Delete a file.
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @return DeleteFileOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteFileOut filesApiRoutesDeleteFile(String fileId) throws RestClientException {
        return filesApiRoutesDeleteFileWithHttpInfo(fileId).getBody();
    }

    /**
     * Delete File
     * Delete a file.
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @return ResponseEntity&lt;DeleteFileOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteFileOut> filesApiRoutesDeleteFileWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling filesApiRoutesDeleteFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

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

        ParameterizedTypeReference<DeleteFileOut> localReturnType = new ParameterizedTypeReference<DeleteFileOut>() {};
        return apiClient.invokeAPI("/v1/files/{file_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Download File
     * Download a file
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File filesApiRoutesDownloadFile(String fileId) throws RestClientException {
        return filesApiRoutesDownloadFileWithHttpInfo(fileId).getBody();
    }

    /**
     * Download File
     * Download a file
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> filesApiRoutesDownloadFileWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling filesApiRoutesDownloadFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<File> localReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/v1/files/{file_id}/content", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Signed Url
     * 
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @param expiry Number of hours before the url becomes invalid. Defaults to 24h (optional, default to 24)
     * @return FileSignedURL
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FileSignedURL filesApiRoutesGetSignedUrl(String fileId, Integer expiry) throws RestClientException {
        return filesApiRoutesGetSignedUrlWithHttpInfo(fileId, expiry).getBody();
    }

    /**
     * Get Signed Url
     * 
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @param expiry Number of hours before the url becomes invalid. Defaults to 24h (optional, default to 24)
     * @return ResponseEntity&lt;FileSignedURL&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FileSignedURL> filesApiRoutesGetSignedUrlWithHttpInfo(String fileId, Integer expiry) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling filesApiRoutesGetSignedUrl");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "expiry", expiry));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<FileSignedURL> localReturnType = new ParameterizedTypeReference<FileSignedURL>() {};
        return apiClient.invokeAPI("/v1/files/{file_id}/url", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Files
     * Returns a list of files that belong to the user&#39;s organization.
     * <p><b>200</b> - OK
     * @param page  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param sampleType  (optional)
     * @param source  (optional)
     * @param search  (optional)
     * @param purpose  (optional)
     * @return ListFilesOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListFilesOut filesApiRoutesListFiles(Integer page, Integer pageSize, List<SampleType> sampleType, List<Source> source, String search, FilePurpose purpose) throws RestClientException {
        return filesApiRoutesListFilesWithHttpInfo(page, pageSize, sampleType, source, search, purpose).getBody();
    }

    /**
     * List Files
     * Returns a list of files that belong to the user&#39;s organization.
     * <p><b>200</b> - OK
     * @param page  (optional, default to 0)
     * @param pageSize  (optional, default to 100)
     * @param sampleType  (optional)
     * @param source  (optional)
     * @param search  (optional)
     * @param purpose  (optional)
     * @return ResponseEntity&lt;ListFilesOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListFilesOut> filesApiRoutesListFilesWithHttpInfo(Integer page, Integer pageSize, List<SampleType> sampleType, List<Source> source, String search, FilePurpose purpose) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "sample_type", sampleType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "source", source));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "purpose", purpose));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<ListFilesOut> localReturnType = new ParameterizedTypeReference<ListFilesOut>() {};
        return apiClient.invokeAPI("/v1/files", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve File
     * Returns information about a specific file.
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @return RetrieveFileOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveFileOut filesApiRoutesRetrieveFile(String fileId) throws RestClientException {
        return filesApiRoutesRetrieveFileWithHttpInfo(fileId).getBody();
    }

    /**
     * Retrieve File
     * Returns information about a specific file.
     * <p><b>200</b> - OK
     * @param fileId  (required)
     * @return ResponseEntity&lt;RetrieveFileOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveFileOut> filesApiRoutesRetrieveFileWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling filesApiRoutesRetrieveFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

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

        ParameterizedTypeReference<RetrieveFileOut> localReturnType = new ParameterizedTypeReference<RetrieveFileOut>() {};
        return apiClient.invokeAPI("/v1/files/{file_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload File
     * Upload a file that can be used across various endpoints.  The size of individual files can be a maximum of 512 MB. The Fine-tuning API only supports .jsonl files.  Please contact us if you need to increase these storage limits.
     * <p><b>200</b> - OK
     * @param _file The File object (not file name) to be uploaded.  To upload a file and specify a custom file name you should format your request as such:  &#x60;&#x60;&#x60;bash  file&#x3D;@path/to/your/file.jsonl;filename&#x3D;custom_name.jsonl  &#x60;&#x60;&#x60;  Otherwise, you can just keep the original file name:  &#x60;&#x60;&#x60;bash  file&#x3D;@path/to/your/file.jsonl  &#x60;&#x60;&#x60; (required)
     * @param purpose  (optional)
     * @return UploadFileOut
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadFileOut filesApiRoutesUploadFile(File _file, FilePurpose purpose) throws RestClientException {
        return filesApiRoutesUploadFileWithHttpInfo(_file, purpose).getBody();
    }

    /**
     * Upload File
     * Upload a file that can be used across various endpoints.  The size of individual files can be a maximum of 512 MB. The Fine-tuning API only supports .jsonl files.  Please contact us if you need to increase these storage limits.
     * <p><b>200</b> - OK
     * @param _file The File object (not file name) to be uploaded.  To upload a file and specify a custom file name you should format your request as such:  &#x60;&#x60;&#x60;bash  file&#x3D;@path/to/your/file.jsonl;filename&#x3D;custom_name.jsonl  &#x60;&#x60;&#x60;  Otherwise, you can just keep the original file name:  &#x60;&#x60;&#x60;bash  file&#x3D;@path/to/your/file.jsonl  &#x60;&#x60;&#x60; (required)
     * @param purpose  (optional)
     * @return ResponseEntity&lt;UploadFileOut&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadFileOut> filesApiRoutesUploadFileWithHttpInfo(File _file, FilePurpose purpose) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling filesApiRoutesUploadFile");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (_file != null)
            localVarFormParams.add("file", new FileSystemResource(_file));
        if (purpose != null)
            localVarFormParams.add("purpose", purpose);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        ParameterizedTypeReference<UploadFileOut> localReturnType = new ParameterizedTypeReference<UploadFileOut>() {};
        return apiClient.invokeAPI("/v1/files", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
