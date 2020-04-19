package itvdn.todolist.services;

import itvdn.todolist.domain.PlainObjects.TodoPojo;
import itvdn.todolist.domain.Tag;
import itvdn.todolist.domain.Todo;
import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.ITagService;
import itvdn.todolist.services.interfaces.ITodoService;
import itvdn.todolist.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TodoService implements ITodoService {

    @PersistenceContext
    EntityManager entityManager;

    private final Converter converter;
    private final ITagService tagService;

    @Autowired
    public TodoService(Converter converter, ITagService tagService){
        this.converter = converter;
        this.tagService = tagService;
    }

    @Override
    public TodoPojo createTodo(Todo todo, Long userId) {

        User todoUser = entityManager
                .createQuery("SELECT user From User user WHERE user.id = :id", User.class)
                .setParameter("id", userId)
                .getSingleResult();

        Set<Tag> tags = new HashSet<>();
        tags.addAll(todo.getTagList());

        todo.getTagList().clear();

        entityManager.persist(todo);
        todo.setUser(todoUser);

        tags.stream().map(tag -> tagService.findOrCreate(tag)).collect(Collectors.toSet()).forEach(todo::addTag);

        return converter.todoToPojo(todo);
    }

    @Override
    public TodoPojo getTodo(Long id) {
        return null;
    }

    @Override
    public TodoPojo updateTodo(Todo updateTodo, Long userId) {
        return null;
    }

    @Override
    public TodoPojo deleteTodo(Long id) {
        return null;
    }

    @Override
    public List<TodoPojo> getAllTodos(Long userId) {
        return null;
    }
}
