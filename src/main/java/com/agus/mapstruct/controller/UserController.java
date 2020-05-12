package com.agus.mapstruct.controller;

import com.agus.mapstruct.dtos.UserDTO;
import com.agus.mapstruct.mapper.UserMapper;
import com.agus.mapstruct.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.addser(userMapper.INSTANCE.mapDtoToUser(userDTO)), HttpStatus.OK);
    }
}
