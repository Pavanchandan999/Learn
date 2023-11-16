package com.practice5;

public class BankAccount {
    // Private variables
    private String accountNumber;
    private double balance;
    private String customerName;

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Example constructor
    public BankAccount(String accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    // Example method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Customer Name: " + getCustomerName());
    }

    // Example main method for testing
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456", 1000.0, "John Doe");

        // Display initial account information
        System.out.println("Initial Account Information:");
        myAccount.displayAccountInfo();

        // Update account information
        myAccount.setBalance(1500.0);
        myAccount.setCustomerName("Jane Doe");

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        myAccount.displayAccountInfo();
    }
}