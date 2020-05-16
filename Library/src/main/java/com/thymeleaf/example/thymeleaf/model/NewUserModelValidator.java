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
        if(newUserModel.getName() == null || "".equals(newUserModel.getName()))
            errors.rejectValue("name", "NameNotPresent");
        if(newUserModel.getUname() == null || "".equals(newUserModel.getUname()))
            errors.rejectValue("uname", "UserNameNotPresent");
        if(newUserModel.getPassword() == null || "".equals(newUserModel.getPassword()))
            errors.rejectValue("password", "PasswordNotPresent");
        if(newUserModel.getRole() == null || "".equals(newUserModel.getRole()))
            errors.rejectValue("role", "RoleNotPresent");
    }
}
