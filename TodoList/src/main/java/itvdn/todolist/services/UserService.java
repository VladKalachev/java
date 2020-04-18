package itvdn.todolist.services;

import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class UserService implements IUserService {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public UserService(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public User createUser(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        try {
            entityManager.persist(user);

            User result = new User();
            result.setId(user.getId());
            result.setEmail(user.getEmail());
            result.setPassword(user.getPassword());

            entityManager.getTransaction().commit();
            return result;
        } finally {
            if(entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }
            if(entityManager.isOpen()){
                entityManager.close();
            }
            entityManager.close();
        }
    }

    @Override
    public User getUser(long id) {
        return null;
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
