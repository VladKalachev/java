package itvdn.todolist.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(path = "/test")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("Test message", HttpStatus.OK);
    }
}
