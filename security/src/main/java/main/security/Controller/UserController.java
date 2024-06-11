package main.security.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.security.DTO.Request.UserCreationRequest;
import main.security.DTO.Request.UserUpdateRequest;
import main.security.Entites.User;
import main.security.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public User creatUser(@RequestBody UserCreationRequest request){
        return service.createUser(request);
    }

    @GetMapping
    public List<User> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
        return service.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody UserUpdateRequest request){
        return service.updateUser(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        service.deleteUser(id);
        return "User has been deleted";
    }
}
