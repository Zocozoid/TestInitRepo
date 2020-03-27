package com.example.newelocationapp.Model;

public class UserToClient {

    private int UserID;
    private String ClientNo;
    private int IDUserToClient;

    public UserToClient(int userID, String clientNo, int IDUserToClient) {
        UserID = userID;
        ClientNo = clientNo;
        this.IDUserToClient = IDUserToClient;
    }

    public UserToClient(String clientNo) {
        ClientNo = clientNo;
    }

    public UserToClient(int userID, int IDUserToClient) {
        UserID = userID;
        this.IDUserToClient = IDUserToClient;
    }

    public UserToClient() {
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getClientNo() {
        return ClientNo;
    }

    public void setClientNo(String clientNo) {
        ClientNo = clientNo;
    }

    public int getIDUserToClient() {
        return IDUserToClient;
    }

    public void setIDUserToClient(int IDUserToClient) {
        this.IDUserToClient = IDUserToClient;
    }
}
