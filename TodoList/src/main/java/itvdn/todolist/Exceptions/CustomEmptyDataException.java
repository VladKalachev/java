package itvdn.todolist.Exceptions;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "no such element exists")
public class CustomEmptyDataException extends DataAccessException {

    public CustomEmptyDataException(String msg) {
        super(msg);
    }

    public CustomEmptyDataException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
