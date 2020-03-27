package com.example.newelocationapp.Model;

public class TChangedLocation {

    private int ChLID;
    private int ClientID;
    private int EmpID;
    private int Longitude;
    private int Latitude;
    private int Date;
    private int StatusID;
    private int UserID;

    public TChangedLocation(int chLID, int clientID, int empID, int longitude, int latitude, int date, int statusID, int userID) {
        ChLID = chLID;
        ClientID = clientID;
        EmpID = empID;
        Longitude = longitude;
        Latitude = latitude;
        Date = date;
        StatusID = statusID;
        UserID = userID;
    }

    public TChangedLocation() {
    }

    public int getChLID() {
        return ChLID;
    }

    public void setChLID(int chLID) {
        ChLID = chLID;
    }

    public int getClientID() {
        return ClientID;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public int getStatusID() {
        return StatusID;
    }

    public void setStatusID(int statusID) {
        StatusID = statusID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }
}
