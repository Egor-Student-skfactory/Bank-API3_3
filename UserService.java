package org.example.Service;


import org.example.DTO.Mapper.UserDTO;
import org.example.DTO.Mapper.UserMapper;
import org.example.DTO.Mapper.UserMapperImpl;
import org.example.Repository.BalanceRepository;
import org.example.model.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final BalanceRepository Brepository;
    UserMapper mapper = new UserMapperImpl();
    UserEntity userEntity;
    UserDTO dto;
    public UserService(BalanceRepository brepository) {
        this.Brepository = brepository;

    }

    public UserDTO getBalanceAndID(Long ID)throws Exception {
        try {
            userEntity = Brepository.findByID(ID);
            return mapper.entityToDto(userEntity);
        } catch (Exception e) {
            throw new Exception("Ошибка при выполнении операции");
        }

    }

    public UserDTO putMoneyAndBalance(Long ID, int putSum){
        UserEntity userEntity = Brepository.findByID(ID);
        userEntity.setBalance(userEntity.Balance + putSum);
        Brepository.save(userEntity);
        return mapper.entityToDto(userEntity);
    }

    public UserDTO takeMoneyAndBalance(Long ID, int takeSum) {
            UserEntity userEntity = Brepository.findById(ID).get();
        if (userEntity.Balance > takeSum){
            userEntity.setBalance(userEntity.Balance - takeSum);
            Brepository.save(userEntity);
            return mapper.entityToDto(userEntity);
        }
        else{
            return null;
        }
    }
}