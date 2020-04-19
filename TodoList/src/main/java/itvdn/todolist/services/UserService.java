package itvdn.todolist.services;

import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserService implements IUserService {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public User createUser(User user) {

        entityManager.persist(user);

        User result = new User();
        result.setId(user.getId());
        result.setEmail(user.getEmail());
        result.setPassword(user.getPassword());

        return result;

    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(long id) {

        User fundUser = entityManager
                .createQuery("SELECT user FROM User user WHERE user.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();

        User result = new User();
        result.setId(fundUser.getId());
        result.setEmail(fundUser.getEmail());
        result.setPassword(fundUser.getPassword());

        return result;

    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User updateUser(User updatedUser, long id) {

        return null;
    }

    @Override
    public User deleteUser(long id) {

        return null;
    }
}
