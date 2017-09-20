package com.gregzanin;

/**
 * Created by GR389658 on 20/09/2017.
 */
public class BankAccount {
    private int accNumber;
    private int phoneNumber;
    private  double balance;
    private String customerName;
    private String email;

    public  BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accNumber,double balance , String email, String customerName,int phoneNumber) {
        this.accNumber = accNumber;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;

    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Deposit of " + funds + " made with success.");
    }

    public void withdrawFunds(double funds) {
        if (this.balance >= funds) {
            this.balance -= funds;
        }
        else
            System.out.println("Insuficient funds to withdraw!");
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccNumber(){
        return accNumber;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

}
