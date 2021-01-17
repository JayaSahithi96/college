package com.company;

public class Admin {
    private long adminId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber,address;
    public Admin(){}
    public Admin(long adminId,String firstName,String lastName,String emailId,String phoneNumber){
        this.adminId=adminId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.phoneNumber=phoneNumber;

    }
    public long getAdminId(){
        return adminId;
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
}
