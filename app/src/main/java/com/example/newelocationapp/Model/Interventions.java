package com.example.newelocationapp.Model;

public class Interventions {

    private int IDIntervention;
    private int ClientNo;
    private int UserID;
    private int IDInterventionStart;
    private int IDInterventionEnd;
    private int Status;
    private int EmpID;

    public Interventions(int IDIntervention, int clientNo, int userID, int IDInterventionStart, int IDInterventionEnd, int status, int empID) {
        this.IDIntervention = IDIntervention;
        ClientNo = clientNo;
        UserID = userID;
        this.IDInterventionStart = IDInterventionStart;
        this.IDInterventionEnd = IDInterventionEnd;
        Status = status;
        EmpID = empID;
    }

    public Interventions() {
    }

    public int getIDIntervention() {
        return IDIntervention;
    }

    public void setIDIntervention(int IDIntervention) {
        this.IDIntervention = IDIntervention;
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

    public int getIDInterventionStart() {
        return IDInterventionStart;
    }

    public void setIDInterventionStart(int IDInterventionStart) {
        this.IDInterventionStart = IDInterventionStart;
    }

    public int getIDInterventionEnd() {
        return IDInterventionEnd;
    }

    public void setIDInterventionEnd(int IDInterventionEnd) {
        this.IDInterventionEnd = IDInterventionEnd;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }
}
