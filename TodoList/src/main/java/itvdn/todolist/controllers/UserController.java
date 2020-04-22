package itvdn.todolist.controllers;

import itvdn.todolist.Exceptions.CustomEmptyDataException;
import itvdn.todolist.Security.TokenManager;
import itvdn.todolist.Security.TokenPayload;
import itvdn.todolist.domain.PlainObjects.UserPojo;
import itvdn.todolist.domain.User;
import itvdn.todolist.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UserController {

    private final IUserService userService;
    private final TokenManager tokenManager;

    @Autowired
    public UserController(IUserService userService, TokenManager tokenManager) {
        this.userService = userService;
        this.tokenManager = tokenManager;
    }

    @PostMapping(path = "/registration")
    public ResponseEntity<UserPojo> createUser(@RequestBody User user) {
        UserPojo result = userService.createUser(user);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(path = "/authentication")
    public ResponseEntity<String> authenticateUser(@RequestBody User user) {
        UserPojo authenticatedUser = userService.findUserByEmailAndPassword(user.getEmail(), user.getPassword());

        if(authenticatedUser == null) {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }

        String token = tokenManager.createToken(new TokenPayload(authenticatedUser.getId(), authenticatedUser.getEmail(), Calendar.getInstance().getTime()));

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @GetMapping(path = "/user/{id}")
    public ResponseEntity<UserPojo> getUser(@PathVariable long id) {
        UserPojo result = userService.getUser(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(path = "/users")
    public ResponseEntity<List<UserPojo>> getUser() {
        List<UserPojo> result = userService.getAllUsers();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping(path = "/user/{id}")
    public ResponseEntity<UserPojo> updateUser(@PathVariable Long id, @RequestBody User source) {
        UserPojo result = userService.updateUser(source, id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping(path = "/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
    }

    /**
     * Exception handling
     */
    @ExceptionHandler
    public ResponseEntity<String> onConflictUserEmail(DataIntegrityViolationException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ClassUtils.getShortName(exception.getClass()) + ": User with such email already registered");
    }

    @ExceptionHandler
    public ResponseEntity<String> onMissingUserId(NoSuchElementException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ClassUtils.getShortName(exception.getClass()) + ": No such user was found");
    }

    @ExceptionHandler
    public ResponseEntity<String> onMissingUser (EmptyResultDataAccessException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ClassUtils.getShortName(exception.getClass())
                + exception.getLocalizedMessage()
                + ": no one user was found");
    }

    @ExceptionHandler
    public ResponseEntity<String> SQLProblems (SQLException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ClassUtils.getShortName(exception.getClass())
                + exception.getSQLState()
                + exception.getLocalizedMessage()
                + ": something went wrong with user");
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
