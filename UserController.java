package org.example.Controller;


import org.example.DTO.Mapper.UserDTO;
import org.example.DTO.Mapper.UserMapper;
import org.example.DTO.Mapper.UserMapperImpl;
import org.example.Service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/user",produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    UserMapper mapper = new UserMapperImpl();

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "balance/id/{id}")
    public UserDTO getBalance(@PathVariable("id") Long ID) throws Exception {
       UserDTO u =  userService.getBalanceAndID(ID);
       return u;
    }

        @PutMapping(value = "putMoney/putSum/{putSum}/id/{id}")
        public int putMoney(@PathVariable("id") Long ID,@PathVariable("putSum") int putSum){
            userService.putMoneyAndBalance(ID, putSum);
            return 1;
        }

        @PutMapping(value = "takeMoney/takeSum/{takeSum}/id/{id}")
        public int takeMoney(@PathVariable("id") Long ID,@PathVariable("takeSum") int takeSum) {
            while (true){
            userService.takeMoneyAndBalance(ID, takeSum);
            return 1;
        }
        }
}