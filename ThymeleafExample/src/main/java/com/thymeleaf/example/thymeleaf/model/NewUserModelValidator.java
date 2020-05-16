package com.thymeleaf.example.thymeleaf.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class NewUserModelValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return NewUserModel.class.equals(aClass);
    }

    @Override
    public void validate(Object user, Errors errors) {
        NewUserModel newUserModel = (NewUserModel) user;
        if(!newUserModel.getPassword().equals(newUserModel.getRepeatPassword()))
            errors.rejectValue("repeatPassword", "PasswordsDontMatch");
    }
}
