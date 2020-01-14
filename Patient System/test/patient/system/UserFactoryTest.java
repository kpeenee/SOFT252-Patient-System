/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.system;

import Users.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class UserFactoryTest {
    
    public UserFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNewUser method, of class UserFactory.
     */
    @Test
    public void testGetNewUserDoctor() {
        System.out.println("getNewUser");
        String type = "Doctor";
        String name = "Danny Smith";
        String ID = "4536";
        String password = "DingDing";
        String address = "43 Factory Road";
        UserFactory instance = new UserFactory();
        User expResult = new Doctor(name,"D"+ ID,password,address);
        User result = instance.getNewUser(type, name, ID, password, address);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getUserID(),result.getUserID());
    }
    
        @Test
    public void testGetNewUserAdmin() {
        System.out.println("getNewUser");
        String type = "Admin";
        String name = "Danny Smith";
        String ID = "4536";
        String password = "DingDing";
        String address = "43 Factory Road";
        UserFactory instance = new UserFactory();
        User expResult = new Doctor(name,"A"+ ID,password,address);
        User result = instance.getNewUser(type, name, ID, password, address);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getUserID(),result.getUserID());
    }
    
        @Test
    public void testGetNewUserSecretary() {
        System.out.println("getNewUser");
        String type = "Secretary";
        String name = "Danny Smith";
        String ID = "4536";
        String password = "DingDing";
        String address = "43 Factory Road";
        UserFactory instance = new UserFactory();
        User expResult = new Doctor(name,"S"+ ID,password,address);
        User result = instance.getNewUser(type, name, ID, password, address);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getUserID(),result.getUserID());
    }
    
        @Test
    public void testGetNewUserPatient() {
        System.out.println("getNewUser");
        String type = "Patient";
        String name = "Danny Smith";
        String ID = "4536";
        String password = "DingDing";
        String address = "43 Factory Road";
        UserFactory instance = new UserFactory();
        User expResult = new Doctor(name,"P"+ ID,password,address);
        User result = instance.getNewUser(type, name, ID, password, address);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getUserID(),result.getUserID());
    }
    
}
