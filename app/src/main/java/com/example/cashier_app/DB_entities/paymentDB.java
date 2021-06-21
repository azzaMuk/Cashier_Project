package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "payment")
public class paymentDB {
    @PrimaryKey(autoGenerate = true)
    private int paymentID;
    private String paymentName;

    public paymentDB(int paymentID, String paymentName) {
        this.paymentID = paymentID;
        this.paymentName = paymentName;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }
}
