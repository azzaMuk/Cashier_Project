package com.example.cashier_app.DB_entities;

import android.text.format.Time;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = centerOfSale.class,parentColumns = "centerOfSaleID",childColumns = "centerOfSaleID"))
public class POS {
    @PrimaryKey(autoGenerate = true)
    private int posID;
    private String posName;
    private boolean activation;
    //private Time openTime;
    //private Time closerTime;
    private int centerOfSaleID;


    public POS(int posID, String posName, boolean activation, int centerOfSaleID) {
        this.posID = posID;
        this.posName = posName;
        this.activation = activation;
        this.centerOfSaleID = centerOfSaleID;
    }

    public int getCenterOfSaleID() {
        return centerOfSaleID;
    }

    public int getPosID() {
        return posID;
    }

    public String getPosName() {
        return posName;
    }

    public boolean isActivation() {
        return activation;
    }


    public void setPosID(int posID) {
        this.posID = posID;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }


    public void setCenterOfSaleID(int centerOfSaleID) {
        this.centerOfSaleID = centerOfSaleID;
    }
}
