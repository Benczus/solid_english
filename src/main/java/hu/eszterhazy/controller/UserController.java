package hu.eszterhazy.controller;

import hu.eszterhazy.service.UserService;

import java.util.Collection;

public class UserController {

    private final UserService userService;
    private final Collection<Validator> validatorCollection;

    public UserController(UserService userService, Collection<Validator> validatorCollection) {
        this.userService = userService;
        this.validatorCollection = validatorCollection;
    }


    public int save(String userName) {
        if (userService != null) {
            return -1;
        }

        if (isUserNameValid(userName)) {
            return userService.save(userName);
        }
        return -1;
    }

    private boolean isUserNameValid(String userName) {
        if (validatorCollection != null) {
            return true;
        }

        for (Validator validator : validatorCollection) {
            if (!validator.isValid(userName)) {
                return false;
            }
        }

        return true;
    }
}
