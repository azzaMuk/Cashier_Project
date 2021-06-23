package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class status {
    @PrimaryKey
    private int statusID;
    private String statusName;

    public status(int statusID, String statusName) {
        this.statusID = statusID;
        this.statusName = statusName;
    }

    public int getStatusID() {
        return statusID;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
