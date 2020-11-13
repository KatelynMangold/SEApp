package com.example.seapp;

import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class myDbAdapter{
    myDBHelper myhelper;
    public myDbAdapter(Context context)
    {
        myhelper = new myDBHelper(context);
    }

    public long insertData(String foodname)
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDBHelper.NAME, foodname);
        long id = dbb.insert(myDBHelper.TABLE_NAME, null , contentValues);
        return id;
    }

    public String getData()
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] columns = {myDBHelper.UID, myDBHelper.NAME};
        Cursor cursor =db.query(myDBHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(myDBHelper.UID));
            String name =cursor.getString(cursor.getColumnIndex(myDBHelper.NAME));
            buffer.append(cid+ "   " + name +" \n");
        }
        return buffer.toString();
    }

    public  int delete(String uname)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] whereArgs ={uname};

        int count =db.delete(myDBHelper.TABLE_NAME , myDBHelper.NAME+" = ?",whereArgs);
        return  count;
    }

    public int updateName(String oldName , String newName)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDBHelper.NAME,newName);
        String[] whereArgs= {oldName};
        int count =db.update(myDBHelper.TABLE_NAME,contentValues, myDBHelper.NAME+" = ?",whereArgs );
        return count;
    }
}
