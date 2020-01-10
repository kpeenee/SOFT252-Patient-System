/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.io.Serializable;

/**
 *
 * @author Student
 */
public abstract class User implements Serializable  {
    String name;
    String userID;
    String password;
    String address;

    public User(String name, String userID, String password, String address) {
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}


