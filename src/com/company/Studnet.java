package com.company;

public class Studnet extends Person{
    private long studentId;

    public Studnet(){}
    public Studnet(long studentId){
        this.studentId=studentId;

    }
    public long getStudentId(){

        return studentId;
    }

}
