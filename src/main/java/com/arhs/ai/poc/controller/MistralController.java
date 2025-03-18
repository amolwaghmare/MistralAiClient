package com.arhs.ai.poc.controller;


import com.arhs.ai.poc.service.BraveSearchService;
import com.arhs.ai.poc.service.GCustomSearchService;
import com.arhs.ai.poc.service.MistralService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;


@Controller

public class MistralController {

    @Autowired
    private MistralService mistralService;

    @Autowired
    private GCustomSearchService gCustomSearchService;

    @Autowired
    private BraveSearchService braveSearchService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "Logged in "+model.get("name");
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String query) throws JsonProcessingException {


        String result = mistralService.callMistralService(query);


    return result;

    }


    @RequestMapping(value="/googleCustomSearch", method = RequestMethod.GET)
    public LinkedHashMap googleCustomSearch(@RequestParam String query) throws JsonProcessingException {


        return gCustomSearchService.callGoogleCustomSearchService(query);

//return "<html>"+gCustomSearchService.callGoogleCustomSearchService(query);

    }



    @GetMapping(value="/testThyleaf")
    public ModelAndView testThyleaf(@RequestParam String api, @RequestParam String query) throws JsonProcessingException {
        ModelAndView  model = new ModelAndView("testView");
        model.addObject("api", api);
        model.addObject("query", query);
        String result = null;
        if(api.equalsIgnoreCase("mistral")){
            result = mistralService.callMistralService(query);

        } else if(api.equalsIgnoreCase("GoogleCustomSearch")){
            result = gCustomSearchService.callGoogleCustomSearchService(query).toString();

        } else if(api.equalsIgnoreCase("bravesearch")){
            result = braveSearchService.callBraveSearch(query).toString();

        }
        String prettyResult = null;
        try {
            ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            Object jsonObject = mapper.readValue(result, Object.class);
            String prettyJson = mapper.writeValueAsString(jsonObject);
            prettyResult = prettyJson;
        } catch (JsonProcessingException e) {
            prettyResult = result;
        }
            model.addObject("result", prettyResult);

        return model;


    }
}
