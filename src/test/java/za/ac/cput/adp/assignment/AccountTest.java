/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;

        

/**
 *
 * @author Velenkosini Prince Jeza 218191669
 */
public class AccountTest {
    private String name, editor, email;
    private long ID;
    private int amount;
    private int amount2;
    
    @BeforeEach
    public void setUp() {
        
         name = name;
         editor = editor;
         email = email;
         ID = ID;
         amount = amount2;
    }
    @Test
    void testIdentity(){
        assertSame(amount, amount2);
    }
    
    @Test
    void testEquality() {
        assertEquals(amount, amount2);
    }
    
   /* @AfterEach
    public void tearDown() {
    }
    */

    /**
     * Test of getName method, of class Account.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Account.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Account instance = new Account();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditor method, of class Account.
     */
    @Test
    public void testGetEditor() {
        System.out.println("getEditor");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEditor method, of class Account.
     */
    @Test
    public void testSetEditor() {
        System.out.println("setEditor");
        String editor = "";
        Account instance = new Account();
        instance.setEditor(editor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Account.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Account.
     */
    @Test
    @Disabled
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Account instance = new Account();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Account.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Account instance = new Account();
        long expResult = 0L;
        long result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Account.
     */
    @Test
    @Disabled
    public void testSetID() {
        System.out.println("setID");
        long ID = 0L;
        Account instance = new Account();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Account.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Account.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 0;
        Account instance = new Account();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = new Account();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
