package main.security.DTO.Respone;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) // chỉ hiện những trường ko null
public class APIResponse<T> {
    private int code = 200;
    private String message;
    private T result;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }
}
