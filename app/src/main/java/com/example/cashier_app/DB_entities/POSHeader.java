package com.example.cashier_app.DB_entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(primaryKeys = {"bill_ID","POSID","branchID"},
        foreignKeys = {@ForeignKey(entity = centerOfSale.class,parentColumns = "centerOfSaleID",childColumns = "centerOfSaleID"),
        @ForeignKey(entity = paymentMethodsDB.class,parentColumns = "serialPay",childColumns = "serialPay"),
        @ForeignKey(entity = status.class,parentColumns = "statusID",childColumns = "orderStatus"),
        @ForeignKey(entity = orderType.class,parentColumns = "orderTypeID",childColumns = "orderTypeID")})
public class POSHeader {
    private int bill_ID;
    private int POSID;
    private int branchID;
    private int centerOfSaleID;
    private float discountAmount;
    private float discountPercentage;
    private float totalPrice;
    private int orderTypeID;
    private int orderStatus;
    private int serialPay;
    private float vat;
    //private Date date;
    //private Time time;
    private float amountOfReturn;
    private int entities;
    private int ref;
    private boolean inforreturn;
    private int salesPersonID;


    public POSHeader(int bill_ID, int POSID, int branchID, int centerOfSaleID, float discountAmount, float discountPercentage, float totalPrice, int orderTypeID, int orderStatus, int serialPay, float vat, float amountOfReturn, int entities, int ref, boolean inforreturn, int salesPersonID) {
        this.bill_ID = bill_ID;
        this.POSID = POSID;
        this.branchID = branchID;
        this.centerOfSaleID = centerOfSaleID;
        this.discountAmount = discountAmount;
        this.discountPercentage = discountPercentage;
        this.totalPrice = totalPrice;
        this.orderTypeID = orderTypeID;
        this.orderStatus = orderStatus;
        this.serialPay = serialPay;
        this.vat = vat;
        this.amountOfReturn = amountOfReturn;
        this.entities = entities;
        this.ref = ref;
        this.inforreturn = inforreturn;
        this.salesPersonID = salesPersonID;
    }

    public int getBill_ID() {
        return bill_ID;
    }

    public int getPOSID() {
        return POSID;
    }

    public int getBranchID() {
        return branchID;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public float getTotalPrice() {
        return totalPrice;
    }


    public int getOrderStatus() {
        return orderStatus;
    }

    public float getVat() {
        return vat;
    }


    public int getCenterOfSaleID() {
        return centerOfSaleID;
    }

    public int getSerialPay() {
        return serialPay;
    }

    public float getAmountOfReturn() {
        return amountOfReturn;
    }

    public void setBill_ID(int bill_ID) {
        this.bill_ID = bill_ID;
    }

    public void setPOSID(int POSID) {
        this.POSID = POSID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderTypeID() {
        return orderTypeID;
    }

    public void setOrderTypeID(int orderTypeID) {
        this.orderTypeID = orderTypeID;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }



    public void setAmountOfReturn(float amountOfReturn) {
        this.amountOfReturn = amountOfReturn;
    }

    public void setCenterOfSaleID(int centerOfSaleID) {
        this.centerOfSaleID = centerOfSaleID;
    }

    public void setSerialPay(int serialPay) {
        this.serialPay = serialPay;
    }

    public int getEntities() {
        return entities;
    }

    public int getRef() {
        return ref;
    }

    public boolean isInforreturn() {
        return inforreturn;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public void setEntities(int entities) {
        this.entities = entities;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public void setInforreturn(boolean inforreturn) {
        this.inforreturn = inforreturn;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }
}
