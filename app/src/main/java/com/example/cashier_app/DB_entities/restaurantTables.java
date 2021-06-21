package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.sql.Time;
import java.util.Date;

@Entity (foreignKeys = @ForeignKey(entity = tableType.class,parentColumns = "serNumber",childColumns = "tableTypeId"))
public class restaurantTables {
    @PrimaryKey(autoGenerate = true)
    private int tableNumber;
    private int chairsNumber;
    private boolean availability;
    private int tableTypeId;
    private Date reservationDate;
    private Time reservationTime;
    private String tableDescription;

    public restaurantTables(int tableNumber, int chairsNumber, boolean availability, int tableTypeId, Date reservationDate, Time reservationTime, String tableDescription) {
        this.tableNumber = tableNumber;
        this.chairsNumber = chairsNumber;
        this.availability = availability;
        this.tableTypeId = tableTypeId;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.tableDescription = tableDescription;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getChairsNumber() {
        return chairsNumber;
    }

    public boolean isAvailability() {
        return availability;
    }

    public int getTableTypeId() {
        return tableTypeId;
    }

    public void setTableTypeId(int tableTypeId) {
        this.tableTypeId = tableTypeId;
    }

    public String getTableDescription() {
        return tableDescription;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setChairsNumber(int chairsNumber) {
        this.chairsNumber = chairsNumber;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setTableDescription(String tableDescription) {
        this.tableDescription = tableDescription;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Time getReservationTime() {
        return reservationTime;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationTime(Time reservationTime) {
        this.reservationTime = reservationTime;
    }
}
