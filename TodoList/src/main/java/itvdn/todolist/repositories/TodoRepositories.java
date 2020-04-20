package itvdn.todolist.repositories;

import itvdn.todolist.domain.Todo;
import itvdn.todolist.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepositories extends CrudRepository<Todo, Long> {
    List<Todo> findAllByUser(User user);
}
