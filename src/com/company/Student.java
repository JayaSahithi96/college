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
    
    public long getStudentId(){

        return studentId;
    }
    public void printDetails(){
        Address A1 = new Address();
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
        emailId = scan3.nextLine();
        System.out.println("Enter street: ");
        String street = scan3.nextLine();
        A1.setStreet(street);
        System.out.println("Enter house number: ");
        String House_no = scan3.nextLine();
        A1.setHouse_no(House_no);
        System.out.println("Enter state: ");
        String state = scan3.nextLine();
        A1.setState(state);
        System.out.println("Enter country: ");
        String country = scan3.nextLine();
        A1.setCountry(country);
        System.out.println("Enter zip code: ");
        int zipCode = scan3.nextInt();
        A1.setZipCode(zipCode);

        System.out.println("student details are:"+ studentId + "\n" +getFirstName()+ "\n" +getLastName()+ "\n" +getEmailId());
        System.out.println("Address is "+ A1.getStreet() + " " +A1.getHouse_no()+ " " +A1.getState()+ " " +A1.getCountry()+ " " +A1.getZipCode() );
    }

}
