package com.example.newelocationapp.Model;

public class tMemalarmPictures {
    private int IDPicture;
    private int ClientNo;
    private int UserID;
    private int TimeIns;
    private String PictureName;
    private String Path;
    private int EmpID;
    private int Deleted;

    public tMemalarmPictures(int IDPicture, int clientNo, int userID,
                             int timeIns, String pictureName, String path,
                             int empID, int deleted) {
        this.IDPicture = IDPicture;
        ClientNo = clientNo;
        UserID = userID;
        TimeIns = timeIns;
        PictureName = pictureName;
        Path = path;
        EmpID = empID;
        Deleted = deleted;
    }

    public tMemalarmPictures(String pictureName, String path) {
        PictureName = pictureName;
        Path = path;
    }

    public tMemalarmPictures(int IDPicture, int clientNo, int userID, int timeIns, int empID, int deleted) {
        this.IDPicture = IDPicture;
        ClientNo = clientNo;
        UserID = userID;
        TimeIns = timeIns;
        EmpID = empID;
        Deleted = deleted;
    }

    public tMemalarmPictures() {
    }

    public int getIDPicture() {
        return IDPicture;
    }

    public void setIDPicture(int IDPicture) {
        this.IDPicture = IDPicture;
    }

    public int getClientNo() {
        return ClientNo;
    }

    public void setClientNo(int clientNo) {
        ClientNo = clientNo;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getTimeIns() {
        return TimeIns;
    }

    public void setTimeIns(int timeIns) {
        TimeIns = timeIns;
    }

    public String getPictureName() {
        return PictureName;
    }

    public void setPictureName(String pictureName) {
        PictureName = pictureName;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int deleted) {
        Deleted = deleted;
    }
}
