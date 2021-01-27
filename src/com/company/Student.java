package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{

    private long studentId;


    public Student(){
        super();
    }

    public Student(long studentId,String firstName,String lastName,String emailId,String phoneNumber,String gender,int age){
       super(firstName,lastName,emailId,phoneNumber,gender,age);

        this.studentId=studentId;

    }

    public Address addi(){

        Address A=new Address("Cadillac Drive","Apt#120","CA","USA",95825);
        return A;

    }
    public long getStudentId(){

        return studentId;
    }
    public void printDetails(){
        //System.out.println("Id is:"+studentId);
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Id:");
        studentId= scan.nextLong();
        //System.out.println("Student Id is:"+ studentId);
        Scanner scan1= new Scanner(System.in);
        System.out.println("Enter student First name: ");
        firstName= scan1.nextLine();
        Scanner scan2= new Scanner(System.in);
        System.out.println("Enter Student Last name:");
        lastName=scan2.nextLine();
        Scanner scan3= new Scanner(System.in);
        System.out.println("Enter Student Email address:");
        emailId= scan3.nextLine();


        System.out.println("student details are:"+ studentId + "\n" +getFirstName()+ "\n" +getLastName()+ "\n" +getEmailId());
        System.out.println("Address is "+ addi().getStreet() + " " +addi().getHouse_no()+ " " +addi().getState()+ " " +addi().getCountry()+ " " +addi().getZipCode() );
    }

}
