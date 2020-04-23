package itvdn.todolist.services;

import itvdn.todolist.domain.PlainObjects.UserPojo;
import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {

    private final String EMAIL = "email";
    private final String PASSWORD = "123";

    private ApplicationContext applicationContext;
    private IUserService userService;

    @Before
    public void init() {
        this.applicationContext = new ClassPathXmlApplicationContext("/mainTest.xml");
        this.userService = applicationContext.getBean("userService", IUserService.class);
    }

    @After
    public void cleanDB() {
        userService.getAllUsers().forEach(userPojo -> userService.deleteUser(userPojo.getId()));
    }

    @Test
    public void createUserTest() {
        User newUser = new User();
        newUser.setEmail(EMAIL);
        newUser.setPassword(PASSWORD);

        UserPojo actual = userService.createUser(newUser);

        assertEquals(EMAIL, actual.getEmail());
        assertEquals(PASSWORD, actual.getPassword());
        assertNotNull(actual.getId());
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testUniqueUserEmail() {
        User newUser = new User();
        newUser.setEmail(EMAIL);
        newUser.setPassword(PASSWORD);
        userService.createUser(newUser);
        User newUser2 = new User();
        newUser2.setEmail(EMAIL);
        newUser2.setPassword(PASSWORD);
        userService.createUser(newUser2);
    }

    @Test
    public void getUserTest() {
        User newUser = new User();
        newUser.setEmail(EMAIL);
        newUser.setPassword(PASSWORD);

        UserPojo actual = userService.createUser(newUser);
        UserPojo current = userService.getUser(actual.getId());

        assertEquals(actual.getId(), current.getId());
        assertEquals(EMAIL, current.getEmail());
        assertEquals(PASSWORD, current.getPassword());

    }

    @Test
    public void findUserByEmailAndPasswordTest() {
        User newUser = new User();
        newUser.setEmail(EMAIL);
        newUser.setPassword(PASSWORD);

        UserPojo actual = userService.createUser(newUser);
        UserPojo current = userService.findUserByEmailAndPassword(EMAIL, PASSWORD);

        assertEquals(actual.getId(), current.getId());
        assertEquals(actual.getEmail(), current.getEmail());
        assertEquals(actual.getPassword(), current.getPassword());

    }

    @Test
    public void updateUserTEst() {
        User newUser = new User();
        newUser.setEmail(EMAIL);
        newUser.setPassword(PASSWORD);
        UserPojo actual = userService.createUser(newUser);

        User userForUpdate = new User();
        userForUpdate.setEmail("123");
        userForUpdate.setPassword("111");

        UserPojo updatedUser = userService.updateUser(userForUpdate, actual.getId());

        assertEquals(actual.getId(), updatedUser.getId());
        assertEquals("123", updatedUser.getEmail());
        assertEquals("111", updatedUser.getPassword());

    }

    @Test
    public void deleteUserTest() {
        User newUser = new User();
        newUser.setEmail(EMAIL);
        newUser.setPassword(PASSWORD);

        UserPojo actual = userService.createUser(newUser);

        List<UserPojo> userListAfterCreate = userService.getAllUsers();
        assertEquals(1, userListAfterCreate.size());

        userService.deleteUser(actual.getId());

        List<UserPojo> userListAfterDelete = userService.getAllUsers();
        assertEquals(0, userListAfterDelete.size());
    }
}
