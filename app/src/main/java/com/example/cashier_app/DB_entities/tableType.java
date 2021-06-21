package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class tableType {
    @PrimaryKey
    private int serNumber;
    private String tableType;

    public tableType(int serNumber, String tableType) {
        this.serNumber = serNumber;
        this.tableType = tableType;
    }

    public void setSerNumber(int serNumber) {
        this.serNumber = serNumber;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public int getSerNumber() {
        return serNumber;
    }

    public String getTableType() {
        return tableType;
    }
}
