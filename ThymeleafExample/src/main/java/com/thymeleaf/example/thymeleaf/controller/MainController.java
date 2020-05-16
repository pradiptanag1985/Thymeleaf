package com.thymeleaf.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView homePage() {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("userName", "Pradipta");
        modelMap.put("id", 133);
        return new ModelAndView("homePage" , "model", modelMap);
    }

    @RequestMapping("/profile")
    public ModelAndView viewProfile() {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("title", "Mr.");
        modelMap.put("firstName", "Pradipta");
        modelMap.put("lastName", "Nag");
        modelMap.put("dob", new GregorianCalendar(2008, 3, 9).getTime());
        modelMap.put("desc", "<strong>Java associate</strong>");
        modelMap.put("color", "#ccc");

        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Hindi");
        languageList.add("Bengali");
        modelMap.put("languages", languageList);
        return new ModelAndView("profile", "model", modelMap);
    }
}
