package itvdn.todolist.services;

import itvdn.todolist.domain.PlainObjects.UserPojo;
import itvdn.todolist.domain.User;
import itvdn.todolist.repositories.UserRepositories;
import itvdn.todolist.services.interfaces.IUserService;
import itvdn.todolist.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {

    private final Converter converter;
    private final UserRepositories userRepositories;

    @Autowired
    public UserService(Converter converter, UserRepositories userRepositories){
        this.converter = converter;
        this.userRepositories = userRepositories;
    }

    @Override
    @Transactional
    public UserPojo createUser(User user) {
        userRepositories.save(user);
        return converter.userToPojo(user);
    }

    @Override
    @Transactional(readOnly = true)
    public UserPojo getUser(long id) {

        Optional<User> foundUserOptional = userRepositories.findById(id);
        if(foundUserOptional.isPresent()) {
            return converter.userToPojo(foundUserOptional.get());
        } else {
            return converter.userToPojo(new User());
        }
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
