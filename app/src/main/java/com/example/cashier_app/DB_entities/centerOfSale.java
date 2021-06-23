package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.sql.Time;

@Entity(foreignKeys = @ForeignKey(entity = branch.class,parentColumns = "branchID",childColumns = "branchID"))
public class centerOfSale {
    @PrimaryKey(autoGenerate = true)
    private int centerOfSaleID;
    private String centerOfSaleName;
    private int branchID;
    private boolean centerOfSaleStatus;
  //  private Time startTime;
    //private Time endTime;


    public centerOfSale(int centerOfSaleID, String centerOfSaleName, int branchID, boolean centerOfSaleStatus) {
        this.centerOfSaleID = centerOfSaleID;
        this.centerOfSaleName = centerOfSaleName;
        this.branchID = branchID;
        this.centerOfSaleStatus = centerOfSaleStatus;
    }

    public int getBranchID() {
        return branchID;
    }

    public int getCenterOfSaleID() {
        return centerOfSaleID;
    }

    public String getCenterOfSaleName() {
        return centerOfSaleName;
    }

    public boolean isCenterOfSaleStatus() {
        return centerOfSaleStatus;
    }


    public void setCenterOfSaleID(int centerOfSaleID) {
        this.centerOfSaleID = centerOfSaleID;
    }

    public void setCenterOfSaleName(String centerOfSaleName) {
        this.centerOfSaleName = centerOfSaleName;
    }

    public void setCenterOfSaleStatus(boolean centerOfSaleStatus) {
        this.centerOfSaleStatus = centerOfSaleStatus;
    }


    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }
}
