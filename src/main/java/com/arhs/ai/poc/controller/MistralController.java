package com.arhs.ai.poc.controller;


import com.arhs.ai.poc.service.MistralService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RestController

public class MistralController {

    @Autowired
    private MistralService mistralService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "Logged in "+model.get("name");
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String query) throws JsonProcessingException {


        String result = mistralService.callMistralService(query);


    return result;

    }

}
