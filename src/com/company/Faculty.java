package com.company;

public class Faculty {
    private long facultyId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber,address;
    public Faculty(){}
    public Faculty(long facultyId,String firstName,String lastName,String emailId,String phoneNumber){
        this.facultyId=facultyId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.phoneNumber=phoneNumber;

    }
    public long getFacultyId(){
        return facultyId;
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
