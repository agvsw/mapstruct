package com.agus.mapstruct.services;

import com.agus.mapstruct.models.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUser();
    User findById(UUID id);
    User addser(User user);
}
