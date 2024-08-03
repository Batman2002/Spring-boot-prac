package com.example.prac.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    String firstName;
    String lastName;
    String email;
    String password;
    String phoneNo;
    Boolean logState;


    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        this.Id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public Boolean getLogState() {
        return logState;
    }
    public void setLogState(Boolean logState) {
        this.logState = logState;
    }
    

    
}
