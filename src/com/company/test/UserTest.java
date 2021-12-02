package com.company.test;

import com.company.User.User;
import com.company.User.UserRole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserTest {
    User user;

    @BeforeEach
    void setUp(){
         user = new User("Nordy", "Boucif", UserRole.USER);
    }
    @Test
    @DisplayName("Get UserRole")
    void testUserRole(){
        assertEquals(UserRole.USER,user.getUserRole());
    }

    @Test
    void testNotNull(){
        assertNotNull(user.getUserRole());
        assertNotNull(user.getFirst_name());
        assertNotNull(user.getLast_name());
        user.setFirst_name(null);
        assertNull(user.getFirst_name());
    }
}