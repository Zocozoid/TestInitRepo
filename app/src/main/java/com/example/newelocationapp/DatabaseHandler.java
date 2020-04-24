package com.example.newelocationapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

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
import com.example.newelocationapp.Utillities.CitiesUtil;
import com.example.newelocationapp.Utillities.IntervenUtil;
import com.example.newelocationapp.Utillities.MemalaUtil;
import com.example.newelocationapp.Utillities.MuserUtil;
import com.example.newelocationapp.Utillities.SysDiagUtil;
import com.example.newelocationapp.Utillities.TChLocaUtil;
import com.example.newelocationapp.Utillities.TEmplUtil;
import com.example.newelocationapp.Utillities.TMemPictUtil;
import com.example.newelocationapp.Utillities.TStatUtil;
import com.example.newelocationapp.Utillities.UserTCliUtil;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ElocationNewTest";



    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String Cities = "CREATE TABLE "+ CitiesUtil.TABLE_NAME  + "(" + CitiesUtil.CITIES_ID + " INTEGER PRIMARY KEY, " +
                CitiesUtil.NAME + " TEXT" + ")";

        String Interventions = "CREATE TABLE "+ IntervenUtil.TABLE_NAME + "(" + IntervenUtil.ID_INTERVENTION + " INTEGER PRIMARY KEY," +
                IntervenUtil.CLIENT_NO + " TEXT," + IntervenUtil.USER_ID + " TEXT," + IntervenUtil.INTERVENTION_START + " TEXT," +
                IntervenUtil.INTERVENTION_END + " TEXT," + IntervenUtil.STATUS + " TEXT," + IntervenUtil.EMP_ID + " TEXT" + ")";

        String Memalarm = "CREATE TABLE "+ MemalaUtil.TABLE_NAME + "(" + MemalaUtil.CLIENT_NO + " INTEGER PRIMARY KEY," + MemalaUtil.CLIENT_ID +
                " TEXT," + MemalaUtil.NAME + " TEXT," + MemalaUtil.LOCATION + " TEXT," + MemalaUtil.LOC_2 + " TEXT," + MemalaUtil.BUS_PHONE + " TEXT,"+
                 MemalaUtil.MOBILE_NO + " TEXT," + MemalaUtil.PAGER_NO + " TEXT," + MemalaUtil.ID_CITIES + " TEXT," + MemalaUtil.DESCRIPTION + " TEXT," +
                 MemalaUtil.LONGITUDE + " TEXT," + MemalaUtil.LATITUDE + " TEXT," + MemalaUtil.NOTE + " TEXT," + MemalaUtil.MEMALARM_ID + " TEXT," +
                 MemalaUtil.STATUS + " TEXT," + MemalaUtil.IS_DELETED + " TEXT," + MemalaUtil.SYSTEM_ID + " TEXT," + MemalaUtil.CLIENT_NO_ORIGINAL + " TEXT" + ")";

        String Muser = "CREATE TABLE " + MuserUtil.TABLE_NAME + "(" + MuserUtil.USER_ID + " INTEGER PRIMARY KEY," + MuserUtil.USER_NAME + " TEXT," +
                MuserUtil.PHONE_NO_1 + " TEXT," + MuserUtil.PHONE_NO_2 + " TEXT," + MuserUtil.PHONE_NO_3 + " TEXT," + MuserUtil.PHONE_NO_4 + " TEXT" + ")";

        String SysDiagrams = "CREATE TABLE "+ SysDiagUtil.TABLE_NAME  + "(" + SysDiagUtil.NAME + " INTEGER PRIMARY KEY," + SysDiagUtil.PRINCIPAL_ID +  " TEXT," +
                SysDiagUtil.DIAGRAM_ID + " TEXT," + SysDiagUtil.VERSION + " TEXT," + SysDiagUtil.DEFINITION + " TEXT" + ")";

        String TChangedLocation = "CREATE TABLE "+ TChLocaUtil.TABLE_NAME + "(" + TChLocaUtil.CHL_ID + " INTEGER PRIMARY KEY," + TChLocaUtil.CLIENT_NO + " TEXT," +
                TChLocaUtil.EMP_ID + " TEXT," + TChLocaUtil.LONGITUDE + " TEXT," + TChLocaUtil.LATITUDE + " TEXT," + TChLocaUtil.DATE + " TEXT," +
                TChLocaUtil.STATUS_ID + " TEXT," + TChLocaUtil.USER_ID + " TEXT" + ")";


        String TEmployee = "CREATE TABLE "+ TEmplUtil.TABLE_NAME  + "(" + TEmplUtil.EMP_ID + " INTEGER PRIMARY KEY," + TEmplUtil.NAME + " TEXT,"+
                TEmplUtil.SURNAME + " TEXT," + TEmplUtil.GROUP_ID + " TEXT," + TEmplUtil.GROUP_TASK + " TEXT," + TEmplUtil.PIN_CODE + " TEXT" + ")";

        String tMemalarmPictures = "CREATE TABLE "+ TMemPictUtil.TABLE_NAME + "(" + TMemPictUtil.ID_PICTURE + " INTEGER PRIMARY KEY," +
               TMemPictUtil.CLIENT_NO + " TEXT," + TMemPictUtil.USER_ID + " TEXT," + TMemPictUtil.TIME_INS + " TEXT," + TMemPictUtil.PICTURE_NAME +
                " TEXT," + TMemPictUtil.PATH + " TEXT," + TMemPictUtil.EMP_ID + " TEXT," + TMemPictUtil.DELETED + " TEXT" + ")";

        String TStatus = "CREATE TABLE "+ TStatUtil.TABLE_NAME + "(" + TStatUtil.STATUS_ID + " INTEGER PRIMARY KEY," + TStatUtil.STATUS + " TEXT,"+
                TStatUtil.DESCRIPTION + " TEXT" + ")";

        String UserToClient = "CREATE TABLE "+ UserTCliUtil.TABLE_NAME + "(" + UserTCliUtil.USER_ID + " INTEGER PRIMARY KEY," + UserTCliUtil.CLIENT_NO
                + " TEXT," + UserTCliUtil.ID_USER_TO_CLIENT + " TEXT" + ")";



        db.execSQL(TStatus);
        db.execSQL(Memalarm);
        db.execSQL(tMemalarmPictures);
        db.execSQL(TChangedLocation);
        db.execSQL(Muser);
        db.execSQL(TEmployee);
        db.execSQL(Cities);
        db.execSQL(UserToClient);
        db.execSQL(Interventions);
        db.execSQL(SysDiagrams);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ CitiesUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+IntervenUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+MemalaUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+MuserUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+SysDiagUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TChLocaUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TEmplUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TMemPictUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TStatUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+UserTCliUtil.TABLE_NAME);

        onCreate(db);
    }

    //Cities TABLE CRUD METHOD START!!

