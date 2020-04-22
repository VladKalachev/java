package itvdn.todolist.Security;

import java.util.Date;

public class TokenPayload {
    private Long userId;
    private String email;
    private Date timeOfCreation;

    public TokenPayload(Long userId, String email, Date timeOfCreation) {
        this.userId = userId;
        this.email = email;
        this.timeOfCreation = timeOfCreation;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(Date timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }
}
