package core.communication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for empty fields on requested fields
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmptyFieldException extends Exception {
    public EmptyFieldException(String name) {
        super(String.format("Error : %s need to dont be empty",name));
    }
}
