package com.company;

public class Studnet extends Person{
    private long studentId;
    private String firstName;
    private String lastName;

    public Studnet(){}
    public Studnet(long studentId, String firstName,String lastName){
        super();
        this.studentId=studentId;
        this.firstName=firstName;
    }


    public long getStudentId(){

        return studentId;
    }

}
