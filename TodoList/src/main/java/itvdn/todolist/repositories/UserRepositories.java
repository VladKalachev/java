package itvdn.todolist.repositories;

import itvdn.todolist.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepositories extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findByEmailAndPassword(String email, String password);
}
