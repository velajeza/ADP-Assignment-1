/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;



        

/**
 *
 * @author Velenkosini Prince Jeza 218191669
 */
public class AdderTest {
    
    private int amount1;
    private int amount2;
    private int amount3;
    private int amaount4;
    
   // int amount = amount2;
    
    @Test
    void testEquality() {
        assertEquals(amount2, amount1);
    }
   
    
    @Test
    void testIdentity(){
        assertSame(amount1, amount2);
    }
   
    
    // 0+0 == 0
    // 100 + 5 == 105
    // -30 + 15 == -15
    // -10 + 30 == 20
    // 20 + 30 == 50
    @Test
    public void canAddTwoNumbers(){
        assertEquals(0, new Adder().add(0,0));
        assertEquals(105, new Adder().add(100,5));
        
        assertEquals(-15, new Adder().add(-30,15));
        assertEquals(20, new Adder().add(-10,30));
        
        assertEquals(50, new Adder().add(20,30));
        
    }
    
    // 0+0 == 40
    // 100 + 5 == 505
    // -30 + 15 == -185
    // -10 + 30 == 820
    // 20 + 30 == 90
    @Test
    public void failingTest(){
       fail("The sum of these numbers give incorrect answers thats why the test fail");
       
        assertEquals(40, new Adder().add(0,0));
        assertEquals(505, new Adder().add(100,5));
        
        assertEquals(-185, new Adder().add(-30,15));
        assertEquals(820, new Adder().add(-10,30));
        
        assertEquals(90, new Adder().add(20,30));
        
    }
    
    
    
    @Test
    @Timeout(3)
    public void testWithTimeout(){  
        assertEquals(0, new Adder().add(0,0));
        assertEquals(150, new Adder().add(100,50));        
    }
    
    // 0 + 0 == 4
    // 100 + 5 == 305
    @Test
    @Disabled("The test is disabled because the following numbers are not correct when you add the first number and the second number")
    public void canAddTwoIntergers(){
        
        
        assertEquals(4, new Adder().add(0,0));
        assertEquals(305, new Adder().add(100,5));        
    }
      
}
