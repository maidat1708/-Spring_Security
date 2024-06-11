package main.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.security.Entites.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    
}
