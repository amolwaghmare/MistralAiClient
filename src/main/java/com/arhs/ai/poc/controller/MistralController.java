package com.arhs.ai.poc.controller;


import com.arhs.ai.poc.service.GCustomSearchService;
import com.arhs.ai.poc.service.MistralService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;


@RestController

public class MistralController {

    @Autowired
    private MistralService mistralService;

    @Autowired
    private GCustomSearchService gCustomSearchService;

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


    @RequestMapping(value="/testThyleaf", method = RequestMethod.GET)
    public String testThyleaf(@RequestParam String query) throws JsonProcessingException {


        return "testView";



    }
}
