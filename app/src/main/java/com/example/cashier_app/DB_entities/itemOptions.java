package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "options")
public class itemOptions {
    @PrimaryKey(autoGenerate = true)
    private int optionId;
    private String optionName;
    private float optionPrice;
    private boolean activation;
    private boolean required;
    private String optionDescription;

    public itemOptions(int optionId, String optionName, float optionPrice, boolean activation, boolean required, String optionDescription) {
        this.optionId = optionId;
        this.optionName = optionName;
        this.optionPrice = optionPrice;
        this.activation = activation;
        this.required = required;
        this.optionDescription = optionDescription;
    }

    public int getOptionId() {
        return optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public float getOptionPrice() {
        return optionPrice;
    }

    public boolean isActivation() {
        return activation;
    }

    public boolean isRequired() {
        return required;
    }

    public String getOptionDescription() {
        return optionDescription;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public void setOptionPrice(float optionPrice) {
        this.optionPrice = optionPrice;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }
}
