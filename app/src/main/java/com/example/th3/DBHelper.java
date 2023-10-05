package com.example.th3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    List<String> create_sql_list = new ArrayList<String>();
    String sql;
    private static final String DATABASE_NAME = "Thesis.sqlite";
    private static final int DATABASE_VERSION = 2;
    public static final String TBL_ThanhVienNhom = "tblThanhVienNhom";
    public static final String TBL_ThanhVienNhom_MemID= "MemID";
    public static final String TBL_ThanhVienNhom_MemName = "MemName";
    public static final String TBL_ThanhVienNhom_GroupID = "GroupID";
    public static final String TBL_ThanhVienNhom_Role = "Role";
    public static final String TBL_Thesis = "tblThesis";
    public static final String TBL_tblThesis_GroupID = "GroupID";
    public static final String TBL_tblThesis_ThesisName = "ThesisName";


    public DBHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }
    private void create_table_ThanhVienNhom() {
        sql = "CREATE TABLE tblThanhVienNhom (MemID INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , MemName VARCHAR NOT NULL  UNIQUE , GroupID INTEGER, Role VARCHAR)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(1,\"Hoàng Phan Thủy Dương\",1)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(2,\"Nguyễn Quang Trường\",1)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(3,\"Phạm Thị Mỹ Linh\",1)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(4,\"Biện Phúc Hiếu\",2)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(5,\"Trần Văn Đức\",2)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(6,\"Lê Anh Đạt\",2)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(7,\"Mai Xuân Tiền\",3)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(8,\"Trần Phạm Minh Quang\",3)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(9,\"Nguyễn Lê Hùng Thuận\",3)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(10,\"Nguyễn Đỗ Hoàng Khang\",4)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(11,\"Lâm Văn Dương\",4)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(12,\"Nguyễn Đỗ Hoàng Khang\",4)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(13,\"Đặng Trọng Đại\",6)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(14,\"Nguyễn Thị Yến Nhi\",7)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(15,\"Ngô Hà Tuyên\",8)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(16,\"Lê Thanh Phương\",9)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(17,\"Lương Tuấn Kiệt\",10)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(18,\"Võ Văn Tuấn\",11)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(19,\"Nguyễn Hoàng Danh\",12)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(20,\"Phạm Nguyễn Hữu Toàn\",14)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(21,\"Nguyễn Thành Danh\",13)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThanhVienNhom (MemID,MemName,GroupID) VALUES(22,\"Lê Minh Quốc Đạt\",14)";
        create_sql_list.add(sql);
    }
    private void create_table_Thesis() {
        sql = "CREATE TABLE tblThesis (GroupID INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , ThesisName VARCHAR NOT NULL  UNIQUE)";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(1,\"Xây dựng ứng dụng đặt món ăn DishDiscover\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(2,\"Xây dựng ứng dụng hỗ trợ báo hỏng thiết bị\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(3,\"Xây dựng Ứng dụng quản lý chi tiêu\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(4,\"xây dựng ứng dụng quản lý hàng hóa\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(5,\"Xây dựng ứng dụng quản lý công thức nấu ăn\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(6,\"Xây dựng ứng dụng đọc sách\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(7,\"Xây dựng ứng dụng quản lý tài chính\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(8,\"Xây dựng ứng dụng quản lý nhà hàng\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(9,\"Xây dựng ứng dụng game Pacman\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(10,\"Xây dựng ứng dụng quản lý lớp học\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(11,\"Xây dựng ứng dụng bán đồ thể thao\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(12,\"Xây dựng ứng dụng học tiếng anh\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(13,\"Xây dựng ứng dụng quản lý cửa hàng thiết bị điện tử\")";
        create_sql_list.add(sql);
        sql = "INSERT INTO tblThesis VALUES(14,\"Xây dựng ứng dụng mạng xã hội \")";
        create_sql_list.add(sql);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        create_table_ThanhVienNhom();
        create_table_Thesis();
        for(int i = 0;i < create_sql_list.size();i++)
            db.execSQL(create_sql_list.get(i));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TBL_ThanhVienNhom);
        db.execSQL("drop table if exists " + TBL_Thesis);
        onCreate(db);
    }

}
