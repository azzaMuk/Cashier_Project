package com.example.cashier_app.DB_entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = branch.class,parentColumns = "branchID",childColumns = "branchID"),
        @ForeignKey(entity = category.class,parentColumns = "categoryID",childColumns = "categoryID")})

public class menu {
    @PrimaryKey @NonNull
    private String itemID;
    private String itemName;
    private String itemBarcode;
    private float itemPrice;
    private String itemDescription;
    private int itemQuantity;
    private int branchID;
    private int categoryID;
    private boolean discount;
    private float discountAmount;
    private byte[] itemImage;

    public menu(String itemID, String itemName, String itemBarcode, float itemPrice, String itemDescription, int itemQuantity, int branchID, int categoryID, boolean discount, float discountAmount, byte[] itemImage) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemBarcode = itemBarcode;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.branchID = branchID;
        this.categoryID = categoryID;
        this.discount = discount;
        this.discountAmount = discountAmount;
        this.itemImage = itemImage;
    }

    public String getItemID() {
        return itemID;
    }

    public int getBranchID() {
        return branchID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public byte[] getItemImage() {
        return itemImage;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemImage(byte[] itemImage) {
        this.itemImage = itemImage;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public boolean isDiscount() {
        return discount;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }
}
