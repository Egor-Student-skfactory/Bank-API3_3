package org.example.DTO.Mapper;

import org.example.model.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDTO entityToDto(UserEntity entity);

    UserEntity dtoToEntity(UserDTO dto);

}