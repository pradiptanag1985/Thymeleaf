package com.thymeleaf.example.thymeleaf.controller;

import com.thymeleaf.example.thymeleaf.model.NewUserModel;
import com.thymeleaf.example.thymeleaf.model.NewUserModelValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class NewUserController {

    @RequestMapping("/register")
    public ModelAndView newUser() {
        return new ModelAndView("register", "newUserModel", new NewUserModel());
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@Valid NewUserModel newUserModel, BindingResult bindingResult, Model model) {
        new NewUserModelValidator().validate(newUserModel, bindingResult);
        if(bindingResult.hasErrors()) {
            model.addAttribute("failureMessage", "Error while registering user!!");
            return "register";
        }
        System.out.println(newUserModel);
        model.addAttribute("successMessage", "Successfully registered user!!");
        return "register";
    }
}
