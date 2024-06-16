package main.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.security.Entites.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}