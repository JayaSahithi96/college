package com.company;

public class Person {
    String firstName;
    String lastName;
    String emailId;
    String phoneNumber;
    String gender;
    int age;
    public Person(){
    }
    public Person(String firstName,String lastName,String emailId,String phoneNumber,  String gender,int age){
        this.firstName=firstName;
        this.lastName= lastName;
        this.emailId=emailId;
        this.phoneNumber= phoneNumber;
        //this.address= address;
        this.gender= gender;
        this.age=age;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmailId(){
        return emailId;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    /*public String getAddress(){
        return address;
    }*/
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

}
