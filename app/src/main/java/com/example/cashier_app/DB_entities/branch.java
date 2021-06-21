package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class branch {
    @PrimaryKey(autoGenerate = true)
    private int branchID;
    private String branchNameAR;
    private String branchNameEN;
    private String branchCityAR;
    private String branchCityEN;
    private String branchAddress;
    private String phoneNumber;
    private String phoneMobile;
    private String branchLocation;
    private String branchWD;
    private String branchWH;

    public branch(int branchID, String branchNameAR, String branchNameEN, String branchCityAR, String branchCityEN, String branchAddress, String phoneNumber, String phoneMobile, String branchLocation, String branchWD, String branchWH) {
        this.branchID = branchID;
        this.branchNameAR = branchNameAR;
        this.branchNameEN = branchNameEN;
        this.branchCityAR = branchCityAR;
        this.branchCityEN = branchCityEN;
        this.branchAddress = branchAddress;
        this.phoneNumber = phoneNumber;
        this.phoneMobile = phoneMobile;
        this.branchLocation = branchLocation;
        this.branchWD = branchWD;
        this.branchWH = branchWH;
    }

    public int getBranchID() {
        return branchID;
    }

    public String getBranchNameAR() {
        return branchNameAR;
    }

    public String getBranchNameEN() {
        return branchNameEN;
    }

    public String getBranchCityAR() {
        return branchCityAR;
    }

    public String getBranchCityEN() {
        return branchCityEN;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public String getBranchWD() {
        return branchWD;
    }

    public String getBranchWH() {
        return branchWH;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public void setBranchNameAR(String branchNameAR) {
        this.branchNameAR = branchNameAR;
    }

    public void setBranchNameEN(String branchNameEN) {
        this.branchNameEN = branchNameEN;
    }

    public void setBranchCityAR(String branchCityAR) {
        this.branchCityAR = branchCityAR;
    }

    public void setBranchCityEN(String branchCityEN) {
        this.branchCityEN = branchCityEN;
    }

    public void setBranchAddress(String branchAdress) {
        this.branchAddress = branchAdress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public void setBranchWD(String branchWD) {
        this.branchWD = branchWD;
    }

    public void setBranchWH(String branchWH) {
        this.branchWH = branchWH;
    }
}
