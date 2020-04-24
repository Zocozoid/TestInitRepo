package com.example.newelocationapp.Model;

public class Cities {

    private int  CitiesID;
    private String Name;

    public Cities(int citiesID, String name) {
        CitiesID = citiesID;
        Name = name;
    }

    public Cities() {
    }

    public Cities(int citiesID) {
        CitiesID = citiesID;
    }

    public Cities(String name) {
        Name = name;
    }



    public int getCitiesID() {
        return CitiesID;
    }

    public void setCitiesID(int citiesID) {
        CitiesID = citiesID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
