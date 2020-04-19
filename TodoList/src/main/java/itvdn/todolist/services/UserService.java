package itvdn.todolist.services;

import itvdn.todolist.domain.PlainObjects.UserPojo;
import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import itvdn.todolist.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    @PersistenceContext
    EntityManager entityManager;

    private final Converter converter;

    @Autowired
    public UserService(Converter converter){
        this.converter = converter;
    }

    @Override
    @Transactional
    public UserPojo createUser(User user) {
        entityManager.persist(user);
        return converter.userToPojo(user);
    }

    @Override
    @Transactional(readOnly = true)
    public UserPojo getUser(long id) {

        User foundUser = entityManager
                .createQuery("SELECT user FROM User user WHERE user.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();


        return converter.userToPojo(foundUser);

    }

    @Override
    @Transactional(readOnly = true)
    public List<UserPojo> getAllUsers() {
        List<User> listOfUsers= entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();

        List<UserPojo> result = listOfUsers.stream().map(user -> converter.userToPojo(user)).collect(Collectors.toList());
        return result;
    }

    @Override
    public UserPojo updateUser(User updatedUser, long id) {

        return null;
    }

    @Override
    public UserPojo deleteUser(long id) {

        return null;
    }
}
