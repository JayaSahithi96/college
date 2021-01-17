package com.company;

public class Studnet{
    private long studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber,address;
    public Studnet(){}
    public Studnet(long studentId,String firstName,String lastName,String emailId,String phoneNumber){
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.phoneNumber=phoneNumber;

    }
    public long getStudentId(){
        return studentId;
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
