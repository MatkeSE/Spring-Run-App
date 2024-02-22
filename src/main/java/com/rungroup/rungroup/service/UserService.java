package com.rungroup.rungroup.service;

import com.rungroup.rungroup.dto.RegistrationDto;
import com.rungroup.rungroup.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
