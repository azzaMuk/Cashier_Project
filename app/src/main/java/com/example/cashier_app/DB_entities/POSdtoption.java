package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = itemOptions.class,parentColumns = "optionId",childColumns = "optionID"),
        @ForeignKey(entity = menu.class,parentColumns = "itemID",childColumns = "itemID")})
public class POSdtoption {
    @PrimaryKey(autoGenerate = true)
    private int serialNumOption;
    private int optionID;
    private int itemID;

    public POSdtoption(int serialNumOption, int optionID, int itemID) {
        this.serialNumOption = serialNumOption;
        this.optionID = optionID;
        this.itemID = itemID;
    }

    public int getOptionID() {
        return optionID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setOptionID(int optionID) {
        this.optionID = optionID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getSerialNumOption() {
        return serialNumOption;
    }

    public void setSerialNumOption(int serialNumOption) {
        this.serialNumOption = serialNumOption;
    }
}
