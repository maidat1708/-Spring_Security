package main.security.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.security.DTO.Request.UserCreationRequest;
import main.security.DTO.Request.UserUpdateRequest;
import main.security.Entites.User;
import main.security.Exception.AppException;
import main.security.Exception.ErrorCode;
import main.security.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User createUser(UserCreationRequest request){
        User user = new User();
        
        if(repo.existsByUsername(request.getUsername())) throw new AppException(ErrorCode.USER_EXISTED);

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return repo.save(user);
    }

    public List<User> getUsers(){
        return repo.findAll();
    }

    public User getUser(String id){
        return repo.findById(id).orElseThrow(() -> new AppException(ErrorCode.NOT_FOUND,"User not found!"));
    }

    public User updateUser(String id, UserUpdateRequest request){
        User user = getUser(id);
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return repo.save(user);
    }

    public void deleteUser(String id){
        repo.deleteById(id);
    }
}
