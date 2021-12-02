package com.company.User;

public class UserController {

    private UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public void addUser(User user){
        userService.addUser(user);
    }

    public void printUser(){
        userService.printUser();
    }

}
