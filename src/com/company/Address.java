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
        //this.address= address;
        this.street= street;
        this.House_no= House_no;
        this.state=state;
        this.country=country;
        this.zipCode= zipCode;
    }
    /*public String getAddress(){
        return address;
       // System.out.println("6000 j street");
    }*/


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


