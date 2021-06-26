package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.centerOfSale;

import java.util.List;

@Dao
public interface centerOfSaleDAO {
    @Insert
    void insert(centerOfSale cof);

    @Update
    void update(centerOfSale cof);

    @Delete
    void delete(centerOfSale cof);

    @Query("DELETE From centerOfSale")
    void deleteAll();

    @Query("SELECT * From centerOfSale")
    LiveData<List<centerOfSale>> getAllCOF();
}
