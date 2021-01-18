package com.company;

public class Student extends Person{
    private long studentId;

    public Student(){}
    public Student(long studentId){
       super("Jaya","Aravapalli","tfytftjy@gamail.com","916575587","home","f",24);
        this.studentId=studentId;
        this.firstName=firstName;
    }


    public long getStudentId(){

        return studentId;
    }

}
