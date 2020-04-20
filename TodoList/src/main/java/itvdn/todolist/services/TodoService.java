package itvdn.todolist.services;

import itvdn.todolist.domain.PlainObjects.TodoPojo;
import itvdn.todolist.domain.Tag;
import itvdn.todolist.domain.Todo;
import itvdn.todolist.domain.User;
import itvdn.todolist.repositories.TodoRepositories;
import itvdn.todolist.repositories.UserRepositories;
import itvdn.todolist.services.interfaces.ITagService;
import itvdn.todolist.services.interfaces.ITodoService;
import itvdn.todolist.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TodoService implements ITodoService {


    private final TodoRepositories todoRepositories;

    private final Converter converter;
    private final ITagService tagService;
    private final UserRepositories userRepositories;

    @Autowired
    public TodoService(TodoRepositories todoRepositories, Converter converter, ITagService tagService, UserRepositories userRepositories){
        this.todoRepositories = todoRepositories;
        this.converter = converter;
        this.tagService = tagService;
        this.userRepositories = userRepositories;
    }

    @Override
    @Transactional
    public TodoPojo createTodo(Todo todo, Long userId) {

        Optional<User> todoUserOptional = userRepositories.findById(userId);

        if(todoUserOptional.isPresent()){

            Set<Tag> tags = new HashSet<>();
            tags.addAll(todo.getTagList());

            todo.getTagList().clear();

            todo.setUser(todoUserOptional.get());
            todoRepositories.save(todo);

            tags.stream().map(tag -> tagService.findOrCreate(tag)).collect(Collectors.toSet()).forEach(todo::addTag);
            return converter.todoToPojo(todo);
        } else {
            return converter.todoToPojo(new Todo());
        }

    }

    @Override
    @Transactional
    public TodoPojo getTodo(Long id) {
        Optional<Todo> todoOptional = todoRepositories.findById(id);
        if(todoOptional.isPresent()){
            return converter.todoToPojo(todoOptional.get());
        }
        return converter.todoToPojo(new Todo());
    }

    @Override
    @Transactional
    public TodoPojo updateTodo(Todo source, Long todoId) {
        Optional<Todo> targetOptional = todoRepositories.findById(todoId);

        if (targetOptional.isPresent()) {
            Todo target = targetOptional.get();

            target.setName(source.getName());
            target.setComment(source.getComment());
            target.setStartDate(source.getStartDate());
            target.setEndDate(source.getEndDate());
            target.setImportant(source.getImportant());
            target.setPriority(source.getPriority());

            todoRepositories.save(target);

            return converter.todoToPojo(target);
        } else {
            return converter.todoToPojo(new Todo());
        }
    }

    @Override
    @Transactional
    public String deleteTodo(Long id) {
        Optional<Todo> todoForDeleteOptional = todoRepositories.findById(id);
        if(todoForDeleteOptional.isPresent()) {
            Todo todoForDelete = todoForDeleteOptional.get();
            todoForDelete.getTagList().stream().collect(Collectors.toList()).forEach(tag -> tag.removeTodo(todoForDelete));
            todoRepositories.delete(todoForDelete);
            return "Todo with id:" + id + " was successfully removed";
        }
        return "Todo with id:" + id + " was not found";
    }

    @Override
    @Transactional
    public List<TodoPojo> getAllTodos(Long userId) {
        Optional<User> userOptional = userRepositories.findById(userId);
        if (userOptional.isPresent()) {
            return todoRepositories.findAllByUser(userOptional.get()).stream().map(todo -> converter.todoToPojo(todo)).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

}
