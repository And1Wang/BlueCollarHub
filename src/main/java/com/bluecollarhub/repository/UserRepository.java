package com.bluecollarhub.repository;

import com.bluecollarhub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // define custom query methods here AW DEC192024
}