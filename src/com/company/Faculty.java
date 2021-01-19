package com.company;

public class Faculty extends Person{
    private long facultyId;

    public Faculty(){
        super();
    }
    public Faculty(long facultyId,String firstName,String lastName,String emailId,String phoneNumber,String address,String gender,int age){
        super(firstName,lastName,emailId,phoneNumber,gender,age);
        this.facultyId=facultyId;

    }
    public long getFacultyId(){
        return facultyId;
    }

}
