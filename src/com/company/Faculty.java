package com.company;

public class Faculty extends Person{
    private long facultyId;

    public Faculty(){}
    public Faculty(long facultyId){
        this.facultyId=facultyId;

    }
    public long getFacultyId(){
        return facultyId;
    }

}
