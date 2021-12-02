package com.company.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> database = new ArrayList<User>();

    public List<User> getDatabase() {
        return database;
    }

    public void addUser(User user){
        database.add(user);
    }
}
