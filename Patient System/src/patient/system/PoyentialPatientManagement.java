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
public class PoyentialPatientManagement {
    static String filePath = "Patients.bin";
    
    static void saveNewPotentialPatient(ArrayList<User> newPatient)
    {
         try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(newPatient);
            objOut.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static ArrayList<User> getPotentialPatients()
    {
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
}
