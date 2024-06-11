package main.security.Exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(1000,"Uncaegorized Exception!"),
    INVALID_KEY(999,"Invalid key"),
    USER_EXISTED(1001,"User existed!"),
    USERNAME_TOO_SHORT(1003,"Username must be at least 3 characters!"),
    USERNAME_TOO_LONG(1004,"Username too long!"),
    USERNAME_EMPTY(1005,"Username is empty!"),
    USERNAME_NOT_UPPERCASED(1006,"Username must contain uppercased character!"),
    PASSWORD_TOO_SHORT(1007,"Password must be at least 8 characters!"),
    // Định nghĩa các hằng số của enum
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    BAD_REQUEST(400, "Bad Request");
    

    private int code;
    private String message;

    ErrorCode(int code) {
        this.code = code;
    }

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
