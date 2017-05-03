package com.model;


/**
 * Created by admin on 2017/4/20.
 */
public class Users {
    private String userName;
    private String address;

    public Users(){}

    public Users(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
