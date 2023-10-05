package com.example.th3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ThanhVienNhomDataSource {
    DBHelper dbHelper;
    SQLiteDatabase db;
    Context context;
    public ThanhVienNhomDataSource(Context context) {
        this.context = context;
        this.dbHelper = new DBHelper(context);
    }
    public void close() {
        dbHelper.close();
    }
    public ArrayList<ThanhVien> danhsachThanhVien() {
        ArrayList<ThanhVien> list = new ArrayList<ThanhVien>();
        String sql = "select * from " + DBHelper.TBL_ThanhVienNhom;

        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(DBHelper.TBL_ThanhVienNhom,null,null,null,null,null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            ThanhVien tv  = new ThanhVien(cursor.getInt(0), cursor.getString(1));
            list.add(tv);
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
    public ThanhVien timThanhVien(String tentv) {
        ThanhVien temp = new ThanhVien();
        String sql = "select * from " + DBHelper.TBL_ThanhVienNhom + " where " + DBHelper.TBL_ThanhVienNhom_MemName + " LIKE \"" + tentv + "\"";
        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            temp.setMemID(cursor.getInt(0));
            temp.setMemName(tentv);
            cursor.moveToNext();
        }
        cursor.close();
        return temp;
    }
    public int xoaThanhVien(int mnv) {
        String whereClause = DBHelper.TBL_ThanhVienNhom + "=?";
        String[] whereArgs = new String[]{String.valueOf(mnv)};
        return (db.delete(DBHelper.TBL_ThanhVienNhom, whereClause, whereArgs));
    }


}
