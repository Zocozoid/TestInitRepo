package com.example.newelocationapp.Model;

public class Memalarm {

    private int ClientNO;
    private int ClientID;
    private String Name;
    private String Location;
    private String Loc2;
    private int BusPhone;
    private int MobileNo;
    private int PagerNo;
    private int IDCities;
    private String Description;
    private int Longitude;
    private int Latitude;
    private String Note;
    private int MemalarmID;
    private int Status;
    private int IsDeleted;
    private int SystemID;
    private int ClientNoOriginal;

    public Memalarm(int clientNO, int clientID, String name, String location, String loc2, int busPhone, int mobileNo, int pagerNo,
                    int IDCities, String description, int longitude, int latitude, String note,
                    int memalarmID, int status, int isDeleted, int systemID, int clientNoOriginal) {
        ClientNO = clientNO;
        ClientID = clientID;
        Name = name;
        Location = location;
        Loc2 = loc2;
        BusPhone = busPhone;
        MobileNo = mobileNo;
        PagerNo = pagerNo;
        this.IDCities = IDCities;
        Description = description;
        Longitude = longitude;
        Latitude = latitude;
        Note = note;
        MemalarmID = memalarmID;
        Status = status;
        IsDeleted = isDeleted;
        SystemID = systemID;
        ClientNoOriginal = clientNoOriginal;
    }

    public Memalarm(int clientNO, int clientID, int busPhone, int mobileNo, int pagerNo,
                    int IDCities, int longitude, int latitude, int memalarmID, int status,
                    int isDeleted, int systemID, int clientNoOriginal) {
        ClientNO = clientNO;
        ClientID = clientID;
        BusPhone = busPhone;
        MobileNo = mobileNo;
        PagerNo = pagerNo;
        this.IDCities = IDCities;
        Longitude = longitude;
        Latitude = latitude;
        MemalarmID = memalarmID;
        Status = status;
        IsDeleted = isDeleted;
        SystemID = systemID;
        ClientNoOriginal = clientNoOriginal;
    }

    public Memalarm(String name, String location, String loc2, String description, String note) {
        Name = name;
        Location = location;
        Loc2 = loc2;
        Description = description;
        Note = note;
    }

    public Memalarm() {
    }

    public int getClientNO() {
        return ClientNO;
    }

    public void setClientNO(int clientNO) {
        ClientNO = clientNO;
    }

    public int getClientID() {
        return ClientID;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getLoc2() {
        return Loc2;
    }

    public void setLoc2(String loc2) {
        Loc2 = loc2;
    }

    public int getBusPhone() {
        return BusPhone;
    }

    public void setBusPhone(int busPhone) {
        BusPhone = busPhone;
    }

    public int getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(int mobileNo) {
        MobileNo = mobileNo;
    }

    public int getPagerNo() {
        return PagerNo;
    }

    public void setPagerNo(int pagerNo) {
        PagerNo = pagerNo;
    }

    public int getIDCities() {
        return IDCities;
    }

    public void setIDCities(int IDCities) {
        this.IDCities = IDCities;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public int getMemalarmID() {
        return MemalarmID;
    }

    public void setMemalarmID(int memalarmID) {
        MemalarmID = memalarmID;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        IsDeleted = isDeleted;
    }

    public int getSystemID() {
        return SystemID;
    }

    public void setSystemID(int systemID) {
        SystemID = systemID;
    }

    public int getClientNoOriginal() {
        return ClientNoOriginal;
    }

    public void setClientNoOriginal(int clientNoOriginal) {
        ClientNoOriginal = clientNoOriginal;
    }
}
