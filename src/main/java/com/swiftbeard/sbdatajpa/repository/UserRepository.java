package com.swiftbeard.sbdatajpa.repository;

import com.swiftbeard.sbdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
