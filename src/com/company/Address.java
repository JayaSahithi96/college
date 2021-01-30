package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address<street> {
    //String address;
    String street;
    String House_no;
    String state;
    String country;
    int zipCode;

    public Address(){

    }
    public Address(String street, String House_no, String state, String country, int zipCode){

    }
    /*public String getAddress(){
        return address;
       // System.out.println("6000 j street");
    }*/

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHouse_no(String house_no) {
        this.House_no = house_no;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet(){
        return street;
    }
    public String getHouse_no(){
        return House_no;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
    public int getZipCode(){
        return zipCode;
    }

    /*public List<ArrayList> getAllListItems(){
        List<ArrayList> L= new ArrayList();

        return L;*/
    }


