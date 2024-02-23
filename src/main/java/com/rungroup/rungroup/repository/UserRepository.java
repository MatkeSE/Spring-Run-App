package com.rungroup.rungroup.repository;

import com.rungroup.rungroup.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String userName);
//    UserEntity findFirstByUsername(String username);
}
