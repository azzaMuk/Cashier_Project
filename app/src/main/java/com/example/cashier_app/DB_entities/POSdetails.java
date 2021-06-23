package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"serialNumber","itemID","bill_ID"},
        foreignKeys = {@ForeignKey(entity = POSdtoption.class,parentColumns = "serialNumOption",childColumns = "serialNumOption"),@ForeignKey(entity = offers.class,parentColumns = "promoID",childColumns = "offerID")})
public class POSdetails {
    private int serialNumber;
    private int itemID;
    private int bill_ID;
    private String itemBarcode;
    private float fullPrice;
    private int itemQuantity;
    private int serialNumOption;
    private float discount;
    private int offerID;
    private boolean returnItem;

    public POSdetails(int serialNumber, int itemID, int bill_ID, String itemBarcode, float fullPrice, int itemQuantity, int serialNumOption, float discount, int offerID, boolean returnItem) {
        this.serialNumber = serialNumber;
        this.itemID = itemID;
        this.bill_ID = bill_ID;
        this.itemBarcode = itemBarcode;
        this.fullPrice = fullPrice;
        this.itemQuantity = itemQuantity;
        this.serialNumOption = serialNumOption;
        this.discount = discount;
        this.offerID = offerID;
        this.returnItem = returnItem;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getItemID() {
        return itemID;
    }

    public int getBill_ID() {
        return bill_ID;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public float getFullPrice() {
        return fullPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public int getSerialNumOption() {
        return serialNumOption;
    }

    public void setSerialNumOption(int serialNumOption) {
        this.serialNumOption = serialNumOption;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setBill_ID(int bill_ID) {
        this.bill_ID = bill_ID;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public void setFullPrice(float fullPrice) {
        this.fullPrice = fullPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setOfferID(int offerID) {
        this.offerID = offerID;
    }

    public void setReturnItem(boolean returnItem) {
        this.returnItem = returnItem;
    }

    public float getDiscount() {
        return discount;
    }

    public int getOfferID() {
        return offerID;
    }

    public boolean isReturnItem() {
        return returnItem;
    }
}
