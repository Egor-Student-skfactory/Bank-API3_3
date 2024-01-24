package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_data")
public class UserEntity {
    @Id
    private Long ID;
    @Column(name="Balance")
    public int Balance;


    public UserEntity() {

    }

    public long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getBalance(){
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

}
