/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming;

/**
 *
 * @author tisyavaidya
 */

    public class PrimaryMortgage extends LoanAccount{
    // data members of class
    double PMIMonthlyAmount;
    Address address;

    // constructor
    PrimaryMortgage(double principle,double annualInterestRate,int months,double PMIMonthlyAmount,Address address){
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount=PMIMonthlyAmount;
        this.address=address;
    }

    // toString() method
    @Override
    public String toString() {
        return "Primary Mortgage Loan with\n" 
                +super.toString()+
                "\nPMI Monthly Amount: "+PMIMonthlyAmount+
                "\n"+address.toString()+"\n";
    }
    
}
