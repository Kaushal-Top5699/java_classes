package com.kaushaltop;

public class BankAccount {

    private long accountNum;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(long accountNum, double balance, String customerName,
                            String email, long phoneNumber) {

        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public long getAccountNum() {

        return accountNum;
    }

    public void setAccountNum(long accountNum) {

        if (String.valueOf(accountNum).length() == 13) {

            this.accountNum = accountNum;

        } else {

            this.accountNum = -1;

        }
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double funds) {

        double newBalance = funds + balance;

        return newBalance;
    }

    public double withdrawalFunds(double funds) {

        if (funds < balance) {

            double newBalance = balance - funds;

            return newBalance;

        } else {

            return 0;
        }
    }
}
