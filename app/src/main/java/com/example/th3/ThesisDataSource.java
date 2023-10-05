package com.example.th3;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ThesisDataSource {
    DBHelper dbHelper;
    SQLiteDatabase db;
    Context context;
    public ThesisDataSource(Context context) {
        this.context = context;
        this.dbHelper = new DBHelper(context);
    }
    public void close() {
        dbHelper.close();
    }
    public ThesisDataSource open() throws SQLException {
        db = dbHelper.getWritableDatabase();
        db.execSQL("PRAGMA foreign_keys=ON;");
        return this;
    }

    public ArrayList<Thesis> danhsachChuDe() {
        ArrayList<Thesis> list = new ArrayList<Thesis>();
        String sql = "select * from " + DBHelper.TBL_Thesis;

        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(DBHelper.TBL_Thesis,null,null,null,null,null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Thesis cd  = new Thesis(cursor.getInt(0), cursor.getString(1));
            list.add(cd);
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
    @SuppressLint("Range")
    public Thesis timChuDe(int cd) {
        Thesis temp = new Thesis();
        String sql = "select * from " + DBHelper.TBL_Thesis + " where " + DBHelper.TBL_tblThesis_GroupID + " LIKE \"" + cd + "\"";
        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            temp.setGroupID(cd);
            temp.setThesisName(cursor.getString(cursor.getColumnIndex(DBHelper.TBL_tblThesis_ThesisName)));
            cursor.moveToNext();
        }
        cursor.close();
        return temp;
    }
    public int soluongchude() {
        String sql = "select count(*) as soluong from " + DBHelper.TBL_Thesis;
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        int soluong = 0;
        while (!cursor.isAfterLast()) {
            soluong = cursor.getInt(0);
            cursor.moveToNext();
        }
        cursor.close();
        return soluong;
    }

    public int xoaChuDe(int mcd) {
        String whereClause = DBHelper.TBL_Thesis + "=?";
        String[] whereArgs = new String[]{String.valueOf(mcd)};
        return (db.delete(DBHelper.TBL_Thesis, whereClause, whereArgs));
    }
    public void capnhatChuDe(int maCD, String ten) {
        ContentValues values = new ContentValues();
        values.put(DBHelper.TBL_tblThesis_ThesisName, ten);

        String whereClause = DBHelper.TBL_ThanhVienNhom_GroupID + "=?";
        String[] whereArgs = new String[]{String.valueOf(maCD)};
        db.update(DBHelper.TBL_Thesis, values, whereClause, whereArgs);
    }

}
