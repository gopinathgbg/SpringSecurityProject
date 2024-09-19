package com.spring.security.example.userrepo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.example.userentity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
	
    Optional<User> findByUsername(String username);
    
}