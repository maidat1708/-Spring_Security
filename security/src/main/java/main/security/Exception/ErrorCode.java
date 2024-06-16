package main.security.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(1000,"Uncaegorized Exception!",HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(999,"Invalid key", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1001,"User existed!", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1008,"User not existed!", HttpStatus.NOT_FOUND),
    USERNAME_TOO_SHORT(1003,"Username must be at least 3 characters!", HttpStatus.BAD_REQUEST),
    USERNAME_TOO_LONG(1004,"Username too long!", HttpStatus.BAD_REQUEST),
    USERNAME_EMPTY(1005,"Username is empty!", HttpStatus.BAD_REQUEST),
    USERNAME_NOT_UPPERCASED(1006,"Username must contain uppercased character!", HttpStatus.BAD_REQUEST),
    PASSWORD_TOO_SHORT(1007,"Password must be at least 8 characters!", HttpStatus.BAD_REQUEST),
    UNAUTHENTICATED(1009, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1010, "You do not have permission", HttpStatus.FORBIDDEN),
    // Định nghĩa các hằng số của enum
    NOT_FOUND(404, "Not Found", HttpStatus.NOT_FOUND),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", HttpStatus.BAD_REQUEST),
    BAD_REQUEST(400, "Bad Request", HttpStatus.BAD_REQUEST);
    
    

     ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatusCode statusCode;
}
