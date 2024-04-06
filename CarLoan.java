/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming;

/**
 *
 * @author tisyavaidya
 */

    public class CarLoan extends LoanAccount{
    // data members of class
    private String vehicleVIN;

    // constructor
    CarLoan(double principle,double annualInterestRate,int months,String vehicleVIN){
        super(principle, annualInterestRate, months);
        this.vehicleVIN=vehicleVIN;
    }

    // toString() method
    @Override
    public String toString() {
        return "Car Loan with:\n" +super.toString()+"\n"+ "Vehicle VIN:"+vehicleVIN+"\n\n";
    }
    
}
