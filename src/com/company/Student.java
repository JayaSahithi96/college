package com.company;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    private long studentId;


    public Student(){
        super();
    }
    public Student(long studentId,String firstName,String lastName,String emailId,String phoneNumber,String address,String gender,int age){
       super(firstName,lastName,emailId,phoneNumber,address,gender,age);

        this.studentId=studentId;

    }


    public long getStudentId(){

        return studentId;
    }
    public void printDetails(){
        //System.out.println("Id is:"+studentId);
        System.out.println("student details are:"+ studentId + "\n" +getFirstName()+ "\n" +getLastName()+ "\n" +getEmailId() );
    }

}
