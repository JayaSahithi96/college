package com.company;

public class Address {
    //String address;
    String street;
    int House_no;
    String state;
    String country;
    int zipCode;

    public Address(){

    }
    public Address(String street, int House_no, String state, String country, int zipCode){
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
    public int getHouse_no(){
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

}
