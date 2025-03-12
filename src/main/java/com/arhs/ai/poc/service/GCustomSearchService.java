package com.arhs.ai.poc.service;

import com.arhs.ai.poc.mistral.client.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/*
import com.google.api.services.customsearch.v1.Customsearch;
import com.google.api.services.customsearch.v1.model.Search;
*/
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.*;

@Service
public class GCustomSearchService {

    private final RestTemplate restTemplate;

    @Value("${google.customsearch.api.url}")
    private String apiUrl;

    @Value("${google.customsearch.api.key}")
    private String apiKey;


    @Value("${google.customsearch.engine.id}")
    private String searchEngineId;

    ObjectMapper objectMapper = new ObjectMapper();

    public GCustomSearchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    public LinkedHashMap callGoogleCustomSearchService(String query) throws JsonProcessingException {
        ChatCompletionRequest request = new ChatCompletionRequest();
        request.setTemperature(BigDecimal.valueOf(0.7));
        request.setModel("mistral-large-latest");
        request.setTopP(BigDecimal.ONE);
        request.setMaxTokens(150);

        List<MessagesInner> messages = new ArrayList<>();
        MessagesInner messagesInner = new MessagesInner();
        ;
        messagesInner.setRole(MessagesInner.RoleEnum.USER);
        Content content = new Content();
        content.setText(query);
        messagesInner.setContent(content);
        messages.add(messagesInner);

        request.setMessages(messages);
        ResponseFormat responseFormat = new ResponseFormat();
        responseFormat.setType(ResponseFormats.JSON_OBJECT);
        request.setResponseFormat(responseFormat);
        HttpHeaders httpHeaders  = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + apiKey);
        httpHeaders.add("Content-Type", "application/json");


        HttpEntity<ChatCompletionRequest> chatCompletionRequestRequestEntity = new HttpEntity<>(request,httpHeaders);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("model", "mistral-small-latest");
        params.put("temperature", "0.7");
        params.put("top_p", "1");
        params.put("max_tokens", "1500");
        params.put("stream", false);

        Map<String, String> message = new HashMap<String, String>();
        message.put("role", "user");
        message.put("content", query);
        List<Map<String,String>> messageList = new ArrayList<Map<String,String>>();
        messageList.add(message);
        params.put("messages", messageList);

        List<Map<String,String>> responseFormatList = new ArrayList<Map<String,String>>();
        Map<String, String> rFormat = new HashMap<String, String>();
        rFormat.put("type", "json_object");

        responseFormatList.add(rFormat);
        //params.put("response_format", rFormat);
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(params,httpHeaders);
        String urlWithParameters = apiUrl + "?key="+apiKey+"&cx="+searchEngineId+"&q="+query;

//GET https://www.googleapis.com/customsearch/v1?key=INSERT_YOUR_API_KEY&cx=017576662512468239146:omuauf_lfve&q=lectures
        LinkedHashMap reponseObject=  restTemplate.getForObject(urlWithParameters,   LinkedHashMap.class);
        //
        //ResponseEntity<String> re=  restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class);

        //reponseObject.get("items");

        return reponseObject;
    }


}