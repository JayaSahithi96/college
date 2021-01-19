package com.company;

public class Admin extends Person{
    private long adminId;
    public Admin(){
        super();
    }
    public Admin(long adminId,String firstName,String lastName,String emailId,String phoneNumber,String address,String gender,int age){
        super(firstName,lastName,emailId,phoneNumber,gender,age);
        this.adminId=adminId;


    }
    public long getAdminId(){
        return adminId;
    }

}
