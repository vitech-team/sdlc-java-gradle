package com.vitech.moodfeed.user;

import com.vitech.moodfeed.SmallTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class UserServiceTest extends SmallTest {

    @Mock
    private UserRepository userRepositoryMock;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void testGetLoggedUser() {
        // mock
        List<User> allUsers = testUsers();
        when(userRepositoryMock.findAll()).thenReturn(allUsers);
        // test
        User loggedUser = userService.getLoggedUser();
        // verify
        assertNotNull(loggedUser);
        assertTrue(allUsers.contains(loggedUser));
    }
}