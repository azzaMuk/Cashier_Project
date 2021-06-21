package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class orderType {
    @PrimaryKey(autoGenerate = true)
    private int orderTypeID;
    private String orderType;

    public orderType(int orderTypeID, String orderType) {
        this.orderTypeID = orderTypeID;
        this.orderType = orderType;
    }

    public int getOrderTypeID() {
        return orderTypeID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderTypeID(int orderTypeID) {
        this.orderTypeID = orderTypeID;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
