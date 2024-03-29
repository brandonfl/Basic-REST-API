package core.communication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for invalid phone numbers (french number)
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidPhoneNumberException extends Exception {

    public InvalidPhoneNumberException() {
        super("Error : The input phone number is invalid");
    }
}
