package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "paymentMethods",foreignKeys = @ForeignKey(entity = paymentDB.class,parentColumns = "paymentID",childColumns = "paymentID"))
public class paymentMethodsDB {
    @PrimaryKey(autoGenerate = true)
    private int serialPay;
    private int paymentID;
    private float amount;

    public paymentMethodsDB(int serialPay, int paymentID, float amount) {
        this.serialPay = serialPay;
        this.paymentID = paymentID;
        this.amount = amount;
    }

    public int getSerialPay() {
        return serialPay;
    }

    public float getAmount() {
        return amount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setSerialPay(int serialPay) {
        this.serialPay = serialPay;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }
}
