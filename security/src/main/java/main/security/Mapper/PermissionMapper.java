package main.security.Mapper;

import org.mapstruct.Mapper;

import main.security.DTO.Request.PermissionRequest;
import main.security.DTO.Respone.PermissionResponse;
import main.security.Entites.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
