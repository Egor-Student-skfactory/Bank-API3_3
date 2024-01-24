package org.example.DTO.Mapper;


public class UserDTO  {
    private Long ID;
     int Balance;

    public UserDTO() {

    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getID() {
        return ID;
    }

}
