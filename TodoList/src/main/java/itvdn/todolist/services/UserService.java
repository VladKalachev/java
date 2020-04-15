package itvdn.todolist.services;

import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    public UserService() {
    }

    @Override
    public int createUser(User user) {
        return 0;
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public int updateUser(User updatedUser, long id) {

        return 0;
    }

    @Override
    public int deleteUser(long id) {

        return 0;
    }
}
