package main.security.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import main.security.DTO.Request.UserCreationRequest;
import main.security.DTO.Request.UserUpdateRequest;
import main.security.DTO.Respone.UserResponse;
import main.security.Entites.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}