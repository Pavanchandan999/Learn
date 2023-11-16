package com.practice5;

public class MyBankAccount {

    private String accountNumber;
    private double balance;
    private String customerNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
public MyBankAccount(String accountNumber, double balance, String customerNumber){
        this.accountNumber = accountNumber;
        this.balance=balance;
        this.customerNumber=customerNumber;
}
    public void displayAccountInfo(){
        System.out.println("AccountNumber "+ getAccountNumber());
        System.out.println("Balance "+ getBalance());
        System.out.println("CustomerNumber "+ getCustomerNumber());
    }

    public static void main(String[] args){
        MyBankAccount MyAccount = new MyBankAccount("123456",1000.0,"Pavan");

        System.out.println("Initial Account Information");
        MyAccount.displayAccountInfo();
        MyAccount.setBalance(1500.0);
        MyAccount.setCustomerNumber("pavan");
        System.out.println("\nUpdated Account Information");
        MyAccount.displayAccountInfo();



    }
}
