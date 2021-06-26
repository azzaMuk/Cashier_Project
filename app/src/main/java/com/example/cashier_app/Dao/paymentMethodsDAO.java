package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.paymentMethodsDB;

import java.util.List;

@Dao
public interface paymentMethodsDAO {
    @Insert
    void insert(paymentMethodsDB pay);

    @Update
    void update(paymentMethodsDB pay);

    @Delete
    void delete(paymentMethodsDB pay);

    @Query("DELETE From paymentMethods")
    void deleteAll();

    @Query("SELECT * From paymentMethods")
    LiveData<List<paymentMethodsDB>> getAllPayMethods();
}
