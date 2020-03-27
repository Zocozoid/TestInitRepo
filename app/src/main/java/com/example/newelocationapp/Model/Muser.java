package com.example.newelocationapp.Model;

public class Muser {

    private int UserID;
    private String UserName;
    private int PhoneNo1;
    private int PhoneNo2;
    private int PhoneNo3;
    private int PhoneNo4;

    public Muser(int userID, String userName, int phoneNo1, int phoneNo2, int phoneNo3, int phoneNo4) {
        UserID = userID;
        UserName = userName;
        PhoneNo1 = phoneNo1;
        PhoneNo2 = phoneNo2;
        PhoneNo3 = phoneNo3;
        PhoneNo4 = phoneNo4;
    }

    public Muser(int userID, int phoneNo1, int phoneNo2, int phoneNo3, int phoneNo4) {
        UserID = userID;
        PhoneNo1 = phoneNo1;
        PhoneNo2 = phoneNo2;
        PhoneNo3 = phoneNo3;
        PhoneNo4 = phoneNo4;
    }

    public Muser(String userName) {
        UserName = userName;
    }

    public Muser() {
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPhoneNo1() {
        return PhoneNo1;
    }

    public void setPhoneNo1(int phoneNo1) {
        PhoneNo1 = phoneNo1;
    }

    public int getPhoneNo2() {
        return PhoneNo2;
    }

    public void setPhoneNo2(int phoneNo2) {
        PhoneNo2 = phoneNo2;
    }

    public int getPhoneNo3() {
        return PhoneNo3;
    }

    public void setPhoneNo3(int phoneNo3) {
        PhoneNo3 = phoneNo3;
    }

    public int getPhoneNo4() {
        return PhoneNo4;
    }

    public void setPhoneNo4(int phoneNo4) {
        PhoneNo4 = phoneNo4;
    }
}
