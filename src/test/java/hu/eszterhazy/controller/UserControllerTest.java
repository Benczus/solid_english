package hu.eszterhazy.controller;

import hu.eszterhazy.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class UserControllerTest {

    @Test
    void saveWhenDependeciesAreNull() {

        //Given
        UserController userController= new UserController(null, null);
        String userName = "username";
        int InvalidOperationID= -1;
        // When
        int saveID = userController.save(userName);

        // Then
        assertEquals(InvalidOperationID,saveID);


    }
}