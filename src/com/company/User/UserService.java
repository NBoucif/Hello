package com.company.User;

public class UserService {

    private UserRepo userRepo;

    public UserService() {
        userRepo = new UserRepo();
    }
    public void addUser(User user){
        userRepo.addUser(user);
    }

    public void printUser() {
        System.out.println(userRepo.getDatabase());
    }
}
