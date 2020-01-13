/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.system;

import Users.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class UserManagement {
    static String filePath = "users.bin";
    static void logIn(String ID, String password)
    {
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            ArrayList<User> users = (ArrayList<User>) objIn.readObject();
            
            
            boolean found = false;
            for(int i = 0; i<users.size();i++)
            {
                if(ID.equals(users.get(i).getUserID())&& password.equals(users.get(i).getPassword()))
                {
                    System.out.println("Found");
                    found = true;
                    openPage(users.get(i));
                }
                
            }
            
            if(found == false)
            {
                System.out.println("Not found");
            }
            
            objIn.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    static void openPage(User theUser){
        if(theUser.getUserID().charAt(0) == 'A'){
            AdminPage adminPage = new AdminPage();
            adminPage.show();
        }
        else if(theUser.getUserID().charAt(0) == 'D'){
            DoctorPage doctorPage = new DoctorPage();
            doctorPage.show();
        }
        else if (theUser.getUserID().charAt(0) == 'S'){
            SecretaryPage secretaryPage = new SecretaryPage();
            secretaryPage.show();
        }
        else if (theUser.getUserID().charAt(0) == 'P')
        {
            PatientPage patientPage = new PatientPage();
            patientPage.show();
        }
    }
    
    static ArrayList<User> getUsers(){
        ArrayList<User> theUsers = null;
         try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            theUsers = (ArrayList<User>) objIn.readObject();
            objIn.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return theUsers; 
    }
    
    static void saveNewUsers(ArrayList<User> updatedList)
    {
          try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(updatedList);
            objOut.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
