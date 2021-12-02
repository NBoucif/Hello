package com.company.User;

public class User {
    private String first_name;
    private String last_name;
    private UserRole userRole;

    public User(String first_name, String last_name, UserRole userRole) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", r=" + userRole +
                '}';
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public UserRole getUserRole() {
        return userRole;
    }


}
