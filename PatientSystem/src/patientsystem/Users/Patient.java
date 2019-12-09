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
public class Patient extends User {

    private String gender;
    private int age;
    
    public Patient(String firstName, String surname, String userId, String address,String gender, int age) {
        super(firstName, surname, userId, address);
        this.gender = gender;
        this.age = age;
    }
    
}
