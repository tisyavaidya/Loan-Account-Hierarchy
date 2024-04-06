/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming;

/**
 *
 * @author tisyavaidya
 */

    public class LoanAccount {
    // class data members
    double principle,annualInterestRate;
    int months;

    // constructor
    LoanAccount(double principle,double annualInterestRate,int months){
        this.principle=principle;
        this.annualInterestRate=annualInterestRate;
        this.months=months;
    }

    // calculateMonthlyPayment() method
    public double calculateMonthlyPayment() {
        double monthlyInterest = annualInterestRate/12;
        double monthlyPayment = principle * ((monthlyInterest/100) / (1 - Math.pow(1 + (monthlyInterest/100),-months)));

        return monthlyPayment;
    }

    // getters
    public double getPrinciple() {
        return principle;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getMonths() {
        return months;
    }

    // toString() method
    @Override
    public String toString() {
        return "Principle: $"+String.format("%.2f",getPrinciple())
                +"\nAnnual Interest Rate: "+String.format("%.2f",getAnnualInterestRate()) + "%"
                +"\nTerm of Loan in months: "+getMonths()
                +"\nMonthly Payment: $"+String.format("%.2f",calculateMonthlyPayment());
    }
    
}
