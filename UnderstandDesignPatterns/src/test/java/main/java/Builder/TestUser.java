package main.java.Builder;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestUser {

    @Test
    public void testUser(){
        User user = new User.UserBuilder("saumya",8).build();
        assertEquals(user,new User.UserBuilder("saumya",8).build());
        // This is a new change
    }
}
