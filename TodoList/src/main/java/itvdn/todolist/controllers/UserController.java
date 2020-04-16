package itvdn.todolist.controllers;

import itvdn.todolist.domain.Todo;
import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping(path = "/todo")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        System.out.println(todo);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

}
