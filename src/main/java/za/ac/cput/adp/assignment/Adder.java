/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp.assignment;

/**
 *
 * @author Velenkosini Prince Jeza 
 * @Student Number 218191669
 * 
 * This class is a shop slip for the things that the customer purchased
 */
public class Adder {
    
    
    private int amount1;
    private int amount2;
    private int amount3;
    private int amount4;
    
   //int amount = amount2;
    
    public int add(int first, int second){
        return first + second;
    }
    
    
    
    public int getAmount1() {
        return amount1;
    }

    public void setAmount1(int amount1) {
        this.amount1 = amount1;
    }

    public int getAmount2() {
        return amount2;
    }

    public void setAmount2(int amount2) {
        this.amount2 = amount2;
    }

    public int getAmount3() {
        return amount3;
    }

    public void setAmount3(int amount3) {
        this.amount3 = amount3;
    }

    public int getAmaount4() {
        return amount4;
    }

    public void setAmaount4(int amaount4) {
        this.amount4 = amaount4;
    }
       @Override
    public String toString() {
        return "Adder{" + "amount1=" + amount1 + ", amount2=" + amount2 + ", amount3=" + amount3 + ", amaount4=" + amount4 + '}';
    }
}
