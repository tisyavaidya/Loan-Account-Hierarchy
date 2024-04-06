/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming;

/**
 *
 * @author tisyavaidya
 */

    public class UnsecuredLoan extends  LoanAccount{
    // constructor
    UnsecuredLoan(double principle,double annualInterestRate,int months){
        super(principle, annualInterestRate, months);
    }

    // toString() method
    @Override
    public String toString() {
        return "Unsecured Load with:"+
                "\n"+super.toString()+"\n";
    }
    
}
