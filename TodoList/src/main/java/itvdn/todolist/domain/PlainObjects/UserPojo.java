package itvdn.todolist.domain.PlainObjects;

import java.util.HashSet;
import java.util.Set;

public class UserPojo {

    private Long id;
    private String email;
    private String password;
    private Set<TodoPojo> todoList = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<TodoPojo> getTodoList() {
        return todoList;
    }

    public void setTodoList(Set<TodoPojo> todoList) {
        this.todoList = todoList;
    }
}
