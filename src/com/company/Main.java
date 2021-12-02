package com.company;

import com.company.User.User;
import com.company.User.UserController;
import com.company.User.UserRole;

public class Main {

    public static void main(String[] args) {
        User user = new User("Nordy", "Boucif", UserRole.USER);
        User user1 = new User("Mahdi", "Boucif", UserRole.USER);
        UserController controller = new UserController();
        controller.addUser(user);
        controller.printUser();
        controller.addUser(user1);
        controller.printUser();
    }
}
