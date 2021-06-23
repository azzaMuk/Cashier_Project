package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.sql.Time;
import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity = salesPerson.class,parentColumns = "salesPersonID",childColumns = "salesPersonID"))
public class till {
    @PrimaryKey(autoGenerate = true)
    private int till_id;
    private int salesPersonID;
    private int sp_localPin;
    private float amount;
    //private Date date;
    //private Time startHour;
    //private Time endHour;
    private boolean tillStatus;

    public till(int till_id, int salesPersonID, int sp_localPin, float amount,  boolean tillStatus) {
        this.till_id = till_id;
        this.salesPersonID = salesPersonID;
        this.sp_localPin = sp_localPin;
        this.amount = amount;

        this.tillStatus = tillStatus;
    }

    public int getTill_id() {
        return till_id;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public int getSp_localPin() {
        return sp_localPin;
    }

    public float getAmount() {
        return amount;
    }


    public boolean isTillStatus() {
        return tillStatus;
    }

    public void setTill_id(int till_id) {
        this.till_id = till_id;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public void setSp_localPin(int sp_localPin) {
        this.sp_localPin = sp_localPin;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }



    public void setTillStatus(boolean tillStatus) {
        this.tillStatus = tillStatus;
    }
}
