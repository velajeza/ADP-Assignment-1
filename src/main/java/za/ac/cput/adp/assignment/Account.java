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
public class Account {
    
    private String name, editor, email;
    private long ID;
    private int amount;
    private int amount2;

    public int getAmount2() {
        return amount2;
    }

    public void setAmount2(int amount2) {
        this.amount2 = amount2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", editor=" + editor + ", email=" + email + ", ID=" + ID + ", amount=" + amount + ", amount2=" + amount2 +'}';
    }
}
