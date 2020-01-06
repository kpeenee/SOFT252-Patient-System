/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsystem.Users;

import java.io.Serializable;
/**
 *
 * @author Student
 */
public abstract class User implements Serializable {
    
            
    private String firstName;
    private String surname;
    private String userId;
    private String address;
    private String password;

    public User(String firstName, String surname, String userId, String address,String password) {
        this.firstName = firstName;
        this.surname = surname;
        this.userId = userId;
        this.address = address;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
