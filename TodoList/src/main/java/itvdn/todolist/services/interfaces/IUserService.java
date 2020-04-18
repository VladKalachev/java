package itvdn.todolist.services.interfaces;

import itvdn.todolist.domain.User;

import java.util.List;

public interface IUserService {
    User createUser(User user);
    User getUser(long id);
    List<User> getAllUser();
    User updateUser(User user, long id);
    User deleteUser(long id);
}
