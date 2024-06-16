package main.security.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import main.security.DTO.Request.RoleRequest;
import main.security.DTO.Respone.RoleResponse;
import main.security.Entites.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
