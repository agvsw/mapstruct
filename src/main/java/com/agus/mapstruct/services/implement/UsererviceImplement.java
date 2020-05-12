package com.agus.mapstruct.services.implement;

import com.agus.mapstruct.models.User;
import com.agus.mapstruct.repository.UserRepository;
import com.agus.mapstruct.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsererviceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User addser(User user) {
        return userRepository.save(user);
    }
}
