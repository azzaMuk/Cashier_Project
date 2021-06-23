package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class offers {
    @PrimaryKey(autoGenerate = true)
    private int promoID;
    private String promoCode;
    private float amountWithPer;
    private float amountWithSAR;
    private int minQuantity;
    //private Date startDate;
    //private Date endDate;


    public offers(int promoID, String promoCode, float amountWithPer, float amountWithSAR, int minQuantity) {
        this.promoID = promoID;
        this.promoCode = promoCode;
        this.amountWithPer = amountWithPer;
        this.amountWithSAR = amountWithSAR;
        this.minQuantity = minQuantity;
    }

    public int getPromoID() {
        return promoID;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public float getAmountWithPer() {
        return amountWithPer;
    }

    public float getAmountWithSAR() {
        return amountWithSAR;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setPromoID(int promoID) {
        this.promoID = promoID;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public void setAmountWithPer(float amountWithPer) {
        this.amountWithPer = amountWithPer;
    }

    public void setAmountWithSAR(float amountWithSAR) {
        this.amountWithSAR = amountWithSAR;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }


}
