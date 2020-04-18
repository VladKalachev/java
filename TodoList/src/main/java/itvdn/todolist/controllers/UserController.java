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

    @GetMapping(path = "/test")
    public ResponseEntity<String> createTest(){
        return new ResponseEntity<>("Test", HttpStatus.OK);
    };

    @PostMapping(path = "/user/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User result = userService.createUser(user);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(path = "/todo")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        System.out.println(todo);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

}