//ADD CITIES

    public void addCities(Cities cities)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(CitiesUtil.CITIES_ID, cities.getCitiesID());
        contentValues.put(CitiesUtil.NAME, cities.getName());

        db.insert(CitiesUtil.TABLE_NAME,null,contentValues);
        db.close();
    }

    //GET CITy

    public Cities getCities(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(CitiesUtil.TABLE_NAME, new String[] {CitiesUtil.CITIES_ID,
        CitiesUtil.NAME}, CitiesUtil.CITIES_ID + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        Cities cities = new Cities(Integer.parseInt(cursor.getString(0)),cursor.getString(1));
        return cities;
    }

    public List<Cities> getAllCities()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<Cities> citiesList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + CitiesUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                Cities cities = new Cities();
                cities.setCitiesID(Integer.parseInt(cursor.getString(0)));
                cities.setName(cursor.getString(1));
                citiesList.add(cities);
            }while (cursor.moveToNext());
        }
        return citiesList;
    }


//INTERVENTIONS CRUD METHHOD START

    public void addInterventions(Interventions interventions)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(IntervenUtil.ID_INTERVENTION, interventions.getIDIntervention());
        contentValues.put(IntervenUtil.CLIENT_NO, interventions.getClientNo());
        contentValues.put(IntervenUtil.USER_ID, interventions.getUserID());
        contentValues.put(IntervenUtil.INTERVENTION_START, interventions.getIDInterventionStart());
        contentValues.put(IntervenUtil.INTERVENTION_END, interventions.getIDInterventionEnd());
        contentValues.put(IntervenUtil.STATUS, interventions.getStatus());
        contentValues.put(IntervenUtil.EMP_ID, interventions.getEmpID());

        db.insert(IntervenUtil.TABLE_NAME,null,contentValues);
        db.close();
    }

    public Interventions getInterventions(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(IntervenUtil.TABLE_NAME, new String[] {IntervenUtil.ID_INTERVENTION,
                IntervenUtil.CLIENT_NO,IntervenUtil.USER_ID,IntervenUtil.INTERVENTION_START,
                IntervenUtil.INTERVENTION_END,IntervenUtil.STATUS,IntervenUtil.EMP_ID},
                IntervenUtil.ID_INTERVENTION + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        Interventions interventions = new Interventions(Integer.parseInt(cursor.getString(0)),
                Integer.parseInt(cursor.getString(1)),Integer.parseInt(cursor.getString(2)),
                Integer.parseInt(cursor.getString(3)),Integer.parseInt(cursor.getString(4)),
                Integer.parseInt(cursor.getString(5)),Integer.parseInt(cursor.getString(6)));
        return interventions;
    }


    public List<Interventions> getAllInterventions()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<Interventions> interventionsList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + IntervenUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                Interventions interventions = new Interventions();
                interventions.setIDIntervention(Integer.parseInt(cursor.getString(0)));
                interventions.setClientNo(Integer.parseInt(cursor.getString(1)));
                interventions.setUserID(Integer.parseInt(cursor.getString(2)));
                interventions.setIDInterventionStart(Integer.parseInt(cursor.getString(3)));
                interventions.setIDInterventionEnd(Integer.parseInt(cursor.getString(4)));
                interventions.setStatus(Integer.parseInt(cursor.getString(5)));
                interventions.setEmpID(Integer.parseInt(cursor.getString(6)));
                interventionsList.add(interventions);
            }while (cursor.moveToNext());
        }
        return interventionsList;
    }


    //MEMALARM CRUD METHOD START

    public void addMemalarm(Memalarm memalarm)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(MemalaUtil.CLIENT_NO, memalarm.getClientNO());
        contentValues.put(MemalaUtil.CLIENT_ID, memalarm.getClientID());
        contentValues.put(MemalaUtil.NAME, memalarm.getName());
        contentValues.put(MemalaUtil.LOCATION, memalarm.getLocation());
        contentValues.put(MemalaUtil.LOC_2, memalarm.getLoc2());
        contentValues.put(MemalaUtil.BUS_PHONE, memalarm.getBusPhone());
        contentValues.put(MemalaUtil.MOBILE_NO, memalarm.getMobileNo());
        contentValues.put(MemalaUtil.PAGER_NO, memalarm.getPagerNo());
        contentValues.put(MemalaUtil.ID_CITIES, memalarm.getIDCities());
        contentValues.put(MemalaUtil.DESCRIPTION, memalarm.getDescription());
        contentValues.put(MemalaUtil.LONGITUDE, memalarm.getLongitude());
        contentValues.put(MemalaUtil.LATITUDE, memalarm.getLatitude());
        contentValues.put(MemalaUtil.NOTE, memalarm.getNote());
        contentValues.put(MemalaUtil.MEMALARM_ID, memalarm.getMemalarmID());
        contentValues.put(MemalaUtil.STATUS, memalarm.getStatus());
        contentValues.put(MemalaUtil.IS_DELETED, memalarm.getIsDeleted());
        contentValues.put(MemalaUtil.SYSTEM_ID, memalarm.getSystemID());
        contentValues.put(MemalaUtil.CLIENT_NO_ORIGINAL, memalarm.getClientNoOriginal());

        db.insert(MemalaUtil.TABLE_NAME,null,contentValues);
        db.close();
    }

    public Memalarm getMemalarm(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(MemalaUtil.TABLE_NAME, new String[] {MemalaUtil.CLIENT_NO,MemalaUtil.CLIENT_ID,
                MemalaUtil.NAME, MemalaUtil.LOCATION, MemalaUtil.LOC_2, MemalaUtil.BUS_PHONE,MemalaUtil.MOBILE_NO,
                MemalaUtil.PAGER_NO,MemalaUtil.ID_CITIES, MemalaUtil.DESCRIPTION, MemalaUtil.LONGITUDE,MemalaUtil.LATITUDE,
                MemalaUtil.NOTE,MemalaUtil.MEMALARM_ID, MemalaUtil.STATUS,MemalaUtil.IS_DELETED,
                MemalaUtil.SYSTEM_ID, MemalaUtil.CLIENT_NO_ORIGINAL},
                MemalaUtil.CLIENT_NO + "=?", new String[] {String.valueOf(id)},
                null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        Memalarm memalarm = new Memalarm(Integer.parseInt(cursor.getString(0)),Integer.parseInt(cursor.getString(1)),
                cursor.getString(2),cursor.getString(3),cursor.getString(4),
                Integer.parseInt(cursor.getString(5)),Integer.parseInt(cursor.getString(6)),
                Integer.parseInt(cursor.getString(7)), Integer.parseInt(cursor.getString(8)),
                cursor.getString(9),Integer.parseInt(cursor.getString(10)),
                Integer.parseInt(cursor.getString(11)),cursor.getString(12),
                Integer.parseInt(cursor.getString(13)), Integer.parseInt(cursor.getString(14)),
                Integer.parseInt(cursor.getString(15)), Integer.parseInt(cursor.getString(16)),
                Integer.parseInt(cursor.getString(17)));

        return memalarm;
    }


    public List<Memalarm> getAllMemalarm()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<Memalarm> memalarmList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + MemalaUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                Memalarm memalarm = new Memalarm();
                memalarm.setClientNO(Integer.parseInt(cursor.getString(0)));
                memalarm.setClientID(Integer.parseInt(cursor.getString(1)));
                memalarm.setName(cursor.getString(2));
                memalarm.setLocation(cursor.getString(3));
                memalarm.setLoc2(cursor.getString(4));
                memalarm.setBusPhone(Integer.parseInt(cursor.getString(5)));
                memalarm.setMobileNo(Integer.parseInt(cursor.getString(6)));
                memalarm.setPagerNo(Integer.parseInt(cursor.getString(7)));
                memalarm.setIDCities(Integer.parseInt(cursor.getString(8)));
                memalarm.setDescription(cursor.getString(9));
                memalarm.setLongitude(Integer.parseInt(cursor.getString(10)));
                memalarm.setLatitude(Integer.parseInt(cursor.getString(11)));
                memalarm.setNote(cursor.getString(12));
                memalarm.setMemalarmID(Integer.parseInt(cursor.getString(13)));
                memalarm.setStatus(Integer.parseInt(cursor.getString(14)));
                memalarm.setIsDeleted(Integer.parseInt(cursor.getString(15)));
                memalarm.setSystemID(Integer.parseInt(cursor.getString(16)));
                memalarm.setClientNoOriginal(Integer.parseInt(cursor.getString(17)));
                memalarmList.add(memalarm);
            }while (cursor.moveToNext());
        }
        return memalarmList;
    }

    //MUSER CRUD METHOD START


    public void addMuser(Muser muser)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(MuserUtil.USER_ID, muser.getUserID());
        contentValues.put(MuserUtil.USER_NAME, muser.getUserName());
        contentValues.put(MuserUtil.PHONE_NO_1, muser.getPhoneNo1());
        contentValues.put(MuserUtil.PHONE_NO_2, muser.getPhoneNo2());
        contentValues.put(MuserUtil.PHONE_NO_3, muser.getPhoneNo3());
        contentValues.put(MuserUtil.PHONE_NO_4, muser.getPhoneNo4());

        db.insert(MuserUtil.TABLE_NAME,null,contentValues);
        db.close();
    }

    public Muser getMuser(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(MuserUtil.TABLE_NAME, new String[] {MuserUtil.USER_ID,
                        MuserUtil.USER_NAME,MuserUtil.PHONE_NO_1,MuserUtil.PHONE_NO_2,
                        MuserUtil.PHONE_NO_3,MuserUtil.PHONE_NO_4},
                MuserUtil.USER_ID + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

         Muser muser = new Muser(Integer.parseInt(cursor.getString(0)),
        cursor.getString(1),Integer.parseInt(cursor.getString(2)),
                Integer.parseInt(cursor.getString(3)),Integer.parseInt(cursor.getString(4)),
                Integer.parseInt(cursor.getString(5)));
        return muser;
    }



    public List<Muser> getAllMuser()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<Muser> muserArrayList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + MuserUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                Muser muser = new Muser();
                muser.setUserID(Integer.parseInt(cursor.getString(0)));
                muser.setUserName(cursor.getString(1));
                muser.setPhoneNo1(Integer.parseInt(cursor.getString(2)));
                muser.setPhoneNo2(Integer.parseInt(cursor.getString(3)));
                muser.setPhoneNo3(Integer.parseInt(cursor.getString(4)));
                muser.setPhoneNo4(Integer.parseInt(cursor.getString(5)));
                muserArrayList.add(muser);
            }while (cursor.moveToNext());
        }
        return muserArrayList;
    }


    //SYSDIAGRAMS CRUD METHOD START


    public void addSysDiagrams(SysDiagrams sysDiagrams)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SysDiagUtil.NAME, sysDiagrams.getName());
        contentValues.put(SysDiagUtil.PRINCIPAL_ID, sysDiagrams.getPrincipalID());
        contentValues.put(SysDiagUtil.DIAGRAM_ID, sysDiagrams.getDiagramID());
        contentValues.put(SysDiagUtil.VERSION, sysDiagrams.getVersion());
        contentValues.put(SysDiagUtil.DEFINITION, sysDiagrams.getDefinition());

        db.insert(SysDiagUtil.TABLE_NAME,null,contentValues);
        db.close();
    }


    public SysDiagrams getSysDiagrams(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(SysDiagUtil.TABLE_NAME, new String[] {SysDiagUtil.NAME,
                        SysDiagUtil.PRINCIPAL_ID,SysDiagUtil.DIAGRAM_ID,SysDiagUtil.VERSION,
                        SysDiagUtil.DEFINITION},
                SysDiagUtil.NAME + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        SysDiagrams sysDiagrams = new SysDiagrams(cursor.getString(0)
                    ,Integer.parseInt(cursor.getString(1)),
                Integer.parseInt(cursor.getString(2)),Integer.parseInt(cursor.getString(3)),
                Integer.parseInt(cursor.getString(4)));
        return sysDiagrams;
    }


    public List<SysDiagrams> getAllSysDiagrams()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<SysDiagrams> sysDiagramsList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + SysDiagUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                SysDiagrams sysDiagrams = new SysDiagrams();
                sysDiagrams.setName(cursor.getString(0));
                sysDiagrams.setPrincipalID(Integer.parseInt(cursor.getString(1)));
                sysDiagrams.setDiagramID(Integer.parseInt(cursor.getString(2)));
                sysDiagrams.setVersion(Integer.parseInt(cursor.getString(3)));
                sysDiagrams.setDefinition(Integer.parseInt(cursor.getString(4)));
                sysDiagramsList.add(sysDiagrams);
            }while (cursor.moveToNext());
        }
        return sysDiagramsList;
    }

    //T CHANGED LOCATION METHOD START


    public void addTChangedLocation(TChangedLocation tChangedLocation)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(TChLocaUtil.CHL_ID, tChangedLocation.getChLID());
        contentValues.put(TChLocaUtil.CLIENT_NO, tChangedLocation.getClientNO());
        contentValues.put(TChLocaUtil.EMP_ID, tChangedLocation.getEmpID());
        contentValues.put(TChLocaUtil.LONGITUDE, tChangedLocation.getLongitude());
        contentValues.put(TChLocaUtil.LATITUDE, tChangedLocation.getLatitude());
        contentValues.put(TChLocaUtil.DATE, tChangedLocation.getDate());
        contentValues.put(TChLocaUtil.STATUS_ID, tChangedLocation.getStatusID());
        contentValues.put(TChLocaUtil.USER_ID, tChangedLocation.getUserID());

        db.insert(TChLocaUtil.TABLE_NAME,null,contentValues);
        db.close();
    }


    public TChangedLocation getTChangedLocation(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TChLocaUtil.TABLE_NAME, new String[] {TChLocaUtil.CHL_ID,
                        TChLocaUtil.CLIENT_NO,TChLocaUtil.EMP_ID,TChLocaUtil.LONGITUDE,
                        TChLocaUtil.LATITUDE, TChLocaUtil.DATE, TChLocaUtil.STATUS_ID, TChLocaUtil.USER_ID},
                TChLocaUtil.CHL_ID + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        TChangedLocation tChangedLocation = new TChangedLocation(Integer.parseInt(cursor.getString(0))
                ,Integer.parseInt(cursor.getString(1)),
                Integer.parseInt(cursor.getString(2)),Integer.parseInt(cursor.getString(3)),
                Integer.parseInt(cursor.getString(4)), Integer.parseInt(cursor.getString(5)),
                Integer.parseInt(cursor.getString(6)),Integer.parseInt(cursor.getString(7)));
        return tChangedLocation;
    }


    public List<TChangedLocation> getAllTChangedLocations()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<TChangedLocation> tChangedLocationList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + TChLocaUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                TChangedLocation tChangedLocation = new TChangedLocation();
                tChangedLocation.setChLID(Integer.parseInt(cursor.getString(0)));
                tChangedLocation.setClientNO(Integer.parseInt(cursor.getString(1)));
                tChangedLocation.setEmpID(Integer.parseInt(cursor.getString(2)));
                tChangedLocation.setLongitude(Integer.parseInt(cursor.getString(3)));
                tChangedLocation.setLatitude(Integer.parseInt(cursor.getString(4)));
                tChangedLocation.setDate(Integer.parseInt(cursor.getString(5)));
                tChangedLocation.setStatusID(Integer.parseInt(cursor.getString(6)));
                tChangedLocation.setUserID(Integer.parseInt(cursor.getString(7)));
                tChangedLocationList.add(tChangedLocation);
            }while (cursor.moveToNext());
        }
        return tChangedLocationList;
    }

    ///TEployee CRUD Method Start


    public void addTEmployee(TEmployee tEmployee)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(TEmplUtil.EMP_ID, tEmployee.getEmpID());
        contentValues.put(TEmplUtil.NAME, tEmployee.getName());
        contentValues.put(TEmplUtil.SURNAME, tEmployee.getSurname());
        contentValues.put(TEmplUtil.GROUP_TASK, tEmployee.getGroupTask());
        contentValues.put(TEmplUtil.GROUP_ID, tEmployee.getGroupID());
        contentValues.put(TEmplUtil.PIN_CODE, tEmployee.getPinCode());

        db.insert(TEmplUtil.TABLE_NAME,null,contentValues);
        db.close();
    }


    public TEmployee getTEmployee(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TEmplUtil.TABLE_NAME, new String[] {TEmplUtil.EMP_ID,
                        TEmplUtil.NAME,TEmplUtil.SURNAME,TEmplUtil.GROUP_TASK,
                        TEmplUtil.GROUP_ID, TEmplUtil.PIN_CODE},
                TChLocaUtil.CHL_ID + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        TEmployee tEmployee = new TEmployee(Integer.parseInt(cursor.getString(0))
                ,cursor.getString(1),
                cursor.getString(2),Integer.parseInt(cursor.getString(3)),
                Integer.parseInt(cursor.getString(4)), Integer.parseInt(cursor.getString(5)));
        return tEmployee;
    }


    public List<TEmployee> getAllTEmployee()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<TEmployee> tEmployeeList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + TEmplUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                TEmployee tEmployee = new TEmployee();
                tEmployee.setEmpID(Integer.parseInt(cursor.getString(0)));
                tEmployee.setName(cursor.getString(1));
                tEmployee.setSurname(cursor.getString(2));
                tEmployee.setGroupTask(Integer.parseInt(cursor.getString(3)));
                tEmployee.setGroupID(Integer.parseInt(cursor.getString(4)));
                tEmployee.setPinCode(Integer.parseInt(cursor.getString(5)));

                tEmployeeList.add(tEmployee);
            }while (cursor.moveToNext());
        }
        return tEmployeeList;
    }


    ///TMemalarmPictures CRUD Method Start



    public void addTMemalarmPictures(TMemalarmPictures tMemalarmPictures)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(TMemPictUtil.ID_PICTURE, tMemalarmPictures.getIDPicture());
        contentValues.put(TMemPictUtil.CLIENT_NO, tMemalarmPictures.getClientNo());
        contentValues.put(TMemPictUtil.TIME_INS, tMemalarmPictures.getTimeIns());
        contentValues.put(TMemPictUtil.PICTURE_NAME, tMemalarmPictures.getPictureName());
        contentValues.put(TMemPictUtil.PATH, tMemalarmPictures.getPath());
        contentValues.put(TMemPictUtil.EMP_ID, tMemalarmPictures.getEmpID());
        contentValues.put(TMemPictUtil.DELETED, tMemalarmPictures.getDeleted());

        db.insert(TMemPictUtil.TABLE_NAME,null,contentValues);
        db.close();
    }


    public  TMemalarmPictures getTMemalarmPictures(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TMemPictUtil.TABLE_NAME, new String[] {TMemPictUtil.ID_PICTURE,
                        TMemPictUtil.CLIENT_NO,TMemPictUtil.USER_ID,TMemPictUtil.TIME_INS,
                        TMemPictUtil.PICTURE_NAME, TMemPictUtil.PATH, TMemPictUtil.EMP_ID, TMemPictUtil.DELETED},
                TMemPictUtil.ID_PICTURE + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        TMemalarmPictures tMemalarmPictures = new TMemalarmPictures(Integer.parseInt(cursor.getString(0))
                ,Integer.parseInt(cursor.getString(1)),
                Integer.parseInt(cursor.getString(2)),Integer.parseInt(cursor.getString(3)),
               cursor.getString(4), cursor.getString(5),
                Integer.parseInt(cursor.getString(6)),Integer.parseInt(cursor.getString(7)));
        return tMemalarmPictures;
    }


    public List<TMemalarmPictures> getAllTMemalarmPictures()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<TMemalarmPictures> tMemalarmPicturesList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + TMemPictUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                TMemalarmPictures tMemalarmPictures = new TMemalarmPictures();
                tMemalarmPictures.setIDPicture(Integer.parseInt(cursor.getString(0)));
                tMemalarmPictures.setClientNo(Integer.parseInt(cursor.getString(1)));
                tMemalarmPictures.setUserID(Integer.parseInt(cursor.getString(2)));
                tMemalarmPictures.setTimeIns(Integer.parseInt(cursor.getString(3)));
                tMemalarmPictures.setPictureName(cursor.getString(4));
                tMemalarmPictures.setPath(cursor.getString(5));
                tMemalarmPictures.setEmpID(Integer.parseInt(cursor.getString(6)));
                tMemalarmPictures.setDeleted(Integer.parseInt(cursor.getString(7)));
                tMemalarmPicturesList.add(tMemalarmPictures);
            }while (cursor.moveToNext());
        }
        return tMemalarmPicturesList;
    }




    ///TSTATUS CRUD METHOS START


    public void addTStatus(TStatus tStatus)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(TStatUtil.STATUS_ID, tStatus.getStatusID());
        contentValues.put(TStatUtil.STATUS, tStatus.getStatus());
        contentValues.put(TStatUtil.DESCRIPTION, tStatus.getDescription());

        db.insert(TStatUtil.TABLE_NAME,null,contentValues);
        db.close();
    }



    public TStatus getTStatus(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TStatUtil.TABLE_NAME, new String[] {TStatUtil.STATUS_ID,
                TStatUtil.STATUS, TStatUtil.DESCRIPTION}, TStatUtil.STATUS_ID + "=?", new String[] {String.valueOf(id)},
                null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        TStatus tStatus = new TStatus(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                cursor.getString(2));
        return tStatus;
    }

    public List<TStatus> getAllTStatus()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<TStatus> tStatusList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + TStatUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                TStatus tStatus = new TStatus();
                tStatus.setStatusID(Integer.parseInt(cursor.getString(0)));
                tStatus.setStatus(cursor.getString(1));
                tStatus.setDescription(cursor.getString(2));
                tStatusList.add(tStatus);
            }while (cursor.moveToNext());
        }
        return tStatusList;
    }

    ///USER TO CLIENT CRUD METHOD START


    public void addUserToClient(UserToClient userToClient)
    {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(UserTCliUtil.USER_ID, userToClient.getUserID());
        contentValues.put(UserTCliUtil.CLIENT_NO, userToClient.getClientNo());
        contentValues.put(UserTCliUtil.ID_USER_TO_CLIENT, userToClient.getIDUserToClient());

        db.insert(UserTCliUtil.TABLE_NAME,null,contentValues);
        db.close();
    }



    public UserToClient getUserToCLient(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(UserTCliUtil.TABLE_NAME, new String[] {UserTCliUtil.USER_ID,
                        UserTCliUtil.CLIENT_NO, UserTCliUtil.ID_USER_TO_CLIENT},
                UserTCliUtil.USER_ID + "=?", new String[] {String.valueOf(id)},
                null,null,null,null);

        if (cursor != null)
            cursor.moveToFirst();

        UserToClient userToClient = new UserToClient(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                Integer.parseInt(cursor.getString(2)));
        return userToClient;
    }

    public List<UserToClient> getAllUserToClient()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        List<UserToClient> userToClientList = new ArrayList<>();

        String selectAll = "SELECT * FROM " + UserTCliUtil.TABLE_NAME;
        Cursor cursor = db.rawQuery(selectAll,null);


        if (cursor.moveToFirst())
        {
            do {
                UserToClient userToClient = new UserToClient();
                userToClient.setUserID(Integer.parseInt(cursor.getString(0)));
                userToClient.setClientNo(cursor.getString(1));
                userToClient.setIDUserToClient(Integer.parseInt(cursor.getString(2)));
                userToClientList.add(userToClient);
            }while (cursor.moveToNext());
        }
        return userToClientList;
    }
}
