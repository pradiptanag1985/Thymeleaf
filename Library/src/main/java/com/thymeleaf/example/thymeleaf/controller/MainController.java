package com.thymeleaf.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
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

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping("/userDashboard")
    public ModelAndView userDashboard() {
        return new ModelAndView("userdashboard");
    }

    @RequestMapping("/adminDashboard")
    public ModelAndView adminDashboard() {
        return new ModelAndView("admindashboard");
    }

}
