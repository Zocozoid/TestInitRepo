package com.example.newelocationapp.Model;

public class TEmployee {


    private int EmpID;
    private String Name;
    private String Surname;
    private int GroupTask;
    private int GroupID;
    private int PinCode;

    public TEmployee(int empID, String string, String cursorString, String s, String string1, String cursorString1) {
    }



    public TEmployee() {

    }

    public TEmployee(int empID, String name, String surname, int groupTask, int groupID, int pinCode) {
        EmpID = empID;
        Name = name;
        Surname = surname;
        GroupTask = groupTask;
        GroupID = groupID;
        PinCode = pinCode;
    }

    public TEmployee(String EmpID, String Name, String Surname, String GroupID, String GroupTask, String PinCode) {
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getGroupTask() {
        return GroupTask;
    }

    public void setGroupTask(int groupTask) {
        GroupTask = groupTask;
    }

    public int getGroupID() {
        return GroupID;
    }

    public void setGroupID(int groupID) {
        GroupID = groupID;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }
}
