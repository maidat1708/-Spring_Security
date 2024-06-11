package main.security.DTO.Request;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;
import main.security.Validation.Interface.IIsCharacterUppercased;

public class UserCreationRequest {
    
    @IIsCharacterUppercased(maxLength = 20)
    @Size(min = 3, message = "USERNAME_TOO_SHORT")
    private String username;
    
    @Size(min = 8, message = "PASSWORD_TOO_SHORT")
    private String password;
    private String firstName;
    private String lastName;
    
    private LocalDate dob;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
}