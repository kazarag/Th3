package com.example.th3;

import java.io.Serializable;

public class Thesis implements Serializable {
    int GroupID;
    String ThesisName;

    public Thesis(int groupID, String thesisName) {
        this.GroupID = groupID;
        this.ThesisName = thesisName;
    }
    public Thesis() {}
    public int getGroupID() {
        return GroupID;
    }

    public String getThesisName() {
        return ThesisName;
    }

    public void setGroupID(int groupID) {
        this.GroupID = groupID;
    }

    public void setThesisName(String thesisName) {
        this.ThesisName = thesisName;
    }

    @Override
    public String toString() {
        return new String(this.GroupID + "-" + this.ThesisName);
    }
}
