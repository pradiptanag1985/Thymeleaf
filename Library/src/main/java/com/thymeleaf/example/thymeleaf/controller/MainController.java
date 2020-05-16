package com.thymeleaf.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView root() {
        return new ModelAndView("homePage");
    }

    @RequestMapping("/homePage")
    public ModelAndView home() {
        return new ModelAndView("homePage");
    }

    @RequestMapping("/landing")
    public ModelAndView homePage() {
        return new ModelAndView("landingPage");
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

}
