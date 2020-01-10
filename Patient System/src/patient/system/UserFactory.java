/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.system;

import Users.*;

/**
 *
 * @author Student
 */
public class UserFactory {
    
    public User getNewUser(String type, String name, String ID, String password, String address)
    {
        if(type.equals("Admin")){return new Admin(name,"A" + ID, password, address);}
        else if(type.equals("Doctor")){return new Doctor(name,"D" + ID,password,address);}
        else if(type.equals("Secretary")){return new Secretary(name,"S" + ID, password, address);}
        else{return null;}
    }
}
