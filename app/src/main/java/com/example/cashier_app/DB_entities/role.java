package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class role {
    @PrimaryKey(autoGenerate = true)
    private int roleId;
    private String roleName;
    private boolean printBill;
    private boolean changeItemPrice;
    private boolean discountFeature;
    private boolean returnItem;
    private String deleteBill;

    public role(int roleId, String roleName, boolean printBill, boolean changeItemPrice, boolean discountFeature, boolean returnItem, String deleteBill) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.printBill = printBill;
        this.changeItemPrice = changeItemPrice;
        this.discountFeature = discountFeature;
        this.returnItem = returnItem;
        this.deleteBill = deleteBill;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public boolean isPrintBill() {
        return printBill;
    }

    public boolean isChangeItemPrice() {
        return changeItemPrice;
    }

    public boolean isDiscountFeature() {
        return discountFeature;
    }

    public boolean isReturnItem() {
        return returnItem;
    }

    public String getDeleteBill() {
        return deleteBill;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setPrintBill(boolean printBill) {
        this.printBill = printBill;
    }

    public void setChangeItemPrice(boolean changeItemPrice) {
        this.changeItemPrice = changeItemPrice;
    }

    public void setDiscountFeature(boolean discountFeature) {
        this.discountFeature = discountFeature;
    }

    public void setReturnItem(boolean returnItem) {
        this.returnItem = returnItem;
    }

    public void setDeleteBill(String deleteBill) {
        this.deleteBill = deleteBill;
    }
}
