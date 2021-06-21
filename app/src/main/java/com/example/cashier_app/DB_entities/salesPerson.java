package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = role.class,parentColumns = "roleId",childColumns = "roleId"))
public class salesPerson {
    @PrimaryKey(autoGenerate = true)
    private int salesPersonID;
    private String salesPersonName;
    private String userName;
    private String password;
    private int sp_localPin;
    private int roleId;
    private String phoneNumber;
    private String sp_address;
    private String email;
    private boolean sp_status;

    public salesPerson(int salesPersonID, String salesPersonName, String userName, String password, int sp_localPin, int roleId, String phoneNumber, String sp_address, String email, boolean sp_status) {
        this.salesPersonID = salesPersonID;
        this.salesPersonName = salesPersonName;
        this.userName = userName;
        this.password = password;
        this.sp_localPin = sp_localPin;
        this.roleId = roleId;
        this.phoneNumber = phoneNumber;
        this.sp_address = sp_address;
        this.email = email;
        this.sp_status = sp_status;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getSp_localPin() {
        return sp_localPin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSp_address() {
        return sp_address;
    }

    public String getEmail() {
        return email;
    }

    public boolean isSp_status() {
        return sp_status;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setSp_localPin(int sp_localPin) {
        this.sp_localPin = sp_localPin;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSp_address(String sp_address) {
        this.sp_address = sp_address;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSp_status(boolean sp_status) {
        this.sp_status = sp_status;
    }
}
