/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsystem.Users;

/**
 *
 * @author Student
 */
public abstract class User {
    private String firstName;
    private String surname;
    private String userId;
    private String address;

    public User(String firstName, String surname, String userId, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.userId = userId;
        this.address = address;
    }
    
    
}
