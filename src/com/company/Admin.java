package com.company;

public class Admin extends Person{
    private long adminId;
    public Admin(){}
    public Admin(long adminId){
        super();
        this.adminId=adminId;


    }
    public long getAdminId(){
        return adminId;
    }

}
