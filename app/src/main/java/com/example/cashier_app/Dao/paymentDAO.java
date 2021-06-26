package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.paymentDB;

import java.util.List;

@Dao
public interface paymentDAO {
    @Insert
    void insert(paymentDB pay);

    @Update
    void update(paymentDB pay);

    @Delete
    void delete(paymentDB pay);

    @Query("DELETE From payment")
    void deleteAll();

    @Query("SELECT * From payment")
    LiveData<List<paymentDB>> getAllPayment();
}
