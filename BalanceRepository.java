package org.example.Repository;

import org.example.DTO.Mapper.UserDTO;
import org.example.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BalanceRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByID(Long ID);
}