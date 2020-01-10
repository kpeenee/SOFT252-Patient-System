/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Student
 */
public class Patient extends User {
int age;
String gender;
    public Patient(String name, String userID, String password, String address, int age, String gender) {
        super(name, userID, password, address);
        this.age = age;
        this.gender = gender;
    }
    
}
