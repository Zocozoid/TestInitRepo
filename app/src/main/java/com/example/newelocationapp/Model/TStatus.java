package com.example.newelocationapp.Model;

public class TStatus {

    private int StatusID;
    private String Status;
    private String Description;

    public TStatus(int statusID, String status, String descripton) {
        StatusID = statusID;
        Status = status;
        Description = descripton;
    }

    public TStatus(int statusID) {
        StatusID = statusID;
    }

    public TStatus(String status, String descripton) {
        Status = status;
        Description = descripton;
    }

    public TStatus() {
    }

    public int getStatusID() {
        return StatusID;
    }

    public void setStatusID(int statusID) {
        StatusID = statusID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String descripton) {
        Description = descripton;
    }
}
