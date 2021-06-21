package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class category {
    @PrimaryKey(autoGenerate = true)
    private int categoryID;
    private String categoryName;
    private byte[] categoryImage;

    public category(int categoryID, String categoryName, byte[] categoryImage) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categoryImage = categoryImage;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public byte[] getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryImage(byte[] categoryImage) {
        this.categoryImage = categoryImage;
    }
}
