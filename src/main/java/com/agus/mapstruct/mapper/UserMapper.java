package com.agus.mapstruct.mapper;

import com.agus.mapstruct.dtos.UserDTO;
import com.agus.mapstruct.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User mapDtoToUser(UserDTO userDTO);
}
