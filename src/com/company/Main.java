package com.company;
import com.company.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Integer,Student> map= new HashMap<>();

        Student s1= new Student(121,"Jaya Sahithi","Aravapalli","jsahithi@gmail.com");
        Student s2= new Student(122,"Akhil","Madineni","akhil@gmail.com");
        Student s3= new Student(123,"Praveen","hande","praveen@gmail.com");

       // System.out.println("student details are:"+s1.getStudentId()+ "\n" +s1.getFirstName()+ "\n" +s1.getEmailId() );
        map.put
        s1.printDetails();

    }
}
