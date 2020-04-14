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

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTableUser() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS Users");
        jdbcTemplate.execute("CREATE TABLE Users(Id LONG, Email VARCHAR(30), Password VARCHAR(30))");
    }

    @Override
    public List<User> getUserAll() {
        String sql = "SELECT * FROM Users";
        return jdbcTemplate.query(
                sql,
                (rs, rowNum) ->
                    new User(
                            rs.getLong("id"),
                            rs.getString("email"),
                            rs.getString("password")
                    )
            );
    }

    @Override
    public int createUser(User user) {
        String query = "INSERT INTO Users VALUES(" + user.getId() + ",'" + user.getEmail() + "','" + user.getPassword() + "')";
        int result = jdbcTemplate.update(query);
        return result;
    }



    @Override
    public User getUser(long id) {
        String query = "SELECT * FROM Users WHERE Id=?";
        User foundUser = jdbcTemplate.queryForObject(query, new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
        return foundUser;
    }

    @Override
    public int updateUser(User updatedUser, long id) {
        String query = "UPDATE Users SET Email='" + updatedUser.getEmail() + "', password='" + updatedUser.getPassword() + "' WHERE id=" + id;
        int result = jdbcTemplate.update(query);
        return result;
    }

    @Override
    public int deleteUser(long id) {
        String query = "DELETE FROM Users WHERE Id=" + id;
        int result = jdbcTemplate.update(query);
        return result;
    }
}
