package com.company;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    private long studentId;
    String firstName;
    String lastName;
    String emailId;
    String phoneNumber,address;
    String gender;
    int age;

    public Student(){
        super();
    }
    public Student(long studentId,String firstName,String lastName,String emailId){
       super(firstName,lastName,emailId,"9163456784","home","f",24);

        this.studentId=studentId;
      //  this.firstName=firstName;
        //this.lastName=lastName;
        //this.emailId=emailId;
    }


    public long getStudentId(){

        return studentId;
    }
    public void printDetails(){
        //System.out.println("Id is:"+studentId);
        System.out.println("student details are:"+ studentId + "\n" +getFirstName()+ "\n" +getLastName()+ "\n" +getEmailId() );
    }

}
