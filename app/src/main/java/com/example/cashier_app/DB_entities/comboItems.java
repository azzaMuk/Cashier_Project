package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class comboItems {
    @PrimaryKey
    private String comboItemID;
    private String comboItemName;
    private String itemsId;
    private float fullPrice;
    private String barcode;
    private String description;
    private int branchID;
    private int categoryID;
    private boolean discount;
    private float discountAmount;
    private byte[] image;

    public comboItems(String comboItemID, String comboItemName, String itemsId, float fullPrice, String barcode, String description, int branchID, int categoryID, boolean discount, float discountAmount, byte[] image) {
        this.comboItemID = comboItemID;
        this.comboItemName = comboItemName;
        this.itemsId = itemsId;
        this.fullPrice = fullPrice;
        this.barcode = barcode;
        this.description = description;
        this.branchID = branchID;
        this.categoryID = categoryID;
        this.discount = discount;
        this.discountAmount = discountAmount;
        this.image = image;
    }

    public String getComboItemID() {
        return comboItemID;
    }

    public String getComboItemName() {
        return comboItemName;
    }

    public String getItemsId() {
        return itemsId;
    }

    public float getFullPrice() {
        return fullPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getDescription() {
        return description;
    }

    public int getBranchID() {
        return branchID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public boolean isDiscount() {
        return discount;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public byte[] getImage() {
        return image;
    }

    public void setComboItemID(String comboItemID) {
        this.comboItemID = comboItemID;
    }

    public void setComboItemName(String comboItemName) {
        this.comboItemName = comboItemName;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId;
    }

    public void setFullPrice(float fullPrice) {
        this.fullPrice = fullPrice;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
