package itvdn.todolist.repositories;

import itvdn.todolist.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepositorues extends CrudRepository<Todo, Long> {

}
