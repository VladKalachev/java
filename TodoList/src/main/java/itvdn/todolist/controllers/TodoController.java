package itvdn.todolist.controllers;

import itvdn.todolist.Exceptions.CustomEmptyDataException;
import itvdn.todolist.domain.PlainObjects.TodoPojo;
import itvdn.todolist.domain.Todo;
import itvdn.todolist.services.interfaces.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TodoController {

    private final ITodoService todoService;

    @Autowired
    public TodoController(ITodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping(path = "/user/{userId}/todo")
    public ResponseEntity<TodoPojo> createTodo (@RequestBody Todo todo, @PathVariable Long userId){
        TodoPojo result = todoService.createTodo(todo, userId);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }


    @GetMapping(path = "/user/{userId}/todo/{id}")
    public ResponseEntity<TodoPojo> getTodo (@PathVariable Long id) {
        return new ResponseEntity<>(todoService.getTodo(id), HttpStatus.OK);
    }

    @GetMapping(path = "/user/{userId}/todos")
    public ResponseEntity<List<TodoPojo>> getAllTodo (@PathVariable Long userId) {
        return new ResponseEntity<>(todoService.getAllTodos(userId), HttpStatus.OK);
    }

    @PutMapping(path = "/user/{userId}/todo/{id}")
    public ResponseEntity<TodoPojo> updateTodo (@RequestBody Todo source, @PathVariable Long id) {
        return new ResponseEntity<>(todoService.updateTodo(source, id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/user/{userId}/todo/{id}")
    public ResponseEntity<String> deleteTodo (@PathVariable Long id) {
        return new ResponseEntity<>(todoService.deleteTodo(id), HttpStatus.OK);
    }

    /**
     * Exception handling
     */

    @ExceptionHandler
    public ResponseEntity<String> onMissingTodoName (DataIntegrityViolationException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ClassUtils.getShortName(exception.getClass()) + ": Name of todo is obligatory");
    }

    @ExceptionHandler
    public ResponseEntity<String> onMissingTodoId(NoSuchElementException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ClassUtils.getShortName(exception.getClass())
                + " # "
                + exception.getLocalizedMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String> onMissingTodo (EmptyResultDataAccessException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ClassUtils.getShortName(exception.getClass()) + ": no one todo was found");
    }

    @ExceptionHandler
    public ResponseEntity<String> SQLProblems (SQLException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ClassUtils.getShortName(exception.getClass())
                + exception.getSQLState()
                + exception.getLocalizedMessage()
                + ": something went wrong with todo");
    }

    @ExceptionHandler
    public ResponseEntity<String> customExceptionHandler (CustomEmptyDataException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ClassUtils.getShortName(exception.getClass())
                + " "
                + exception.getCause()
                + " "
                + exception.getLocalizedMessage());
    }
}
