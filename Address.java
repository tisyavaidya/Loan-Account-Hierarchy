/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming;

/**
 *
 * @author tisyavaidya
 */

    public class Address {
    // class data members
    String street,city,state,zipcode;

    // constructor
    Address(String street,String state,String city,String zipcode){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }

    // getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    // toString() method
    @Override
    public String toString() {
        return "Property Address:\n"+getStreet()+
                "\n"+getState()+" "+getCity()+" "+getZipcode()+"\n";
    }
    
}
