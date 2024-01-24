package org.example.DTO.Mapper;

import javax.annotation.processing.Generated;
import org.example.model.UserEntity;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2024-01-21T20:42:23+0300",
        comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
public class UserMapperImp implements UserMapper {

    @Override
    public UserDTO entityToDto(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setBalance( entity.getBalance() );
        userDTO.Balance = entity.Balance;

        return userDTO;
    }

    @Override
    public UserEntity dtoToEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setID( dto.getID() );
        userEntity.Balance = dto.Balance;

        return userEntity;
    }
}
