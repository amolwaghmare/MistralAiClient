package com.arhs.ai.poc.service;

import com.arhs.ai.poc.mistral.client.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MistralService {

    private final RestTemplate restTemplate;

    @Value("${mistral.api.url}")
    private String apiUrl;

    @Value("${mistral.api.key}")
    private String apiKey;

    ObjectMapper objectMapper = new ObjectMapper();

    public MistralService( RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    public String callMistralService(String query) throws JsonProcessingException {
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


        ResponseEntity<String> re=  restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class);
        HashMap result =
                objectMapper.readValue(re.getBody(), HashMap.class);
         ArrayList choices = (ArrayList) result.get("choices");
        HashMap hashMapChoices = (HashMap) choices.get(0);
        HashMap hashMapMessage = (HashMap) hashMapChoices.get("message");
        String content1 = (String) hashMapMessage.get("content");
        return re.getBody();
    }


}