package com.example.newelocationapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

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

public class DatabaseHandler extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "NewElocationAppDB.db";
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_PATH = "/data/data/com.example.newelocationapp/databases/";

    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TEMPLOYEE_TABLE = "CREATE TABLE "  + TEmplUtil.TABLE_NAME + "(" + TEmplUtil.EMP_ID + " INTEGER PRIMARY KEY," + TEmplUtil.NAME + " TEXT," + TEmplUtil.SURNAME + " TEXT,"
        + TEmplUtil.GROUP_ID + " TEXT," + TEmplUtil.GROUP_TASK + " TEXT," + TEmplUtil.PIN_CODE + " TEXT" + ")";

        String CREATE_CITIES_TABLE = "CREATE TABLE " + CitiesUtil.TABLE_NAME + "(" + CitiesUtil.CITIES_ID + " INTEGER PRIMARY KEY," +
                CitiesUtil.NAME + " TEXT" + ")";

        String CREATE_iNTERVENTIONS_TABLE = "CREATE TABLE " + IntervenUtil.TABLE_NAME + "(" + IntervenUtil.ID_INTERVENTION + " INTEGER PRIMARY KEY,"
                + IntervenUtil.CLIENT_NO + " TEXT," + IntervenUtil.USER_ID + " TEXT," + IntervenUtil.INTERVENTION_START + " TEXT,"
                + IntervenUtil.INTERVENTION_END + " TEXT," + IntervenUtil.STATUS + " TEXT," + IntervenUtil.EMP_ID + " TEXT" + ")";

        String CREATE_MEMALARM_TABLE = "CREATE TABLE " + MemalaUtil.TABLE_NAME + "(" + MemalaUtil.CLIENT_NO + " INTEGER PRIMARY KEY," +
                MemalaUtil.CLIENT_ID  + " TEXT," + MemalaUtil.NAME + " TEXT," + MemalaUtil.LOCATION + " TEXT," +
                MemalaUtil.LOC_2 + " TEXT," + MemalaUtil.BUS_PHONE + " TEXT," + MemalaUtil.MOBILE_NO + " TEXT," +
                MemalaUtil.PAGER_NO + " TEXT," + MemalaUtil.ID_CITIES + " TEXT," + MemalaUtil.DESCRIPTION + " TEXT," +
                MemalaUtil.LONGITUDE + " TEXT," + MemalaUtil.LATITUDE + " TEXT," + MemalaUtil.NOTE + " TEXT," +
                MemalaUtil.MEMALARM_ID + " TEXT," + MemalaUtil.STATUS + " TEXT," + MemalaUtil.IS_DELETED + " TEXT," +
                MemalaUtil.SYSTEM_ID + " TEXT," + MemalaUtil.CLIENT_NO_ORIGINAL + " TEXT" + ")";

        String CREATE_MUSER_TABLE = "CREATE TABLE " + MuserUtil.TABLE_NAME + "(" + MuserUtil.USER_ID + " INTEGER PRIMARY KEY," + MuserUtil.USER_NAME + " TEXT,"
              + MuserUtil.PHONE_NO_1 + " TEXT," + MuserUtil.PHONE_NO_2 + " TEXT," + MuserUtil.PHONE_NO_3 + " TEXT," + MuserUtil.PHONE_NO_4
              + " TEXT" + ")";

        String CREATE_SYSDIAGRAMS_TABLE = "CREATE TABLE " + SysDiagUtil.TABLE_NAME + "(" + SysDiagUtil.NAME + " INTEGER PRIMARY KEY," + SysDiagUtil.PRINCIPAL_ID
               + " TEXT," + SysDiagUtil.DIAGRAM_ID + " TEXT," + SysDiagUtil.VERSION + " TEXT," + SysDiagUtil.DEFINITION + " TEXT" + ")";

        String CREATE_T_CHANGED_LOCATION_TABLE = "CREATE TABLE " + TChLocaUtil.TABLE_NAME + "(" + TChLocaUtil.CHL_ID + " INTEGER PRIMARY KEY," + TChLocaUtil.CLIENT_NO
                + " TEXT," + TChLocaUtil.EMP_ID + " TEXT," + TChLocaUtil.LONGITUDE + " TEXT," + TChLocaUtil.LATITUDE + " TEXT," + TChLocaUtil.DATE + " TEXT,"
                + TChLocaUtil.STATUS_ID + " TEXT," + TChLocaUtil.USER_ID + " TEXT"  + ")";

        String CREATE_TMEMALARM_PICTURES_TABLE = "CREATE TABLE " + TMemPictUtil.TABLE_NAME + "(" + TMemPictUtil.ID_PICTURE + " INTEGER PRIMARY KEY,"
                + TMemPictUtil.CLIENT_NO + " TEXT," + TMemPictUtil.USER_ID + " TEXT," + TMemPictUtil.TIME_INS + " TEXT," + TMemPictUtil.PICTURE_NAME
                + " TEXT," + TMemPictUtil.PATH + " TEXT," + TMemPictUtil.EMP_ID + " TEXT," + TMemPictUtil.DELETED + " TEXT" + ")";

        String CREATE_TSTATUS_TABLE = "CREATE TABLE " + TStatUtil.TABLE_NAME + "(" + TStatUtil.STATUS_ID + " INTEGER PRIMARY KEY," +
                TStatUtil.STATUS + " TEXT," + TStatUtil.DESCRIPTION + " TEXT" + ")";

        String CREATE_USER_TO_CLIENT_TABLE = "CREATE TABLE " + UserTCliUtil.TABLE_NAME + "("  + UserTCliUtil.USER_ID +
                " INTEGER PRIMARY KEY," + UserTCliUtil.CLIENT_NO + " TEXT," + UserTCliUtil.ID_USER_TO_CLIENT + " TEXT" + ")";


        db.execSQL(CREATE_TEMPLOYEE_TABLE);
        db.execSQL(CREATE_CITIES_TABLE);
        db.execSQL(CREATE_iNTERVENTIONS_TABLE);
        db.execSQL(CREATE_MEMALARM_TABLE);
        db.execSQL(CREATE_MUSER_TABLE);
        db.execSQL(CREATE_SYSDIAGRAMS_TABLE);
        db.execSQL(CREATE_T_CHANGED_LOCATION_TABLE);
        db.execSQL(CREATE_TMEMALARM_PICTURES_TABLE);
        db.execSQL(CREATE_TSTATUS_TABLE);
        db.execSQL(CREATE_USER_TO_CLIENT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + CitiesUtil.TABLE_NAME);

        db.execSQL("DROP TABLE IF EXISTS " + TEmplUtil.TABLE_NAME);

        db.execSQL("DROP TABLE IF EXISTS " + IntervenUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + MemalaUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + MuserUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + SysDiagUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TChLocaUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TMemPictUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TStatUtil.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + UserTCliUtil.TABLE_NAME);
        onCreate(db);
    }

    //TEMPLOYEE TABLE CRUD METHOD START!!




}
