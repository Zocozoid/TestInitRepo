package com.example.newelocationapp;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newelocationapp.Model.Cities;
import com.example.newelocationapp.Model.Interventions;
import com.example.newelocationapp.Model.Memalarm;
import com.example.newelocationapp.Model.Muser;
import com.example.newelocationapp.Model.SysDiagrams;
import com.example.newelocationapp.Model.TChangedLocation;
import com.example.newelocationapp.Model.TEmployee;
import com.example.newelocationapp.Model.TMemalarmPictures;
import com.example.newelocationapp.Model.TStatus;
import com.example.newelocationapp.Model.UserToClient;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        DatabaseHandler db = new DatabaseHandler(this);

        //Insert cities

        Log.d("Insert:", "Inserting..");
        db.addCities(new Cities(1,"Skopje"));
        db.addCities(new Cities(2,"Veles"));

        Log.d("Reading: " , "Reading all Cities...");
        List<Cities> citiesList = db.getAllCities();

        for (Cities c : citiesList)
        {
            String log1 = "CITIES_ID: " + c.getCitiesID() + " , Name: " + c.getName();
            Log.d("Cities_ID: ", log1);
        }


        //INSERT INTERVENTIONS

        Log.d("Insert: ", "Inserting..");
        db.addInterventions(new Interventions(1,1,2,3,4,4,5));
        db.addInterventions(new Interventions(2,2,2,4,4,4,5));

        Log.d("Reading: " , "Reading all Cities...");
        List<Interventions> interventionsList = db.getAllInterventions();

        for (Interventions c : interventionsList)
        {
            String log2 = "ID_INTERVENTION: " + c.getIDIntervention() + " , ClientNo: " + c.getClientNo() +
                    ",UserID: " + c.getUserID() + " ,Intervention Start: " + c.getIDInterventionStart() + " ,Intervrntion End: " +
                    c.getIDInterventionEnd() + " ,Status: " + c.getStatus() + " ,EmpID: " + c.getEmpID();
            Log.d("INTERVENTIONS_ID: ", log2);
        }

        //INSERT MEMALARM

        Log.d("Insert: ", "Inserting..");
        db.addMemalarm(new Memalarm(1,2,"Admin 1","Admin 2", "Admin 3",
                1,2,3,4,"Krazba",2233,3322,"Ubrzaj",
                1,5,5,5,5));
        Log.d("Reading: " , "Reading all Cities...");
        List<Memalarm> memalarmList = db.getAllMemalarm();

        for (Memalarm c : memalarmList)
        {
            String log3 = "ClientNo: " + c.getClientNO() + " , ClientID: " + c.getClientID() +
                    ",Name: " + c.getName() + " ,Location : " + c.getLocation() + " ,Loc 2: " +
                    c.getLoc2() + " ,Bus Phone: " + c.getBusPhone() + " ,MobileNO: " + c.getMobileNo()
                    + " ,PagerNO: " + c.getPagerNo() + " ,ID Cities: " + c.getIDCities()
                    + " ,Description: " + c.getDescription() + " ,Longitude: " + c.getLongitude()
                    + " , Latitude: " + c.getLatitude() + " ,Note: " + c.getNote()
                    + " ,Memalarm ID: " + c.getMemalarmID() + " ,Status: " + c.getStatus()
                    + " ,Is Deleted: " + c.getIsDeleted() + " ,System ID: " + c.getSystemID()
                    + " ,Client No. Original: " + c.getClientNoOriginal();
            Log.d("Memalarm_ID: ", log3);

            //INSERTING MUSER


            Log.d("Insert:", "Inserting..");
            db.addMuser(new Muser(1,"Skopje",22,33,44,55));
            db.addMuser(new Muser(1,"Veles",23,33,34,55));

            Log.d("Reading: " , "Reading all Cities...");
            List<Muser> muserList = db.getAllMuser();

            for (Muser e : muserList)
            {
                String log4 = "User_ID: " + e.getUserID() + " , UserName: " + e.getUserName() + " , Phone No.1 : " + e.getPhoneNo1()
                        + " , Phone No.2: " + e.getPhoneNo2() + " , Phone No.3: " + e.getPhoneNo3() + " , Phone No.4: " + e.getPhoneNo4();
                Log.d("User_ID: ", log4);
            }


            ///INSERTING SYSDIAGRAMS


            Log.d("Insert:", "Inserting..");
            db.addSysDiagrams(new SysDiagrams("Filip",22,33,44,55));
            db.addSysDiagrams(new SysDiagrams("Admin",23,33,34,55));

            Log.d("Reading: " , "Reading all Cities...");
            List<SysDiagrams> sysDiagramsList = db.getAllSysDiagrams();

            for (SysDiagrams e : sysDiagramsList)
            {
                String log5 = "Name: " + e.getName() + " , Principal ID: " + e.getPrincipalID() + " , Diagram ID : " + e.getDiagramID()
                        + " , Version: " + e.getVersion() + " , Definition: " + e.getDefinition() ;
                Log.d("User_ID: ", log5);
            }

            //INSERT TCHANGED LOCATION


            Log.d("Insert:", "Inserting..");
            db.addTChangedLocation(new TChangedLocation(22,22,33,44,55,42,445,66));
            db.addTChangedLocation(new TChangedLocation(223,222,33,4455,545,4266,4455,66));

            Log.d("Reading: " , "Reading all Cities...");
            List<TChangedLocation> tChangedLocationList = db.getAllTChangedLocations();

            for (TChangedLocation e : tChangedLocationList)
            {
                String log6 = "CHL ID: " + e.getChLID() + " , Client ID: " + e.getClientNO() + " , Emp ID : " + e.getEmpID()
                        + " , Longitude: " + e.getLongitude() + " , Latitude: " + e.getLatitude() + " , Date : " + e.getDate()
                        + " , Status ID: " + e.getStatusID() + " , User ID: " + e.getUserID();
                Log.d("User_ID: ", log6);
            }

            //INSERT TEMPLOYEE

            Log.d("Insert:", "Inserting..");
            db.addTEmployee(new TEmployee(1,"admin1","Filip",22,33,44));
            db.addTEmployee(new TEmployee(1,"admin2","Kiko",22,33,44));

            Log.d("Reading: " , "Reading all Cities...");
            List<TEmployee> tEmployeeList = db.getAllTEmployee();

            for (TEmployee e : tEmployeeList)
            {
                String log7 = "EMP ID: " + e.getEmpID() + " , Name : " + e.getName() + " , Surname : " + e.getSurname()
                        + " , Group Task: " + e.getGroupTask() + " , Group ID: " + e.getGroupID() +  " ,PinCode: " + e.getPinCode() ;
                Log.d("User_ID: ", log7);
            }


            //INSERTING MEMALARM PICTURES


            Log.d("Insert:", "Inserting..");
            db.addTMemalarmPictures(new TMemalarmPictures(1,2,3,4,"admin1","Filip",22,33));
            db.addTMemalarmPictures(new TMemalarmPictures(1,3,3,5,"admin1","Filip",54,44));

            Log.d("Reading: " , "Reading all Cities...");
            List<TMemalarmPictures> tMemalarmPicturesList = db.getAllTMemalarmPictures();

            for (TMemalarmPictures e : tMemalarmPicturesList)
            {
                String log8 = "ID Picture: " + e.getIDPicture() + " , Client No. : " + e.getClientNo() + " , User ID : " + e.getUserID()
                        + " , Time Ins: " + e.getTimeIns() + " , Picture Name: " + e.getPictureName() +  " ,Path: " + e.getPath()
                        +  " ,Emp ID: " + e.getEmpID() +  " ,Deleted: " + e.getDeleted();
                Log.d("User_ID: ", log8);
            }


            //INSERTING TSTATUS



            Log.d("Insert:", "Inserting..");
            db.addTStatus(new TStatus(1,"admin1","Filip"));
            db.addTStatus(new TStatus(12,"admin2","Marko"));

            Log.d("Reading: " , "Reading all Cities...");
            List<TStatus> tStatusList = db.getAllTStatus();

            for (TStatus e : tStatusList)
            {
                String log9 = "Status ID: " + e.getStatusID() + " , Status : " + e.getStatus() + " , Description : " + e.getDescription();
                Log.d("User_ID: ", log9);
            }

            ///INSERTING USER TO CLIENT


            Log.d("Insert:", "Inserting..");
            db.addUserToClient(new UserToClient(1,"admin1",13));
            db.addUserToClient(new UserToClient(2,"admin1",14));

            Log.d("Reading: " , "Reading all Cities...");
            List<UserToClient> userToClientList = db.getAllUserToClient();

            for (UserToClient e : userToClientList)
            {
                String log10 = "User ID: " + e.getUserID() + " , Client no. : " + e.getClientNo() + " , ID User To Client : "
                        + e.getIDUserToClient();
                Log.d("User_ID: ", log10);
            }


        }
    }
}







