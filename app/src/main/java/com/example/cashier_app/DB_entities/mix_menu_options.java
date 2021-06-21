package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = menu.class,parentColumns = "itemID",childColumns = "itemID"),
@ForeignKey(entity = itemOptions.class,parentColumns = "optionId",childColumns = "optionID")})
public class mix_menu_options {
    @PrimaryKey(autoGenerate = true)
    private int serialNo;
    private int itemID;
    private int optionID;

    public mix_menu_options(int serialNo, int itemID, int optionID) {
        this.serialNo = serialNo;
        this.itemID = itemID;
        this.optionID = optionID;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public int getItemID() {
        return itemID;
    }

    public int getOptionID() {
        return optionID;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setOptionID(int optionID) {
        this.optionID = optionID;
    }
}
