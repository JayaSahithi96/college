package com.company;
import com.company.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Long,Student> map= new HashMap<>();

        Student s1= new Student(121,"Jaya Sahithi","Aravapalli","jsahithi@gmail.com","9165073602","Female",24);
        Student s2= new Student(122,"Akhil","Madineni","akhil@gmail.com","9163456784","male",24);
        Student s3= new Student(123,"Praveen","hande","praveen@gmail.com","5305375035","Male",31);

       // System.out.println("student details are:"+s1.getStudentId()+ "\n" +s1.getFirstName()+ "\n" +s1.getEmailId() );
        map.put(s1.getStudentId(),s1);
        map.put(s2.getStudentId(),s2);
        map.put(s3.getStudentId(),s3);
        for (Map.Entry<Long,Student> entry : map.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().printDetails();
        }


    }
}
