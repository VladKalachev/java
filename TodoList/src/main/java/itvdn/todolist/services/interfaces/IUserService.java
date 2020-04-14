package itvdn.todolist.services.interfaces;

import itvdn.todolist.domain.User;

import java.util.List;

public interface IUserService {
    int createUser(User user);
    User getUser(long id);
    int updateUser(User user, long id);
    int deleteUser(long id);
    void createTableUser();
    List<User> getUserAll();
}
