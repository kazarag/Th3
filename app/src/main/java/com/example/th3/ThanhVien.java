package com.example.th3;

import java.io.Serializable;

public class ThanhVien implements Serializable {
    int MemID;
    String MemName;

    public ThanhVien(int memID, String memName) {
        this.MemID = memID;
        this.MemName = memName;
    }
    public ThanhVien() {}
    public int getMemID() {
        return MemID;
    }

    public String getmemName() {
        return MemName;
    }

    public void setMemID(int memID) {
        this.MemID = memID;
    }

    public void setMemName(String memName) {
        this.MemName = memName;
    }

    @Override
    public String toString() {
        return new String(this.MemID + "-" + this.MemName);
    }
}
