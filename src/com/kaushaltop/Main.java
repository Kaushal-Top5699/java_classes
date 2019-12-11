package com.kaushaltop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        SimpleCalculator calculator = new SimpleCalculator();
//
//        calculator.setFirstNumber(5);
//        calculator.setSecondNumber(0);
//
//        System.out.println("add = "+ calculator.getAdditionResult());
//        System.out.println("subtract = "+calculator.getSubtractionResult());
//        System.out.println("multiply = "+calculator.getMultiplicationResult());
//        System.out.println("divide = "+calculator.getDivisionResult());

//        Person person = new Person();
//
//        person.setFirstName("Kaushal");
//        person.setLastName("Topinkatti B");
//        person.setAge(22);
//
//        System.out.println("firstName= "+person.getFirstName());
//        System.out.println("secondName= "+person.getLastName());
//        System.out.println("age= "+person.getAge());
//        System.out.println("teen= "+person.isTeen());
//        System.out.println("fullName= "+person.getFullName());

        //If you use a Constructor then you don't have write full statements,
        //For example: account.setName();
        BankAccount account =
                new BankAccount(1705600800127L,
                                1000d,
                                "Kaushal Topinkatti B",
                                "kaushaltop@me.com",
                                9449817629L);

        //Account Number
        long getACNo = account.getAccountNum();
        if (getACNo == -1) {
            System.out.println("Invalid Account Number");
        } else {
            System.out.println("A/C No: "+ account.getAccountNum());
        }

        //Balance
        System.out.println("Balance: "+account.getBalance());

        //Customer Name
        System.out.println("Customer: "+account.getCustomerName());

        //email
        System.out.println("Email ID "+account.getEmail());

        //Phone Number
        System.out.println("Contact No: "+account.getPhoneNumber());


        //Fund deposits
        System.out.println("Enter amount to be deposited: ");

        boolean hasNextDouble = scanner.hasNextDouble();

        if (hasNextDouble) {

           double getDeposit = scanner.nextDouble();
           scanner.nextLine();

           double newBalance = account.depositFunds(getDeposit);

           double finalAmount = account.setBalance(newBalance);

           System.out.println("New Balance: \n"+finalAmount);

        } else {

            System.out.println("Enter Valid Amount!!");
        }


        //Funds Withdrawal
        System.out.println("Do you want to withdraw amount? ");
        System.out.println("Yes/No");

        String getInput = scanner.nextLine();

        if (getInput.equals("Yes")) {

            System.out.println("Enter the amount to be withdrawn: ");

            hasNextDouble = scanner.hasNextDouble();

            if (hasNextDouble) {

                double getAmount = scanner.nextDouble();
                scanner.nextLine();

                if (getAmount <= account.getBalance()) {

                    double newBalance = account.withdrawalFunds(getAmount);

                    System.out.println("Amount Withdrawn Successfully");
                    System.out.println("Available Balance: "+newBalance);

                } else {

                    System.out.println("Sorry! Insufficient Balance");
                }

            } else {

                System.out.println("Enter Valid Amount!");
            }
        } else {

            return;
        }
    }
}
