package com.example.studentmanagementproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    Context context;
    public DatabaseHelper(@Nullable Context context) {
        super(context, VariableDeclare.DB_NAME, null, VariableDeclare.DB_VERSION);
        this.context=context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(VariableDeclare.CREATE_TABLE1_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE2_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE3_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE4_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE5_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE6_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE7_QUERY);
        db.execSQL(VariableDeclare.CREATE_TABLE8_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME4);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME5);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME6);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME7);
        db.execSQL("DROP TABLE IF EXISTS "+ VariableDeclare.TABLE_NAME8);
        onCreate(db);
    }

    public long InsertFirstSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME1,null,contentValues1);
        return id;

    }

    public long InsertSecondSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME2,null,contentValues1);
        return id;

    }
    public long InsertThirdSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME3,null,contentValues1);
        return id;

    }
    public long InsertFourthSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME4,null,contentValues1);
        return id;

    }
    public long InsertFifthSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME5,null,contentValues1);
        return id;

    }
    public long InsertSixthSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME6,null,contentValues1);
        return id;

    }
    public long InsertSevenSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME7,null,contentValues1);
        return id;

    }
    public long InsertEightSemesterData(ModelClass modelClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();

        ContentValues contentValues1=new ContentValues();
        contentValues1.put(VariableDeclare.SEMESTER,modelClass.getSemester());
        contentValues1.put(VariableDeclare.TECHNOLOGY,modelClass.getTechnology());
        contentValues1.put(VariableDeclare.NAME,modelClass.getName());
        contentValues1.put(VariableDeclare.ROLL,modelClass.getRoll());
        contentValues1.put(VariableDeclare.REGESTATION,modelClass.getRegestation());
        contentValues1.put(VariableDeclare.CLASSGROUP,modelClass.getClassGroup());
        contentValues1.put(VariableDeclare.PHONENUMBER,modelClass.getPhoneNumber());
        contentValues1.put(VariableDeclare.BLOODGROUP,modelClass.getBloodGroup());
        contentValues1.put(VariableDeclare.RELIGION,modelClass.getReligion());
        contentValues1.put(VariableDeclare.NATIONALITY,modelClass.getNationality());
        contentValues1.put(VariableDeclare.EMAIL,modelClass.getEmail());
        contentValues1.put(VariableDeclare.GENDER,modelClass.getGender());
        contentValues1.put(VariableDeclare.FATHERNAME,modelClass.getFatherName());
        contentValues1.put(VariableDeclare.FATHERNUMBER,modelClass.getFatherNumber());
        contentValues1.put(VariableDeclare.MOTHERNAME,modelClass.getMotherName());
        contentValues1.put(VariableDeclare.MOTHERNUMBER,modelClass.getMotherNumber());
        contentValues1.put(VariableDeclare.FIRSTSEM,modelClass.getFirstSemester());
        contentValues1.put(VariableDeclare.SECONDSEM,modelClass.getSecondSemester());
        contentValues1.put(VariableDeclare.THIRDSEM,modelClass.getThirdSemester());
        contentValues1.put(VariableDeclare.FOURTHSEM,modelClass.getFourthSemester());
        contentValues1.put(VariableDeclare.FIFTHSEM,modelClass.getFifthSemester());
        contentValues1.put(VariableDeclare.SIXTHSEM,modelClass.getSixthSemester());
        contentValues1.put(VariableDeclare.SEVENSEM,modelClass.getSeventhSemester());
        contentValues1.put(VariableDeclare.EIGHTSEM,modelClass.getEightSemester());
        long id= sqLiteDatabase.insert(VariableDeclare.TABLE_NAME8,null,contentValues1);
        return id;

    }
    public List<ModelClass> readTable1Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME1+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }

    public List<ModelClass> readTable2Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME2+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }

    public List<ModelClass> readTable3Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME3+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }

    public List<ModelClass> readTable4Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME4+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }

    public List<ModelClass> readTable5Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME5+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }
    public List<ModelClass> readTable6Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME6+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }
    public List<ModelClass> readTable7Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME7+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }
    public List<ModelClass> readTable8Data(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        List<ModelClass> arraylist=new ArrayList<ModelClass>();
        Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM "+VariableDeclare.TABLE_NAME8+"",null);
        if(cursor.getCount()==0){}
        while (cursor.moveToNext()){

            arraylist.add(0,new ModelClass(cursor.getInt(cursor.getColumnIndex(VariableDeclare._ID)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEMESTER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.TECHNOLOGY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.ROLL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.REGESTATION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.CLASSGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.PHONENUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.BLOODGROUP)),cursor.getString(cursor.getColumnIndex(VariableDeclare.RELIGION)),cursor.getString(cursor.getColumnIndex(VariableDeclare.NATIONALITY)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EMAIL)),cursor.getString(cursor.getColumnIndex(VariableDeclare.GENDER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FATHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNAME)),cursor.getString(cursor.getColumnIndex(VariableDeclare.MOTHERNUMBER)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIRSTSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SECONDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.THIRDSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FOURTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.FIFTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SIXTHSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.SEVENSEM)),cursor.getString(cursor.getColumnIndex(VariableDeclare.EIGHTSEM))));

        }

        return  arraylist;

    }
     public int deleteData(int Id){

        SQLiteDatabase db=getWritableDatabase( );
       return db.delete(VariableDeclare.TABLE_NAME1,VariableDeclare._ID+" =? ",new String[]{String.valueOf(Id)});
     }
}
