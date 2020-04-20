package itvdn.todolist.services.interfaces;

import itvdn.todolist.domain.PlainObjects.UserPojo;
import itvdn.todolist.domain.User;

import java.util.List;

public interface IUserService {
    UserPojo createUser(User user);
    UserPojo getUser(long id);
    List<UserPojo> getAllUsers();
    UserPojo updateUser(User user, long id);
    String deleteUser(long id);
}
