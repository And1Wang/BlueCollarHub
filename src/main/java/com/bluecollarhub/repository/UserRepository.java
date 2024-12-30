package com.bluecollarhub.repository;

import com.bluecollarhub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // define custom query methods here AW DEC192024

    // Find a user by username
    Optional<User> findByUsername(String username);

    // Find a user by email
    Optional<User> findByEmail(String email);

    // Check existence by username
    boolean existsByUsername(String username);

    // Check existence by email
    boolean existsByEmail(String email);
}
