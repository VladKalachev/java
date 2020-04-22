package itvdn.todolist.services;

import itvdn.todolist.Exceptions.CustomEmptyDataException;
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
    @Transactional
    public UserPojo findUserByEmailAndPassword(String email, String password) {
        Optional<User> userOptional = userRepositories.findByEmailAndPassword(email, password);
        if(userOptional.isPresent()) {
            return converter.userToPojo(userOptional.get());
        } else {
            return null;
        }
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
        List<User> listOfUsers = userRepositories.findAll();

        return listOfUsers.stream().map(user -> converter.userToPojo(user)).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public UserPojo updateUser(User source, long id) {
        Optional<User> userForUpdateOptional = userRepositories.findById(id);
        if(userForUpdateOptional.isPresent()) {
            User target = userForUpdateOptional.get();
            target.setEmail(source.getEmail());
            target.setPassword(source.getPassword());
            userRepositories.save(target);
            return converter.userToPojo(target);
        } else {
            throw new CustomEmptyDataException("unable to update user");
        }
    }

    @Override
    @Transactional
    public String deleteUser(long id) {
        Optional<User> userForDeleteOptional = userRepositories.findById(id);

        if(userForDeleteOptional.isPresent()){
            userRepositories.delete(userForDeleteOptional.get());
            return "User with id:" + id + "was successfully remover";
        } else {
            throw new CustomEmptyDataException("unable to delete user");
        }
    }
}
